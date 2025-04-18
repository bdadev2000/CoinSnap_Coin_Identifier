package com.cooldev.gba.emulator.gameboy.features.game_pad;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game_pad.event.Event;
import d0.b0;
import e1.l0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game_pad.RadialGamePad$handleEvents$2", f = "RadialGamePad.kt", l = {346}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RadialGamePad$handleEvents$2 extends i implements p {
    final /* synthetic */ List<Event> $events;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ RadialGamePad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RadialGamePad$handleEvents$2(List<? extends Event> list, RadialGamePad radialGamePad, g gVar) {
        super(2, gVar);
        this.$events = list;
        this.this$0 = radialGamePad;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new RadialGamePad$handleEvents$2(this.$events, this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((RadialGamePad$handleEvents$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        RadialGamePad radialGamePad;
        Iterator it;
        l0 l0Var;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            List<Event> list = this.$events;
            radialGamePad = this.this$0;
            it = list.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            radialGamePad = (RadialGamePad) this.L$0;
            q.m(obj);
        }
        while (it.hasNext()) {
            Event event = (Event) it.next();
            l0Var = radialGamePad.eventsSubject;
            this.L$0 = radialGamePad;
            this.L$1 = it;
            this.label = 1;
            if (l0Var.emit(event, this) == aVar) {
                return aVar;
            }
        }
        return b0.f30125a;
    }
}
