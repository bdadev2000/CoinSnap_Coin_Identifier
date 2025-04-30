package X7;

import Q7.AbstractC0255x;
import androidx.work.o;

/* loaded from: classes3.dex */
public final class j extends i {

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f3734d;

    public j(Runnable runnable, long j7, o oVar) {
        super(j7, oVar);
        this.f3734d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f3734d.run();
        } finally {
            this.f3733c.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f3734d;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0255x.g(runnable));
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.f3733c);
        sb.append(']');
        return sb.toString();
    }
}
