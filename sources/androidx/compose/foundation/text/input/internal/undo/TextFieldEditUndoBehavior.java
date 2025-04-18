package androidx.compose.foundation.text.input.internal.undo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class TextFieldEditUndoBehavior {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f6873a;

    /* renamed from: b, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f6874b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ TextFieldEditUndoBehavior[] f6875c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior] */
    static {
        ?? r02 = new Enum("MergeIfPossible", 0);
        f6873a = r02;
        ?? r1 = new Enum("ClearHistory", 1);
        ?? r2 = new Enum("NeverMerge", 2);
        f6874b = r2;
        f6875c = new TextFieldEditUndoBehavior[]{r02, r1, r2};
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) f6875c.clone();
    }
}
