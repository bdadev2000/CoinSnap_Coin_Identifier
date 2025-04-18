package g1;

import java.lang.reflect.Constructor;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Constructor f30620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Constructor constructor, int i2) {
        super(1);
        this.f30619a = i2;
        this.f30620b = constructor;
    }

    public final Throwable b(Throwable th) {
        int i2 = this.f30619a;
        Constructor constructor = this.f30620b;
        switch (i2) {
            case 0:
                Object newInstance = constructor.newInstance(th.getMessage(), th);
                p0.a.q(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) newInstance;
            case 1:
                Object newInstance2 = constructor.newInstance(th.getMessage());
                p0.a.q(newInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th2 = (Throwable) newInstance2;
                th2.initCause(th);
                return th2;
            case 2:
                Object newInstance3 = constructor.newInstance(th);
                p0.a.q(newInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) newInstance3;
            default:
                Object newInstance4 = constructor.newInstance(new Object[0]);
                p0.a.q(newInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th3 = (Throwable) newInstance4;
                th3.initCause(th);
                return th3;
        }
    }

    @Override // q0.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30619a) {
            case 0:
                return b((Throwable) obj);
            case 1:
                return b((Throwable) obj);
            case 2:
                return b((Throwable) obj);
            default:
                return b((Throwable) obj);
        }
    }
}
