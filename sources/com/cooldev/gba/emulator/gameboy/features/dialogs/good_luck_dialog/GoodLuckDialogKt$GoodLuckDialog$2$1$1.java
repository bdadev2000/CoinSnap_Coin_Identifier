package com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import q0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog.GoodLuckDialogKt$GoodLuckDialog$2$1$1", f = "GoodLuckDialog.kt", l = {TypeReference.RESOURCE_VARIABLE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GoodLuckDialogKt$GoodLuckDialog$2$1$1 extends i implements p {
    final /* synthetic */ a $onDismissRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.dialogs.good_luck_dialog.GoodLuckDialogKt$GoodLuckDialog$2$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ a $onDismissRequest;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar) {
            super(1);
            this.$onDismissRequest = aVar;
        }

        @Override // q0.l
        public /* synthetic */ Object invoke(Object obj) {
            m164invokek4lQ0M(((Offset) obj).f14913a);
            return b0.f30125a;
        }

        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
        public final void m164invokek4lQ0M(long j2) {
            this.$onDismissRequest.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoodLuckDialogKt$GoodLuckDialog$2$1$1(a aVar, g gVar) {
        super(2, gVar);
        this.$onDismissRequest = aVar;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        GoodLuckDialogKt$GoodLuckDialog$2$1$1 goodLuckDialogKt$GoodLuckDialog$2$1$1 = new GoodLuckDialogKt$GoodLuckDialog$2$1$1(this.$onDismissRequest, gVar);
        goodLuckDialogKt$GoodLuckDialog$2$1$1.L$0 = obj;
        return goodLuckDialogKt$GoodLuckDialog$2$1$1;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable g gVar) {
        return ((GoodLuckDialogKt$GoodLuckDialog$2$1$1) create(pointerInputScope, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onDismissRequest);
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
