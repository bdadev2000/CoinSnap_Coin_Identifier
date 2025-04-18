package na;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.plantcare.ai.identifier.plantid.R;

/* loaded from: classes3.dex */
public final class t extends n {

    /* renamed from: e, reason: collision with root package name */
    public final int f22698e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f22699f;

    /* renamed from: g, reason: collision with root package name */
    public final z2.b f22700g;

    public t(m mVar, int i10) {
        super(mVar);
        this.f22698e = R.drawable.design_password_eye;
        this.f22700g = new z2.b(this, 7);
        if (i10 != 0) {
            this.f22698e = i10;
        }
    }

    @Override // na.n
    public final void b() {
        q();
    }

    @Override // na.n
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // na.n
    public final int d() {
        return this.f22698e;
    }

    @Override // na.n
    public final View.OnClickListener f() {
        return this.f22700g;
    }

    @Override // na.n
    public final boolean k() {
        return true;
    }

    @Override // na.n
    public final boolean l() {
        boolean z10;
        EditText editText = this.f22699f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // na.n
    public final void m(EditText editText) {
        this.f22699f = editText;
        q();
    }

    @Override // na.n
    public final void r() {
        boolean z10;
        EditText editText = this.f22699f;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f22699f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // na.n
    public final void s() {
        EditText editText = this.f22699f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
