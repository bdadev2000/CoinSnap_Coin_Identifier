package androidx.compose.foundation.relocation;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import p0.a;

@StabilityInferred
@ExperimentalFoundationApi
/* loaded from: classes2.dex */
public final class BringIntoViewRequesterNode extends Modifier.Node {

    /* renamed from: o, reason: collision with root package name */
    public BringIntoViewRequester f5332o;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        BringIntoViewRequester bringIntoViewRequester = this.f5332o;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            a.q(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).f5325a.n(this);
        }
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).f5325a.b(this);
        }
        this.f5332o = bringIntoViewRequester;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        BringIntoViewRequester bringIntoViewRequester = this.f5332o;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            a.q(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).f5325a.n(this);
        }
    }
}
