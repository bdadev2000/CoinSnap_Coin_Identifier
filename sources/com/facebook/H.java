package com.facebook;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class H {
    public static final H b;

    /* renamed from: c, reason: collision with root package name */
    public static final H f13411c;

    /* renamed from: d, reason: collision with root package name */
    public static final H f13412d;

    /* renamed from: f, reason: collision with root package name */
    public static final H f13413f;

    /* renamed from: g, reason: collision with root package name */
    public static final H f13414g;

    /* renamed from: h, reason: collision with root package name */
    public static final H f13415h;

    /* renamed from: i, reason: collision with root package name */
    public static final H f13416i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ H[] f13417j;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.facebook.H] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.facebook.H] */
    static {
        ?? r02 = new Enum("REQUESTS", 0);
        b = r02;
        ?? r12 = new Enum("INCLUDE_ACCESS_TOKENS", 1);
        f13411c = r12;
        ?? r22 = new Enum("INCLUDE_RAW_RESPONSES", 2);
        f13412d = r22;
        ?? r32 = new Enum("CACHE", 3);
        ?? r42 = new Enum("APP_EVENTS", 4);
        f13413f = r42;
        ?? r52 = new Enum("DEVELOPER_ERRORS", 5);
        f13414g = r52;
        ?? r62 = new Enum("GRAPH_API_DEBUG_WARNING", 6);
        f13415h = r62;
        ?? r72 = new Enum("GRAPH_API_DEBUG_INFO", 7);
        f13416i = r72;
        f13417j = new H[]{r02, r12, r22, r32, r42, r52, r62, r72};
    }

    public static H valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (H) Enum.valueOf(H.class, str);
    }

    public static H[] values() {
        return (H[]) Arrays.copyOf(f13417j, 8);
    }
}
