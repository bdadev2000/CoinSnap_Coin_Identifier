package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import e0.e0;
import java.util.HashMap;
import java.util.Map;

@StabilityInferred
/* loaded from: classes4.dex */
public abstract class AlignmentLines {

    /* renamed from: a, reason: collision with root package name */
    public final AlignmentLinesOwner f15872a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15874c;
    public boolean d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15875f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15876g;

    /* renamed from: h, reason: collision with root package name */
    public AlignmentLinesOwner f15877h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f15873b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f15878i = new HashMap();

    public AlignmentLines(AlignmentLinesOwner alignmentLinesOwner) {
        this.f15872a = alignmentLinesOwner;
    }

    public static final void a(AlignmentLines alignmentLines, AlignmentLine alignmentLine, int i2, NodeCoordinator nodeCoordinator) {
        alignmentLines.getClass();
        float f2 = i2;
        long a2 = OffsetKt.a(f2, f2);
        while (true) {
            a2 = alignmentLines.b(nodeCoordinator, a2);
            nodeCoordinator = nodeCoordinator.f16104q;
            p0.a.p(nodeCoordinator);
            if (p0.a.g(nodeCoordinator, alignmentLines.f15872a.O())) {
                break;
            } else if (alignmentLines.c(nodeCoordinator).containsKey(alignmentLine)) {
                float d = alignmentLines.d(nodeCoordinator, alignmentLine);
                a2 = OffsetKt.a(d, d);
            }
        }
        int round = Math.round(alignmentLine instanceof HorizontalAlignmentLine ? Offset.h(a2) : Offset.g(a2));
        HashMap hashMap = alignmentLines.f15878i;
        if (hashMap.containsKey(alignmentLine)) {
            int intValue = ((Number) e0.r(alignmentLine, hashMap)).intValue();
            HorizontalAlignmentLine horizontalAlignmentLine = AlignmentLineKt.f15692a;
            round = ((Number) alignmentLine.f15691a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
        }
        hashMap.put(alignmentLine, Integer.valueOf(round));
    }

    public abstract long b(NodeCoordinator nodeCoordinator, long j2);

    public abstract Map c(NodeCoordinator nodeCoordinator);

    public abstract int d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine);

    public final boolean e() {
        return this.f15874c || this.e || this.f15875f || this.f15876g;
    }

    public final boolean f() {
        i();
        return this.f15877h != null;
    }

    public final void g() {
        this.f15873b = true;
        AlignmentLinesOwner alignmentLinesOwner = this.f15872a;
        AlignmentLinesOwner A = alignmentLinesOwner.A();
        if (A == null) {
            return;
        }
        if (this.f15874c) {
            A.f0();
        } else if (this.e || this.d) {
            A.requestLayout();
        }
        if (this.f15875f) {
            alignmentLinesOwner.f0();
        }
        if (this.f15876g) {
            alignmentLinesOwner.requestLayout();
        }
        A.q().g();
    }

    public final void h() {
        HashMap hashMap = this.f15878i;
        hashMap.clear();
        AlignmentLines$recalculate$1 alignmentLines$recalculate$1 = new AlignmentLines$recalculate$1(this);
        AlignmentLinesOwner alignmentLinesOwner = this.f15872a;
        alignmentLinesOwner.F(alignmentLines$recalculate$1);
        hashMap.putAll(c(alignmentLinesOwner.O()));
        this.f15873b = false;
    }

    public final void i() {
        AlignmentLines q2;
        AlignmentLines q3;
        boolean e = e();
        AlignmentLinesOwner alignmentLinesOwner = this.f15872a;
        if (!e) {
            AlignmentLinesOwner A = alignmentLinesOwner.A();
            if (A == null) {
                return;
            }
            alignmentLinesOwner = A.q().f15877h;
            if (alignmentLinesOwner == null || !alignmentLinesOwner.q().e()) {
                AlignmentLinesOwner alignmentLinesOwner2 = this.f15877h;
                if (alignmentLinesOwner2 == null || alignmentLinesOwner2.q().e()) {
                    return;
                }
                AlignmentLinesOwner A2 = alignmentLinesOwner2.A();
                if (A2 != null && (q3 = A2.q()) != null) {
                    q3.i();
                }
                AlignmentLinesOwner A3 = alignmentLinesOwner2.A();
                alignmentLinesOwner = (A3 == null || (q2 = A3.q()) == null) ? null : q2.f15877h;
            }
        }
        this.f15877h = alignmentLinesOwner;
    }
}
