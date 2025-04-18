package ra;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class q implements p, Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final p f24067b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f24068c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f24069d;

    public q(p pVar) {
        this.f24067b = pVar;
    }

    @Override // ra.p
    public final Object get() {
        if (!this.f24068c) {
            synchronized (this) {
                if (!this.f24068c) {
                    Object obj = this.f24067b.get();
                    this.f24069d = obj;
                    this.f24068c = true;
                    return obj;
                }
            }
        }
        return this.f24069d;
    }

    public final String toString() {
        Object obj;
        if (this.f24068c) {
            String valueOf = String.valueOf(this.f24069d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        } else {
            obj = this.f24067b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
