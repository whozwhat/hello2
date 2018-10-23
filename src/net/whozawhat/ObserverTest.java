package net.whozawhat;

public class ObserverTest {
    /**
     * 程序员是观察者
     *
     * @author mrsimple
     */
    public class Coder implements Observer {
        public String name ;

        public Coder(String aName) {
            name = aName ;
        }

        @Override
        public void update(Observable o, Object arg) {
            System.out.println( "Hi, " +  name + ", AndroidWeekly更新啦, 内容 : " + arg);
        }

        @Override
        public String toString() {
            return "码农 : " + name;
        }

    }


    /**
     * AndroidWeekly这个网站是被观察者,它有更新所有的观察者 (这里是程序员) 都会接到相应的通知.
     *
     * @author mrsimple
     */
    public class AndroidWeekly extends Observable {

        public void postNewPublication(String content) {
            // 标识状态或者内容发生改变
            setChanged();
            // 通知所有观察者
            notifyObservers(content);
        }
    }

    // 测试代码
    public class Test {
        public static void main(String[] args) {
            // 被观察的角色
            AndroidWeekly androidWeekly = new AndroidWeekly();
            // 观察者
            Coder mrsimple = new Coder("mr.simple");
            Coder coder1 = new Coder("coder-1");
            Coder coder2 = new Coder("coder-2");
            Coder coder3 = new Coder("coder-3");

            // 将观察者注册到可观察对象的观察者列表中
            androidWeekly.addObserver(mrsimple);
            androidWeekly.addObserver(coder1);
            androidWeekly.addObserver(coder2);
            androidWeekly.addObserver(coder3);

            // 发布消息
            androidWeekly.postNewPublication("新的一期AndroidWeekly来啦!");
        }

    }
}
