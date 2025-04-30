package q3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class d {
    public static final d b;

    /* renamed from: c, reason: collision with root package name */
    public static final d f22757c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f22758d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ d[] f22759f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, q3.d] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, q3.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, q3.d] */
    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        b = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f22757c = r12;
        ?? r22 = new Enum("DEVICE_CHARGING", 2);
        f22758d = r22;
        f22759f = new d[]{r02, r12, r22};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f22759f.clone();
    }
}
