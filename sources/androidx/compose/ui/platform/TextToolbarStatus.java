package androidx.compose.ui.platform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextToolbarStatus {

    /* renamed from: a, reason: collision with root package name */
    public static final TextToolbarStatus f16601a;

    /* renamed from: b, reason: collision with root package name */
    public static final TextToolbarStatus f16602b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TextToolbarStatus[] f16603c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.platform.TextToolbarStatus] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.platform.TextToolbarStatus] */
    static {
        ?? r02 = new Enum("Shown", 0);
        f16601a = r02;
        ?? r1 = new Enum("Hidden", 1);
        f16602b = r1;
        f16603c = new TextToolbarStatus[]{r02, r1};
    }

    public static TextToolbarStatus valueOf(String str) {
        return (TextToolbarStatus) Enum.valueOf(TextToolbarStatus.class, str);
    }

    public static TextToolbarStatus[] values() {
        return (TextToolbarStatus[]) f16603c.clone();
    }
}
