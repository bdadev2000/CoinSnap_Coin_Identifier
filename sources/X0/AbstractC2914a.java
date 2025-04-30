package x0;

import G7.j;
import com.mbridge.msdk.foundation.entity.o;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2914a {
    public static float a(float f9, float f10, float f11, float f12) {
        return ((f9 - f10) * f11) + f12;
    }

    public static int b(int i9, int i10, String str) {
        return (str.hashCode() + i9) * i10;
    }

    public static String c(int i9, int i10, String str, String str2, String str3) {
        return str + i9 + str2 + i10 + str3;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String f(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String g(StringBuilder sb, int i9, String str) {
        sb.append(i9);
        sb.append(str);
        return sb.toString();
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static /* synthetic */ void i(int i9, String str) {
        if (i9 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = j.class.getName();
            int i10 = 0;
            while (!stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            while (stackTrace[i10].getClassName().equals(name)) {
                i10++;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            StringBuilder o3 = o.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            o3.append(str);
            NullPointerException nullPointerException = new NullPointerException(o3.toString());
            j.i(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static void j(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static String k(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static /* synthetic */ String l(int i9) {
        switch (i9) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String m(int i9) {
        switch (i9) {
            case 1:
                return "AZTEC";
            case 2:
                return "CODABAR";
            case 3:
                return "CODE_39";
            case 4:
                return "CODE_93";
            case 5:
                return "CODE_128";
            case 6:
                return "DATA_MATRIX";
            case 7:
                return "EAN_8";
            case 8:
                return "EAN_13";
            case 9:
                return "ITF";
            case 10:
                return "MAXICODE";
            case 11:
                return "PDF_417";
            case 12:
                return "QR_CODE";
            case 13:
                return "RSS_14";
            case 14:
                return "RSS_EXPANDED";
            case 15:
                return "UPC_A";
            case 16:
                return "UPC_E";
            case 17:
                return "UPC_EAN_EXTENSION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String n(int i9) {
        switch (i9) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String o(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? i9 != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String p(int i9) {
        switch (i9) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
