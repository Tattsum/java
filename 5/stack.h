/***** stack.h *****/
/* スタックに対する外部インタフェース */

/* データ構造の定義      */
/*  ただし，内部は隠蔽   */
typedef struct stack Stack;

/* データ構造に対する操作の定義 */
/*  関数のプロトタイプ宣言  　  */
Stack *createStack();
void push(Stack *s, int val);
int pop(Stack *s);
int empty(Stack *s);
