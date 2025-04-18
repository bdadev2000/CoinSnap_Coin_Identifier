package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class b extends a {
    public static final h.c C;
    public static final SparseIntArray D;
    public long B;

    static {
        h.c cVar = new h.c(13);
        C = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_small}, new String[]{"ads_shimmer_native_small"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.icClose, 3);
        sparseIntArray.put(R.id.vpgListImage, 4);
        sparseIntArray.put(R.id.indicatorContainer, 5);
        sparseIntArray.put(R.id.containerInfo, 6);
        sparseIntArray.put(R.id.tvPlantName, 7);
        sparseIntArray.put(R.id.tvDescriptionTitle, 8);
        sparseIntArray.put(R.id.tvDescriptionValue, 9);
        sparseIntArray.put(R.id.tvTreatment, 10);
        sparseIntArray.put(R.id.tvTreatmentValue, 11);
        sparseIntArray.put(R.id.relay_ads, 12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.view.View r13) {
        /*
            r12 = this;
            r1 = 0
            h.c r0 = kf.b.C
            android.util.SparseIntArray r2 = kf.b.D
            r3 = 13
            java.lang.Object[] r11 = androidx.databinding.e.K(r13, r3, r0, r2)
            r0 = 6
            r0 = r11[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 1
            r0 = r11[r0]
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 3
            r0 = r11[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 5
            r0 = r11[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 2
            r0 = r11[r0]
            r6 = r0
            kf.y0 r6 = (kf.y0) r6
            r0 = 12
            r0 = r11[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0 = 8
            r0 = r11[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 9
            r0 = r11[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = 7
            r0 = r11[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 10
            r0 = r11[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 11
            r0 = r11[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 4
            r0 = r11[r0]
            r10 = r0
            androidx.viewpager2.widget.ViewPager2 r10 = (androidx.viewpager2.widget.ViewPager2) r10
            r0 = r12
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = -1
            r12.B = r0
            android.widget.FrameLayout r0 = r12.f20685t
            r1 = 0
            r0.setTag(r1)
            kf.y0 r0 = r12.f20687w
            if (r0 == 0) goto L69
            r0.f1327n = r12
        L69:
            r0 = 0
            r0 = r11[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r13.setTag(r0, r12)
            r12.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.b.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.B = 0L;
        }
        this.f20687w.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            if (this.f20687w.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.B = 2L;
        }
        this.f20687w.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20687w.M(vVar);
    }
}
