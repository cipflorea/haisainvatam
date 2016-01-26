package testDispatch;

public class BaseUser
{
  protected int _normalLock;
//  protected final int _finalLock;
  private int _baseLock;
  
  public BaseUser(int start)
  {
    _normalLock = 3;
//    _finalLock = 6;
    _baseLock = 9;
  }
  
  public int normalLock()
  {
    return _normalLock;
  }
  
//  public int finalLock()
//  {
//    return _finalLock;
//  }
  
  
  public int privateLock()
  {
    return _baseLock;
  }
  
  
  public int useNormalKey(BaseKey key)
  {
    int val = normalLock() * 1000 + key.normalKey();
    return val;
  }
  
  public int usePrivateKey(BaseKey key)
  {
    int val = privateLock() * 1000 + key.privateKey();
    return val;
  }
  
  public int useNormalKey(ExtendKey key)
  {
    int val = normalLock() * 1000 + key.normalKey();
    return val;
  }
  
  public int usePrivateKey(ExtendKey key)
  {
    int val = privateLock() * 1000 + key.privateKey();
    return val;
  }
  
  
  public String useKey(ExtendKey key)
  {
    int val = _baseLock * 7 + key.privateKey();
    val += 222222222;
    return "(base, extd)";
  }
  
  public String useKey(BaseKey key)
  {
    int val = _baseLock * 3 + key.privateKey();
    val += 111111111;
    return "(base, base)";
  }
}