package androidx.compose.ui.layout;

import com.google.common.net.HttpHeaders;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class IntrinsicWidthHeight {

    /* renamed from: a, reason: collision with root package name */
    public static final IntrinsicWidthHeight f15732a;

    /* renamed from: b, reason: collision with root package name */
    public static final IntrinsicWidthHeight f15733b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ IntrinsicWidthHeight[] f15734c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.ui.layout.IntrinsicWidthHeight] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.ui.layout.IntrinsicWidthHeight] */
    static {
        ?? r02 = new Enum(HttpHeaders.WIDTH, 0);
        f15732a = r02;
        ?? r1 = new Enum("Height", 1);
        f15733b = r1;
        f15734c = new IntrinsicWidthHeight[]{r02, r1};
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) f15734c.clone();
    }
}
