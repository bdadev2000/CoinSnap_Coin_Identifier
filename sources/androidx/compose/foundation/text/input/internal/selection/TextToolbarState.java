package androidx.compose.foundation.text.input.internal.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TextToolbarState {

    /* renamed from: a, reason: collision with root package name */
    public static final TextToolbarState f6863a;

    /* renamed from: b, reason: collision with root package name */
    public static final TextToolbarState f6864b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextToolbarState f6865c;
    public static final /* synthetic */ TextToolbarState[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.selection.TextToolbarState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.selection.TextToolbarState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.input.internal.selection.TextToolbarState] */
    static {
        ?? r02 = new Enum("None", 0);
        f6863a = r02;
        ?? r1 = new Enum("Cursor", 1);
        f6864b = r1;
        ?? r2 = new Enum("Selection", 2);
        f6865c = r2;
        d = new TextToolbarState[]{r02, r1, r2};
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) d.clone();
    }
}
