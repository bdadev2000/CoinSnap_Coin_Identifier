package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class IntrinsicMinMax {

    /* renamed from: a, reason: collision with root package name */
    public static final IntrinsicMinMax f15729a;

    /* renamed from: b, reason: collision with root package name */
    public static final IntrinsicMinMax f15730b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicMinMax[] f15731c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.layout.IntrinsicMinMax] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.layout.IntrinsicMinMax] */
    static {
        ?? r02 = new Enum("Min", 0);
        f15729a = r02;
        ?? r1 = new Enum("Max", 1);
        f15730b = r1;
        f15731c = new IntrinsicMinMax[]{r02, r1};
    }

    public static IntrinsicMinMax valueOf(String str) {
        return (IntrinsicMinMax) Enum.valueOf(IntrinsicMinMax.class, str);
    }

    public static IntrinsicMinMax[] values() {
        return (IntrinsicMinMax[]) f15731c.clone();
    }
}
