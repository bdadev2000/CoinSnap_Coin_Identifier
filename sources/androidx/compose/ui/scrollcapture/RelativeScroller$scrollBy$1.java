package androidx.compose.ui.scrollcapture;

import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.ui.scrollcapture.RelativeScroller", f = "ComposeScrollCaptureCallback.android.kt", l = {306}, m = "scrollBy")
/* loaded from: classes4.dex */
public final class RelativeScroller$scrollBy$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Object f16762a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f16763b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RelativeScroller f16764c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeScroller$scrollBy$1(RelativeScroller relativeScroller, g gVar) {
        super(gVar);
        this.f16764c = relativeScroller;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f16763b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16764c.a(0.0f, this);
    }
}
