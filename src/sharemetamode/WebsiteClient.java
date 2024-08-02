package sharemetamode;

public class WebsiteClient {
    public static void main(String[] args) {
        User user = new User("张三");
        User user1 = new User("李四");
        WebsiteFactory factory = new WebsiteFactory();
        Website website = factory.getWebsite("博客");
        Website website2 = factory.getWebsite("博客");
        System.out.println(website2 == website);
        website.use(user);
        Website website1 = factory.getWebsite("视频");
        website1.use(user1);

    }
}
