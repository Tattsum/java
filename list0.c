/* リスト(第0版) */
#include <stdio.h>
#include <stdlib.h>

struct cell {
    int weight;
    char name[20];
    struct cell *next;
};
typedef struct cell Cell;

Cell *cell_create()
{
    Cell *c;
    c = malloc(sizeof(Cell));
    if (c == NULL) {
	puts("失敗\n"); exit(1); /* エラー処理 */
    }
    return c;
}

int main()
{
    int i, num;
    Cell *top, *c;

    /* リストの作成 */
    top = cell_create();  /* リストの先頭(ダミーセル) */
    c = top;

    /* 入力した個数分データを入力 */
    printf("num ? "); scanf("%d", &num);
    for (i = 0; i < num; i++) {
	c->next = cell_create();
	c = c->next;
	printf("name? "); scanf("%s", c->name);
	printf("weight? "); scanf("%d", &c->weight);
    }
    c->next = NULL;  /* リストの最後 */

    /* リストの出力 */
    c = top;
    while (c->next != NULL) {
	c = c->next;
	printf("%s %d\n", c->name, c->weight);
    }
    return 0;
}
