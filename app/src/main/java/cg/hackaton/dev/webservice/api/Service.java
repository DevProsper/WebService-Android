package cg.hackaton.dev.webservice.api;

import cg.hackaton.dev.webservice.model.Album;
import cg.hackaton.dev.webservice.model.AlbumsResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by DevProsper on 21/10/2017.
 */

public interface Service {
    @GET("/albums/music.json")
    Call<AlbumsResponse> getAlbums();
}
