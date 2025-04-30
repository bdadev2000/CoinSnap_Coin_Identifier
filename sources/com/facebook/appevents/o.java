package com.facebook.appevents;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    public static final o b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f13506c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f13507d;

    /* renamed from: f, reason: collision with root package name */
    public static final o f13508f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ o[] f13509g;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.appevents.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.appevents.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.appevents.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.appevents.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.facebook.appevents.o, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.facebook.appevents.o, java.lang.Enum] */
    static {
        ?? r02 = new Enum("EXPLICIT", 0);
        b = r02;
        ?? r12 = new Enum("TIMER", 1);
        f13506c = r12;
        ?? r22 = new Enum("SESSION_CHANGE", 2);
        ?? r32 = new Enum("PERSISTED_EVENTS", 3);
        ?? r42 = new Enum("EVENT_THRESHOLD", 4);
        f13507d = r42;
        ?? r52 = new Enum("EAGER_FLUSHING_EVENT", 5);
        f13508f = r52;
        f13509g = new o[]{r02, r12, r22, r32, r42, r52};
    }

    public static o valueOf(String str) {
        G7.j.e(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) Arrays.copyOf(f13509g, 6);
    }
}
