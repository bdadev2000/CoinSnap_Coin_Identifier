package com.cooldev.gba.emulator.gameboy.router;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class MultiNavigationAppState$popWithData$1 extends r implements a {
    final /* synthetic */ Object $data;
    final /* synthetic */ String $key;
    final /* synthetic */ MultiNavigationAppState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiNavigationAppState$popWithData$1(MultiNavigationAppState multiNavigationAppState, String str, Object obj) {
        super(0);
        this.this$0 = multiNavigationAppState;
        this.$key = str;
        this.$data = obj;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m387invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m387invoke() {
        String currentRoute;
        String targetRoute;
        SavedStateHandle b2;
        currentRoute = this.this$0.getCurrentRoute();
        targetRoute = this.this$0.getTargetRoute();
        if (p0.a.g(currentRoute, targetRoute)) {
            return;
        }
        NavBackStackEntry i2 = this.this$0.getGetNavController().i();
        if (i2 != null && (b2 = i2.b()) != null) {
            b2.c(this.$data, this.$key);
        }
        this.this$0.getGetNavController().n();
    }
}
