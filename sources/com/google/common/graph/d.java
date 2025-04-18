package com.google.common.graph;

import com.google.common.base.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28780c;

    public /* synthetic */ d(int i2, Object obj, Object obj2) {
        this.f28778a = i2;
        this.f28780c = obj;
        this.f28779b = obj2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        Object lambda$adjacentNodeFn$2;
        int i2 = this.f28778a;
        Object obj2 = this.f28779b;
        Object obj3 = this.f28780c;
        switch (i2) {
            case 0:
                lambda$adjacentNodeFn$2 = ImmutableNetwork.lambda$adjacentNodeFn$2((Network) obj3, obj2, obj);
                return lambda$adjacentNodeFn$2;
            default:
                return ImmutableValueGraph.a((ValueGraph) obj3, obj2, obj);
        }
    }
}
