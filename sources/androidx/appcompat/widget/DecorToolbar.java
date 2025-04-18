package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.view.ViewPropertyAnimatorCompat;

@RestrictTo
/* loaded from: classes2.dex */
public interface DecorToolbar {
    boolean a();

    void b(MenuBuilder menuBuilder, MenuPresenter.Callback callback);

    boolean c();

    void collapseActionView();

    boolean d();

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i2);

    void j();

    ViewPropertyAnimatorCompat k(int i2, long j2);

    void l();

    void m(boolean z2);

    void n();

    void o();

    void p();

    void q(int i2);

    void r(int i2);

    int s();

    void setIcon(int i2);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();
}
