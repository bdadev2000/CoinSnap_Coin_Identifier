package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import com.google.android.gms.common.api.Api;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate.LookaheadPassDelegate f16017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LookaheadDelegate f16018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f16019c;

    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f16020a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((AlignmentLinesOwner) obj).q().d = false;
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass4 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass4 f16021a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
            alignmentLinesOwner.q().e = alignmentLinesOwner.q().d;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$LookaheadPassDelegate$layoutChildren$1(LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate, LookaheadDelegate lookaheadDelegate, LayoutNodeLayoutDelegate layoutNodeLayoutDelegate) {
        super(0);
        this.f16017a = lookaheadPassDelegate;
        this.f16018b = lookaheadDelegate;
        this.f16019c = layoutNodeLayoutDelegate;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate = this.f16017a;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        int i2 = 0;
        layoutNodeLayoutDelegate.f15987j = 0;
        MutableVector E = layoutNodeLayoutDelegate.f15980a.E();
        int i3 = E.f14144c;
        if (i3 > 0) {
            Object[] objArr = E.f14142a;
            int i4 = 0;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate2 = ((LayoutNode) objArr[i4]).C.f15996s;
                p0.a.p(lookaheadPassDelegate2);
                lookaheadPassDelegate2.f16000h = lookaheadPassDelegate2.f16001i;
                lookaheadPassDelegate2.f16001i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (lookaheadPassDelegate2.f16002j == LayoutNode.UsageByParent.f15971b) {
                    lookaheadPassDelegate2.f16002j = LayoutNode.UsageByParent.f15972c;
                }
                i4++;
            } while (i4 < i3);
        }
        lookaheadPassDelegate.F(AnonymousClass1.f16020a);
        LookaheadDelegate lookaheadDelegate = lookaheadPassDelegate.O().O;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = this.f16019c;
        if (lookaheadDelegate != null) {
            boolean z2 = lookaheadDelegate.f16055i;
            List v2 = layoutNodeLayoutDelegate2.f15980a.v();
            int size = v2.size();
            for (int i5 = 0; i5 < size; i5++) {
                LookaheadDelegate h12 = ((LayoutNode) v2.get(i5)).B.f16090c.h1();
                if (h12 != null) {
                    h12.f16055i = z2;
                }
            }
        }
        this.f16018b.C0().r();
        if (lookaheadPassDelegate.O().O != null) {
            List v3 = layoutNodeLayoutDelegate2.f15980a.v();
            int size2 = v3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                LookaheadDelegate h13 = ((LayoutNode) v3.get(i6)).B.f16090c.h1();
                if (h13 != null) {
                    h13.f16055i = false;
                }
            }
        }
        MutableVector E2 = LayoutNodeLayoutDelegate.this.f15980a.E();
        int i7 = E2.f14144c;
        if (i7 > 0) {
            Object[] objArr2 = E2.f14142a;
            do {
                LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate3 = ((LayoutNode) objArr2[i2]).C.f15996s;
                p0.a.p(lookaheadPassDelegate3);
                int i8 = lookaheadPassDelegate3.f16000h;
                int i9 = lookaheadPassDelegate3.f16001i;
                if (i8 != i9 && i9 == Integer.MAX_VALUE) {
                    lookaheadPassDelegate3.s0();
                }
                i2++;
            } while (i2 < i7);
        }
        lookaheadPassDelegate.F(AnonymousClass4.f16021a);
        return b0.f30125a;
    }
}
