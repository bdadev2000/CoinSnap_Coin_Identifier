package n6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2480a {
    public static final EnumC2480a b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC2480a[] f21852c;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2480a EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, n6.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, n6.a] */
    static {
        ?? r02 = new Enum("NONE", 0);
        ?? r12 = new Enum("FADE", 1);
        b = r12;
        f21852c = new EnumC2480a[]{r02, r12};
    }

    public static EnumC2480a valueOf(String str) {
        return (EnumC2480a) Enum.valueOf(EnumC2480a.class, str);
    }

    public static EnumC2480a[] values() {
        return (EnumC2480a[]) f21852c.clone();
    }
}
