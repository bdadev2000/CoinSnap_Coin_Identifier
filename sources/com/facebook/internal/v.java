package com.facebook.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class v {
    public static final v b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f13670c;

    /* renamed from: d, reason: collision with root package name */
    public static final v f13671d;

    /* renamed from: f, reason: collision with root package name */
    public static final v f13672f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f13673g;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.internal.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.internal.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.internal.v, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.internal.v, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NOT_LOADED", 0);
        b = r02;
        ?? r12 = new Enum("LOADING", 1);
        f13670c = r12;
        ?? r22 = new Enum("SUCCESS", 2);
        f13671d = r22;
        ?? r32 = new Enum("ERROR", 3);
        f13672f = r32;
        f13673g = new v[]{r02, r12, r22, r32};
    }

    public static v valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) Arrays.copyOf(f13673g, 4);
    }
}
