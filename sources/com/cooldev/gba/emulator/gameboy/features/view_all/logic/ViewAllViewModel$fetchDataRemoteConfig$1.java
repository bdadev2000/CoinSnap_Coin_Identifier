package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.FeatureFlagsConfig;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel$fetchDataRemoteConfig$1", f = "ViewAllViewModel.kt", l = {TypeReference.NEW, TypeReference.CAST, TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewAllViewModel$fetchDataRemoteConfig$1 extends i implements p {
    int I$0;
    boolean Z$0;
    int label;
    final /* synthetic */ ViewAllViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel$fetchDataRemoteConfig$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ int $freePlay;
        final /* synthetic */ boolean $isShowAddGame;
        final /* synthetic */ int $numberLimitPlayGame;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2, int i3, boolean z2) {
            super(1);
            this.$numberLimitPlayGame = i2;
            this.$freePlay = i3;
            this.$isShowAddGame = z2;
        }

        @Override // q0.l
        @NotNull
        public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
            a.s(viewAllState, "it");
            return ViewAllState.m365copy1hIXUjU$default(viewAllState, null, null, 0L, false, this.$numberLimitPlayGame + this.$freePlay, this.$isShowAddGame, 15, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllViewModel$fetchDataRemoteConfig$1(ViewAllViewModel viewAllViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = viewAllViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ViewAllViewModel$fetchDataRemoteConfig$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ViewAllViewModel$fetchDataRemoteConfig$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RemoteConfigService remoteConfigService;
        boolean booleanValue;
        RemoteConfigService remoteConfigService2;
        int i2;
        RemoteConfigService remoteConfigService3;
        int intValue;
        i0.a aVar = i0.a.f30806a;
        int i3 = this.label;
        if (i3 == 0) {
            q.m(obj);
            remoteConfigService = this.this$0.remoteConfigService;
            FeatureFlagsConfig featureFlagsConfig = remoteConfigService.getFeatureFlagsConfig();
            this.label = 1;
            obj = featureFlagsConfig.getAddGameNewFlow(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = this.I$0;
                    booleanValue = this.Z$0;
                    q.m(obj);
                    intValue = ((Number) obj).intValue();
                    this.this$0.updateState(new AnonymousClass1(intValue, i2, booleanValue));
                    return b0.f30125a;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$0;
                booleanValue = this.Z$0;
                q.m(obj);
                intValue = ((Number) obj).intValue();
                this.this$0.updateState(new AnonymousClass1(intValue, i2, booleanValue));
                return b0.f30125a;
            }
            q.m(obj);
        }
        booleanValue = ((Boolean) obj).booleanValue();
        int i4 = booleanValue ? 2 : 0;
        if (booleanValue) {
            remoteConfigService3 = this.this$0.remoteConfigService;
            FeatureFlagsConfig featureFlagsConfig2 = remoteConfigService3.getFeatureFlagsConfig();
            this.Z$0 = booleanValue;
            this.I$0 = i4;
            this.label = 2;
            Object freePlayGame = featureFlagsConfig2.getFreePlayGame(this);
            if (freePlayGame == aVar) {
                return aVar;
            }
            i2 = i4;
            obj = freePlayGame;
            intValue = ((Number) obj).intValue();
            this.this$0.updateState(new AnonymousClass1(intValue, i2, booleanValue));
            return b0.f30125a;
        }
        remoteConfigService2 = this.this$0.remoteConfigService;
        FeatureFlagsConfig featureFlagsConfig3 = remoteConfigService2.getFeatureFlagsConfig();
        this.Z$0 = booleanValue;
        this.I$0 = i4;
        this.label = 3;
        Object limitPlayGame = featureFlagsConfig3.getLimitPlayGame(this);
        if (limitPlayGame == aVar) {
            return aVar;
        }
        i2 = i4;
        obj = limitPlayGame;
        intValue = ((Number) obj).intValue();
        this.this$0.updateState(new AnonymousClass1(intValue, i2, booleanValue));
        return b0.f30125a;
    }
}
