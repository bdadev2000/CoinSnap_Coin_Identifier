package d6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f16856d = 0;
    public int[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f16857b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f16858c;

    static {
        new com.facebook.c(25, 0);
    }

    public a(int[] shape) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.a = shape;
        int a = com.facebook.c.a(shape);
        this.f16857b = a;
        this.f16858c = new float[a];
    }
}
