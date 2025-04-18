package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f28896b;

    public /* synthetic */ a(DefaultHeartBeatController defaultHeartBeatController, int i2) {
        this.f28895a = i2;
        this.f28896b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = this.f28895a;
        DefaultHeartBeatController defaultHeartBeatController = this.f28896b;
        switch (i2) {
            case 0:
                return DefaultHeartBeatController.b(defaultHeartBeatController);
            default:
                return DefaultHeartBeatController.a(defaultHeartBeatController);
        }
    }
}
