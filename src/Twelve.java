void main() {
    //12.1
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    while(true)
    {
        System.out.println("Введите названия товаров или 'стоп': ");
        String nameT = scanner.nextLine();

        if(nameT.equalsIgnoreCase("стоп"))
        {
            break;
        }
        list.add(nameT);
    }

    System.out.println("Вы ввели:" + list);
    System.out.println("Введите названия товаров для удаления: ");
    String nameTD = scanner.nextLine();
    if (list.contains(nameTD)) {
        list.remove(nameTD);
        System.out.println("\nИтоговый список: "+list+ "Размер списка: " + list.size());
    } else {
        System.out.println("Товар не найден");
    }
    scanner.close();
    //12.2
    Scanner scanner2 = new Scanner(System.in);
    System.out.println("Введите n: ");
    int n = scanner2.nextInt();
    scanner2.nextLine();
    ArrayList<String> listString = new ArrayList<>();
    for(int i = 0; i < n; i++) {
        System.out.print("Введите слово: ");
        String words = scanner2.nextLine();
        listString.add(words);
    }
    HashSet<String> uniqueWords = new HashSet<>(listString);
    System.out.print("Размер HashSet<String>: " + uniqueWords.size() + "\nРазмер ArrayList<String> " + listString.size() + "\nПовторов: " + (listString.size() - uniqueWords.size()));
    System.out.print("\nuniqueWords" + uniqueWords);
    scanner2.close();

    //12.3
    Scanner scanner3 = new Scanner(System.in);
    System.out.print("Введите предложение: ");
    String string = scanner3.nextLine();
    String[] wordsFromString = string.split(" ");
    HashMap<String, Integer> map = new HashMap<>();
    for (String word : wordsFromString) {
        if (map.containsKey(word)) {
            map.put(word, map.get(word) + 1);
        } else {
            map.put(word, 1);
        }
    }
    for (String key : map.keySet())
    {
        System.out.println("Слово: " + key + " — Количество: " + map.get(key));
    }
    scanner3.close();
}