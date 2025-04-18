package k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.core.view.ViewCompat;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes.dex */
public class a0 {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final o f20042b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20043c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20044d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20045e;

    /* renamed from: f, reason: collision with root package name */
    public View f20046f;

    /* renamed from: g, reason: collision with root package name */
    public int f20047g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20048h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f20049i;

    /* renamed from: j, reason: collision with root package name */
    public x f20050j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f20051k;

    /* renamed from: l, reason: collision with root package name */
    public final y f20052l;

    public a0(Context context, o oVar, View view, boolean z10) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, oVar, z10);
    }

    public final x a() {
        boolean z10;
        x h0Var;
        if (this.f20050j == null) {
            Context context = this.a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            z.a(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                h0Var = new i(this.a, this.f20046f, this.f20044d, this.f20045e, this.f20043c);
            } else {
                Context context2 = this.a;
                o oVar = this.f20042b;
                h0Var = new h0(this.f20044d, this.f20045e, context2, this.f20046f, oVar, this.f20043c);
            }
            h0Var.j(this.f20042b);
            h0Var.q(this.f20052l);
            h0Var.l(this.f20046f);
            h0Var.g(this.f20049i);
            h0Var.n(this.f20048h);
            h0Var.o(this.f20047g);
            this.f20050j = h0Var;
        }
        return this.f20050j;
    }

    public final boolean b() {
        x xVar = this.f20050j;
        return xVar != null && xVar.a();
    }

    public void c() {
        this.f20050j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f20051k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z10, boolean z11) {
        x a = a();
        a.r(z11);
        if (z10) {
            if ((Gravity.getAbsoluteGravity(this.f20047g, ViewCompat.getLayoutDirection(this.f20046f)) & 7) == 5) {
                i10 -= this.f20046f.getWidth();
            }
            a.p(i10);
            a.s(i11);
            int i12 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f20182b = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        a.show();
    }

    public a0(int i10, int i11, Context context, View view, o oVar, boolean z10) {
        this.f20047g = 8388611;
        this.f20052l = new y(this);
        this.a = context;
        this.f20042b = oVar;
        this.f20046f = view;
        this.f20043c = z10;
        this.f20044d = i10;
        this.f20045e = i11;
    }
}
