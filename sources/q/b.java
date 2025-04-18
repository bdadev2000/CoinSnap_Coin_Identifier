package q;

import b1.f0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f31234c;
    public static final b d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f31235f;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31236a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f31237b;

    static {
        b bVar = new b("ENABLED", 0, true, true);
        f31234c = bVar;
        b bVar2 = new b("READ_ONLY", 1, true, false);
        b bVar3 = new b("WRITE_ONLY", 2, false, true);
        b bVar4 = new b("DISABLED", 3, false, false);
        d = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f31235f = bVarArr;
        f0.l(bVarArr);
    }

    public b(String str, int i2, boolean z2, boolean z3) {
        this.f31236a = z2;
        this.f31237b = z3;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f31235f.clone();
    }
}
