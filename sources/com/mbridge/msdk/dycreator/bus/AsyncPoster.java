package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f15234a = new PendingPostQueue();
    private final EventBus b;

    public AsyncPoster(EventBus eventBus) {
        this.b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f15234a.a(PendingPost.a(subscription, obj));
        EventBus.f15237a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a6 = this.f15234a.a();
        if (a6 != null) {
            this.b.a(a6);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
