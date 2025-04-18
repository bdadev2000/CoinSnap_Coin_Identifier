package com.cooldev.gba.emulator.gameboy.features.dashboard.logic;

import android.content.Context;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.FeatureFlagsConfig;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import e1.i1;
import e1.m0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel$fetchDataRemoteConfig$1", f = "UserGuideViewModel.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class UserGuideViewModel$fetchDataRemoteConfig$1 extends i implements p {
    Object L$0;
    boolean Z$0;
    int label;
    final /* synthetic */ UserGuideViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGuideViewModel$fetchDataRemoteConfig$1(UserGuideViewModel userGuideViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = userGuideViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new UserGuideViewModel$fetchDataRemoteConfig$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((UserGuideViewModel$fetchDataRemoteConfig$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Context context;
        UserGuideViewModel userGuideViewModel;
        RemoteConfigService remoteConfigService;
        boolean z2;
        boolean z3;
        boolean z4;
        m0 m0Var;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
            context = this.this$0.context;
            p0.a.r(context, "access$getContext$p(...)");
            boolean valueShouldShowUserGuide = appPrefUtils.getValueShouldShowUserGuide(context);
            userGuideViewModel = this.this$0;
            remoteConfigService = userGuideViewModel.remoteConfigService;
            FeatureFlagsConfig featureFlagsConfig = remoteConfigService.getFeatureFlagsConfig();
            this.L$0 = userGuideViewModel;
            this.Z$0 = valueShouldShowUserGuide;
            this.label = 1;
            Object addGameNewFlow = featureFlagsConfig.getAddGameNewFlow(this);
            if (addGameNewFlow == aVar) {
                return aVar;
            }
            z2 = valueShouldShowUserGuide;
            obj = addGameNewFlow;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Z$0;
            userGuideViewModel = (UserGuideViewModel) this.L$0;
            q.m(obj);
        }
        userGuideViewModel.isShowAddApp = ((Boolean) obj).booleanValue();
        UserGuideViewModel userGuideViewModel2 = this.this$0;
        z3 = userGuideViewModel2.isShowAddApp;
        userGuideViewModel2.firstOpenApp = z3 && z2;
        z4 = this.this$0.firstOpenApp;
        if (z4) {
            m0Var = this.this$0._guideState;
            ((i1) m0Var).h(new UserGuideViewModel.GuideState.TrialGame(true));
        }
        return b0.f30125a;
    }
}
