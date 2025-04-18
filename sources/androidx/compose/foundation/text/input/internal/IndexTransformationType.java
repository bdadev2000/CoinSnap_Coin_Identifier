package androidx.compose.foundation.text.input.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class IndexTransformationType {

    /* renamed from: a, reason: collision with root package name */
    public static final IndexTransformationType f6414a;

    /* renamed from: b, reason: collision with root package name */
    public static final IndexTransformationType f6415b;

    /* renamed from: c, reason: collision with root package name */
    public static final IndexTransformationType f6416c;
    public static final IndexTransformationType d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ IndexTransformationType[] f6417f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.IndexTransformationType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.IndexTransformationType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.IndexTransformationType] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.IndexTransformationType] */
    static {
        ?? r02 = new Enum("Untransformed", 0);
        f6414a = r02;
        ?? r1 = new Enum("Insertion", 1);
        f6415b = r1;
        ?? r2 = new Enum("Replacement", 2);
        f6416c = r2;
        ?? r3 = new Enum("Deletion", 3);
        d = r3;
        f6417f = new IndexTransformationType[]{r02, r1, r2, r3};
    }

    public static IndexTransformationType valueOf(String str) {
        return (IndexTransformationType) Enum.valueOf(IndexTransformationType.class, str);
    }

    public static IndexTransformationType[] values() {
        return (IndexTransformationType[]) f6417f.clone();
    }
}
