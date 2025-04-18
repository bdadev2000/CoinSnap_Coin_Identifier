package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DashboardPageKt$DashboardPage$3$1$1 extends r implements l {
    public static final DashboardPageKt$DashboardPage$3$1$1 INSTANCE = new DashboardPageKt$DashboardPage$3$1$1();

    public DashboardPageKt$DashboardPage$3$1$1() {
        super(1);
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavGraphBuilder) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull NavGraphBuilder navGraphBuilder) {
        a.s(navGraphBuilder, "$this$NavHost");
        DashboardPageKt.homeWrapperGraph(navGraphBuilder);
        ComposableSingletons$DashboardPageKt composableSingletons$DashboardPageKt = ComposableSingletons$DashboardPageKt.INSTANCE;
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.THEME, null, composableSingletons$DashboardPageKt.m119getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.SETTING, null, composableSingletons$DashboardPageKt.m120getLambda2$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.MANAGE_SUB, null, composableSingletons$DashboardPageKt.m121getLambda3$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
        NavGraphBuilderKt.a(navGraphBuilder, RouterName.GUIDE, null, composableSingletons$DashboardPageKt.m122getLambda4$gba_v1_0_35_54__09Apr2025_1046_release(), 254);
    }
}
