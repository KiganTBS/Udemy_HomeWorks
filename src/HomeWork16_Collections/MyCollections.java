package HomeWork16_Collections;

public class MyCollections {
    private String[] array = new String[10];
    private int size = 0;

    public String getArray(int index) {
        if (index >= 0 && index < size) return array[index];
        else return "Элемент не найден";
    }

    public int getSize() {
        return size;
    }


    public void add(String s) {                                          //Добавление новых сотрудников
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] nArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) nArray[i] = array[i];
            array = nArray;
        }
    }

    public void remove(int index) {                                      //Удаление сотрудников по индексу
        if (index >=0&&index<size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }
    public void remove(String s){                                       //Удаление сотрудников по имени
        for(int i=0,j=0;i<size;i++,j++){
            if (array[i].equalsIgnoreCase(s)){                          // Поиск слова не зависимо от регистра
                array[j] = array[j+1];
                size--;
            }
        }

    }
}
