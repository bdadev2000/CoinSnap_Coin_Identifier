package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import com.cooldev.gba.emulator.gameboy.R;

@RestrictTo
/* loaded from: classes4.dex */
public class MenuPopupHelper implements MenuHelper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f781a;

    /* renamed from: b, reason: collision with root package name */
    public final MenuBuilder f782b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f783c;
    public final int d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public View f784f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f786h;

    /* renamed from: i, reason: collision with root package name */
    public MenuPresenter.Callback f787i;

    /* renamed from: j, reason: collision with root package name */
    public MenuPopup f788j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f789k;

    /* renamed from: g, reason: collision with root package name */
    public int f785g = 8388611;

    /* renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f790l = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.view.menu.MenuPopupHelper.1
        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            MenuPopupHelper.this.c();
        }
    };

    public MenuPopupHelper(int i2, int i3, Context context, View view, MenuBuilder menuBuilder, boolean z2) {
        this.f781a = context;
        this.f782b = menuBuilder;
        this.f784f = view;
        this.f783c = z2;
        this.d = i2;
        this.e = i3;
    }

    public final MenuPopup a() {
        MenuPopup standardMenuPopup;
        if (this.f788j == null) {
            Context context = this.f781a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                standardMenuPopup = new CascadingMenuPopup(this.f781a, this.f784f, this.d, this.e, this.f783c);
            } else {
                Context context2 = this.f781a;
                MenuBuilder menuBuilder = this.f782b;
                standardMenuPopup = new StandardMenuPopup(this.d, this.e, context2, this.f784f, menuBuilder, this.f783c);
            }
            standardMenuPopup.b(this.f782b);
            standardMenuPopup.h(this.f790l);
            standardMenuPopup.d(this.f784f);
            standardMenuPopup.setCallback(this.f787i);
            standardMenuPopup.e(this.f786h);
            standardMenuPopup.f(this.f785g);
            this.f788j = standardMenuPopup;
        }
        return this.f788j;
    }

    public final boolean b() {
        MenuPopup menuPopup = this.f788j;
        return menuPopup != null && menuPopup.a();
    }

    public void c() {
        this.f788j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f789k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z2) {
        this.f786h = z2;
        MenuPopup menuPopup = this.f788j;
        if (menuPopup != null) {
            menuPopup.e(z2);
        }
    }

    public final void e(int i2, int i3, boolean z2, boolean z3) {
        MenuPopup a2 = a();
        a2.i(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f785g, this.f784f.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f784f.getWidth();
            }
            a2.g(i2);
            a2.j(i3);
            int i4 = (int) ((this.f781a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f780a = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        a2.show();
    }
}
