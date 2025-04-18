package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import d0.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.q;

/* loaded from: classes.dex */
public final class PopupMenuCardGameKt$PopupMenuCardGame$4 extends r implements q {
    final /* synthetic */ l $debouncedOnClick;
    final /* synthetic */ boolean $gameIsFavorite;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupMenuCardGameKt$PopupMenuCardGame$4(boolean z2, l lVar) {
        super(3);
        this.$gameIsFavorite = z2;
        this.$debouncedOnClick = lVar;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ColumnScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i2) {
        boolean shouldShowMenuItem;
        a.s(columnScope, "$this$DropdownMenu");
        if ((i2 & 81) == 16 && composer.i()) {
            composer.A();
            return;
        }
        k0.a entries = MenuCardGame.getEntries();
        boolean z2 = this.$gameIsFavorite;
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            shouldShowMenuItem = PopupMenuCardGameKt.shouldShowMenuItem((MenuCardGame) obj, z2);
            if (shouldShowMenuItem) {
                arrayList.add(obj);
            }
        }
        l lVar = this.$debouncedOnClick;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MenuCardGame menuCardGame = (MenuCardGame) it.next();
            MutableInteractionSource a2 = InteractionSourceKt.a();
            ComposableLambdaImpl c2 = ComposableLambdaKt.c(166052294, new PopupMenuCardGameKt$PopupMenuCardGame$4$2$1(menuCardGame), composer);
            composer.J(-965115318);
            boolean I = composer.I(lVar) | composer.I(menuCardGame);
            Object u2 = composer.u();
            if (I || u2 == Composer.Companion.f13690a) {
                u2 = new PopupMenuCardGameKt$PopupMenuCardGame$4$2$2$1(lVar, menuCardGame);
                composer.o(u2);
            }
            composer.D();
            AndroidMenu_androidKt.b(c2, (q0.a) u2, null, null, null, false, null, null, a2, composer, 6, 252);
        }
    }
}
