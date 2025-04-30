package M7;

import G7.j;
import G7.x;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2011c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final g f2012a;
    public final d b;

    static {
        new f(null, null);
    }

    public f(g gVar, x xVar) {
        boolean z8;
        String str;
        this.f2012a = gVar;
        this.b = xVar;
        if (gVar == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 == (xVar == null)) {
            return;
        }
        if (gVar == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + gVar + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f2012a == fVar.f2012a && j.a(this.b, fVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        g gVar = this.f2012a;
        if (gVar == null) {
            hashCode = 0;
        } else {
            hashCode = gVar.hashCode();
        }
        int i10 = hashCode * 31;
        d dVar = this.b;
        if (dVar != null) {
            i9 = dVar.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        int i9;
        g gVar = this.f2012a;
        if (gVar == null) {
            i9 = -1;
        } else {
            i9 = e.f2010a[gVar.ordinal()];
        }
        if (i9 != -1) {
            d dVar = this.b;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 3) {
                        return "out " + dVar;
                    }
                    throw new RuntimeException();
                }
                return "in " + dVar;
            }
            return String.valueOf(dVar);
        }
        return "*";
    }
}
