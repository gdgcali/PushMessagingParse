package co.com.gdgcali.pushmessaginggdg;

import com.parse.Parse;

/**
 * Created by JuanGuillermo on 25/02/2015.
 * Se sobreescribe la clase application para que las variables de parse puedan ser globales.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Inicializa la libreria de PARSE
        Parse.initialize(this, "44Z2KhJwOcFgQerZeXLk32OAgBz3hzNqSbJ95Ytp", "IMF1SFHxFt3loL9Xqynixi15eTLveghlHPOWZg68");

    }
}
