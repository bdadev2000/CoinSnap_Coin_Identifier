package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class j0 extends i0 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public long f20795z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.layoutSettingTop, 2);
        sparseIntArray.put(R.id.icBack, 3);
        sparseIntArray.put(R.id.icTrash, 4);
        sparseIntArray.put(R.id.rcvReminder, 5);
        sparseIntArray.put(R.id.layoutNullData, 6);
        sparseIntArray.put(R.id.btnAddReminder, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public j0(android.view.View r12) {
        /*
            r11 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.j0.A
            r2 = 8
            r9 = 0
            java.lang.Object[] r10 = androidx.databinding.e.K(r12, r2, r9, r0)
            r0 = 7
            r0 = r10[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 1
            r0 = r10[r0]
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0 = 3
            r0 = r10[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 4
            r0 = r10[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 6
            r0 = r10[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 2
            r0 = r10[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r10[r0]
            r8 = r0
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r0 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1
            r11.f20795z = r0
            android.widget.FrameLayout r0 = r11.u
            r0.setTag(r9)
            r0 = 0
            r0 = r10[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r9)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r12.setTag(r0, r11)
            r11.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.j0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20795z = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20795z != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20795z = 1L;
        }
        L();
    }
}
