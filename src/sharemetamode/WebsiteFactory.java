package sharemetamode;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {
    private Map<String,Website> websiteCache;

    public WebsiteFactory(){
        websiteCache = new HashMap<>();
    }
    public Website getWebsite(String type){
        if (!websiteCache.containsKey(type)){
            websiteCache.put(type,new ConcreteWebsite(type));
        }
        return websiteCache.get(type);
    }
}
