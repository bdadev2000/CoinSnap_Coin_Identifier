package n1;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class w implements k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31144a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.h f31145b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f31146c;
    public final e0.w d;

    public w() {
        d0.b0 b0Var = d0.b0.f30125a;
        this.f31144a = 1;
        this.f31146c = b0Var;
        this.d = e0.w.f30218a;
        this.f31145b = b1.f0.s(d0.i.f30132b, new h.a0(3, "kotlin.Unit", this));
    }

    @Override // k1.a
    public final void a(p0.a aVar, Object obj) {
        switch (this.f31144a) {
            case 0:
                Enum r5 = (Enum) obj;
                p0.a.s(aVar, "encoder");
                p0.a.s(r5, "value");
                Enum[] enumArr = (Enum[]) this.f31146c;
                int d02 = e0.q.d0(enumArr, r5);
                if (d02 != -1) {
                    aVar.T(b(), d02);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(r5);
                sb.append(" is not a valid enum ");
                sb.append(b().g());
                sb.append(", must be one of ");
                String arrays = Arrays.toString(enumArr);
                p0.a.r(arrays, "toString(...)");
                sb.append(arrays);
                throw new IllegalArgumentException(sb.toString());
            default:
                p0.a.s(aVar, "encoder");
                p0.a.s(obj, "value");
                p0.a.s(b(), "descriptor");
                p0.a.s(b(), "descriptor");
                return;
        }
    }

    @Override // k1.a
    public final l1.f b() {
        d0.h hVar = this.f31145b;
        switch (this.f31144a) {
            case 0:
                return (l1.f) hVar.getValue();
            default:
                return (l1.f) hVar.getValue();
        }
    }

    public final String toString() {
        switch (this.f31144a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + b().g() + '>';
            default:
                return super.toString();
        }
    }

    public w(String str, Enum[] enumArr) {
        this.f31144a = 0;
        this.f31146c = enumArr;
        this.f31145b = b1.f0.t(new h.a0(2, this, str));
    }
}
