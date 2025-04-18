package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class w2 extends v2 {

    /* renamed from: y, reason: collision with root package name */
    public static final SparseIntArray f20919y;

    /* renamed from: x, reason: collision with root package name */
    public long f20920x;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20919y = sparseIntArray;
        sparseIntArray.put(R.id.icCountriesFlag, 1);
        sparseIntArray.put(R.id.txtCountriesName, 2);
        sparseIntArray.put(R.id.checkbox_language, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w2(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.w2.f20919y
            r2 = 4
            r7 = 0
            java.lang.Object[] r0 = androidx.databinding.e.K(r9, r2, r7, r0)
            r2 = 3
            r2 = r0[r2]
            r3 = r2
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r2 = 0
            r2 = r0[r2]
            r4 = r2
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r2 = 1
            r2 = r0[r2]
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r2 = 2
            r0 = r0[r2]
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = -1
            r8.f20920x = r0
            android.widget.LinearLayout r0 = r8.u
            r0.setTag(r7)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r9.setTag(r0, r8)
            r8.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.w2.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20920x = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20920x != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20920x = 1L;
        }
        L();
    }
}
