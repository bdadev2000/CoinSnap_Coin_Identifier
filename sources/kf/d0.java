package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class d0 extends c0 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.icClose, 2);
        sparseIntArray.put(R.id.vpgListImage, 3);
        sparseIntArray.put(R.id.indicatorContainer, 4);
        sparseIntArray.put(R.id.containerInfo, 5);
        sparseIntArray.put(R.id.tvDisease, 6);
        sparseIntArray.put(R.id.tvSymptoms, 7);
        sparseIntArray.put(R.id.tvCause, 8);
        sparseIntArray.put(R.id.tvManagement, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d0(android.view.View r14) {
        /*
            r13 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.d0.C
            r2 = 10
            r11 = 0
            java.lang.Object[] r12 = androidx.databinding.e.K(r14, r2, r11, r0)
            r0 = 5
            r0 = r12[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 1
            r0 = r12[r0]
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 2
            r0 = r12[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r12[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 8
            r0 = r12[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 6
            r0 = r12[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 9
            r0 = r12[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 7
            r0 = r12[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 3
            r0 = r12[r0]
            r10 = r0
            androidx.viewpager2.widget.ViewPager2 r10 = (androidx.viewpager2.widget.ViewPager2) r10
            r0 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r13.B = r0
            android.widget.FrameLayout r0 = r13.f20716t
            r0.setTag(r11)
            r0 = 0
            r0 = r12[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r11)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r14.setTag(r0, r13)
            r13.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.d0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.B = 1L;
        }
        L();
    }
}
