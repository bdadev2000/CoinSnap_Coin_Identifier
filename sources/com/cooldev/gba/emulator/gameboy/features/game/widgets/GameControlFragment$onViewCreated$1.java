package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameState;
import com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import d0.b0;
import e0.o;
import e1.c;
import e1.h;
import h0.g;
import h0.m;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.widgets.GameControlFragment$onViewCreated$1", f = "GameControlFragment.kt", l = {Opcodes.LREM}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GameControlFragment$onViewCreated$1 extends i implements p {
    final /* synthetic */ GameState $gameState;
    int label;
    final /* synthetic */ GameControlFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameControlFragment$onViewCreated$1(GameControlFragment gameControlFragment, GameState gameState, g gVar) {
        super(2, gVar);
        this.this$0 = gameControlFragment;
        this.$gameState = gameState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameControlFragment$onViewCreated$1(this.this$0, this.$gameState, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameControlFragment$onViewCreated$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RadialGamePad radialGamePad;
        RadialGamePad radialGamePad2;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            h[] hVarArr = new h[2];
            radialGamePad = this.this$0.leftPad;
            if (radialGamePad == null) {
                p0.a.B0("leftPad");
                throw null;
            }
            hVarArr[0] = radialGamePad.events();
            radialGamePad2 = this.this$0.rightPad;
            if (radialGamePad2 == null) {
                p0.a.B0("rightPad");
                throw null;
            }
            hVarArr[1] = radialGamePad2.events();
            int i3 = e1.b0.f30235a;
            f1.p pVar = new f1.p(new o(hVarArr, 0), m.f30726a, -2, 1);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            p0.a.r(lifecycle, "<get-lifecycle>(...)");
            c a2 = FlowExtKt.a(pVar, lifecycle);
            final GameControlFragment gameControlFragment = this.this$0;
            final GameState gameState = this.$gameState;
            e1.i iVar = new e1.i() { // from class: com.cooldev.gba.emulator.gameboy.features.game.widgets.GameControlFragment$onViewCreated$1.1
                @Override // e1.i
                @Nullable
                public final Object emit(@NotNull Event event, @NotNull g gVar) {
                    if (event instanceof Event.Button) {
                        Event.Button button = (Event.Button) event;
                        if (button.getId() == 110 && button.getAction() == 0) {
                            GameControlFragment.this.getGameViewModel().setThumbnail(gameState.getRetroView());
                            GameControlFragment.this.getMenuGameViewModel().showMenu();
                        } else {
                            GameControlFragment.this.getGameViewModel().handleGamePadButton(button);
                        }
                    } else if (event instanceof Event.Direction) {
                        GameControlFragment.this.getGameViewModel().handleGamePadDirection((Event.Direction) event);
                    }
                    return b0.f30125a;
                }
            };
            this.label = 1;
            if (a2.collect(iVar, this) == aVar) {
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
