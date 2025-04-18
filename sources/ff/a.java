package ff;

import df.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class a {
    public final bf.a a;

    /* renamed from: b, reason: collision with root package name */
    public e f17857b;

    /* renamed from: c, reason: collision with root package name */
    public int f17858c;

    /* renamed from: d, reason: collision with root package name */
    public int f17859d;

    public a(bf.a eglCore, e eglSurface) {
        Intrinsics.checkNotNullParameter(eglCore, "eglCore");
        Intrinsics.checkNotNullParameter(eglSurface, "eglSurface");
        this.a = eglCore;
        this.f17857b = eglSurface;
        this.f17858c = -1;
        this.f17859d = -1;
    }
}
