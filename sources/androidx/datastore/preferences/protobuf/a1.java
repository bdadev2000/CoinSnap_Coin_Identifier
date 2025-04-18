package androidx.datastore.preferences.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a1 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            j jVar = k.f1389c;
            sb2.append(com.facebook.appevents.g.h(new j(((String) obj).getBytes(h0.a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof k) {
            sb2.append(": \"");
            sb2.append(com.facebook.appevents.g.h((k) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof e0) {
            sb2.append(" {");
            c((e0) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i12 = i10 + 2;
            b(sb2, i12, "key", entry.getKey());
            b(sb2, i12, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb2.append("\n");
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0198, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01fa, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(androidx.datastore.preferences.protobuf.b r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.a1.c(androidx.datastore.preferences.protobuf.b, java.lang.StringBuilder, int):void");
    }
}
