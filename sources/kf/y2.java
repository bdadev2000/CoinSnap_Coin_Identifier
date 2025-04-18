package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class y2 extends x2 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f20936y;

    /* renamed from: x, reason: collision with root package name */
    public long f20937x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20936y = sparseIntArray;
        sparseIntArray.put(R.id.plant_img, 1);
        sparseIntArray.put(R.id.tvPlantName, 2);
        sparseIntArray.put(R.id.icTrash, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y2(android.view.View r9) {
        /*
            r8 = this;
            r6 = 0
            android.util.SparseIntArray r0 = kf.y2.f20936y
            r1 = 4
            r7 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r9, r1, r7, r0)
            r1 = 3
            r1 = r0[r1]
            r2 = r1
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1 = 0
            r1 = r0[r1]
            r4 = r1
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r1 = 1
            r1 = r0[r1]
            r5 = r1
            com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
            r1 = 2
            r0 = r0[r1]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f20937x = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.u
            r0.setTag(r7)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r9.setTag(r0, r8)
            r8.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20937x = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20937x != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20937x = 1L;
        }
        L();
    }
}
