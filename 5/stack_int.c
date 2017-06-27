#include <stdio.h>
#include <stdlib.h>

// 構造体定義
typedef struct _Node {

// 前のノードへのポインタ
struct _Node *prev;
// 値
int value;

} Node;

// スタックポインタ(現在のノードを示すポインタ)
Node *sp;

// 空かどうかを返す
int empty() {

return sp == NULL;

}

// プッシュ
void push(int value) {

Node *newNode;
// 領域確保
newNode = (Node *)malloc(sizeof(Node));
// 値を代入
newNode->value = value;

// 先頭以外ならば既に前にある要素と連結
if (sp != NULL)
newNode->prev = sp;

// スタックポインタを新しいノードに移動
sp = newNode;

}

// ポップ
int pop() {

// 空で取り出そうとしたならばエラー(アンダーフロー)
if (empty()) {
printf("エラー: スタックは空です\n");
exit(1);
}

// 返り値をセット
int ret = sp->value;
// 後にメモリ解放するノードをセット
Node *fr = sp;
// スタックポインタを前に移動
sp = sp->prev;
// メモリ解放
free(fr);
// 値を返す
return ret;

}

// 表示
void show() {

// 空ならばすぐに結果表示
if (empty()){
printf("現在、スタックは空です。\n");
return;
}

// この関数用のスタックポインタを用意
Node *tmp = sp;

// 表示
printf("\n 【現在のスタック】 \n\n");
while (tmp != NULL) {
printf(" ┃ %04d ┃\n", tmp->value);
tmp = tmp->prev;
}
printf(" ┗━━━━┛\n");

}

// メイン
int main(void) {

// 動作テスト
push(1);
push(2);
push(pop());
push(3);
pop();
show();
return 0;

}
