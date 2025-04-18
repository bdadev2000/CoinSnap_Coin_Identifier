package com.google.firebase.sessions;

import android.util.Log;
import androidx.fragment.app.j;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {

    @NotNull
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "EventGDTLogger";

    @NotNull
    private final Provider<TransportFactory> transportFactoryProvider;

    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }
    }

    public EventGDTLogger(@NotNull Provider<TransportFactory> provider) {
        p0.a.s(provider, "transportFactoryProvider");
        this.transportFactoryProvider = provider;
    }

    public static /* synthetic */ byte[] a(EventGDTLogger eventGDTLogger, SessionEvent sessionEvent) {
        return eventGDTLogger.encode(sessionEvent);
    }

    public final byte[] encode(SessionEvent sessionEvent) {
        String encode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(sessionEvent);
        p0.a.r(encode, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d(TAG, "Session Event: ".concat(encode));
        byte[] bytes = encode.getBytes(z0.a.f31458a);
        p0.a.r(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(@NotNull SessionEvent sessionEvent) {
        p0.a.s(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().getTransport(AQS_LOG_SOURCE, SessionEvent.class, Encoding.of("json"), new j(this, 23)).send(Event.ofData(sessionEvent));
    }
}
