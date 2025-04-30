package u6;

import android.util.SparseIntArray;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2790f extends AbstractC2789e {

    /* renamed from: v, reason: collision with root package name */
    public static final SparseIntArray f23296v;

    /* renamed from: u, reason: collision with root package name */
    public long f23297u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23296v = sparseIntArray;
        sparseIntArray.put(R.id.include, 2);
        sparseIntArray.put(R.id.vpContent, 3);
        sparseIntArray.put(R.id.switchScreen, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2790f(android.view.View r11) {
        /*
            r10 = this;
            android.util.SparseIntArray r0 = u6.C2790f.f23296v
            r1 = 5
            r2 = 0
            java.lang.Object[] r0 = d0.AbstractC2158e.K(r11, r1, r2, r0)
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.SwitchCompat r8 = (androidx.appcompat.widget.SwitchCompat) r8
            r1 = 3
            r1 = r0[r1]
            r9 = r1
            androidx.viewpager2.widget.ViewPager2 r9 = (androidx.viewpager2.widget.ViewPager2) r9
            r4 = 0
            r3 = r10
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r3 = -1
            r10.f23297u = r3
            android.widget.FrameLayout r1 = r10.f23288q
            r1.setTag(r2)
            r1 = 0
            r0 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r2)
            r10.N(r11)
            r10.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C2790f.<init>(android.view.View):void");
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23297u = 0L;
        }
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23297u != 0) {
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
            this.f23297u = 1L;
        }
        L();
    }
}
