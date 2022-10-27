# Гонка №1

Добро пожаловать на вашу первую гонку в жизни! Сегодня вы узнаете, что такое 
скоростное программирование и желание написать как можно больше кода за одну секунду!

## Правила
> Гонка - это решение задач на скорость. Ниже вы увидите несколько задач, каждая из 
> которых весит определенное количество баллов. Ваша задача - набрать как можно больше баллов.
> Самое сложное, что время строго ограничено и в какой-то момент коммиты в этот репозиторий будут запрещены!

## Сколько времени? 
> 30 минут + 10 минут по требованию.

## Как сдавать?
> Вам просто нужно создать в этом репо ветку со своей фамилией и запушить туда все, что можно. 
> Главное не проспите момент окончания времени, чтобы не забыть запушить вообще все!

## Когда результаты? 
> Я попробую проверять по ходу гонки, но сами понимаете, что это немного может затянуться. 
> Попробую в ходе практики.

# Задачи
Задачи в списке идут по возрастанию баллов и сложности. Однако вы можете решать их
в любой последовательности. Необязательно решить все задачи, окончательный результат - это просто 
сумма баллов за все решенные задачи. 

**Удачи и поехали!**

### Задача №1 (50 баллов)
Вам нужно вывести все делители числа, которое ввел пользователь. 

Пользователь вводит одно число, а вы выводите все его делители.

### Задача №2 (50 баллов)
Объявите массив или список длиной **100** и заполните их случайными числами.
После этого найдите максимум, минимум и среднее арифметическое всех элементов массива.

### Задача №3 (100 баллов)
Объявите массив или список длиной **100** и заполните их случайными числами. 
После этого попробуйте отсортировать этот массив. 

**Нельзя** использовать встроенные методы `sort`, надо написать собственную сортировку. 
> Для этой задачи очень полезно загуглить, что такое сортировка пузырьком

### Задача №4 (200 баллов)
Создайте класс точка (`Point`), у которого есть все лишь два приватных поля:
1. x
2. y

Сделайте конструктор и геттеры/сеттеры. После этого создайте метод, который ищет расстояние 
между двумя точками по их координатам (`public int findDistance(Point point1, Point point2)`).
Формулу можно найти здесь: https://mnogoformul.ru/rasstoyanie-mezhdu-tochkami

В основной программе пользователь должен ввести координаты для двух точек (четыре числа - `x1, y1, x2, y2`). 
После этого создайте две точки с этими координатами и выведите расстояние между ними.

### Задача №5 (100 баллов)
> Для этой задачи необходимо сначала решить четвертую задачу 

Создайте класс треугольник, который состоит из трех полей:
1. `private Point A;`
2. `private Point B;`
3. `private Point C;`

В основной программе пользователь должен ввести данные о трех точках (по координатам), 
а дальше выведите периметр треугольника, используя функцию получения расстояния между точками.

Напомню, что периметр треугольника - это `AB + BC + CA`.


### Задача №6 (200 баллов)
Создайте класс `Person` с полями:
1. Фамилия
2. Имя 
3. Отчество
4. Возраст
5. Гражданство
6. Везение (можете поставить по умолчанию 1 или просто передавать единицу)

Дальше стандартные вещи: геттеры/сеттеры и конструктор для всех полей. 

После создайте класс `Plane`, в котором будет:
1. Список пассажиров (список объектов класса `Person`).
2. Место отправления (название города)
3. Место пребывания (название города)

Создайте геттеры/сеттеры и конструктор. Также в классе `Plane` необходимо создать метод `flight(List<Person> persons)`, 
который будет брать каждого пассажира этого самолета и увеличивать его везение на один (то есть с каждым перелетом везение
человека увеличивается на один). 

В основной программе создайте три объекта `Person` и выведите о них информацию. 
После этого создайте объект класса `Plane` и добавьте в список пассажиров **два** пассажира из трех.
Вызовите для объекта класса `Plane` метод `flight` и выведите информацию о пассажирах - 
для двух из них везение должно стать равным 2 :)

### Задача №7 (75 баллов)
> Для этой задачи нужно, чтобы была решена или 4 задача, или 6 (любая из них)

Реализуйте интерфейс `IPrintable`, в котором будет метод `getInfo()`. Имплементируйте его в своих классах
и переопределите метод `getInfo()` в своих классах.

### Задача №8 (125 баллов)
Для получения баллов за эту задачу вам нужно ответить на несколько вопросов. 
Ответы пишите в текстовый файлик с названием номера задачи
1. Чем отличаются массивы и `List` (списки)?
2. Зачем нужен абстрактный класс и чем он отличается от обычного класса?
3. Зачем нужен интерфейс?
4. Можно ли наследоваться от большого количества классов?
5. Можно ли имплементировать несколько интерфейсов в одном классе?


> Если вы решили все задачи этой гонки, то напишите об этом в чат! Не бойтесь, у меня есть резервные :)