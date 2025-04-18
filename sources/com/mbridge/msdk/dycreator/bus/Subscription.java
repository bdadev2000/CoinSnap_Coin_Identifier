package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class Subscription {
    final Object a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f12914b;

    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.a = obj;
        this.f12914b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.a != subscription.a || !this.f12914b.equals(subscription.f12914b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12914b.f12912d.hashCode() + this.a.hashCode();
    }
}
