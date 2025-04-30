package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f15260a;
    private PendingPost b;

    public final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost != null) {
                PendingPost pendingPost2 = this.b;
                if (pendingPost2 != null) {
                    pendingPost2.f15259c = pendingPost;
                    this.b = pendingPost;
                } else if (this.f15260a == null) {
                    this.b = pendingPost;
                    this.f15260a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f15260a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f15259c;
            this.f15260a = pendingPost2;
            if (pendingPost2 == null) {
                this.b = null;
            }
        }
        return pendingPost;
    }

    public final synchronized PendingPost a(int i9) throws InterruptedException {
        try {
            if (this.f15260a == null) {
                wait(i9);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}
