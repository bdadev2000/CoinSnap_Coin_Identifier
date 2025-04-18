package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TextEditType {

    /* renamed from: a, reason: collision with root package name */
    public static final TextEditType f6870a;

    /* renamed from: b, reason: collision with root package name */
    public static final TextEditType f6871b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextEditType f6872c;
    public static final /* synthetic */ TextEditType[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextEditType] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextEditType] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextEditType] */
    static {
        ?? r02 = new Enum("Insert", 0);
        f6870a = r02;
        ?? r1 = new Enum("Delete", 1);
        f6871b = r1;
        ?? r2 = new Enum("Replace", 2);
        f6872c = r2;
        d = new TextEditType[]{r02, r1, r2};
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) d.clone();
    }
}
