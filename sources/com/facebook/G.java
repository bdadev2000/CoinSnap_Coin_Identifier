package com.facebook;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class G {
    public static final G b;

    /* renamed from: c, reason: collision with root package name */
    public static final G f13409c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ G[] f13410d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.facebook.G] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.facebook.G] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.facebook.G] */
    static {
        ?? r02 = new Enum("GET", 0);
        b = r02;
        ?? r12 = new Enum("POST", 1);
        f13409c = r12;
        f13410d = new G[]{r02, r12, new Enum("DELETE", 2)};
    }

    public static G valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) Arrays.copyOf(f13410d, 3);
    }
}
