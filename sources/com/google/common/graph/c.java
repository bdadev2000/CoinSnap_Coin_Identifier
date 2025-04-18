package com.google.common.graph;

import com.google.common.base.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f28777b;

    public /* synthetic */ c(Network network, int i2) {
        this.f28776a = i2;
        this.f28777b = network;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        int i2 = this.f28776a;
        Network network = this.f28777b;
        switch (i2) {
            case 0:
                return ImmutableNetwork.c(network, obj);
            default:
                return ImmutableNetwork.b(network, obj);
        }
    }
}
