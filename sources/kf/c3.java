package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class c3 extends b3 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f20724x;

    /* renamed from: w, reason: collision with root package name */
    public long f20725w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20724x = sparseIntArray;
        sparseIntArray.put(R.id.plant_disease_img, 1);
        sparseIntArray.put(R.id.tvDiseaseName, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c3(android.view.View r8) {
        /*
            r7 = this;
            r5 = 0
            android.util.SparseIntArray r0 = kf.c3.f20724x
            r1 = 3
            r6 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r8, r1, r6, r0)
            r1 = 0
            r1 = r0[r1]
            r3 = r1
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            r1 = 1
            r1 = r0[r1]
            r4 = r1
            com.google.android.material.imageview.ShapeableImageView r4 = (com.google.android.material.imageview.ShapeableImageView) r4
            r1 = 2
            r0 = r0[r1]
            r2 = r0
            android.widget.TextView r2 = (android.widget.TextView) r2
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f20725w = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.f20708t
            r0.setTag(r6)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r8.setTag(r0, r7)
            r7.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.c3.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20725w = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20725w != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20725w = 1L;
        }
        L();
    }
}
