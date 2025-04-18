package androidx.navigation.serialization;

import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.serialization.RouteBuilder;
import d0.b0;
import kotlin.jvm.internal.r;
import p0.a;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RouteSerializerKt$generateRoutePattern$2 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RouteBuilder f20794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateRoutePattern$2(RouteBuilder routeBuilder) {
        super(3);
        this.f20794a = routeBuilder;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        NavType navType = (NavType) obj3;
        a.s(str, "argName");
        a.s(navType, "navType");
        RouteBuilder routeBuilder = this.f20794a;
        routeBuilder.getClass();
        int ordinal = (((navType instanceof CollectionNavType) || routeBuilder.f20780a.b().h(intValue)) ? RouteBuilder.ParamType.f20784b : RouteBuilder.ParamType.f20783a).ordinal();
        if (ordinal == 0) {
            routeBuilder.f20782c += '/' + ("{" + str + '}');
        } else if (ordinal == 1) {
            routeBuilder.a(str, "{" + str + '}');
        }
        return b0.f30125a;
    }
}
