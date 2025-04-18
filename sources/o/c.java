package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22908b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22909c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Bundle f22910d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f22911f;

    public /* synthetic */ c(g gVar, String str, Bundle bundle, int i10) {
        this.f22908b = i10;
        this.f22911f = gVar;
        this.f22909c = str;
        this.f22910d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22908b;
        Bundle bundle = this.f22910d;
        String str = this.f22909c;
        g gVar = this.f22911f;
        switch (i10) {
            case 0:
                gVar.f22930c.extraCallback(str, bundle);
                return;
            default:
                gVar.f22930c.onPostMessage(str, bundle);
                return;
        }
    }
}
