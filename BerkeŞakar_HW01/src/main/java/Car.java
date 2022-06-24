import java.awt.*;
import java.util.Date;

enum Model{
    AUDI,
    BMW,
    FORD,
    MERCEDES,
    TOYOTA,
    VOLVO
}


final class Car {
    private final Model model;
    private final int year;
    private final int kilometer;
    private final int quota;
    private final Date productionDate;
    private final Color color;

    public Car(Model model, int year, int kilometer, int quota, Date productionDate, Color color) {
        this.model = model;
        this.year = year;
        this.kilometer = kilometer;
        this.quota = quota;
        this.productionDate = productionDate;
        this.color = color;
    }

    public Model getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getKilometer() {
        return kilometer;
    }

    public int getQuota() {
        return quota;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public Color getColor() {
        return color;
    }
}
