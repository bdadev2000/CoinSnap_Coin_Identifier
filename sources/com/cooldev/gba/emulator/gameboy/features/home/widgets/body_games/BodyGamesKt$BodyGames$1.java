package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$1", f = "BodyGames.kt", l = {TypeReference.CONSTRUCTOR_REFERENCE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class BodyGamesKt$BodyGames$1 extends i implements p {
    final /* synthetic */ HomeViewModel $homeViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.BodyGamesKt$BodyGames$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ HomeViewModel $homeViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HomeViewModel homeViewModel) {
            super(1);
            this.$homeViewModel = homeViewModel;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m232invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m232invokek4lQ0M(long j2) {
            this.$homeViewModel.hidePopupMenuGame();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyGamesKt$BodyGames$1(HomeViewModel homeViewModel, g gVar) {
        super(2, gVar);
        this.$homeViewModel = homeViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        BodyGamesKt$BodyGames$1 bodyGamesKt$BodyGames$1 = new BodyGamesKt$BodyGames$1(this.$homeViewModel, gVar);
        bodyGamesKt$BodyGames$1.L$0 = obj;
        return bodyGamesKt$BodyGames$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((BodyGamesKt$BodyGames$1) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$homeViewModel);
            this.label = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, null, anonymousClass1, this, 7) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
