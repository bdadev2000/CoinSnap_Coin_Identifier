package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SnackbarResult {

    /* renamed from: a, reason: collision with root package name */
    public static final SnackbarResult f11608a;

    /* renamed from: b, reason: collision with root package name */
    public static final SnackbarResult f11609b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ SnackbarResult[] f11610c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.SnackbarResult] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.SnackbarResult] */
    static {
        ?? r02 = new Enum("Dismissed", 0);
        f11608a = r02;
        ?? r1 = new Enum("ActionPerformed", 1);
        f11609b = r1;
        f11610c = new SnackbarResult[]{r02, r1};
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f11610c.clone();
    }
}
