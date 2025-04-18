package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ViewAllViewModel$showPopupMenuGame$1 extends r implements l {
    final /* synthetic */ Game $game;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllViewModel$showPopupMenuGame$1(Game game) {
        super(1);
        this.$game = game;
    }

    @Override // q0.l
    @NotNull
    public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
        a.s(viewAllState, "it");
        return ViewAllState.m365copy1hIXUjU$default(viewAllState, null, this.$game, 0L, false, 0, false, 61, null);
    }
}
