package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class r extends q {
    public static final SparseIntArray A;

    /* renamed from: z, reason: collision with root package name */
    public static final h.c f20870z;

    /* renamed from: y, reason: collision with root package name */
    public long f20871y;

    static {
        h.c cVar = new h.c(7);
        f20870z = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_large}, new String[]{"ads_shimmer_native_large"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(R.id.layoutSettingTop, 3);
        sparseIntArray.put(R.id.icBack, 4);
        sparseIntArray.put(R.id.icDone, 5);
        sparseIntArray.put(R.id.rcvLanguage, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(android.view.View r10) {
        /*
            r9 = this;
            r1 = 0
            h.c r0 = kf.r.f20870z
            android.util.SparseIntArray r2 = kf.r.A
            r3 = 7
            java.lang.Object[] r8 = androidx.databinding.e.K(r10, r3, r0, r2)
            r0 = 1
            r0 = r8[r0]
            r3 = r0
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 4
            r0 = r8[r0]
            r4 = r0
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r0 = 5
            r0 = r8[r0]
            r5 = r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0 = 3
            r0 = r8[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 6
            r0 = r8[r0]
            r6 = r0
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r0 = 2
            r0 = r8[r0]
            r7 = r0
            kf.u0 r7 = (kf.u0) r7
            r0 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0 = -1
            r9.f20871y = r0
            android.widget.FrameLayout r0 = r9.f20858t
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r8[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            kf.u0 r0 = r9.f20861x
            if (r0 == 0) goto L4a
            r0.f1327n = r9
        L4a:
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r10.setTag(r0, r9)
            r9.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.r.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20871y = 0L;
        }
        this.f20861x.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20871y != 0) {
                return true;
            }
            if (this.f20861x.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20871y = 2L;
        }
        this.f20861x.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20861x.M(vVar);
    }
}
