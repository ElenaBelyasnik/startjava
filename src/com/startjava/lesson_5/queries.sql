\C 'выведите всю таблицу'
SELECT *
FROM Jaegers;

\C 'отобразите только не уничтоженных роботов'
SELECT *
FROM jaegers j
WHERE j.status <> 'Destroyed';

\C 'отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
FROM jaegers j
WHERE j.mark IN ('Mark-1', 'Mark-4');

\C 'отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT *
FROM jaegers j
WHERE j.mark NOT IN ('Mark-1', 'Mark-4');

\C 'отсортируйте таблицу по убыванию по столбцу mark'
SELECT *
FROM jaegers j
ORDER BY j.mark DESC;

\C 'отобразите информацию о самом старом роботе'
SELECT *
FROM jaegers j
WHERE j.launch = (SELECT MIN(j1.launch) AS oldest
                  FROM jaegers j1);

\C 'отобразите роботов, которые уничтожили больше всех kaiju'
SELECT *
FROM jaegers j
WHERE j.kaijukill = (SELECT MAX(j1.kaijukill)
                     FROM jaegers j1);

\C 'отобразите средний вес роботов'
SELECT AVG(j.weight) AS avg_weight
FROM jaegers j;

\C 'увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE jaegers
SET weight = weight + 1
WHERE status <> 'Destroyed';
--commit;

\C 'удалите уничтоженных роботов'
DELETE
FROM jaegers
WHERE status = 'Destroyed';
--commit;				


