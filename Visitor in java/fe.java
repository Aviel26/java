public class fe extends  Accompagnement{
    public fe(Hamburger hamburger) {
        super (hamburger);
    }
    @Override
    public String serve() {
        return hamburger.serve() + " with fried egg";
    }
}

