package y0;

import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class f extends ContinuationImpl {

    /* renamed from: b, reason: collision with root package name */
    public Serializable f27723b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f27724c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27725d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f27726f;

    /* renamed from: g, reason: collision with root package name */
    public int f27727g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Continuation continuation) {
        super(continuation);
        this.f27726f = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27725d = obj;
        this.f27727g |= Integer.MIN_VALUE;
        return i.a(this.f27726f, null, null, this);
    }
}
