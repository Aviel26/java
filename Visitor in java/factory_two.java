public class factory_two {
    public static Accompagnement addTopping(Hamburger hamburger, String code){
        //
        if("ch".equals(code)) {
            return new ch(hamburger);
        }
        if("fe".equals(code)) {
            return new fe(hamburger);
        }
        if("or".equals(code)) {
            return new or(hamburger);
        }
        if("sa".equals(code)) {
            return new sa(hamburger);
        }

        throw new RuntimeException("wrong accompagnement");
    }
}
