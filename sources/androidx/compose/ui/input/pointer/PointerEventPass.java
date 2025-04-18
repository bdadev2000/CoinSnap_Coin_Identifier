package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class PointerEventPass {

    /* renamed from: a, reason: collision with root package name */
    public static final PointerEventPass f15572a;

    /* renamed from: b, reason: collision with root package name */
    public static final PointerEventPass f15573b;

    /* renamed from: c, reason: collision with root package name */
    public static final PointerEventPass f15574c;
    public static final /* synthetic */ PointerEventPass[] d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.input.pointer.PointerEventPass] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.input.pointer.PointerEventPass] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.ui.input.pointer.PointerEventPass] */
    static {
        ?? r02 = new Enum("Initial", 0);
        f15572a = r02;
        ?? r1 = new Enum("Main", 1);
        f15573b = r1;
        ?? r2 = new Enum("Final", 2);
        f15574c = r2;
        d = new PointerEventPass[]{r02, r1, r2};
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) d.clone();
    }
}
