-- 코드를 입력하세요
--SELECT COUNT(ANIMAL_TYPE) DOG FROM ANIMAL_INS WHERE ANIMAL_TYPE = 'Dog' AND ANIMAL_TYPE
--SELECT COUNT(ANIMAL_TYPE) CAT FROM ANIMAL_INS WHERE ANIMAL_TYPE = 'Cat';

SELECT ANIMAL_TYPE, COUNT(ANIMAL_TYPE) 
FROM ANIMAL_INS 
WHERE ANIMAL_TYPE IN ('Dog','Cat')
GROUP BY ANIMAL_TYPE 
ORDER BY ANIMAL_TYPE;