/* リスト(第1版), 前提: 先頭はダミーセル, 注意: エラー処理は十分ではない */
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* 名前の文字数 */
#define MAXNAME 20

struct cell {
    int weight;
    char name[MAXNAME];
    struct cell *next;
};
typedef struct cell Cell;

struct list {
    Cell *top;
};
typedef struct list List;

/* セルを作る */
Cell *cell_create()
{
    Cell *c;
    c = malloc(sizeof(Cell));
    if (c == NULL) {
	puts("失敗\n"); exit(1); /* エラー処理 */
    }
    return c;
}

/* 空のリストを作る */
List *list_create()
{
    List *ls;
    ls = malloc(sizeof(List));
    if (ls == NULL) {
	puts("失敗\n"); exit(1); /* エラー処理 */
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

/* リストlsのn番目のセルの次にセルcを挿入する */
/* リストは先頭の要素から1番目とする(他の関数も同様) */
/* したがって，先頭に挿入するには0番目の後に挿入する(n=0 とする) */
void list_insert(List *ls, Cell *c, int n)
{
    Cell *p = ls->top;
    int i;
    for (i = 0; i < n; i++) { /* pが n番目を指す */
	p = p->next;
    }
    c->next = p->next;
    p->next = c;
}

/* リストlsのn番目のセルを削除する */
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

/* リストlsのn番目のセルを返す */
Cell *list_access(List *ls, int n)
{
    Cell *p = ls->top;
    int i;
    for (i = 0; i < n; i++) { /* n番目 */
	p = p->next;
    }
    return p;
}

/* リストlsの各セルを表示する */
void list_print(List *ls)
{
    Cell *p = ls->top->next;
    while (p != NULL) {
	printf("%s %d\n", p->name, p->weight);
	p = p->next;
    }
}

/* リストlsから名前nameを持つセルを見つけて返す．
   なければNULLを返す */
Cell *list_find(List *ls, char *name)
{
    Cell *p = ls->top->next;
    while (p != NULL) {
	if (strcmp(p->name, name) == 0) {
	    return p; /* 見つかった */
	}
	p = p->next;
    }
    return NULL; /* 見つからなかった */
}

int main()
{
    int  num, no, i;
    List *ls;
    Cell *c;
    char name[MAXNAME];

    /* リストの作成 */
    ls = list_create();

    /* 入力した個数分データを入力 */
    printf("num ? "); scanf("%d", &num);
    for (i = 0; i < num; i++) {
	c = cell_create();
	printf("name? "); scanf("%s", c->name);
	printf("weight? "); scanf("%d", &c->weight);
	/* 先頭(0番目の次)に新しいセルを挿入 */
	list_insert(ls, c, 0);
    }

    /* リストの出力 */
    list_print(ls);

    /* 探索 */
    printf("name? "); scanf("%s", name);
    c = list_find(ls, name);
    if (c != NULL) {
	printf("Found: name=%s, wight=%d\n", c->name, c->weight);
    }
    else {
	printf("Not found\n");
    }

    return 0;
}
