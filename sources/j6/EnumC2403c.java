package j6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2403c {
    public static final EnumC2403c b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2403c f21113c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2403c[] f21114d;

    /* JADX WARN: Type inference failed for: r0v0, types: [j6.c, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j6.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ALIGN_ANCHOR", 0);
        b = r02;
        ?? r12 = new Enum("ALIGN_FIXED", 1);
        f21113c = r12;
        f21114d = new EnumC2403c[]{r02, r12};
    }

    public static EnumC2403c valueOf(String str) {
        return (EnumC2403c) Enum.valueOf(EnumC2403c.class, str);
    }

    public static EnumC2403c[] values() {
        return (EnumC2403c[]) f21114d.clone();
    }
}
