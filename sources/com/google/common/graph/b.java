package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.graph.DirectedGraphConnections;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28775b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f28774a = i2;
        this.f28775b = obj;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        int i2 = this.f28774a;
        Object obj2 = this.f28775b;
        switch (i2) {
            case 0:
                return DirectedGraphConnections.c(obj2, obj);
            case 1:
                return DirectedGraphConnections.b(obj2, obj);
            case 2:
                return DirectedGraphConnections.a(obj2, (DirectedGraphConnections.NodeConnection) obj);
            default:
                return UndirectedGraphConnections.a(obj2, obj);
        }
    }
}
