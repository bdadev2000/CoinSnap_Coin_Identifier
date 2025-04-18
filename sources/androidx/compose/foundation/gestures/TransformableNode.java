package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.node.DelegatingNode;
import com.google.android.gms.common.api.Api;
import d1.b;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TransformableNode extends DelegatingNode {

    /* renamed from: q, reason: collision with root package name */
    public TransformableState f3609q = null;

    /* renamed from: r, reason: collision with root package name */
    public l f3610r = null;

    /* renamed from: s, reason: collision with root package name */
    public boolean f3611s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3612t = false;

    /* renamed from: u, reason: collision with root package name */
    public final l f3613u = new TransformableNode$updatedCanPan$1(this);

    /* renamed from: v, reason: collision with root package name */
    public final b f3614v = a.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, 6);
    public final SuspendingPointerInputModifierNode w;

    public TransformableNode() {
        SuspendingPointerInputModifierNodeImpl a2 = SuspendingPointerInputFilterKt.a(new TransformableNode$pointerInputNode$1(this, null));
        e2(a2);
        this.w = a2;
    }
}
