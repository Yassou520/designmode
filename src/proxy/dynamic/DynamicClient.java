package proxy.dynamic;

public class DynamicClient {
    public static void main(String[] args) {
        ITeacher teacher = new SuperTeacher();
        ProxyFactory factory = new ProxyFactory(teacher);
        ITeacher teacherProxy = (ITeacher) factory.getProxyInstance();
        teacherProxy.teach();
    }
}
