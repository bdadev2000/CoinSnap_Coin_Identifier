package G7;

import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class o extends c implements M7.c {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1334i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto L7
            r7 = r0
            goto L8
        L7:
            r7 = r1
        L8:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r8.f1334i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G7.o.<init>(java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public final M7.a d() {
        if (this.f1334i) {
            return this;
        }
        M7.a aVar = this.b;
        if (aVar == null) {
            M7.a a6 = a();
            this.b = a6;
            return a6;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (c().equals(oVar.c()) && this.f1324f.equals(oVar.f1324f) && this.f1325g.equals(oVar.f1325g) && j.a(this.f1322c, oVar.f1322c)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof M7.c)) {
            return false;
        }
        return obj.equals(d());
    }

    public final int hashCode() {
        return this.f1325g.hashCode() + AbstractC2914a.b(c().hashCode() * 31, 31, this.f1324f);
    }

    public final String toString() {
        M7.a d2 = d();
        if (d2 != this) {
            return d2.toString();
        }
        return AbstractC2914a.h(new StringBuilder("property "), this.f1324f, " (Kotlin reflection is not available)");
    }
}
