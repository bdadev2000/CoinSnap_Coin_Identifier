package com.cooldev.gba.emulator.gameboy.features.manage_sub.widgets;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import com.cooldev.gba.emulator.gameboy.features.dialogs.cancel_sub_dialog.logic.CancelSubDialogViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class BoxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1 extends r implements a {
    final /* synthetic */ CancelSubDialogViewModel $cancelSubDialogViewModel$inlined;
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoxSubscriptionKt$ButtonCancelSub$$inlined$debounced$1(long j2, MutableLongState mutableLongState, CancelSubDialogViewModel cancelSubDialogViewModel) {
        super(0);
        this.$debounceTime = j2;
        this.$lastTimeClicked$delegate = mutableLongState;
        this.$cancelSubDialogViewModel$inlined = cancelSubDialogViewModel;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m258invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m258invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            this.$cancelSubDialogViewModel$inlined.showDialog();
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
