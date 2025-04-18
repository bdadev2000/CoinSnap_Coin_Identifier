package com.facebook.internal;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public final class x {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11121b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumSet f11122c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f11123d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11124e;

    /* renamed from: f, reason: collision with root package name */
    public final p f11125f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11126g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11127h;

    /* renamed from: i, reason: collision with root package name */
    public final JSONArray f11128i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11129j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11130k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11131l;

    /* renamed from: m, reason: collision with root package name */
    public final String f11132m;

    /* renamed from: n, reason: collision with root package name */
    public final JSONArray f11133n;

    /* renamed from: o, reason: collision with root package name */
    public final JSONArray f11134o;

    public x(boolean z10, String nuxContent, int i10, EnumSet smartLoginOptions, HashMap dialogConfigurations, boolean z11, p errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z12, boolean z13, JSONArray jSONArray, String sdkUpdateMessage, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.a = z10;
        this.f11121b = i10;
        this.f11122c = smartLoginOptions;
        this.f11123d = dialogConfigurations;
        this.f11124e = z11;
        this.f11125f = errorClassification;
        this.f11126g = z12;
        this.f11127h = z13;
        this.f11128i = jSONArray;
        this.f11129j = sdkUpdateMessage;
        this.f11130k = str;
        this.f11131l = str2;
        this.f11132m = str3;
        this.f11133n = jSONArray2;
        this.f11134o = jSONArray3;
    }
}
