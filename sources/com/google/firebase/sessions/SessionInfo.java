package com.google.firebase.sessions;

import android.support.v4.media.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class SessionInfo {

    @NotNull
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;

    @NotNull
    private final String firebaseAuthenticationToken;

    @NotNull
    private final String firebaseInstallationId;

    @NotNull
    private final String firstSessionId;

    @NotNull
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(@NotNull String str, @NotNull String str2, int i2, long j2, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String str3, @NotNull String str4) {
        p0.a.s(str, "sessionId");
        p0.a.s(str2, "firstSessionId");
        p0.a.s(dataCollectionStatus, "dataCollectionStatus");
        p0.a.s(str3, "firebaseInstallationId");
        p0.a.s(str4, "firebaseAuthenticationToken");
        this.sessionId = str;
        this.firstSessionId = str2;
        this.sessionIndex = i2;
        this.eventTimestampUs = j2;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = str3;
        this.firebaseAuthenticationToken = str4;
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
        return this.eventTimestampUs;
    }

    @NotNull
    public final DataCollectionStatus component5() {
        return this.dataCollectionStatus;
    }

    @NotNull
    public final String component6() {
        return this.firebaseInstallationId;
    }

    @NotNull
    public final String component7() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final SessionInfo copy(@NotNull String str, @NotNull String str2, int i2, long j2, @NotNull DataCollectionStatus dataCollectionStatus, @NotNull String str3, @NotNull String str4) {
        p0.a.s(str, "sessionId");
        p0.a.s(str2, "firstSessionId");
        p0.a.s(dataCollectionStatus, "dataCollectionStatus");
        p0.a.s(str3, "firebaseInstallationId");
        p0.a.s(str4, "firebaseAuthenticationToken");
        return new SessionInfo(str, str2, i2, j2, dataCollectionStatus, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) obj;
        return p0.a.g(this.sessionId, sessionInfo.sessionId) && p0.a.g(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && p0.a.g(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && p0.a.g(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && p0.a.g(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    @NotNull
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    @NotNull
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    @NotNull
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
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

    public int hashCode() {
        return this.firebaseAuthenticationToken.hashCode() + androidx.compose.foundation.text.input.a.b(this.firebaseInstallationId, (this.dataCollectionStatus.hashCode() + d.d(this.eventTimestampUs, d.c(this.sessionIndex, androidx.compose.foundation.text.input.a.b(this.firstSessionId, this.sessionId.hashCode() * 31, 31), 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.sessionId);
        sb.append(", firstSessionId=");
        sb.append(this.firstSessionId);
        sb.append(", sessionIndex=");
        sb.append(this.sessionIndex);
        sb.append(", eventTimestampUs=");
        sb.append(this.eventTimestampUs);
        sb.append(", dataCollectionStatus=");
        sb.append(this.dataCollectionStatus);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", firebaseAuthenticationToken=");
        return d.q(sb, this.firebaseAuthenticationToken, ')');
    }
}
