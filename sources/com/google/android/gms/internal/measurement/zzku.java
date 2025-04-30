package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.AbstractC2965e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzku {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzkt zzktVar, String str) {
        StringBuilder c9 = AbstractC2965e.c("# ", str);
        zza(zzktVar, c9, 0);
        return c9.toString();
    }

    private static void zza(int i9, StringBuilder sb) {
        while (i9 > 0) {
            char[] cArr = zza;
            int length = i9 > cArr.length ? cArr.length : i9;
            sb.append(cArr, 0, length);
            i9 -= length;
        }
    }

    public static void zza(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i9, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i10 = 1; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
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
            sb.append(zzmb.zza(zzia.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzia) {
            sb.append(": \"");
            sb.append(zzmb.zza((zzia) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjk) {
            sb.append(" {");
            zza((zzjk) obj, sb, i9 + 2);
            sb.append("\n");
            zza(i9, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i11 = i9 + 2;
            zza(sb, i11, "key", entry.getKey());
            zza(sb, i11, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            zza(i9, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0184, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0197, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bf, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzkt r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzku.zza(com.google.android.gms.internal.measurement.zzkt, java.lang.StringBuilder, int):void");
    }
}
