package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class x0 extends w0 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f20921x;

    /* renamed from: w, reason: collision with root package name */
    public long f20922w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20921x = sparseIntArray;
        sparseIntArray.put(R.id.ad_unit_content, 1);
        sparseIntArray.put(R.id.ad_media, 2);
        sparseIntArray.put(R.id.ad_app_icon, 3);
        sparseIntArray.put(R.id.ad_headline, 4);
        sparseIntArray.put(R.id.ad_advertiser, 5);
        sparseIntArray.put(R.id.ad_body, 6);
        sparseIntArray.put(R.id.ad_call_to_action, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public x0(android.view.View r8) {
        /*
            r7 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.x0.f20921x
            r2 = 8
            r6 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r8, r2, r6, r0)
            r2 = 5
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 3
            r2 = r0[r2]
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r2 = 6
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 7
            r2 = r0[r2]
            r3 = r2
            android.view.View r3 = (android.view.View) r3
            r2 = 4
            r2 = r0[r2]
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2 = 2
            r2 = r0[r2]
            r4 = r2
            android.view.View r4 = (android.view.View) r4
            r2 = 1
            r2 = r0[r2]
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2 = 0
            r0 = r0[r2]
            r5 = r0
            com.facebook.shimmer.ShimmerFrameLayout r5 = (com.facebook.shimmer.ShimmerFrameLayout) r5
            r0 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r7.f20922w = r0
            com.facebook.shimmer.ShimmerFrameLayout r0 = r7.f20916v
            r0.setTag(r6)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r8.setTag(r0, r7)
            r7.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.x0.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20922w = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20922w != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20922w = 1L;
        }
        L();
    }
}
