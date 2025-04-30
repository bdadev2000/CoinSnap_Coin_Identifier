package l0;

import U4.y;
import a5.C0398b;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21542a;
    public final C0398b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [a5.b, java.lang.Object] */
    public b(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i9;
        ?? obj = new Object();
        this.f21542a = textView;
        this.b = obj;
        if (j0.j.f20971k != null) {
            j0.j a6 = j0.j.a();
            if (a6.b() == 1 && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                j0.f fVar = a6.f20975e;
                fVar.getClass();
                Bundle bundle = editorInfo.extras;
                k0.b bVar = (k0.b) ((y) fVar.b).f3334a;
                int a9 = bVar.a(4);
                if (a9 != 0) {
                    i9 = bVar.b.getInt(a9 + bVar.f21396a);
                } else {
                    i9 = 0;
                }
                bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i9);
                Bundle bundle2 = editorInfo.extras;
                ((j0.j) fVar.f20969c).getClass();
                bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i9, int i10) {
        Editable editableText = this.f21542a.getEditableText();
        this.b.getClass();
        if (!C0398b.x(this, editableText, i9, i10, false) && !super.deleteSurroundingText(i9, i10)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i9, int i10) {
        Editable editableText = this.f21542a.getEditableText();
        this.b.getClass();
        if (C0398b.x(this, editableText, i9, i10, true) || super.deleteSurroundingTextInCodePoints(i9, i10)) {
            return true;
        }
        return false;
    }
}
