package g8;

import t7.AbstractC2712a;
import t7.C2713b;
import x7.EnumC2928a;
import y7.AbstractC2959h;

/* loaded from: classes3.dex */
public final class s extends AbstractC2959h implements F7.q {

    /* renamed from: d, reason: collision with root package name */
    public int f20526d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ C2713b f20527f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f20528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, w7.f fVar) {
        super(3, fVar);
        this.f20528g = uVar;
    }

    @Override // F7.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        s sVar = new s(this.f20528g, (w7.f) obj3);
        sVar.f20527f = (C2713b) obj;
        return sVar.i(t7.y.f23029a);
    }

    @Override // y7.AbstractC2952a
    public final Object i(Object obj) {
        EnumC2928a enumC2928a = EnumC2928a.b;
        int i9 = this.f20526d;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC2712a.f(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC2712a.f(obj);
            C2713b c2713b = this.f20527f;
            u uVar = this.f20528g;
            byte w2 = ((U7.k) uVar.f20536c).w();
            if (w2 == 1) {
                return uVar.g(true);
            }
            if (w2 == 0) {
                return uVar.g(false);
            }
            if (w2 == 6) {
                this.f20526d = 1;
                obj = u.d(uVar, c2713b, this);
                if (obj == enumC2928a) {
                    return enumC2928a;
                }
            } else {
                if (w2 == 8) {
                    return uVar.f();
                }
                U7.k.r((U7.k) uVar.f20536c, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (f8.j) obj;
    }
}
