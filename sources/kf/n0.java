package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class n0 extends m0 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f20834z;

    /* renamed from: y, reason: collision with root package name */
    public long f20835y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20834z = sparseIntArray;
        sparseIntArray.put(R.id.tvTime, 1);
        sparseIntArray.put(R.id.tvTitle, 2);
        sparseIntArray.put(R.id.tvDescription, 3);
        sparseIntArray.put(R.id.btnSnooze, 4);
        sparseIntArray.put(R.id.btnLetDoIt, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n0(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.n0.f20834z
            r2 = 6
            r8 = 0
            java.lang.Object[] r9 = androidx.databinding.e.K(r11, r2, r8, r0)
            r0 = 5
            r0 = r9[r0]
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0 = 4
            r0 = r9[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 3
            r0 = r9[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 2
            r0 = r9[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f20835y = r0
            r0 = 0
            r0 = r9[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r8)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r11.setTag(r0, r10)
            r10.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.n0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20835y = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20835y != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20835y = 1L;
        }
        L();
    }
}
