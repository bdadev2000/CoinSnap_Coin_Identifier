package com.cooldev.gba.emulator.gameboy.router;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class MultiNavigationAppState$pop$1 extends r implements a {
    final /* synthetic */ MultiNavigationAppState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiNavigationAppState$pop$1(MultiNavigationAppState multiNavigationAppState) {
        super(0);
        this.this$0 = multiNavigationAppState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m386invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m386invoke() {
        String currentRoute;
        String targetRoute;
        currentRoute = this.this$0.getCurrentRoute();
        targetRoute = this.this$0.getTargetRoute();
        if (p0.a.g(currentRoute, targetRoute)) {
            return;
        }
        this.this$0.getGetNavController().n();
    }
}
