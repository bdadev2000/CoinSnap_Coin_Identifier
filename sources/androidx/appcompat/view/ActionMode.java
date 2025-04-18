package androidx.appcompat.view;

import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes4.dex */
public abstract class ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public Object f594a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f595b;

    /* loaded from: classes4.dex */
    public interface Callback {
        void a(ActionMode actionMode);

        boolean b(ActionMode actionMode, MenuBuilder menuBuilder);

        boolean c(ActionMode actionMode, MenuItem menuItem);

        boolean d(ActionMode actionMode, MenuBuilder menuBuilder);
    }

    public abstract void a();

    public abstract View b();

    public abstract MenuBuilder c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public abstract CharSequence f();

    public abstract void g();

    public boolean h() {
        return false;
    }

    public abstract void i(View view);

    public abstract void j(int i2);

    public abstract void k(CharSequence charSequence);

    public abstract void l(int i2);

    public abstract void m(CharSequence charSequence);

    public void n(boolean z2) {
        this.f595b = z2;
    }
}
