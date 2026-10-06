package org.example;
import com.google.gson.GsonBuilder;
import org.example.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
    //16.1
        Book book = new Book("Martin Eden", "Jack London", 1909, 3689.99);
    Gson gson = new Gson();
    Gson gsonB = new GsonBuilder()
            .setPrettyPrinting()
            .create();
    System.out.println(gson.toJson(book));
    System.out.println(gsonB.toJson(book));
    //16.2
        String json = """ 
        [
        {"name": "Аня", "age": 19, "grade": 4.5},
        {"name": "Борис", "age": 21, "grade": 3.8},
        {"name": "Вера", "age": 20, "grade": 4.9}
         ]""";
        Gson gsonS = new Gson();
        Type listType = new TypeToken<List<Student>>(){}.getType();
        List<Student>students = gsonS.fromJson(json, listType);
        double sum = 0;
        for(Student student : students)
        {
            if(student.grade() > 4.0)
            {
                System.out.println(student.nameS());
            }
            sum += student.grade();
        }
        double average = sum / students.size();
        System.out.printf("Средний балл группы:" + average);
    }
}
