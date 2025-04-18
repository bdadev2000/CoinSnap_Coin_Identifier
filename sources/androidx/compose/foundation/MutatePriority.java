package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MutatePriority {

    /* renamed from: a, reason: collision with root package name */
    public static final MutatePriority f2811a;

    /* renamed from: b, reason: collision with root package name */
    public static final MutatePriority f2812b;

    /* renamed from: c, reason: collision with root package name */
    public static final MutatePriority f2813c;
    public static final /* synthetic */ MutatePriority[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.MutatePriority] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.MutatePriority] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.MutatePriority] */
    static {
        ?? r02 = new Enum("Default", 0);
        f2811a = r02;
        ?? r1 = new Enum("UserInput", 1);
        f2812b = r1;
        ?? r2 = new Enum("PreventUserInput", 2);
        f2813c = r2;
        d = new MutatePriority[]{r02, r1, r2};
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) d.clone();
    }
}
