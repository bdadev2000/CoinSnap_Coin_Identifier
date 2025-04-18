package com.cooldev.gba.emulator.gameboy.widgets.search;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.constants.MyFonts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SearchKt {
    @ComposableTarget
    @Composable
    /* renamed from: Search-4VtiKLc, reason: not valid java name */
    public static final void m408Search4VtiKLc(@Nullable Modifier modifier, @NotNull FocusRequester focusRequester, @NotNull String str, @NotNull a aVar, @NotNull l lVar, @Nullable a aVar2, boolean z2, @Nullable String str2, boolean z3, long j2, int i2, @Nullable Composer composer, int i3, int i4, int i5) {
        int i6;
        long j3;
        int i7;
        ComposerImpl composerImpl;
        int i8;
        Modifier modifier2;
        a aVar3;
        boolean z4;
        String str3;
        boolean z5;
        long j4;
        p0.a.s(focusRequester, "focusRequester");
        p0.a.s(str, "searchText");
        p0.a.s(aVar, "onDone");
        p0.a.s(lVar, "onValueChange");
        ComposerImpl g2 = composer.g(1251591335);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i6 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i6 = (g2.I(modifier) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i3 & 112) == 0) {
            i6 |= g2.I(focusRequester) ? 32 : 16;
        }
        if ((i5 & 4) != 0) {
            i6 |= 384;
        } else if ((i3 & 896) == 0) {
            i6 |= g2.I(str) ? 256 : 128;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i3 & 7168) == 0) {
            i6 |= g2.w(aVar) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i5 & 16) != 0) {
            i6 |= 24576;
        } else if ((i3 & 57344) == 0) {
            i6 |= g2.w(lVar) ? 16384 : 8192;
        }
        int i10 = i5 & 32;
        if (i10 != 0) {
            i6 |= 196608;
        } else if ((i3 & Opcodes.ASM7) == 0) {
            i6 |= g2.w(aVar2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        int i11 = i5 & 64;
        if (i11 != 0) {
            i6 |= 1572864;
        } else if ((i3 & 3670016) == 0) {
            i6 |= g2.a(z2) ? 1048576 : Opcodes.ASM8;
        }
        int i12 = i5 & 128;
        if (i12 != 0) {
            i6 |= 12582912;
        } else if ((i3 & 29360128) == 0) {
            i6 |= g2.I(str2) ? 8388608 : 4194304;
        }
        int i13 = i5 & 256;
        if (i13 != 0) {
            i6 |= 100663296;
        } else if ((i3 & 234881024) == 0) {
            i6 |= g2.a(z3) ? 67108864 : 33554432;
        }
        int i14 = i5 & 512;
        if (i14 != 0) {
            i6 |= 805306368;
            j3 = j2;
        } else {
            j3 = j2;
            if ((i3 & 1879048192) == 0) {
                i6 |= g2.d(j3) ? 536870912 : 268435456;
            }
        }
        int i15 = i5 & 1024;
        if (i15 != 0) {
            i7 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            i7 = i4 | (g2.c(i2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i6 & 1533916891) == 306783378 && (i7 & 11) == 2 && g2.i()) {
            g2.A();
            modifier2 = modifier;
            z4 = z2;
            str3 = str2;
            z5 = z3;
            i8 = i2;
            composerImpl = g2;
            j4 = j3;
            aVar3 = aVar2;
        } else {
            Modifier modifier3 = i9 != 0 ? Modifier.Companion.f14687a : modifier;
            a aVar4 = i10 != 0 ? SearchKt$Search$1.INSTANCE : aVar2;
            boolean z6 = i11 != 0 ? false : z2;
            String str4 = i12 != 0 ? "" : str2;
            boolean z7 = i13 != 0 ? true : z3;
            long j5 = i14 != 0 ? Color.f14961h : j3;
            int i16 = i15 != 0 ? 1 : i2;
            boolean z8 = str.length() == 0;
            KeyboardOptions keyboardOptions = KeyboardOptions.f6014h;
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(keyboardOptions.f6016a, keyboardOptions.f6017b, i16, 7, keyboardOptions.e, null, null);
            g2.J(-748354400);
            boolean z9 = (i6 & 7168) == 2048;
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (z9 || u2 == composer$Companion$Empty$1) {
                u2 = new SearchKt$Search$2$1(aVar);
                g2.o(u2);
            }
            g2.V(false);
            KeyboardActions keyboardActions = new KeyboardActions((l) u2, null, null, 62);
            TextStyle a2 = TextStyle.a(0, 16646104, Color.f14958c, TextUnitKt.b(16), 0L, TextUnitKt.b(24), null, (TextStyle) g2.K(TextKt.f12204a), MyFonts.INSTANCE.getInter(), FontWeight.f17264b, null);
            SolidColor solidColor = new SolidColor(MyColors.INSTANCE.m36getText60d7_KjU());
            Modifier e = SizeKt.e(SizeKt.d(modifier3, 1.0f), 40);
            g2.J(-748351383);
            boolean z10 = (i6 & 57344) == 16384;
            Object u3 = g2.u();
            if (z10 || u3 == composer$Companion$Empty$1) {
                u3 = new SearchKt$Search$3$1(lVar);
                g2.o(u3);
            }
            g2.V(false);
            int i17 = i6;
            composerImpl = g2;
            BasicTextFieldKt.c(str, (l) u3, e, z7, false, a2, keyboardOptions2, keyboardActions, true, 1, 0, null, null, null, solidColor, ComposableLambdaKt.c(1166758065, new SearchKt$Search$4(j5, focusRequester, z8, z6, aVar4, str4), g2), composerImpl, ((i17 >> 6) & 14) | 905969664 | ((i17 >> 15) & 7168), 221184, 15376);
            i8 = i16;
            modifier2 = modifier3;
            aVar3 = aVar4;
            z4 = z6;
            str3 = str4;
            z5 = z7;
            j4 = j5;
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new SearchKt$Search$5(modifier2, focusRequester, str, aVar, lVar, aVar3, z4, str3, z5, j4, i8, i3, i4, i5);
        }
    }
}
