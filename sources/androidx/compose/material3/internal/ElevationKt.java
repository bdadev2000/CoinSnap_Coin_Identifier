package androidx.compose.material3.internal;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class ElevationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TweenSpec f12985a;

    /* renamed from: b, reason: collision with root package name */
    public static final TweenSpec f12986b;

    /* renamed from: c, reason: collision with root package name */
    public static final TweenSpec f12987c;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        f12985a = new TweenSpec(120, EasingKt.f2083a, 2);
        f12986b = new TweenSpec(Opcodes.FCMPG, cubicBezierEasing, 2);
        f12987c = new TweenSpec(120, cubicBezierEasing, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0017, code lost:
    
        if ((r11 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0033, code lost:
    
        if ((r10 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.compose.animation.core.Animatable r8, float r9, androidx.compose.foundation.interaction.Interaction r10, androidx.compose.foundation.interaction.Interaction r11, h0.g r12) {
        /*
            r0 = 0
            if (r11 == 0) goto L1c
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.material3.internal.ElevationKt.f12985a
            if (r10 == 0) goto Lb
        L9:
            r0 = r1
            goto L1a
        Lb:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r10 == 0) goto L10
            goto L9
        L10:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r10 == 0) goto L15
            goto L9
        L15:
            boolean r10 = r11 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r10 == 0) goto L1a
            goto L9
        L1a:
            r3 = r0
            goto L36
        L1c:
            if (r10 == 0) goto L1a
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
            androidx.compose.animation.core.TweenSpec r1 = androidx.compose.material3.internal.ElevationKt.f12986b
            if (r11 == 0) goto L25
        L24:
            goto L9
        L25:
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.DragInteraction.Start
            if (r11 == 0) goto L2a
            goto L24
        L2a:
            boolean r11 = r10 instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter
            if (r11 == 0) goto L31
            androidx.compose.animation.core.TweenSpec r0 = androidx.compose.material3.internal.ElevationKt.f12987c
            goto L1a
        L31:
            boolean r10 = r10 instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus
            if (r10 == 0) goto L1a
            goto L24
        L36:
            d0.b0 r10 = d0.b0.f30125a
            if (r3 == 0) goto L4f
            androidx.compose.ui.unit.Dp r2 = new androidx.compose.ui.unit.Dp
            r2.<init>(r9)
            r4 = 0
            r5 = 0
            r7 = 12
            r1 = r8
            r6 = r12
            java.lang.Object r8 = androidx.compose.animation.core.Animatable.c(r1, r2, r3, r4, r5, r6, r7)
            i0.a r9 = i0.a.f30806a
            if (r8 != r9) goto L4e
            return r8
        L4e:
            return r10
        L4f:
            androidx.compose.ui.unit.Dp r11 = new androidx.compose.ui.unit.Dp
            r11.<init>(r9)
            java.lang.Object r8 = r8.e(r11, r12)
            i0.a r9 = i0.a.f30806a
            if (r8 != r9) goto L5d
            return r8
        L5d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.ElevationKt.a(androidx.compose.animation.core.Animatable, float, androidx.compose.foundation.interaction.Interaction, androidx.compose.foundation.interaction.Interaction, h0.g):java.lang.Object");
    }
}
