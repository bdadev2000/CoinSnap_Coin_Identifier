package androidx.compose.ui.text.android.selection;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;

@StabilityInferred
/* loaded from: classes4.dex */
public final class WordIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17137a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17138b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17139c;
    public final BreakIterator d;

    /* loaded from: classes4.dex */
    public static final class Companion {
        public static boolean a(int i2) {
            int type = Character.getType(i2);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }

    public WordIterator(CharSequence charSequence, int i2, Locale locale) {
        this.f17137a = charSequence;
        if (charSequence.length() < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        if (i2 < 0 || i2 > charSequence.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.d = wordInstance;
        this.f17138b = Math.max(0, -50);
        this.f17139c = Math.min(charSequence.length(), i2 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i2));
    }

    public final void a(int i2) {
        int i3 = this.f17138b;
        int i4 = this.f17139c;
        if (i2 > i4 || i3 > i2) {
            throw new IllegalArgumentException(d.o(d.u("Invalid offset: ", i2, ". Valid range is [", i3, " , "), i4, ']').toString());
        }
    }

    public final boolean b(int i2) {
        return i2 <= this.f17139c && this.f17138b + 1 <= i2 && Character.isLetterOrDigit(Character.codePointBefore(this.f17137a, i2));
    }

    public final boolean c(int i2) {
        int i3 = this.f17138b + 1;
        if (i2 > this.f17139c || i3 > i2) {
            return false;
        }
        return Companion.a(Character.codePointBefore(this.f17137a, i2));
    }

    public final boolean d(int i2) {
        return i2 < this.f17139c && this.f17138b <= i2 && Character.isLetterOrDigit(Character.codePointAt(this.f17137a, i2));
    }

    public final boolean e(int i2) {
        if (i2 >= this.f17139c || this.f17138b > i2) {
            return false;
        }
        return Companion.a(Character.codePointAt(this.f17137a, i2));
    }
}
