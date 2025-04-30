package W4;

import O4.e;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import g4.C2296f;
import r7.InterfaceC2683c;
import s7.InterfaceC2701a;

/* loaded from: classes2.dex */
public final class d implements InterfaceC2683c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2701a f3613a;
    public final InterfaceC2701a b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2701a f3614c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2701a f3615d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2701a f3616e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2701a f3617f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC2701a f3618g;

    public d(Z4.a aVar, Z4.a aVar2, Z4.a aVar3, Z4.a aVar4, Z4.a aVar5, Z4.a aVar6, Z4.a aVar7) {
        this.f3613a = aVar;
        this.b = aVar2;
        this.f3614c = aVar3;
        this.f3615d = aVar4;
        this.f3616e = aVar5;
        this.f3617f = aVar6;
        this.f3618g = aVar7;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        return new b((C2296f) this.f3613a.get(), (N4.b) this.b.get(), (e) this.f3614c.get(), (N4.b) this.f3615d.get(), (RemoteConfigManager) this.f3616e.get(), (Y4.a) this.f3617f.get(), (SessionManager) this.f3618g.get());
    }
}
