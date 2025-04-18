package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f102a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i2, Bundle bundle) {
        f fVar = (f) this.f102a.get();
        if (fVar == null || bundle == null) {
            return;
        }
        synchronized (fVar.f128b) {
            fVar.e.f107b = b.R(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
            MediaSessionCompat$Token mediaSessionCompat$Token = fVar.e;
            bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
            mediaSessionCompat$Token.getClass();
            fVar.a();
        }
    }
}
