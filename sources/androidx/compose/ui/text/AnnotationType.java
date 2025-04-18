package androidx.compose.ui.text;

import com.google.common.net.HttpHeaders;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class AnnotationType {

    /* renamed from: a, reason: collision with root package name */
    public static final AnnotationType f16896a;

    /* renamed from: b, reason: collision with root package name */
    public static final AnnotationType f16897b;

    /* renamed from: c, reason: collision with root package name */
    public static final AnnotationType f16898c;
    public static final AnnotationType d;

    /* renamed from: f, reason: collision with root package name */
    public static final AnnotationType f16899f;

    /* renamed from: g, reason: collision with root package name */
    public static final AnnotationType f16900g;

    /* renamed from: h, reason: collision with root package name */
    public static final AnnotationType f16901h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AnnotationType[] f16902i;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.compose.ui.text.AnnotationType, java.lang.Enum] */
    static {
        ?? r02 = new Enum("Paragraph", 0);
        f16896a = r02;
        ?? r1 = new Enum("Span", 1);
        f16897b = r1;
        ?? r2 = new Enum("VerbatimTts", 2);
        f16898c = r2;
        ?? r3 = new Enum("Url", 3);
        d = r3;
        ?? r4 = new Enum(HttpHeaders.LINK, 4);
        f16899f = r4;
        ?? r5 = new Enum("Clickable", 5);
        f16900g = r5;
        ?? r6 = new Enum("String", 6);
        f16901h = r6;
        f16902i = new AnnotationType[]{r02, r1, r2, r3, r4, r5, r6};
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) f16902i.clone();
    }
}
