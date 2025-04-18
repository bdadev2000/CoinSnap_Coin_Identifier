package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class b0 extends a0 {
    public static final h.c J;
    public static final SparseIntArray K;
    public long I;

    static {
        h.c cVar = new h.c(16);
        J = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_large}, new String[]{"ads_shimmer_native_large"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.view_pager2, 3);
        sparseIntArray.put(R.id.ll_circle, 4);
        sparseIntArray.put(R.id.view_1, 5);
        sparseIntArray.put(R.id.view_2, 6);
        sparseIntArray.put(R.id.view_3, 7);
        sparseIntArray.put(R.id.view_4, 8);
        sparseIntArray.put(R.id.tv_get_start, 9);
        sparseIntArray.put(R.id.ll_center, 10);
        sparseIntArray.put(R.id.view_center_1, 11);
        sparseIntArray.put(R.id.view_center_2, 12);
        sparseIntArray.put(R.id.view_center_3, 13);
        sparseIntArray.put(R.id.view_center_4, 14);
        sparseIntArray.put(R.id.tv_get_start_center, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b0(android.view.View r20) {
        /*
            r19 = this;
            r15 = r19
            r14 = r20
            r0 = r19
            r2 = r20
            r1 = 0
            h.c r3 = kf.b0.J
            android.util.SparseIntArray r4 = kf.b0.K
            r5 = 16
            java.lang.Object[] r18 = androidx.databinding.e.K(r14, r5, r3, r4)
            r3 = 1
            r3 = r18[r3]
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r4 = 10
            r4 = r18[r4]
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5 = 4
            r5 = r18[r5]
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2
            r6 = r18[r6]
            kf.u0 r6 = (kf.u0) r6
            r7 = 9
            r7 = r18[r7]
            android.widget.TextView r7 = (android.widget.TextView) r7
            r8 = 15
            r8 = r18[r8]
            android.widget.TextView r8 = (android.widget.TextView) r8
            r9 = 5
            r9 = r18[r9]
            androidx.appcompat.widget.AppCompatImageView r9 = (androidx.appcompat.widget.AppCompatImageView) r9
            r10 = 6
            r10 = r18[r10]
            androidx.appcompat.widget.AppCompatImageView r10 = (androidx.appcompat.widget.AppCompatImageView) r10
            r11 = 7
            r11 = r18[r11]
            androidx.appcompat.widget.AppCompatImageView r11 = (androidx.appcompat.widget.AppCompatImageView) r11
            r12 = 8
            r12 = r18[r12]
            androidx.appcompat.widget.AppCompatImageView r12 = (androidx.appcompat.widget.AppCompatImageView) r12
            r13 = 11
            r13 = r18[r13]
            androidx.appcompat.widget.AppCompatImageView r13 = (androidx.appcompat.widget.AppCompatImageView) r13
            r16 = 12
            r16 = r18[r16]
            androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
            r14 = r16
            r16 = 13
            r16 = r18[r16]
            androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
            r15 = r16
            r16 = 14
            r16 = r18[r16]
            androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
            r17 = 3
            r17 = r18[r17]
            androidx.viewpager2.widget.ViewPager2 r17 = (androidx.viewpager2.widget.ViewPager2) r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = -1
            r2 = r19
            r2.I = r0
            android.widget.FrameLayout r0 = r2.f20691t
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r18[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            kf.u0 r0 = r2.f20693w
            if (r0 == 0) goto L88
            r0.f1327n = r2
        L88:
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r1 = r20
            r1.setTag(r0, r2)
            r19.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.b0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.I = 0L;
        }
        this.f20693w.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            if (this.f20693w.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.I = 2L;
        }
        this.f20693w.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20693w.M(vVar);
    }
}
