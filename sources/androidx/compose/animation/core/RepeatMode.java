package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class RepeatMode {

    /* renamed from: a, reason: collision with root package name */
    public static final RepeatMode f2158a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RepeatMode[] f2159b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.animation.core.RepeatMode, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.animation.core.RepeatMode, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Restart", 0);
        f2158a = r02;
        f2159b = new RepeatMode[]{r02, new Enum("Reverse", 1)};
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) f2159b.clone();
    }
}
