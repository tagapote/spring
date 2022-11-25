# spring-boot（学習用）
1.まずは以下のコマンドでクローンする  
git clone https://github.com/tagapote/spring-boot.git -b main

2.クローンしてきたプロジェクトをeclipseにインポートする  
※既存Mavenプロジェクト  
  
3.インポート出来たら、以下を実行して動作確認をする  
spring-bootを右クリック ⇒ 実行 ⇒ Spring Boot アプリケーション  
起動後、画面に「初期メッセージ」という文言が表示されれば問題なし  
http://localhost:8080/hello/world  
  
4.現在のgitの（リモート）リポジトリがこちらに向いているので、自身で作成したものに移動する  
git remote set-url origin {new url}  
※予め「spring-boot」といったリポジトリを作成しておくと良い  
※git remote -v で確認可能  
※参考ページ（リポジトリ名はorigin）  
https://prograshi.com/general/git/git-remote-commands/#toc2



