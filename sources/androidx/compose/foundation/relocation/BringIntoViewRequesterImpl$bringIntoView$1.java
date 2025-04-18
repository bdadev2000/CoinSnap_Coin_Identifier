package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import h0.g;
import j0.c;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {116}, m = "bringIntoView")
/* loaded from: classes3.dex */
public final class BringIntoViewRequesterImpl$bringIntoView$1 extends c {

    /* renamed from: a, reason: collision with root package name */
    public Rect f5326a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5327b;

    /* renamed from: c, reason: collision with root package name */
    public int f5328c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f5329f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequesterImpl f5330g;

    /* renamed from: h, reason: collision with root package name */
    public int f5331h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequesterImpl$bringIntoView$1(BringIntoViewRequesterImpl bringIntoViewRequesterImpl, g gVar) {
        super(gVar);
        this.f5330g = bringIntoViewRequesterImpl;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f5329f = obj;
        this.f5331h |= Integer.MIN_VALUE;
        return this.f5330g.a(null, this);
    }
}
