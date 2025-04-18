package y0;

import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public Iterator f27747b;

    /* renamed from: c, reason: collision with root package name */
    public Object f27748c;

    /* renamed from: d, reason: collision with root package name */
    public int f27749d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f27750f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f27751g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f27752h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list, List list2, Continuation continuation) {
        super(2, continuation);
        this.f27751g = list;
        this.f27752h = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        h hVar = new h(this.f27751g, this.f27752h, continuation);
        hVar.f27750f = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f27749d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    it = this.f27747b;
                    list = (List) this.f27750f;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Object obj2 = this.f27748c;
                Iterator it2 = this.f27747b;
                List list2 = (List) this.f27750f;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    obj = obj2;
                    it = it2;
                    list = list2;
                } else {
                    list2.add(new g(null));
                    this.f27750f = list2;
                    this.f27747b = it2;
                    this.f27748c = null;
                    this.f27749d = 2;
                    throw null;
                }
            }
        } else {
            ResultKt.throwOnFailure(obj);
            obj = this.f27750f;
            it = this.f27751g.iterator();
            list = this.f27752h;
        }
        if (!it.hasNext()) {
            return obj;
        }
        a4.j.t(it.next());
        this.f27750f = list;
        this.f27747b = it;
        this.f27748c = obj;
        this.f27749d = 1;
        throw null;
    }
}
