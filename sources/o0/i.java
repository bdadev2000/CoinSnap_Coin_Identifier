package o0;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f31199a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f31200b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, o0.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, o0.i] */
    static {
        ?? r02 = new Enum("TOP_DOWN", 0);
        ?? r1 = new Enum("BOTTOM_UP", 1);
        f31199a = r1;
        i[] iVarArr = {r02, r1};
        f31200b = iVarArr;
        f0.l(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f31200b.clone();
    }
}
