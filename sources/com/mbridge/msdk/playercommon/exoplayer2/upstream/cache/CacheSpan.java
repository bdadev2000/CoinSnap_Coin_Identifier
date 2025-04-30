package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;

/* loaded from: classes3.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastAccessTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j7, long j9) {
        this(str, j7, j9, C.TIME_UNSET, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        if (this.length == -1) {
            return true;
        }
        return false;
    }

    public CacheSpan(String str, long j7, long j9, long j10, File file) {
        this.key = str;
        this.position = j7;
        this.length = j9;
        this.isCached = file != null;
        this.file = file;
        this.lastAccessTimestamp = j10;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        long j7 = this.position - cacheSpan.position;
        if (j7 == 0) {
            return 0;
        }
        return j7 < 0 ? -1 : 1;
    }
}
