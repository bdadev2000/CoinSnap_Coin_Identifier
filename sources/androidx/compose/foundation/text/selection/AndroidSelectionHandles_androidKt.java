package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.AbsoluteAlignment;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class AndroidSelectionHandles_androidKt {
    public static final void a(OffsetProvider offsetProvider, Alignment alignment, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(476043083);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(offsetProvider) : g2.w(offsetProvider) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(alignment) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            boolean z2 = false;
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && g2.I(offsetProvider))) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object u2 = g2.u();
            if (z4 || u2 == Composer.Companion.f13690a) {
                u2 = new HandlePositionProvider(alignment, offsetProvider);
                g2.o(u2);
            }
            AndroidPopup_androidKt.a((HandlePositionProvider) u2, null, new PopupProperties(false, true, true, SecureFlagPolicy.f17706a, true, false), pVar, g2, ((i3 << 3) & 7168) | 384, 2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidSelectionHandles_androidKt$HandlePopup$1(offsetProvider, alignment, pVar, i2);
        }
    }

    public static final void b(OffsetProvider offsetProvider, boolean z2, ResolvedTextDirection resolvedTextDirection, boolean z3, long j2, Modifier modifier, Composer composer, int i2, int i3) {
        int i4;
        long j3;
        boolean z4;
        long j4;
        ComposerImpl g2 = composer.g(-843755800);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? g2.I(offsetProvider) : g2.w(offsetProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.a(z2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.I(resolvedTextDirection) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= g2.a(z3) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            j3 = j2;
            i4 |= ((i3 & 16) == 0 && g2.d(j3)) ? 16384 : 8192;
        } else {
            j3 = j2;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= g2.I(modifier) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i4) == 74898 && g2.i()) {
            g2.A();
            j4 = j3;
        } else {
            g2.u0();
            if ((i2 & 1) != 0 && !g2.e0()) {
                g2.A();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                j3 = 9205357640488583168L;
            }
            long j5 = j3;
            g2.W();
            ResolvedTextDirection resolvedTextDirection2 = ResolvedTextDirection.f17461b;
            ResolvedTextDirection resolvedTextDirection3 = ResolvedTextDirection.f17460a;
            if (z2) {
                float f2 = SelectionHandlesKt.f7185a;
                z4 = (resolvedTextDirection == resolvedTextDirection3 && !z3) || (resolvedTextDirection == resolvedTextDirection2 && z3);
            } else {
                float f3 = SelectionHandlesKt.f7185a;
                z4 = (resolvedTextDirection != resolvedTextDirection3 || z3) && !(resolvedTextDirection == resolvedTextDirection2 && z3);
            }
            BiasAbsoluteAlignment biasAbsoluteAlignment = z4 ? AbsoluteAlignment.f14656b : AbsoluteAlignment.f14655a;
            int i5 = i4 & 14;
            boolean a2 = (i5 == 4 || ((i4 & 8) != 0 && g2.w(offsetProvider))) | ((i4 & 112) == 32) | g2.a(z4);
            Object u2 = g2.u();
            if (a2 || u2 == Composer.Companion.f13690a) {
                u2 = new AndroidSelectionHandles_androidKt$SelectionHandle$semanticsModifier$1$1(offsetProvider, z2, z4);
                g2.o(u2);
            }
            a(offsetProvider, biasAbsoluteAlignment, ComposableLambdaKt.c(280174801, new AndroidSelectionHandles_androidKt$SelectionHandle$1((ViewConfiguration) g2.K(CompositionLocalsKt.f16445q), j5, z4, SemanticsModifierKt.b(modifier, false, (l) u2), offsetProvider), g2), g2, i5 | 384);
            j4 = j5;
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidSelectionHandles_androidKt$SelectionHandle$2(offsetProvider, z2, resolvedTextDirection, z3, j4, modifier, i2, i3);
        }
    }

    public static final void c(Modifier modifier, q0.a aVar, boolean z2, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.a(z2) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            SpacerKt.a(ComposedModifierKt.a(SizeKt.o(modifier, SelectionHandlesKt.f7185a, SelectionHandlesKt.f7186b), new AndroidSelectionHandles_androidKt$drawSelectionHandle$1(aVar, z2)), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AndroidSelectionHandles_androidKt$SelectionHandleIcon$1(modifier, aVar, z2, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1 > r6) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.graphics.ImageBitmap d(androidx.compose.ui.draw.CacheDrawScope r25, float r26) {
        /*
            r0 = r25
            r3 = r26
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            androidx.compose.ui.graphics.ImageBitmap r2 = androidx.compose.foundation.text.selection.HandleImageCache.f7063a
            androidx.compose.ui.graphics.Canvas r4 = androidx.compose.foundation.text.selection.HandleImageCache.f7064b
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r5 = androidx.compose.foundation.text.selection.HandleImageCache.f7065c
            if (r2 == 0) goto L27
            if (r4 == 0) goto L27
            int r6 = r2.getWidth()
            if (r1 > r6) goto L27
            int r6 = r2.getHeight()
            if (r1 <= r6) goto L24
            goto L27
        L24:
            r9 = r2
            r10 = r4
            goto L35
        L27:
            r2 = 1
            androidx.compose.ui.graphics.AndroidImageBitmap r2 = androidx.compose.ui.graphics.ImageBitmapKt.a(r1, r1, r2)
            androidx.compose.foundation.text.selection.HandleImageCache.f7063a = r2
            androidx.compose.ui.graphics.AndroidCanvas r4 = androidx.compose.ui.graphics.CanvasKt.a(r2)
            androidx.compose.foundation.text.selection.HandleImageCache.f7064b = r4
            goto L24
        L35:
            if (r5 != 0) goto L3f
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r1 = new androidx.compose.ui.graphics.drawscope.CanvasDrawScope
            r1.<init>()
            androidx.compose.foundation.text.selection.HandleImageCache.f7065c = r1
            goto L40
        L3f:
            r1 = r5
        L40:
            androidx.compose.ui.draw.BuildDrawCacheParams r2 = r0.f14796a
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getLayoutDirection()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            int r5 = r9.getHeight()
            float r5 = (float) r5
            long r4 = androidx.compose.ui.geometry.SizeKt.a(r4, r5)
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$DrawParams r8 = r1.f15133a
            androidx.compose.ui.unit.Density r7 = r8.f15136a
            androidx.compose.ui.unit.LayoutDirection r6 = r8.f15137b
            androidx.compose.ui.graphics.Canvas r14 = r8.f15138c
            long r12 = r8.d
            r8.f15136a = r0
            r8.f15137b = r2
            r8.f15138c = r10
            r8.d = r4
            r10.p()
            long r4 = androidx.compose.ui.graphics.Color.f14957b
            r15 = 0
            long r17 = r1.b()
            r0 = 0
            r19 = 0
            r20 = 58
            r11 = r1
            r21 = r12
            r12 = r4
            r4 = r14
            r14 = r15
            r16 = r17
            r18 = r0
            androidx.compose.ui.graphics.drawscope.DrawScope.R0(r11, r12, r14, r16, r18, r19, r20)
            r23 = 4278190080(0xff000000, double:2.113706745E-314)
            long r12 = androidx.compose.ui.graphics.ColorKt.d(r23)
            r14 = 0
            long r16 = androidx.compose.ui.geometry.SizeKt.a(r3, r3)
            r18 = 0
            r20 = 120(0x78, float:1.68E-43)
            androidx.compose.ui.graphics.drawscope.DrawScope.R0(r11, r12, r14, r16, r18, r19, r20)
            long r11 = androidx.compose.ui.graphics.ColorKt.d(r23)
            long r13 = androidx.compose.ui.geometry.OffsetKt.a(r3, r3)
            r15 = 0
            r16 = 0
            r17 = 120(0x78, float:1.68E-43)
            r0 = r1
            r1 = r11
            r3 = r26
            r11 = r4
            r4 = r13
            r12 = r6
            r6 = r15
            r13 = r7
            r7 = r16
            r14 = r8
            r8 = r17
            androidx.compose.ui.graphics.drawscope.DrawScope.w0(r0, r1, r3, r4, r6, r7, r8)
            r10.i()
            r14.f15136a = r13
            r14.f15137b = r12
            r14.f15138c = r11
            r0 = r21
            r14.d = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.d(androidx.compose.ui.draw.CacheDrawScope, float):androidx.compose.ui.graphics.ImageBitmap");
    }
}
