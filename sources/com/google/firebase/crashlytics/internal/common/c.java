package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28865c;

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.f28863a = i2;
        this.f28864b = obj;
        this.f28865c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28863a;
        Object obj = this.f28865c;
        Object obj2 = this.f28864b;
        switch (i2) {
            case 0:
                CrashlyticsController.b((CrashlyticsController) obj2, (String) obj);
                return;
            case 1:
                CrashlyticsCore.i((CrashlyticsCore) obj2, (Map) obj);
                return;
            default:
                CrashlyticsCore.h((CrashlyticsCore) obj2, (String) obj);
                return;
        }
    }
}
