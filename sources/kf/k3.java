package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class k3 extends j3 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f20812w;

    /* renamed from: v, reason: collision with root package name */
    public long f20813v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20812w = sparseIntArray;
        sparseIntArray.put(R.id.tvSoundName, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k3(android.view.View r5) {
        /*
            r4 = this;
            android.util.SparseIntArray r0 = kf.k3.f20812w
            r1 = 2
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r5, r1, r2, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r3 = 1
            r0 = r0[r3]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.<init>(r2, r5, r1, r0)
            r0 = -1
            r4.f20813v = r0
            android.widget.FrameLayout r0 = r4.f20800t
            r0.setTag(r2)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r5.setTag(r0, r4)
            r4.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.k3.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20813v = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20813v != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20813v = 1L;
        }
        L();
    }
}
