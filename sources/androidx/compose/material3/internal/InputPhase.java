package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class InputPhase {

    /* renamed from: a, reason: collision with root package name */
    public static final InputPhase f12988a;

    /* renamed from: b, reason: collision with root package name */
    public static final InputPhase f12989b;

    /* renamed from: c, reason: collision with root package name */
    public static final InputPhase f12990c;
    public static final /* synthetic */ InputPhase[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.internal.InputPhase] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.internal.InputPhase] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.material3.internal.InputPhase] */
    static {
        ?? r02 = new Enum("Focused", 0);
        f12988a = r02;
        ?? r1 = new Enum("UnfocusedEmpty", 1);
        f12989b = r1;
        ?? r2 = new Enum("UnfocusedNotEmpty", 2);
        f12990c = r2;
        d = new InputPhase[]{r02, r1, r2};
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) d.clone();
    }
}
