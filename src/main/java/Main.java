import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class Main {


    public static void main(String[] args) {
        Email em1 = new Email();
        staticFileLocation("/public");
        get("/", (request,response) -> {
            return new ModelAndView(null, "email.hbs");
        },new HandlebarsTemplateEngine());

        post("/generate", (request, response) -> {
            Map<String, String> model = new HashMap<>();
            model.put("firstname", request.queryParams("firstname"));
            model.put("lastname", request.queryParams("lastname"));
            model.put("department",request.queryParams("department"));
            String password = em1.randomPassowrd(8);
            model.put("password",password);
            return new ModelAndView(model,"generate.hbs");
        },new HandlebarsTemplateEngine());

        get("/about", (request,response) -> {
           return new ModelAndView(null, "about.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
