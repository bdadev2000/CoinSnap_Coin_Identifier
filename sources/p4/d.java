package p4;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C2426o;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements g {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f22227c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f22228d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f22229f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f22230g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f22231h;

    public /* synthetic */ d(f fVar, Runnable runnable, long j7, long j9, TimeUnit timeUnit, int i9) {
        this.b = i9;
        this.f22227c = fVar;
        this.f22228d = runnable;
        this.f22229f = j7;
        this.f22230g = j9;
        this.f22231h = timeUnit;
    }

    @Override // p4.g
    public final ScheduledFuture a(C2426o c2426o) {
        switch (this.b) {
            case 0:
                f fVar = this.f22227c;
                fVar.getClass();
                return fVar.f22235c.scheduleAtFixedRate(new e(fVar, this.f22228d, c2426o, 0), this.f22229f, this.f22230g, this.f22231h);
            default:
                f fVar2 = this.f22227c;
                fVar2.getClass();
                return fVar2.f22235c.scheduleWithFixedDelay(new e(fVar2, this.f22228d, c2426o, 2), this.f22229f, this.f22230g, this.f22231h);
        }
    }
}
