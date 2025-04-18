package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class n extends m {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f20832z;

    /* renamed from: y, reason: collision with root package name */
    public long f20833y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20832z = sparseIntArray;
        sparseIntArray.put(R.id.layoutSettingTop, 2);
        sparseIntArray.put(R.id.icBack, 3);
        sparseIntArray.put(R.id.icChbAll, 4);
        sparseIntArray.put(R.id.rcvHistory, 5);
        sparseIntArray.put(R.id.btnDelete, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.n.f20832z
            r2 = 7
            r8 = 0
            java.lang.Object[] r9 = androidx.databinding.e.K(r11, r2, r8, r0)
            r0 = 6
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 1
            r0 = r9[r0]
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0 = 3
            r0 = r9[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 4
            r0 = r9[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 2
            r0 = r9[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 5
            r0 = r9[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f20833y = r0
            android.widget.FrameLayout r0 = r10.u
            r0.setTag(r8)
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r11.setTag(r0, r10)
            r10.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.n.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20833y = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20833y != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20833y = 1L;
        }
        L();
    }
}
