package B3;

import M0.C0219j;
import T.G0;
import T.L0;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes2.dex */
public final class q extends h {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f302a;
    public final G0 b;

    /* renamed from: c, reason: collision with root package name */
    public Window f303c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f304d;

    public q(View view, G0 g02) {
        ColorStateList backgroundTintList;
        Integer num;
        this.b = g02;
        R3.g gVar = BottomSheetBehavior.A(view).f13951i;
        if (gVar != null) {
            backgroundTintList = gVar.b.f2644c;
        } else {
            backgroundTintList = ViewCompat.getBackgroundTintList(view);
        }
        if (backgroundTintList != null) {
            this.f302a = Boolean.valueOf(C0219j.s(backgroundTintList.getDefaultColor()));
            return;
        }
        ColorStateList n2 = F2.h.n(view.getBackground());
        if (n2 != null) {
            num = Integer.valueOf(n2.getDefaultColor());
        } else {
            num = null;
        }
        if (num != null) {
            this.f302a = Boolean.valueOf(C0219j.s(num.intValue()));
        } else {
            this.f302a = null;
        }
    }

    @Override // B3.h
    public final void a(View view) {
        d(view);
    }

    @Override // B3.h
    public final void b(View view) {
        d(view);
    }

    @Override // B3.h
    public final void c(View view, int i9) {
        d(view);
    }

    public final void d(View view) {
        boolean booleanValue;
        int top = view.getTop();
        G0 g02 = this.b;
        if (top < g02.d()) {
            Window window = this.f303c;
            if (window != null) {
                Boolean bool = this.f302a;
                if (bool == null) {
                    booleanValue = this.f304d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                new L0(window, window.getDecorView()).f2869a.V(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), g02.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f303c;
            if (window2 != null) {
                new L0(window2, window2.getDecorView()).f2869a.V(this.f304d);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        if (this.f303c == window) {
            return;
        }
        this.f303c = window;
        if (window != null) {
            this.f304d = new L0(window, window.getDecorView()).f2869a.P();
        }
    }
}
