package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class SearchGamesKt$SearchGames$2 extends r implements l {
    final /* synthetic */ HomeViewModel $homeViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchGamesKt$SearchGames$2(HomeViewModel homeViewModel) {
        super(1);
        this.$homeViewModel = homeViewModel;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        a.s(str, "it");
        this.$homeViewModel.onChangedSearchText(str);
    }
}
