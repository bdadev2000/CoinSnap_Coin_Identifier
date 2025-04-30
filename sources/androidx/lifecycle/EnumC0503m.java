package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0503m {
    private static final /* synthetic */ EnumC0503m[] $VALUES;
    public static final C0501k Companion;
    public static final EnumC0503m ON_ANY;
    public static final EnumC0503m ON_CREATE;
    public static final EnumC0503m ON_DESTROY;
    public static final EnumC0503m ON_PAUSE;
    public static final EnumC0503m ON_RESUME;
    public static final EnumC0503m ON_START;
    public static final EnumC0503m ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r32 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r32;
        ?? r42 = new Enum("ON_STOP", 4);
        ON_STOP = r42;
        ?? r52 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r52;
        ?? r62 = new Enum("ON_ANY", 6);
        ON_ANY = r62;
        $VALUES = new EnumC0503m[]{r02, r12, r22, r32, r42, r52, r62};
        Companion = new Object();
    }

    public static EnumC0503m valueOf(String str) {
        return (EnumC0503m) Enum.valueOf(EnumC0503m.class, str);
    }

    public static EnumC0503m[] values() {
        return (EnumC0503m[]) $VALUES.clone();
    }

    public final EnumC0504n a() {
        switch (AbstractC0502l.f4891a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0504n.f4893d;
            case 3:
            case 4:
                return EnumC0504n.f4894f;
            case 5:
                return EnumC0504n.f4895g;
            case 6:
                return EnumC0504n.b;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
