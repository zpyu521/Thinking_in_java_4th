package generics;//: generics/UseList.java
// {CompileTimeError} (Won't compile)
import java.util.*;

public class UseList<W,T> {
  //TODO
  //void f(List<T> v) {}
  void f(List<W> v) {}
} ///:~
