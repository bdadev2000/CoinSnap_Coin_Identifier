package com.cooldev.gba.emulator.gameboy;

import com.cooldev.gba.emulator.gameboy.di.KoinModuleKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import p0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class MyApplication$onCreate$1 extends r implements l {
    final /* synthetic */ MyApplication this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyApplication$onCreate$1(MyApplication myApplication) {
        super(1);
        this.this$0 = myApplication;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((KoinApplication) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull KoinApplication koinApplication) {
        a.s(koinApplication, "$this$startKoin");
        KoinExtKt.androidContext(koinApplication, this.this$0);
        koinApplication.modules(KoinModuleKt.getAppModule());
    }
}
