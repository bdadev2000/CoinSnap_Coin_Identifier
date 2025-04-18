package ef;

import kotlin.jvm.internal.Intrinsics;
import wh.a0;

/* loaded from: classes4.dex */
public abstract class a {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17347b;

    /* renamed from: c, reason: collision with root package name */
    public final a0[] f17348c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17349d;

    public a(int i10, a0... shaders) {
        Intrinsics.checkNotNullParameter(shaders, "shaders");
        this.a = i10;
        this.f17347b = false;
        this.f17348c = shaders;
    }
}
