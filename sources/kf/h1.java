package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class h1 extends g1 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f20775y;

    /* renamed from: x, reason: collision with root package name */
    public long f20776x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20775y = sparseIntArray;
        sparseIntArray.put(R.id.tvSound, 1);
        sparseIntArray.put(R.id.icUp, 2);
        sparseIntArray.put(R.id.tvSoundName, 3);
        sparseIntArray.put(R.id.viewLineCenter, 4);
        sparseIntArray.put(R.id.rcvSound, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h1(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.h1.f20775y
            r2 = 6
            r7 = 0
            java.lang.Object[] r8 = androidx.databinding.e.K(r10, r2, r7, r0)
            r0 = 2
            r0 = r8[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 5
            r0 = r8[r0]
            r4 = r0
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 1
            r0 = r8[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 3
            r0 = r8[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 4
            r0 = r8[r0]
            r6 = r0
            android.view.View r6 = (android.view.View) r6
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r9.f20776x = r0
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r7)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r10.setTag(r0, r9)
            r9.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.h1.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20776x = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20776x != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20776x = 1L;
        }
        L();
    }
}
