/*
[df:title]
追加できる最小の職員IDを取得する

[df:description]
追加できる最小の職員IDを取得する
*/
-- #df:entity#
-- !df:pmb!
-- !!AutoDetect!!

select 
IFNULL(CONCAT('S',LPAD(MAX(SUBSTR(STAFF_USER_ID,2)) + 1, 5,'0')), 'S00001') AS NEW_STAFF_USER_ID 
from STAFF_USER;