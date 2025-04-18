package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class r0 extends q0 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.layoutSettingTop, 1);
        sparseIntArray.put(R.id.icBack, 2);
        sparseIntArray.put(R.id.btnPremium, 3);
        sparseIntArray.put(R.id.tvPremium, 4);
        sparseIntArray.put(R.id.btnLanguage, 5);
        sparseIntArray.put(R.id.btnHistory, 6);
        sparseIntArray.put(R.id.btnRateApp, 7);
        sparseIntArray.put(R.id.btnShare, 8);
        sparseIntArray.put(R.id.btnPolicy, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r0(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.r0.B
            r2 = 10
            r10 = 0
            java.lang.Object[] r11 = androidx.databinding.e.K(r13, r2, r10, r0)
            r0 = 6
            r0 = r11[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 5
            r0 = r11[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 9
            r0 = r11[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 3
            r0 = r11[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 7
            r0 = r11[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 8
            r0 = r11[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 2
            r0 = r11[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 1
            r0 = r11[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 4
            r0 = r11[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r12.A = r0
            r0 = 0
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r10)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r13.setTag(r0, r12)
            r12.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.r0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.A = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.A = 1L;
        }
        L();
    }
}
