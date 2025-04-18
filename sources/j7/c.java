package j7;

import android.content.Context;

/* loaded from: classes3.dex */
public final class c extends d {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final q7.a f19774b;

    /* renamed from: c, reason: collision with root package name */
    public final q7.a f19775c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19776d;

    public c(Context context, q7.a aVar, q7.a aVar2, String str) {
        if (context != null) {
            this.a = context;
            if (aVar != null) {
                this.f19774b = aVar;
                if (aVar2 != null) {
                    this.f19775c = aVar2;
                    if (str != null) {
                        this.f19776d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a.equals(((c) dVar).a)) {
            c cVar = (c) dVar;
            if (this.f19774b.equals(cVar.f19774b) && this.f19775c.equals(cVar.f19775c) && this.f19776d.equals(cVar.f19776d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f19774b.hashCode()) * 1000003) ^ this.f19775c.hashCode()) * 1000003) ^ this.f19776d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.a);
        sb2.append(", wallClock=");
        sb2.append(this.f19774b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f19775c);
        sb2.append(", backendName=");
        return vd.e.h(sb2, this.f19776d, "}");
    }
}
