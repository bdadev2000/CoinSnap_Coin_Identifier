package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class AppOpenAdViewModel$showAd$4 extends r implements a {
    final /* synthetic */ a $onAdDismissed;
    final /* synthetic */ AppOpenAdViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$showAd$4$1, reason: invalid class name */
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
            return appOpenAdState.copy(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppOpenAdViewModel$showAd$4(AppOpenAdViewModel appOpenAdViewModel, a aVar) {
        super(0);
        this.this$0 = appOpenAdViewModel;
        this.$onAdDismissed = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m61invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m61invoke() {
        this.this$0.updateState(AnonymousClass1.INSTANCE);
        this.$onAdDismissed.invoke();
    }
}
