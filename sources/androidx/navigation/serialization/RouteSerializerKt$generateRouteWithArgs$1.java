package androidx.navigation.serialization;

import android.support.v4.media.d;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import androidx.navigation.serialization.RouteBuilder;
import d0.b0;
import e0.u;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r;
import p0.a;
import q0.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RouteSerializerKt$generateRouteWithArgs$1 extends r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map f20795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RouteBuilder f20796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateRouteWithArgs$1(Map map, RouteBuilder routeBuilder) {
        super(3);
        this.f20795a = map;
        this.f20796b = routeBuilder;
    }

    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        String str = (String) obj2;
        NavType navType = (NavType) obj3;
        a.s(str, "argName");
        a.s(navType, "navType");
        Object obj4 = this.f20795a.get(str);
        a.p(obj4);
        List list = (List) obj4;
        RouteBuilder routeBuilder = this.f20796b;
        routeBuilder.getClass();
        int ordinal = (((navType instanceof CollectionNavType) || routeBuilder.f20780a.b().h(intValue)) ? RouteBuilder.ParamType.f20784b : RouteBuilder.ParamType.f20783a).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    routeBuilder.a(str, (String) it.next());
                }
            }
        } else {
            if (list.size() != 1) {
                StringBuilder v2 = d.v("Expected one value for argument ", str, ", found ");
                v2.append(list.size());
                v2.append("values instead.");
                throw new IllegalArgumentException(v2.toString().toString());
            }
            routeBuilder.f20782c += '/' + ((String) u.E0(list));
        }
        return b0.f30125a;
    }
}
