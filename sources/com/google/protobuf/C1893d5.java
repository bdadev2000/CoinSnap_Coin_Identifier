package com.google.protobuf;

/* renamed from: com.google.protobuf.d5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1893d5 {
    private C1893d5() {
    }

    public static String escapeBytes(InterfaceC1886c5 interfaceC1886c5) {
        StringBuilder sb = new StringBuilder(interfaceC1886c5.size());
        for (int i9 = 0; i9 < interfaceC1886c5.size(); i9++) {
            byte byteAt = interfaceC1886c5.byteAt(i9);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt >= 32 && byteAt <= 126) {
                            sb.append((char) byteAt);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    public static String escapeText(String str) {
        return escapeBytes(H.copyFromUtf8(str));
    }

    public static String escapeBytes(H h6) {
        return escapeBytes(new C1872a5(h6));
    }

    public static String escapeBytes(byte[] bArr) {
        return escapeBytes(new C1879b5(bArr));
    }
}
