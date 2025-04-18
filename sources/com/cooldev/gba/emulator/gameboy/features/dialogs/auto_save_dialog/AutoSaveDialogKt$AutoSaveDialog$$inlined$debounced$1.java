package com.cooldev.gba.emulator.gameboy.features.dialogs.auto_save_dialog;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class AutoSaveDialogKt$AutoSaveDialog$$inlined$debounced$1 extends r implements a {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ a $onDismiss$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoSaveDialogKt$AutoSaveDialog$$inlined$debounced$1(long j2, MutableLongState mutableLongState, a aVar) {
        super(0);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
        this.$onDismiss$inlined = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m143invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m143invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            this.$onDismiss$inlined.invoke();
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
