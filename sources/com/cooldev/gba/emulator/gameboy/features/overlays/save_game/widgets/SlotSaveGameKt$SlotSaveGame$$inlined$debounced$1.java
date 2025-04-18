package com.cooldev.gba.emulator.gameboy.features.overlays.save_game.widgets;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
public final class SlotSaveGameKt$SlotSaveGame$$inlined$debounced$1 extends r implements a {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ a $onClick$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotSaveGameKt$SlotSaveGame$$inlined$debounced$1(long j2, MutableLongState mutableLongState, a aVar) {
        super(0);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
        this.$onClick$inlined = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m292invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m292invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            this.$onClick$inlined.invoke();
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
