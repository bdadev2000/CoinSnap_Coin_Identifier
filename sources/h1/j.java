package h1;

import b1.f0;

/* loaded from: classes3.dex */
public final class j extends h {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f30753c;

    public j(Runnable runnable, long j2, i iVar) {
        super(j2, iVar);
        this.f30753c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f30753c.run();
        } finally {
            this.f30751b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f30753c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(f0.o(runnable));
        sb.append(", ");
        sb.append(this.f30750a);
        sb.append(", ");
        sb.append(this.f30751b);
        sb.append(']');
        return sb.toString();
    }
}
