package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2794j extends AbstractC2793i {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f23332v;

    /* renamed from: u, reason: collision with root package name */
    public long f23333u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23332v = sparseIntArray;
        sparseIntArray.put(R.id.imgPreview, 1);
        sparseIntArray.put(R.id.imgBack, 2);
        sparseIntArray.put(R.id.imgRename, 3);
        sparseIntArray.put(R.id.imgShare, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2794j(android.view.View r11) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = u6.C2794j.f23332v
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d0.AbstractC2158e.K(r11, r1, r2, r0)
            r1 = 2
            r1 = r0[r1]
            r6 = r1
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1 = 1
            r1 = r0[r1]
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r1 = 3
            r1 = r0[r1]
            r8 = r1
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r1 = 4
            r1 = r0[r1]
            r9 = r1
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r4 = 0
            r3 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.f23333u = r3
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r10.N(r11)
            r10.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C2794j.<init>(android.view.View):void");
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23333u = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23333u != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // d0.AbstractC2158e
    public final void I() {
        synchronized (this) {
            this.f23333u = 1L;
        }
        L();
    }
}
