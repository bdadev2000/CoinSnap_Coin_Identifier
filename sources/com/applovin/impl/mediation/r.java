package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.be;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6262b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6263c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6264d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6265f;

    public /* synthetic */ r(int i10, Object obj, Object obj2, Object obj3) {
        this.f6262b = i10;
        this.f6263c = obj;
        this.f6264d = obj2;
        this.f6265f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6262b;
        Object obj = this.f6265f;
        Object obj2 = this.f6264d;
        Object obj3 = this.f6263c;
        switch (i10) {
            case 0:
                ((g.c) obj3).a((MaxError) obj2, (Bundle) obj);
                return;
            case 1:
                ((g.d) obj3).a((MaxAdapter.InitializationStatus) obj2, (String) obj);
                return;
            case 2:
                ((g) obj3).a((String) obj2, (Runnable) obj);
                return;
            case 3:
                ((g) obj3).a((be) obj2, (Runnable) obj);
                return;
            default:
                ((g) obj3).a((be) obj2, (Activity) obj);
                return;
        }
    }
}
