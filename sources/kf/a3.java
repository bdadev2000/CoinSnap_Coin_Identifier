package kf;

import android.util.SparseIntArray;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes4.dex */
public final class a3 extends z2 {

    /* renamed from: x, reason: collision with root package name */
    public static final SparseIntArray f20700x;

    /* renamed from: w, reason: collision with root package name */
    public long f20701w;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20700x = sparseIntArray;
        sparseIntArray.put(R.id.img_guide, 1);
        sparseIntArray.put(R.id.tv_title, 2);
        sparseIntArray.put(R.id.tv_sub_text, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a3(android.view.View r9) {
        /*
            r8 = this;
            r1 = 0
            android.util.SparseIntArray r0 = kf.a3.f20700x
            r2 = 4
            r6 = 0
            java.lang.Object[] r7 = androidx.databinding.e.K(r9, r2, r6, r0)
            r0 = 1
            r0 = r7[r0]
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0 = 3
            r0 = r7[r0]
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            r0 = 2
            r0 = r7[r0]
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = -1
            r8.f20701w = r0
            r0 = 0
            r0 = r7[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r0.setTag(r6)
            r0 = 2131362128(0x7f0a0150, float:1.8344028E38)
            r9.setTag(r0, r8)
            r8.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.a3.<init>(android.view.View):void");
    }

    @Override // androidx.databinding.e
    public final void E() {
        synchronized (this) {
            this.f20701w = 0L;
        }
    }

    @Override // androidx.databinding.e
    public final boolean H() {
        synchronized (this) {
            if (this.f20701w != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.databinding.e
    public final void I() {
        synchronized (this) {
            this.f20701w = 1L;
        }
        L();
    }
}
