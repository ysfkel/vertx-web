package gulfnews.config;

import Controllers.ArticlesController;
import Controllers.HomeController;
import io.vertx.ext.web.Router;

public class RoutesConfig {
	
	
    private HomeController home;
    private ArticlesController articles;
    private  Router router;
    
     public RoutesConfig(HomeController home,ArticlesController articles, Router router){
    	 this.home=home;
    	 this.articles=articles;
    	 this.router=router;
     }
    
       public  void ConfigRoutes(){
    	   router.get("/").handler(home::Index);
	       router.get("/articles").handler(articles::Index);
       }


}
