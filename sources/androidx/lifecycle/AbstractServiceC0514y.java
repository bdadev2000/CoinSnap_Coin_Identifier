package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC0514y extends Service implements InterfaceC0511v {
    public final C.c b = new C.c(this);

    @Override // androidx.lifecycle.InterfaceC0511v
    public final AbstractC0505o getLifecycle() {
        return (C0513x) this.b.f347c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        G7.j.e(intent, "intent");
        this.b.x(EnumC0503m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.b.x(EnumC0503m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0503m enumC0503m = EnumC0503m.ON_STOP;
        C.c cVar = this.b;
        cVar.x(enumC0503m);
        cVar.x(EnumC0503m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i9) {
        this.b.x(EnumC0503m.ON_START);
        super.onStart(intent, i9);
    }
}
