package c4;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class g implements e {
    public volatile e b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5412c;

    /* renamed from: d, reason: collision with root package name */
    public Object f5413d;

    @Override // c4.e
    public final Object get() {
        if (!this.f5412c) {
            synchronized (this) {
                try {
                    if (!this.f5412c) {
                        e eVar = this.b;
                        Objects.requireNonNull(eVar);
                        Object obj = eVar.get();
                        this.f5413d = obj;
                        this.f5412c = true;
                        this.b = null;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.f5413d;
    }

    public final String toString() {
        Object obj = this.b;
        if (obj == null) {
            String valueOf = String.valueOf(this.f5413d);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
