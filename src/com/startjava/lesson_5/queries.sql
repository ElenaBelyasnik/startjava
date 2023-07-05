\C 'выведите всю таблицу'
SELECT *
FROM Jaegers;

\C 'отобразите только не уничтоженных роботов'
SELECT *
FROM Jaegers
WHERE status <> 'Destroyed';

\C 'отобразите роботов нескольких серий: Mark-1 и Mark-4'
SELECT *
FROM Jaegers
WHERE mark IN ('Mark-1', 'Mark-4');

\C 'отобразите всех роботов, кроме Mark-1 и Mark-4'
SELECT *
FROM Jaegers
WHERE mark NOT IN ('Mark-1', 'Mark-4');

\C 'отсортируйте таблицу по убыванию по столбцу mark'
SELECT *
FROM Jaegers
ORDER BY mark DESC;

\C 'отобразите информацию о самом старом роботе'
SELECT *
FROM Jaegers
WHERE launch = (SELECT MIN(launch) AS oldest
                FROM jaegers);

\C 'отобразите роботов, которые уничтожили больше всех kaiju'
SELECT *
FROM Jaegers
WHERE kaijukill = (SELECT MAX(kaijukill)
                   FROM jaegers);

\C 'отобразите средний вес роботов'
SELECT AVG(weight) AS avg_weight
FROM Jaegers;

\C 'увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
UPDATE Jaegers
SET weight = weight + 1
WHERE status <> 'Destroyed';

\C 'удалите уничтоженных роботов'
DELETE
FROM Jaegers
WHERE status = 'Destroyed';


