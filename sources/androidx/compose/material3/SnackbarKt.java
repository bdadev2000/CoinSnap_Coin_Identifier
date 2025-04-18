package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import d0.b0;
import e0.x;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class SnackbarKt {
    public static final float d;

    /* renamed from: g, reason: collision with root package name */
    public static final float f11548g;

    /* renamed from: a, reason: collision with root package name */
    public static final float f11544a = 600;

    /* renamed from: b, reason: collision with root package name */
    public static final float f11545b = 30;

    /* renamed from: c, reason: collision with root package name */
    public static final float f11546c = 16;
    public static final float e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final float f11547f = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final float f11549h = 12;

    static {
        float f2 = 8;
        d = f2;
        f11548g = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r23, q0.p r24, q0.p r25, boolean r26, androidx.compose.ui.graphics.Shape r27, long r28, long r30, long r32, long r34, q0.p r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.a(androidx.compose.ui.Modifier, q0.p, q0.p, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.material3.SnackbarData r44, androidx.compose.ui.Modifier r45, boolean r46, androidx.compose.ui.graphics.Shape r47, long r48, long r50, long r52, long r54, long r56, androidx.compose.runtime.Composer r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.b(androidx.compose.material3.SnackbarData, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-1332496681);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(textStyle) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.d(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.d(j3) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i3) == 74898 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier j4 = PaddingKt.j(SizeKt.d(SizeKt.s(companion, 0.0f, f11544a, 1), 1.0f), f11546c, 0.0f, 0.0f, e, 6);
            ColumnMeasurePolicy a2 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, j4);
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
            Updater.b(g2, a2, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar5);
            p pVar6 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar6);
            }
            p pVar7 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar7);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f3837a;
            Modifier c3 = AlignmentLineKt.c(f11545b, f11549h);
            float f2 = d;
            Modifier j5 = PaddingKt.j(c3, 0.0f, 0.0f, f2, 0.0f, 11);
            BiasAlignment biasAlignment = Alignment.Companion.f14659a;
            MeasurePolicy e2 = BoxKt.e(biasAlignment, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c4 = ComposedModifierKt.c(g2, j5);
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
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar6);
            }
            Updater.b(g2, c4, pVar7);
            d.y(i3 & 14, pVar, g2, true);
            Modifier j6 = PaddingKt.j(columnScopeInstance.a(companion, Alignment.Companion.f14671o), 0.0f, 0.0f, pVar3 == null ? f2 : 0, 0.0f, 11);
            MeasurePolicy e3 = BoxKt.e(biasAlignment, false);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q3 = g2.Q();
            Modifier c5 = ComposedModifierKt.c(g2, j6);
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
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar6);
            }
            Updater.b(g2, c5, pVar7);
            RowMeasurePolicy a3 = RowKt.a(Arrangement.f3772a, Alignment.Companion.f14666j, g2, 0);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q4 = g2.Q();
            Modifier c6 = ComposedModifierKt.c(g2, companion);
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
            Updater.b(g2, a3, pVar4);
            Updater.b(g2, Q4, pVar5);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar6);
            }
            Updater.b(g2, c6, pVar7);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f8654a;
            CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(j2, dynamicProvidableCompositionLocal), TextKt.f12204a.c(textStyle)}, pVar2, g2, (i3 & 112) | 8);
            g2.J(618603253);
            if (pVar3 != null) {
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j3, dynamicProvidableCompositionLocal), pVar3, g2, ((i3 >> 3) & 112) | 8);
            }
            g2.V(false);
            g2.V(true);
            g2.V(true);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SnackbarKt$NewLineButtonSnackbar$2(pVar, pVar2, pVar3, textStyle, j2, j3, i2);
        }
    }

    public static final void d(p pVar, p pVar2, p pVar3, TextStyle textStyle, long j2, long j3, Composer composer, int i2) {
        int i3;
        BiasAlignment biasAlignment;
        boolean z2;
        ComposerImpl g2 = composer.g(-903235475);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(pVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= g2.I(textStyle) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= g2.d(j2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= g2.d(j3) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((74899 & i3) == 74898 && g2.i()) {
            g2.A();
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            Modifier j4 = PaddingKt.j(companion, f11546c, 0.0f, pVar3 == null ? d : 0, 0.0f, 10);
            Object u2 = g2.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ String f11556a = "action";

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ String f11557b = "dismissAction";

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f11558c = "text";

                    /* renamed from: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    final class AnonymousClass2 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11559a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ int f11560b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11561c;
                        public final /* synthetic */ int d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f11562f;

                        /* renamed from: g, reason: collision with root package name */
                        public final /* synthetic */ Placeable f11563g;

                        /* renamed from: h, reason: collision with root package name */
                        public final /* synthetic */ int f11564h;

                        /* renamed from: i, reason: collision with root package name */
                        public final /* synthetic */ int f11565i;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(Placeable placeable, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
                            super(1);
                            this.f11559a = placeable;
                            this.f11560b = i2;
                            this.f11561c = placeable2;
                            this.d = i3;
                            this.f11562f = i4;
                            this.f11563g = placeable3;
                            this.f11564h = i5;
                            this.f11565i = i6;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            Placeable.PlacementScope.h(placementScope, this.f11559a, 0, this.f11560b);
                            Placeable placeable = this.f11561c;
                            if (placeable != null) {
                                Placeable.PlacementScope.h(placementScope, placeable, this.d, this.f11562f);
                            }
                            Placeable placeable2 = this.f11563g;
                            if (placeable2 != null) {
                                Placeable.PlacementScope.h(placementScope, placeable2, this.f11564h, this.f11565i);
                            }
                            return b0.f30125a;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo0measure3p2s80s(MeasureScope measureScope, List list, long j5) {
                        Object obj;
                        Object obj2;
                        int i4;
                        int i5;
                        int i6;
                        int Z;
                        SnackbarKt$OneRowSnackbar$2$1 snackbarKt$OneRowSnackbar$2$1 = this;
                        List list2 = list;
                        int min = Math.min(Constraints.i(j5), measureScope.F0(SnackbarKt.f11544a));
                        int size = list.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                obj = null;
                                break;
                            }
                            obj = list2.get(i7);
                            if (p0.a.g(LayoutIdKt.a((Measurable) obj), snackbarKt$OneRowSnackbar$2$1.f11556a)) {
                                break;
                            }
                            i7++;
                        }
                        Measurable measurable = (Measurable) obj;
                        Placeable V = measurable != null ? measurable.V(j5) : null;
                        int size2 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                obj2 = null;
                                break;
                            }
                            obj2 = list2.get(i8);
                            if (p0.a.g(LayoutIdKt.a((Measurable) obj2), snackbarKt$OneRowSnackbar$2$1.f11557b)) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable2 = (Measurable) obj2;
                        Placeable V2 = measurable2 != null ? measurable2.V(j5) : null;
                        int i9 = V != null ? V.f15825a : 0;
                        int i10 = V != null ? V.f15826b : 0;
                        int i11 = V2 != null ? V2.f15825a : 0;
                        int i12 = V2 != null ? V2.f15826b : 0;
                        int F0 = ((min - i9) - i11) - (i11 == 0 ? measureScope.F0(SnackbarKt.f11548g) : 0);
                        int k2 = Constraints.k(j5);
                        if (F0 >= k2) {
                            k2 = F0;
                        }
                        int size3 = list.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Measurable measurable3 = (Measurable) list2.get(i13);
                            if (p0.a.g(LayoutIdKt.a(measurable3), snackbarKt$OneRowSnackbar$2$1.f11558c)) {
                                int i14 = i12;
                                Placeable V3 = measurable3.V(Constraints.b(j5, 0, k2, 0, 0, 9));
                                HorizontalAlignmentLine horizontalAlignmentLine = androidx.compose.ui.layout.AlignmentLineKt.f15692a;
                                int Z2 = V3.Z(horizontalAlignmentLine);
                                int Z3 = V3.Z(androidx.compose.ui.layout.AlignmentLineKt.f15693b);
                                boolean z3 = true;
                                boolean z4 = (Z2 == Integer.MIN_VALUE || Z3 == Integer.MIN_VALUE) ? false : true;
                                if (Z2 != Z3 && z4) {
                                    z3 = false;
                                }
                                int i15 = min - i11;
                                int i16 = i15 - i9;
                                if (z3) {
                                    i5 = Math.max(measureScope.F0(SnackbarTokens.f13531f), Math.max(i10, i14));
                                    int i17 = (i5 - V3.f15826b) / 2;
                                    i6 = (V == null || (Z = V.Z(horizontalAlignmentLine)) == Integer.MIN_VALUE) ? 0 : (Z2 + i17) - Z;
                                    i4 = i17;
                                } else {
                                    int F02 = measureScope.F0(SnackbarKt.f11545b) - Z2;
                                    int max = Math.max(measureScope.F0(SnackbarTokens.f13532g), V3.f15826b + F02);
                                    i4 = F02;
                                    i5 = max;
                                    i6 = V != null ? (max - V.f15826b) / 2 : 0;
                                }
                                return measureScope.T(min, i5, x.f30219a, new AnonymousClass2(V3, i4, V2, i15, V2 != null ? (i5 - V2.f15826b) / 2 : 0, V, i16, i6));
                            }
                            i13++;
                            snackbarKt$OneRowSnackbar$2$1 = this;
                            list2 = list;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, j4);
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
            Updater.b(g2, measurePolicy, pVar4);
            p pVar5 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar5);
            p pVar6 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar6);
            }
            p pVar7 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar7);
            Modifier h2 = PaddingKt.h(LayoutIdKt.b(companion, "text"), 0.0f, f11547f, 1);
            BiasAlignment biasAlignment2 = Alignment.Companion.f14659a;
            MeasurePolicy e2 = BoxKt.e(biasAlignment2, false);
            int i5 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, h2);
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
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i5))) {
                d.x(i5, g2, i5, pVar6);
            }
            Updater.b(g2, c3, pVar7);
            pVar.invoke(g2, Integer.valueOf(i3 & 14));
            g2.V(true);
            g2.J(-904778058);
            if (pVar2 != null) {
                Modifier b2 = LayoutIdKt.b(companion, "action");
                biasAlignment = biasAlignment2;
                MeasurePolicy e3 = BoxKt.e(biasAlignment, false);
                int i6 = g2.P;
                PersistentCompositionLocalMap Q3 = g2.Q();
                Modifier c4 = ComposedModifierKt.c(g2, b2);
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
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                    d.x(i6, g2, i6, pVar6);
                }
                Updater.b(g2, c4, pVar7);
                CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(j2, ContentColorKt.f8654a), TextKt.f12204a.c(textStyle)}, pVar2, g2, 8 | (i3 & 112));
                g2.V(true);
            } else {
                biasAlignment = biasAlignment2;
            }
            g2.V(false);
            g2.J(-904766579);
            if (pVar3 != null) {
                Modifier b3 = LayoutIdKt.b(companion, "dismissAction");
                MeasurePolicy e4 = BoxKt.e(biasAlignment, false);
                int i7 = g2.P;
                PersistentCompositionLocalMap Q4 = g2.Q();
                Modifier c5 = ComposedModifierKt.c(g2, b3);
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
                if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                    d.x(i7, g2, i7, pVar6);
                }
                Updater.b(g2, c5, pVar7);
                CompositionLocalKt.a(androidx.compose.foundation.text.input.a.d(j3, ContentColorKt.f8654a), pVar3, g2, ((i3 >> 3) & 112) | 8);
                z2 = true;
                g2.V(true);
            } else {
                z2 = true;
            }
            g2.V(false);
            g2.V(z2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SnackbarKt$OneRowSnackbar$3(pVar, pVar2, pVar3, textStyle, j2, j3, i2);
        }
    }
}
