package com.google.firebase.sessions.api;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public interface SessionSubscriber {

    /* loaded from: classes4.dex */
    public enum Name {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* loaded from: classes4.dex */
    public static final class SessionDetails {

        @NotNull
        private final String sessionId;

        public SessionDetails(@NotNull String str) {
            a.s(str, "sessionId");
            this.sessionId = str;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.sessionId;
        }

        @NotNull
        public final SessionDetails copy(@NotNull String str) {
            a.s(str, "sessionId");
            return new SessionDetails(str);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && a.g(this.sessionId, ((SessionDetails) obj).sessionId);
        }

        @NotNull
        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        @NotNull
        public String toString() {
            return d.q(new StringBuilder("SessionDetails(sessionId="), this.sessionId, ')');
        }
    }

    @NotNull
    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(@NotNull SessionDetails sessionDetails);
}
