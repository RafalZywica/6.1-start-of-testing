package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    Game ticTacToe = new Game("Tic Tac Toe", 20);
    Slippers awesomeSlippers39 = new Slippers("Awesome Slippers", 39, 10);
    ToothBrush blueToothBrush = new ToothBrush("Tooth Brush", "Blue", 1);

    OrderPosition orderPosition1 = new OrderPosition(ticTacToe, 1);
    OrderPosition orderPosition2 = new OrderPosition(awesomeSlippers39, 1);
    OrderPosition orderPosition3 = new OrderPosition(blueToothBrush,3);

    Order order1 = new Order();
    order1.add

}
