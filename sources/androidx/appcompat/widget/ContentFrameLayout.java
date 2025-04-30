package androidx.appcompat.widget;

import T.C0275i0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.C1838g;
import k.w;
import p.MenuC2533l;
import q.C2597f;
import q.C2605j;
import q.InterfaceC2600g0;
import q.InterfaceC2602h0;
import q.Y0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f4214c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f4215d;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f4216f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f4217g;

    /* renamed from: h, reason: collision with root package name */
    public TypedValue f4218h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f4219i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC2600g0 f4220j;

    public ContentFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4219i = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4217g == null) {
            this.f4217g = new TypedValue();
        }
        return this.f4217g;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4218h == null) {
            this.f4218h = new TypedValue();
        }
        return this.f4218h;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4215d == null) {
            this.f4215d = new TypedValue();
        }
        return this.f4215d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4216f == null) {
            this.f4216f = new TypedValue();
        }
        return this.f4216f;
    }

    public TypedValue getMinWidthMajor() {
        if (this.b == null) {
            this.b = new TypedValue();
        }
        return this.b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4214c == null) {
            this.f4214c = new TypedValue();
        }
        return this.f4214c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC2600g0 interfaceC2600g0 = this.f4220j;
        if (interfaceC2600g0 != null) {
            interfaceC2600g0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2605j c2605j;
        super.onDetachedFromWindow();
        InterfaceC2600g0 interfaceC2600g0 = this.f4220j;
        if (interfaceC2600g0 != null) {
            w wVar = (w) ((C1838g) interfaceC2600g0).b;
            InterfaceC2602h0 interfaceC2602h0 = wVar.f21384t;
            if (interfaceC2602h0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC2602h0;
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4177g).f22611a.b;
                if (actionMenuView != null && (c2605j = actionMenuView.f4202v) != null) {
                    c2605j.g();
                    C2597f c2597f = c2605j.f22676v;
                    if (c2597f != null && c2597f.b()) {
                        c2597f.f22166j.dismiss();
                    }
                }
            }
            if (wVar.f21389y != null) {
                wVar.f21378n.getDecorView().removeCallbacks(wVar.f21390z);
                if (wVar.f21389y.isShowing()) {
                    try {
                        wVar.f21389y.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                wVar.f21389y = null;
            }
            C0275i0 c0275i0 = wVar.f21345A;
            if (c0275i0 != null) {
                c0275i0.b();
            }
            MenuC2533l menuC2533l = wVar.z(0).f21335h;
            if (menuC2533l != null) {
                menuC2533l.c(true);
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

    public void setAttachListener(InterfaceC2600g0 interfaceC2600g0) {
        this.f4220j = interfaceC2600g0;
    }
}
