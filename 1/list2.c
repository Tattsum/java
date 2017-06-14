#include <stdio.h>
#include <stdlib.h>
#include <string.h>

/* 単語の文字数 */
#define MAXWORD 32

struct cell {
    char word[MAXWORD];    /* 単語 */
    int  count;       /* 出現回数 */
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
    ls->top = cell_create();
    ls->top->next = NULL;
    return ls;
}

/* リストlsのn番目のセルの次にセルcを挿入する */
/* リストは先頭の要素から1番目とする */
/* したがって，先頭に挿入するには0番目の後に挿入する(n=0 とする) */
void list_insert(List *ls, Cell *c, int n)
{

    /* 適切に記述しなさい */
    Cell *p = ls->top;
    int i;

    for (i = 0; i < n; i++) { /* pが n番目を指す */
	     p = p->next;
    }

    c->next = p->next;
    p->next = c;

}

/* リストlsを表示する */
void list_print(List *ls)
{

    /* 適切に記述しなさい */
    Cell *p = ls->top->next;
    while (p != NULL) {
	     printf("%s 1\n", p->word);
	     p = p->next;
    }
}

/* リストlsから単語wordを持つセルを見つけて返す．なければNULLを返す */
Cell *list_find(List *ls, char *word)
{
    /* 適切に記述しなさい */
    Cell *p = ls->top->next;
    while (p != NULL) {
	     if (strcmp(p->word, word) == 0) {
	        return p; /* 見つかった */
	       }
	     p = p->next;
    }
    return NULL; /* 見つからなかった */
}

int main(void)
{
    char word[MAXWORD];
    List *ls;
    Cell *c;

    /* リストの作成 */
    ls = list_create();

    /* EOF(Ctrl-Dを入力するまで)，
       単語を一つずつwordに読み込む */
    while (scanf("%s", word) == 1) {

	/* リストから単語wordを探す */
	/* 見つかれば，そのセルの出現回数を1増やす */
	/* 見つからなければ，リストに新しいセルを追加する */

    list_insert(ls,c,MAXWORD);

    }

    /* リストを出力する */
    list_print(ls);



    return 0;
}
