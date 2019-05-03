# MajorCityJavaEE
長らく放置していましたが, 本格的に OpenJDK 12 で諸々作り直しました.  
と言っても主要なコードに変更はなくて, 主に Maven で build する際の plugin を最新版にしたとか, 依存するライブラリを最新版にしたとかだけです.

## 動作環境
- Windows 10
- OpenJDK 12
- PostgreSQL 11.2 (データベース作成済み, データ投入済み)
- WildFly 16.0.0 Final (pgJDBC デプロイ済み, データソース定義済み)
- Ruby 2.6.1 + compass (SCSS ファイルのコンパイルに使用)
