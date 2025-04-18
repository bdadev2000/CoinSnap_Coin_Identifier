package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;

/* loaded from: classes4.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastAccessTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j3, long j10) {
        this(str, j3, j10, C.TIME_UNSET, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        return this.length == -1;
    }

    public CacheSpan(String str, long j3, long j10, long j11, File file) {
        this.key = str;
        this.position = j3;
        this.length = j10;
        this.isCached = file != null;
        this.file = file;
        this.lastAccessTimestamp = j11;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j3 = this.position - cacheSpan.position;
        if (j3 == 0) {
            return 0;
        }
        return j3 < 0 ? -1 : 1;
    }
}
