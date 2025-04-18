package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_lifetime.widgets;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$3$1 extends r implements a {
    final /* synthetic */ a $debouncedOnClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$3$1(a aVar) {
        super(0);
        this.$debouncedOnClick = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m313invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m313invoke() {
        this.$debouncedOnClick.invoke();
    }
}
