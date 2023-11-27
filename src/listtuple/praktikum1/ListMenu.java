package listtuple.praktikum1;

import java.util.ArrayList;
import java.util.List;

public class ListMenu {
    private final List<Menu> menuList;

    public ListMenu() {
        menuList = new ArrayList<>();
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public Menu getOneMenu(int index) {
        return this.menuList.get(index);
    }

    public int getJml(String jenis) {
        if (jenis.equals("Makanan") || jenis.equals("Minuman")) {
            return this.menuList.stream().filter(menu -> menu.getJenis().equals(jenis)).toList().size();
        }

        System.out.println("Jenis menu tidak ditemukan.");
        return 0;
    }

    public boolean isAda(int index) {
        return (index >= 0 && index < this.menuList.size() && !this.menuList.isEmpty());
    }

    public void addMenu(Menu menu) {
        this.menuList.add(menu);
    }

    public void changeMenu(int index, Menu menu) {
        if (isAda(index)) {
            this.menuList.set(index, menu);
        } else {
            System.out.println("Item tidak ada.");
        }
    }

    public void removeMenu(int index) {
        if (isAda(index)) {
            this.menuList.remove(index);
        } else {
            System.out.println("Item tidak ada.");
        }
    }
}
