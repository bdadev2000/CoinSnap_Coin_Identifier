package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import com.safedk.android.internal.d;

/* loaded from: classes3.dex */
public final class FloatingActionButtonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f9450a = 16;

    /* renamed from: b, reason: collision with root package name */
    public static final float f9451b = 12;

    /* renamed from: c, reason: collision with root package name */
    public static final float f9452c = 20;
    public static final float d = 80;
    public static final ExitTransition e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnterTransition f9453f;

    static {
        CubicBezierEasing cubicBezierEasing = MotionTokens.f13439c;
        ExitTransition f2 = EnterExitTransitionKt.f(AnimationSpecKt.d(100, 0, cubicBezierEasing, 2), 2);
        CubicBezierEasing cubicBezierEasing2 = MotionTokens.f13437a;
        TweenSpec d2 = AnimationSpecKt.d(d.f29936c, 0, cubicBezierEasing2, 2);
        BiasAlignment.Horizontal horizontal = Alignment.Companion.f14669m;
        e = f2.b(EnterExitTransitionKt.i(d2, horizontal, 12));
        f9453f = EnterExitTransitionKt.e(new TweenSpec(200, 100, cubicBezierEasing), 0.0f, 2).b(EnterExitTransitionKt.a(AnimationSpecKt.d(d.f29936c, 0, cubicBezierEasing2, 2), horizontal, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0214 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q0.a r31, androidx.compose.ui.Modifier r32, androidx.compose.ui.graphics.Shape r33, long r34, long r36, androidx.compose.material3.FloatingActionButtonElevation r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, q0.p r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.a(q0.a, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
