/* 整数リストに対する外部インタフェース */

typedef struct list List;

/* 空のリストを作る */
List *list_create();

/* リストlsの長さを返す */
int list_len(List *ls);

/* リストlsのn番目の次に整数値valを挿入する */
/* リストは先頭の要素から1番目とする(他の関数も同様) */
/* したがって，先頭に挿入するには0番目の後に挿入する(n=0 とする) */
void list_insert(List *ls, int n, int val);

/* リストlsのn番目を削除する */
void list_delete(List *ls, int n);

/* リストlsのn番目の整数値を参照して返す */
int list_access(List *ls, int n);
