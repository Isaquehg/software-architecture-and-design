package builder.pizzaria;

public class Pizza {

    private Integer size = 0;

    private Boolean flagCheese = false;

    private Boolean flagPeperoni = false;

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Boolean getFlagCheese() {
        return flagCheese;
    }

    public void setFlagCheese(Boolean flagCheese) {
        this.flagCheese = flagCheese;
    }

    public Boolean getFlagPeperoni() {
        return flagPeperoni;
    }

    public void setFlagPeperoni(Boolean flagPeperoni) {
        this.flagPeperoni = flagPeperoni;
    }
}
