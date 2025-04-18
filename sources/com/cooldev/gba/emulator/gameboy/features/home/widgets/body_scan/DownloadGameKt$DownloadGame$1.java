package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class DownloadGameKt$DownloadGame$1 extends r implements a {
    public static final DownloadGameKt$DownloadGame$1 INSTANCE = new DownloadGameKt$DownloadGame$1();

    public DownloadGameKt$DownloadGame$1() {
        super(0);
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m247invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m247invoke() {
        MultiNavigationAppStateKt.getLocalNavigationState().getDashboardNavigation().navigateTo(RouterName.GUIDE);
    }
}
