package k1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n0.l1;

/* loaded from: classes.dex */
public final class f {
    public final Class a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f20212b;

    public f(Class clazz, l1 initializer) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.a = clazz;
        this.f20212b = initializer;
    }
}
