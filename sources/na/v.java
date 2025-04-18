package na;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class v implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public int f22711b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EditText f22712c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f22713d;

    public v(TextInputLayout textInputLayout, EditText editText) {
        this.f22713d = textInputLayout;
        this.f22712c = editText;
        this.f22711b = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f22713d;
        textInputLayout.u(!textInputLayout.C0, false);
        if (textInputLayout.f11822m) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.u) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f22712c;
        int lineCount = editText.getLineCount();
        int i10 = this.f22711b;
        if (lineCount != i10) {
            if (lineCount < i10) {
                int minimumHeight = editText.getMinimumHeight();
                int i11 = textInputLayout.f11840v0;
                if (minimumHeight != i11) {
                    editText.setMinimumHeight(i11);
                }
            }
            this.f22711b = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
