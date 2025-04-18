package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.ge;
import com.applovin.impl.mediation.g;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25569b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25570c;
    public final /* synthetic */ Object d;

    public /* synthetic */ u(Object obj, int i2, Object obj2, Object obj3) {
        this.f25568a = i2;
        this.f25569b = obj;
        this.f25570c = obj2;
        this.d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f25568a;
        Object obj = this.d;
        Object obj2 = this.f25570c;
        Object obj3 = this.f25569b;
        switch (i2) {
            case 0:
                ((g.d) obj3).a((MaxError) obj2, (Bundle) obj);
                return;
            case 1:
                ((g.e) obj3).a((MaxAdapter.InitializationStatus) obj2, (String) obj);
                return;
            case 2:
                ((g) obj3).a((ge) obj2, (Activity) obj);
                return;
            case 3:
                ((g) obj3).a((String) obj2, (Runnable) obj);
                return;
            default:
                ((g) obj3).a((ge) obj2, (Runnable) obj);
                return;
        }
    }
}
