package com.applovin.impl;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.widget.RelativeLayout;
import com.applovin.mediation.MaxAdListener;
import com.bytedance.sdk.component.adexpress.dynamic.KS.ku;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.play_billing.zzby;
import com.google.protobuf.AbstractC1895e0;
import com.mbridge.msdk.foundation.same.report.k;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class L {
    public static void A(String str, String str2, String str3) {
        zzfk.zzf(str3, str2.concat(String.valueOf(str)));
    }

    public static void B(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.ad.b(str3, str + str2);
    }

    public static void C(String str, String str2, String str3) {
        com.mbridge.msdk.foundation.tools.ad.a(str3, str + str2);
    }

    public static int a(float f9) {
        return com.mbridge.msdk.foundation.tools.ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), f9);
    }

    public static int b(int i9, int i10, int i11) {
        return zzhat.zzD(i9) + i10 + i11;
    }

    public static int c(int i9, int i10, int i11, int i12) {
        return AbstractC1895e0.computeUInt32SizeNoTag(i9) + i10 + i11 + i12;
    }

    public static oj d(String str, long j7, TimeUnit timeUnit) {
        return oj.a(str, Long.valueOf(timeUnit.toMillis(j7)));
    }

    public static IObjectWrapper e(Parcel parcel) {
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return asInterface;
    }

    public static com.mbridge.msdk.c.g f(com.mbridge.msdk.c.h hVar) {
        return hVar.b(com.mbridge.msdk.foundation.controller.c.m().k());
    }

    public static com.mbridge.msdk.foundation.same.report.k g(String str) {
        return new k.a(str).a();
    }

    public static String h(com.applovin.impl.mediation.g gVar, StringBuilder sb, String str, Bundle bundle) {
        sb.append(gVar.f9146f);
        sb.append(str);
        sb.append(bundle);
        return sb.toString();
    }

    public static String i(Object obj, String str) {
        return str + obj;
    }

    public static String j(String str, long j7, String str2) {
        return str + j7 + str2;
    }

    public static String k(StringBuilder sb, String str, char c9) {
        sb.append(str);
        sb.append(c9);
        return sb.toString();
    }

    public static StringBuilder l(StringBuilder sb, int i9, String str, StringBuffer stringBuffer, String str2) {
        sb.append(i9);
        sb.append(str);
        stringBuffer.append(sb.toString());
        return new StringBuilder(str2);
    }

    public static HashMap m(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static void n(int i9, int i10, int i11, HashMap hashMap, String str) {
        hashMap.put(str, Integer.valueOf(Color.rgb(i9, i10, i11)));
    }

    public static void o(int i9, SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
        spannableStringBuilder.setSpan(new StyleSpan(i9), i10, i11, i12);
    }

    public static void p(int i9, String str, String str2) {
        kc.d(str2, str + i9);
    }

    public static void q(int i9, HashMap hashMap, String str, int i10, String str2) {
        hashMap.put(str, Integer.valueOf(i9));
        hashMap.put(str2, Integer.valueOf(i10));
    }

    public static /* synthetic */ void r(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static void s(Exception exc, StringBuilder sb, String str) {
        sb.append(exc.getMessage());
        com.mbridge.msdk.foundation.tools.ad.b(str, sb.toString());
    }

    public static void t(String str, int i9, RelativeLayout.LayoutParams layoutParams, int i10) {
        layoutParams.addRule(i10, str.substring(i9).hashCode());
    }

    public static void u(String str, String str2, String str3) {
        kc.d(str3, str + str2);
    }

    public static void v(String str, String str2, String str3, com.applovin.impl.sdk.t tVar, String str4) {
        tVar.a(str4, str + str2 + str3);
    }

    public static void w(StringBuilder sb, MaxAdListener maxAdListener, com.applovin.impl.sdk.t tVar, String str) {
        sb.append(maxAdListener);
        tVar.a(str, sb.toString());
    }

    public static boolean x(ku kuVar, String str) {
        return TextUtils.equals(kuVar.dT().lMd(), str);
    }

    public static int y(int i9, int i10, int i11) {
        return zzby.zzw(i9) + i10 + i11;
    }

    public static void z(int i9, String str, String str2) {
        zzfk.zzf(str2, str + i9);
    }
}
