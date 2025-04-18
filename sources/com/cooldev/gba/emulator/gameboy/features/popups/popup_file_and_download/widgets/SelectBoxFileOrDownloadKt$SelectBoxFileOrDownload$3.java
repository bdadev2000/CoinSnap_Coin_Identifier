package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes.dex */
public final class SelectBoxFileOrDownloadKt$SelectBoxFileOrDownload$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $bgColor;
    final /* synthetic */ long $borderColor;
    final /* synthetic */ int $image;
    final /* synthetic */ boolean $isUserGuide;
    final /* synthetic */ a $onClick;
    final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBoxFileOrDownloadKt$SelectBoxFileOrDownload$3(boolean z2, int i2, String str, long j2, long j3, a aVar, int i3, int i4) {
        super(2);
        this.$isUserGuide = z2;
        this.$image = i2;
        this.$title = str;
        this.$bgColor = j2;
        this.$borderColor = j3;
        this.$onClick = aVar;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SelectBoxFileOrDownloadKt.m342SelectBoxFileOrDownloadjB83MbM(this.$isUserGuide, this.$image, this.$title, this.$bgColor, this.$borderColor, this.$onClick, composer, RecomposeScopeImplKt.a(this.$$changed | 1), this.$$default);
    }
}
