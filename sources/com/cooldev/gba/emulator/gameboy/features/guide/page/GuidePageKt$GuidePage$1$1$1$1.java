package com.cooldev.gba.emulator.gameboy.features.guide.page;

import androidx.compose.runtime.MutableState;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GuideSection;
import com.cooldev.gba.emulator.gameboy.router.RouterName;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class GuidePageKt$GuidePage$1$1$1$1 extends r implements l {
    final /* synthetic */ MutableState<GuideSection> $guideSectionSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuidePageKt$GuidePage$1$1$1$1(MutableState<GuideSection> mutableState) {
        super(1);
        this.$guideSectionSelected = mutableState;
    }

    @Override // q0.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((GuideSection) obj);
        return b0.f30125a;
    }

    public final void invoke(@NotNull GuideSection guideSection) {
        a.s(guideSection, RouterName.GUIDE);
        this.$guideSectionSelected.setValue(guideSection);
    }
}
