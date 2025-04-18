package ge;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes4.dex */
public final class d {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18403c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18404d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18405e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18406f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18407g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18408h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18409i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18410j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18411k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18412l;

    public d(Context context, TypedArray typedArray) {
        this.a = typedArray.getInteger(38, 2);
        f fVar = f.BACK;
        if (context != null && !fe.f.a(fVar)) {
            f fVar2 = f.FRONT;
            if (fe.f.a(fVar2)) {
                fVar = fVar2;
            }
        }
        this.f18402b = typedArray.getInteger(8, fVar.f18420b);
        this.f18403c = typedArray.getInteger(10, 0);
        this.f18404d = typedArray.getInteger(21, 0);
        this.f18405e = typedArray.getInteger(58, 0);
        this.f18406f = typedArray.getInteger(24, 0);
        this.f18407g = typedArray.getInteger(23, 0);
        this.f18408h = typedArray.getInteger(0, 1);
        this.f18409i = typedArray.getInteger(46, 0);
        this.f18410j = typedArray.getInteger(2, 0);
        this.f18411k = typedArray.getInteger(6, 0);
        this.f18412l = typedArray.getInteger(25, 0);
    }
}
