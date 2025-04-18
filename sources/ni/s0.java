package ni;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.plantcare.ai.identifier.plantid.utils.network_adapter_factory.ResultWrapper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 {
    public final wh.u0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22877b;

    public s0(wh.u0 u0Var, Object obj) {
        this.a = u0Var;
        this.f22877b = obj;
    }

    public static s0 a(ResultWrapper resultWrapper) {
        wh.t0 t0Var = new wh.t0();
        t0Var.f27201c = 200;
        Intrinsics.checkNotNullParameter("OK", PglCryptUtils.KEY_MESSAGE);
        t0Var.f27202d = "OK";
        wh.m0 protocol = wh.m0.HTTP_1_1;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        t0Var.f27200b = protocol;
        wh.n0 n0Var = new wh.n0();
        n0Var.i("http://localhost/");
        wh.o0 request = n0Var.b();
        Intrinsics.checkNotNullParameter(request, "request");
        t0Var.a = request;
        return b(resultWrapper, t0Var.a());
    }

    public static s0 b(Object obj, wh.u0 u0Var) {
        if (u0Var.j()) {
            return new s0(u0Var, obj);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.a.toString();
    }
}
