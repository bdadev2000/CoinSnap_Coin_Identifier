package com.cooldev.gba.emulator.gameboy.features.dialogs.survey_dialog;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class SurveyDialogKt$ButtonCustom$3 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $image;
    final /* synthetic */ a $onClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyDialogKt$ButtonCustom$3(int i2, a aVar, int i3) {
        super(2);
        this.$image = i2;
        this.$onClick = aVar;
        this.$$changed = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        SurveyDialogKt.ButtonCustom(this.$image, this.$onClick, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
