package kf;

import android.util.SparseIntArray;
import android.widget.FrameLayout;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class i2 extends h2 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f20790w;
    public final FrameLayout u;

    /* renamed from: v, reason: collision with root package name */
    public long f20791v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20790w = sparseIntArray;
        sparseIntArray.put(R.id.tvCommonNameValue, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i2(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = kf.i2.f20790w
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.f20791v = r3
            r1 = 0
            r0 = r0[r1]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.u = r0
            r0.setTag(r2)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r6.setTag(r0, r5)
            r5.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.i2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20791v = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20791v != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20791v = 1L;
        }
        L();
    }
}
