public class or extends Accompagnement{
    public or(Hamburger hamburger) {
        super (hamburger);
    }
    @Override
    public String serve() {
        return hamburger.serve() + " with onion rings";
    }
}

