package com.cooldev.gba.emulator.gameboy.features.game.logic;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$setThumbnail$1", f = "GameViewModel.kt", l = {721}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$setThumbnail$1 extends i implements p {
    final /* synthetic */ SurfaceView $surfaceView;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$setThumbnail$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ Bitmap $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bitmap bitmap) {
            super(1);
            this.$value = bitmap;
        }

        @Override // q0.l
        @NotNull
        public final GameState invoke(@NotNull GameState gameState) {
            GameState copy;
            a.s(gameState, "it");
            copy = gameState.copy((r22 & 1) != 0 ? gameState.game : null, (r22 & 2) != 0 ? gameState.gameData : null, (r22 & 4) != 0 ? gameState.retroView : null, (r22 & 8) != 0 ? gameState.fastForwardEnabled : false, (r22 & 16) != 0 ? gameState.autoSaveEnable : false, (r22 & 32) != 0 ? gameState.isFirstTimeInPremium : false, (r22 & 64) != 0 ? gameState.audioEnabled : false, (r22 & 128) != 0 ? gameState.saveSlot : null, (r22 & 256) != 0 ? gameState.loadSlot : null, (r22 & 512) != 0 ? gameState.thumbnail : this.$value);
            return copy;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$setThumbnail$1(GameViewModel gameViewModel, SurfaceView surfaceView, g gVar) {
        super(2, gVar);
        this.this$0 = gameViewModel;
        this.$surfaceView = surfaceView;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$setThumbnail$1(this.this$0, this.$surfaceView, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$setThumbnail$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            GameViewModel gameViewModel = this.this$0;
            SurfaceView surfaceView = this.$surfaceView;
            this.label = 1;
            obj = gameViewModel.takeScreenshot(surfaceView, 1080, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.this$0.updateState(new AnonymousClass1((Bitmap) obj));
        return b0.f30125a;
    }
}
