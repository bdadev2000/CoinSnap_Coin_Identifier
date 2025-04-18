package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public abstract class ActionBar {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface DisplayOptions {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface NavigationMode {
    }

    /* loaded from: classes.dex */
    public interface OnMenuVisibilityListener {
        void a();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface OnNavigationListener {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class Tab {
        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d();

        public abstract void e();
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface TabListener {
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(boolean z2) {
    }

    public abstract int i();

    public Context j() {
        return null;
    }

    public boolean k() {
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public boolean n(int i2, KeyEvent keyEvent) {
        return false;
    }

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public void q(boolean z2) {
    }

    public void r(boolean z2) {
    }

    public void s(CharSequence charSequence) {
    }

    public ActionMode t(ActionMode.Callback callback) {
        return null;
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f333a;

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f333a = 0;
            this.f333a = layoutParams.f333a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f333a = 0;
        }
    }
}
