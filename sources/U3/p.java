package U3;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3188a;
    public final o b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3189c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f3190d;

    public p(o oVar) {
        this.f3188a = oVar.b;
        this.b = oVar;
        this.f3189c = oVar.getContext();
        this.f3190d = oVar.f3174i;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public F2.d h() {
        return null;
    }

    public boolean i(int i9) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof k;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(U.i iVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z8) {
    }
}
