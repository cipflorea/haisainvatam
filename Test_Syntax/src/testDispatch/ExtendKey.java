package testDispatch;

public class ExtendKey
    extends BaseKey
{
  private int _extendKey;
  
  public ExtendKey(int start)
  {
    super(start);
    _normalKey = 31;
//     pica faza cu final ca nu o pot modifica din clasa extinsa
//    _finalKey = 61;
    _extendKey = 91;
  }
  
  public int privateKey()
  {
    return _extendKey;
  }
}
