INSERT INTO translate (name_original, name_ru, name_en)
VALUES ('meal', 'Мука', 'Meal'),
       ('milk', 'Молоко', 'Milk'),
       ('salt', 'Соль', 'Salt'),
       ('sugar', 'Сахар', 'Sugar'),
       ('butter', 'Масло сливочное', 'Butter'),
       ('oil', 'Масло растительное', 'Oil'),
       ('cream', 'Сливки', 'Cream'),
       ('mushrooms', 'Грибы', 'Mushrooms'),
       ('water', 'Вода', 'Water'),
       ('black pepper', 'Черный перец', 'Black pepper'),
       ('chicken', 'Курица', 'Chicken'),
       ('bacon', 'Бекон', 'Bacon'),
       ('bread', 'Хлеб', 'Bread'),
       ('eggs', 'Яйца', 'Eggs'),

       ('grams', 'грамм', 'Grams'),
       ('kilograms', 'килограмм', 'Kilograms'),
       ('counts', 'количество', 'Counts'),

       ('low', 'Легкий', 'low'),
       ('medium', 'Средний', 'Medium'),
       ('hard', 'Тяжелый', 'Hard'),

       ('pancakes', 'Блины', 'Pancakes'),
       ('omelet', 'Омлет', 'Omelet');

INSERT INTO types (name_original)
VALUES ('grams'),
       ('kilograms'),
       ('counts');

INSERT INTO complexities (name_original)
VALUES ('low'),
       ('medium'),
       ('hard');

INSERT INTO ingredients (id_type, name_original)
VALUES (1, 'meal'),
       (1, 'milk'),
       (1, 'salt'),
       (1, 'sugar'),
       (1, 'butter'),
       (1, 'oil'),
       (1, 'cream'),
       (1, 'mushrooms'),
       (1, 'water'),
       (1, 'black pepper'),
       (1, 'chicken'),
       (1, 'bacon'),
       (1, 'bread'),
       (3, 'eggs');

INSERT INTO dishes (id_complexity, name_original, created)
VALUES (1, 'pancakes', '2024-01-26 12:05:16'),
       (2, 'omelet', '2024-01-26 12:05:16');

INSERT INTO recipes (id_dish, description)
VALUES (1, 'Описание');

INSERT INTO recipes_to_ingredients (id_recipe, id_ingredient, count)
VALUES (1, 1, 200),
       (1, 2, 300),
       (1, 3, 5),
       (1, 4, 10),
       (1, 5, 20),
       (1, 9, 200),
       (1, 14, 2);