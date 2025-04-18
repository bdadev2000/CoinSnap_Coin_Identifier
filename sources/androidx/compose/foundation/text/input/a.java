package androidx.compose.foundation.text.input;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.BillingResult;
import com.applovin.impl.pc;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static String A(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder B(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static void C(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        PreconditionsKt.b(sb.toString());
        throw null;
    }

    public static int D(int i2, int i3, int i4, int i5) {
        return CodedOutputStream.m0(i2) + i3 + i4 + i5;
    }

    public static int a(int i2, int i3, int i4, int i5) {
        return (i2 * i3) + i4 + i5;
    }

    public static int b(String str, int i2, int i3) {
        return (str.hashCode() + i2) * i3;
    }

    public static Bundle c(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static ProvidedValue d(long j2, DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal) {
        return dynamicProvidableCompositionLocal.c(new Color(j2));
    }

    public static BillingResult e(int i2, String str) {
        BillingResult.Builder newBuilder = BillingResult.newBuilder();
        newBuilder.setResponseCode(i2);
        newBuilder.setDebugMessage(str);
        return newBuilder.build();
    }

    public static Object f(Bundle bundle, String str, String str2, String str3, String str4) {
        p0.a.s(bundle, str);
        p0.a.s(str2, str3);
        return bundle.get(str4);
    }

    public static Object g(List list, int i2) {
        return list.get(list.size() - i2);
    }

    public static String h(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.exceptionLabel());
        return sb.toString();
    }

    public static String i(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String m(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String n(StringBuilder sb, int i2, String str) {
        sb.append(i2);
        sb.append(str);
        return sb.toString();
    }

    public static String o(Object[] objArr, int i2, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i2));
        p0.a.r(format, str2);
        return format;
    }

    public static String p(Object[] objArr, int i2, Locale locale, String str, String str2) {
        String format = String.format(locale, str, Arrays.copyOf(objArr, i2));
        p0.a.r(format, str2);
        return format;
    }

    public static StringBuilder q(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder r(String str, long j2, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j2);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder s(String str, String str2) {
        p0.a.r(str, str2);
        return new StringBuilder();
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static t u(Class cls, String str, String str2, int i2, h0 h0Var) {
        t tVar = new t(cls, str, str2, i2);
        h0Var.getClass();
        return tVar;
    }

    public static void v(int i2, int i3, int i4, int i5, int i6) {
        Key_androidKt.a(i2);
        Key_androidKt.a(i3);
        Key_androidKt.a(i4);
        Key_androidKt.a(i5);
        Key_androidKt.a(i6);
    }

    public static /* bridge */ /* synthetic */ void w(androidx.arch.core.executor.a aVar, OutcomeReceiver outcomeReceiver) {
        throw null;
    }

    public static void x(String str, String str2, String str3) {
        pc.d(str3, str + str2);
    }

    public static void y(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }

    public static int z(int i2, int i3, int i4, int i5) {
        return ((i2 * i3) / i4) + i5;
    }
}
