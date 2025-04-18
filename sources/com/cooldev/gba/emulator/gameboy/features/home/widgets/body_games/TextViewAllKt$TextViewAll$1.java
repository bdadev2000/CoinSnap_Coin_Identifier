package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes2.dex */
public final class TextViewAllKt$TextViewAll$1 extends r implements a {
    final /* synthetic */ a $onClick;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewAllKt$TextViewAll$1(UserGuideViewModel userGuideViewModel, a aVar) {
        super(0);
        this.$userGuideViewModel = userGuideViewModel;
        this.$onClick = aVar;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m242invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m242invoke() {
        if (this.$userGuideViewModel.getDataRemote()) {
            return;
        }
        this.$onClick.invoke();
    }
}
