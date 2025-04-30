package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.xq;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public final /* synthetic */ class P2 implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6457c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6458d;

    public /* synthetic */ P2(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f6457c = obj;
        this.f6458d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                vm.e((vm) this.f6457c, (MaxErrorImpl) ((MaxError) this.f6458d));
                return;
            case 1:
                C0771w1.a((C0771w1) this.f6457c, (Runnable) this.f6458d);
                return;
            case 2:
                wm.i((wm) this.f6457c, (MaxErrorImpl) ((MaxError) this.f6458d));
                return;
            case 3:
                ((xq.a) this.f6457c).a((Exception) this.f6458d);
                return;
            case 4:
                ((xq.a) this.f6457c).b((String) this.f6458d);
                return;
            case 5:
                ((xq.a) this.f6457c).a((yq) this.f6458d);
                return;
            case 6:
                zl.e((zl) this.f6457c, (ke) this.f6458d);
                return;
            default:
                zp.a((Context) this.f6457c, (String) this.f6458d);
                return;
        }
    }
}
