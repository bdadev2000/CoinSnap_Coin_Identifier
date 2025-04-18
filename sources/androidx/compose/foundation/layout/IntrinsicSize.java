package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IntrinsicSize {

    /* renamed from: a, reason: collision with root package name */
    public static final IntrinsicSize f4029a;

    /* renamed from: b, reason: collision with root package name */
    public static final IntrinsicSize f4030b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicSize[] f4031c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.foundation.layout.IntrinsicSize] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.foundation.layout.IntrinsicSize] */
    static {
        ?? r02 = new Enum("Min", 0);
        f4029a = r02;
        ?? r1 = new Enum("Max", 1);
        f4030b = r1;
        f4031c = new IntrinsicSize[]{r02, r1};
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) f4031c.clone();
    }
}
