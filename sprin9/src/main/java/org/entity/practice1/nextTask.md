🔥 І тепер ти готовий до pagination

Серйозно.

Бо ти вже маєш:

createQuery
conditions
parameters
List<User>
🚀 Наступне завдання
Реалізуй:
public List<User> pagination(int page, int size)
💡 Підказка
.setFirstResult(page * size)
.setMaxResults(size)
⚠️ І ОБОВ’ЯЗКОВО
ORDER BY u.id
Бо без ORDER BY pagination — погана практика.

https://chatgpt.com/g/g-p-696bad5c57fc8191aadb864b1e76c5e5/c/69fb3801-b1f4-8327-8353-3ac153032e4c

Pagination — це просто “розбиття результатів на сторінки”.
Ти цим користуєшся кожен день:
Google
YouTube
інтернет-магазини
Telegram історія повідомлень

Ніхто не вантажить:
1 000 000 записів одразу
Беруть:
по 10по 20по 50

🧠 Як це виглядає логічно
Уяви
У БД є users:
12345678910

Якщо:
page = 0size = 3
👉 отримаєш:
1 2 3

Якщо:
page = 1size = 3
👉 отримаєш:
4 5 6

Якщо:
page = 2size = 3
👉 отримаєш:
7 8 9

🔥 Як це працює всередині
Формула:
offset = page * size

Приклад
page 0
0 * 3 = 0
почати з 0-го запису.

page 1
1 * 3 = 3
пропустити перші 3 записи.

🔥 Hibernate методи
setFirstResult()
=
скільки записів пропустити

setMaxResults()
=
скільки записів повернути

🔥 ГОТОВЕ РІШЕННЯ
public List<User> pagination(int page, int size) {    
Session session = factory.getCurrentSession();    
session.beginTransaction();    
List<User> list = session            
.createQuery(                    
"FROM User u ORDER BY u.id",                    
User.class            
)            
.setFirstResult(page * size)            
.setMaxResults(size)            
.getResultList();    
session.getTransaction().commit();    
return list;}

🔥 Main
List<User> users = userService.pagination(0, 3);
users.forEach(System.out::println);

⚠️ Що означає:
pagination(0, 3)
page 0size 3
👉 перша сторінка
👉 3 записи

🔥 А це:
pagination(1, 3)
👉 друга сторінка.

🧠 SQL який Hibernate приблизно генерує
SELECT *FROM usersORDER BY idLIMIT 3 OFFSET 0

Для:
pagination(2, 3)
буде:
LIMIT 3 OFFSET 6

⚠️ ЧОМУ ORDER BY ОБОВ'ЯЗКОВИЙ
Без:
ORDER BY u.id
БД може:
міняти порядок
повертати хаотично
І pagination стане “стрибати”
Наприклад:
page 0 -> 1 2 3page 1 -> 3 4 5
😄
🔥 Тепер головне
Тобі НЕ треба зараз:
“глибоко зрозуміти enterprise pagination”
pageable abstraction
Spring Page
Треба зрозуміти лише:
OFFSET + LIMIT
І все.
🚀 Після цього ти вже готовий до:
sorting
dynamic query
Spring Data pagination
Бо база вже буде зрозуміла.
