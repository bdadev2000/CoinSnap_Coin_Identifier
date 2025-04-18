package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import e0.e0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NavGraph$setStartDestination$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20463a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph$setStartDestination$2(Object obj) {
        super(1);
        this.f20463a = obj;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavDestination navDestination = (NavDestination) obj;
        p0.a.s(navDestination, "startDestination");
        Map x = e0.x(navDestination.f20435g);
        LinkedHashMap linkedHashMap = new LinkedHashMap(q.g(x.size()));
        for (Map.Entry entry : x.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((NavArgument) entry.getValue()).f20320a);
        }
        return RouteSerializerKt.e(this.f20463a, linkedHashMap);
    }
}
