package animal;

public class Human extends Animal {
    //フィールド
    private String hobby;

    //引数なしコンストラクタ
    public Human() {
    }

    //引数ありコンストラクタ
    public Human(String name,int age,String hobby) {
    super(name, age);
    this.hobby = hobby;
    }

    //趣味のフィールドに入っている文字列の表示
    public void think() {
        System.out.println("私は" + hobby +"について考えています。");
    }
}
