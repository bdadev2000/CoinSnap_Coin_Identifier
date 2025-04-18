package com.cooldev.gba.emulator.gameboy.features.home.widgets;

import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.HomeEvents;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AppbarHomeKt$AppbarHome$1$1$1 extends r implements a {
    public static final AppbarHomeKt$AppbarHome$1$1$1 INSTANCE = new AppbarHomeKt$AppbarHome$1$1$1();

    public AppbarHomeKt$AppbarHome$1$1$1() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m231invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m231invoke() {
        HomeEvents.INSTANCE.logSettingButton();
    }
}
