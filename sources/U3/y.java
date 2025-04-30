package U3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.core.view.ViewCompat;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class y implements TextWatcher {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f3241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f3242d;

    public y(TextInputLayout textInputLayout, EditText editText) {
        this.f3242d = textInputLayout;
        this.f3241c = editText;
        this.b = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f3242d;
        textInputLayout.u(!textInputLayout.f14137C0, false);
        if (textInputLayout.m) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f14192u) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f3241c;
        int lineCount = editText.getLineCount();
        int i9 = this.b;
        if (lineCount != i9) {
            if (lineCount < i9) {
                int minimumHeight = ViewCompat.getMinimumHeight(editText);
                int i10 = textInputLayout.f14195v0;
                if (minimumHeight != i10) {
                    editText.setMinimumHeight(i10);
                }
            }
            this.b = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
