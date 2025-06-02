Java inheritance 1:
3 class өгөгдсөн (Animal, Bird,Solution буюу Main) Bird class Animal class-аас удамшиж "Walk()" функцийг авна. Bird класс өөртөө fly() функцтэй боловч бодлогийн хариултыг(output) мөн Solution class-ыг харвал sing() гэх нэмэлт функц бичиж өгөх ёстойг ойлгоно. Ингэснээр бид Bird класс Д шинээр void sing(){
        System.out.println("I am singing");
    } функцийг шинээр бичиж өгснөөр бодлого шийдэгдэнэ.

Java inheritance 2:
Arithmetic нэртэй эх класс үүсгэсэн.
add(int a, int b) гэдэг хоёр тоо нэмэх method агуулсан.
Энэ method нь хоёр параметр авч тэдгээрийн нийлбэрийг буцаадаг (return a + b).
Adder нэртэй гадаад класс нь Arithmetic классаас удамшина.
Ямар ч шинэ method нэмээгүй.
Solution класс дотор:
Adder классын обьект (a) үүсгэсэн.
a.getClass().getSuperclass().getName() ашиглаж эх классын нэрийг хэвлэсэн.
a.add(…) дуудаж, өвлөсөн method-ийг ашигласан.
