package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$onClickNavigationBar$2 extends r implements l {
    final /* synthetic */ a $onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel$onClickNavigationBar$2(a aVar) {
        super(1);
        this.$onItemClick = aVar;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull String str) {
        p0.a.s(str, "it");
        this.$onItemClick.invoke();
    }
}
