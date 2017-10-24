package com.example.per6.appopener;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;

        import com.spotify.sdk.android.authentication.AuthenticationClient;
        import com.spotify.sdk.android.authentication.AuthenticationRequest;
        import com.spotify.sdk.android.authentication.AuthenticationResponse;
        import com.spotify.sdk.android.player.Config;
        import com.spotify.sdk.android.player.ConnectionStateCallback;
        import com.spotify.sdk.android.player.Error;
        import com.spotify.sdk.android.player.Player;
        import com.spotify.sdk.android.player.PlayerEvent;
        import com.spotify.sdk.android.player.Spotify;
        import com.spotify.sdk.android.player.SpotifyPlayer;

public class Player extends Activity implements
        SpotifyPlayer.NotificationCallback, ConnectionStateCallback

}
