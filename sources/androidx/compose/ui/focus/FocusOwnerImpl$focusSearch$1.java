package androidx.compose.ui.focus;

import kotlin.jvm.internal.r;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class FocusOwnerImpl$focusSearch$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FocusTargetNode f14850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusOwnerImpl f14851b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f14852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOwnerImpl$focusSearch$1(FocusTargetNode focusTargetNode, FocusOwnerImpl focusOwnerImpl, l lVar) {
        super(1);
        this.f14850a = focusTargetNode;
        this.f14851b = focusOwnerImpl;
        this.f14852c = lVar;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean booleanValue;
        FocusTargetNode focusTargetNode = (FocusTargetNode) obj;
        if (a.g(focusTargetNode, this.f14850a)) {
            booleanValue = false;
        } else {
            if (a.g(focusTargetNode, this.f14851b.f14844f)) {
                throw new IllegalStateException("Focus search landed at the root.".toString());
            }
            booleanValue = ((Boolean) this.f14852c.invoke(focusTargetNode)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
