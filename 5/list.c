/* 整数のリストの実現 */
#include <stdio.h>
#include <stdlib.h>
#include "list.h"

struct cell {
    int val;
    struct cell *next;
};
typedef struct cell Cell;

struct list {
    Cell *top;
};

/* セルを作る */
Cell *cell_create()
{
    Cell *c;
    c = malloc(sizeof(Cell));
    if (c == NULL) {
	/* エラー処理 */
	fprintf(stderr, "Can't create cell\n");
	exit(1);
    }
    return c;
}

/* 空のリストを作る */
List *list_create()
{
    List *ls;
    ls = malloc(sizeof(List));
    if (ls == NULL) {
	/* エラー処理 */
	fprintf(stderr, "Can't create list\n");
	exit(1);
    }
    ls->top = cell_create(); /* ダミーセル */
    ls->top->next = NULL;
    return ls;
}

/* リストlsの長さを返す */
int list_len(List *ls)
{
    Cell *p = ls->top;
    int len = 0;
    while (p->next != NULL) {
	len++;
	p = p->next;
    }
    return len;
}

/* リストlsのn番目の次に整数値valを挿入する */
/* リストは先頭の要素から1番目とする(他の関数も同様) */
/* したがって，先頭に挿入するには0番目の後に挿入する(n=0 とする) */
void list_insert(List *ls, int n, int val)
{
    Cell *p = ls->top;
    Cell *c;
    int i;
    for (i = 0; i < n; i++) { /* pが n番目を指す */
	p = p->next;
    }
    c = cell_create();
    c->val = val;
    c->next = p->next;
    p->next = c;
}

/* リストlsのn番目を削除する */
void list_delete(List *ls, int n)
{
    Cell *p = ls->top;
    Cell *del;
    int i;
    for (i = 0; i < n - 1; i++) { /* 1個手前で止める */
	p = p->next;
    }
    del = p->next;
    p->next = del->next;
    free(del);
}

/* リストlsのn番目の整数値を参照して返す */
int list_access(List *ls, int n)
{
    Cell *p = ls->top;
    int i;
    for (i = 0; i < n; i++) { /* n番目 */
	p = p->next;
    }
    return p->val;
}
