package h0;

import d0.b0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
public final class e extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l[] f30721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f30722b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l[] lVarArr, d0 d0Var) {
        super(2);
        this.f30721a = lVarArr;
        this.f30722b = d0Var;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) obj2;
        p0.a.s((b0) obj, "<anonymous parameter 0>");
        p0.a.s(jVar, "element");
        d0 d0Var = this.f30722b;
        int i2 = d0Var.f30925a;
        d0Var.f30925a = i2 + 1;
        this.f30721a[i2] = jVar;
        return b0.f30125a;
    }
}
