package androidx.core.app;

import android.app.NotificationChannel;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Window;
import com.applovin.impl.adview.AppLovinVideoView;

/* loaded from: classes.dex */
public abstract /* synthetic */ class f1 {
    public static /* bridge */ /* synthetic */ boolean B(Configuration configuration) {
        return configuration.isScreenHdr();
    }

    public static /* bridge */ /* synthetic */ int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        return audioManager.requestAudioFocus(audioFocusRequest);
    }

    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("warning_ads", "Warning Ads", 2);
    }

    public static /* synthetic */ AudioFocusRequest.Builder f(int i10) {
        return new AudioFocusRequest.Builder(i10);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder g(AudioFocusRequest.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAudioAttributes(audioAttributes);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder h(AudioFocusRequest.Builder builder, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        return builder.setOnAudioFocusChangeListener(onAudioFocusChangeListener);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest.Builder i(AudioFocusRequest.Builder builder, boolean z10) {
        return builder.setWillPauseWhenDucked(z10);
    }

    public static /* synthetic */ AudioFocusRequest.Builder j(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ AudioFocusRequest k(AudioFocusRequest.Builder builder) {
        return builder.build();
    }

    public static /* synthetic */ void p() {
    }

    public static /* bridge */ /* synthetic */ void x(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static /* bridge */ /* synthetic */ void y(Window window, Rect rect, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
        PixelCopy.request(window, rect, bitmap, onPixelCopyFinishedListener, handler);
    }

    public static /* bridge */ /* synthetic */ void z(AppLovinVideoView appLovinVideoView, int i10) {
        appLovinVideoView.setAudioFocusRequest(i10);
    }
}
