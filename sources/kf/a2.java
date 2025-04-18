package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class a2 extends z1 {
    public static final h.c F;
    public static final SparseIntArray G;
    public long E;

    static {
        h.c cVar = new h.c(14);
        F = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_small}, new String[]{"ads_shimmer_native_small"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.btnPlantIdentifier, 3);
        sparseIntArray.put(R.id.bgPlantIdentify, 4);
        sparseIntArray.put(R.id.imgPlantIdentify, 5);
        sparseIntArray.put(R.id.layoutCountScan, 6);
        sparseIntArray.put(R.id.tvCountLeft, 7);
        sparseIntArray.put(R.id.layoutTool1, 8);
        sparseIntArray.put(R.id.btnDiagnose, 9);
        sparseIntArray.put(R.id.btnLightMeter, 10);
        sparseIntArray.put(R.id.btnDiseases, 11);
        sparseIntArray.put(R.id.btnReminder, 12);
        sparseIntArray.put(R.id.relay_ads, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a2(android.view.View r18) {
        /*
            r17 = this;
            r14 = r17
            r15 = r18
            r1 = 0
            h.c r0 = kf.a2.F
            android.util.SparseIntArray r2 = kf.a2.G
            r3 = 14
            java.lang.Object[] r16 = androidx.databinding.e.K(r15, r3, r0, r2)
            r0 = 4
            r0 = r16[r0]
            r3 = r0
            com.makeramen.roundedimageview.RoundedImageView r3 = (com.makeramen.roundedimageview.RoundedImageView) r3
            r0 = 9
            r0 = r16[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 11
            r0 = r16[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 10
            r0 = r16[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 3
            r0 = r16[r0]
            r7 = r0
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r0 = 12
            r0 = r16[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 1
            r0 = r16[r0]
            r9 = r0
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r0 = 5
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 6
            r0 = r16[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 2
            r0 = r16[r0]
            r11 = r0
            kf.y0 r11 = (kf.y0) r11
            r0 = 8
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 13
            r0 = r16[r0]
            r12 = r0
            android.widget.RelativeLayout r12 = (android.widget.RelativeLayout) r12
            r0 = 7
            r0 = r16[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.E = r0
            android.widget.FrameLayout r0 = r14.f20946z
            r1 = 0
            r0.setTag(r1)
            kf.y0 r0 = r14.B
            if (r0 == 0) goto L78
            r0.f1327n = r14
        L78:
            r0 = 0
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r15.setTag(r0, r14)
            r17.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.a2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.E = 0L;
        }
        this.B.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.E != 0) {
                return true;
            }
            if (this.B.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.E = 2L;
        }
        this.B.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.B.M(vVar);
    }
}
