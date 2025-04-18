package com.google.protobuf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class q5 {
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

    private q5() {
    }

    private static void indent(int i10, StringBuilder sb2) {
        int i11;
        while (i10 > 0) {
            char[] cArr = INDENT_BUFFER;
            if (i10 > cArr.length) {
                i11 = cArr.length;
            } else {
                i11 = i10;
            }
            sb2.append(cArr, 0, i11);
            i10 -= i11;
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
        if (obj instanceof h0) {
            return obj.equals(h0.EMPTY);
        }
        if (obj instanceof o5) {
            if (obj == ((o5) obj).getDefaultInstanceForType()) {
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static void printField(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                printField(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        indent(i10, sb2);
        sb2.append(pascalCaseToSnakeCase(str));
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(e8.escapeText((String) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof h0) {
            sb2.append(": \"");
            sb2.append(e8.escapeBytes((h0) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof o3) {
            sb2.append(" {");
            reflectivePrintWithIndent((o3) obj, sb2, i10 + 2);
            sb2.append("\n");
            indent(i10, sb2);
            sb2.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i11 = i10 + 2;
            printField(sb2, i11, "key", entry.getKey());
            printField(sb2, i11, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry.getValue());
            sb2.append("\n");
            indent(i10, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": ");
        sb2.append(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0161, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void reflectivePrintWithIndent(com.google.protobuf.o5 r16, java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.q5.reflectivePrintWithIndent(com.google.protobuf.o5, java.lang.StringBuilder, int):void");
    }

    public static String toString(o5 o5Var, String str) {
        StringBuilder n10 = eb.j.n("# ", str);
        reflectivePrintWithIndent(o5Var, n10, 0);
        return n10.toString();
    }
}
