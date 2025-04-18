package n1;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* loaded from: classes2.dex */
public final class k0 extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31094a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1.a f31095b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k1.a f31096c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(k1.a aVar, k1.a aVar2, int i2) {
        super(1);
        this.f31094a = i2;
        this.f31095b = aVar;
        this.f31096c = aVar2;
    }

    public final void b(l1.a aVar) {
        int i2 = this.f31094a;
        k1.a aVar2 = this.f31096c;
        k1.a aVar3 = this.f31095b;
        switch (i2) {
            case 0:
                p0.a.s(aVar, "$this$buildSerialDescriptor");
                l1.a.a(aVar, SDKConstants.PARAM_KEY, aVar3.b());
                l1.a.a(aVar, "value", aVar2.b());
                return;
            default:
                p0.a.s(aVar, "$this$buildClassSerialDescriptor");
                l1.a.a(aVar, "first", aVar3.b());
                l1.a.a(aVar, "second", aVar2.b());
                return;
        }
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        d0.b0 b0Var = d0.b0.f30125a;
        switch (this.f31094a) {
            case 0:
                b((l1.a) obj);
                return b0Var;
            default:
                b((l1.a) obj);
                return b0Var;
        }
    }
}
