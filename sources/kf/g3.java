package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class g3 extends f3 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f20772y;

    /* renamed from: x, reason: collision with root package name */
    public long f20773x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20772y = sparseIntArray;
        sparseIntArray.put(R.id.tvTime, 1);
        sparseIntArray.put(R.id.tvDateOfWeek, 2);
        sparseIntArray.put(R.id.tvTitle, 3);
        sparseIntArray.put(R.id.icChbDelete, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g3(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.g3.f20772y
            r2 = 5
            r7 = 0
            java.lang.Object[] r8 = androidx.databinding.e.K(r10, r2, r7, r0)
            r0 = 4
            r0 = r8[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 2
            r0 = r8[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 1
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r8[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f20773x = r0
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r10.setTag(r0, r9)
            r9.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g3.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20773x = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20773x != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20773x = 1L;
        }
        L();
    }
}
