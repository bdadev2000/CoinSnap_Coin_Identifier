package com.google.firebase.sessions;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class FirebaseSessionsData {

    @Nullable
    private final String sessionId;

    public FirebaseSessionsData(@Nullable String str) {
        this.sessionId = str;
    }

    public static /* synthetic */ FirebaseSessionsData copy$default(FirebaseSessionsData firebaseSessionsData, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = firebaseSessionsData.sessionId;
        }
        return firebaseSessionsData.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.sessionId;
    }

    @NotNull
    public final FirebaseSessionsData copy(@Nullable String str) {
        return new FirebaseSessionsData(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseSessionsData) && p0.a.g(this.sessionId, ((FirebaseSessionsData) obj).sessionId);
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return d.q(new StringBuilder("FirebaseSessionsData(sessionId="), this.sessionId, ')');
    }
}
