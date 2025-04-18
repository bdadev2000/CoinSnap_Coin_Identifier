package com.cooldev.gba.emulator.gameboy.widgets.app_bar;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class ManageSubIconWidgetKt$ManageSubIconWidget$$inlined$debounced$1 extends r implements a {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageSubIconWidgetKt$ManageSubIconWidget$$inlined$debounced$1(long j2, MutableLongState mutableLongState) {
        super(0);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m403invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m403invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo(RouterName.MANAGE_SUB);
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
