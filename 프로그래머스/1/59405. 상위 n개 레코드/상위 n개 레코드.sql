-- 코드를 입력하세요


--SELECT NAME FROM ANIMAL_INS WHERE DATETIME = (SELECT MIN(DATETIME) FROM ANIMAL_INS);

-- SELF조인문 만들기
SELECT a.NAME 
FROM ANIMAL_INS a 
JOIN (
    SELECT MIN(DATETIME) AS MIN_DATETIME 
    FROM ANIMAL_INS
) b ON a.DATETIME = b.MIN_DATETIME;

