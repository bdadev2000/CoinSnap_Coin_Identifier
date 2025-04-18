package com.cooldev.gba.emulator.gameboy.features.view_all.page;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import q0.a;

/* loaded from: classes.dex */
public final class ViewAllPageKt$ViewAllPage$viewAllViewModel$1$1 extends r implements a {
    final /* synthetic */ String $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllPageKt$ViewAllPage$viewAllViewModel$1$1(String str) {
        super(0);
        this.$id = str;
    }

    @Override // q0.a
    @NotNull
    public final ParametersHolder invoke() {
        return ParametersHolderKt.parametersOf(this.$id);
    }
}
