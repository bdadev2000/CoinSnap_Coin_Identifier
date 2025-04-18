package com.cooldev.gba.emulator.gameboy.features;

import android.content.Context;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.db.GameDBManager;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppState;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationStates;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$SetupMultiNavigation$1", f = "GBAEmulatorApp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$SetupMultiNavigation$1 extends i implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ MultiNavigationAppState $dashboardNavigationState;
    final /* synthetic */ l $onInitializedChange;
    final /* synthetic */ MultiNavigationAppState $rootNavigationState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$SetupMultiNavigation$1(MultiNavigationAppState multiNavigationAppState, MultiNavigationAppState multiNavigationAppState2, Context context, l lVar, g gVar) {
        super(2, gVar);
        this.$rootNavigationState = multiNavigationAppState;
        this.$dashboardNavigationState = multiNavigationAppState2;
        this.$context = context;
        this.$onInitializedChange = lVar;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GBAEmulatorAppKt$SetupMultiNavigation$1(this.$rootNavigationState, this.$dashboardNavigationState, this.$context, this.$onInitializedChange, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GBAEmulatorAppKt$SetupMultiNavigation$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        MultiNavigationAppStateKt.setLocalNavigationState(new MultiNavigationStates(this.$rootNavigationState, this.$dashboardNavigationState));
        GBAEmulatorAppKt.setGameDBManager(new GameDBManager(this.$context));
        this.$onInitializedChange.invoke(Boolean.TRUE);
        return b0.f30125a;
    }
}
