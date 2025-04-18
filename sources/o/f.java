package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22923c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22924d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22926g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Bundle f22927h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f22928i;

    public f(g gVar, int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
        this.f22928i = gVar;
        this.f22922b = i10;
        this.f22923c = i11;
        this.f22924d = i12;
        this.f22925f = i13;
        this.f22926g = i14;
        this.f22927h = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22928i.f22930c.onActivityLayout(this.f22922b, this.f22923c, this.f22924d, this.f22925f, this.f22926g, this.f22927h);
    }
}
