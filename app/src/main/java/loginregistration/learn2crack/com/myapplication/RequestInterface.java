package loginregistration.learn2crack.com.myapplication;

/**
 * Created by manoj on 8/10/2017.
 */

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RequestInterface {

   /* @POST("clubappbetasingle/api/login")
    Call<ServerResponse> operation(@Body ServerRequest request);*/

    @POST("clubappbetasingle/api/login")
    Call<ServerResponse> operation(@Body ServerRequest request);


}