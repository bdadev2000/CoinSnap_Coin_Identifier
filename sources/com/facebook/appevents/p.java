package com.facebook.appevents;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class p {
    public static final p b;

    /* renamed from: c, reason: collision with root package name */
    public static final p f13510c;

    /* renamed from: d, reason: collision with root package name */
    public static final p f13511d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p[] f13512f;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.appevents.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.appevents.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.appevents.p, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.appevents.p, java.lang.Enum] */
    static {
        ?? r02 = new Enum("SUCCESS", 0);
        b = r02;
        ?? r12 = new Enum("SERVER_ERROR", 1);
        f13510c = r12;
        ?? r22 = new Enum("NO_CONNECTIVITY", 2);
        f13511d = r22;
        f13512f = new p[]{r02, r12, r22, new Enum("UNKNOWN_ERROR", 3)};
    }

    public static p valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) Arrays.copyOf(f13512f, 4);
    }
}
