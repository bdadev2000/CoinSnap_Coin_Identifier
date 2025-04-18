package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class y1 extends x1 {

    /* renamed from: y, reason: collision with root package name */
    public static final h.c f20933y;

    /* renamed from: z, reason: collision with root package name */
    public static final SparseIntArray f20934z;

    /* renamed from: x, reason: collision with root package name */
    public long f20935x;

    static {
        h.c cVar = new h.c(5);
        f20933y = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_large}, new String[]{"ads_shimmer_native_large"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20934z = sparseIntArray;
        sparseIntArray.put(R.id.rcvHistory, 3);
        sparseIntArray.put(R.id.layoutNoData, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y1(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            h.c r0 = kf.y1.f20933y
            android.util.SparseIntArray r2 = kf.y1.f20934z
            r3 = 5
            java.lang.Object[] r7 = androidx.databinding.e.K(r9, r3, r0, r2)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 4
            r0 = r7[r0]
            r4 = r0
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0 = 3
            r0 = r7[r0]
            r5 = r0
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r0 = 2
            r0 = r7[r0]
            r6 = r0
            kf.u0 r6 = (kf.u0) r6
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f20935x = r0
            android.widget.FrameLayout r0 = r8.f20923t
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r7[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            kf.u0 r0 = r8.f20925w
            if (r0 == 0) goto L3f
            r0.f1327n = r8
        L3f:
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r9.setTag(r0, r8)
            r8.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.y1.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20935x = 0L;
        }
        this.f20925w.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20935x != 0) {
                return true;
            }
            if (this.f20925w.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20935x = 2L;
        }
        this.f20925w.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20925w.M(vVar);
    }
}
