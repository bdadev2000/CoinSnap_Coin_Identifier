package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f726b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f727c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f728d;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f729f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f730g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f731h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f732i;

    /* renamed from: j, reason: collision with root package name */
    public p1 f733j;

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f732i = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f730g == null) {
            this.f730g = new TypedValue();
        }
        return this.f730g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f731h == null) {
            this.f731h = new TypedValue();
        }
        return this.f731h;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f728d == null) {
            this.f728d = new TypedValue();
        }
        return this.f728d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f729f == null) {
            this.f729f = new TypedValue();
        }
        return this.f729f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f726b == null) {
            this.f726b = new TypedValue();
        }
        return this.f726b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f727c == null) {
            this.f727c = new TypedValue();
        }
        return this.f727c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p1 p1Var = this.f733j;
        if (p1Var != null) {
            p1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m mVar;
        super.onDetachedFromWindow();
        p1 p1Var = this.f733j;
        if (p1Var != null) {
            h.g0 g0Var = (h.g0) ((kc.c) p1Var).f20640c;
            q1 q1Var = g0Var.f18588t;
            if (q1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) q1Var;
                actionBarOverlayLayout.l();
                ActionMenuView actionMenuView = ((z3) actionBarOverlayLayout.f695g).a.f772b;
                if (actionMenuView != null && (mVar = actionMenuView.f717v) != null) {
                    mVar.j();
                    h hVar = mVar.f934v;
                    if (hVar != null && hVar.b()) {
                        hVar.f20050j.dismiss();
                    }
                }
            }
            if (g0Var.f18592y != null) {
                g0Var.f18582n.getDecorView().removeCallbacks(g0Var.f18593z);
                if (g0Var.f18592y.isShowing()) {
                    try {
                        g0Var.f18592y.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                g0Var.f18592y = null;
            }
            n0.r1 r1Var = g0Var.A;
            if (r1Var != null) {
                r1Var.b();
            }
            k.o oVar = g0Var.A(0).f18558h;
            if (oVar != null) {
                oVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(p1 p1Var) {
        this.f733j = p1Var;
    }
}
