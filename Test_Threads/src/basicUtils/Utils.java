package basicUtils;

import java.util.Random;

public class Utils
{
  public static void SleepRand(long r)
  {
    Random rand = new Random();
    r = Math.round(r * rand.nextFloat());
    String thName = Thread.currentThread().getName();
    System.out.println(thName + ": (sleeps " + r + ")");
    try
    {
      Thread.sleep(r);
    }
    catch (InterruptedException ex)
    {
      System.out.println("(FUCK - " + thName + ": woke up from Sleeps)");
    }
  }
  
  
  public static void Sleep(long r)
  {
    String thName = Thread.currentThread().getName();
    System.out.println(thName + ": (sleeps " + r + ")");
    try
    {
      Thread.sleep(r);
    }
    catch (InterruptedException ex)
    {
      System.out.println("(FUCK - " + thName + ": woke up from Sleeps)");
    }
  }
  
  
  public static void Join(Thread th)
  {
    String thName = th.getName();
    try
    {
      th.join();
    }
    catch (InterruptedException ex)
    {
      System.out.println("(FUCK - " + thName + ": woke up from Join)");
    }
    System.out.println(thName + ": Thread Terminated!");
  }
  
  
  public static boolean print = true;
  public static void Print(String str)
  {
    if (print)
    {
      System.out.println(str);
    }
  }
}
