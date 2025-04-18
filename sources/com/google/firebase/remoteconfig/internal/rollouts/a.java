package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28921a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RolloutsStateSubscriber f28922b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RolloutsState f28923c;

    public /* synthetic */ a(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i2) {
        this.f28921a = i2;
        this.f28922b = rolloutsStateSubscriber;
        this.f28923c = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f28921a;
        RolloutsState rolloutsState = this.f28923c;
        RolloutsStateSubscriber rolloutsStateSubscriber = this.f28922b;
        switch (i2) {
            case 0:
                RolloutsStateSubscriptionsHandler.b(rolloutsStateSubscriber, rolloutsState);
                return;
            default:
                RolloutsStateSubscriptionsHandler.a(rolloutsStateSubscriber, rolloutsState);
                return;
        }
    }
}
