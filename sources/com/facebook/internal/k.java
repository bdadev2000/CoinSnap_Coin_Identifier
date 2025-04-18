package com.facebook.internal;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.WorkQueue;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28601b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28602c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f28600a = i2;
        this.f28601b = obj;
        this.f28602c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28600a;
        Object obj = this.f28602c;
        Object obj2 = this.f28601b;
        switch (i2) {
            case 0:
                WorkQueue.a((WorkQueue.WorkNode) obj2, (WorkQueue) obj);
                return;
            default:
                ((FetchedAppSettingsManager.FetchedAppSettingsCallback) obj2).onSuccess((FetchedAppSettings) obj);
                return;
        }
    }
}
