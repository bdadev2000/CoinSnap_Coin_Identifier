package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.input.a;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzld {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlc zzlcVar, String str) {
        StringBuilder B = a.B("# ", str);
        zza(zzlcVar, B, 0);
        return B.toString();
    }

    private static void zza(int i2, StringBuilder sb) {
        while (i2 > 0) {
            char[] cArr = zza;
            int length = i2 > cArr.length ? cArr.length : i2;
            sb.append(cArr, 0, length);
            i2 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i2, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i3 = 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzmg.zza(zzik.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzik) {
            sb.append(": \"");
            sb.append(zzmg.zza((zzik) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjt) {
            sb.append(" {");
            zza((zzjt) obj, sb, i2 + 2);
            sb.append("\n");
            zza(i2, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i4 = i2 + 2;
            zza(sb, i4, SDKConstants.PARAM_KEY, entry.getKey());
            zza(sb, i4, "value", entry.getValue());
            sb.append("\n");
            zza(i2, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ff, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.measurement.zzjt.zza(r13, r19, new java.lang.Object[0])).booleanValue() != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0183, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a3, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b9, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d2, code lost:
    
        if (r13 == false) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzlc r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzld.zza(com.google.android.gms.internal.measurement.zzlc, java.lang.StringBuilder, int):void");
    }
}
