package a4;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.impl.kc;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ String A(int i10) {
        return i10 == 1 ? "EXPONENTIAL" : i10 == 2 ? "LINEAR" : AbstractJsonLexerKt.NULL;
    }

    public static /* synthetic */ String B(int i10) {
        return i10 == 1 ? "RUN_AS_NON_EXPEDITED_WORK_REQUEST" : i10 == 2 ? "DROP_WORK_REQUEST" : AbstractJsonLexerKt.NULL;
    }

    public static int[] _values() {
        return t.h.c(9);
    }

    public static int a(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    public static Object b(com.applovin.impl.sdk.k kVar, String str) {
        return kVar.g0().getExtraParameters().get(str);
    }

    public static String c(int i10, String str, int i11) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        sb2.append(i11);
        return sb2.toString();
    }

    public static String d(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String e(String str, int i10, String str2, int i11) {
        return str + i10 + str2 + i11;
    }

    public static String f(String str, long j3, String str2) {
        return str + j3 + str2;
    }

    public static String g(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String h(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String i(StringBuilder sb2, int i10, char c10) {
        sb2.append(i10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, long j3, String str) {
        sb2.append(j3);
        sb2.append(str);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, boolean z10, char c10) {
        sb2.append(z10);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder m(String str, int i10, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2;
    }

    public static StringBuilder n(String str, int i10, String str2, int i11, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i11);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder o(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder p(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static HashMap q(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static Map r() {
        return Collections.synchronizedMap(new HashMap());
    }

    public static /* synthetic */ void s() {
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void u(String str, int i10, String str2) {
        kc.d(str2, str + i10);
    }

    public static void v(String str, String str2, com.applovin.impl.sdk.t tVar, String str3) {
        tVar.a(str3, str + str2);
    }

    public static void w(String str, String str2, String str3) {
        kc.d(str3, str + str2);
    }

    public static void x(String str, String str2, String str3, com.applovin.impl.sdk.t tVar, String str4) {
        tVar.a(str4, str + str2 + str3);
    }

    public static void y(StringBuilder sb2, int i10, String str, int i11, String str2) {
        sb2.append(i10);
        sb2.append(str);
        sb2.append(i11);
        sb2.append(str2);
    }

    public static int z(int i10, int i11, int i12, int i13) {
        return ((i10 * i11) / i12) + i13;
    }
}
