package ni;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22807i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22808j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22809k;

    public /* synthetic */ i0(Method method, int i10, int i11) {
        this.f22807i = i11;
        this.f22808j = method;
        this.f22809k = i10;
    }

    @Override // va.b
    public final void e(p0 p0Var, Object obj) {
        int i10 = this.f22807i;
        int i11 = this.f22809k;
        Method method = this.f22808j;
        switch (i10) {
            case 0:
                wh.z headers = (wh.z) obj;
                if (headers != null) {
                    a4.s sVar = p0Var.f22833f;
                    sVar.getClass();
                    Intrinsics.checkNotNullParameter(headers, "headers");
                    int length = headers.f27243b.length / 2;
                    for (int i12 = 0; i12 < length; i12++) {
                        sVar.c(headers.b(i12), headers.d(i12));
                    }
                    return;
                }
                throw com.facebook.appevents.g.C(method, i11, "Headers parameter must not be null.", new Object[0]);
            default:
                if (obj != null) {
                    p0Var.f22830c = obj.toString();
                    return;
                }
                throw com.facebook.appevents.g.C(method, i11, "@Url parameter is null.", new Object[0]);
        }
    }
}
