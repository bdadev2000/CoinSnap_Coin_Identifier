package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class c2 extends b2 {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final h.c f20722z;

    /* renamed from: y, reason: collision with root package name */
    public long f20723y;

    static {
        h.c cVar = new h.c(6);
        f20722z = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_small}, new String[]{"ads_shimmer_native_small"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.rvMyPlant, 3);
        sparseIntArray.put(R.id.layoutNoData, 4);
        sparseIntArray.put(R.id.relay_ads, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c2(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            h.c r0 = kf.c2.f20722z
            android.util.SparseIntArray r2 = kf.c2.A
            r3 = 6
            java.lang.Object[] r8 = androidx.databinding.e.K(r10, r3, r0, r2)
            r0 = 1
            r0 = r8[r0]
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 4
            r0 = r8[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 2
            r0 = r8[r0]
            r5 = r0
            kf.y0 r5 = (kf.y0) r5
            r0 = 5
            r0 = r8[r0]
            r6 = r0
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r0 = 3
            r0 = r8[r0]
            r7 = r0
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.f20723y = r0
            android.widget.FrameLayout r0 = r9.f20704t
            r1 = 0
            r0.setTag(r1)
            kf.y0 r0 = r9.f20705v
            if (r0 == 0) goto L3d
            r0.f1327n = r9
        L3d:
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r10.setTag(r0, r9)
            r9.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.c2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20723y = 0L;
        }
        this.f20705v.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20723y != 0) {
                return true;
            }
            if (this.f20705v.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20723y = 2L;
        }
        this.f20705v.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20705v.M(vVar);
    }
}
