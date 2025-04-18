package com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets;

import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class AppbarManageSubKt$AppbarManageSub$1$1$1 extends r implements a {
    public static final AppbarManageSubKt$AppbarManageSub$1$1$1 INSTANCE = new AppbarManageSubKt$AppbarManageSub$1$1$1();

    public AppbarManageSubKt$AppbarManageSub$1$1$1() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m255invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m255invoke() {
        MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().pop();
    }
}
