\C 'выведите всю таблицу'
select * from Jaegers;

\C 'отобразите только не уничтоженных роботов'
SELECT *
FROM jaegers j
where j.status <> 'Destroyed';

\C 'отобразите роботов нескольких серий: Mark-1 и Mark-4'
select *
from jaegers j
where j.mark in ('Mark-1', 'Mark-4');

\C 'отобразите всех роботов, кроме Mark-1 и Mark-4'
select *
from jaegers j
where j.mark not in ('Mark-1', 'Mark-4');

\C 'отсортируйте таблицу по убыванию по столбцу mark'
select *
from jaegers j
order by j.mark desc;

\C 'отобразите информацию о самом старом роботе'
select *
from jaegers j
where j.launch = (select min(j1.launch) as oldest
                  from jaegers j1);
				  
\C 'отобразите роботов, которые уничтожили больше всех kaiju'
select *
from jaegers j
where j.kaijukill = (select max(j1.kaijukill)
                  from jaegers j1);

\C 'отобразите средний вес роботов'
select avg(j.weight) as avg_weight
from jaegers j;

\C 'увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены'
update jaegers
set weight = weight + 1
where status <> 'Destroyed';
--commit;

\C 'удалите уничтоженных роботов'
delete from jaegers
where status = 'Destroyed';
--commit;				


