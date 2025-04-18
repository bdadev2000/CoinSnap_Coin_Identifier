package com.cooldev.gba.emulator.gameboy.features.guide.widgets;

import com.cooldev.gba.emulator.gameboy.features.guide.enums.GuideSection;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;
import q0.l;

/* loaded from: classes2.dex */
public final class HeaderGuideKt$HeaderGuide$1$1$1$1 extends r implements a {
    final /* synthetic */ l $onSectionSelected;
    final /* synthetic */ GuideSection $section;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderGuideKt$HeaderGuide$1$1$1$1(l lVar, GuideSection guideSection) {
        super(0);
        this.$onSectionSelected = lVar;
        this.$section = guideSection;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m206invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m206invoke() {
        this.$onSectionSelected.invoke(this.$section);
    }
}
