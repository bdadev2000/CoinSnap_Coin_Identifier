package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class TextDeleteType {

    /* renamed from: a, reason: collision with root package name */
    public static final TextDeleteType f6866a;

    /* renamed from: b, reason: collision with root package name */
    public static final TextDeleteType f6867b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextDeleteType f6868c;
    public static final TextDeleteType d;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TextDeleteType[] f6869f;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextDeleteType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextDeleteType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextDeleteType] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextDeleteType] */
    static {
        ?? r02 = new Enum("Start", 0);
        f6866a = r02;
        ?? r1 = new Enum("End", 1);
        f6867b = r1;
        ?? r2 = new Enum("Inner", 2);
        f6868c = r2;
        ?? r3 = new Enum("NotByUser", 3);
        d = r3;
        f6869f = new TextDeleteType[]{r02, r1, r2, r3};
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) f6869f.clone();
    }
}
