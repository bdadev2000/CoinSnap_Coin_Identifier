package d0;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f30123a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f30124b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, d0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, d0.b] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, d0.b] */
    static {
        ?? r02 = new Enum("WARNING", 0);
        f30123a = r02;
        b[] bVarArr = {r02, new Enum("ERROR", 1), new Enum("HIDDEN", 2)};
        f30124b = bVarArr;
        f0.l(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f30124b.clone();
    }
}
