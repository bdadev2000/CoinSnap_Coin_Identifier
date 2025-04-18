package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.text.BreakIterator;

@StabilityInferred
/* loaded from: classes.dex */
public final class AccessibilityIterators {

    @StabilityInferred
    /* loaded from: classes.dex */
    public static abstract class AbstractTextSegmentIterator implements TextSegmentIterator {

        /* renamed from: a, reason: collision with root package name */
        public String f16184a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f16185b = new int[2];

        public final int[] c(int i2, int i3) {
            if (i2 < 0 || i3 < 0 || i2 == i3) {
                return null;
            }
            int[] iArr = this.f16185b;
            iArr[0] = i2;
            iArr[1] = i3;
            return iArr;
        }

        public final String d() {
            String str = this.f16184a;
            if (str != null) {
                return str;
            }
            p0.a.B0("text");
            throw null;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static class CharacterTextSegmentIterator extends AbstractTextSegmentIterator {
        public static CharacterTextSegmentIterator d;

        /* renamed from: c, reason: collision with root package name */
        public BreakIterator f16186c;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i2) {
            int length = d().length();
            if (length <= 0 || i2 >= length) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            do {
                BreakIterator breakIterator = this.f16186c;
                if (breakIterator == null) {
                    p0.a.B0("impl");
                    throw null;
                }
                if (breakIterator.isBoundary(i2)) {
                    BreakIterator breakIterator2 = this.f16186c;
                    if (breakIterator2 == null) {
                        p0.a.B0("impl");
                        throw null;
                    }
                    int following = breakIterator2.following(i2);
                    if (following == -1) {
                        return null;
                    }
                    return c(i2, following);
                }
                BreakIterator breakIterator3 = this.f16186c;
                if (breakIterator3 == null) {
                    p0.a.B0("impl");
                    throw null;
                }
                i2 = breakIterator3.following(i2);
            } while (i2 != -1);
            return null;
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i2) {
            int length = d().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            do {
                BreakIterator breakIterator = this.f16186c;
                if (breakIterator == null) {
                    p0.a.B0("impl");
                    throw null;
                }
                if (breakIterator.isBoundary(i2)) {
                    BreakIterator breakIterator2 = this.f16186c;
                    if (breakIterator2 == null) {
                        p0.a.B0("impl");
                        throw null;
                    }
                    int preceding = breakIterator2.preceding(i2);
                    if (preceding == -1) {
                        return null;
                    }
                    return c(preceding, i2);
                }
                BreakIterator breakIterator3 = this.f16186c;
                if (breakIterator3 == null) {
                    p0.a.B0("impl");
                    throw null;
                }
                i2 = breakIterator3.preceding(i2);
            } while (i2 != -1);
            return null;
        }

        public final void e(String str) {
            this.f16184a = str;
            BreakIterator breakIterator = this.f16186c;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                p0.a.B0("impl");
                throw null;
            }
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class LineTextSegmentIterator extends AbstractTextSegmentIterator {
        public static LineTextSegmentIterator d;

        /* renamed from: c, reason: collision with root package name */
        public TextLayoutResult f16187c;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i2) {
            int i3;
            if (d().length() <= 0 || i2 >= d().length()) {
                return null;
            }
            ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.f17461b;
            if (i2 < 0) {
                TextLayoutResult textLayoutResult = this.f16187c;
                if (textLayoutResult == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                i3 = textLayoutResult.f(0);
            } else {
                TextLayoutResult textLayoutResult2 = this.f16187c;
                if (textLayoutResult2 == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                int f2 = textLayoutResult2.f(i2);
                i3 = e(f2, resolvedTextDirection) == i2 ? f2 : f2 + 1;
            }
            TextLayoutResult textLayoutResult3 = this.f16187c;
            if (textLayoutResult3 == null) {
                p0.a.B0("layoutResult");
                throw null;
            }
            if (i3 >= textLayoutResult3.f17047b.f16914f) {
                return null;
            }
            return c(e(i3, resolvedTextDirection), e(i3, ResolvedTextDirection.f17460a) + 1);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i2) {
            int i3;
            if (d().length() <= 0 || i2 <= 0) {
                return null;
            }
            int length = d().length();
            ResolvedTextDirection resolvedTextDirection = ResolvedTextDirection.f17460a;
            if (i2 > length) {
                TextLayoutResult textLayoutResult = this.f16187c;
                if (textLayoutResult == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                i3 = textLayoutResult.f(d().length());
            } else {
                TextLayoutResult textLayoutResult2 = this.f16187c;
                if (textLayoutResult2 == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                int f2 = textLayoutResult2.f(i2);
                i3 = e(f2, resolvedTextDirection) + 1 == i2 ? f2 : f2 - 1;
            }
            if (i3 < 0) {
                return null;
            }
            return c(e(i3, ResolvedTextDirection.f17461b), e(i3, resolvedTextDirection) + 1);
        }

        public final int e(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.f16187c;
            if (textLayoutResult == null) {
                p0.a.B0("layoutResult");
                throw null;
            }
            int i3 = textLayoutResult.i(i2);
            TextLayoutResult textLayoutResult2 = this.f16187c;
            if (textLayoutResult2 == null) {
                p0.a.B0("layoutResult");
                throw null;
            }
            if (resolvedTextDirection != textLayoutResult2.j(i3)) {
                TextLayoutResult textLayoutResult3 = this.f16187c;
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.i(i2);
                }
                p0.a.B0("layoutResult");
                throw null;
            }
            if (this.f16187c != null) {
                return r6.e(i2, false) - 1;
            }
            p0.a.B0("layoutResult");
            throw null;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class PageTextSegmentIterator extends AbstractTextSegmentIterator {
        public static PageTextSegmentIterator e;

        /* renamed from: c, reason: collision with root package name */
        public TextLayoutResult f16188c;
        public SemanticsNode d;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i2) {
            int i3;
            if (d().length() <= 0 || i2 >= d().length()) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.d;
                if (semanticsNode == null) {
                    p0.a.B0("node");
                    throw null;
                }
                int round = Math.round(semanticsNode.e().e());
                if (i2 <= 0) {
                    i2 = 0;
                }
                TextLayoutResult textLayoutResult = this.f16188c;
                if (textLayoutResult == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                int f2 = textLayoutResult.f(i2);
                TextLayoutResult textLayoutResult2 = this.f16188c;
                if (textLayoutResult2 == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                float d = textLayoutResult2.f17047b.d(f2) + round;
                TextLayoutResult textLayoutResult3 = this.f16188c;
                if (textLayoutResult3 == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                if (d < textLayoutResult3.f17047b.d(r0.f16914f - 1)) {
                    TextLayoutResult textLayoutResult4 = this.f16188c;
                    if (textLayoutResult4 == null) {
                        p0.a.B0("layoutResult");
                        throw null;
                    }
                    i3 = textLayoutResult4.f17047b.c(d);
                } else {
                    TextLayoutResult textLayoutResult5 = this.f16188c;
                    if (textLayoutResult5 == null) {
                        p0.a.B0("layoutResult");
                        throw null;
                    }
                    i3 = textLayoutResult5.f17047b.f16914f;
                }
                return c(i2, e(i3 - 1, ResolvedTextDirection.f17460a) + 1);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i2) {
            int i3;
            if (d().length() <= 0 || i2 <= 0) {
                return null;
            }
            try {
                SemanticsNode semanticsNode = this.d;
                if (semanticsNode == null) {
                    p0.a.B0("node");
                    throw null;
                }
                int round = Math.round(semanticsNode.e().e());
                int length = d().length();
                if (length <= i2) {
                    i2 = length;
                }
                TextLayoutResult textLayoutResult = this.f16188c;
                if (textLayoutResult == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                int f2 = textLayoutResult.f(i2);
                TextLayoutResult textLayoutResult2 = this.f16188c;
                if (textLayoutResult2 == null) {
                    p0.a.B0("layoutResult");
                    throw null;
                }
                float d = textLayoutResult2.f17047b.d(f2) - round;
                if (d > 0.0f) {
                    TextLayoutResult textLayoutResult3 = this.f16188c;
                    if (textLayoutResult3 == null) {
                        p0.a.B0("layoutResult");
                        throw null;
                    }
                    i3 = textLayoutResult3.f17047b.c(d);
                } else {
                    i3 = 0;
                }
                if (i2 == d().length() && i3 < f2) {
                    i3++;
                }
                return c(e(i3, ResolvedTextDirection.f17461b), i2);
            } catch (IllegalStateException unused) {
                return null;
            }
        }

        public final int e(int i2, ResolvedTextDirection resolvedTextDirection) {
            TextLayoutResult textLayoutResult = this.f16188c;
            if (textLayoutResult == null) {
                p0.a.B0("layoutResult");
                throw null;
            }
            int i3 = textLayoutResult.i(i2);
            TextLayoutResult textLayoutResult2 = this.f16188c;
            if (textLayoutResult2 == null) {
                p0.a.B0("layoutResult");
                throw null;
            }
            if (resolvedTextDirection != textLayoutResult2.j(i3)) {
                TextLayoutResult textLayoutResult3 = this.f16188c;
                if (textLayoutResult3 != null) {
                    return textLayoutResult3.i(i2);
                }
                p0.a.B0("layoutResult");
                throw null;
            }
            if (this.f16188c != null) {
                return r6.e(i2, false) - 1;
            }
            p0.a.B0("layoutResult");
            throw null;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ParagraphTextSegmentIterator extends AbstractTextSegmentIterator {

        /* renamed from: c, reason: collision with root package name */
        public static ParagraphTextSegmentIterator f16189c;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int[] a(int r5) {
            /*
                r4 = this;
                java.lang.String r0 = r4.d()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r5 < r0) goto Lf
                return r1
            Lf:
                if (r5 >= 0) goto L12
                r5 = 0
            L12:
                if (r5 >= r0) goto L29
                java.lang.String r2 = r4.d()
                char r2 = r2.charAt(r5)
                r3 = 10
                if (r2 != r3) goto L29
                boolean r2 = r4.f(r5)
                if (r2 != 0) goto L29
                int r5 = r5 + 1
                goto L12
            L29:
                if (r5 < r0) goto L2c
                return r1
            L2c:
                int r1 = r5 + 1
            L2e:
                if (r1 >= r0) goto L39
                boolean r2 = r4.e(r1)
                if (r2 != 0) goto L39
                int r1 = r1 + 1
                goto L2e
            L39:
                int[] r5 = r4.c(r5, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.a(int):int[]");
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
        
            return null;
         */
        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int[] b(int r4) {
            /*
                r3 = this;
                java.lang.String r0 = r3.d()
                int r0 = r0.length()
                r1 = 0
                if (r0 > 0) goto Lc
                return r1
            Lc:
                if (r4 > 0) goto Lf
                return r1
            Lf:
                if (r4 <= r0) goto L12
                r4 = r0
            L12:
                if (r4 <= 0) goto L2b
                java.lang.String r0 = r3.d()
                int r2 = r4 + (-1)
                char r0 = r0.charAt(r2)
                r2 = 10
                if (r0 != r2) goto L2b
                boolean r0 = r3.e(r4)
                if (r0 != 0) goto L2b
                int r4 = r4 + (-1)
                goto L12
            L2b:
                if (r4 > 0) goto L2e
                return r1
            L2e:
                int r0 = r4 + (-1)
            L30:
                if (r0 <= 0) goto L3b
                boolean r1 = r3.f(r0)
                if (r1 != 0) goto L3b
                int r0 = r0 + (-1)
                goto L30
            L3b:
                int[] r4 = r3.c(r0, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator.b(int):int[]");
        }

        public final boolean e(int i2) {
            return i2 > 0 && d().charAt(i2 + (-1)) != '\n' && (i2 == d().length() || d().charAt(i2) == '\n');
        }

        public final boolean f(int i2) {
            return d().charAt(i2) != '\n' && (i2 == 0 || d().charAt(i2 - 1) == '\n');
        }
    }

    /* loaded from: classes.dex */
    public interface TextSegmentIterator {
        int[] a(int i2);

        int[] b(int i2);
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class WordTextSegmentIterator extends AbstractTextSegmentIterator {
        public static WordTextSegmentIterator d;

        /* renamed from: c, reason: collision with root package name */
        public BreakIterator f16190c;

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] a(int i2) {
            if (d().length() <= 0 || i2 >= d().length()) {
                return null;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            while (!g(i2) && (!g(i2) || (i2 != 0 && g(i2 - 1)))) {
                BreakIterator breakIterator = this.f16190c;
                if (breakIterator == null) {
                    p0.a.B0("impl");
                    throw null;
                }
                i2 = breakIterator.following(i2);
                if (i2 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f16190c;
            if (breakIterator2 == null) {
                p0.a.B0("impl");
                throw null;
            }
            int following = breakIterator2.following(i2);
            if (following == -1 || !f(following)) {
                return null;
            }
            return c(i2, following);
        }

        @Override // androidx.compose.ui.platform.AccessibilityIterators.TextSegmentIterator
        public final int[] b(int i2) {
            int length = d().length();
            if (length <= 0 || i2 <= 0) {
                return null;
            }
            if (i2 > length) {
                i2 = length;
            }
            while (i2 > 0 && !g(i2 - 1) && !f(i2)) {
                BreakIterator breakIterator = this.f16190c;
                if (breakIterator == null) {
                    p0.a.B0("impl");
                    throw null;
                }
                i2 = breakIterator.preceding(i2);
                if (i2 == -1) {
                    return null;
                }
            }
            BreakIterator breakIterator2 = this.f16190c;
            if (breakIterator2 == null) {
                p0.a.B0("impl");
                throw null;
            }
            int preceding = breakIterator2.preceding(i2);
            if (preceding == -1 || !g(preceding) || (preceding != 0 && g(preceding - 1))) {
                return null;
            }
            return c(preceding, i2);
        }

        public final void e(String str) {
            this.f16184a = str;
            BreakIterator breakIterator = this.f16190c;
            if (breakIterator != null) {
                breakIterator.setText(str);
            } else {
                p0.a.B0("impl");
                throw null;
            }
        }

        public final boolean f(int i2) {
            return i2 > 0 && g(i2 + (-1)) && (i2 == d().length() || !g(i2));
        }

        public final boolean g(int i2) {
            if (i2 < 0 || i2 >= d().length()) {
                return false;
            }
            return Character.isLetterOrDigit(d().codePointAt(i2));
        }
    }
}
