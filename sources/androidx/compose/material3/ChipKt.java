package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import e0.u;
import org.objectweb.asm.Opcodes;
import q0.p;

/* loaded from: classes4.dex */
public final class ChipKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8252a;

    /* renamed from: b, reason: collision with root package name */
    public static final PaddingValuesImpl f8253b;

    /* renamed from: c, reason: collision with root package name */
    public static final PaddingValuesImpl f8254c;
    public static final PaddingValuesImpl d;

    static {
        float f2 = 8;
        f8252a = f2;
        f8253b = PaddingKt.a(2, f2);
        f8254c = PaddingKt.a(2, f2);
        d = PaddingKt.a(2, f2);
    }

    public static final void a(Modifier modifier, q0.a aVar, boolean z2, p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        int i7;
        Dp dp;
        int i8;
        ComposerImpl composerImpl;
        ComposerImpl g2 = composer.g(1400504719);
        if ((i2 & 6) == 0) {
            i4 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g2.a(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g2.w(pVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= g2.I(textStyle) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= g2.d(j2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= g2.w(pVar2) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i4 |= g2.w(pVar3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= g2.I(shape) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= g2.I(chipColors) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (g2.I(chipElevation) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.I(borderStroke) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.b(f2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.I(paddingValues) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.I(mutableInteractionSource) ? 16384 : 8192;
        }
        int i9 = i5;
        if ((i4 & 306783379) == 306783378 && (i9 & 9363) == 9362 && g2.i()) {
            g2.A();
            composerImpl = g2;
        } else {
            g2.J(1985614987);
            Object obj = Composer.Companion.f13690a;
            if (mutableInteractionSource == null) {
                Object u2 = g2.u();
                if (u2 == obj) {
                    u2 = InteractionSourceKt.a();
                    g2.o(u2);
                }
                mutableInteractionSource2 = (MutableInteractionSource) u2;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            g2.V(false);
            Modifier b2 = SemanticsModifierKt.b(modifier, false, ChipKt$Chip$1.f8281a);
            long j3 = z2 ? chipColors.f8233a : chipColors.e;
            g2.J(1985624506);
            AnimationState animationState = null;
            if (chipElevation == null) {
                i7 = i4;
                mutableInteractionSource3 = mutableInteractionSource2;
                i8 = i9;
            } else {
                int i10 = ((i4 >> 6) & 14) | ((i9 << 6) & 896);
                int i11 = (i10 & 896) | (i10 & 14) | (i10 & 112);
                Object u3 = g2.u();
                if (u3 == obj) {
                    u3 = new SnapshotStateList();
                    g2.o(u3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) u3;
                Object u4 = g2.u();
                if (u4 == obj) {
                    u4 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
                    g2.o(u4);
                }
                MutableState mutableState = (MutableState) u4;
                boolean z3 = true;
                int i12 = i4;
                boolean z4 = (((i11 & 112) ^ 48) > 32 && g2.I(mutableInteractionSource2)) || (i11 & 48) == 32;
                Object u5 = g2.u();
                if (z4 || u5 == obj) {
                    u5 = new ChipElevation$animateElevation$1$1(mutableInteractionSource2, snapshotStateList, null);
                    g2.o(u5);
                }
                EffectsKt.f(mutableInteractionSource2, (p) u5, g2);
                Interaction interaction = (Interaction) u.M0(snapshotStateList);
                float f3 = !z2 ? chipElevation.f8242f : interaction instanceof PressInteraction.Press ? chipElevation.f8240b : interaction instanceof HoverInteraction.Enter ? chipElevation.d : interaction instanceof FocusInteraction.Focus ? chipElevation.f8241c : interaction instanceof DragInteraction.Start ? chipElevation.e : chipElevation.f8239a;
                Object u6 = g2.u();
                if (u6 == obj) {
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i6 = i9;
                    u6 = new Animatable(new Dp(f3), VectorConvertersKt.f2342c, null, 12);
                    g2.o(u6);
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i6 = i9;
                }
                Animatable animatable = (Animatable) u6;
                Dp dp2 = new Dp(f3);
                boolean w = g2.w(animatable) | g2.b(f3);
                if ((((i11 & 14) ^ 6) <= 4 || !g2.a(z2)) && (i11 & 6) != 4) {
                    z3 = false;
                }
                boolean w2 = w | z3 | g2.w(interaction);
                Object u7 = g2.u();
                if (w2 || u7 == obj) {
                    i7 = i12;
                    dp = dp2;
                    i8 = i6;
                    Object chipElevation$animateElevation$2$1 = new ChipElevation$animateElevation$2$1(animatable, f3, z2, interaction, mutableState, null);
                    g2.o(chipElevation$animateElevation$2$1);
                    u7 = chipElevation$animateElevation$2$1;
                } else {
                    dp = dp2;
                    i7 = i12;
                    i8 = i6;
                }
                EffectsKt.f(dp, (p) u7, g2);
                animationState = animatable.f1983c;
            }
            g2.V(false);
            composerImpl = g2;
            int i13 = i7;
            SurfaceKt.d(aVar, b2, z2, shape, j3, 0L, 0.0f, animationState != null ? ((Dp) animationState.f2035b.getValue()).f17486a : 0, borderStroke, mutableInteractionSource3, ComposableLambdaKt.c(-1985962652, new ChipKt$Chip$2(pVar, textStyle, j2, pVar2, pVar3, chipColors, z2, f2, paddingValues), composerImpl), composerImpl, ((i13 >> 15) & 7168) | ((i13 >> 3) & 14) | (i13 & 896) | ((i8 << 21) & 234881024), 96);
        }
        RecomposeScopeImpl Z = composerImpl.Z();
        if (Z != null) {
            Z.d = new ChipKt$Chip$3(modifier, aVar, z2, pVar, textStyle, j2, pVar2, pVar3, shape, chipColors, chipElevation, borderStroke, f2, paddingValues, mutableInteractionSource, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static final void b(boolean z2, Modifier modifier, q0.a aVar, boolean z3, p pVar, TextStyle textStyle, p pVar2, p pVar3, p pVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f2, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        MutableInteractionSource mutableInteractionSource2;
        ComposerImpl composerImpl;
        long j2;
        MutableInteractionSource mutableInteractionSource3;
        int i6;
        boolean z4;
        AnimationState animationState;
        ?? r12;
        ComposerImpl composerImpl2;
        ComposerImpl g2 = composer.g(402951308);
        if ((i2 & 6) == 0) {
            i4 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g2.I(modifier) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g2.w(aVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g2.a(z3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= g2.w(pVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= g2.I(textStyle) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= g2.w(pVar2) ? 1048576 : Opcodes.ASM8;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= g2.w(pVar3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= g2.w(pVar4) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= g2.I(shape) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (g2.I(selectableChipColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.I(selectableChipElevation) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.I(borderStroke) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.b(f2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i5 |= g2.I(paddingValues) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i5 |= g2.I(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 74899) == 74898 && g2.i()) {
            g2.A();
            composerImpl2 = g2;
        } else {
            g2.J(2072749057);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (mutableInteractionSource == null) {
                Object u2 = g2.u();
                if (u2 == composer$Companion$Empty$1) {
                    u2 = InteractionSourceKt.a();
                    g2.o(u2);
                }
                mutableInteractionSource2 = (MutableInteractionSource) u2;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            g2.V(false);
            Modifier b2 = SemanticsModifierKt.b(modifier, false, ChipKt$SelectableChip$1.f8426a);
            if (z3) {
                composerImpl = g2;
                j2 = !z2 ? selectableChipColors.f11152a : selectableChipColors.f11158i;
            } else if (z2) {
                composerImpl = g2;
                j2 = selectableChipColors.f11159j;
            } else {
                composerImpl = g2;
                j2 = selectableChipColors.e;
            }
            long j3 = j2;
            ComposerImpl composerImpl3 = composerImpl;
            composerImpl3.J(2072762384);
            if (selectableChipElevation == null) {
                i6 = i4;
                mutableInteractionSource3 = mutableInteractionSource2;
                animationState = null;
                r12 = 0;
            } else {
                int i7 = ((i5 << 3) & 896) | ((i4 >> 9) & 14);
                int i8 = (i7 & 896) | (i7 & 14) | (i7 & 112);
                Object u3 = composerImpl3.u();
                if (u3 == composer$Companion$Empty$1) {
                    u3 = new SnapshotStateList();
                    composerImpl3.o(u3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) u3;
                int i9 = i4;
                Object u4 = composerImpl3.u();
                if (u4 == composer$Companion$Empty$1) {
                    u4 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
                    composerImpl3.o(u4);
                }
                MutableState mutableState = (MutableState) u4;
                boolean z5 = true;
                boolean z6 = (((i8 & 112) ^ 48) > 32 && composerImpl3.I(mutableInteractionSource2)) || (i8 & 48) == 32;
                Object u5 = composerImpl3.u();
                if (z6 || u5 == composer$Companion$Empty$1) {
                    u5 = new SelectableChipElevation$animateElevation$1$1(mutableInteractionSource2, snapshotStateList, null);
                    composerImpl3.o(u5);
                }
                EffectsKt.f(mutableInteractionSource2, (p) u5, composerImpl3);
                Interaction interaction = (Interaction) u.M0(snapshotStateList);
                float f3 = !z3 ? selectableChipElevation.f11166f : interaction instanceof PressInteraction.Press ? selectableChipElevation.f11164b : interaction instanceof HoverInteraction.Enter ? selectableChipElevation.d : interaction instanceof FocusInteraction.Focus ? selectableChipElevation.f11165c : interaction instanceof DragInteraction.Start ? selectableChipElevation.e : selectableChipElevation.f11163a;
                Object u6 = composerImpl3.u();
                if (u6 == composer$Companion$Empty$1) {
                    mutableInteractionSource3 = mutableInteractionSource2;
                    u6 = new Animatable(new Dp(f3), VectorConvertersKt.f2342c, null, 12);
                    composerImpl3.o(u6);
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                Animatable animatable = (Animatable) u6;
                Dp dp = new Dp(f3);
                boolean w = composerImpl3.w(animatable) | composerImpl3.b(f3);
                if ((((i8 & 14) ^ 6) <= 4 || !composerImpl3.a(z3)) && (i8 & 6) != 4) {
                    z5 = false;
                }
                boolean w2 = w | z5 | composerImpl3.w(interaction);
                Object u7 = composerImpl3.u();
                if (w2 || u7 == composer$Companion$Empty$1) {
                    i6 = i9;
                    z4 = false;
                    SelectableChipElevation$animateElevation$2$1 selectableChipElevation$animateElevation$2$1 = new SelectableChipElevation$animateElevation$2$1(animatable, f3, z3, interaction, mutableState, null);
                    composerImpl3.o(selectableChipElevation$animateElevation$2$1);
                    u7 = selectableChipElevation$animateElevation$2$1;
                } else {
                    i6 = i9;
                    z4 = false;
                }
                EffectsKt.f(dp, (p) u7, composerImpl3);
                animationState = animatable.f1983c;
                r12 = z4;
            }
            composerImpl3.V(r12);
            int i10 = (i6 & 14) | ((i6 >> 3) & 112) | (i6 & 7168) | ((i6 >> 15) & 57344) | ((i5 << 21) & 1879048192);
            MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
            composerImpl2 = composerImpl3;
            SurfaceKt.b(z2, aVar, b2, z3, shape, j3, 0L, animationState != null ? ((Dp) animationState.f2035b.getValue()).f17486a : (float) r12, borderStroke, mutableInteractionSource4, ComposableLambdaKt.c(-577614814, new ChipKt$SelectableChip$2(selectableChipColors, z3, z2, pVar, textStyle, pVar2, pVar3, pVar4, f2, paddingValues), composerImpl3), composerImpl3, i10, Opcodes.CHECKCAST);
        }
        RecomposeScopeImpl Z = composerImpl2.Z();
        if (Z != null) {
            Z.d = new ChipKt$SelectableChip$3(z2, modifier, aVar, z3, pVar, textStyle, pVar2, pVar3, pVar4, shape, selectableChipColors, selectableChipElevation, borderStroke, f2, paddingValues, mutableInteractionSource, i2, i3);
        }
    }

    public static final void c(p pVar, TextStyle textStyle, long j2, p pVar2, p pVar3, p pVar4, long j3, long j4, float f2, PaddingValues paddingValues, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-782878228);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.d(j2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.w(pVar2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.w(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.w(pVar4) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.d(j3) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.d(j4) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.b(f2) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= g2.I(paddingValues) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && g2.i()) {
            g2.A();
        } else {
            CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(j2, ContentColorKt.f8654a), TextKt.f12204a.c(textStyle)}, ComposableLambdaKt.c(1748799148, new ChipKt$ChipContent$1(f2, paddingValues, pVar3, pVar2, pVar4, j3, pVar, j4), g2), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ChipKt$ChipContent$2(pVar, textStyle, j2, pVar2, pVar3, pVar4, j3, j4, f2, paddingValues, i2);
        }
    }
}
