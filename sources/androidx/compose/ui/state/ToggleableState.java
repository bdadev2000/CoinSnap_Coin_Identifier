package androidx.compose.ui.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ToggleableState {

    /* renamed from: a, reason: collision with root package name */
    public static final ToggleableState f16872a;

    /* renamed from: b, reason: collision with root package name */
    public static final ToggleableState f16873b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ToggleableState[] f16874c;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.state.ToggleableState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.state.ToggleableState, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.state.ToggleableState, java.lang.Enum] */
    static {
        ?? r02 = new Enum("On", 0);
        f16872a = r02;
        ?? r1 = new Enum("Off", 1);
        f16873b = r1;
        f16874c = new ToggleableState[]{r02, r1, new Enum("Indeterminate", 2)};
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) f16874c.clone();
    }
}
