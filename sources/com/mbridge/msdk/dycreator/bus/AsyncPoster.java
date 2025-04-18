package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
class AsyncPoster implements Runnable {
    private final PendingPostQueue a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private final EventBus f12885b;

    public AsyncPoster(EventBus eventBus) {
        this.f12885b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.a.a(PendingPost.a(subscription, obj));
        EventBus.a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a = this.a.a();
        if (a != null) {
            this.f12885b.a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
