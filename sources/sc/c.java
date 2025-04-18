package sc;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes3.dex */
public final class c extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Object f24941b;

    /* renamed from: c, reason: collision with root package name */
    public Mutex f24942c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24943d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f24944f;

    /* renamed from: g, reason: collision with root package name */
    public int f24945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation) {
        super(continuation);
        this.f24944f = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f24943d = obj;
        this.f24945g |= Integer.MIN_VALUE;
        return this.f24944f.d(this);
    }
}
