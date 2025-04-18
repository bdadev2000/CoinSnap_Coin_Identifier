package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import android.content.Context;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.dialogs.loading_dialog.logic.LoadingDialogViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.local.storage.GamePrefUtils;
import d0.b0;
import e1.i1;
import e1.m0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel$removeFromFavorite$1", f = "ViewAllViewModel.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ViewAllViewModel$removeFromFavorite$1 extends i implements p {
    boolean Z$0;
    int label;
    final /* synthetic */ ViewAllViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.view_all.logic.ViewAllViewModel$removeFromFavorite$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // q0.l
        @NotNull
        public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
            a.s(viewAllState, "it");
            return ViewAllState.m365copy1hIXUjU$default(viewAllState, null, null, 0L, false, 0, false, 61, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllViewModel$removeFromFavorite$1(ViewAllViewModel viewAllViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = viewAllViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ViewAllViewModel$removeFromFavorite$1(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ViewAllViewModel$removeFromFavorite$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LoadingDialogViewModel loadingDialogViewModel;
        m0 m0Var;
        String str;
        Context context;
        boolean z2;
        Context context2;
        LoadingDialogViewModel loadingDialogViewModel2;
        Context context3;
        i0.a aVar = i0.a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            loadingDialogViewModel = this.this$0.loadingDialogViewModel;
            loadingDialogViewModel.showDialog();
            m0Var = this.this$0._state;
            Game currentGameForPopupMenu = ((ViewAllState) ((i1) m0Var).getValue()).getCurrentGameForPopupMenu();
            if (currentGameForPopupMenu == null || (str = currentGameForPopupMenu.getId()) == null) {
                str = "";
            }
            GamePrefUtils gamePrefUtils = GamePrefUtils.INSTANCE;
            context = this.this$0.context;
            a.r(context, "access$getContext$p(...)");
            boolean updateGameFavoriteStatus = gamePrefUtils.updateGameFavoriteStatus(context, str, false);
            this.Z$0 = updateGameFavoriteStatus;
            this.label = 1;
            if (a.L(1000L, this) == aVar) {
                return aVar;
            }
            z2 = updateGameFavoriteStatus;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Z$0;
            q.m(obj);
        }
        if (z2) {
            this.this$0.fetchGamesInAppLocal();
            context3 = this.this$0.context;
            b0.a.c(context3, "Game removed from favorites successfully!").show();
        } else {
            context2 = this.this$0.context;
            b0.a.b(context2, "Failed to remove game from favorites. Please try again.").show();
        }
        this.this$0.updateState(AnonymousClass1.INSTANCE);
        loadingDialogViewModel2 = this.this$0.loadingDialogViewModel;
        loadingDialogViewModel2.hideDialog();
        return b0.f30125a;
    }
}
