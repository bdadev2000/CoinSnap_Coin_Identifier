package com.facebook.appevents;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class j {
    public static final j b;

    /* renamed from: c, reason: collision with root package name */
    public static final j f13488c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ j[] f13489d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.facebook.appevents.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.facebook.appevents.j] */
    static {
        ?? r02 = new Enum("AUTO", 0);
        b = r02;
        ?? r12 = new Enum("EXPLICIT_ONLY", 1);
        f13488c = r12;
        f13489d = new j[]{r02, r12};
    }

    public static j valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) Arrays.copyOf(f13489d, 2);
    }
}
