package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class o2 extends n2 {

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f20855z;

    /* renamed from: y, reason: collision with root package name */
    public long f20856y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20855z = sparseIntArray;
        sparseIntArray.put(R.id.btnChoiceYear, 1);
        sparseIntArray.put(R.id.icTick, 2);
        sparseIntArray.put(R.id.tvIapName, 3);
        sparseIntArray.put(R.id.tvPrice, 4);
        sparseIntArray.put(R.id.tvBestChoice, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o2(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.o2.f20855z
            r2 = 6
            r8 = 0
            java.lang.Object[] r9 = androidx.databinding.e.K(r11, r2, r8, r0)
            r0 = 1
            r0 = r9[r0]
            r3 = r0
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0 = 2
            r0 = r9[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 5
            r0 = r9[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 3
            r0 = r9[r0]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = 4
            r0 = r9[r0]
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r10.f20856y = r0
            r0 = 0
            r0 = r9[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r8)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r11.setTag(r0, r10)
            r10.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.o2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20856y = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20856y != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20856y = 1L;
        }
        L();
    }
}
