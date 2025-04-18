package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final BackoffPolicy f21842a;

    /* renamed from: b, reason: collision with root package name */
    public static final BackoffPolicy f21843b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ BackoffPolicy[] f21844c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.work.BackoffPolicy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.work.BackoffPolicy] */
    static {
        ?? r02 = new Enum("EXPONENTIAL", 0);
        f21842a = r02;
        ?? r1 = new Enum("LINEAR", 1);
        f21843b = r1;
        f21844c = new BackoffPolicy[]{r02, r1};
    }

    public static BackoffPolicy valueOf(String str) {
        return (BackoffPolicy) Enum.valueOf(BackoffPolicy.class, str);
    }

    public static BackoffPolicy[] values() {
        return (BackoffPolicy[]) f21844c.clone();
    }
}
