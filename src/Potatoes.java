public class Potatoes extends Food {

    // Новое внутреннее поле данных СОРТ
    private String variety;

    public Potatoes(String variety) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Картофель");
        // Инициализировать сорт картофеля
        this.variety = variety;
    }

    // Переопределить способ употребления картофеля
    public void consume() {
        System.out.println(this + " съедено");
    }


    public String getVariety() {
        return variety;
    }


    public void setVariety(String variety) {
        this.variety = variety;
    }





    public String toString() {
        return super.toString() + " '" + variety.toUpperCase() + "'";
    }
}