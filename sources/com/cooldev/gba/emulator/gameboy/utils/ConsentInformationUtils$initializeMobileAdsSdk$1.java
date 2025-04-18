package com.cooldev.gba.emulator.gameboy.utils;

import android.app.Activity;
import b1.d0;
import com.google.android.gms.ads.MobileAds;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.utils.ConsentInformationUtils$initializeMobileAdsSdk$1", f = "ConsentInformationUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ConsentInformationUtils$initializeMobileAdsSdk$1 extends i implements p {
    int label;
    final /* synthetic */ ConsentInformationUtils this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsentInformationUtils$initializeMobileAdsSdk$1(ConsentInformationUtils consentInformationUtils, g gVar) {
        super(2, gVar);
        this.this$0 = consentInformationUtils;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ConsentInformationUtils$initializeMobileAdsSdk$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ConsentInformationUtils$initializeMobileAdsSdk$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.ads.initialization.OnInitializationCompleteListener, java.lang.Object] */
    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Activity activity;
        i0.a aVar = i0.a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        activity = this.this$0.activity;
        MobileAds.initialize(activity, new Object());
        return b0.f30125a;
    }
}
