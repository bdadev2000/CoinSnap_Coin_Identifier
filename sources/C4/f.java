package c4;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class f implements e, Serializable {
    private static final long serialVersionUID = 0;
    public final e b;

    /* renamed from: c, reason: collision with root package name */
    public volatile transient boolean f5410c;

    /* renamed from: d, reason: collision with root package name */
    public transient Object f5411d;

    public f(e eVar) {
        this.b = eVar;
    }

    @Override // c4.e
    public final Object get() {
        if (!this.f5410c) {
            synchronized (this) {
                try {
                    if (!this.f5410c) {
                        Object obj = this.b.get();
                        this.f5411d = obj;
                        this.f5410c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f5411d;
    }

    public final String toString() {
        Object obj;
        if (this.f5410c) {
            String valueOf = String.valueOf(this.f5411d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.b;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
