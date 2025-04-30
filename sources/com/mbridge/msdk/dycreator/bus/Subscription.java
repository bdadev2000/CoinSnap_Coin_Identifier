package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes3.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f15265a;
    final SubscriberMethod b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f15265a = obj;
        this.b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f15265a != subscription.f15265a || !this.b.equals(subscription.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.f15263d.hashCode() + this.f15265a.hashCode();
    }
}
