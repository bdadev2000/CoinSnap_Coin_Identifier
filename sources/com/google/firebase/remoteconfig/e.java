package com.google.firebase.remoteconfig;

import d1.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f28913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConfigUpdate f28914c;

    public /* synthetic */ e(q qVar, ConfigUpdate configUpdate, int i2) {
        this.f28912a = i2;
        this.f28913b = qVar;
        this.f28914c = configUpdate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28912a;
        ConfigUpdate configUpdate = this.f28914c;
        q qVar = this.f28913b;
        switch (i2) {
            case 0:
                RemoteConfigKt$configUpdates$1$registration$1.a(qVar, configUpdate);
                return;
            default:
                com.google.firebase.remoteconfig.ktx.RemoteConfigKt$configUpdates$1$registration$1.a(qVar, configUpdate);
                return;
        }
    }
}
