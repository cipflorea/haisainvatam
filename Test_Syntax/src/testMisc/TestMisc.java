package testMisc;

import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class TestMisc
{
  public static void test()
  {
    ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
    map.put(1, "unu");
    map.put(2, "two");
    map.put(3, "tres");
    map.put(5, "cinque");
    map.put(6, "sase");
    map.put(7, "7777");
    
    for (int i = 0; i < 4; i++)
    {
      System.out.println(i);
    }
    
    for (Enumeration<Integer> prop = map.keys(); prop.hasMoreElements();)
    {
      Integer i = prop.nextElement();
      System.out.println(i + "   " + map.get(i));
    }
  }
}
