package com.cooldev.gba.emulator.gameboy.features.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import d0.b0;
import d1.q;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserver$observe$1", f = "ConnectivityObserver.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ConnectivityObserver$observe$1 extends i implements p {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ConnectivityObserver this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserver$observe$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements a {
        final /* synthetic */ ConnectivityObserver$observe$1$networkChangeReceiver$1 $networkChangeReceiver;
        final /* synthetic */ ConnectivityObserver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ConnectivityObserver connectivityObserver, ConnectivityObserver$observe$1$networkChangeReceiver$1 connectivityObserver$observe$1$networkChangeReceiver$1) {
            super(0);
            this.this$0 = connectivityObserver;
            this.$networkChangeReceiver = connectivityObserver$observe$1$networkChangeReceiver$1;
        }

        @Override // q0.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m262invoke();
            return b0.f30125a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m262invoke() {
            Context context;
            context = this.this$0.context;
            context.unregisterReceiver(this.$networkChangeReceiver);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectivityObserver$observe$1(ConnectivityObserver connectivityObserver, g gVar) {
        super(2, gVar);
        this.this$0 = connectivityObserver;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        ConnectivityObserver$observe$1 connectivityObserver$observe$1 = new ConnectivityObserver$observe$1(this.this$0, gVar);
        connectivityObserver$observe$1.L$0 = obj;
        return connectivityObserver$observe$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull q qVar, @Nullable g gVar) {
        return ((ConnectivityObserver$observe$1) create(qVar, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserver$observe$1$networkChangeReceiver$1, android.content.BroadcastReceiver] */
    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Context context;
        Context context2;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.jvm.internal.q.m(obj);
            final q qVar = (q) this.L$0;
            context = this.this$0.context;
            Object systemService = context.getSystemService("connectivity");
            p0.a.q(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            final ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            ?? r3 = new BroadcastReceiver() { // from class: com.cooldev.gba.emulator.gameboy.features.network.ConnectivityObserver$observe$1$networkChangeReceiver$1
                @Override // android.content.BroadcastReceiver
                public void onReceive(@Nullable Context context3, @Nullable Intent intent) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    boolean z2 = false;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        z2 = true;
                    }
                    ((d1.p) qVar).b(Boolean.valueOf(z2));
                }
            };
            IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            context2 = this.this$0.context;
            context2.registerReceiver(r3, intentFilter);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, r3);
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
