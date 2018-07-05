package com.yatsun.arthur;
/*
* Создание объекта в единственном экземпляре
* Глобальный доступ(через статический метод или переменную)
* Можно управлять коло-вом экземпляров объекта, которые можно создать
* Единая точка доступа
* Опасность чрезмерного использования
* */
public class Main {

    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
    }
}
