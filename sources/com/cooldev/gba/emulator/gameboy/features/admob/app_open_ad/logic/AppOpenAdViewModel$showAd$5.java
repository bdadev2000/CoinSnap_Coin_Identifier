package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class AppOpenAdViewModel$showAd$5 extends r implements a {
    final /* synthetic */ AppOpenAdViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$showAd$5$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final AppOpenAdState invoke(@NotNull AppOpenAdState appOpenAdState) {
            p0.a.s(appOpenAdState, "it");
            return appOpenAdState.copy(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppOpenAdViewModel$showAd$5(AppOpenAdViewModel appOpenAdViewModel) {
        super(0);
        this.this$0 = appOpenAdViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m62invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m62invoke() {
        this.this$0.updateState(AnonymousClass1.INSTANCE);
    }
}
