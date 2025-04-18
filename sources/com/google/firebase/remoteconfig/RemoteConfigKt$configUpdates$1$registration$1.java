package com.google.firebase.remoteconfig;

import d1.h;
import d1.i;
import d1.k;
import d1.p;
import d1.q;
import h0.m;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class RemoteConfigKt$configUpdates$1$registration$1 implements ConfigUpdateListener {
    final /* synthetic */ q $$this$callbackFlow;
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;

    public RemoteConfigKt$configUpdates$1$registration$1(FirebaseRemoteConfig firebaseRemoteConfig, q qVar) {
        this.$this_configUpdates = firebaseRemoteConfig;
        this.$$this$callbackFlow = qVar;
    }

    public static final void onUpdate$lambda$0(q qVar, ConfigUpdate configUpdate) {
        p0.a.s(qVar, "$$this$callbackFlow");
        p0.a.s(configUpdate, "$configUpdate");
        Object b2 = ((p) qVar).b(configUpdate);
        if (!(b2 instanceof h)) {
        } else {
            Object obj = ((i) kotlin.jvm.internal.e.z(m.f30726a, new k(qVar, configUpdate, null))).f30180a;
        }
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onError(@NotNull FirebaseRemoteConfigException firebaseRemoteConfigException) {
        p0.a.s(firebaseRemoteConfigException, "error");
        p0.a.m(this.$$this$callbackFlow, kotlin.jvm.internal.e.a("Error listening for config updates.", firebaseRemoteConfigException));
    }

    @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
    public void onUpdate(@NotNull ConfigUpdate configUpdate) {
        p0.a.s(configUpdate, "configUpdate");
        this.$this_configUpdates.schedule(new e(this.$$this$callbackFlow, configUpdate, 0));
    }
}
