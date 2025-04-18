package k1;

import java.util.List;
import kotlin.jvm.internal.r;
import n1.f0;
import x0.o;

/* loaded from: classes3.dex */
public final class f extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f30901b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i2) {
        super(0);
        this.f30900a = i2;
        this.f30901b = list;
    }

    public final x0.d b() {
        int i2 = this.f30900a;
        List list = this.f30901b;
        switch (i2) {
            case 0:
                return ((f0) ((o) list.get(0))).b();
            case 1:
                return ((f0) ((o) list.get(0))).b();
            default:
                return ((f0) ((o) list.get(0))).b();
        }
    }

    @Override // q0.a
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f30900a) {
            case 0:
                return b();
            case 1:
                return b();
            default:
                return b();
        }
    }
}
