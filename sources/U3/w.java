package U3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes2.dex */
public final class w extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f3230e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f3231f;

    /* renamed from: g, reason: collision with root package name */
    public final A6.c f3232g;

    public w(o oVar, int i9) {
        super(oVar);
        this.f3230e = R.drawable.design_password_eye;
        this.f3232g = new A6.c(this, 5);
        if (i9 != 0) {
            this.f3230e = i9;
        }
    }

    @Override // U3.p
    public final void b() {
        q();
    }

    @Override // U3.p
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // U3.p
    public final int d() {
        return this.f3230e;
    }

    @Override // U3.p
    public final View.OnClickListener f() {
        return this.f3232g;
    }

    @Override // U3.p
    public final boolean k() {
        return true;
    }

    @Override // U3.p
    public final boolean l() {
        boolean z8;
        EditText editText = this.f3231f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z8 = true;
        } else {
            z8 = false;
        }
        return !z8;
    }

    @Override // U3.p
    public final void m(EditText editText) {
        this.f3231f = editText;
        q();
    }

    @Override // U3.p
    public final void r() {
        EditText editText = this.f3231f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f3231f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // U3.p
    public final void s() {
        EditText editText = this.f3231f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
