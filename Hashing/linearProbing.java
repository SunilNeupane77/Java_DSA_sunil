package Hashing;

class Hashinng {
    int tablesize;
    Integer[] arr;

    public Hashinng(int tablesize) {
        this.tablesize = tablesize;
        arr = new Integer[tablesize];
    }

    public int hashfunction(int key) {
        return key % this.tablesize;
    }

    public boolean collision(int index) {
        return (arr[index] != null);
    }

    public void inserthash(int key) {

        int index = hashfunction(key);
        int i = 1;

        while (collision(index)) {
            index = (hashfunction(key) + i) % this.tablesize;
            i++;
        }
        arr[index] = key;
    }

    public void search(int key) {
        boolean found = false;
        int index = hashfunction(key);
        int i = 1;
        if (arr[index] == key) {
            found = true;
        } else {
            while (arr[index] != key && i <= arr.length) {
                index = (hashfunction(key) + i) % this.tablesize;
                if (arr[index] == key) {
                    found = true;
                    break;
                }
                i++;

            }
        }

        if (found) {
            System.out.println(key + "is found in table");
        } else {
            System.out.println("not found");
        }

    }

    void deletehash(int key) {
        boolean found = false;
        int index = hashfunction(key);
        int i = 1;
        if (arr[index] == key) {
            found = true;
        } else {
            while (arr[index] != key && i <= arr.length) {
                index = (hashfunction(key) + i) % this.tablesize;
                if (arr[index] == key) {
                    found = true;
                    break;
                }
                i++;

            }
        }
        if (found) {
            int keytodelete = arr[index];
            arr[index] = null;
            System.out.println(keytodelete + "deleted fromt table");
        } else {
            System.out.println("no such element");
        }
    }

    public void printAll() {
        for (Integer var : arr) {
            System.out.println(var);
        }
    }
}

class LinearProbing {
    public static void main(String args[]) {
        int[] input = { 5, 7, 12, 14, 3 };
        Hashinng h = new Hashinng(input.length);
        for (int var : input) {
            h.inserthash(var);
        }
        h.printAll();
        h.search(7);
        h.search(14);
        h.search(2);
        h.deletehash(7);
        h.printAll();
    }

}