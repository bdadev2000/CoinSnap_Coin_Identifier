package com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic;

import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class InterstitialAdViewModel$onClickNavigationBar$3 extends r implements a {
    final /* synthetic */ a $onItemClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdViewModel$onClickNavigationBar$3(a aVar) {
        super(0);
        this.$onItemClick = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m82invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m82invoke() {
        this.$onItemClick.invoke();
    }
}
