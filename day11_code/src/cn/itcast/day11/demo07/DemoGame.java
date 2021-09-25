package cn.itcast.day11.demo07;

public class DemoGame {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("艾希");
      //  hero.setSkill(new SkillImpl());


//        Skill skill=new Skill() {
//            @Override
//            public void use() {
//                System.out.println("pia");
//            }
//        };
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("pia");
            }
        });
        hero.attack();
    }
}
