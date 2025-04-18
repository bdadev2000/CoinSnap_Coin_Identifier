package ra;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class r implements p {

    /* renamed from: b, reason: collision with root package name */
    public volatile p f24070b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f24071c;

    /* renamed from: d, reason: collision with root package name */
    public Object f24072d;

    public r(p pVar) {
        this.f24070b = pVar;
    }

    @Override // ra.p
    public final Object get() {
        if (!this.f24071c) {
            synchronized (this) {
                if (!this.f24071c) {
                    p pVar = this.f24070b;
                    Objects.requireNonNull(pVar);
                    Object obj = pVar.get();
                    this.f24072d = obj;
                    this.f24071c = true;
                    this.f24070b = null;
                    return obj;
                }
            }
        }
        return this.f24072d;
    }

    public final String toString() {
        Object obj = this.f24070b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f24072d);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 25);
            sb2.append("<supplier that returned ");
            sb2.append(valueOf);
            sb2.append(">");
            obj = sb2.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb3 = new StringBuilder(valueOf2.length() + 19);
        sb3.append("Suppliers.memoize(");
        sb3.append(valueOf2);
        sb3.append(")");
        return sb3.toString();
    }
}
