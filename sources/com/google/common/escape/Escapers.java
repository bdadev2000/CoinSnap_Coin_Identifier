package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.HashMap;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class Escapers {
    private static final Escaper NULL_ESCAPER = new CharEscaper() { // from class: com.google.common.escape.Escapers.1
        @Override // com.google.common.escape.CharEscaper
        public char[] escape(char c2) {
            return null;
        }

        @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
        public String escape(String str) {
            return (String) Preconditions.checkNotNull(str);
        }
    };

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final Map<Character, String> replacementMap;
        private char safeMax;
        private char safeMin;
        private String unsafeReplacement;

        @CanIgnoreReturnValue
        public Builder addEscape(char c2, String str) {
            Preconditions.checkNotNull(str);
            this.replacementMap.put(Character.valueOf(c2), str);
            return this;
        }

        public Escaper build() {
            return new ArrayBasedCharEscaper(this.replacementMap, this.safeMin, this.safeMax) { // from class: com.google.common.escape.Escapers.Builder.1
                private final char[] replacementChars;

                {
                    this.replacementChars = Builder.this.unsafeReplacement != null ? Builder.this.unsafeReplacement.toCharArray() : null;
                }

                @Override // com.google.common.escape.ArrayBasedCharEscaper
                public char[] escapeUnsafe(char c2) {
                    return this.replacementChars;
                }
            };
        }

        @CanIgnoreReturnValue
        public Builder setSafeRange(char c2, char c3) {
            this.safeMin = c2;
            this.safeMax = c3;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUnsafeReplacement(String str) {
            this.unsafeReplacement = str;
            return this;
        }

        private Builder() {
            this.replacementMap = new HashMap();
            this.safeMin = (char) 0;
            this.safeMax = (char) 65535;
            this.unsafeReplacement = null;
        }
    }

    private Escapers() {
    }

    public static UnicodeEscaper asUnicodeEscaper(Escaper escaper) {
        Preconditions.checkNotNull(escaper);
        if (escaper instanceof UnicodeEscaper) {
            return (UnicodeEscaper) escaper;
        }
        if (escaper instanceof CharEscaper) {
            return wrap((CharEscaper) escaper);
        }
        String name = escaper.getClass().getName();
        throw new IllegalArgumentException(name.length() != 0 ? "Cannot create a UnicodeEscaper from: ".concat(name) : new String("Cannot create a UnicodeEscaper from: "));
    }

    public static Builder builder() {
        return new Builder();
    }

    public static String computeReplacement(CharEscaper charEscaper, char c2) {
        return stringOrNull(charEscaper.escape(c2));
    }

    public static Escaper nullEscaper() {
        return NULL_ESCAPER;
    }

    private static String stringOrNull(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return new String(cArr);
    }

    private static UnicodeEscaper wrap(final CharEscaper charEscaper) {
        return new UnicodeEscaper() { // from class: com.google.common.escape.Escapers.2
            @Override // com.google.common.escape.UnicodeEscaper
            public char[] escape(int i2) {
                if (i2 < 65536) {
                    return CharEscaper.this.escape((char) i2);
                }
                char[] cArr = new char[2];
                Character.toChars(i2, cArr, 0);
                char[] escape = CharEscaper.this.escape(cArr[0]);
                char[] escape2 = CharEscaper.this.escape(cArr[1]);
                if (escape == null && escape2 == null) {
                    return null;
                }
                int length = escape != null ? escape.length : 1;
                char[] cArr2 = new char[(escape2 != null ? escape2.length : 1) + length];
                if (escape != null) {
                    for (int i3 = 0; i3 < escape.length; i3++) {
                        cArr2[i3] = escape[i3];
                    }
                } else {
                    cArr2[0] = cArr[0];
                }
                if (escape2 != null) {
                    for (int i4 = 0; i4 < escape2.length; i4++) {
                        cArr2[length + i4] = escape2[i4];
                    }
                } else {
                    cArr2[length] = cArr[1];
                }
                return cArr2;
            }
        };
    }

    public static String computeReplacement(UnicodeEscaper unicodeEscaper, int i2) {
        return stringOrNull(unicodeEscaper.escape(i2));
    }
}
