package com.mbridge.msdk.thrid.okhttp.internal.tls;

import androidx.core.view.MotionEventCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;
    private final String dn;
    private int end;
    private final int length;
    private int pos;

    public DistinguishedNameParser(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.dn = name;
        this.length = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        return new java.lang.String(r1, r2, r8.cur - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String escapedAV() {
        /*
            r8 = this;
            int r0 = r8.pos
            r8.beg = r0
            r8.end = r0
        L6:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.chars
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.end
            int r4 = r3 + 1
            r8.end = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L3e:
            int r0 = r8.end
            int r2 = r0 + 1
            r8.end = r2
            char r2 = r8.getEscaped()
            r1[r0] = r2
            int r0 = r8.pos
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.end
            r8.cur = r2
            int r0 = r0 + 1
            r8.pos = r0
            int r0 = r2 + 1
            r8.end = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 >= r1) goto L83
            char[] r2 = r8.chars
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.end
            int r7 = r1 + 1
            r8.end = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.pos = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.chars
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.cur
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.tls.DistinguishedNameParser.escapedAV():java.lang.String");
    }

    private int getByte(int i9) {
        int i10;
        int i11;
        int i12 = i9 + 1;
        if (i12 < this.length) {
            char[] cArr = this.chars;
            char c9 = cArr[i9];
            if (c9 >= '0' && c9 <= '9') {
                i10 = c9 - '0';
            } else if (c9 >= 'a' && c9 <= 'f') {
                i10 = c9 - 'W';
            } else if (c9 >= 'A' && c9 <= 'F') {
                i10 = c9 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            char c10 = cArr[i12];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i11 = c10 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            return (i10 << 4) + i11;
        }
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }

    private char getEscaped() {
        int i9 = this.pos + 1;
        this.pos = i9;
        if (i9 != this.length) {
            char c9 = this.chars[i9];
            if (c9 == ' ' || c9 == '%' || c9 == '\\' || c9 == '_' || c9 == '\"' || c9 == '#') {
                return c9;
            }
            switch (c9) {
                case '*':
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case ',':
                    return c9;
                default:
                    switch (c9) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            return c9;
                        default:
                            return getUTF8();
                    }
            }
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private char getUTF8() {
        int i9;
        int i10;
        int i11 = getByte(this.pos);
        this.pos++;
        if (i11 < 128) {
            return (char) i11;
        }
        if (i11 < 192 || i11 > 247) {
            return '?';
        }
        if (i11 <= 223) {
            i9 = i11 & 31;
            i10 = 1;
        } else if (i11 <= 239) {
            i9 = i11 & 15;
            i10 = 2;
        } else {
            i9 = i11 & 7;
            i10 = 3;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.pos;
            int i14 = i13 + 1;
            this.pos = i14;
            if (i14 == this.length || this.chars[i14] != '\\') {
                return '?';
            }
            int i15 = i13 + 2;
            this.pos = i15;
            int i16 = getByte(i15);
            this.pos++;
            if ((i16 & PsExtractor.AUDIO_STREAM) != 128) {
                return '?';
            }
            i9 = (i9 << 6) + (i16 & 63);
        }
        return (char) i9;
    }

    private String hexAV() {
        int i9;
        char[] cArr;
        char c9;
        int i10 = this.pos;
        if (i10 + 4 < this.length) {
            this.beg = i10;
            this.pos = i10 + 1;
            while (true) {
                i9 = this.pos;
                if (i9 == this.length || (c9 = (cArr = this.chars)[i9]) == '+' || c9 == ',' || c9 == ';') {
                    break;
                }
                if (c9 == ' ') {
                    this.end = i9;
                    this.pos = i9 + 1;
                    while (true) {
                        int i11 = this.pos;
                        if (i11 >= this.length || this.chars[i11] != ' ') {
                            break;
                        }
                        this.pos = i11 + 1;
                    }
                } else {
                    if (c9 >= 'A' && c9 <= 'F') {
                        cArr[i9] = (char) (c9 + ' ');
                    }
                    this.pos = i9 + 1;
                }
            }
            this.end = i9;
            int i12 = this.end;
            int i13 = this.beg;
            int i14 = i12 - i13;
            if (i14 >= 5 && (i14 & 1) != 0) {
                int i15 = i14 / 2;
                byte[] bArr = new byte[i15];
                int i16 = i13 + 1;
                for (int i17 = 0; i17 < i15; i17++) {
                    bArr[i17] = (byte) getByte(i16);
                    i16 += 2;
                }
                return new String(this.chars, this.beg, i14);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.dn);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private String nextAT() {
        int i9;
        int i10;
        int i11;
        int i12;
        char c9;
        int i13;
        int i14;
        char c10;
        char c11;
        while (true) {
            i9 = this.pos;
            i10 = this.length;
            if (i9 >= i10 || this.chars[i9] != ' ') {
                break;
            }
            this.pos = i9 + 1;
        }
        if (i9 == i10) {
            return null;
        }
        this.beg = i9;
        this.pos = i9 + 1;
        while (true) {
            i11 = this.pos;
            i12 = this.length;
            if (i11 >= i12 || (c11 = this.chars[i11]) == '=' || c11 == ' ') {
                break;
            }
            this.pos = i11 + 1;
        }
        if (i11 < i12) {
            this.end = i11;
            if (this.chars[i11] == ' ') {
                while (true) {
                    i13 = this.pos;
                    i14 = this.length;
                    if (i13 >= i14 || (c10 = this.chars[i13]) == '=' || c10 != ' ') {
                        break;
                    }
                    this.pos = i13 + 1;
                }
                if (this.chars[i13] != '=' || i13 == i14) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.dn);
                }
            }
            this.pos++;
            while (true) {
                int i15 = this.pos;
                if (i15 >= this.length || this.chars[i15] != ' ') {
                    break;
                }
                this.pos = i15 + 1;
            }
            int i16 = this.end;
            int i17 = this.beg;
            if (i16 - i17 > 4) {
                char[] cArr = this.chars;
                if (cArr[i17 + 3] == '.' && (((c9 = cArr[i17]) == 'O' || c9 == 'o') && ((cArr[i17 + 1] == 'I' || cArr[i17 + 1] == 'i') && (cArr[i17 + 2] == 'D' || cArr[i17 + 2] == 'd')))) {
                    this.beg = i17 + 4;
                }
            }
            char[] cArr2 = this.chars;
            int i18 = this.beg;
            return new String(cArr2, i18, i16 - i18);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.dn);
    }

    private String quotedAV() {
        int i9 = this.pos + 1;
        this.pos = i9;
        this.beg = i9;
        this.end = i9;
        while (true) {
            int i10 = this.pos;
            if (i10 != this.length) {
                char[] cArr = this.chars;
                char c9 = cArr[i10];
                if (c9 == '\"') {
                    this.pos = i10 + 1;
                    while (true) {
                        int i11 = this.pos;
                        if (i11 >= this.length || this.chars[i11] != ' ') {
                            break;
                        }
                        this.pos = i11 + 1;
                    }
                    char[] cArr2 = this.chars;
                    int i12 = this.beg;
                    return new String(cArr2, i12, this.end - i12);
                }
                if (c9 == '\\') {
                    cArr[this.end] = getEscaped();
                } else {
                    cArr[this.end] = c9;
                }
                this.pos++;
                this.end++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.dn);
            }
        }
    }

    public String findMostSpecific(String str) {
        String quotedAV;
        this.pos = 0;
        this.beg = 0;
        this.end = 0;
        this.cur = 0;
        this.chars = this.dn.toCharArray();
        String nextAT = nextAT();
        if (nextAT == null) {
            return null;
        }
        do {
            int i9 = this.pos;
            if (i9 == this.length) {
                return null;
            }
            char c9 = this.chars[i9];
            if (c9 != '\"') {
                if (c9 != '#') {
                    if (c9 != '+' && c9 != ',' && c9 != ';') {
                        quotedAV = escapedAV();
                    } else {
                        quotedAV = "";
                    }
                } else {
                    quotedAV = hexAV();
                }
            } else {
                quotedAV = quotedAV();
            }
            if (str.equalsIgnoreCase(nextAT)) {
                return quotedAV;
            }
            int i10 = this.pos;
            if (i10 >= this.length) {
                return null;
            }
            char c10 = this.chars[i10];
            if (c10 != ',' && c10 != ';' && c10 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.dn);
            }
            this.pos = i10 + 1;
            nextAT = nextAT();
        } while (nextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.dn);
    }
}
