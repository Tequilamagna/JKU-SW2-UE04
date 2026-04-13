package app;

import inout.Out;
import item.Item;

public class Application {
  public static void main(String[] args) {
    /*
    TODO: Design a complex item that uses at least one of each item kinds.
     */
    Item myItem = null;

    /* TODO: Call correct functions on myItem */
    Out.println("==========");
    Out.println("%s consists of %d primitive items".formatted("TODO", -1));
    Out.println("Its value is %.2f Gold".formatted(-1.0));
    Out.println("It can be bought for %.2f Gold and sold for %.2f Gold".formatted(-1.0, -1.0));
    Out.println("==========");
    Out.println(myItem);
  }
}