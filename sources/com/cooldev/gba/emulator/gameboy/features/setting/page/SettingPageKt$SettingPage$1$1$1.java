package com.cooldev.gba.emulator.gameboy.features.setting.page;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.setting.enums.SettingEnum;
import com.cooldev.gba.emulator.gameboy.features.setting.logic.SettingViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SettingPageKt$SettingPage$1$1$1 extends r implements l {
    final /* synthetic */ Context $context;
    final /* synthetic */ SettingViewModel $settingViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingPageKt$SettingPage$1$1$1(SettingViewModel settingViewModel, Context context) {
        super(1);
        this.$settingViewModel = settingViewModel;
        this.$context = context;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull LazyListScope lazyListScope) {
        a.s(lazyListScope, "$this$LazyColumn");
        LazyListScope.f(lazyListScope, null, ComposableSingletons$SettingPageKt.INSTANCE.m353getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), 3);
        k0.a entries = SettingEnum.getEntries();
        SettingViewModel settingViewModel = this.$settingViewModel;
        Context context = this.$context;
        SettingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$1 settingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$1 = SettingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$1.INSTANCE;
        int size = entries.size();
        SettingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$3 settingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$3 = new SettingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$3(settingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$1, entries);
        SettingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$4 settingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$4 = new SettingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$4(entries, settingViewModel, context);
        Object obj = ComposableLambdaKt.f14482a;
        lazyListScope.d(size, null, settingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$3, new ComposableLambdaImpl(-632812321, settingPageKt$SettingPage$1$1$1$invoke$$inlined$items$default$4, true));
    }
}
