package e0;

import com.facebook.internal.AnalyticsEvents;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f30204a;

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f30205b;

    /* renamed from: c, reason: collision with root package name */
    public static final h0 f30206c;
    public static final h0 d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h0[] f30207f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e0.h0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e0.h0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e0.h0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, e0.h0] */
    static {
        ?? r02 = new Enum("Ready", 0);
        f30204a = r02;
        ?? r1 = new Enum("NotReady", 1);
        f30205b = r1;
        ?? r2 = new Enum("Done", 2);
        f30206c = r2;
        ?? r3 = new Enum(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_FAILED, 3);
        d = r3;
        h0[] h0VarArr = {r02, r1, r2, r3};
        f30207f = h0VarArr;
        b1.f0.l(h0VarArr);
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) f30207f.clone();
    }
}
