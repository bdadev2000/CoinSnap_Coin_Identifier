package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class y extends Service implements v {

    /* renamed from: b, reason: collision with root package name */
    public final h.c f1841b = new h.c(this);

    @Override // androidx.lifecycle.v
    public final p getLifecycle() {
        return (x) this.f1841b.f18523c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        this.f1841b.E(n.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1841b.E(n.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        h.c cVar = this.f1841b;
        cVar.E(n.ON_STOP);
        cVar.E(n.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f1841b.E(n.ON_START);
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
