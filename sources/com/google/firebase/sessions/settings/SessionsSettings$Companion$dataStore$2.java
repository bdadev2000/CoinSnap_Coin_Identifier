package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.sessions.ProcessDetailsProvider;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class SessionsSettings$Companion$dataStore$2 extends r implements l {
    public static final SessionsSettings$Companion$dataStore$2 INSTANCE = new SessionsSettings$Companion$dataStore$2();

    public SessionsSettings$Companion$dataStore$2() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Preferences invoke(@NotNull CorruptionException corruptionException) {
        a.s(corruptionException, "ex");
        Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', corruptionException);
        return new MutablePreferences(true);
    }
}
