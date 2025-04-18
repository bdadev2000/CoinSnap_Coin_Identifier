package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import androidx.navigation.NavArgument;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavType;
import androidx.navigation.NavType$Companion$StringType$1;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DashboardPageKt$homeWrapperGraph$1$1 extends r implements l {
    public static final DashboardPageKt$homeWrapperGraph$1$1 INSTANCE = new DashboardPageKt$homeWrapperGraph$1$1();

    public DashboardPageKt$homeWrapperGraph$1$1() {
        super(1);
    }

    public final void invoke(@NotNull NavArgumentBuilder navArgumentBuilder) {
        a.s(navArgumentBuilder, "$this$navArgument");
        NavType$Companion$StringType$1 navType$Companion$StringType$1 = NavType.f20502n;
        NavArgument.Builder builder = navArgumentBuilder.f20326a;
        builder.getClass();
        builder.f20323a = navType$Companion$StringType$1;
        builder.f20325c = null;
        builder.d = true;
        builder.f20324b = true;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((NavArgumentBuilder) obj);
        return b0.f30125a;
    }
}
