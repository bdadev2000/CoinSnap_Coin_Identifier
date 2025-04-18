package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class w1 extends v1 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f20917z;

    /* renamed from: y, reason: collision with root package name */
    public long f20918y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20917z = sparseIntArray;
        sparseIntArray.put(R.id.imgVip, 1);
        sparseIntArray.put(R.id.tvDescription, 2);
        sparseIntArray.put(R.id.viewCenterSupported, 3);
        sparseIntArray.put(R.id.btnWatchAds, 4);
        sparseIntArray.put(R.id.btnUpgrade, 5);
        sparseIntArray.put(R.id.tvMaybeLater, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w1(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.w1.f20917z
            r2 = 7
            r8 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r10, r2, r8, r0)
            r2 = 5
            r2 = r0[r2]
            r3 = r2
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2 = 4
            r2 = r0[r2]
            r4 = r2
            android.widget.TextView r4 = (android.widget.TextView) r4
            r2 = 1
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2 = 0
            r2 = r0[r2]
            r5 = r2
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            r2 = 2
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 6
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 3
            r0 = r0[r2]
            r7 = r0
            android.view.View r7 = (android.view.View) r7
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.f20918y = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r9.f20903v
            r0.setTag(r8)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r10.setTag(r0, r9)
            r9.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.w1.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20918y = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20918y != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20918y = 1L;
        }
        L();
    }
}
