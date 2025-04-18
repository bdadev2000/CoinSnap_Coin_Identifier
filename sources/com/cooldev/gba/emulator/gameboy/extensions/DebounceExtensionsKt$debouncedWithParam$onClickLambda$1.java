package com.cooldev.gba.emulator.gameboy.extensions;

import android.os.SystemClock;
import androidx.compose.runtime.MutableLongState;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class DebounceExtensionsKt$debouncedWithParam$onClickLambda$1 extends r implements l {
    final /* synthetic */ long $debounceTime;
    final /* synthetic */ MutableLongState $lastTimeClicked$delegate;
    final /* synthetic */ l $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebounceExtensionsKt$debouncedWithParam$onClickLambda$1(long j2, l lVar, MutableLongState mutableLongState) {
        super(1);
        this.$debounceTime = j2;
        this.$onClick = lVar;
        this.$lastTimeClicked$delegate = mutableLongState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m53invoke((DebounceExtensionsKt$debouncedWithParam$onClickLambda$1) obj);
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m53invoke(T t2) {
        long d;
        long uptimeMillis = SystemClock.uptimeMillis();
        d = this.$lastTimeClicked$delegate.d();
        if (uptimeMillis - d > this.$debounceTime) {
            this.$onClick.invoke(t2);
        }
        this.$lastTimeClicked$delegate.o(uptimeMillis);
    }
}
