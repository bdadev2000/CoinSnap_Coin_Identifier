package com.cooldev.gba.emulator.gameboy.features.app.views;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class AppInfoFooterKt {
    @ComposableTarget
    @Composable
    /* renamed from: AppInfoFooter-Iv8Zu3U, reason: not valid java name */
    public static final void m115AppInfoFooterIv8Zu3U(long j2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(796119419);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.d(j2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                j2 = Color.f14958c;
            }
            BiasAlignment.Horizontal horizontal = Alignment.Companion.f14670n;
            Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
            Modifier d = SizeKt.d(Modifier.Companion.f14687a, 1.0f);
            ColumnMeasurePolicy a2 = ColumnKt.a(arrangement$Center$1, horizontal, g2, 54);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, d);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            if (!(g2.f13691a instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a2, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            int i7 = i4 & 14;
            AppVersionKt.m116AppVersionIv8Zu3U(j2, g2, i7, 0);
            CopyrightKt.m117CopyrightIv8Zu3U(j2, g2, i7, 0);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AppInfoFooterKt$AppInfoFooter$2(j2, i2, i3);
        }
    }
}
