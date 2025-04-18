package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HandleState {

    /* renamed from: a, reason: collision with root package name */
    public static final HandleState f5967a;

    /* renamed from: b, reason: collision with root package name */
    public static final HandleState f5968b;

    /* renamed from: c, reason: collision with root package name */
    public static final HandleState f5969c;
    public static final /* synthetic */ HandleState[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.text.HandleState] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.text.HandleState] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.foundation.text.HandleState] */
    static {
        ?? r02 = new Enum("None", 0);
        f5967a = r02;
        ?? r1 = new Enum("Selection", 1);
        f5968b = r1;
        ?? r2 = new Enum("Cursor", 2);
        f5969c = r2;
        d = new HandleState[]{r02, r1, r2};
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) d.clone();
    }
}
