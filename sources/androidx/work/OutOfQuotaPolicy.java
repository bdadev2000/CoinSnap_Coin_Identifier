package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class OutOfQuotaPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final OutOfQuotaPolicy f21890a;

    /* renamed from: b, reason: collision with root package name */
    public static final OutOfQuotaPolicy f21891b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ OutOfQuotaPolicy[] f21892c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.work.OutOfQuotaPolicy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.work.OutOfQuotaPolicy] */
    static {
        ?? r02 = new Enum("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        f21890a = r02;
        ?? r1 = new Enum("DROP_WORK_REQUEST", 1);
        f21891b = r1;
        f21892c = new OutOfQuotaPolicy[]{r02, r1};
    }

    public static OutOfQuotaPolicy valueOf(String str) {
        return (OutOfQuotaPolicy) Enum.valueOf(OutOfQuotaPolicy.class, str);
    }

    public static OutOfQuotaPolicy[] values() {
        return (OutOfQuotaPolicy[]) f21892c.clone();
    }
}
