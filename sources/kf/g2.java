package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class g2 extends f2 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f20770w;

    /* renamed from: v, reason: collision with root package name */
    public long f20771v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20770w = sparseIntArray;
        sparseIntArray.put(R.id.indicator, 1);
        sparseIntArray.put(R.id.indicatorSupported, 2);
        sparseIntArray.put(R.id.tvDiseaseName, 3);
        sparseIntArray.put(R.id.tvDiseaseNameSupported, 4);
        sparseIntArray.put(R.id.tvDescription, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g2(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = kf.g2.f20770w
            r1 = 6
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r6, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 2
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r3 = 3
            r3 = r0[r3]
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 4
            r4 = r0[r4]
            android.widget.TextView r4 = (android.widget.TextView) r4
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f20771v = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r6.setTag(r0, r5)
            r5.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20771v = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20771v != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20771v = 1L;
        }
        L();
    }
}
