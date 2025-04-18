package z8;

import n9.h0;

/* loaded from: classes3.dex */
public final class f {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28617c;

    public f(String str, String str2, String str3) {
        this.a = str;
        this.f28616b = str2;
        this.f28617c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (h0.a(this.a, fVar.a) && h0.a(this.f28616b, fVar.f28616b) && h0.a(this.f28617c, fVar.f28617c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.a.hashCode() * 31;
        int i11 = 0;
        String str = this.f28616b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        String str2 = this.f28617c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }
}
