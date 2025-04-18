package e1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final ac.e f17074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z10;
        ac.e eVar = new ac.e();
        this.a = editText;
        this.f17074b = eVar;
        if (androidx.emoji2.text.l.f1504j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            androidx.emoji2.text.l a = androidx.emoji2.text.l.a();
            if ((a.b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                a.f1508e.G(editorInfo);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.a.getEditableText();
        this.f17074b.getClass();
        if (!ac.e.n(this, editableText, i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.a.getEditableText();
        this.f17074b.getClass();
        if (ac.e.n(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}
