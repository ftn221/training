package constants;

import java.time.Duration;

public class Constant {
    public static class TimeoutVariable {
        public static final int IMPLICIT_WAIT = 10;
        public static Duration EXPLICIT_WAIT = Duration.ofSeconds(4);
    }

    public static class Urls {
        public static final String REALT_HOME_PAGE = "https://realt.by";
        public static final String GOOGLE_MAIN_PAGE = "https://www.google.com";
    }

    /**
     Clear Browser and Cookies
     If True - cookies clear
     */
    public static final Boolean CLEAR_COOKIES_AND_STORAGE = true;
    /**
     if true - driver closed
     */
    public static final Boolean CLOSE_DRIVER = true;
}
