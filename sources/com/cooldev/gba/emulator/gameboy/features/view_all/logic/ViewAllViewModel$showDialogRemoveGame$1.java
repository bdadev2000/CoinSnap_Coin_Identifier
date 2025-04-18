package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ViewAllViewModel$showDialogRemoveGame$1 extends r implements l {
    public static final ViewAllViewModel$showDialogRemoveGame$1 INSTANCE = new ViewAllViewModel$showDialogRemoveGame$1();

    public ViewAllViewModel$showDialogRemoveGame$1() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
        a.s(viewAllState, "it");
        return ViewAllState.m365copy1hIXUjU$default(viewAllState, null, null, 0L, true, 0, false, 55, null);
    }
}
