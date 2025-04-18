package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes3.dex */
final class BringIntoViewRequestPriorityQueue$enqueue$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequestPriorityQueue f3098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContentInViewNode.Request f3099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewRequestPriorityQueue$enqueue$1(BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue, ContentInViewNode.Request request) {
        super(1);
        this.f3098a = bringIntoViewRequestPriorityQueue;
        this.f3099b = request;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        this.f3098a.f3097a.n(this.f3099b);
        return b0.f30125a;
    }
}
