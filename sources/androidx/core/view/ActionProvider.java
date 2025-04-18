package androidx.core.view;

import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ShareActionProvider;

/* loaded from: classes2.dex */
public abstract class ActionProvider {

    /* renamed from: a, reason: collision with root package name */
    public SubUiVisibilityListener f18689a;

    /* renamed from: b, reason: collision with root package name */
    public VisibilityListener f18690b;

    @RestrictTo
    /* loaded from: classes2.dex */
    public interface SubUiVisibilityListener {
        void a(boolean z2);
    }

    /* loaded from: classes2.dex */
    public interface VisibilityListener {
        void a();
    }

    public boolean a() {
        return this instanceof ShareActionProvider;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenuBuilder subMenuBuilder) {
    }

    public boolean g() {
        return false;
    }

    public void h(VisibilityListener visibilityListener) {
        if (this.f18690b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f18690b = visibilityListener;
    }
}
