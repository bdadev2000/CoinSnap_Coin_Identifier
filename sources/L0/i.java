package l0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class i implements TextWatcher {
    public final EditText b;

    /* renamed from: d, reason: collision with root package name */
    public h f21551d;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21550c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21552f = true;

    public i(EditText editText) {
        this.b = editText;
    }

    public static void a(EditText editText, int i9) {
        int length;
        if (i9 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j0.j a6 = j0.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                a6.getClass();
                length = editableText.length();
            }
            a6.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        EditText editText = this.b;
        if (!editText.isInEditMode() && this.f21552f) {
            if ((this.f21550c || j0.j.f20971k != null) && i10 <= i11 && (charSequence instanceof Spannable)) {
                int b = j0.j.a().b();
                if (b != 0) {
                    if (b != 1) {
                        if (b != 3) {
                            return;
                        }
                    } else {
                        j0.j.a().f((Spannable) charSequence, i9, i11 + i9);
                        return;
                    }
                }
                j0.j a6 = j0.j.a();
                if (this.f21551d == null) {
                    this.f21551d = new h(editText);
                }
                a6.g(this.f21551d);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
