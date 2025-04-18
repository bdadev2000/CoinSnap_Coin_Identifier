package org.koin.core.scope;

import d0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class Scope$close$1 extends r implements a {
    final /* synthetic */ Scope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Scope$close$1(Scope scope) {
        super(0);
        this.this$0 = scope;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m814invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m814invoke() {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.this$0.get_koin().getLogger().debug("|- (-) Scope - id:'" + this.this$0.getId() + '\'');
        arrayList = this.this$0._callbacks;
        Scope scope = this.this$0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScopeCallback) it.next()).onScopeClose(scope);
        }
        arrayList2 = this.this$0._callbacks;
        arrayList2.clear();
        this.this$0.set_source(null);
        this.this$0._closed = true;
        this.this$0.get_koin().getScopeRegistry().deleteScope$koin_core(this.this$0);
    }
}
