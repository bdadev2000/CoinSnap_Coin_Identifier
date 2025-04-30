package androidx.datastore.preferences.protobuf;

import com.applovin.exoplayer2.common.base.Ascii;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f4520a = new Object();
    public static final e0 b = new Object();

    public static void a(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i9) {
        if (!i(b9)) {
            if ((((b9 + 112) + (b8 << Ascii.FS)) >> 30) == 0 && !i(b10) && !i(b11)) {
                int i10 = ((b8 & 7) << 18) | ((b9 & 63) << 12) | ((b10 & 63) << 6) | (b11 & 63);
                cArr[i9] = (char) ((i10 >>> 10) + 55232);
                cArr[i9 + 1] = (char) ((i10 & 1023) + 56320);
                return;
            }
        }
        throw A.a();
    }

    public static boolean b(byte b8) {
        if (b8 >= 0) {
            return true;
        }
        return false;
    }

    public static void c(byte b8, byte b9, char[] cArr, int i9) {
        if (b8 >= -62 && !i(b9)) {
            cArr[i9] = (char) (((b8 & Ascii.US) << 6) | (b9 & 63));
            return;
        }
        throw A.a();
    }

    public static void d(byte b8, byte b9, byte b10, char[] cArr, int i9) {
        if (!i(b9) && ((b8 != -32 || b9 >= -96) && ((b8 != -19 || b9 < -96) && !i(b10)))) {
            cArr[i9] = (char) (((b8 & Ascii.SI) << 12) | ((b9 & 63) << 6) | (b10 & 63));
            return;
        }
        throw A.a();
    }

    public static final String e(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static String h(C0432g c0432g) {
        StringBuilder sb = new StringBuilder(c0432g.size());
        for (int i9 = 0; i9 < c0432g.size(); i9++) {
            byte b8 = c0432g.b(i9);
            if (b8 != 34) {
                if (b8 != 39) {
                    if (b8 != 92) {
                        switch (b8) {
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
                                if (b8 >= 32 && b8 <= 126) {
                                    sb.append((char) b8);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b8 >>> 6) & 3) + 48));
                                    sb.append((char) (((b8 >>> 3) & 7) + 48));
                                    sb.append((char) ((b8 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static boolean i(byte b8) {
        if (b8 > -65) {
            return true;
        }
        return false;
    }

    public static final void k(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                k(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                k(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0432g c0432g = C0432g.f4560d;
            sb.append(h(new C0432g(((String) obj).getBytes(AbstractC0449y.f4610a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0432g) {
            sb.append(": \"");
            sb.append(h((C0432g) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0446v) {
            sb.append(" {");
            l((AbstractC0446v) obj, sb, i9 + 2);
            sb.append("\n");
            while (i10 < i9) {
                sb.append(' ');
                i10++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i9 + 2;
            k(sb, i12, "key", entry.getKey());
            k(sb, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            while (i10 < i9) {
                sb.append(' ');
                i10++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ad, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01af, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bf, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d1, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(androidx.datastore.preferences.protobuf.AbstractC0425a r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.P.l(androidx.datastore.preferences.protobuf.a, java.lang.StringBuilder, int):void");
    }

    public abstract String f(byte[] bArr, int i9, int i10);

    public abstract int g(CharSequence charSequence, byte[] bArr, int i9, int i10);

    public abstract int j(byte[] bArr, int i9, int i10);

    public abstract void m(byte[] bArr, int i9, int i10);
}
