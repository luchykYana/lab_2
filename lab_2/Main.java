package lab_2;

public class Main {
    public static void main(String[] args) {
        var sortManager = new SortManager();

        var arr = DataManager.getMockData();
        var arr1 = SearchManager.searchForSeason(arr);

        DisplayManager.display(SortManager.sortDownByColor(arr1));
        DisplayManager.display(sortManager.sortUpByColor(arr1));

        DisplayManager.display(sortManager.sortUpByPrice(arr));
        DisplayManager.display(sortManager.sortDownByPrice(arr));
    }
}
