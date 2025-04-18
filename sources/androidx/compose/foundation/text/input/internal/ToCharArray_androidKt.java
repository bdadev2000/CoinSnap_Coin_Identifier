package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldCharSequence;

/* loaded from: classes2.dex */
public final class ToCharArray_androidKt {
    public static final void a(CharSequence charSequence, char[] cArr, int i2, int i3, int i4) {
        if (charSequence instanceof TextFieldCharSequence) {
            a(((TextFieldCharSequence) charSequence).f6297a, cArr, i2, i3, i4);
            return;
        }
        while (i3 < i4) {
            cArr[i2] = charSequence.charAt(i3);
            i3++;
            i2++;
        }
    }
}
