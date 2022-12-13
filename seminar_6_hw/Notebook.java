import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Notebook {
    private int ram;
    private String os;
    private int ssd;
    private double screenResolution;
    private String color;
    public static int[] ramList = new int[]{2, 4, 8, 16, 32};
    public static int[] ssdList = new int[]{128, 256, 512, 1024};
    public static List<String> colors = new ArrayList<String>(List.of("black", "white", "grey", "blue"));
    public static List<String> opSys = new ArrayList<>(List.of("Windows", "Linux", "MacOS"));
    public static double[] screenResolutions = new double[]{13.3, 14.0, 15.6, 17.3};

    public Notebook() {

    }

    public Notebook(int ram, String os, int ssd, double screenResolution, String color) {
        this.ram = ram;
        this.os = os;
        this.ssd = ssd;
        this.screenResolution = screenResolution;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public String getOs() {
        return os;
    }

    public int getSsd() {
        return ssd;
    }

    public double getScreenResolution() {
        return screenResolution;
    }

    public String getColor() {
        return color;
    }

    public void setRam(int ram) {
        if (ram == 0) this.ram = 2;
        if (ram == 1) this.ram = 4;
        if (ram == 2) this.ram = 8;
        if (ram == 3) this.ram = 16;
        if (ram == 4) this.ram = 32;
        else this.ram = 2;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setScreenResolution(double screenResolution) {
        this.screenResolution = screenResolution;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram=" + ram +
                ", os='" + os + '\'' +
                ", ssd=" + ssd +
                ", screenResolution=" + screenResolution +
                ", color='" + color + '\'' +
                '}';
    }

    public Notebook createRandomNotebook() {
        Random random = new Random();
        int ram = ramList[random.nextInt(0, 5)];
        int ssd = ssdList[random.nextInt(0, 4)];
        String os = opSys.get(random.nextInt(0, 3));
        String color = colors.get(random.nextInt(0, 4));
        double screen = screenResolutions[random.nextInt(0, 4)];
        Notebook nout = new Notebook(ram, os, ssd, screen, color);
        //System.out.println(nout);
        return nout;
    }

    public static Map allNotebookCreateMap() {
        Map<String, Notebook> coll = new HashMap<>();
        //Set<Notebook> set = new HashSet<Notebook>();
        int i = 1;
        for (int ram = 0; ram < 5; ram++) {
            for (int ssd = 0; ssd < 4; ssd++) {
                for (int os = 0; os < 3; os++) {
                    for (int screen = 0; screen < 4; screen++) {
                        for (int color = 0; color < 4; color++) {
                            String name = "Notebook" + i;
                            i++;
                            int ram1 = ramList[ram];
                            int ssd1 = ssdList[ssd];
                            String os1 = opSys.get(os);
                            String color1 = colors.get(color);
                            double screen1 = screenResolutions[screen];
                            Notebook nout = new Notebook(ram1, os1, ssd1, screen1, color1);
                            coll.put(name, nout);


                        }
                    }
                }
            }
        }
        System.out.println(coll.size());
        return coll;
    }

    public static Set<Notebook> allNotebookCreateSet() {
        //Map<String, Notebook> coll = new HashMap<>();
        Set<Notebook> set = new HashSet<Notebook>();
        int i = 1;
        for (int ram = 0; ram < 5; ram++) {
            for (int ssd = 0; ssd < 4; ssd++) {
                for (int os = 0; os < 3; os++) {
                    for (int screen = 0; screen < 4; screen++) {
                        for (int color = 0; color < 4; color++) {
                            int ram1 = ramList[ram];
                            int ssd1 = ssdList[ssd];
                            String os1 = opSys.get(os);
                            String color1 = colors.get(color);
                            double screen1 = screenResolutions[screen];
                            Notebook note = new Notebook(ram1, os1, ssd1, screen1, color1);
                            set.add(note);
                        }
                    }
                }
            }
        }
        //System.out.println(set.size());
        return set;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите минимальный размер оперативной памяти:");
        System.out.println("Нажмите цифру: 1 - 2 ГБ, 2 - 4 ГБ, 3 - 8 ГБ, 4 - 16 ГБ, 5 - 32 ГБ");
        int r = in.nextInt();
        int ram = ramList[r - 1];
        System.out.println("Выберите минимальный размер SSD:");
        System.out.println("Нажмите цифру: 1 - 128 ГБ, 2 - 256 ГБ, 3 - 512 ГБ, 4 - 1024 ГБ");
        int ssd = in.nextInt();
        System.out.println("Выберите операционную систему:");
        System.out.println("Нажмите цифру: 1 для Windows, 2 для Linux, 3 для MacOS");
        int os = in.nextInt();
        String opS = opSys.get(os - 1);
        System.out.println("Выберите цвет:");
        System.out.println("Нажмите цифру: 1 - black, 2 - white, 3 - grey, 4 - blue");
        int col = in.nextInt();
        String color = colors.get(col - 1);
        System.out.println("Выберите минимальное разрешение экрана:");
        System.out.println("Нажмите цифру: 1 - 13.3 дюйма, 2 - 14.0 дюймов, 3 - 15.6 дюйма, 4 - 17.3 дюйма");
        int scr = in.nextInt();
        double screen = screenResolutions[scr - 1];
        Set<Notebook> set = new HashSet<>();
        set = allNotebookCreateSet();
        Set<Notebook> found = new HashSet<>();
        found = set.stream().filter(note -> note.getRam() >= ram && note.getSsd() >= ssd && note.getColor().equals(color)).collect(Collectors.toSet());
        System.out.println("Список подходящих под Ваши параметры ноутбуков: ");
        System.out.println(found);

    }
}
//    public Set<Notebook> findNotebook() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Выберите размер оперативной памяти:");
//        System.out.println("Нажмите цифру: 1 - 2 ГБ, 2 - 4 ГБ, 3 - 8 ГБ, 4 - 16 ГБ, 5 - 32 ГБ");
//        int r = in.nextInt();
//        int ram = ramList[r - 1];
//        System.out.println("Выберите размер SSD:");
//        System.out.println("Нажмите цифру: 1 - 128 ГБ, 2 - 256 ГБ, 3 - 512 ГБ, 4 - 1024 ГБ");
//        int ssd = in.nextInt();
//        System.out.println("Выберите операционную систему:");
//        System.out.println("Нажмите цифру: 1 для Windows, 2 для Linux, 3 для MacOS");
//        int os = in.nextInt();
//        String opS = opSys.get(os - 1);
//        System.out.println("Выберите цвет:");
//        System.out.println("Нажмите цифру: 1 - black, 2 - white, 3 - grey, 4 - blue");
//        int col = in.nextInt();
//        String color = colors.get(col - 1);
//        System.out.println("Выберите разрешение экрана:");
//        System.out.println("Нажмите цифру: 1 - 13.3 дюйма, 2 - 14.0 дюймов, 3 - 15.6 дюйма, 4 - 17.3 дюйма");
//        int scr = in.nextInt();
//        double screen = screenResolutions[scr - 1];
//        //Set<Notebook> set = new HashSet<>();
//        //set = Notebook.allNotebookCreateSet();
//        Set set = allNotebookCreateSet();
//        Set<Notebook> found = new HashSet<>();
//        found = set.stream().filter(note -> note.getRam() >= ram && note.getSsd() >= ssd && note.getColor().equals(color)).collect(Collectors.toSet());
//    return found;
//    }




