package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SelectionHandleAnchor {

    /* renamed from: a, reason: collision with root package name */
    public static final SelectionHandleAnchor f7179a;

    /* renamed from: b, reason: collision with root package name */
    public static final SelectionHandleAnchor f7180b;

    /* renamed from: c, reason: collision with root package name */
    public static final SelectionHandleAnchor f7181c;
    public static final /* synthetic */ SelectionHandleAnchor[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.selection.SelectionHandleAnchor] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.selection.SelectionHandleAnchor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.selection.SelectionHandleAnchor] */
    static {
        ?? r02 = new Enum("Left", 0);
        f7179a = r02;
        ?? r1 = new Enum("Middle", 1);
        f7180b = r1;
        ?? r2 = new Enum("Right", 2);
        f7181c = r2;
        d = new SelectionHandleAnchor[]{r02, r1, r2};
    }

    public static SelectionHandleAnchor valueOf(String str) {
        return (SelectionHandleAnchor) Enum.valueOf(SelectionHandleAnchor.class, str);
    }

    public static SelectionHandleAnchor[] values() {
        return (SelectionHandleAnchor[]) d.clone();
    }
}
