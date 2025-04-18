package androidx.media;

import android.graphics.drawable.AnimatedImageDrawable;
import android.media.session.MediaSessionManager;
import android.webkit.TracingConfig;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean B(Object obj) {
        return obj instanceof AnimatedImageDrawable;
    }

    public static /* synthetic */ MediaSessionManager.RemoteUserInfo f(String str, int i2) {
        return new MediaSessionManager.RemoteUserInfo(str, -1, i2);
    }

    public static /* synthetic */ TracingConfig.Builder i() {
        return new TracingConfig.Builder();
    }
}
