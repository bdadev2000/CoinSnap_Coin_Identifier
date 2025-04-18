package eb;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y7.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17260b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f17261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f17262d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f17263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f17264g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ TimeUnit f17265h;

    public /* synthetic */ b(e eVar, Runnable runnable, long j3, long j10, TimeUnit timeUnit, int i10) {
        this.f17260b = i10;
        this.f17261c = eVar;
        this.f17262d = runnable;
        this.f17263f = j3;
        this.f17264g = j10;
        this.f17265h = timeUnit;
    }

    @Override // eb.f
    public final ScheduledFuture a(q qVar) {
        int i10 = this.f17260b;
        Runnable runnable = this.f17262d;
        e eVar = this.f17261c;
        switch (i10) {
            case 0:
                return eVar.f17274c.scheduleWithFixedDelay(new c(eVar, runnable, qVar, 1), this.f17263f, this.f17264g, this.f17265h);
            default:
                return eVar.f17274c.scheduleAtFixedRate(new c(eVar, runnable, qVar, 0), this.f17263f, this.f17264g, this.f17265h);
        }
    }
}
