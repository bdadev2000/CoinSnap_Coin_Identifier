package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.page;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.AdView;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
public final class BannerAdGameViewKt$BannerAdGameView$2 extends r implements l {
    final /* synthetic */ AdView $adView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdGameViewKt$BannerAdGameView$2(AdView adView) {
        super(1);
        this.$adView = adView;
    }

    @Override // q0.l
    @NotNull
    public final AdView invoke(@NotNull Context context) {
        a.s(context, "it");
        ViewParent parent = this.$adView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.$adView);
        }
        return this.$adView;
    }
}
