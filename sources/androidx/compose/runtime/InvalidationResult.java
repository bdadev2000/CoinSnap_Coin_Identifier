package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class InvalidationResult {

    /* renamed from: a, reason: collision with root package name */
    public static final InvalidationResult f13812a;

    /* renamed from: b, reason: collision with root package name */
    public static final InvalidationResult f13813b;

    /* renamed from: c, reason: collision with root package name */
    public static final InvalidationResult f13814c;
    public static final InvalidationResult d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ InvalidationResult[] f13815f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.runtime.InvalidationResult] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.runtime.InvalidationResult] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.runtime.InvalidationResult] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.runtime.InvalidationResult] */
    static {
        ?? r02 = new Enum("IGNORED", 0);
        f13812a = r02;
        ?? r1 = new Enum("SCHEDULED", 1);
        f13813b = r1;
        ?? r2 = new Enum("DEFERRED", 2);
        f13814c = r2;
        ?? r3 = new Enum("IMMINENT", 3);
        d = r3;
        f13815f = new InvalidationResult[]{r02, r1, r2, r3};
    }

    public static InvalidationResult valueOf(String str) {
        return (InvalidationResult) Enum.valueOf(InvalidationResult.class, str);
    }

    public static InvalidationResult[] values() {
        return (InvalidationResult[]) f13815f.clone();
    }
}
