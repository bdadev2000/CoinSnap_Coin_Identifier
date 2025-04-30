package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.be;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9200c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9201d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9202f;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i9) {
        this.b = i9;
        this.f9200c = obj;
        this.f9201d = obj2;
        this.f9202f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((g.c) this.f9200c).a((MaxError) this.f9201d, (Bundle) this.f9202f);
                return;
            case 1:
                ((g.d) this.f9200c).a((MaxAdapter.InitializationStatus) this.f9201d, (String) this.f9202f);
                return;
            case 2:
                ((g) this.f9200c).a((be) this.f9201d, (Activity) this.f9202f);
                return;
            case 3:
                ((g) this.f9200c).a((be) this.f9201d, (Runnable) this.f9202f);
                return;
            default:
                ((g) this.f9200c).a((String) this.f9201d, (Runnable) this.f9202f);
                return;
        }
    }
}
