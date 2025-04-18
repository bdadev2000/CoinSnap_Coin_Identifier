package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.net.MediaType;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28768a;

    public /* synthetic */ d(int i2) {
        this.f28768a = i2;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.f28768a) {
            case 0:
                return TreeBasedTable.a((Map) obj);
            case 1:
                return ImmutableMultiset.copyOf((Collection) obj);
            default:
                return MediaType.a((String) obj);
        }
    }
}
