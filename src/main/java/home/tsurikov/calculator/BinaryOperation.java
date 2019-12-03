package home.tsurikov.calculator;

/**
 * Интерфейс описывающий операцию над двумя операндами
 * @author Andrey
 */
public interface BinaryOperation {

    /**
     *  Расчитывает результат для двух операндов
     * @param left левый операнд
     * @param right правый операнд
     * @return результат операции
     */
    double resultFor(double left, double right);

}
