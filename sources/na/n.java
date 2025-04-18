package na;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public abstract class n {
    public final TextInputLayout a;

    /* renamed from: b, reason: collision with root package name */
    public final m f22656b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f22657c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f22658d;

    public n(m mVar) {
        this.a = mVar.f22635b;
        this.f22656b = mVar;
        this.f22657c = mVar.getContext();
        this.f22658d = mVar.f22641i;
    }

    public void a() {
    }

    public void b() {
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

    public androidx.core.app.h h() {
        return null;
    }

    public boolean i(int i10) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof j;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(o0.j jVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z10) {
    }

    public final void q() {
        this.f22656b.f(false);
    }

    public abstract void r();

    public void s() {
    }
}
