/***** stack_array.c *****/
/* 配列を用いたスタックの実現 */

#include <stdio.h>
#include <stdlib.h>

#include "stack.h"

/* データ構造の定義 */
#define SMAX 128
struct stack {
    int box[SMAX]; /* データを格納 */
    int top;   /* データの先頭の添え字 */
};

Stack *createStack()
{
    Stack *s = malloc(sizeof(Stack));
    if (s == NULL) {
        fprintf(stderr, "Can't create stack\n");
        exit(1);
    }
    s->top = -1;  /* 空のときの先頭は -1 */
    return s;
}

/* 整数値valをスタックsにpush */
void push(Stack *s, int val)
{
    s->top++;
    s->box[s->top] = val;
}

/* スタックsから整数値をpop */
int pop(Stack *s)
{
    int val = s->box[s->top];
    s->top--;
    return val;
}

/* スタックsが空か調べる */
int empty(Stack *s)
{
    return (s->top == -1);
}
