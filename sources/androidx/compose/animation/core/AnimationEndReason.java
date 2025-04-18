package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AnimationEndReason {

    /* renamed from: a, reason: collision with root package name */
    public static final AnimationEndReason f2022a;

    /* renamed from: b, reason: collision with root package name */
    public static final AnimationEndReason f2023b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AnimationEndReason[] f2024c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.animation.core.AnimationEndReason] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.animation.core.AnimationEndReason] */
    static {
        ?? r02 = new Enum("BoundReached", 0);
        f2022a = r02;
        ?? r1 = new Enum("Finished", 1);
        f2023b = r1;
        f2024c = new AnimationEndReason[]{r02, r1};
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) f2024c.clone();
    }
}
