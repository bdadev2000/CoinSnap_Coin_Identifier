package y0;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes.dex */
public final class t implements FlowCollector {

    /* renamed from: b, reason: collision with root package name */
    public static final t f27841b = new t();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return Unit.INSTANCE;
    }
}
