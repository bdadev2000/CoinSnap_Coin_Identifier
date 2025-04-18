package com.cooldev.gba.emulator.gameboy.features.dialogs.survey_dialog;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.res.PainterResources_androidKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.q;

/* loaded from: classes2.dex */
public final class SurveyDialogKt$ButtonCustom$2 extends r implements q {
    final /* synthetic */ int $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyDialogKt$ButtonCustom$2(int i2) {
        super(3);
        this.$image = i2;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((RowScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull RowScope rowScope, @Nullable Composer composer, int i2) {
        a.s(rowScope, "$this$Button");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
        } else {
            ImageKt.a(PainterResources_androidKt.a(this.$image, composer, 0), null, SizeKt.f4107c, null, null, 0.0f, null, composer, 440, 120);
        }
    }
}
