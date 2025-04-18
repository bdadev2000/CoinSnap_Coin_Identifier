package com.cooldev.gba.emulator.gameboy.features.home.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.Opcodes;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class HomeViewModel$removeGame$1$1 extends r implements l {
    public static final HomeViewModel$removeGame$1$1 INSTANCE = new HomeViewModel$removeGame$1$1();

    public HomeViewModel$removeGame$1$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final HomeState invoke(@NotNull HomeState homeState) {
        HomeState m216copyQIbh8i0;
        a.s(homeState, "it");
        m216copyQIbh8i0 = homeState.m216copyQIbh8i0((r35 & 1) != 0 ? homeState.games : null, (r35 & 2) != 0 ? homeState.searchText : null, (r35 & 4) != 0 ? homeState.isViewListHorizontal : false, (r35 & 8) != 0 ? homeState.currentGameForPopupMenu : null, (r35 & 16) != 0 ? homeState.touchPoint : 0L, (r35 & 32) != 0 ? homeState.isDialogRemoveGameVisible : false, (r35 & 64) != 0 ? homeState.numberLimitAddGame : 0, (r35 & 128) != 0 ? homeState.numberLimitPlayGame : 0, (r35 & 256) != 0 ? homeState.numberRewardFree : 0, (r35 & 512) != 0 ? homeState.isShowOfferRewardRemoteConfig : false, (r35 & 1024) != 0 ? homeState.isNewFlow : false, (r35 & Opcodes.ACC_STRICT) != 0 ? homeState.isShowOfferReward1 : false, (r35 & 4096) != 0 ? homeState.isShowOfferReward2 : false, (r35 & 8192) != 0 ? homeState.isShowOfferReward3 : false, (r35 & 16384) != 0 ? homeState.isShowOfferFreeTrial : false, (r35 & 32768) != 0 ? homeState.isShowToast : false);
        return m216copyQIbh8i0;
    }
}
