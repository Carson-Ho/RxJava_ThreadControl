package scut.carson_ho.rxjava_thread;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Carson_Ho on 17/7/11.
 */

public interface GetRequest_Interface {

    @GET("ajax.php?a=fy&f=auto&t=auto&w=hi%20world")
    Observable<Translation> getCall();
}