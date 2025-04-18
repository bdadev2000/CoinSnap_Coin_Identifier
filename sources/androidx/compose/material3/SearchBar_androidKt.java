package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.activity.BackEventCompat;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.internal.MutableWindowInsets;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class SearchBar_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f10895a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f10896b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f10897c;
    public static final float d;
    public static final float e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f10898f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f10899g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f10900h;

    /* renamed from: i, reason: collision with root package name */
    public static final TweenSpec f10901i;

    /* renamed from: j, reason: collision with root package name */
    public static final TweenSpec f10902j;

    /* renamed from: k, reason: collision with root package name */
    public static final TweenSpec f10903k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnterTransition f10904l;

    /* renamed from: m, reason: collision with root package name */
    public static final ExitTransition f10905m;

    static {
        int i2 = Color.f14963j;
        f10895a = SearchBarDefaults.d / 2;
        f10896b = 240;
        f10897c = 360;
        d = 720;
        float f2 = 8;
        e = f2;
        f10898f = 4;
        f10899g = f2;
        f10900h = 24;
        CubicBezierEasing cubicBezierEasing = MotionTokens.f13438b;
        CubicBezierEasing cubicBezierEasing2 = new CubicBezierEasing(0.0f, 1.0f, 0.0f, 1.0f);
        TweenSpec tweenSpec = new TweenSpec(600, 100, cubicBezierEasing);
        f10901i = tweenSpec;
        TweenSpec tweenSpec2 = new TweenSpec(350, 100, cubicBezierEasing2);
        f10902j = tweenSpec2;
        f10903k = AnimationSpecKt.d(350, 0, cubicBezierEasing2, 2);
        TweenSpec tweenSpec3 = new TweenSpec(600, 100, cubicBezierEasing);
        TweenSpec tweenSpec4 = new TweenSpec(350, 100, cubicBezierEasing2);
        f10904l = EnterExitTransitionKt.e(tweenSpec, 0.0f, 2).b(EnterExitTransitionKt.d(tweenSpec3, 14));
        f10905m = EnterExitTransitionKt.f(tweenSpec2, 2).b(EnterExitTransitionKt.l(tweenSpec4, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q0.p r26, boolean r27, q0.l r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.material3.SearchBarColors r31, float r32, float r33, q0.q r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.a(q0.p, boolean, q0.l, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0232 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(q0.p r35, boolean r36, q0.l r37, androidx.compose.ui.Modifier r38, androidx.compose.ui.graphics.Shape r39, androidx.compose.material3.SearchBarColors r40, float r41, float r42, androidx.compose.foundation.layout.WindowInsets r43, q0.q r44, androidx.compose.runtime.Composer r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.b(q0.p, boolean, q0.l, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, q0.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0275 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.animation.core.Animatable r24, androidx.compose.runtime.MutableFloatState r25, androidx.compose.runtime.MutableState r26, androidx.compose.runtime.MutableState r27, androidx.compose.ui.Modifier r28, q0.p r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.material3.SearchBarColors r31, float r32, float r33, androidx.compose.foundation.layout.WindowInsets r34, q0.q r35, androidx.compose.runtime.Composer r36, int r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt.c(androidx.compose.animation.core.Animatable, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.ui.Modifier, q0.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.SearchBarColors, float, float, androidx.compose.foundation.layout.WindowInsets, q0.q, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void d(final Animatable animatable, final MutableFloatState mutableFloatState, final MutableState mutableState, final MutableState mutableState2, Modifier modifier, WindowInsets windowInsets, p pVar, p pVar2, p pVar3, Composer composer, int i2) {
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ComposerImpl g2 = composer.g(70029564);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? g2.I(animatable) : g2.w(animatable) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.I(mutableFloatState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.I(mutableState) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(mutableState2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.I(modifier) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.I(windowInsets) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= g2.w(pVar) ? 1048576 : Opcodes.ASM8;
        }
        if ((12582912 & i2) == 0) {
            i3 |= g2.w(pVar2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= g2.w(pVar3) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if ((38347923 & i5) == 38347922 && g2.i()) {
            g2.A();
        } else {
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new MutableWindowInsets(WindowInsetsKt.a());
                g2.o(u2);
            }
            final MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) u2;
            Modifier T0 = modifier.T0(new ZIndexElement(1.0f));
            boolean z4 = (458752 & i5) == 131072;
            Object u3 = g2.u();
            if (z4 || u3 == composer$Companion$Empty$1) {
                u3 = new SearchBar_androidKt$SearchBarLayout$1$1(mutableWindowInsets, windowInsets);
                g2.o(u3);
            }
            Modifier a2 = WindowInsetsPaddingKt.a(WindowInsetsPaddingKt.b(T0, (l) u3), windowInsets);
            boolean z5 = ((i5 & 14) == 4 || ((i5 & 8) != 0 && g2.w(animatable))) | ((i5 & 7168) == 2048) | ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object u4 = g2.u();
            if (z5 || u4 == composer$Companion$Empty$1) {
                i4 = i5;
                MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1

                    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1$1, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    final class AnonymousClass1 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ MeasureScope f11041a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ long f11042b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ MutableState f11043c;
                        public final /* synthetic */ float d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ float f11044f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ MutableState f11045g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ int f11046h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11047i;

                        /* renamed from: j, reason: collision with root package name */
                        public final /* synthetic */ int f11048j;

                        /* renamed from: k, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11049k;

                        /* renamed from: l, reason: collision with root package name */
                        public final /* synthetic */ int f11050l;

                        /* renamed from: m, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11051m;

                        /* renamed from: n, reason: collision with root package name */
                        public final /* synthetic */ int f11052n;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MeasureScope measureScope, long j2, MutableState mutableState, float f2, float f3, MutableState mutableState2, int i2, Placeable placeable, int i3, Placeable placeable2, int i4, Placeable placeable3, int i5) {
                            super(1);
                            this.f11041a = measureScope;
                            this.f11042b = j2;
                            this.f11043c = mutableState;
                            this.d = f2;
                            this.f11044f = f3;
                            this.f11045g = mutableState2;
                            this.f11046h = i2;
                            this.f11047i = placeable;
                            this.f11048j = i3;
                            this.f11049k = placeable2;
                            this.f11050l = i4;
                            this.f11051m = placeable3;
                            this.f11052n = i5;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            int i2;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            float f2 = SearchBar_androidKt.f10899g;
                            MeasureScope measureScope = this.f11041a;
                            int F0 = measureScope.F0(f2);
                            MutableState mutableState = this.f11043c;
                            BackEventCompat backEventCompat = (BackEventCompat) mutableState.getValue();
                            LayoutDirection layoutDirection = measureScope.getLayoutDirection();
                            int i3 = 0;
                            float f3 = this.f11044f;
                            long j2 = this.f11042b;
                            if (backEventCompat == null || f3 == 0.0f) {
                                i2 = 0;
                            } else {
                                i2 = p0.a.t0((1 - this.d) * ((Constraints.i(j2) * 0.05f) - F0) * f3 * (backEventCompat.d == 0 ? 1 : -1) * (layoutDirection == LayoutDirection.f17494a ? 1 : -1));
                            }
                            BackEventCompat backEventCompat2 = (BackEventCompat) mutableState.getValue();
                            BackEventCompat backEventCompat3 = (BackEventCompat) this.f11045g.getValue();
                            int F02 = measureScope.F0(SearchBar_androidKt.f10900h);
                            if (backEventCompat3 != null && backEventCompat2 != null && f3 != 0.0f) {
                                int min = Math.min(Math.max(0, ((Constraints.h(j2) - this.f11046h) / 2) - F0), F02);
                                i3 = p0.a.t0(MathHelpersKt.c(0, min, Math.abs(r1) / Constraints.h(j2)) * f3 * Math.signum(backEventCompat2.f134b - backEventCompat3.f134b));
                            }
                            Placeable.PlacementScope.h(placementScope, this.f11047i, i2, this.f11048j + i3);
                            int i4 = i3 + this.f11050l;
                            Placeable placeable = this.f11049k;
                            Placeable.PlacementScope.h(placementScope, placeable, i2, i4);
                            Placeable placeable2 = this.f11051m;
                            if (placeable2 != null) {
                                Placeable.PlacementScope.h(placementScope, placeable2, i2, i4 + placeable.f15826b + this.f11052n);
                            }
                            return b0.f30125a;
                        }
                    }

                    /* JADX WARN: Removed duplicated region for block: B:25:0x010a  */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x012c  */
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final androidx.compose.ui.layout.MeasureResult mo0measure3p2s80s(androidx.compose.ui.layout.MeasureScope r23, java.util.List r24, long r25) {
                        /*
                            Method dump skipped, instructions count: 379
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBar_androidKt$SearchBarLayout$2$1.mo0measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                    }
                };
                g2.o(measurePolicy);
                u4 = measurePolicy;
            } else {
                i4 = i5;
            }
            MeasurePolicy measurePolicy2 = (MeasurePolicy) u4;
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar4 = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, measurePolicy2, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar5);
            p pVar6 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar6);
            }
            p pVar7 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar7);
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier b2 = LayoutIdKt.b(companion, "Surface");
            BiasAlignment biasAlignment = Alignment.Companion.f14659a;
            MeasurePolicy e2 = BoxKt.e(biasAlignment, true);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, b2);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e2, pVar4);
            Updater.b(g2, Q2, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar6);
            }
            Updater.b(g2, c3, pVar7);
            d.y((i4 >> 21) & 14, pVar2, g2, true);
            Modifier b3 = LayoutIdKt.b(companion, "InputField");
            MeasurePolicy e3 = BoxKt.e(biasAlignment, true);
            int i8 = g2.P;
            PersistentCompositionLocalMap Q3 = g2.Q();
            Modifier c4 = ComposedModifierKt.c(g2, b3);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, e3, pVar4);
            Updater.b(g2, Q3, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i8))) {
                d.x(i8, g2, i8, pVar6);
            }
            Updater.b(g2, c4, pVar7);
            pVar.invoke(g2, Integer.valueOf((i4 >> 18) & 14));
            g2.V(true);
            g2.J(-1107184481);
            if (pVar3 == null) {
                z3 = true;
                z2 = false;
            } else {
                Modifier b4 = LayoutIdKt.b(companion, "Content");
                MeasurePolicy e4 = BoxKt.e(biasAlignment, true);
                int i9 = g2.P;
                PersistentCompositionLocalMap Q4 = g2.Q();
                Modifier c5 = ComposedModifierKt.c(g2, b4);
                if (!(applier instanceof Applier)) {
                    ComposablesKt.a();
                    throw null;
                }
                g2.z();
                if (g2.O) {
                    g2.B(aVar);
                } else {
                    g2.n();
                }
                Updater.b(g2, e4, pVar4);
                Updater.b(g2, Q4, pVar5);
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i9))) {
                    d.x(i9, g2, i9, pVar6);
                }
                Updater.b(g2, c5, pVar7);
                z2 = false;
                z3 = true;
                d.y(0, pVar3, g2, true);
            }
            g2.V(z2);
            g2.V(z3);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SearchBar_androidKt$SearchBarLayout$4(animatable, mutableFloatState, mutableState, mutableState2, modifier, windowInsets, pVar, pVar2, pVar3, i2);
        }
    }
}
