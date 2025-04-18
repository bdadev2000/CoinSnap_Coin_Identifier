package androidx.compose.ui;

import androidx.compose.foundation.FocusableInNonTouchMode;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.ObserverNodeOwnerScope;
import b1.a0;
import b1.d0;
import b1.h1;
import b1.k1;
import g1.f;
import java.util.concurrent.CancellationException;
import p0.a;
import q0.l;
import q0.p;

@Stable
/* loaded from: classes2.dex */
public interface Modifier {
    public static final /* synthetic */ int g8 = 0;

    /* loaded from: classes2.dex */
    public static final class Companion implements Modifier {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f14687a = new Object();

        @Override // androidx.compose.ui.Modifier
        public final boolean D(l lVar) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public final Object G(Object obj, p pVar) {
            return obj;
        }

        @Override // androidx.compose.ui.Modifier
        public final Modifier T0(Modifier modifier) {
            return modifier;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    /* loaded from: classes2.dex */
    public interface Element extends Modifier {

        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
        }

        @Override // androidx.compose.ui.Modifier
        default boolean D(l lVar) {
            return ((Boolean) lVar.invoke(this)).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default Object G(Object obj, p pVar) {
            return pVar.invoke(obj, this);
        }
    }

    @StabilityInferred
    /* loaded from: classes2.dex */
    public static abstract class Node implements DelegatableNode {

        /* renamed from: b, reason: collision with root package name */
        public f f14689b;

        /* renamed from: c, reason: collision with root package name */
        public int f14690c;

        /* renamed from: f, reason: collision with root package name */
        public Node f14691f;

        /* renamed from: g, reason: collision with root package name */
        public Node f14692g;

        /* renamed from: h, reason: collision with root package name */
        public ObserverNodeOwnerScope f14693h;

        /* renamed from: i, reason: collision with root package name */
        public NodeCoordinator f14694i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f14695j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f14696k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f14697l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f14698m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f14699n;

        /* renamed from: a, reason: collision with root package name */
        public Node f14688a = this;
        public int d = -1;

        public final d0 S1() {
            f fVar = this.f14689b;
            if (fVar != null) {
                return fVar;
            }
            f c2 = a.c(DelegatableNodeKt.g(this).getCoroutineContext().u(new k1((h1) DelegatableNodeKt.g(this).getCoroutineContext().i(a0.f22285b))));
            this.f14689b = c2;
            return c2;
        }

        public boolean T1() {
            return !(this instanceof FocusableInNonTouchMode);
        }

        public void U1() {
            if (!(!this.f14699n)) {
                InlineClassHelperKt.b("node attached multiple times");
                throw null;
            }
            if (!(this.f14694i != null)) {
                InlineClassHelperKt.b("attach invoked on a node without a coordinator");
                throw null;
            }
            this.f14699n = true;
            this.f14697l = true;
        }

        public void V1() {
            if (!this.f14699n) {
                InlineClassHelperKt.b("Cannot detach a node that is not attached");
                throw null;
            }
            if (!(!this.f14697l)) {
                InlineClassHelperKt.b("Must run runAttachLifecycle() before markAsDetached()");
                throw null;
            }
            if (!(!this.f14698m)) {
                InlineClassHelperKt.b("Must run runDetachLifecycle() before markAsDetached()");
                throw null;
            }
            this.f14699n = false;
            f fVar = this.f14689b;
            if (fVar != null) {
                a.m(fVar, new CancellationException("The Modifier.Node was detached"));
                this.f14689b = null;
            }
        }

        public void W1() {
        }

        public void X1() {
        }

        public void Y1() {
        }

        public void Z1() {
            if (this.f14699n) {
                Y1();
            } else {
                InlineClassHelperKt.b("reset() called on an unattached node");
                throw null;
            }
        }

        public void a2() {
            if (!this.f14699n) {
                InlineClassHelperKt.b("Must run markAsAttached() prior to runAttachLifecycle");
                throw null;
            }
            if (!this.f14697l) {
                InlineClassHelperKt.b("Must run runAttachLifecycle() only once after markAsAttached()");
                throw null;
            }
            this.f14697l = false;
            W1();
            this.f14698m = true;
        }

        public void b2() {
            if (!this.f14699n) {
                InlineClassHelperKt.b("node detached multiple times");
                throw null;
            }
            if (!(this.f14694i != null)) {
                InlineClassHelperKt.b("detach invoked on a node without a coordinator");
                throw null;
            }
            if (!this.f14698m) {
                InlineClassHelperKt.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
                throw null;
            }
            this.f14698m = false;
            X1();
        }

        public void c2(Node node) {
            this.f14688a = node;
        }

        public void d2(NodeCoordinator nodeCoordinator) {
            this.f14694i = nodeCoordinator;
        }

        @Override // androidx.compose.ui.node.DelegatableNode
        public final Node z0() {
            return this.f14688a;
        }
    }

    boolean D(l lVar);

    Object G(Object obj, p pVar);

    default Modifier T0(Modifier modifier) {
        return modifier == Companion.f14687a ? this : new CombinedModifier(this, modifier);
    }
}
