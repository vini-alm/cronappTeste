package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class MarcasCarro {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// MarcasCarro
public static Var ObterParalellum(@ParamMetaData(description = "Dados") Var Dados) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.json.Operations.toJson(
cronapi.util.Operations.getURLFromOthers(
Var.valueOf("GET"),
Var.valueOf("application/x-www-form-urlencoded"),
Var.valueOf("https://parallelum.com.br/fipe/api/v1/carros/marcas"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
Var.valueOf(""),
Var.valueOf("BODY")));
   }
 }.call();
}

}

