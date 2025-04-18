package y0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.ChannelResult;

/* loaded from: classes.dex */
public final class c1 extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f27698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e1 f27699c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f27700d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(p0 p0Var, e1 e1Var, q0 q0Var) {
        super(1);
        this.f27698b = p0Var;
        this.f27699c = e1Var;
        this.f27700d = q0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        Throwable th2 = (Throwable) obj;
        this.f27698b.invoke(th2);
        e1 e1Var = this.f27699c;
        e1Var.f27721c.close(th2);
        do {
            Object m1674getOrNullimpl = ChannelResult.m1674getOrNullimpl(e1Var.f27721c.mo1664tryReceivePtdJZtk());
            if (m1674getOrNullimpl != null) {
                this.f27700d.invoke(m1674getOrNullimpl, th2);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
        } while (unit != null);
        return Unit.INSTANCE;
    }
}
