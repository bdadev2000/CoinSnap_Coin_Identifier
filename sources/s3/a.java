package S3;

import F2.h;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class a extends h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2799c;

    /* renamed from: d, reason: collision with root package name */
    public final SideSheetBehavior f2800d;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i9) {
        this.f2799c = i9;
        this.f2800d = sideSheetBehavior;
    }

    @Override // F2.h
    public final boolean A(float f9, float f10) {
        switch (this.f2799c) {
            case 0:
                if (Math.abs(f9) > Math.abs(f10)) {
                    float abs = Math.abs(f9);
                    this.f2800d.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f9) > Math.abs(f10)) {
                    float abs2 = Math.abs(f9);
                    this.f2800d.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // F2.h
    public final boolean S(View view, float f9) {
        switch (this.f2799c) {
            case 0:
                if (Math.abs((f9 * this.f2800d.f14115k) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f9 * this.f2800d.f14115k) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    @Override // F2.h
    public final void Y(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
        switch (this.f2799c) {
            case 0:
                marginLayoutParams.leftMargin = i9;
                return;
            default:
                marginLayoutParams.rightMargin = i9;
                return;
        }
    }

    @Override // F2.h
    public final void Z(ViewGroup.MarginLayoutParams marginLayoutParams, int i9, int i10) {
        switch (this.f2799c) {
            case 0:
                if (i9 <= this.f2800d.m) {
                    marginLayoutParams.leftMargin = i10;
                    return;
                }
                return;
            default:
                int i11 = this.f2800d.m;
                if (i9 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i9;
                    return;
                }
                return;
        }
    }

    @Override // F2.h
    public final int d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2799c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // F2.h
    public final float e(int i9) {
        switch (this.f2799c) {
            case 0:
                float q9 = q();
                return (i9 - q9) / (p() - q9);
            default:
                float f9 = this.f2800d.m;
                return (f9 - i9) / (f9 - p());
        }
    }

    @Override // F2.h
    public final int o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2799c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // F2.h
    public final int p() {
        switch (this.f2799c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2800d;
                return Math.max(0, sideSheetBehavior.f14116n + sideSheetBehavior.f14117o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2800d;
                return Math.max(0, (sideSheetBehavior2.m - sideSheetBehavior2.l) - sideSheetBehavior2.f14117o);
        }
    }

    @Override // F2.h
    public final int q() {
        switch (this.f2799c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2800d;
                return (-sideSheetBehavior.l) - sideSheetBehavior.f14117o;
            default:
                return this.f2800d.m;
        }
    }

    @Override // F2.h
    public final int r() {
        switch (this.f2799c) {
            case 0:
                return this.f2800d.f14117o;
            default:
                return this.f2800d.m;
        }
    }

    @Override // F2.h
    public final int s() {
        switch (this.f2799c) {
            case 0:
                return -this.f2800d.l;
            default:
                return p();
        }
    }

    @Override // F2.h
    public final int t(View view) {
        switch (this.f2799c) {
            case 0:
                return view.getRight() + this.f2800d.f14117o;
            default:
                return view.getLeft() - this.f2800d.f14117o;
        }
    }

    @Override // F2.h
    public final int u(CoordinatorLayout coordinatorLayout) {
        switch (this.f2799c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // F2.h
    public final int v() {
        switch (this.f2799c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // F2.h
    public final boolean y(float f9) {
        switch (this.f2799c) {
            case 0:
                return f9 > 0.0f;
            default:
                return f9 < 0.0f;
        }
    }

    @Override // F2.h
    public final boolean z(View view) {
        switch (this.f2799c) {
            case 0:
                if (view.getRight() < (p() - q()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (p() + this.f2800d.m) / 2) {
                    return true;
                }
                return false;
        }
    }
}
