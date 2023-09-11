-- manage.bat(manage.command)を実行前の準備
CREATE database jlibrary;
USE jlibrary;
CREATE USER 'jlibrary_user'@'localhost' IDENTIFIED BY 'jlibrary_user';
grant ALL ON jlibrary.* TO 'jlibrary_user'@'localhost';