package com.cooldev.gba.emulator.gameboy.features.home.logic;

import android.net.Uri;
import b1.d0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel$fetchGamesInFolder$1", f = "HomeViewModel.kt", l = {331}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HomeViewModel$fetchGamesInFolder$1 extends i implements p {
    final /* synthetic */ b0 $result;
    final /* synthetic */ a $showInAppReview;
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$fetchGamesInFolder$1(HomeViewModel homeViewModel, Uri uri, b0 b0Var, a aVar, g gVar) {
        super(2, gVar);
        this.this$0 = homeViewModel;
        this.$uri = uri;
        this.$result = b0Var;
        this.$showInAppReview = aVar;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new HomeViewModel$fetchGamesInFolder$1(this.this$0, this.$uri, this.$result, this.$showInAppReview, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((HomeViewModel$fetchGamesInFolder$1) create(d0Var, gVar)).invokeSuspend(d0.b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0104 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x012e  */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel$fetchGamesInFolder$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
