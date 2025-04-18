package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class Event<T> {
    public static <T> Event<T> ofData(int i2, T t2, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, productData, eventContext);
    }

    @Nullable
    public abstract Integer getCode();

    @Nullable
    public abstract EventContext getEventContext();

    public abstract T getPayload();

    public abstract Priority getPriority();

    @Nullable
    public abstract ProductData getProductData();

    public static <T> Event<T> ofData(int i2, T t2, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2, @Nullable ProductData productData) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(int i2, T t2, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2, @Nullable EventContext eventContext) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(int i2, T t2) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(int i2, T t2) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(int i2, T t2) {
        return new AutoValue_Event(Integer.valueOf(i2), t2, Priority.HIGHEST, null, null);
    }

    public static <T> Event<T> ofData(T t2, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, productData, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t2, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, productData, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t2, @Nullable ProductData productData, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, productData, eventContext);
    }

    public static <T> Event<T> ofData(T t2, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, productData, null);
    }

    public static <T> Event<T> ofTelemetry(T t2, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, productData, null);
    }

    public static <T> Event<T> ofUrgent(T t2, @Nullable ProductData productData) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, productData, null);
    }

    public static <T> Event<T> ofData(T t2, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, null, eventContext);
    }

    public static <T> Event<T> ofTelemetry(T t2, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, null, eventContext);
    }

    public static <T> Event<T> ofUrgent(T t2, @Nullable EventContext eventContext) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, null, eventContext);
    }

    public static <T> Event<T> ofData(T t2) {
        return new AutoValue_Event(null, t2, Priority.DEFAULT, null, null);
    }

    public static <T> Event<T> ofTelemetry(T t2) {
        return new AutoValue_Event(null, t2, Priority.VERY_LOW, null, null);
    }

    public static <T> Event<T> ofUrgent(T t2) {
        return new AutoValue_Event(null, t2, Priority.HIGHEST, null, null);
    }
}
