package com.facebook;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    public static final o b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f13789c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f13790d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ o[] f13791f;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.o, java.lang.Enum] */
    static {
        ?? r02 = new Enum("LOGIN_RECOVERABLE", 0);
        b = r02;
        ?? r12 = new Enum("OTHER", 1);
        f13789c = r12;
        ?? r22 = new Enum("TRANSIENT", 2);
        f13790d = r22;
        f13791f = new o[]{r02, r12, r22};
    }

    public static o valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) Arrays.copyOf(f13791f, 3);
    }
}
