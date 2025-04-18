package n7;

import com.applovin.impl.av;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import mb.p1;
import y7.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements p7.b, eb.f, cc.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22482c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22483d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22484f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22485g;

    public /* synthetic */ h(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f22481b = i10;
        this.f22483d = obj;
        this.f22484f = obj2;
        this.f22482c = j3;
        this.f22485g = obj3;
    }

    @Override // eb.f
    public final ScheduledFuture a(q qVar) {
        int i10 = this.f22481b;
        long j3 = this.f22482c;
        int i11 = 2;
        Object obj = this.f22485g;
        Object obj2 = this.f22484f;
        Object obj3 = this.f22483d;
        switch (i10) {
            case 1:
                eb.e eVar = (eb.e) obj3;
                eVar.getClass();
                m3.k kVar = new m3.k(i11, eVar, (Callable) obj2, qVar);
                return eVar.f17274c.schedule(kVar, j3, (TimeUnit) obj);
            default:
                eb.e eVar2 = (eb.e) obj3;
                eVar2.getClass();
                eb.c cVar = new eb.c(eVar2, (Runnable) obj2, qVar, i11);
                return eVar2.f17274c.schedule(cVar, j3, (TimeUnit) obj);
        }
    }

    @Override // p7.b
    public final Object execute() {
        i iVar = (i) this.f22483d;
        Iterable iterable = (Iterable) this.f22484f;
        i7.i iVar2 = (i7.i) this.f22485g;
        o7.j jVar = (o7.j) iVar.f22487c;
        jVar.getClass();
        if (iterable.iterator().hasNext()) {
            jVar.j(new f2.i(4, jVar, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + o7.j.r(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
        jVar.j(new av(((q7.b) iVar.f22491g).a() + this.f22482c, iVar2));
        return null;
    }

    @Override // cc.a
    public final void h(cc.c cVar) {
        ((gb.b) ((gb.a) cVar.get())).d((String) this.f22483d, (String) this.f22484f, this.f22482c, (p1) this.f22485g);
    }

    public /* synthetic */ h(i iVar, Iterable iterable, i7.i iVar2, long j3) {
        this.f22481b = 0;
        this.f22483d = iVar;
        this.f22484f = iterable;
        this.f22485g = iVar2;
        this.f22482c = j3;
    }
}
