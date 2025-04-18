package m7;

import android.content.Context;
import java.util.concurrent.Executor;
import n7.k;
import n7.l;

/* loaded from: classes3.dex */
public final class d implements k7.b {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final rh.a f21635b;

    /* renamed from: c, reason: collision with root package name */
    public final rh.a f21636c;

    /* renamed from: d, reason: collision with root package name */
    public final rh.a f21637d;

    /* renamed from: e, reason: collision with root package name */
    public final rh.a f21638e;

    public /* synthetic */ d(rh.a aVar, rh.a aVar2, k7.b bVar, rh.a aVar3, int i10) {
        this.a = i10;
        this.f21635b = aVar;
        this.f21636c = aVar2;
        this.f21637d = bVar;
        this.f21638e = aVar3;
    }

    @Override // rh.a
    public final Object get() {
        int i10 = this.a;
        rh.a aVar = this.f21638e;
        rh.a aVar2 = this.f21637d;
        rh.a aVar3 = this.f21636c;
        rh.a aVar4 = this.f21635b;
        switch (i10) {
            case 0:
                Context context = (Context) aVar4.get();
                o7.d dVar = (o7.d) aVar3.get();
                n7.a aVar5 = (n7.a) aVar2.get();
                return new n7.c(context, dVar, aVar5);
            default:
                return new k((Executor) aVar4.get(), (o7.d) aVar3.get(), (l) aVar2.get(), (p7.c) aVar.get());
        }
    }
}
