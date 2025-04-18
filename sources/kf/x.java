package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class x extends w {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.icClose, 2);
        sparseIntArray.put(R.id.vpgListImage, 3);
        sparseIntArray.put(R.id.indicatorContainer, 4);
        sparseIntArray.put(R.id.containerInfo, 5);
        sparseIntArray.put(R.id.tvPlantName, 6);
        sparseIntArray.put(R.id.tvGenusTitle, 7);
        sparseIntArray.put(R.id.tvGenusValue, 8);
        sparseIntArray.put(R.id.tvFamilyTitle, 9);
        sparseIntArray.put(R.id.tvFamilyValue, 10);
        sparseIntArray.put(R.id.tvTreatmentTitle, 11);
        sparseIntArray.put(R.id.tvTreatmentValue, 12);
        sparseIntArray.put(R.id.tvCommonNameTitle, 13);
        sparseIntArray.put(R.id.rcvCommonName, 14);
        sparseIntArray.put(R.id.tvCommonDiseasesTitle, 15);
        sparseIntArray.put(R.id.rcvCommonDisease, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x(android.view.View r18) {
        /*
            r17 = this;
            r13 = r17
            r14 = r18
            r1 = 0
            android.util.SparseIntArray r0 = kf.x.E
            r2 = 17
            r15 = 0
            java.lang.Object[] r16 = androidx.databinding.e.K(r14, r2, r15, r0)
            r0 = 5
            r0 = r16[r0]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0 = 1
            r0 = r16[r0]
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 2
            r0 = r16[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 4
            r0 = r16[r0]
            r5 = r0
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r0 = 16
            r0 = r16[r0]
            r6 = r0
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 14
            r0 = r16[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = 15
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 13
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 9
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 10
            r0 = r16[r0]
            r8 = r0
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 7
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 8
            r0 = r16[r0]
            r9 = r0
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 6
            r0 = r16[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 11
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 12
            r0 = r16[r0]
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 3
            r0 = r16[r0]
            r12 = r0
            androidx.viewpager2.widget.ViewPager2 r12 = (androidx.viewpager2.widget.ViewPager2) r12
            r0 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0 = -1
            r13.D = r0
            android.widget.FrameLayout r0 = r13.f20909t
            r0.setTag(r15)
            r0 = 0
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r15)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r14.setTag(r0, r13)
            r17.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.x.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.D = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.D = 1L;
        }
        L();
    }
}
