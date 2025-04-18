package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewParentCompat;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public class NestedScrollingChildHelper {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f18720a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f18721b;

    /* renamed from: c, reason: collision with root package name */
    public final View f18722c;
    public boolean d;
    public int[] e;

    public NestedScrollingChildHelper(View view) {
        this.f18722c = view;
    }

    public final boolean a(float f2, float f3, boolean z2) {
        ViewParent f4;
        if (!this.d || (f4 = f(0)) == null) {
            return false;
        }
        try {
            return ViewParentCompat.Api21Impl.a(f4, this.f18722c, f2, f3, z2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + f4 + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean b(float f2, float f3) {
        ViewParent f4;
        if (!this.d || (f4 = f(0)) == null) {
            return false;
        }
        try {
            return ViewParentCompat.Api21Impl.b(f4, this.f18722c, f2, f3);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + f4 + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public final boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent f2;
        int i5;
        int i6;
        int[] iArr3;
        if (!this.d || (f2 = f(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f18722c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f18722c;
        if (f2 instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) f2).onNestedPreScroll(view2, i2, i3, iArr3, i4);
        } else if (i4 == 0) {
            try {
                ViewParentCompat.Api21Impl.c(f2, view2, i2, i3, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final void d(int i2, int i3, int i4, int[] iArr) {
        e(0, i2, 0, i3, null, i4, iArr);
    }

    public final boolean e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent f2;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.d || (f2 = f(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f18722c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f18722c;
        if (f2 instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) f2).onNestedScroll(view2, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (f2 instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) f2).onNestedScroll(view2, i2, i3, i4, i5, i6);
            } else if (i6 == 0) {
                try {
                    ViewParentCompat.Api21Impl.d(f2, view2, i2, i3, i4, i5);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    public final ViewParent f(int i2) {
        if (i2 == 0) {
            return this.f18720a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f18721b;
    }

    public final boolean g(int i2) {
        return f(i2) != null;
    }

    public final void h(boolean z2) {
        if (this.d) {
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            ViewCompat.Api21Impl.z(this.f18722c);
        }
        this.d = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.g(r10)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.d
            if (r0 == 0) goto L7c
            android.view.View r0 = r8.f18722c
            android.view.ViewParent r2 = r0.getParent()
            r3 = r0
        L13:
            if (r2 == 0) goto L7c
            boolean r4 = r2 instanceof androidx.core.view.NestedScrollingParent2
            java.lang.String r5 = "ViewParentCompat"
            java.lang.String r6 = "ViewParent "
            if (r4 == 0) goto L25
            r7 = r2
            androidx.core.view.NestedScrollingParent2 r7 = (androidx.core.view.NestedScrollingParent2) r7
            boolean r7 = r7.onStartNestedScroll(r3, r0, r9, r10)
            goto L2b
        L25:
            if (r10 != 0) goto L70
            boolean r7 = androidx.core.view.ViewParentCompat.Api21Impl.f(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L5b
        L2b:
            if (r7 == 0) goto L70
            if (r10 == 0) goto L35
            if (r10 == r1) goto L32
            goto L37
        L32:
            r8.f18721b = r2
            goto L37
        L35:
            r8.f18720a = r2
        L37:
            if (r4 == 0) goto L3f
            androidx.core.view.NestedScrollingParent2 r2 = (androidx.core.view.NestedScrollingParent2) r2
            r2.onNestedScrollAccepted(r3, r0, r9, r10)
            goto L5a
        L3f:
            if (r10 != 0) goto L5a
            androidx.core.view.ViewParentCompat.Api21Impl.e(r2, r3, r0, r9)     // Catch: java.lang.AbstractMethodError -> L45
            goto L5a
        L45:
            r9 = move-exception
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r6)
            r10.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScrollAccepted"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10, r9)
        L5a:
            return r1
        L5b:
            r4 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            r7.append(r2)
            java.lang.String r6 = " does not implement interface method onStartNestedScroll"
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            android.util.Log.e(r5, r6, r4)
        L70:
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L77
            r3 = r2
            android.view.View r3 = (android.view.View) r3
        L77:
            android.view.ViewParent r2 = r2.getParent()
            goto L13
        L7c:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.NestedScrollingChildHelper.i(int, int):boolean");
    }

    public final void j(int i2) {
        ViewParent f2 = f(i2);
        if (f2 != null) {
            boolean z2 = f2 instanceof NestedScrollingParent2;
            View view = this.f18722c;
            if (z2) {
                ((NestedScrollingParent2) f2).onStopNestedScroll(view, i2);
            } else if (i2 == 0) {
                try {
                    ViewParentCompat.Api21Impl.g(f2, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + f2 + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i2 == 0) {
                this.f18720a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f18721b = null;
            }
        }
    }
}
