package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.emoji2.viewsintegration.EmojiTextViewHelper;

/* loaded from: classes4.dex */
class AppCompatEmojiTextHelper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f982a;

    /* renamed from: b, reason: collision with root package name */
    public final EmojiTextViewHelper f983b;

    public AppCompatEmojiTextHelper(TextView textView) {
        this.f982a = textView;
        this.f983b = new EmojiTextViewHelper(textView);
    }

    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f982a.getContext().obtainStyledAttributes(attributeSet, R.styleable.f317i, i2, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z2) {
        this.f983b.c(z2);
    }

    public final void c(boolean z2) {
        this.f983b.d(z2);
    }
}
