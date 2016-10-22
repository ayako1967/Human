package jp.techacademy.takuya.okitsu.human;

/**
 * Created by takuy on 2016/10/22.
 */
import android.util.Log;

public class Human extends Animal implements Thinkable {

    String name;
    int age;
    String hobby;

    public Human() {
        name = "";
        age = 0;
        hobby = "";
    }



    public Human(String name,int age) {
        this.name = name;
        this.age = age;

    }
    public void say() {
        Log.d("javatest","私の名前は" + this.name + "です。年は" + this.age +"歳です。");
    }
    @Override
    public void think() {
        Log.d("javatest","私は" + this.hobby + "について考える");
    }
}
