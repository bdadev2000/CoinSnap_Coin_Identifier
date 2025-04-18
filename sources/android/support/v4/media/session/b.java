package android.support.v4.media.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
public abstract class b extends Binder implements c {
    /* JADX WARN: Type inference failed for: r0v2, types: [android.support.v4.media.session.c, android.support.v4.media.session.a, java.lang.Object] */
    public static c R(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
            return (c) queryLocalInterface;
        }
        ?? obj = new Object();
        obj.f125a = iBinder;
        return obj;
    }
}
