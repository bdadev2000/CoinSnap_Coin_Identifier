package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.WeakReference;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
final class EmojiTextWatcher implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f19608a;

    /* renamed from: c, reason: collision with root package name */
    public EmojiCompat.InitCallback f19610c;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19609b = false;
    public boolean d = true;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class InitCallbackImpl extends EmojiCompat.InitCallback {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f19611a;

        public InitCallbackImpl(EditText editText) {
            this.f19611a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.EmojiCompat.InitCallback
        public final void b() {
            EmojiTextWatcher.a((EditText) this.f19611a.get(), 1);
        }
    }

    public EmojiTextWatcher(EditText editText) {
        this.f19608a = editText;
    }

    public static void a(EditText editText, int i2) {
        int length;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            EmojiCompat a2 = EmojiCompat.a();
            if (editableText == null) {
                length = 0;
            } else {
                a2.getClass();
                length = editableText.length();
            }
            a2.k(0, length, editableText, 0);
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
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        EditText editText = this.f19608a;
        if (editText.isInEditMode() || !this.d) {
            return;
        }
        if ((this.f19609b || EmojiCompat.g()) && i3 <= i4 && (charSequence instanceof Spannable)) {
            int d = EmojiCompat.a().d();
            if (d != 0) {
                if (d == 1) {
                    EmojiCompat.a().k(i2, i4 + i2, (Spannable) charSequence, 0);
                    return;
                } else if (d != 3) {
                    return;
                }
            }
            EmojiCompat a2 = EmojiCompat.a();
            if (this.f19610c == null) {
                this.f19610c = new InitCallbackImpl(editText);
            }
            a2.l(this.f19610c);
        }
    }
}
