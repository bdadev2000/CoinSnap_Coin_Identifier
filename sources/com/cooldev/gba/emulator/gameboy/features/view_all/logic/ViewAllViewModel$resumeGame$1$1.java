package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ViewAllViewModel$resumeGame$1$1 extends r implements l {
    public static final ViewAllViewModel$resumeGame$1$1 INSTANCE = new ViewAllViewModel$resumeGame$1$1();

    public ViewAllViewModel$resumeGame$1$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
        a.s(viewAllState, "it");
        return ViewAllState.m365copy1hIXUjU$default(viewAllState, null, null, 0L, false, 0, false, 61, null);
    }
}
