package com.applovin.impl.mediation.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.RelativeLayout;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.t;
import com.applovin.mediation.MaxAdListener;
import com.bytedance.sdk.component.adexpress.dynamic.AlY.qsH;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzdt;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static void A(String str, String str2, String str3) {
        ad.a(str3, str + str2);
    }

    public static /* synthetic */ String B(int i10) {
        return i10 == 1 ? "SOURCE" : i10 == 2 ? "TRANSFORMED" : i10 == 3 ? "NONE" : AbstractJsonLexerKt.NULL;
    }

    public static int a(float f10) {
        return ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), f10);
    }

    public static oj b(TimeUnit timeUnit, long j3, String str) {
        return oj.a(str, Long.valueOf(timeUnit.toMillis(j3)));
    }

    public static IObjectWrapper c(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static com.mbridge.msdk.c.g d(com.mbridge.msdk.c.h hVar) {
        return hVar.b(com.mbridge.msdk.foundation.controller.c.m().k());
    }

    public static com.mbridge.msdk.foundation.same.report.k e(String str) {
        return new k.a(str).a();
    }

    public static String f(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String g(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String h(Object[] objArr, int i10, String str, String str2) {
        String format = String.format(str, Arrays.copyOf(objArr, i10));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        return format;
    }

    public static StringBuilder i(StringBuilder sb2, int i10, String str, StringBuffer stringBuffer, String str2) {
        sb2.append(i10);
        sb2.append(str);
        stringBuffer.append(sb2.toString());
        return new StringBuilder(str2);
    }

    public static StringBuilder j(StringBuilder sb2, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb2.append(str);
        sb2.append(str2);
        stringBuffer.append(sb2.toString());
        return new StringBuilder(str3);
    }

    public static void k(int i10, SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13) {
        spannableStringBuilder.setSpan(new StyleSpan(i10), i11, i12, i13);
    }

    public static void l(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static void m(Bundle bundle, String str) {
        bundle.putLong(str, zzv.zzC().currentTimeMillis());
    }

    public static /* synthetic */ void n(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static void o(com.applovin.impl.mediation.g gVar, StringBuilder sb2, String str, Bundle bundle, t tVar, String str2) {
        sb2.append(gVar.f6193f);
        sb2.append(str);
        sb2.append(bundle);
        tVar.d(str2, sb2.toString());
    }

    public static void p(Exception exc, StringBuilder sb2, String str) {
        sb2.append(exc.getMessage());
        ad.b(str, sb2.toString());
    }

    public static void q(String str, int i10, RelativeLayout.LayoutParams layoutParams, int i11) {
        layoutParams.addRule(i11, str.substring(i10).hashCode());
    }

    public static void r(String str, int i10, String str2) {
        zzdt.zzf(str2, str + i10);
    }

    public static void s(String str, String str2, String str3) {
        zzdt.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static void t(String str, Throwable th2, String str2) {
        ad.b(str2, str + th2);
    }

    public static void u(StringBuilder sb2, MaxAdListener maxAdListener, t tVar, String str) {
        sb2.append(maxAdListener);
        tVar.a(str, sb2.toString());
    }

    public static void v(Throwable th2, StringBuilder sb2, String str) {
        sb2.append(th2.getMessage());
        ad.a(str, sb2.toString());
    }

    public static boolean w(qsH qsh, String str) {
        return TextUtils.equals(qsh.nc().Sg(), str);
    }

    public static void x(int i10, HashMap hashMap, String str, int i11, String str2, int i12, String str3, int i13, String str4) {
        hashMap.put(str, Integer.valueOf(i10));
        hashMap.put(str2, Integer.valueOf(i11));
        hashMap.put(str3, Integer.valueOf(i12));
        hashMap.put(str4, Integer.valueOf(i13));
    }

    public static void y(String str, int i10, String str2) {
        ad.a(str2, str + i10);
    }

    public static void z(String str, String str2, String str3) {
        ad.b(str3, str + str2);
    }
}
