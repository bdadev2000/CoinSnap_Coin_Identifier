package androidx.compose.ui.viewinterop;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AndroidViewHolder$runInvalidate$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AndroidViewHolder f17554a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$runInvalidate$1(AndroidViewHolder androidViewHolder) {
        super(0);
        this.f17554a = androidViewHolder;
    }

    @Override // q0.a
    public final Object invoke() {
        this.f17554a.getLayoutNode().H();
        return b0.f30125a;
    }
}
