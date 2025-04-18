package com.cooldev.gba.emulator.gameboy.features.home.page;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.page.HomePageKt$HomePage$7", f = "HomePage.kt", l = {124}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HomePageKt$HomePage$7 extends i implements p {
    final /* synthetic */ FocusManager $focusManager;
    final /* synthetic */ SoftwareKeyboardController $keyboardController;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.home.page.HomePageKt$HomePage$7$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ PointerInputScope $$this$pointerInput;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ SoftwareKeyboardController $keyboardController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController) {
            super(1);
            this.$$this$pointerInput = pointerInputScope;
            this.$focusManager = focusManager;
            this.$keyboardController = softwareKeyboardController;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m222invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m222invokek4lQ0M(long j2) {
            FocusManager focusManager = this.$focusManager;
            SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
            try {
                focusManager.q(false);
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                }
            } catch (Throwable th) {
                q.d(th);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomePageKt$HomePage$7(FocusManager focusManager, SoftwareKeyboardController softwareKeyboardController, g gVar) {
        super(2, gVar);
        this.$focusManager = focusManager;
        this.$keyboardController = softwareKeyboardController;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        HomePageKt$HomePage$7 homePageKt$HomePage$7 = new HomePageKt$HomePage$7(this.$focusManager, this.$keyboardController, gVar);
        homePageKt$HomePage$7.L$0 = obj;
        return homePageKt$HomePage$7;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((HomePageKt$HomePage$7) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.$focusManager, this.$keyboardController);
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
