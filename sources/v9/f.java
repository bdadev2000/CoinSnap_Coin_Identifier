package v9;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import c6.k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import n0.r2;
import n0.w2;
import v8.u0;

/* loaded from: classes3.dex */
public final class f extends b {
    public final Boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final r2 f26355b;

    /* renamed from: c, reason: collision with root package name */
    public Window f26356c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f26357d;

    public f(FrameLayout frameLayout, r2 r2Var) {
        ColorStateList backgroundTintList;
        Integer num;
        this.f26355b = r2Var;
        ka.i iVar = BottomSheetBehavior.B(frameLayout).f11581i;
        if (iVar != null) {
            backgroundTintList = iVar.f20557b.f20538d;
        } else {
            backgroundTintList = ViewCompat.getBackgroundTintList(frameLayout);
        }
        if (backgroundTintList != null) {
            this.a = Boolean.valueOf(u0.I(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList n10 = k.n(frameLayout.getBackground());
        if (n10 != null) {
            num = Integer.valueOf(n10.getDefaultColor());
        } else {
            num = null;
        }
        if (num != null) {
            this.a = Boolean.valueOf(u0.I(num.intValue()));
        } else {
            this.a = null;
        }
    }

    @Override // v9.b
    public final void a(View view) {
        d(view);
    }

    @Override // v9.b
    public final void b(View view) {
        d(view);
    }

    @Override // v9.b
    public final void c(int i10, View view) {
        d(view);
    }

    public final void d(View view) {
        boolean booleanValue;
        int top = view.getTop();
        r2 r2Var = this.f26355b;
        if (top < r2Var.e()) {
            Window window = this.f26356c;
            if (window != null) {
                Boolean bool = this.a;
                if (bool == null) {
                    booleanValue = this.f26357d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                new w2(window, window.getDecorView()).a.s(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), r2Var.e() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f26356c;
            if (window2 != null) {
                new w2(window2, window2.getDecorView()).a.s(this.f26357d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f26356c == window) {
            return;
        }
        this.f26356c = window;
        if (window != null) {
            this.f26357d = new w2(window, window.getDecorView()).a.o();
        }
    }
}
