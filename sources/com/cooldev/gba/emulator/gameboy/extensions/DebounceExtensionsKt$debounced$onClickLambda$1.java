package com.cooldev.gba.emulator.gameboy.extensions;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class DebounceExtensionsKt$debounced$onClickLambda$1 extends r implements a {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ a $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebounceExtensionsKt$debounced$onClickLambda$1(long j2, a aVar, MutableLongState mutableLongState) {
        super(0);
        this.$debounceTime = j2;
        this.$onClick = aVar;
        this.$lastTimeClicked$delegate = mutableLongState;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m51invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m51invoke() {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            this.$onClick.invoke();
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
