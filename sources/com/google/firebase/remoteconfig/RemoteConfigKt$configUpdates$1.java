package com.google.firebase.remoteconfig;

import d0.b0;
import d1.q;
import h0.g;
import j0.i;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import q0.p;

@j0.e(c = "com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1", f = "RemoteConfig.kt", l = {TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class RemoteConfigKt$configUpdates$1 extends i implements p {
    final /* synthetic */ FirebaseRemoteConfig $this_configUpdates;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.google.firebase.remoteconfig.RemoteConfigKt$configUpdates$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements q0.a {
        final /* synthetic */ ConfigUpdateListenerRegistration $registration;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConfigUpdateListenerRegistration configUpdateListenerRegistration) {
            super(0);
            this.$registration = configUpdateListenerRegistration;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m603invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m603invoke() {
            this.$registration.remove();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteConfigKt$configUpdates$1(FirebaseRemoteConfig firebaseRemoteConfig, g gVar) {
        super(2, gVar);
        this.$this_configUpdates = firebaseRemoteConfig;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        RemoteConfigKt$configUpdates$1 remoteConfigKt$configUpdates$1 = new RemoteConfigKt$configUpdates$1(this.$this_configUpdates, gVar);
        remoteConfigKt$configUpdates$1.L$0 = obj;
        return remoteConfigKt$configUpdates$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull q qVar, @Nullable g gVar) {
        return ((RemoteConfigKt$configUpdates$1) create(qVar, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            q qVar = (q) this.L$0;
            FirebaseRemoteConfig firebaseRemoteConfig = this.$this_configUpdates;
            ConfigUpdateListenerRegistration addOnConfigUpdateListener = firebaseRemoteConfig.addOnConfigUpdateListener(new RemoteConfigKt$configUpdates$1$registration$1(firebaseRemoteConfig, qVar));
            p0.a.r(addOnConfigUpdateListener, "FirebaseRemoteConfig.con…      }\n        }\n      )");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(addOnConfigUpdateListener);
            this.label = 1;
            if (p0.a.j(qVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.q.m(obj);
        }
        return b0.f30125a;
    }
}
