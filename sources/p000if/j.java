package p000if;

import dagger.hilt.android.internal.managers.g;
import f3.a;
import ph.b;
import y7.q;

/* loaded from: classes4.dex */
public abstract class j extends a implements b {

    /* renamed from: c, reason: collision with root package name */
    public boolean f19644c = false;

    /* renamed from: d, reason: collision with root package name */
    public final g f19645d = new g(new q((Object) this));

    @Override // ph.b
    public final Object d() {
        return this.f19645d.d();
    }

    @Override // f3.a, android.app.Application
    public void onCreate() {
        if (!this.f19644c) {
            this.f19644c = true;
            ((i) d()).getClass();
        }
        super.onCreate();
    }
}
