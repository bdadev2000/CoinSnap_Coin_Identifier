package p;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22158a;
    public final MenuC2533l b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22159c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22160d;

    /* renamed from: e, reason: collision with root package name */
    public final int f22161e;

    /* renamed from: f, reason: collision with root package name */
    public View f22162f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22164h;

    /* renamed from: i, reason: collision with root package name */
    public w f22165i;

    /* renamed from: j, reason: collision with root package name */
    public t f22166j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f22167k;

    /* renamed from: g, reason: collision with root package name */
    public int f22163g = 8388611;
    public final u l = new u(this);

    public v(int i9, int i10, Context context, View view, MenuC2533l menuC2533l, boolean z8) {
        this.f22158a = context;
        this.b = menuC2533l;
        this.f22162f = view;
        this.f22159c = z8;
        this.f22160d = i9;
        this.f22161e = i10;
    }

    public final t a() {
        t viewOnKeyListenerC2520C;
        if (this.f22166j == null) {
            Context context = this.f22158a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC2520C = new ViewOnKeyListenerC2527f(this.f22158a, this.f22162f, this.f22160d, this.f22161e, this.f22159c);
            } else {
                View view = this.f22162f;
                int i9 = this.f22161e;
                boolean z8 = this.f22159c;
                viewOnKeyListenerC2520C = new ViewOnKeyListenerC2520C(this.f22160d, i9, this.f22158a, view, this.b, z8);
            }
            viewOnKeyListenerC2520C.k(this.b);
            viewOnKeyListenerC2520C.q(this.l);
            viewOnKeyListenerC2520C.m(this.f22162f);
            viewOnKeyListenerC2520C.e(this.f22165i);
            viewOnKeyListenerC2520C.n(this.f22164h);
            viewOnKeyListenerC2520C.o(this.f22163g);
            this.f22166j = viewOnKeyListenerC2520C;
        }
        return this.f22166j;
    }

    public final boolean b() {
        t tVar = this.f22166j;
        if (tVar != null && tVar.a()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f22166j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f22167k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i9, int i10, boolean z8, boolean z9) {
        t a6 = a();
        a6.r(z9);
        if (z8) {
            if ((Gravity.getAbsoluteGravity(this.f22163g, this.f22162f.getLayoutDirection()) & 7) == 5) {
                i9 -= this.f22162f.getWidth();
            }
            a6.p(i9);
            a6.s(i10);
            int i11 = (int) ((this.f22158a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a6.b = new Rect(i9 - i11, i10 - i11, i9 + i11, i10 + i11);
        }
        a6.show();
    }
}
