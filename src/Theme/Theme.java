package Theme;

public class Theme {
    private static Theme instance;
    private String themeColor;

    private Theme() {
        this.themeColor = "light"; // Default theme
    }

    public synchronized static Theme getInstance() {
        if (instance == null) {
            instance = new Theme();
        }
        return instance;
    }

    public String getThemeColor() {
        return themeColor;
    }
    public synchronized void setThemeColor(String themeColor) {
        if ("light".equals(themeColor) || "dark".equals(themeColor)) {
            this.themeColor = themeColor;
            System.out.println("Theme set to " + themeColor);
        }
        else System.out.println("dark or white theme color changed");
    }
}
