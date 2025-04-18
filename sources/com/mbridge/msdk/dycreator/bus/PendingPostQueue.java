package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class PendingPostQueue {
    private PendingPost a;

    /* renamed from: b, reason: collision with root package name */
    private PendingPost f12909b;

    public final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost != null) {
                PendingPost pendingPost2 = this.f12909b;
                if (pendingPost2 != null) {
                    pendingPost2.f12908c = pendingPost;
                    this.f12909b = pendingPost;
                } else if (this.a == null) {
                    this.f12909b = pendingPost;
                    this.a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f12908c;
            this.a = pendingPost2;
            if (pendingPost2 == null) {
                this.f12909b = null;
            }
        }
        return pendingPost;
    }

    public final synchronized PendingPost a(int i10) throws InterruptedException {
        if (this.a == null) {
            wait(i10);
        }
        return a();
    }
}
