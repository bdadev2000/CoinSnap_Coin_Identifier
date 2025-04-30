package T;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: T.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289u {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2929a;
    public ViewParent b;

    /* renamed from: c, reason: collision with root package name */
    public final View f2930c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2931d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2932e;

    public C0289u(View view) {
        this.f2930c = view;
    }

    public final boolean a(float f9, float f10, boolean z8) {
        ViewParent f11;
        if (!this.f2931d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0271g0.a(f11, this.f2930c, f9, f10, z8);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedFling", e4);
            return false;
        }
    }

    public final boolean b(float f9, float f10) {
        ViewParent f11;
        if (!this.f2931d || (f11 = f(0)) == null) {
            return false;
        }
        try {
            return AbstractC0271g0.b(f11, this.f2930c, f9, f10);
        } catch (AbstractMethodError e4) {
            Log.e("ViewParentCompat", "ViewParent " + f11 + " does not implement interface method onNestedPreFling", e4);
            return false;
        }
    }

    public final boolean c(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        ViewParent f9;
        int i12;
        int i13;
        int[] iArr3;
        if (!this.f2931d || (f9 = f(i11)) == null) {
            return false;
        }
        if (i9 == 0 && i10 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f2930c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i12 = iArr2[0];
            i13 = iArr2[1];
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (iArr == null) {
            if (this.f2932e == null) {
                this.f2932e = new int[2];
            }
            iArr3 = this.f2932e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z8 = f9 instanceof InterfaceC0290v;
        View view2 = this.f2930c;
        if (z8) {
            ((InterfaceC0290v) f9).f(view2, i9, i10, iArr3, i11);
        } else if (i11 == 0) {
            try {
                AbstractC0271g0.c(f9, view2, i9, i10, iArr3);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + f9 + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i12;
            iArr2[1] = iArr2[1] - i13;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int[] iArr, int i9, int i10, int i11) {
        e(0, i9, 0, i10, null, i11, iArr);
    }

    public final boolean e(int i9, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        ViewParent f9;
        int i14;
        int i15;
        int[] iArr3;
        if (!this.f2931d || (f9 = f(i13)) == null) {
            return false;
        }
        if (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f2930c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i14 = iArr[0];
            i15 = iArr[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr2 == null) {
            if (this.f2932e == null) {
                this.f2932e = new int[2];
            }
            int[] iArr4 = this.f2932e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z8 = f9 instanceof InterfaceC0291w;
        View view2 = this.f2930c;
        if (z8) {
            ((InterfaceC0291w) f9).a(view2, i9, i10, i11, i12, iArr3, i13);
        } else {
            iArr3[0] = iArr3[0] + i11;
            iArr3[1] = iArr3[1] + i12;
            if (f9 instanceof InterfaceC0290v) {
                ((InterfaceC0290v) f9).b(view2, i9, i10, i11, i12, i13);
            } else if (i13 == 0) {
                try {
                    AbstractC0271g0.d(f9, view2, i9, i10, i11, i12);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + f9 + " does not implement interface method onNestedScroll", e4);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i14;
            iArr[1] = iArr[1] - i15;
        }
        return true;
    }

    public final ViewParent f(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                return null;
            }
            return this.b;
        }
        return this.f2929a;
    }

    public final boolean g(int i9) {
        if (f(i9) != null) {
            return true;
        }
        return false;
    }

    public final boolean h(int i9, int i10) {
        boolean f9;
        if (g(i10)) {
            return true;
        }
        if (this.f2931d) {
            View view = this.f2930c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z8 = parent instanceof InterfaceC0290v;
                if (z8) {
                    f9 = ((InterfaceC0290v) parent).c(view2, view, i9, i10);
                } else {
                    if (i10 == 0) {
                        try {
                            f9 = AbstractC0271g0.f(parent, view2, view, i9);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                        }
                    }
                    f9 = false;
                }
                if (f9) {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            this.b = parent;
                        }
                    } else {
                        this.f2929a = parent;
                    }
                    if (z8) {
                        ((InterfaceC0290v) parent).d(view2, view, i9, i10);
                    } else if (i10 == 0) {
                        try {
                            AbstractC0271g0.e(parent, view2, view, i9);
                        } catch (AbstractMethodError e9) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e9);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void i(int i9) {
        ViewParent f9 = f(i9);
        if (f9 != null) {
            boolean z8 = f9 instanceof InterfaceC0290v;
            View view = this.f2930c;
            if (z8) {
                ((InterfaceC0290v) f9).e(view, i9);
            } else if (i9 == 0) {
                try {
                    AbstractC0271g0.g(f9, view);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + f9 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i9 != 0) {
                if (i9 == 1) {
                    this.b = null;
                    return;
                }
                return;
            }
            this.f2929a = null;
        }
    }
}
