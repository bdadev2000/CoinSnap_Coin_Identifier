package org.jacoco.core.data;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public class SessionInfo implements Comparable<SessionInfo> {
    private final long dump;
    private final String id;
    private final long start;

    public SessionInfo(String str, long j2, long j3) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.id = str;
        this.start = j2;
        this.dump = j3;
    }

    public long getDumpTimeStamp() {
        return this.dump;
    }

    public String getId() {
        return this.id;
    }

    public long getStartTimeStamp() {
        return this.start;
    }

    public String toString() {
        return d.r(new StringBuilder("SessionInfo["), this.id, "]");
    }

    @Override // java.lang.Comparable
    public int compareTo(SessionInfo sessionInfo) {
        long j2 = this.dump;
        long j3 = sessionInfo.dump;
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }
}
