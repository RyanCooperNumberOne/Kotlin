 interface UserInfoProvider{
     fun printInfo(cls: Class1)
 }
 abstract class MainProvider: UserInfoProvider{
     override fun printInfo(cls: Class1) {
         println("Method was called")
     }
 }