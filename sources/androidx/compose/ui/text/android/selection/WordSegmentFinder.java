package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class WordSegmentFinder implements SegmentFinder {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17140a;

    /* renamed from: b, reason: collision with root package name */
    public final WordIterator f17141b;

    public WordSegmentFinder(CharSequence charSequence, WordIterator wordIterator) {
        this.f17140a = charSequence;
        this.f17141b = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int a(int i2) {
        CharSequence charSequence;
        do {
            WordIterator wordIterator = this.f17141b;
            wordIterator.a(i2);
            i2 = wordIterator.d.following(i2);
            if (i2 != -1) {
                charSequence = this.f17140a;
                if (i2 == charSequence.length()) {
                }
            }
            return -1;
        } while (Character.isWhitespace(charSequence.charAt(i2)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int b(int i2) {
        do {
            WordIterator wordIterator = this.f17141b;
            wordIterator.a(i2);
            i2 = wordIterator.d.preceding(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f17140a.charAt(i2)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int c(int i2) {
        do {
            WordIterator wordIterator = this.f17141b;
            wordIterator.a(i2);
            i2 = wordIterator.d.following(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.f17140a.charAt(i2 - 1)));
        return i2;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public final int d(int i2) {
        do {
            WordIterator wordIterator = this.f17141b;
            wordIterator.a(i2);
            i2 = wordIterator.d.preceding(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.f17140a.charAt(i2 - 1)));
        return i2;
    }
}
