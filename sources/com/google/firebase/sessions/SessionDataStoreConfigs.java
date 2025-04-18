package com.google.firebase.sessions;

import android.util.Base64;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class SessionDataStoreConfigs {

    @NotNull
    public static final SessionDataStoreConfigs INSTANCE = new SessionDataStoreConfigs();
    private static final String PROCESS_NAME;

    @NotNull
    private static final String SESSIONS_CONFIG_NAME;

    @NotNull
    private static final String SETTINGS_CONFIG_NAME;

    static {
        String processName$com_google_firebase_firebase_sessions = ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions();
        p0.a.s(processName$com_google_firebase_firebase_sessions, "<this>");
        byte[] bytes = processName$com_google_firebase_firebase_sessions.getBytes(z0.a.f31458a);
        p0.a.r(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 10);
        PROCESS_NAME = encodeToString;
        SESSIONS_CONFIG_NAME = androidx.compose.foundation.text.input.a.A("firebase_session_", encodeToString, "_data");
        SETTINGS_CONFIG_NAME = androidx.compose.foundation.text.input.a.A("firebase_session_", encodeToString, "_settings");
    }

    private SessionDataStoreConfigs() {
    }

    @NotNull
    public final String getSESSIONS_CONFIG_NAME() {
        return SESSIONS_CONFIG_NAME;
    }

    @NotNull
    public final String getSETTINGS_CONFIG_NAME() {
        return SETTINGS_CONFIG_NAME;
    }
}
