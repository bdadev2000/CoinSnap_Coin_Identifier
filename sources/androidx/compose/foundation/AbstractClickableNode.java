package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusStateImpl;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.key.Key_androidKt;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.IntSizeKt;
import h0.g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.e;
import q0.a;
import x0.n;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class AbstractClickableNode extends DelegatingNode implements PointerInputModifierNode, KeyInputModifierNode, FocusEventModifierNode, SemanticsModifierNode, TraversableNode {
    public static final TraverseKey H = new Object();
    public PressInteraction.Press A;
    public HoverInteraction.Enter B;
    public MutableInteractionSource E;
    public boolean F;
    public final TraverseKey G;

    /* renamed from: q, reason: collision with root package name */
    public MutableInteractionSource f2407q;

    /* renamed from: r, reason: collision with root package name */
    public IndicationNodeFactory f2408r;

    /* renamed from: s, reason: collision with root package name */
    public String f2409s;

    /* renamed from: t, reason: collision with root package name */
    public Role f2410t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2411u;

    /* renamed from: v, reason: collision with root package name */
    public a f2412v;
    public final FocusableNode x;

    /* renamed from: y, reason: collision with root package name */
    public SuspendingPointerInputModifierNode f2413y;

    /* renamed from: z, reason: collision with root package name */
    public DelegatableNode f2414z;
    public final FocusableInNonTouchMode w = new Modifier.Node();
    public final LinkedHashMap C = new LinkedHashMap();
    public long D = 0;

    /* loaded from: classes3.dex */
    public static final class TraverseKey {
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.foundation.FocusableInNonTouchMode, androidx.compose.ui.Modifier$Node] */
    public AbstractClickableNode(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, String str, Role role, a aVar) {
        this.f2407q = mutableInteractionSource;
        this.f2408r = indicationNodeFactory;
        this.f2409s = str;
        this.f2410t = role;
        this.f2411u = z2;
        this.f2412v = aVar;
        this.x = new FocusableNode(mutableInteractionSource);
        MutableInteractionSource mutableInteractionSource2 = this.f2407q;
        this.E = mutableInteractionSource2;
        this.F = mutableInteractionSource2 == null && this.f2408r != null;
        this.G = H;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void B(SemanticsConfiguration semanticsConfiguration) {
        Role role = this.f2410t;
        if (role != null) {
            SemanticsPropertiesKt.r(semanticsConfiguration, role.f16789a);
        }
        String str = this.f2409s;
        AbstractClickableNode$applySemantics$1 abstractClickableNode$applySemantics$1 = new AbstractClickableNode$applySemantics$1(this);
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        semanticsConfiguration.b(SemanticsActions.f16794b, new AccessibilityAction(str, abstractClickableNode$applySemantics$1));
        if (this.f2411u) {
            this.x.B(semanticsConfiguration);
        } else {
            SemanticsPropertiesKt.e(semanticsConfiguration);
        }
        h2(semanticsConfiguration);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final boolean N1() {
        return true;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean P0(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.ui.node.TraversableNode
    public final Object Q() {
        return this.G;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        if (!this.F) {
            k2();
        }
        if (this.f2411u) {
            e2(this.w);
            e2(this.x);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        j2();
        if (this.E == null) {
            this.f2407q = null;
        }
        DelegatableNode delegatableNode = this.f2414z;
        if (delegatableNode != null) {
            f2(delegatableNode);
        }
        this.f2414z = null;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        long b2 = IntSizeKt.b(j2);
        this.D = OffsetKt.a((int) (b2 >> 32), (int) (b2 & 4294967295L));
        k2();
        if (this.f2411u && pointerEventPass == PointerEventPass.f15573b) {
            int i2 = pointerEvent.d;
            if (PointerEventType.a(i2, 4)) {
                e.v(S1(), null, 0, new AbstractClickableNode$onPointerEvent$1(this, null), 3);
            } else if (PointerEventType.a(i2, 5)) {
                e.v(S1(), null, 0, new AbstractClickableNode$onPointerEvent$2(this, null), 3);
            }
        }
        if (this.f2413y == null) {
            SuspendingPointerInputModifierNodeImpl a2 = SuspendingPointerInputFilterKt.a(new AbstractClickableNode$onPointerEvent$3(this, null));
            e2(a2);
            this.f2413y = a2;
        }
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.f2413y;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.e0(pointerEvent, pointerEventPass, j2);
        }
    }

    public void h2(SemanticsConfiguration semanticsConfiguration) {
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean i1(KeyEvent keyEvent) {
        k2();
        boolean z2 = this.f2411u;
        LinkedHashMap linkedHashMap = this.C;
        if (z2) {
            int i2 = Clickable_androidKt.f2656b;
            if (KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 2) && Clickable_androidKt.a(keyEvent)) {
                if (linkedHashMap.containsKey(new Key(Key_androidKt.a(keyEvent.getKeyCode())))) {
                    return false;
                }
                PressInteraction.Press press = new PressInteraction.Press(this.D);
                linkedHashMap.put(new Key(Key_androidKt.a(keyEvent.getKeyCode())), press);
                if (this.f2407q != null) {
                    e.v(S1(), null, 0, new AbstractClickableNode$onKeyEvent$1(this, press, null), 3);
                }
                return true;
            }
        }
        if (!this.f2411u) {
            return false;
        }
        int i3 = Clickable_androidKt.f2656b;
        if (!KeyEventType.a(KeyEvent_androidKt.a(keyEvent), 1) || !Clickable_androidKt.a(keyEvent)) {
            return false;
        }
        PressInteraction.Press press2 = (PressInteraction.Press) linkedHashMap.remove(new Key(Key_androidKt.a(keyEvent.getKeyCode())));
        if (press2 != null && this.f2407q != null) {
            e.v(S1(), null, 0, new AbstractClickableNode$onKeyEvent$2$1(this, press2, null), 3);
        }
        this.f2412v.invoke();
        return true;
    }

    public abstract Object i2(PointerInputScope pointerInputScope, g gVar);

    public final void j2() {
        MutableInteractionSource mutableInteractionSource = this.f2407q;
        LinkedHashMap linkedHashMap = this.C;
        if (mutableInteractionSource != null) {
            PressInteraction.Press press = this.A;
            if (press != null) {
                mutableInteractionSource.b(new PressInteraction.Cancel(press));
            }
            HoverInteraction.Enter enter = this.B;
            if (enter != null) {
                mutableInteractionSource.b(new HoverInteraction.Exit(enter));
            }
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                mutableInteractionSource.b(new PressInteraction.Cancel((PressInteraction.Press) it.next()));
            }
        }
        this.A = null;
        this.B = null;
        linkedHashMap.clear();
    }

    public final void k2() {
        IndicationNodeFactory indicationNodeFactory;
        if (this.f2414z == null && (indicationNodeFactory = this.f2408r) != null) {
            if (this.f2407q == null) {
                this.f2407q = InteractionSourceKt.a();
            }
            this.x.h2(this.f2407q);
            MutableInteractionSource mutableInteractionSource = this.f2407q;
            p0.a.p(mutableInteractionSource);
            DelegatableNode b2 = indicationNodeFactory.b(mutableInteractionSource);
            e2(b2);
            this.f2414z = b2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
    
        if (r3.f2414z == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        r4 = r3.f2414z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if (r3.F != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        r0.h2(r3.f2407q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r4 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        f2(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        r3.f2414z = null;
        k2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        if (r4 != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l2(androidx.compose.foundation.interaction.MutableInteractionSource r4, androidx.compose.foundation.IndicationNodeFactory r5, boolean r6, java.lang.String r7, androidx.compose.ui.semantics.Role r8, q0.a r9) {
        /*
            r3 = this;
            androidx.compose.foundation.interaction.MutableInteractionSource r0 = r3.E
            boolean r0 = p0.a.g(r0, r4)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L13
            r3.j2()
            r3.E = r4
            r3.f2407q = r4
            r4 = r2
            goto L14
        L13:
            r4 = r1
        L14:
            androidx.compose.foundation.IndicationNodeFactory r0 = r3.f2408r
            boolean r0 = p0.a.g(r0, r5)
            if (r0 != 0) goto L1f
            r3.f2408r = r5
            r4 = r2
        L1f:
            boolean r5 = r3.f2411u
            androidx.compose.foundation.FocusableNode r0 = r3.x
            if (r5 == r6) goto L42
            androidx.compose.foundation.FocusableInNonTouchMode r5 = r3.w
            if (r6 == 0) goto L30
            r3.e2(r5)
            r3.e2(r0)
            goto L39
        L30:
            r3.f2(r5)
            r3.f2(r0)
            r3.j2()
        L39:
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.f(r3)
            r5.K()
            r3.f2411u = r6
        L42:
            java.lang.String r5 = r3.f2409s
            boolean r5 = p0.a.g(r5, r7)
            if (r5 != 0) goto L53
            r3.f2409s = r7
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.f(r3)
            r5.K()
        L53:
            androidx.compose.ui.semantics.Role r5 = r3.f2410t
            boolean r5 = p0.a.g(r5, r8)
            if (r5 != 0) goto L64
            r3.f2410t = r8
            androidx.compose.ui.node.LayoutNode r5 = androidx.compose.ui.node.DelegatableNodeKt.f(r3)
            r5.K()
        L64:
            r3.f2412v = r9
            boolean r5 = r3.F
            androidx.compose.foundation.interaction.MutableInteractionSource r6 = r3.E
            if (r6 != 0) goto L72
            androidx.compose.foundation.IndicationNodeFactory r7 = r3.f2408r
            if (r7 == 0) goto L72
            r7 = r2
            goto L73
        L72:
            r7 = r1
        L73:
            if (r5 == r7) goto L85
            if (r6 != 0) goto L7c
            androidx.compose.foundation.IndicationNodeFactory r5 = r3.f2408r
            if (r5 == 0) goto L7c
            r1 = r2
        L7c:
            r3.F = r1
            if (r1 != 0) goto L85
            androidx.compose.ui.node.DelegatableNode r5 = r3.f2414z
            if (r5 != 0) goto L85
            goto L87
        L85:
            if (r4 == 0) goto L9a
        L87:
            androidx.compose.ui.node.DelegatableNode r4 = r3.f2414z
            if (r4 != 0) goto L8f
            boolean r5 = r3.F
            if (r5 != 0) goto L9a
        L8f:
            if (r4 == 0) goto L94
            r3.f2(r4)
        L94:
            r4 = 0
            r3.f2414z = r4
            r3.k2()
        L9a:
            androidx.compose.foundation.interaction.MutableInteractionSource r4 = r3.f2407q
            r0.h2(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode.l2(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.foundation.IndicationNodeFactory, boolean, java.lang.String, androidx.compose.ui.semantics.Role, q0.a):void");
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final void m1() {
        HoverInteraction.Enter enter;
        MutableInteractionSource mutableInteractionSource = this.f2407q;
        if (mutableInteractionSource != null && (enter = this.B) != null) {
            mutableInteractionSource.b(new HoverInteraction.Exit(enter));
        }
        this.B = null;
        SuspendingPointerInputModifierNode suspendingPointerInputModifierNode = this.f2413y;
        if (suspendingPointerInputModifierNode != null) {
            suspendingPointerInputModifierNode.m1();
        }
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        if (focusStateImpl.a()) {
            k2();
        }
        if (this.f2411u) {
            this.x.v(focusStateImpl);
        }
    }
}
