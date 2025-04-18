package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class i3 extends h3 {

    /* renamed from: w, reason: collision with root package name */
    public static final SparseIntArray f20792w;

    /* renamed from: v, reason: collision with root package name */
    public long f20793v;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20792w = sparseIntArray;
        sparseIntArray.put(R.id.imgPlantResult, 1);
        sparseIntArray.put(R.id.animLoading, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i3(android.view.View r6) {
        /*
            r5 = this;
            android.util.SparseIntArray r0 = kf.i3.f20792w
            r1 = 3
            r2 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r6, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            com.airbnb.lottie.LottieAnimationView r1 = (com.airbnb.lottie.LottieAnimationView) r1
            r3 = 1
            r3 = r0[r3]
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r5.<init>(r2, r6, r1, r3)
            r3 = -1
            r5.f20793v = r3
            r1 = 0
            r0 = r0[r1]
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            r0.setTag(r2)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r6.setTag(r0, r5)
            r5.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.i3.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20793v = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20793v != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20793v = 1L;
        }
        L();
    }
}
