package org.koin.core.instance;

import d0.b0;
import java.util.HashMap;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class ScopedInstanceFactory$get$1 extends r implements a {
    final /* synthetic */ InstanceContext $context;
    final /* synthetic */ ScopedInstanceFactory<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedInstanceFactory$get$1(ScopedInstanceFactory<T> scopedInstanceFactory, InstanceContext instanceContext) {
        super(0);
        this.this$0 = scopedInstanceFactory;
        this.$context = instanceContext;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m789invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m789invoke() {
        HashMap hashMap;
        if (this.this$0.isCreated(this.$context)) {
            return;
        }
        hashMap = ((ScopedInstanceFactory) this.this$0).values;
        hashMap.put(this.$context.getScope().getId(), this.this$0.create(this.$context));
    }
}
