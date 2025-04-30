package u6;

import android.util.SparseIntArray;
import androidx.lifecycle.InterfaceC0511v;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* renamed from: u6.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2796l extends AbstractC2795k {

    /* renamed from: C, reason: collision with root package name */
    public static final C.c f23351C;

    /* renamed from: D, reason: collision with root package name */
    public static final SparseIntArray f23352D;

    /* renamed from: B, reason: collision with root package name */
    public long f23353B;

    static {
        C.c cVar = new C.c(16);
        f23351C = cVar;
        cVar.B(new String[]{"ads_shimmer_native_large"}, new int[]{2}, new int[]{R.layout.ads_shimmer_native_large});
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23352D = sparseIntArray;
        sparseIntArray.put(R.id.imgBack, 3);
        sparseIntArray.put(R.id.txtScreenTitle, 4);
        sparseIntArray.put(R.id.llSearchBox, 5);
        sparseIntArray.put(R.id.edtSearch, 6);
        sparseIntArray.put(R.id.imgClearText, 7);
        sparseIntArray.put(R.id.rvImages, 8);
        sparseIntArray.put(R.id.imgNotFound, 9);
        sparseIntArray.put(R.id.txtNotFound, 10);
        sparseIntArray.put(R.id.imgEmpty, 11);
        sparseIntArray.put(R.id.txtMessEmptyFile, 12);
        sparseIntArray.put(R.id.frAdContainer, 13);
        sparseIntArray.put(R.id.groupData, 14);
        sparseIntArray.put(R.id.groupNoData, 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2796l(android.view.View r18) {
        /*
            r17 = this;
            r14 = r17
            C.c r0 = u6.C2796l.f23351C
            android.util.SparseIntArray r1 = u6.C2796l.f23352D
            r2 = 16
            r15 = r18
            java.lang.Object[] r16 = d0.AbstractC2158e.K(r15, r2, r0, r1)
            r0 = 6
            r0 = r16[r0]
            r3 = r0
            androidx.appcompat.widget.AppCompatEditText r3 = (androidx.appcompat.widget.AppCompatEditText) r3
            r0 = 13
            r0 = r16[r0]
            r4 = r0
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r0 = 1
            r0 = r16[r0]
            r5 = r0
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r0 = 14
            r0 = r16[r0]
            r6 = r0
            androidx.constraintlayout.widget.Group r6 = (androidx.constraintlayout.widget.Group) r6
            r0 = 15
            r0 = r16[r0]
            r7 = r0
            androidx.constraintlayout.widget.Group r7 = (androidx.constraintlayout.widget.Group) r7
            r0 = 3
            r0 = r16[r0]
            r8 = r0
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r0 = 7
            r0 = r16[r0]
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r0 = 11
            r0 = r16[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0 = 9
            r0 = r16[r0]
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            r0 = 5
            r0 = r16[r0]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0 = 8
            r0 = r16[r0]
            r11 = r0
            androidx.recyclerview.widget.RecyclerView r11 = (androidx.recyclerview.widget.RecyclerView) r11
            r0 = 2
            r0 = r16[r0]
            r12 = r0
            u6.G r12 = (u6.G) r12
            r0 = 12
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0 = 10
            r0 = r16[r0]
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            r0 = 4
            r0 = r16[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            r0 = r17
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = -1
            r14.f23353B = r0
            android.widget.FrameLayout r0 = r14.f23339s
            r1 = 0
            r0.setTag(r1)
            r0 = 0
            r0 = r16[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r0.setTag(r1)
            u6.G r0 = r14.f23346z
            if (r0 == 0) goto L8c
            r0.f19792k = r14
        L8c:
            r17.N(r18)
            r17.I()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.C2796l.<init>(android.view.View):void");
    }

    @Override // d0.AbstractC2158e
    public final void E() {
        synchronized (this) {
            this.f23353B = 0L;
        }
        this.f23346z.F();
    }

    @Override // d0.AbstractC2158e
    public final boolean H() {
        synchronized (this) {
            try {
                if (this.f23353B != 0) {
                    return true;
                }
                if (this.f23346z.H()) {
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
            this.f23353B = 2L;
        }
        this.f23346z.I();
        L();
    }

    @Override // d0.AbstractC2158e
    public final void M(InterfaceC0511v interfaceC0511v) {
        super.M(interfaceC0511v);
        this.f23346z.M(interfaceC0511v);
    }
}
