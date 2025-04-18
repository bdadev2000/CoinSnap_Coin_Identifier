package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class PopupFileAndDownloadKt$DownloadGuideSign$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ a $onClose;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFileAndDownloadKt$DownloadGuideSign$2(Modifier modifier, a aVar, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$onClose = aVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        PopupFileAndDownloadKt.DownloadGuideSign(this.$modifier, this.$onClose, composer, RecomposeScopeImplKt.a(this.$$changed | 1), this.$$default);
    }
}
