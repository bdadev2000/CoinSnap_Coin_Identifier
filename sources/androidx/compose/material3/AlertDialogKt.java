package androidx.compose.material3;

import android.support.v4.media.d;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.DialogProperties;
import b1.f0;
import d0.b0;
import e0.u;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.r;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class AlertDialogKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f7486a = 280;

    /* renamed from: b, reason: collision with root package name */
    public static final float f7487b = 560;

    /* renamed from: c, reason: collision with root package name */
    public static final float f7488c = 8;
    public static final float d = 12;
    public static final PaddingValuesImpl e;

    /* renamed from: f, reason: collision with root package name */
    public static final PaddingValuesImpl f7489f;

    /* renamed from: g, reason: collision with root package name */
    public static final PaddingValuesImpl f7490g;

    /* renamed from: h, reason: collision with root package name */
    public static final PaddingValuesImpl f7491h;

    static {
        float f2 = 24;
        e = new PaddingValuesImpl(f2, f2, f2, f2);
        float f3 = 16;
        f7489f = PaddingKt.b(0.0f, 0.0f, 0.0f, f3, 7);
        f7490g = PaddingKt.b(0.0f, 0.0f, 0.0f, f3, 7);
        f7491h = PaddingKt.b(0.0f, 0.0f, 0.0f, f2, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(q0.p r35, androidx.compose.ui.Modifier r36, q0.p r37, q0.p r38, q0.p r39, androidx.compose.ui.graphics.Shape r40, long r41, float r43, long r44, long r46, long r48, long r50, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.a(q0.p, androidx.compose.ui.Modifier, q0.p, q0.p, q0.p, androidx.compose.ui.graphics.Shape, long, float, long, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void b(final float f2, final float f3, p pVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(586821353);
        if ((i2 & 6) == 0) {
            i3 = (g2.b(f2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.b(f3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(pVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object u2 = g2.u();
            if (z2 || u2 == Composer.Companion.f13690a) {
                u2 = new MeasurePolicy() { // from class: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1

                    /* renamed from: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1$2, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    final class AnonymousClass2 extends r implements l {

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ List f7527a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ MeasureScope f7528b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ float f7529c;
                        public final /* synthetic */ int d;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ List f7530f;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass2(ArrayList arrayList, MeasureScope measureScope, float f2, int i2, ArrayList arrayList2) {
                            super(1);
                            this.f7527a = arrayList;
                            this.f7528b = measureScope;
                            this.f7529c = f2;
                            this.d = i2;
                            this.f7530f = arrayList2;
                        }

                        @Override // q0.l
                        public final Object invoke(Object obj) {
                            MeasureScope measureScope;
                            Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj;
                            int i2 = this.d;
                            List list = this.f7527a;
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                List list2 = (List) list.get(i3);
                                int size2 = list2.size();
                                int[] iArr = new int[size2];
                                int i4 = 0;
                                while (true) {
                                    measureScope = this.f7528b;
                                    if (i4 >= size2) {
                                        break;
                                    }
                                    iArr[i4] = ((Placeable) list2.get(i4)).f15825a + (i4 < f0.p(list2) ? measureScope.F0(this.f7529c) : 0);
                                    i4++;
                                }
                                Arrangement$End$1 arrangement$End$1 = Arrangement.f3773b;
                                int[] iArr2 = new int[size2];
                                for (int i5 = 0; i5 < size2; i5++) {
                                    iArr2[i5] = 0;
                                }
                                arrangement$End$1.c(measureScope, i2, iArr, measureScope.getLayoutDirection(), iArr2);
                                int size3 = list2.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    placementScope.e((Placeable) list2.get(i6), iArr2[i6], ((Number) this.f7530f.get(i3)).intValue(), 0.0f);
                                }
                            }
                            return b0.f30125a;
                        }
                    }

                    public static final void a(ArrayList arrayList, d0 d0Var, MeasureScope measureScope, float f4, ArrayList arrayList2, ArrayList arrayList3, d0 d0Var2, ArrayList arrayList4, d0 d0Var3, d0 d0Var4) {
                        if (!arrayList.isEmpty()) {
                            d0Var.f30925a = measureScope.F0(f4) + d0Var.f30925a;
                        }
                        arrayList.add(0, u.Z0(arrayList2));
                        arrayList3.add(Integer.valueOf(d0Var2.f30925a));
                        arrayList4.add(Integer.valueOf(d0Var.f30925a));
                        d0Var.f30925a += d0Var2.f30925a;
                        d0Var3.f30925a = Math.max(d0Var3.f30925a, d0Var4.f30925a);
                        arrayList2.clear();
                        d0Var4.f30925a = 0;
                        d0Var2.f30925a = 0;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0099  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2 A[SYNTHETIC] */
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final androidx.compose.ui.layout.MeasureResult mo0measure3p2s80s(androidx.compose.ui.layout.MeasureScope r26, java.util.List r27, long r28) {
                        /*
                            Method dump skipped, instructions count: 278
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt$AlertDialogFlowRow$1$1.mo0measure3p2s80s(androidx.compose.ui.layout.MeasureScope, java.util.List, long):androidx.compose.ui.layout.MeasureResult");
                    }
                };
                g2.o(u2);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) u2;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            int i4 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, companion);
            ComposeUiNode.h8.getClass();
            q0.a aVar = ComposeUiNode.Companion.f15895b;
            int i5 = ((((i3 >> 6) & 14) << 6) & 896) | 6;
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
            Updater.b(g2, measurePolicy, ComposeUiNode.Companion.f15898g);
            Updater.b(g2, Q, ComposeUiNode.Companion.f15897f);
            p pVar2 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i4))) {
                d.x(i4, g2, i4, pVar2);
            }
            Updater.b(g2, c2, ComposeUiNode.Companion.d);
            d.y((i5 >> 6) & 14, pVar, g2, true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AlertDialogKt$AlertDialogFlowRow$2(f2, f3, pVar, i2);
        }
    }

    public static final void c(q0.a aVar, p pVar, Modifier modifier, p pVar2, p pVar3, p pVar4, p pVar5, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, Composer composer, int i2, int i3) {
        int i4;
        int i5;
        ComposerImpl g2 = composer.g(-919826268);
        if ((i2 & 6) == 0) {
            i4 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= g2.I(modifier) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= g2.w(pVar2) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= g2.w(pVar3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= g2.w(pVar4) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= g2.w(pVar5) ? 1048576 : Opcodes.ASM8;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= g2.I(shape) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= g2.d(j2) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= g2.d(j3) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (g2.d(j4) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= g2.d(j5) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= g2.b(f2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= g2.I(dialogProperties) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 1171) == 1170 && g2.i()) {
            g2.A();
        } else {
            d(aVar, modifier, dialogProperties, ComposableLambdaKt.c(-1852840226, new AlertDialogKt$AlertDialogImpl$1(pVar3, pVar4, pVar5, shape, j2, f2, j3, j4, j5, pVar2, pVar), g2), g2, ((i4 >> 3) & 112) | (i4 & 14) | 3072 | ((i5 >> 3) & 896), 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AlertDialogKt$AlertDialogImpl$2(aVar, pVar, modifier, pVar2, pVar3, pVar4, pVar5, shape, j2, j3, j4, j5, f2, dialogProperties, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(q0.a r13, androidx.compose.ui.Modifier r14, androidx.compose.ui.window.DialogProperties r15, q0.p r16, androidx.compose.runtime.Composer r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AlertDialogKt.d(q0.a, androidx.compose.ui.Modifier, androidx.compose.ui.window.DialogProperties, q0.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
