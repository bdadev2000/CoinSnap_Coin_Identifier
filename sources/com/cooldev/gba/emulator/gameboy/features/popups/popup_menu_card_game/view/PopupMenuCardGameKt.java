package com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.view;

import android.annotation.SuppressLint;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.features.popups.popup_menu_card_game.enums.MenuCardGame;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class PopupMenuCardGameKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuCardGame.values().length];
            try {
                iArr[MenuCardGame.AddToFavorites.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MenuCardGame.RemoveFromFavorites.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget
    @Composable
    @SuppressLint({"UnrememberedMutableInteractionSource"})
    /* renamed from: PopupMenuCardGame-Su4bsnU, reason: not valid java name */
    public static final void m344PopupMenuCardGameSu4bsnU(boolean z2, boolean z3, long j2, @NotNull a aVar, boolean z4, @NotNull l lVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onDismissRequest");
        p0.a.s(lVar, "onClick");
        ComposerImpl g2 = composer.g(-1235769605);
        if ((i2 & 14) == 0) {
            i3 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.a(z3) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= g2.d(j2) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= g2.w(aVar) ? 2048 : 1024;
        }
        if ((57344 & i2) == 0) {
            i3 |= g2.a(z4) ? 16384 : 8192;
        }
        if ((458752 & i2) == 0) {
            i3 |= g2.w(lVar) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        int i4 = i3;
        if ((374491 & i4) == 74898 && g2.i()) {
            g2.A();
        } else {
            if (!z3) {
                RecomposeScopeImpl Z = g2.Z();
                if (Z != null) {
                    Z.d = new PopupMenuCardGameKt$PopupMenuCardGame$1(z2, z3, j2, aVar, z4, lVar, i2);
                    return;
                }
                return;
            }
            Density density = (Density) g2.K(CompositionLocalsKt.f16434f);
            float I = density.I(Offset.g(j2));
            float I2 = density.I(Offset.h(j2));
            g2.J(1744130801);
            g2.J(-1474629357);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = SnapshotLongStateKt.a(0L);
                g2.o(u2);
            }
            g2.V(false);
            PopupMenuCardGameKt$PopupMenuCardGameSu4bsnU$$inlined$debouncedWithParam$1 popupMenuCardGameKt$PopupMenuCardGameSu4bsnU$$inlined$debouncedWithParam$1 = new PopupMenuCardGameKt$PopupMenuCardGameSu4bsnU$$inlined$debouncedWithParam$1(500L, (MutableLongState) u2, aVar, lVar);
            g2.V(false);
            Modifier a2 = ClipKt.a(BackgroundKt.a(Modifier.Companion.f14687a, MyColors.INSTANCE.m37getText70d7_KjU(), RectangleShapeKt.f15014a), RoundedCornerShapeKt.b(4));
            long a3 = DpKt.a(I, I2);
            g2.J(-1038803384);
            boolean z5 = (i4 & 7168) == 2048;
            Object u3 = g2.u();
            if (z5 || u3 == composer$Companion$Empty$1) {
                u3 = new PopupMenuCardGameKt$PopupMenuCardGame$3$1(aVar);
                g2.o(u3);
            }
            g2.V(false);
            AndroidMenu_androidKt.a(z2, (a) u3, a2, a3, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.c(-88494602, new PopupMenuCardGameKt$PopupMenuCardGame$4(z4, popupMenuCardGameKt$PopupMenuCardGameSu4bsnU$$inlined$debouncedWithParam$1), g2), g2, i4 & 14, 48, 2032);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new PopupMenuCardGameKt$PopupMenuCardGame$5(z2, z3, j2, aVar, z4, lVar, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getMenuColor(MenuCardGame menuCardGame) {
        return menuCardGame == MenuCardGame.RemoveFromFavorites ? MyColors.INSTANCE.m23getText190d7_KjU() : MyColors.INSTANCE.m22getText180d7_KjU();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldShowMenuItem(MenuCardGame menuCardGame, boolean z2) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[menuCardGame.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return z2;
            }
        } else if (z2) {
            return false;
        }
        return true;
    }
}
