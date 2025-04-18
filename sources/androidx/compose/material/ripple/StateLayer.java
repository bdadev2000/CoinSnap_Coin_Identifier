package androidx.compose.material.ripple;

import android.support.v4.media.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import b1.d0;
import e0.u;
import java.util.ArrayList;
import kotlin.jvm.internal.e;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class StateLayer {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7470a;

    /* renamed from: b, reason: collision with root package name */
    public final q0.a f7471b;

    /* renamed from: c, reason: collision with root package name */
    public final Animatable f7472c = AnimatableKt.a(0.0f);
    public final ArrayList d = new ArrayList();
    public Interaction e;

    public StateLayer(q0.a aVar, boolean z2) {
        this.f7470a = z2;
        this.f7471b = aVar;
    }

    public final void a(DrawScope drawScope, float f2, long j2) {
        float floatValue = ((Number) this.f7472c.d()).floatValue();
        if (floatValue > 0.0f) {
            long b2 = Color.b(j2, floatValue);
            if (!this.f7470a) {
                drawScope.j1(b2, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : f2, (r19 & 4) != 0 ? drawScope.F1() : 0L, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
                return;
            }
            float d = Size.d(drawScope.b());
            float b3 = Size.b(drawScope.b());
            CanvasDrawScope$drawContext$1 A1 = drawScope.A1();
            long b4 = A1.b();
            A1.a().p();
            A1.f15139a.b(0.0f, 0.0f, d, b3, 1);
            drawScope.j1(b2, (r19 & 2) != 0 ? Size.c(drawScope.b()) / 2.0f : f2, (r19 & 4) != 0 ? drawScope.F1() : 0L, (r19 & 8) != 0 ? 1.0f : 0.0f, (r19 & 16) != 0 ? Fill.f15146a : null, null, (r19 & 64) != 0 ? 3 : 0);
            d.A(A1, b4);
        }
    }

    public final void b(Interaction interaction, d0 d0Var) {
        boolean z2 = interaction instanceof HoverInteraction.Enter;
        ArrayList arrayList = this.d;
        if (z2) {
            arrayList.add(interaction);
        } else if (interaction instanceof HoverInteraction.Exit) {
            arrayList.remove(((HoverInteraction.Exit) interaction).f3733a);
        } else if (interaction instanceof FocusInteraction.Focus) {
            arrayList.add(interaction);
        } else if (interaction instanceof FocusInteraction.Unfocus) {
            arrayList.remove(((FocusInteraction.Unfocus) interaction).f3727a);
        } else if (interaction instanceof DragInteraction.Start) {
            arrayList.add(interaction);
        } else if (interaction instanceof DragInteraction.Stop) {
            arrayList.remove(((DragInteraction.Stop) interaction).f3721a);
        } else if (!(interaction instanceof DragInteraction.Cancel)) {
            return;
        } else {
            arrayList.remove(((DragInteraction.Cancel) interaction).f3720a);
        }
        Interaction interaction2 = (Interaction) u.M0(arrayList);
        if (p0.a.g(this.e, interaction2)) {
            return;
        }
        if (interaction2 != null) {
            RippleAlpha rippleAlpha = (RippleAlpha) this.f7471b.invoke();
            float f2 = z2 ? rippleAlpha.f7410c : interaction instanceof FocusInteraction.Focus ? rippleAlpha.f7409b : interaction instanceof DragInteraction.Start ? rippleAlpha.f7408a : 0.0f;
            TweenSpec tweenSpec = RippleKt.f7451a;
            boolean z3 = interaction2 instanceof HoverInteraction.Enter;
            TweenSpec tweenSpec2 = RippleKt.f7451a;
            if (!z3) {
                if (interaction2 instanceof FocusInteraction.Focus) {
                    tweenSpec2 = new TweenSpec(45, EasingKt.d, 2);
                } else if (interaction2 instanceof DragInteraction.Start) {
                    tweenSpec2 = new TweenSpec(45, EasingKt.d, 2);
                }
            }
            e.v(d0Var, null, 0, new StateLayer$handleInteraction$1(this, f2, tweenSpec2, null), 3);
        } else {
            Interaction interaction3 = this.e;
            TweenSpec tweenSpec3 = RippleKt.f7451a;
            boolean z4 = interaction3 instanceof HoverInteraction.Enter;
            TweenSpec tweenSpec4 = RippleKt.f7451a;
            if (!z4 && !(interaction3 instanceof FocusInteraction.Focus) && (interaction3 instanceof DragInteraction.Start)) {
                tweenSpec4 = new TweenSpec(Opcodes.FCMPG, EasingKt.d, 2);
            }
            e.v(d0Var, null, 0, new StateLayer$handleInteraction$2(this, tweenSpec4, null), 3);
        }
        this.e = interaction2;
    }
}
