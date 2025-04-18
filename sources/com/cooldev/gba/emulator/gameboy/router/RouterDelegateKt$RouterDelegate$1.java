package com.cooldev.gba.emulator.gameboy.router;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class RouterDelegateKt$RouterDelegate$1 extends r implements l {
    public static final RouterDelegateKt$RouterDelegate$1 INSTANCE = new RouterDelegateKt$RouterDelegate$1();

    public RouterDelegateKt$RouterDelegate$1() {
        super(1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavGraphBuilder) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull NavGraphBuilder navGraphBuilder) {
        a.s(navGraphBuilder, "$this$NavHost");
        ComposableSingletons$RouterDelegateKt composableSingletons$RouterDelegateKt = ComposableSingletons$RouterDelegateKt.INSTANCE;
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.LOADING_ADS, null, composableSingletons$RouterDelegateKt.m377getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.INTRO, null, composableSingletons$RouterDelegateKt.m378getLambda2$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.ONBOARDING, null, composableSingletons$RouterDelegateKt.m379getLambda3$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.PAYWALL_DEFAULT, null, composableSingletons$RouterDelegateKt.m380getLambda4$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.PAYWALL_YEARLY_NON_TRIAL, null, composableSingletons$RouterDelegateKt.m381getLambda5$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.PAYWALL_WEEKLY_NON_TRIAL, null, composableSingletons$RouterDelegateKt.m382getLambda6$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.PAYWALL_LIFETIME, null, composableSingletons$RouterDelegateKt.m383getLambda7$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.DASHBOARD, null, composableSingletons$RouterDelegateKt.m384getLambda8$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.GAME, null, composableSingletons$RouterDelegateKt.m385getLambda9$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
    }
}
