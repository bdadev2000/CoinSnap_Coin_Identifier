package na;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class l {
    public final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        m mVar = this.a;
        if (mVar.u == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = mVar.u;
        k kVar = mVar.f22655x;
        if (editText != null) {
            editText.removeTextChangedListener(kVar);
            if (mVar.u.getOnFocusChangeListener() == mVar.b().e()) {
                mVar.u.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        mVar.u = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(kVar);
        }
        mVar.b().m(mVar.u);
        mVar.j(mVar.b());
    }
}
