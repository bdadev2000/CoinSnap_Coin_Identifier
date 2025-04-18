package com.applovin.impl.sdk.ad;

import androidx.core.util.Consumer;
import com.applovin.impl.tl;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26573b;

    public /* synthetic */ d(Object obj, int i2) {
        this.f26572a = i2;
        this.f26573b = obj;
    }

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        int i2 = this.f26572a;
        Object obj2 = this.f26573b;
        switch (i2) {
            case 0:
                a.i1((a) obj2, (tl) obj);
                return;
            default:
                b.L((String) obj2, (tl) obj);
                return;
        }
    }
}
