# Java-Practice-1
オブジェクトをJavaで再現するための演習

預金・引き出し・利息の機能をシミュレーションする

## 変数
String bankName--銀行口座を管理する銀行名

String ownerName--銀行口座の所有者の名前

int savings--銀行口座の中に現在ある合計貯蓄額

## オブジェクトの挙動

int depositMoney(int depositAmount)

--depositAmount によって貯蓄額を増やし、その金額を int 型で返す。預金前の貯蓄額が $20,000 以下の場合は、$100 の手数料がかかる。

int withdrawMoney(int withdrawAmount)

--withdrawAmount によって貯蓄額を減らし、残りの貯蓄額を整数として返す。最大で貯蓄額の 20% を引き出せる。

double pastime(int days)

--口座に毎日 0.25 ドル振り込まれていくとき、貯蓄金額を double 型で返す。
