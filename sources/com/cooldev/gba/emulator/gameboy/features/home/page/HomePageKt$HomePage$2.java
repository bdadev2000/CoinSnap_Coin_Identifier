package com.cooldev.gba.emulator.gameboy.features.home.page;

import d0.b0;
import e1.h;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.page.HomePageKt$HomePage$2", f = "HomePage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HomePageKt$HomePage$2 extends i implements p {
    int label;

    public HomePageKt$HomePage$2(g gVar) {
        super(2, gVar);
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new HomePageKt$HomePage$2(gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull h hVar, @Nullable g gVar) {
        return ((HomePageKt$HomePage$2) create(hVar, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        return b0.f30125a;
    }
}
