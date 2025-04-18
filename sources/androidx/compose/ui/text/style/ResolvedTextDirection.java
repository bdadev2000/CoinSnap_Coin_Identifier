package androidx.compose.ui.text.style;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ResolvedTextDirection {

    /* renamed from: a, reason: collision with root package name */
    public static final ResolvedTextDirection f17460a;

    /* renamed from: b, reason: collision with root package name */
    public static final ResolvedTextDirection f17461b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ ResolvedTextDirection[] f17462c;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.style.ResolvedTextDirection, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.text.style.ResolvedTextDirection, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Ltr", 0);
        f17460a = r02;
        ?? r1 = new Enum("Rtl", 1);
        f17461b = r1;
        f17462c = new ResolvedTextDirection[]{r02, r1};
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) f17462c.clone();
    }
}
