-- 코드를 입력하세요
SELECT animal_id,name
from animal_ins
where lower(name) like '%el%' and animal_type in 'Dog'
order by name;