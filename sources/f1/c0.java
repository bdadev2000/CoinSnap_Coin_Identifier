package f1;

import e1.g1;
import e1.s0;

/* loaded from: classes3.dex */
public final class c0 extends s0 implements g1 {
    @Override // e1.g1
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.f30337i;
            p0.a.p(objArr);
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.f30338j + ((int) ((m() + this.f30340l) - this.f30338j))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void u(int i2) {
        synchronized (this) {
            Object[] objArr = this.f30337i;
            p0.a.p(objArr);
            b(Integer.valueOf(((Number) objArr[((int) ((this.f30338j + ((int) ((m() + this.f30340l) - this.f30338j))) - 1)) & (objArr.length - 1)]).intValue() + i2));
        }
    }
}
