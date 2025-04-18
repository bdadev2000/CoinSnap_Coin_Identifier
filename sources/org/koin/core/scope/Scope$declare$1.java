package org.koin.core.scope;

import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.koin.core.definition.Kind;
import org.koin.core.qualifier.Qualifier;
import q0.a;
import x0.c;

/* loaded from: classes.dex */
public final class Scope$declare$1 extends r implements a {
    final /* synthetic */ boolean $allowOverride;
    final /* synthetic */ T $instance;
    final /* synthetic */ Qualifier $qualifier;
    final /* synthetic */ List<c> $secondaryTypes;
    final /* synthetic */ Scope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Scope$declare$1(Scope scope, T t2, Qualifier qualifier, List<? extends c> list, boolean z2) {
        super(0);
        this.this$0 = scope;
        this.$instance = t2;
        this.$qualifier = qualifier;
        this.$secondaryTypes = list;
        this.$allowOverride = z2;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m815invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m815invoke() {
        this.this$0.get_koin().getInstanceRegistry();
        this.this$0.getScopeQualifier();
        this.this$0.getId();
        Kind kind = Kind.Singleton;
        p0.a.A0();
        throw null;
    }
}
