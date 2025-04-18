package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MutatePriority {

    /* renamed from: a, reason: collision with root package name */
    public static final MutatePriority f2136a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ MutatePriority[] f2137b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.animation.core.MutatePriority] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.animation.core.MutatePriority] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.animation.core.MutatePriority] */
    static {
        ?? r02 = new Enum("Default", 0);
        f2136a = r02;
        f2137b = new MutatePriority[]{r02, new Enum("UserInput", 1), new Enum("PreventUserInput", 2)};
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) f2137b.clone();
    }
}
