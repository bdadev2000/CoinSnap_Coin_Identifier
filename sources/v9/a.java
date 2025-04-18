package v9;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class a extends mi.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f26346d;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f26346d = bottomSheetBehavior;
    }

    @Override // mi.a
    public final int d(View view, int i10) {
        return view.getLeft();
    }

    @Override // mi.a
    public final int e(View view, int i10) {
        return com.bumptech.glide.e.o(i10, this.f26346d.D(), i());
    }

    @Override // mi.a
    public final int i() {
        BottomSheetBehavior bottomSheetBehavior = this.f26346d;
        if (bottomSheetBehavior.I) {
            return bottomSheetBehavior.V;
        }
        return bottomSheetBehavior.G;
    }

    @Override // mi.a
    public final void l(int i10) {
        if (i10 == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f26346d;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.J(1);
            }
        }
    }

    @Override // mi.a
    public final void m(View view, int i10, int i11) {
        this.f26346d.z(i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (java.lang.Math.abs(r5.getTop() - r3.D()) < java.lang.Math.abs(r5.getTop() - r3.E)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if (java.lang.Math.abs(r6 - r3.E) < java.lang.Math.abs(r6 - r3.G)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:
    
        if (java.lang.Math.abs(r6 - r3.D) < java.lang.Math.abs(r6 - r3.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
    
        if (r6 < java.lang.Math.abs(r6 - r3.G)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
    
        if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.G)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r6 > r3.E) goto L53;
     */
    @Override // mi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.f26346d
            if (r1 >= 0) goto L1b
            boolean r6 = r3.f11568b
            if (r6 == 0) goto Le
            goto Lc4
        Le:
            int r6 = r5.getTop()
            java.lang.System.currentTimeMillis()
            int r7 = r3.E
            if (r6 <= r7) goto Lc4
            goto Ld5
        L1b:
            boolean r1 = r3.I
            if (r1 == 0) goto L70
            boolean r1 = r3.K(r5, r7)
            if (r1 == 0) goto L70
            float r6 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r7)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L38
            int r6 = r3.f11572d
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L4c
        L38:
            int r6 = r5.getTop()
            int r7 = r3.V
            int r0 = r3.D()
            int r0 = r0 + r7
            int r0 = r0 / 2
            if (r6 <= r0) goto L49
            r6 = r2
            goto L4a
        L49:
            r6 = 0
        L4a:
            if (r6 == 0) goto L4f
        L4c:
            r6 = 5
            goto Ld8
        L4f:
            boolean r6 = r3.f11568b
            if (r6 == 0) goto L55
            goto Lc4
        L55:
            int r6 = r5.getTop()
            int r7 = r3.D()
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.getTop()
            int r0 = r3.E
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
            goto Lc4
        L70:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L9c
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L81
            goto L9c
        L81:
            boolean r6 = r3.f11568b
            if (r6 == 0) goto L86
            goto Ld7
        L86:
            int r6 = r5.getTop()
            int r7 = r3.E
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Ld5
        L9c:
            int r6 = r5.getTop()
            boolean r7 = r3.f11568b
            if (r7 == 0) goto Lb6
            int r7 = r3.D
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Lc4
        Lb6:
            int r7 = r3.E
            if (r6 >= r7) goto Lc6
            int r7 = r3.G
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
        Lc4:
            r6 = 3
            goto Ld8
        Lc6:
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.G
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
        Ld5:
            r6 = 6
            goto Ld8
        Ld7:
            r6 = 4
        Ld8:
            r3.getClass()
            r3.L(r5, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.a.n(android.view.View, float, float):void");
    }

    @Override // mi.a
    public final boolean p(int i10, View view) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.f26346d;
        int i11 = bottomSheetBehavior.N;
        if (i11 == 1 || bottomSheetBehavior.f11573d0) {
            return false;
        }
        if (i11 == 3 && bottomSheetBehavior.f11569b0 == i10) {
            WeakReference weakReference = bottomSheetBehavior.X;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.W;
        if (weakReference2 == null || weakReference2.get() != view) {
            return false;
        }
        return true;
    }
}
