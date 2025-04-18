package androidx.navigation.serialization;

import android.support.v4.media.d;
import e1.t0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import q0.a;
import x0.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RouteSerializerKt$generateRoutePattern$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1.a f20793a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateRoutePattern$1(k1.a aVar) {
        super(0);
        this.f20793a = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
        c l2 = t0.l(this.f20793a.b());
        throw new IllegalArgumentException(d.r(sb, l2 != null ? ((j) l2).c() : null, ". Routes can only be generated from concrete classes or objects."));
    }
}
