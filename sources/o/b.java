package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f22906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f22907d;

    public /* synthetic */ b(g gVar, Bundle bundle, int i10) {
        this.f22905b = i10;
        this.f22907d = gVar;
        this.f22906c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22905b;
        Bundle bundle = this.f22906c;
        g gVar = this.f22907d;
        switch (i10) {
            case 0:
                gVar.f22930c.onUnminimized(bundle);
                return;
            case 1:
                gVar.f22930c.onMessageChannelReady(bundle);
                return;
            case 2:
                gVar.f22930c.onWarmupCompleted(bundle);
                return;
            default:
                gVar.f22930c.onMinimized(bundle);
                return;
        }
    }
}
