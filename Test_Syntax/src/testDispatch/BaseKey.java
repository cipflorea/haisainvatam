package testDispatch;

public class BaseKey
{
  protected int _normalKey;
//  protected final int _finalKey;
  private int _baseKey;
  
  public BaseKey(int start)
  {
    _normalKey = 3;
//    _finalKey = 6;
    _baseKey = 9;
  }
  
  public int normalKey()
  {
    return _normalKey;
  }
  
//  public int finalKey()
//  {
//    return _finalKey;
//  }
  
  public int privateKey()
  {
    return _baseKey;
  }
}
