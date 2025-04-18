package com.google.firebase.sessions;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class SessionDetails {

    @NotNull
    private final String firstSessionId;

    @NotNull
    private final String sessionId;
    private final int sessionIndex;
    private final long sessionStartTimestampUs;

    public SessionDetails(@NotNull String str, @NotNull String str2, int i2, long j2) {
        p0.a.s(str, "sessionId");
        p0.a.s(str2, "firstSessionId");
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i2;
        this.sessionStartTimestampUs = j2;
    }

    public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, String str2, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sessionDetails.sessionId;
        }
        if ((i3 & 2) != 0) {
            str2 = sessionDetails.firstSessionId;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i2 = sessionDetails.sessionIndex;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            j2 = sessionDetails.sessionStartTimestampUs;
        }
        return sessionDetails.copy(str, str3, i4, j2);
    }

    @NotNull
    public final String component1() {
        return this.sessionId;
    }

    @NotNull
    public final String component2() {
        return this.firstSessionId;
    }

    public final int component3() {
        return this.sessionIndex;
    }

    public final long component4() {
        return this.sessionStartTimestampUs;
    }

    @NotNull
    public final SessionDetails copy(@NotNull String str, @NotNull String str2, int i2, long j2) {
        p0.a.s(str, "sessionId");
        p0.a.s(str2, "firstSessionId");
        return new SessionDetails(str, str2, i2, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionDetails)) {
            return false;
        }
        SessionDetails sessionDetails = (SessionDetails) obj;
        return p0.a.g(this.sessionId, sessionDetails.sessionId) && p0.a.g(this.firstSessionId, sessionDetails.firstSessionId) && this.sessionIndex == sessionDetails.sessionIndex && this.sessionStartTimestampUs == sessionDetails.sessionStartTimestampUs;
    }

    @NotNull
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    @NotNull
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public final long getSessionStartTimestampUs() {
        return this.sessionStartTimestampUs;
    }

    public int hashCode() {
        return Long.hashCode(this.sessionStartTimestampUs) + d.c(this.sessionIndex, androidx.compose.foundation.text.input.a.b(this.firstSessionId, this.sessionId.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        return "SessionDetails(sessionId=" + this.sessionId + ", firstSessionId=" + this.firstSessionId + ", sessionIndex=" + this.sessionIndex + ", sessionStartTimestampUs=" + this.sessionStartTimestampUs + ')';
    }
}
