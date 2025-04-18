package i7;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class s implements k7.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.a f19197b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.a f19198c;

    /* renamed from: d, reason: collision with root package name */
    public final rh.a f19199d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.a f19200e;

    /* renamed from: f, reason: collision with root package name */
    public final rh.a f19201f;

    public /* synthetic */ s(rh.a aVar, rh.a aVar2, k7.b bVar, rh.a aVar3, rh.a aVar4, int i10) {
        this.a = i10;
        this.f19197b = aVar;
        this.f19198c = aVar2;
        this.f19199d = bVar;
        this.f19200e = aVar3;
        this.f19201f = aVar4;
    }

    @Override // rh.a
    public final Object get() {
        int i10 = this.a;
        rh.a aVar = this.f19201f;
        rh.a aVar2 = this.f19200e;
        rh.a aVar3 = this.f19199d;
        rh.a aVar4 = this.f19198c;
        rh.a aVar5 = this.f19197b;
        switch (i10) {
            case 0:
                return new r((q7.a) aVar5.get(), (q7.a) aVar4.get(), (m7.b) aVar3.get(), (n7.i) aVar2.get(), (n7.k) aVar.get());
            case 1:
                return new m7.a((Executor) aVar5.get(), (j7.g) aVar4.get(), (n7.l) aVar3.get(), (o7.d) aVar2.get(), (p7.c) aVar.get());
            default:
                q7.a aVar6 = (q7.a) aVar5.get();
                q7.a aVar7 = (q7.a) aVar4.get();
                Object obj = aVar3.get();
                return new o7.j(aVar6, aVar7, (o7.a) obj, (o7.m) aVar2.get(), this.f19201f);
        }
    }
}
