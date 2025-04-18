package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
final class DownResolution {

    /* renamed from: a, reason: collision with root package name */
    public static final DownResolution f7059a;

    /* renamed from: b, reason: collision with root package name */
    public static final DownResolution f7060b;

    /* renamed from: c, reason: collision with root package name */
    public static final DownResolution f7061c;
    public static final DownResolution d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ DownResolution[] f7062f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.selection.DownResolution] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.selection.DownResolution] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.selection.DownResolution] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.foundation.text.selection.DownResolution] */
    static {
        ?? r02 = new Enum("Up", 0);
        f7059a = r02;
        ?? r1 = new Enum("Drag", 1);
        f7060b = r1;
        ?? r2 = new Enum("Timeout", 2);
        f7061c = r2;
        ?? r3 = new Enum("Cancel", 3);
        d = r3;
        f7062f = new DownResolution[]{r02, r1, r2, r3};
    }

    public static DownResolution valueOf(String str) {
        return (DownResolution) Enum.valueOf(DownResolution.class, str);
    }

    public static DownResolution[] values() {
        return (DownResolution[]) f7062f.clone();
    }
}
