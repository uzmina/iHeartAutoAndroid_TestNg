package Utilities;
@java.lang.annotation.Target(value= {java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
public@ interface SeleniumMethodOrder
{
  public abstract int order() default 1;
}
