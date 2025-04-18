package com.cooldev.gba.emulator.gameboy.features.component;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.R;
import f.c;
import f.h;
import f.o;
import g.v;
import h.s;
import h.x;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import r.e;
import r.g;

/* loaded from: classes3.dex */
public final class TapGuideKt {
    @ComposableTarget
    @Composable
    public static final void TapGuide(@Nullable Modifier modifier, @Nullable Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        Modifier modifier3;
        ComposerImpl g2 = composer.g(557905749);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (g2.I(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
            modifier3 = modifier2;
        } else {
            modifier3 = i5 != 0 ? Modifier.Companion.f14687a : modifier2;
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            h hVar = new h(context);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 28) {
                arrayList5.add(new x());
            } else {
                arrayList5.add(new s());
            }
            hVar.f30389c = new c(f0.G(arrayList), f0.G(arrayList2), f0.G(arrayList3), f0.G(arrayList4), f0.G(arrayList5));
            o a2 = hVar.a();
            q.h hVar2 = new q.h(context);
            hVar2.f31271c = Integer.valueOf(R.drawable.ani_gba_hand);
            g gVar = g.f31349c;
            hVar2.K = new e();
            hVar2.M = null;
            hVar2.N = null;
            hVar2.O = null;
            ImageKt.a(v.a(hVar2.a(), a2, null, null, null, 0, g2, 124), null, SizeKt.d(modifier3, 0.5f).T0(modifier3), null, ContentScale.Companion.d, 0.0f, null, g2, 24624, 104);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new TapGuideKt$TapGuide$2(modifier3, i2, i3);
        }
    }
}
