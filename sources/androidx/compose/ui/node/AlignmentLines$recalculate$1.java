package androidx.compose.ui.node;

import androidx.compose.ui.layout.AlignmentLine;
import d0.b0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AlignmentLines$recalculate$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AlignmentLines f15879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLines$recalculate$1(AlignmentLines alignmentLines) {
        super(1);
        this.f15879a = alignmentLines;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AlignmentLines alignmentLines;
        AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
        if (alignmentLinesOwner.J()) {
            if (alignmentLinesOwner.q().f15873b) {
                alignmentLinesOwner.G();
            }
            Iterator it = alignmentLinesOwner.q().f15878i.entrySet().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                alignmentLines = this.f15879a;
                if (!hasNext) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                AlignmentLines.a(alignmentLines, (AlignmentLine) entry.getKey(), ((Number) entry.getValue()).intValue(), alignmentLinesOwner.O());
            }
            NodeCoordinator nodeCoordinator = alignmentLinesOwner.O().f16104q;
            p0.a.p(nodeCoordinator);
            while (!p0.a.g(nodeCoordinator, alignmentLines.f15872a.O())) {
                for (AlignmentLine alignmentLine : alignmentLines.c(nodeCoordinator).keySet()) {
                    AlignmentLines.a(alignmentLines, alignmentLine, alignmentLines.d(nodeCoordinator, alignmentLine), nodeCoordinator);
                }
                nodeCoordinator = nodeCoordinator.f16104q;
                p0.a.p(nodeCoordinator);
            }
        }
        return b0.f30125a;
    }
}
