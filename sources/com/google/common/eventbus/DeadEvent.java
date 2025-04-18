package com.google.common.eventbus;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.safedk.android.analytics.events.MaxEvent;

@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public class DeadEvent {
    private final Object event;
    private final Object source;

    public DeadEvent(Object obj, Object obj2) {
        this.source = Preconditions.checkNotNull(obj);
        this.event = Preconditions.checkNotNull(obj2);
    }

    public Object getEvent() {
        return this.event;
    }

    public Object getSource() {
        return this.source;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("source", this.source).add(MaxEvent.f29810a, this.event).toString();
    }
}
