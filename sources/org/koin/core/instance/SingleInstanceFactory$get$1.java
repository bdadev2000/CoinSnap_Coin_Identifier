package org.koin.core.instance;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class SingleInstanceFactory$get$1 extends r implements a {
    final /* synthetic */ InstanceContext $context;
    final /* synthetic */ SingleInstanceFactory<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleInstanceFactory$get$1(SingleInstanceFactory<T> singleInstanceFactory, InstanceContext instanceContext) {
        super(0);
        this.this$0 = singleInstanceFactory;
        this.$context = instanceContext;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m790invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m790invoke() {
        if (this.this$0.isCreated(this.$context)) {
            return;
        }
        SingleInstanceFactory<T> singleInstanceFactory = this.this$0;
        ((SingleInstanceFactory) singleInstanceFactory).value = singleInstanceFactory.create(this.$context);
    }
}
