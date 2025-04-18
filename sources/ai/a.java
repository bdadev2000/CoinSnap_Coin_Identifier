package ai;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f488b;

    /* renamed from: c, reason: collision with root package name */
    public c f489c;

    /* renamed from: d, reason: collision with root package name */
    public long f490d;

    public a(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = name;
        this.f488b = z10;
        this.f490d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
