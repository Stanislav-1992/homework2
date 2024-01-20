public class Main {
    public static void main(String[] args) {
        // 1 задание
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        // 2 задание
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        // 3 задание
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // 4 задание
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // 5 задание
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // 6 задание
        var boxerFirst = 78.2;
        var boxerSecond = 82.7;
        var boxersWeight = boxerFirst + boxerSecond;
        System.out.println("Общий вес боксеров " + boxersWeight + " кг!");
        var boxerWeightDifference = (boxerSecond - boxerFirst);
        System.out.println("Разница в весе боксеров составляет " + boxerWeightDifference + " кг!");
        // 7 задание
        var fighterWeightDifference1 = (boxerSecond - boxerFirst);
        System.out.println("Разница в весе спортсменов составляет " + fighterWeightDifference1 + " кг!");
        var fighterWeightDifference2 = boxerSecond % boxerFirst;
        System.out.println("Разница в весе спортсменов составляет " + fighterWeightDifference2 + " кг!");
        // 8 задание
        var totalHours = 690;
        var workingHours = 8;
        var totalEmployees = totalHours / workingHours;
        System.out.println("Всего работников в компании - " + totalEmployees + " человек" );
        totalEmployees = totalEmployees + 94;
        System.out.println(totalEmployees);
        var newWorkingHours = totalHours / totalEmployees;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + newWorkingHours + " часа работы может быть поделено между сотрудниками" );


    }
}