package androidx.navigation.serialization;

import androidx.navigation.NavArgument;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import d0.b0;
import java.util.Map;
import k1.a;
import kotlin.jvm.internal.r;
import l1.f;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class RouteSerializerKt$generateNavArguments$2$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f20790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f20792c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteSerializerKt$generateNavArguments$2$1(a aVar, int i2, Map map, String str) {
        super(1);
        this.f20790a = aVar;
        this.f20791b = i2;
        this.f20792c = map;
        this.d = str;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj;
        p0.a.s(navArgumentBuilder, "$this$navArgument");
        a aVar = this.f20790a;
        f b2 = aVar.b();
        int i2 = this.f20791b;
        f f2 = b2.f(i2);
        boolean b3 = f2.b();
        Map map = this.f20792c;
        NavType a2 = RouteSerializerKt.a(f2, map);
        if (a2 == null) {
            throw new IllegalArgumentException(RouteSerializerKt.f(this.d, f2.g(), aVar.b().g(), map.toString()));
        }
        NavArgument.Builder builder = navArgumentBuilder.f20326a;
        builder.getClass();
        builder.f20323a = a2;
        builder.f20324b = b3;
        if (aVar.b().h(i2)) {
            builder.e = true;
        }
        return b0.f30125a;
    }
}
