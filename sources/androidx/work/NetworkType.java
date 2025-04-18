package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class NetworkType {

    /* renamed from: a, reason: collision with root package name */
    public static final NetworkType f21881a;

    /* renamed from: b, reason: collision with root package name */
    public static final NetworkType f21882b;

    /* renamed from: c, reason: collision with root package name */
    public static final NetworkType f21883c;
    public static final NetworkType d;

    /* renamed from: f, reason: collision with root package name */
    public static final NetworkType f21884f;

    /* renamed from: g, reason: collision with root package name */
    public static final NetworkType f21885g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ NetworkType[] f21886h;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.work.NetworkType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.work.NetworkType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.work.NetworkType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.work.NetworkType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.work.NetworkType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.work.NetworkType, java.lang.Enum] */
    static {
        ?? r02 = new Enum("NOT_REQUIRED", 0);
        f21881a = r02;
        ?? r1 = new Enum("CONNECTED", 1);
        f21882b = r1;
        ?? r2 = new Enum("UNMETERED", 2);
        f21883c = r2;
        ?? r3 = new Enum("NOT_ROAMING", 3);
        d = r3;
        ?? r4 = new Enum("METERED", 4);
        f21884f = r4;
        ?? r5 = new Enum("TEMPORARILY_UNMETERED", 5);
        f21885g = r5;
        f21886h = new NetworkType[]{r02, r1, r2, r3, r4, r5};
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) f21886h.clone();
    }
}
