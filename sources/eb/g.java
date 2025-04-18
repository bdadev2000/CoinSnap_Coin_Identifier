package eb;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import y7.q;

/* loaded from: classes3.dex */
public final class g extends s.i implements ScheduledFuture {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f17275k = 0;

    /* renamed from: j, reason: collision with root package name */
    public final ScheduledFuture f17276j;

    public g(f fVar) {
        this.f17276j = fVar.a(new q(this));
    }

    @Override // s.i
    public final void b() {
        boolean z10;
        ScheduledFuture scheduledFuture = this.f17276j;
        Object obj = this.f24143b;
        if ((obj instanceof s.b) && ((s.b) obj).a) {
            z10 = true;
        } else {
            z10 = false;
        }
        scheduledFuture.cancel(z10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f17276j.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f17276j.getDelay(timeUnit);
    }
}
