package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiEditTextHelper;

/* loaded from: classes2.dex */
class AppCompatEmojiEditTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f980a;

    /* renamed from: b, reason: collision with root package name */
    public final EmojiEditTextHelper f981b;

    public AppCompatEmojiEditTextHelper(EditText editText) {
        this.f980a = editText;
        this.f981b = new EmojiEditTextHelper(editText);
    }

    public final KeyListener a(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? this.f981b.a(keyListener) : keyListener;
    }

    public final void b(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f980a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f317i, i2, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            this.f981b.d(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
