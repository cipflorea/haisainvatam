import basicObject.Test;

public class Main
{
  public static void main(String[] args)
  {
//    Test.testSync();
//    Test.testBlock();
//    basicAtomics.Test.testInc();
//    basicAtomics.Test.testIncAtomic();
    blockingQueue.Test.testStandardQueue();
    
    System.out.println("Done!");
  }
}
