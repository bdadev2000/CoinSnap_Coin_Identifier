package t0;

import androidx.fragment.app.q0;
import androidx.lifecycle.b0;
import com.mbridge.msdk.foundation.entity.o;
import x.m;

/* renamed from: t0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2704b extends b0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f23000c = new q0(1);
    public final m b = new m();

    @Override // androidx.lifecycle.b0
    public final void d() {
        m mVar = this.b;
        int i9 = mVar.f24089d;
        if (i9 <= 0) {
            Object[] objArr = mVar.f24088c;
            for (int i10 = 0; i10 < i9; i10++) {
                objArr[i10] = null;
            }
            mVar.f24089d = 0;
            return;
        }
        o.v(mVar.f24088c[0]);
        throw null;
    }
}
