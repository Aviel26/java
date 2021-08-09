
public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        //
        if("sp".equals(code)) {
            return new SpicyHamburger();
        }
        if("la".equals(code)) {
            return new LambHamburger();
        }
        if("cl".equals(code)) {
            return new ClassicHamburger();
        }
        if("hm".equals(code)) {
            return new HomemadeHamburger();
        }

        throw new RuntimeException("wrong Hamburger");
    }
}
