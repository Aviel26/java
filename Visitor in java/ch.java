public class ch extends Accompagnement{
    public ch(Hamburger hamburger) {
        super (hamburger);
    }
    @Override
    public String serve() {
        return hamburger.serve() + " with chips ";
    }
}

