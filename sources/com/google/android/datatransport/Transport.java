package com.google.android.datatransport;

/* loaded from: classes12.dex */
public interface Transport<T> {
    void schedule(Event<T> event, TransportScheduleCallback transportScheduleCallback);

    void send(Event<T> event);
}
