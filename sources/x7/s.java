package x7;

import android.os.Looper;
import com.facebook.ads.AdError;
import s7.r0;

/* loaded from: classes3.dex */
public final class s implements u {
    @Override // x7.u
    public final n a(q qVar, r0 r0Var) {
        if (r0Var.f24726q == null) {
            return null;
        }
        return new y(new m(new i0(), AdError.MEDIAVIEW_MISSING_ERROR_CODE));
    }

    @Override // x7.u
    public final int d(r0 r0Var) {
        return r0Var.f24726q != null ? 1 : 0;
    }

    @Override // x7.u
    public final void e(Looper looper, t7.x xVar) {
    }
}
