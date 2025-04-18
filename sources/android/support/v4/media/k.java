package android.support.v4.media;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Messenger f97a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f98b;

    public k(IBinder iBinder, Bundle bundle) {
        this.f97a = new Messenger(iBinder);
        this.f98b = bundle;
    }

    public final void a(int i2, Bundle bundle, Messenger messenger) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.arg1 = 1;
        obtain.setData(bundle);
        obtain.replyTo = messenger;
        this.f97a.send(obtain);
    }
}
