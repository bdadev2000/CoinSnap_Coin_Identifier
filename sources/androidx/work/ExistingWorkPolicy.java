package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ExistingWorkPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final ExistingWorkPolicy f21870a;

    /* renamed from: b, reason: collision with root package name */
    public static final ExistingWorkPolicy f21871b;

    /* renamed from: c, reason: collision with root package name */
    public static final ExistingWorkPolicy f21872c;
    public static final /* synthetic */ ExistingWorkPolicy[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ExistingWorkPolicy EF0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.work.ExistingWorkPolicy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.work.ExistingWorkPolicy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.work.ExistingWorkPolicy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.work.ExistingWorkPolicy] */
    static {
        ?? r02 = new Enum("REPLACE", 0);
        ?? r1 = new Enum("KEEP", 1);
        f21870a = r1;
        ?? r2 = new Enum("APPEND", 2);
        f21871b = r2;
        ?? r3 = new Enum("APPEND_OR_REPLACE", 3);
        f21872c = r3;
        d = new ExistingWorkPolicy[]{r02, r1, r2, r3};
    }

    public static ExistingWorkPolicy valueOf(String str) {
        return (ExistingWorkPolicy) Enum.valueOf(ExistingWorkPolicy.class, str);
    }

    public static ExistingWorkPolicy[] values() {
        return (ExistingWorkPolicy[]) d.clone();
    }
}
