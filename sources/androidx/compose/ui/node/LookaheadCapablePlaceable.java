package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import java.util.Map;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {

    /* renamed from: g, reason: collision with root package name */
    public boolean f16053g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16054h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16055i;

    /* renamed from: j, reason: collision with root package name */
    public final Placeable.PlacementScope f16056j = PlaceableKt.a(this);

    /* renamed from: k, reason: collision with root package name */
    public MutableObjectFloatMap f16057k;

    /* renamed from: l, reason: collision with root package name */
    public MutableObjectFloatMap f16058l;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public static void K0(NodeCoordinator nodeCoordinator) {
        LayoutNodeAlignmentLines layoutNodeAlignmentLines;
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f16103p;
        LayoutNode layoutNode = nodeCoordinator2 != null ? nodeCoordinator2.f16100m : null;
        LayoutNode layoutNode2 = nodeCoordinator.f16100m;
        if (!p0.a.g(layoutNode, layoutNode2)) {
            layoutNode2.C.f15995r.f16041v.g();
            return;
        }
        AlignmentLinesOwner A = layoutNode2.C.f15995r.A();
        if (A == null || (layoutNodeAlignmentLines = ((LayoutNodeLayoutDelegate.MeasurePassDelegate) A).f16041v) == null) {
            return;
        }
        layoutNodeAlignmentLines.g();
    }

    public abstract MeasureResult C0();

    public abstract LookaheadCapablePlaceable D0();

    public abstract long E0();

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    public abstract LayoutNode H1();

    public abstract void L0();

    @Override // androidx.compose.ui.layout.Measured
    public final int Z(AlignmentLine alignmentLine) {
        int q02;
        if (z0() && (q02 = q0(alignmentLine)) != Integer.MIN_VALUE) {
            return q02 + ((int) (alignmentLine instanceof VerticalAlignmentLine ? this.f15828f >> 32 : this.f15828f & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public final void d0(boolean z2) {
        this.f16053g = z2;
    }

    public abstract int q0(AlignmentLine alignmentLine);

    @Override // androidx.compose.ui.layout.MeasureScope
    public final MeasureResult r0(final int i2, final int i3, final Map map, final l lVar) {
        if ((i2 & (-16777216)) == 0 && ((-16777216) & i3) == 0) {
            return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
                public final /* synthetic */ l d = null;

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getHeight() {
                    return i3;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final int getWidth() {
                    return i2;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final Map q() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final void r() {
                    lVar.invoke(this.f16056j);
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public final l s() {
                    return this.d;
                }
            };
        }
        InlineClassHelperKt.b("Size(" + i2 + " x " + i3 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c2, code lost:
    
        r13 = r3[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c4, code lost:
    
        if (r13 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02c6, code lost:
    
        r14 = r13.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02cc, code lost:
    
        r14 = r14 * (-862048943);
        r14 = r14 ^ (r14 << 16);
        r15 = r1.c(r14 >>> 7);
        r16 = r11;
        r10 = r14 & 127;
        r14 = r15 >> 3;
        r24 = (r15 & 7) << 3;
        r37 = r2;
        r39 = r3;
        r2 = (r0[r14] & (~(255 << r24))) | (r10 << r24);
        r0[r14] = r2;
        r0[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r6[r15] = r13;
        r7[r15] = r4[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x030c, code lost:
    
        r12 = r12 + 1;
        r11 = r16;
        r2 = r37;
        r3 = r39;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02cb, code lost:
    
        r14 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0306, code lost:
    
        r37 = r2;
        r39 = r3;
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0121, code lost:
    
        r47 = r0;
        r1 = r2;
        r34 = r3;
        r42 = r9;
        r41 = r10;
        r16 = r11;
        r49 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f4, code lost:
    
        r36 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0102, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        r4 = r2.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010a, code lost:
    
        if (r2.f1479f != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
    
        if (((r2.f1542a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0130, code lost:
    
        r4 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0134, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0146, code lost:
    
        if (java.lang.Long.compareUnsigned(r2.e * 32, r4 * 25) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0148, code lost:
    
        r4 = r2.f1542a;
        r6 = r2.d;
        r7 = r2.f1543b;
        r14 = r2.f1544c;
        androidx.collection.ScatterMapKt.a(r4, r6);
        r34 = r3;
        r3 = -1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (r5 == r6) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        r35 = r5 >> 3;
        r39 = (r5 & 7) << 3;
        r36 = (r4[r35] >> r39) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016b, code lost:
    
        if (r36 != 128) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        if (r36 == 254) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        r36 = r7[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0180, code lost:
    
        if (r36 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0182, code lost:
    
        r36 = r36.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0189, code lost:
    
        r36 = r36 * (-862048943);
        r15 = (r36 ^ (r36 << 16)) >>> 7;
        r40 = r2.c(r15);
        r15 = r15 & r6;
        r42 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01ac, code lost:
    
        if ((((r40 - r15) & r6) / 8) != (((r5 - r15) & r6) / 8)) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d9, code lost:
    
        r41 = r10;
        r49 = r12;
        r9 = r40 >> 3;
        r12 = r4[r9];
        r10 = (r40 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01ef, code lost:
    
        if (((r12 >> r10) & 255) != 128) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f1, code lost:
    
        r47 = r0;
        r51 = r2;
        r4[r9] = ((r36 & 127) << r10) | ((~(255 << r10)) & r12);
        r4[r35] = (r4[r35] & (~(255 << r39))) | (128 << r39);
        r7[r40] = r7[r5];
        r7[r5] = null;
        r14[r40] = r14[r5];
        r14[r5] = 0.0f;
        r3 = r5;
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0254, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r14 = r2;
        r10 = r41;
        r9 = r42;
        r0 = r47;
        r12 = r49;
        r2 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x021f, code lost:
    
        r47 = r0;
        r51 = r2;
        r2 = r14;
        r4[r9] = ((r36 & 127) << r10) | (r12 & (~(255 << r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0232, code lost:
    
        if (r3 != (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0234, code lost:
    
        r3 = androidx.collection.ScatterMapKt.b(r4, r5 + 1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x023a, code lost:
    
        r7[r3] = r7[r40];
        r7[r40] = r7[r5];
        r7[r5] = r7[r3];
        r2[r3] = r2[r40];
        r2[r40] = r2[r5];
        r2[r5] = r2[r3];
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ae, code lost:
    
        r4[r35] = ((r36 & 127) << r39) | (r4[r35] & (~(255 << r39)));
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r5 = r5 + 1;
        r10 = r10;
        r9 = r42;
        r12 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0187, code lost:
    
        r36 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016d, code lost:
    
        r52 = r5;
        r5 = r5 + 1;
        r3 = r52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x026f, code lost:
    
        r47 = r0;
        r1 = r2;
        r42 = r9;
        r41 = r10;
        r49 = r12;
        r1.f1479f = androidx.collection.ScatterMapKt.c(r1.d) - r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0284, code lost:
    
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0316, code lost:
    
        r4 = r1.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x031a, code lost:
    
        r1.e++;
        r0 = r1.f1479f;
        r2 = r1.f1542a;
        r3 = r4 >> 3;
        r5 = r2[r3];
        r7 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0335, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0338, code lost:
    
        r32 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x033a, code lost:
    
        r1.f1479f = r0 - r32;
        r0 = r1.d;
        r5 = (r5 & (~(255 << r7))) | (r47 << r7);
        r2[r3] = r5;
        r2[(((r4 - 7) & r0) + (r0 & 7)) >> 3] = r5;
        r0 = ~r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0288, code lost:
    
        r47 = r0;
        r1 = r2;
        r34 = r3;
        r42 = r9;
        r41 = r10;
        r49 = r12;
        r10 = 0;
        r0 = androidx.collection.ScatterMapKt.e(r1.d);
        r2 = r1.f1542a;
        r3 = r1.f1543b;
        r4 = r1.f1544c;
        r5 = r1.d;
        r1.d(r0);
        r0 = r1.f1542a;
        r6 = r1.f1543b;
        r7 = r1.f1544c;
        r9 = r1.d;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02ae, code lost:
    
        if (r12 >= r5) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02c0, code lost:
    
        if (((r2[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s0(androidx.compose.ui.node.PlaceableResult r54) {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable.s0(androidx.compose.ui.node.PlaceableResult):void");
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean t0() {
        return false;
    }

    public abstract LookaheadCapablePlaceable u0();

    public abstract LayoutCoordinates x0();

    public abstract boolean z0();
}
