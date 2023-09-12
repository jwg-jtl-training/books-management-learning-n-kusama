/*
[df:title]
追加できる最小の一般利用者IDを取得する

[df:description]
追加できる最小の一般利用者IDを取得する
*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

select 
IFNULL(CONCAT('G',LPAD(MAX(SUBSTR(GENERAL_USER_ID,2)) + 1, 5,'0')), 'G00001') AS NEW_GENERAL_USER_ID 
from GENERAL_USER;