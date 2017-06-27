/***** ckparen.c *****/
/* スタックを用いて括弧の対応を調べる */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "stack.h"

#define BUFFSIZE 128

int main(void)
{
    char line[BUFFSIZE], ch;
    int i;
    Stack *s = createStack();  /** スタックの作成 */

    /* 標準入力から1行読み込む */
    fgets(line, BUFFSIZE, stdin);

    /* 文字列lineを1文字ずつ処理 */
    for (i = 0; i < strlen(line); i++) {
	ch = line[i];
	if (ch == '(') {
	    push(s, ch);
	} else if (ch == ')') {
	    if (empty(s)) {
		printf("missing '('\n");
		exit(1);
	    } else {
		pop(s);
	    }
	}
    }
    if (empty(s)) {
	printf("OK\n");
    } else {
	printf("missing ')'\n");
    }

    return 0;
} 
