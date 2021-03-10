public class Factory {
    static Phone getFactory(String key) {
        Phone phone = null;
        switch (key) {
            case "iphone":
                phone = new Iphone();
                break;
            case "samsung":
                phone = new Samsung();
                break;
            case "xiaomi":
                phone = new Xiaomi();
                break;
        }
        return phone;
    }
}
