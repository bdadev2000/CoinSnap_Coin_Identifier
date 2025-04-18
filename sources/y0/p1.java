package y0;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 implements CoroutineContext.Element {

    /* renamed from: b, reason: collision with root package name */
    public final p1 f27825b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f27826c;

    public p1(p1 p1Var, u0 instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        this.f27825b = p1Var;
        this.f27826c = instance;
    }

    public final void a(j candidate) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        if (this.f27826c != candidate) {
            p1 p1Var = this.f27825b;
            if (p1Var != null) {
                p1Var.a(candidate);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return o1.f27820b;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
