package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class z extends y {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f20938y;

    /* renamed from: x, reason: collision with root package name */
    public long f20939x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20938y = sparseIntArray;
        sparseIntArray.put(R.id.tvTime, 1);
        sparseIntArray.put(R.id.tvDate, 2);
        sparseIntArray.put(R.id.imgLogo, 3);
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.tvDescription, 5);
        sparseIntArray.put(R.id.imgNotiLockscreen, 6);
        sparseIntArray.put(R.id.btnGrowUp, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.z.f20938y
            r2 = 8
            r7 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r9, r2, r7, r0)
            r2 = 7
            r2 = r0[r2]
            r3 = r2
            androidx.appcompat.widget.AppCompatButton r3 = (androidx.appcompat.widget.AppCompatButton) r3
            r2 = 3
            r2 = r0[r2]
            com.google.android.material.imageview.ShapeableImageView r2 = (com.google.android.material.imageview.ShapeableImageView) r2
            r2 = 6
            r2 = r0[r2]
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            r2 = 0
            r2 = r0[r2]
            r4 = r2
            androidx.constraintlayout.widget.ConstraintLayout r4 = (androidx.constraintlayout.widget.ConstraintLayout) r4
            r2 = 2
            r2 = r0[r2]
            r5 = r2
            android.widget.TextView r5 = (android.widget.TextView) r5
            r2 = 5
            r2 = r0[r2]
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            r2 = 1
            r2 = r0[r2]
            r6 = r2
            android.widget.TextView r6 = (android.widget.TextView) r6
            r2 = 4
            r0 = r0[r2]
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f20939x = r0
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.u
            r0.setTag(r7)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r9.setTag(r0, r8)
            r8.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.z.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20939x = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20939x != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20939x = 1L;
        }
        L();
    }
}
