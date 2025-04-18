package w7;

import android.text.TextUtils;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public final class k {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f26897b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f26898c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26899d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26900e;

    public k(String str, r0 r0Var, r0 r0Var2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        u0.d(z10);
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            r0Var.getClass();
            this.f26897b = r0Var;
            r0Var2.getClass();
            this.f26898c = r0Var2;
            this.f26899d = i10;
            this.f26900e = i11;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f26899d == kVar.f26899d && this.f26900e == kVar.f26900e && this.a.equals(kVar.a) && this.f26897b.equals(kVar.f26897b) && this.f26898c.equals(kVar.f26898c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26898c.hashCode() + ((this.f26897b.hashCode() + vd.e.c(this.a, (((this.f26899d + 527) * 31) + this.f26900e) * 31, 31)) * 31);
    }
}
