package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class f extends e {
    public static final h.c B;
    public static final SparseIntArray C;
    public long A;

    static {
        h.c cVar = new h.c(10);
        B = cVar;
        cVar.H(new int[]{2}, new int[]{R.layout.ads_shimmer_native_small}, new String[]{"ads_shimmer_native_small"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.btnBack, 3);
        sparseIntArray.put(R.id.tvTitle, 4);
        sparseIntArray.put(R.id.ivSearchIcon, 5);
        sparseIntArray.put(R.id.etSearch, 6);
        sparseIntArray.put(R.id.rvDiagnoseList, 7);
        sparseIntArray.put(R.id.layoutNoResult, 8);
        sparseIntArray.put(R.id.img_no_result, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.view.View r11) {
        /*
            r10 = this;
            r1 = 0
            h.c r0 = kf.f.B
            android.util.SparseIntArray r2 = kf.f.C
            r3 = 10
            java.lang.Object[] r0 = androidx.databinding.e.K(r11, r3, r0, r2)
            r2 = 3
            r2 = r0[r2]
            r3 = r2
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2 = 6
            r2 = r0[r2]
            r4 = r2
            android.widget.EditText r4 = (android.widget.EditText) r4
            r2 = 1
            r2 = r0[r2]
            r5 = r2
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r2 = 9
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2 = 5
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2 = 0
            r2 = r0[r2]
            r6 = r2
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r2 = 8
            r2 = r0[r2]
            r7 = r2
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r2 = 7
            r2 = r0[r2]
            r8 = r2
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            r2 = 2
            r2 = r0[r2]
            r9 = r2
            kf.y0 r9 = (kf.y0) r9
            r2 = 4
            r0 = r0[r2]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1
            r10.A = r0
            android.widget.FrameLayout r0 = r10.f20734v
            r1 = 0
            r0.setTag(r1)
            android.widget.LinearLayout r0 = r10.f20735w
            r0.setTag(r1)
            kf.y0 r0 = r10.f20738z
            if (r0 == 0) goto L60
            r0.f1327n = r10
        L60:
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r11.setTag(r0, r10)
            r10.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.f.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.A = 0L;
        }
        this.f20738z.F();
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            if (this.f20738z.H()) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.A = 2L;
        }
        this.f20738z.I();
        L();
    }

    @Override // androidx.databinding.e
    public final void M(androidx.lifecycle.v vVar) {
        super.M(vVar);
        this.f20738z.M(vVar);
    }
}
