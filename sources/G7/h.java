package G7;

import t7.InterfaceC2714c;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class h extends c implements g, M7.a, InterfaceC2714c {

    /* renamed from: i, reason: collision with root package name */
    public final int f1330i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1331j;

    public h(int i9, int i10, Class cls, String str, String str2) {
        this(i9, b.b, cls, str, str2, i10);
    }

    @Override // G7.c
    public final M7.a a() {
        s.f1335a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f1324f.equals(hVar.f1324f) && this.f1325g.equals(hVar.f1325g) && this.f1331j == hVar.f1331j && this.f1330i == hVar.f1330i && j.a(this.f1322c, hVar.f1322c) && j.a(c(), hVar.c())) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        M7.a aVar = this.b;
        if (aVar == null) {
            a();
            this.b = this;
            aVar = this;
        }
        return obj.equals(aVar);
    }

    @Override // G7.g
    public final int getArity() {
        return this.f1330i;
    }

    public final int hashCode() {
        int hashCode;
        if (c() == null) {
            hashCode = 0;
        } else {
            hashCode = c().hashCode() * 31;
        }
        return this.f1325g.hashCode() + AbstractC2914a.b(hashCode, 31, this.f1324f);
    }

    public final String toString() {
        M7.a aVar = this.b;
        if (aVar == null) {
            a();
            this.b = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f1324f;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return AbstractC2914a.e("function ", str, " (Kotlin reflection is not available)");
    }

    public h(int i9, Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f1330i = i9;
        this.f1331j = 0;
    }
}
