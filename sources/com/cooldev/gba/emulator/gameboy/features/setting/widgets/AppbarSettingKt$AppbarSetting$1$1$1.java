package com.cooldev.gba.emulator.gameboy.features.setting.widgets;

import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AppbarSettingKt$AppbarSetting$1$1$1 extends r implements a {
    public static final AppbarSettingKt$AppbarSetting$1$1$1 INSTANCE = new AppbarSettingKt$AppbarSetting$1$1$1();

    public AppbarSettingKt$AppbarSetting$1$1$1() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m355invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m355invoke() {
        MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().pop();
    }
}
