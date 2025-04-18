package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
final class ScaffoldLayoutContent {

    /* renamed from: a, reason: collision with root package name */
    public static final ScaffoldLayoutContent f10845a;

    /* renamed from: b, reason: collision with root package name */
    public static final ScaffoldLayoutContent f10846b;

    /* renamed from: c, reason: collision with root package name */
    public static final ScaffoldLayoutContent f10847c;
    public static final ScaffoldLayoutContent d;

    /* renamed from: f, reason: collision with root package name */
    public static final ScaffoldLayoutContent f10848f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ScaffoldLayoutContent[] f10849g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.material3.ScaffoldLayoutContent] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.material3.ScaffoldLayoutContent] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.material3.ScaffoldLayoutContent] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.material3.ScaffoldLayoutContent] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.compose.material3.ScaffoldLayoutContent] */
    static {
        ?? r02 = new Enum("TopBar", 0);
        f10845a = r02;
        ?? r1 = new Enum("MainContent", 1);
        f10846b = r1;
        ?? r2 = new Enum("Snackbar", 2);
        f10847c = r2;
        ?? r3 = new Enum("Fab", 3);
        d = r3;
        ?? r4 = new Enum("BottomBar", 4);
        f10848f = r4;
        f10849g = new ScaffoldLayoutContent[]{r02, r1, r2, r3, r4};
    }

    public static ScaffoldLayoutContent valueOf(String str) {
        return (ScaffoldLayoutContent) Enum.valueOf(ScaffoldLayoutContent.class, str);
    }

    public static ScaffoldLayoutContent[] values() {
        return (ScaffoldLayoutContent[]) f10849g.clone();
    }
}
