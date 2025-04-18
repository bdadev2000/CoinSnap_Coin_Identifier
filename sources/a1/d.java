package a1;

import ki.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import wh.c0;

/* loaded from: classes.dex */
public final class d extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f14b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i10) {
        super(0);
        this.f14b = i10;
        this.f15c = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z10;
        switch (this.f14b) {
            case 0:
                e eVar = this.f15c;
                b0 b0Var = (b0) eVar.f20d.invoke();
                b0Var.getClass();
                if (li.c.a(b0Var) != -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    return c0.h(b0Var.toString(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + eVar.f20d + ", instead got " + b0Var).toString());
            default:
                ac.e eVar2 = e.f17g;
                e eVar3 = this.f15c;
                synchronized (eVar2) {
                    e.f16f.remove(((b0) eVar3.f21e.getValue()).toString());
                }
                return Unit.INSTANCE;
        }
    }
}
