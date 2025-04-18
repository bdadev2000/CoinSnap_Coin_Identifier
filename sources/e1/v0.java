package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f30355a;

    /* renamed from: b, reason: collision with root package name */
    public static final v0 f30356b;

    /* renamed from: c, reason: collision with root package name */
    public static final v0 f30357c;
    public static final /* synthetic */ v0[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e1.v0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e1.v0] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, e1.v0] */
    static {
        ?? r02 = new Enum("START", 0);
        f30355a = r02;
        ?? r1 = new Enum("STOP", 1);
        f30356b = r1;
        ?? r2 = new Enum("STOP_AND_RESET_REPLAY_CACHE", 2);
        f30357c = r2;
        d = new v0[]{r02, r1, r2};
    }

    public static v0 valueOf(String str) {
        return (v0) Enum.valueOf(v0.class, str);
    }

    public static v0[] values() {
        return (v0[]) d.clone();
    }
}
