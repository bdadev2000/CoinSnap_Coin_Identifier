package v9;

import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.j2;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.plantcare.ai.identifier.plantid.R;
import h.i0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class g extends i0 {

    /* renamed from: h, reason: collision with root package name */
    public BottomSheetBehavior f26358h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f26359i;

    /* renamed from: j, reason: collision with root package name */
    public CoordinatorLayout f26360j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f26361k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f26362l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f26363m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26364n;

    /* renamed from: o, reason: collision with root package name */
    public f f26365o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26366p;

    /* renamed from: q, reason: collision with root package name */
    public fa.f f26367q;

    /* renamed from: r, reason: collision with root package name */
    public final e f26368r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968755(0x7f0400b3, float:1.7546173E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132017847(0x7f1402b7, float:1.9673984E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f26362l = r0
            r3.f26363m = r0
            v9.e r4 = new v9.e
            r5 = 0
            r4.<init>(r3, r5)
            r3.f26368r = r4
            h.r r4 = r3.f()
            r4.i(r0)
            r3.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v9.g.<init>(android.content.Context, int):void");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f26358h == null) {
            h();
        }
        super.cancel();
    }

    public final void h() {
        if (this.f26359i == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f26359i = frameLayout;
            this.f26360j = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f26359i.findViewById(R.id.design_bottom_sheet);
            this.f26361k = frameLayout2;
            BottomSheetBehavior B = BottomSheetBehavior.B(frameLayout2);
            this.f26358h = B;
            ArrayList arrayList = B.Y;
            e eVar = this.f26368r;
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
            this.f26358h.G(this.f26362l);
            this.f26367q = new fa.f(this.f26358h, this.f26361k);
        }
    }

    public final void i() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.f26366p = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public final FrameLayout j(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        h();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f26359i.findViewById(R.id.coordinator);
        if (i10 != 0 && view == null) {
            view = getLayoutInflater().inflate(i10, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f26366p) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f26361k, new v3.c(this, 29));
        }
        this.f26361k.removeAllViews();
        if (layoutParams == null) {
            this.f26361k.addView(view);
        } else {
            this.f26361k.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new h.b(this, 4));
        ViewCompat.setAccessibilityDelegate(this.f26361k, new d(this, 0));
        this.f26361k.setOnTouchListener(new j2(this, 1));
        return this.f26359i;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f26366p && Color.alpha(window.getNavigationBarColor()) < 255) {
                z10 = true;
            } else {
                z10 = false;
            }
            FrameLayout frameLayout = this.f26359i;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z10);
            }
            CoordinatorLayout coordinatorLayout = this.f26360j;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z10);
            }
            com.bumptech.glide.e.R(window, !z10);
            f fVar = this.f26365o;
            if (fVar != null) {
                fVar.e(window);
            }
        }
        fa.f fVar2 = this.f26367q;
        if (fVar2 != null) {
            boolean z11 = this.f26362l;
            View view = fVar2.f17761c;
            fa.c cVar = fVar2.a;
            if (z11) {
                if (cVar != null) {
                    cVar.b(fVar2.f17760b, view, false);
                }
            } else if (cVar != null) {
                cVar.c(view);
            }
        }
    }

    @Override // h.i0, androidx.activity.o, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        fa.c cVar;
        f fVar = this.f26365o;
        if (fVar != null) {
            fVar.e(null);
        }
        fa.f fVar2 = this.f26367q;
        if (fVar2 != null && (cVar = fVar2.a) != null) {
            cVar.c(fVar2.f17761c);
        }
    }

    @Override // androidx.activity.o, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f26358h;
        if (bottomSheetBehavior != null && bottomSheetBehavior.N == 5) {
            bottomSheetBehavior.I(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z10) {
        fa.f fVar;
        super.setCancelable(z10);
        if (this.f26362l != z10) {
            this.f26362l = z10;
            BottomSheetBehavior bottomSheetBehavior = this.f26358h;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z10);
            }
            if (getWindow() != null && (fVar = this.f26367q) != null) {
                boolean z11 = this.f26362l;
                View view = fVar.f17761c;
                fa.c cVar = fVar.a;
                if (z11) {
                    if (cVar != null) {
                        cVar.b(fVar.f17760b, view, false);
                    }
                } else if (cVar != null) {
                    cVar.c(view);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z10) {
        super.setCanceledOnTouchOutside(z10);
        if (z10 && !this.f26362l) {
            this.f26362l = true;
        }
        this.f26363m = z10;
        this.f26364n = true;
    }

    @Override // h.i0, androidx.activity.o, android.app.Dialog
    public final void setContentView(int i10) {
        super.setContentView(j(null, i10, null));
    }

    @Override // h.i0, androidx.activity.o, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(j(view, 0, null));
    }

    @Override // h.i0, androidx.activity.o, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(j(view, 0, layoutParams));
    }
}
