package p4;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import k.C2426o;
import y.C2934b;

/* loaded from: classes2.dex */
public final class h extends y.h implements ScheduledFuture {

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledFuture f22236j;

    public h(g gVar) {
        this.f22236j = gVar.a(new C2426o(this, 3));
    }

    @Override // y.h
    public final void b() {
        boolean z8;
        ScheduledFuture scheduledFuture = this.f22236j;
        Object obj = this.b;
        if ((obj instanceof C2934b) && ((C2934b) obj).f24253a) {
            z8 = true;
        } else {
            z8 = false;
        }
        scheduledFuture.cancel(z8);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f22236j.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f22236j.getDelay(timeUnit);
    }
}
