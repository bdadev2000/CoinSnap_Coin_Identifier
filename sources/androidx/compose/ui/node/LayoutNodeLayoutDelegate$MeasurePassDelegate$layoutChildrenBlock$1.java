package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import com.google.android.gms.common.api.Api;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate f16044a;

    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass1 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f16045a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            ((AlignmentLinesOwner) obj).q().d = false;
            return b0.f30125a;
        }
    }

    /* renamed from: androidx.compose.ui.node.LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends r implements l {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass2 f16046a = new r(1);

        @Override // q0.l
        public final Object invoke(Object obj) {
            AlignmentLinesOwner alignmentLinesOwner = (AlignmentLinesOwner) obj;
            alignmentLinesOwner.q().e = alignmentLinesOwner.q().d;
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$layoutChildrenBlock$1(LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.f16044a = measurePassDelegate;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.f16044a;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = LayoutNodeLayoutDelegate.this;
        int i2 = 0;
        layoutNodeLayoutDelegate.f15988k = 0;
        MutableVector E = layoutNodeLayoutDelegate.f15980a.E();
        int i3 = E.f14144c;
        if (i3 > 0) {
            Object[] objArr = E.f14142a;
            int i4 = 0;
            do {
                LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate2 = ((LayoutNode) objArr[i4]).C.f15995r;
                measurePassDelegate2.f16027h = measurePassDelegate2.f16028i;
                measurePassDelegate2.f16028i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                measurePassDelegate2.f16040u = false;
                if (measurePassDelegate2.f16031l == LayoutNode.UsageByParent.f15971b) {
                    measurePassDelegate2.f16031l = LayoutNode.UsageByParent.f15972c;
                }
                i4++;
            } while (i4 < i3);
        }
        measurePassDelegate.F(AnonymousClass1.f16045a);
        measurePassDelegate.O().C0().r();
        LayoutNode layoutNode = LayoutNodeLayoutDelegate.this.f15980a;
        MutableVector E2 = layoutNode.E();
        int i5 = E2.f14144c;
        if (i5 > 0) {
            Object[] objArr2 = E2.f14142a;
            do {
                LayoutNode layoutNode2 = (LayoutNode) objArr2[i2];
                if (layoutNode2.C.f15995r.f16027h != layoutNode2.C()) {
                    layoutNode.S();
                    layoutNode.H();
                    if (layoutNode2.C() == Integer.MAX_VALUE) {
                        layoutNode2.C.f15995r.u0();
                    }
                }
                i2++;
            } while (i2 < i5);
        }
        measurePassDelegate.F(AnonymousClass2.f16046a);
        return b0.f30125a;
    }
}
