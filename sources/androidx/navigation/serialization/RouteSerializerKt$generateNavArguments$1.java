package androidx.navigation.serialization;

import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes4.dex */
final class RouteSerializerKt$generateNavArguments$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1.a f20789a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateNavArguments$1(k1.a aVar) {
        super(0);
        this.f20789a = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.f20789a + ". Arguments can only be generated from concrete classes or objects.");
    }
}
