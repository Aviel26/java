public class sa extends Accompagnement{
    public sa(Hamburger hamburger) {
        super (hamburger);
    }
    @Override
    public String serve() {
        return hamburger.serve() + " with salad";
    }
}

