package com.google.android.datatransport;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class AutoValue_Event<T> extends Event<T> {
    private final Integer code;
    private final EventContext eventContext;
    private final T payload;
    private final Priority priority;
    private final ProductData productData;

    public AutoValue_Event(@Nullable Integer num, T t2, Priority priority, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        this.code = num;
        if (t2 == null) {
            throw new NullPointerException("Null payload");
        }
        this.payload = t2;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.priority = priority;
        this.productData = productData;
        this.eventContext = eventContext;
    }

    public boolean equals(Object obj) {
        ProductData productData;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        Integer num = this.code;
        if (num != null ? num.equals(event.getCode()) : event.getCode() == null) {
            if (this.payload.equals(event.getPayload()) && this.priority.equals(event.getPriority()) && ((productData = this.productData) != null ? productData.equals(event.getProductData()) : event.getProductData() == null)) {
                EventContext eventContext = this.eventContext;
                if (eventContext == null) {
                    if (event.getEventContext() == null) {
                        return true;
                    }
                } else if (eventContext.equals(event.getEventContext())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public Integer getCode() {
        return this.code;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public EventContext getEventContext() {
        return this.eventContext;
    }

    @Override // com.google.android.datatransport.Event
    public T getPayload() {
        return this.payload;
    }

    @Override // com.google.android.datatransport.Event
    public Priority getPriority() {
        return this.priority;
    }

    @Override // com.google.android.datatransport.Event
    @Nullable
    public ProductData getProductData() {
        return this.productData;
    }

    public int hashCode() {
        Integer num = this.code;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.payload.hashCode()) * 1000003) ^ this.priority.hashCode()) * 1000003;
        ProductData productData = this.productData;
        int hashCode2 = (hashCode ^ (productData == null ? 0 : productData.hashCode())) * 1000003;
        EventContext eventContext = this.eventContext;
        return hashCode2 ^ (eventContext != null ? eventContext.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.code + ", payload=" + this.payload + ", priority=" + this.priority + ", productData=" + this.productData + ", eventContext=" + this.eventContext + "}";
    }
}
