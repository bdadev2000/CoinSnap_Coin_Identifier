package com.facebook.appevents.internal;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;
import kotlin.jvm.internal.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionInfo {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final String INTERRUPTION_COUNT_KEY = "com.facebook.appevents.SessionInfo.interruptionCount";

    @NotNull
    private static final String LAST_SESSION_INFO_END_KEY = "com.facebook.appevents.SessionInfo.sessionEndTime";

    @NotNull
    private static final String LAST_SESSION_INFO_START_KEY = "com.facebook.appevents.SessionInfo.sessionStartTime";

    @NotNull
    private static final String SESSION_ID_KEY = "com.facebook.appevents.SessionInfo.sessionId";

    @Nullable
    private Long diskRestoreTime;
    private int interruptionCount;

    @NotNull
    private UUID sessionId;

    @Nullable
    private Long sessionLastEventTime;

    @Nullable
    private final Long sessionStartTime;

    @Nullable
    private SourceApplicationInfo sourceApplicationInfo;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void clearSavedSessionFromDisk() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
            edit.remove(SessionInfo.LAST_SESSION_INFO_START_KEY);
            edit.remove(SessionInfo.LAST_SESSION_INFO_END_KEY);
            edit.remove(SessionInfo.INTERRUPTION_COUNT_KEY);
            edit.remove(SessionInfo.SESSION_ID_KEY);
            edit.apply();
            SourceApplicationInfo.Companion.clearSavedSourceApplicationInfoFromDisk();
        }

        @Nullable
        public final SessionInfo getStoredSessionInfo() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext());
            long j2 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_START_KEY, 0L);
            long j3 = defaultSharedPreferences.getLong(SessionInfo.LAST_SESSION_INFO_END_KEY, 0L);
            String string = defaultSharedPreferences.getString(SessionInfo.SESSION_ID_KEY, null);
            if (j2 == 0 || j3 == 0 || string == null) {
                return null;
            }
            SessionInfo sessionInfo = new SessionInfo(Long.valueOf(j2), Long.valueOf(j3), null, 4, null);
            sessionInfo.interruptionCount = defaultSharedPreferences.getInt(SessionInfo.INTERRUPTION_COUNT_KEY, 0);
            sessionInfo.setSourceApplicationInfo(SourceApplicationInfo.Companion.getStoredSourceApplicatioInfo());
            sessionInfo.setDiskRestoreTime(Long.valueOf(System.currentTimeMillis()));
            UUID fromString = UUID.fromString(string);
            p0.a.r(fromString, "fromString(sessionIDStr)");
            sessionInfo.setSessionId(fromString);
            return sessionInfo;
        }
    }

    public SessionInfo(@Nullable Long l2, @Nullable Long l3) {
        this(l2, l3, null, 4, null);
    }

    public static final void clearSavedSessionFromDisk() {
        Companion.clearSavedSessionFromDisk();
    }

    @Nullable
    public static final SessionInfo getStoredSessionInfo() {
        return Companion.getStoredSessionInfo();
    }

    @Nullable
    public final Long getDiskRestoreTime() {
        Long l2 = this.diskRestoreTime;
        if (l2 == null) {
            return 0L;
        }
        return l2;
    }

    public final int getInterruptionCount() {
        return this.interruptionCount;
    }

    @NotNull
    public final UUID getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final Long getSessionLastEventTime() {
        return this.sessionLastEventTime;
    }

    public final long getSessionLength() {
        Long l2;
        if (this.sessionStartTime == null || (l2 = this.sessionLastEventTime) == null) {
            return 0L;
        }
        if (l2 != null) {
            return l2.longValue() - this.sessionStartTime.longValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Nullable
    public final Long getSessionStartTime() {
        return this.sessionStartTime;
    }

    @Nullable
    public final SourceApplicationInfo getSourceApplicationInfo() {
        return this.sourceApplicationInfo;
    }

    public final void incrementInterruptionCount() {
        this.interruptionCount++;
    }

    public final void setDiskRestoreTime(@Nullable Long l2) {
        this.diskRestoreTime = l2;
    }

    public final void setSessionId(@NotNull UUID uuid) {
        p0.a.s(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final void setSessionLastEventTime(@Nullable Long l2) {
        this.sessionLastEventTime = l2;
    }

    public final void setSourceApplicationInfo(@Nullable SourceApplicationInfo sourceApplicationInfo) {
        this.sourceApplicationInfo = sourceApplicationInfo;
    }

    public final void writeSessionToDisk() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
        Long l2 = this.sessionStartTime;
        edit.putLong(LAST_SESSION_INFO_START_KEY, l2 == null ? 0L : l2.longValue());
        Long l3 = this.sessionLastEventTime;
        edit.putLong(LAST_SESSION_INFO_END_KEY, l3 != null ? l3.longValue() : 0L);
        edit.putInt(INTERRUPTION_COUNT_KEY, this.interruptionCount);
        edit.putString(SESSION_ID_KEY, this.sessionId.toString());
        edit.apply();
        SourceApplicationInfo sourceApplicationInfo = this.sourceApplicationInfo;
        if (sourceApplicationInfo == null || sourceApplicationInfo == null) {
            return;
        }
        sourceApplicationInfo.writeSourceApplicationInfoToDisk();
    }

    public SessionInfo(@Nullable Long l2, @Nullable Long l3, @NotNull UUID uuid) {
        p0.a.s(uuid, "sessionId");
        this.sessionStartTime = l2;
        this.sessionLastEventTime = l3;
        this.sessionId = uuid;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ SessionInfo(java.lang.Long r1, java.lang.Long r2, java.util.UUID r3, int r4, kotlin.jvm.internal.k r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r4 = "randomUUID()"
            p0.a.r(r3, r4)
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.internal.SessionInfo.<init>(java.lang.Long, java.lang.Long, java.util.UUID, int, kotlin.jvm.internal.k):void");
    }
}
