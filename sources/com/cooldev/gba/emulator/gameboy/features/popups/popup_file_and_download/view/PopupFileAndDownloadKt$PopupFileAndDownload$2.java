package com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.logic.AddGameViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view.PopupFileAndDownloadKt$PopupFileAndDownload$2", f = "PopupFileAndDownload.kt", l = {Opcodes.DUP2_X2}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PopupFileAndDownloadKt$PopupFileAndDownload$2 extends i implements p {
    final /* synthetic */ AddGameViewModel $addGameViewModel;
    final /* synthetic */ UserGuideViewModel $userGuideViewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.popups.popup_file_and_download.view.PopupFileAndDownloadKt$PopupFileAndDownload$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ AddGameViewModel $addGameViewModel;
        final /* synthetic */ UserGuideViewModel $userGuideViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UserGuideViewModel userGuideViewModel, AddGameViewModel addGameViewModel) {
            super(1);
            this.$userGuideViewModel = userGuideViewModel;
            this.$addGameViewModel = addGameViewModel;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m338invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m338invokek4lQ0M(long j2) {
            if (this.$userGuideViewModel.getDataRemote()) {
                return;
            }
            this.$addGameViewModel.hidePopupSelect();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupFileAndDownloadKt$PopupFileAndDownload$2(UserGuideViewModel userGuideViewModel, AddGameViewModel addGameViewModel, g gVar) {
        super(2, gVar);
        this.$userGuideViewModel = userGuideViewModel;
        this.$addGameViewModel = addGameViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        PopupFileAndDownloadKt$PopupFileAndDownload$2 popupFileAndDownloadKt$PopupFileAndDownload$2 = new PopupFileAndDownloadKt$PopupFileAndDownload$2(this.$userGuideViewModel, this.$addGameViewModel, gVar);
        popupFileAndDownloadKt$PopupFileAndDownload$2.L$0 = obj;
        return popupFileAndDownloadKt$PopupFileAndDownload$2;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((PopupFileAndDownloadKt$PopupFileAndDownload$2) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$userGuideViewModel, this.$addGameViewModel);
            this.label = 1;
            if (TapGestureDetectorKt.f(pointerInputScope, null, anonymousClass1, this, 7) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
