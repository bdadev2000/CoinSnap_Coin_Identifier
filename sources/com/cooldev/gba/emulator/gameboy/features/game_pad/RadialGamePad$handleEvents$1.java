package com.cooldev.gba.emulator.gameboy.features.game_pad;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import com.cooldev.gba.emulator.gameboy.features.game_pad.haptics.HapticEngine;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$handleEvents$1", f = "RadialGamePad.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RadialGamePad$handleEvents$1 extends i implements p {
    final /* synthetic */ List<Event> $events;
    int label;
    final /* synthetic */ RadialGamePad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RadialGamePad$handleEvents$1(RadialGamePad radialGamePad, List<? extends Event> list, g gVar) {
        super(2, gVar);
        this.this$0 = radialGamePad;
        this.$events = list;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new RadialGamePad$handleEvents$1(this.this$0, this.$events, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((RadialGamePad$handleEvents$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        HapticEngine hapticEngine;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        hapticEngine = this.this$0.hapticEngine;
        hapticEngine.performHapticForEvents(this.$events);
        return b0.f30125a;
    }
}
