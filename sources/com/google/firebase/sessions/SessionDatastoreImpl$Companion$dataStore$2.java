package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class SessionDatastoreImpl$Companion$dataStore$2 extends r implements l {
    public static final SessionDatastoreImpl$Companion$dataStore$2 INSTANCE = new SessionDatastoreImpl$Companion$dataStore$2();

    public SessionDatastoreImpl$Companion$dataStore$2() {
        super(1);
    }

    @Override // q0.l
    @NotNull
    public final Preferences invoke(@NotNull CorruptionException corruptionException) {
        p0.a.s(corruptionException, "ex");
        Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + ProcessDetailsProvider.INSTANCE.getProcessName$com_google_firebase_firebase_sessions() + '.', corruptionException);
        return new MutablePreferences(true);
    }
}
