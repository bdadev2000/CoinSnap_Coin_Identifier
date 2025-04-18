package ra;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public final char f24045b;

    public c(char c10) {
        this.f24045b = c10;
    }

    @Override // ra.b
    public final boolean b(char c10) {
        return c10 == this.f24045b;
    }

    public final String toString() {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.UNICODE_ESC, 0, 0, 0, 0};
        char c10 = this.f24045b;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        String copyValueOf = String.copyValueOf(cArr);
        StringBuilder sb2 = new StringBuilder(String.valueOf(copyValueOf).length() + 18);
        sb2.append("CharMatcher.is('");
        sb2.append(copyValueOf);
        sb2.append("')");
        return sb2.toString();
    }
}
