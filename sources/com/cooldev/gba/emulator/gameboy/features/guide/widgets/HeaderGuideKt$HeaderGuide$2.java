package com.cooldev.gba.emulator.gameboy.features.guide.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GuideSection;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class HeaderGuideKt$HeaderGuide$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ l $onSectionSelected;
    final /* synthetic */ GuideSection $selectedSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderGuideKt$HeaderGuide$2(GuideSection guideSection, l lVar, int i2) {
        super(2);
        this.$selectedSection = guideSection;
        this.$onSectionSelected = lVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        HeaderGuideKt.HeaderGuide(this.$selectedSection, this.$onSectionSelected, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
