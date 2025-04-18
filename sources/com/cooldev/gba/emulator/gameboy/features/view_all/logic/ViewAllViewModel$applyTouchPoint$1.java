package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ViewAllViewModel$applyTouchPoint$1 extends r implements l {
    final /* synthetic */ long $offset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllViewModel$applyTouchPoint$1(long j2) {
        super(1);
        this.$offset = j2;
    }

    @Override // q0.l
    @NotNull
    public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
        a.s(viewAllState, "it");
        return ViewAllState.m365copy1hIXUjU$default(viewAllState, null, null, this.$offset, false, 0, false, 59, null);
    }
}
