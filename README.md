# Project Playframework and AngularJS

* Play version: 2.3.8
* Sbt version: 2.11.6
* Ebean: 1.0.0 
* Angular version: 1.4.9
    1. ui-route
    2. ui-materialize
* Materialize ui: 0.97.2

# Setup

* Download [activator-generator-playframework](https://github.com/giatuyentiensinh/activator-generator-playframework)
* Giải nén trong thư mục `%HOME%/.activator/{{SBT version}}/templates/{{ID hash template}}/`
   1. `Chú ý` Để ghi đè template này thay bằng `play-java` thì ta đọc file `activator.properties` trong {{ID hash teamplate}}, nếu cái có tên là `play-java` thì ghi đè các file, thư mục sau.
      1. app/
      2. conf/
      3. public/
      4. project/plugin.sbt
      5. build.sbt
   2. Sau xóa thư mục ẩn `.git` nếu có

![Demo Image](/Demo.png)

# Auth: Tuyen-ng