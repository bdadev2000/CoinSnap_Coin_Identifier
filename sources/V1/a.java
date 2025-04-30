package V1;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.media.AudioFocusRequest;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ NotificationChannel c(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup d(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* synthetic */ AudioFocusRequest.Builder i(int i9) {
        return new AudioFocusRequest.Builder(i9);
    }

    public static /* synthetic */ AudioFocusRequest.Builder m(AudioFocusRequest audioFocusRequest) {
        return new AudioFocusRequest.Builder(audioFocusRequest);
    }

    public static /* synthetic */ void o() {
    }
}
