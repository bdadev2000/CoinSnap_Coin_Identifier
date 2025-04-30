package U3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f3167a;

    public m(o oVar) {
        this.f3167a = oVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        o oVar = this.f3167a;
        if (oVar.f3184u == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = oVar.f3184u;
        l lVar = oVar.f3187x;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (oVar.f3184u.getOnFocusChangeListener() == oVar.b().e()) {
                oVar.f3184u.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        oVar.f3184u = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        oVar.b().m(oVar.f3184u);
        oVar.j(oVar.b());
    }
}
