package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SecureFlagPolicy {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureFlagPolicy f17706a;

    /* renamed from: b, reason: collision with root package name */
    public static final SecureFlagPolicy f17707b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SecureFlagPolicy[] f17708c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.window.SecureFlagPolicy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.window.SecureFlagPolicy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.window.SecureFlagPolicy] */
    static {
        ?? r02 = new Enum("Inherit", 0);
        f17706a = r02;
        ?? r1 = new Enum("SecureOn", 1);
        f17707b = r1;
        f17708c = new SecureFlagPolicy[]{r02, r1, new Enum("SecureOff", 2)};
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) f17708c.clone();
    }
}
