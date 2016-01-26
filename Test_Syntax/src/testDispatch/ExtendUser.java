package testDispatch;

public class ExtendUser
    extends BaseUser
{
  private int _extendLock;
  
  public ExtendUser(int start)
  {
    super(start);
    _normalLock = 31;
//    _finalLock = 61;
    _extendLock = 91;
  }
  
  public int privateLock()
  {
    return _extendLock;
  }
  
  
  public String useKey(ExtendKey key)
  {
    return "(extd, extd)";
  }
  
  public String useKey(BaseKey key)
  {
    return "(extd, base)";
  }
}
