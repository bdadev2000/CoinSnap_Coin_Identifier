package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class P3 {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final char[] INDENT_BUFFER;
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    static {
        char[] cArr = new char[80];
        INDENT_BUFFER = cArr;
        Arrays.fill(cArr, ' ');
    }

    private P3() {
    }

    private static void indent(int i9, StringBuilder sb) {
        int i10;
        while (i9 > 0) {
            char[] cArr = INDENT_BUFFER;
            if (i9 > cArr.length) {
                i10 = cArr.length;
            } else {
                i10 = i9;
            }
            sb.append(cArr, 0, i10);
            i9 -= i10;
        }
    }

    private static boolean isDefaultValue(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof H) {
            return obj.equals(H.EMPTY);
        }
        if (obj instanceof N3) {
            if (obj == ((N3) obj).getDefaultInstanceForType()) {
                return true;
            }
            return false;
        }
        if ((obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0) {
            return true;
        }
        return false;
    }

    private static String pascalCaseToSnakeCase(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i9 = 1; i9 < str.length(); i9++) {
            char charAt = str.charAt(i9);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static void printField(StringBuilder sb, int i9, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb, i9, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb, i9, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        indent(i9, sb);
        sb.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C1893d5.escapeText((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof H) {
            sb.append(": \"");
            sb.append(C1893d5.escapeBytes((H) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof L2) {
            sb.append(" {");
            reflectivePrintWithIndent((L2) obj, sb, i9 + 2);
            sb.append("\n");
            indent(i9, sb);
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i10 = i9 + 2;
            printField(sb, i10, "key", entry.getKey());
            printField(sb, i10, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb.append("\n");
            indent(i9, sb);
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0161, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void reflectivePrintWithIndent(com.google.protobuf.N3 r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.P3.reflectivePrintWithIndent(com.google.protobuf.N3, java.lang.StringBuilder, int):void");
    }

    public static String toString(N3 n32, String str) {
        StringBuilder c9 = AbstractC2965e.c("# ", str);
        reflectivePrintWithIndent(n32, c9, 0);
        return c9.toString();
    }
}
