package la;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes3.dex */
public final class a extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21286f;

    /* renamed from: g, reason: collision with root package name */
    public final SideSheetBehavior f21287g;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i10) {
        this.f21286f = i10;
        this.f21287g = sideSheetBehavior;
    }

    public final int E(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f21286f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float F(int i10) {
        switch (this.f21286f) {
            case 0:
                float I = I();
                return (i10 - I) / (H() - I);
            default:
                float I2 = I();
                return (I2 - i10) / (I2 - H());
        }
    }

    public final int G(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f21286f) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final int H() {
        int i10 = this.f21286f;
        SideSheetBehavior sideSheetBehavior = this.f21287g;
        switch (i10) {
            case 0:
                return Math.max(0, sideSheetBehavior.f11785n + sideSheetBehavior.f11786o);
            default:
                return Math.max(0, (I() - sideSheetBehavior.f11783l) - sideSheetBehavior.f11786o);
        }
    }

    public final int I() {
        int i10 = this.f21286f;
        SideSheetBehavior sideSheetBehavior = this.f21287g;
        switch (i10) {
            case 0:
                return (-sideSheetBehavior.f11783l) - sideSheetBehavior.f11786o;
            default:
                return sideSheetBehavior.f11784m;
        }
    }

    public final int J(View view) {
        int i10 = this.f21286f;
        SideSheetBehavior sideSheetBehavior = this.f21287g;
        switch (i10) {
            case 0:
                return view.getRight() + sideSheetBehavior.f11786o;
            default:
                return view.getLeft() - sideSheetBehavior.f11786o;
        }
    }

    public final int K(CoordinatorLayout coordinatorLayout) {
        switch (this.f21286f) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final boolean L(float f10) {
        switch (this.f21286f) {
            case 0:
                return f10 > 0.0f;
            default:
                return f10 < 0.0f;
        }
    }

    public final boolean M(View view) {
        switch (this.f21286f) {
            case 0:
                if (view.getRight() < (H() - I()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (H() + I()) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean N(float f10, float f11) {
        boolean z10;
        boolean z11;
        int i10 = this.f21286f;
        SideSheetBehavior sideSheetBehavior = this.f21287g;
        switch (i10) {
            case 0:
                if (Math.abs(f10) > Math.abs(f11)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    float abs = Math.abs(f10);
                    sideSheetBehavior.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f10) > Math.abs(f11)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    float abs2 = Math.abs(f10);
                    sideSheetBehavior.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean O(View view, float f10) {
        int i10 = this.f21286f;
        SideSheetBehavior sideSheetBehavior = this.f21287g;
        switch (i10) {
            case 0:
                if (Math.abs((f10 * sideSheetBehavior.f11782k) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f10 * sideSheetBehavior.f11782k) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }
}
