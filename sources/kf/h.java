package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class h extends g {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f20774v;
    public long u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20774v = sparseIntArray;
        sparseIntArray.put(R.id.icClose, 1);
        sparseIntArray.put(R.id.containerHealthyImg, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = kf.h.f20774v
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r6, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            androidx.cardview.widget.CardView r1 = (androidx.cardview.widget.CardView) r1
            r1 = 1
            r1 = r0[r1]
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5.<init>(r2, r6, r1)
            r3 = -1
            r5.u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r6.setTag(r0, r5)
            r5.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.h.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.u = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.u != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.u = 1L;
        }
        L();
    }
}
