package com.google.protobuf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class e8 {
    private e8() {
    }

    public static String escapeBytes(d8 d8Var) {
        StringBuilder sb2 = new StringBuilder(d8Var.size());
        for (int i10 = 0; i10 < d8Var.size(); i10++) {
            byte byteAt = d8Var.byteAt(i10);
            if (byteAt == 34) {
                sb2.append("\\\"");
            } else if (byteAt == 39) {
                sb2.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb2.append((char) byteAt);
                            break;
                        } else {
                            sb2.append(AbstractJsonLexerKt.STRING_ESC);
                            sb2.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(h0.copyFromUtf8(str));
    }

    public static String escapeBytes(h0 h0Var) {
        return escapeBytes(new b8(h0Var));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new c8(bArr));
    }
}
