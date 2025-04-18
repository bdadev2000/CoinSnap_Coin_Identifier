package vd;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ String a(int i10) {
        if (i10 == 1) {
            return "ctv";
        }
        if (i10 == 2) {
            return "mobile";
        }
        if (i10 == 3) {
            return "other";
        }
        throw null;
    }

    public static float b(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int c(String str, int i10, int i11) {
        return (str.hashCode() + i10) * i11;
    }

    public static int d(List list, int i10, int i11) {
        return (list.hashCode() + i10) * i11;
    }

    public static String e(String str, String str2) {
        return str + str2;
    }

    public static String f(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String g(StringBuilder sb2, int i10, String str) {
        sb2.append(i10);
        sb2.append(str);
        return sb2.toString();
    }

    public static String h(StringBuilder sb2, String str, String str2) {
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static /* synthetic */ String i(int i10) {
        return i10 == 1 ? "UNKNOWN" : i10 == 2 ? "HORIZONTAL_DIMENSION" : i10 == 3 ? "VERTICAL_DIMENSION" : i10 == 4 ? "LEFT" : i10 == 5 ? "RIGHT" : i10 == 6 ? "TOP" : i10 == 7 ? "BOTTOM" : i10 == 8 ? "BASELINE" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String j(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String k(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String l(int i10) {
        return i10 == 1 ? "BEGIN_ARRAY" : i10 == 2 ? "END_ARRAY" : i10 == 3 ? "BEGIN_OBJECT" : i10 == 4 ? "END_OBJECT" : i10 == 5 ? "NAME" : i10 == 6 ? "STRING" : i10 == 7 ? "NUMBER" : i10 == 8 ? "BOOLEAN" : i10 == 9 ? "NULL" : i10 == 10 ? "END_DOCUMENT" : AbstractJsonLexerKt.NULL;
    }
}
