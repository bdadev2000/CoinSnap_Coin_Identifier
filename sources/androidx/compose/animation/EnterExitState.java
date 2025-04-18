package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EnterExitState {

    /* renamed from: a, reason: collision with root package name */
    public static final EnterExitState f1806a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnterExitState f1807b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnterExitState f1808c;
    public static final /* synthetic */ EnterExitState[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.animation.EnterExitState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.animation.EnterExitState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.animation.EnterExitState] */
    static {
        ?? r02 = new Enum("PreEnter", 0);
        f1806a = r02;
        ?? r1 = new Enum("Visible", 1);
        f1807b = r1;
        ?? r2 = new Enum("PostExit", 2);
        f1808c = r2;
        d = new EnterExitState[]{r02, r1, r2};
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) d.clone();
    }
}
