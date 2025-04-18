package com.cooldev.gba.emulator.gameboy.features.home.logic;

import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel$fetchDataRemoteConfig$1", f = "HomeViewModel.kt", l = {TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT, TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT, 77, 78, Opcodes.LASTORE, Opcodes.DASTORE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HomeViewModel$fetchDataRemoteConfig$1 extends i implements p {
    int I$0;
    int I$1;
    int I$2;
    boolean Z$0;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel$fetchDataRemoteConfig$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ int $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i2) {
            super(1);
            this.$value = i2;
        }

        @Override // q0.l
        @NotNull
        public final HomeState invoke(@NotNull HomeState homeState) {
            HomeState m216copyQIbh8i0;
            a.s(homeState, "it");
            m216copyQIbh8i0 = homeState.m216copyQIbh8i0((r35 & 1) != 0 ? homeState.games : null, (r35 & 2) != 0 ? homeState.searchText : null, (r35 & 4) != 0 ? homeState.isViewListHorizontal : false, (r35 & 8) != 0 ? homeState.currentGameForPopupMenu : null, (r35 & 16) != 0 ? homeState.touchPoint : 0L, (r35 & 32) != 0 ? homeState.isDialogRemoveGameVisible : false, (r35 & 64) != 0 ? homeState.numberLimitAddGame : this.$value, (r35 & 128) != 0 ? homeState.numberLimitPlayGame : 0, (r35 & 256) != 0 ? homeState.numberRewardFree : 0, (r35 & 512) != 0 ? homeState.isShowOfferRewardRemoteConfig : false, (r35 & 1024) != 0 ? homeState.isNewFlow : false, (r35 & Opcodes.ACC_STRICT) != 0 ? homeState.isShowOfferReward1 : false, (r35 & 4096) != 0 ? homeState.isShowOfferReward2 : false, (r35 & 8192) != 0 ? homeState.isShowOfferReward3 : false, (r35 & 16384) != 0 ? homeState.isShowOfferFreeTrial : false, (r35 & 32768) != 0 ? homeState.isShowToast : false);
            return m216copyQIbh8i0;
        }
    }

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel$fetchDataRemoteConfig$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends r implements l {
        final /* synthetic */ int $freePlay;
        final /* synthetic */ boolean $isShowAddGame;
        final /* synthetic */ boolean $isShowOfferRewardRemoteConfig;
        final /* synthetic */ int $numberLimitPlayGame;
        final /* synthetic */ int $numberRewardFree;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(int i2, int i3, boolean z2, int i4, boolean z3) {
            super(1);
            this.$numberLimitPlayGame = i2;
            this.$freePlay = i3;
            this.$isShowAddGame = z2;
            this.$numberRewardFree = i4;
            this.$isShowOfferRewardRemoteConfig = z3;
        }

        @Override // q0.l
        @NotNull
        public final HomeState invoke(@NotNull HomeState homeState) {
            HomeState m216copyQIbh8i0;
            a.s(homeState, "it");
            int i2 = this.$numberLimitPlayGame + this.$freePlay;
            boolean z2 = this.$isShowAddGame;
            m216copyQIbh8i0 = homeState.m216copyQIbh8i0((r35 & 1) != 0 ? homeState.games : null, (r35 & 2) != 0 ? homeState.searchText : null, (r35 & 4) != 0 ? homeState.isViewListHorizontal : false, (r35 & 8) != 0 ? homeState.currentGameForPopupMenu : null, (r35 & 16) != 0 ? homeState.touchPoint : 0L, (r35 & 32) != 0 ? homeState.isDialogRemoveGameVisible : false, (r35 & 64) != 0 ? homeState.numberLimitAddGame : 0, (r35 & 128) != 0 ? homeState.numberLimitPlayGame : i2, (r35 & 256) != 0 ? homeState.numberRewardFree : this.$numberRewardFree, (r35 & 512) != 0 ? homeState.isShowOfferRewardRemoteConfig : this.$isShowOfferRewardRemoteConfig, (r35 & 1024) != 0 ? homeState.isNewFlow : z2, (r35 & Opcodes.ACC_STRICT) != 0 ? homeState.isShowOfferReward1 : !z2, (r35 & 4096) != 0 ? homeState.isShowOfferReward2 : false, (r35 & 8192) != 0 ? homeState.isShowOfferReward3 : false, (r35 & 16384) != 0 ? homeState.isShowOfferFreeTrial : false, (r35 & 32768) != 0 ? homeState.isShowToast : false);
            return m216copyQIbh8i0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$fetchDataRemoteConfig$1(HomeViewModel homeViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = homeViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new HomeViewModel$fetchDataRemoteConfig$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((HomeViewModel$fetchDataRemoteConfig$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c A[RETURN] */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel$fetchDataRemoteConfig$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
