package com.mbridge.msdk.playercommon.exoplayer2.upstream.cache;

import a4.j;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SimpleCacheSpan extends CacheSpan {
    private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
    private static final String SUFFIX = ".v3.exo";

    private SimpleCacheSpan(String str, long j3, long j10, long j11, File file) {
        super(str, j3, j10, j11, file);
    }

    public static SimpleCacheSpan createCacheEntry(File file, CachedContentIndex cachedContentIndex) {
        String name = file.getName();
        if (!name.endsWith(SUFFIX)) {
            file = upgradeFile(file, cachedContentIndex);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        File file2 = file;
        Matcher matcher = CACHE_FILE_PATTERN_V3.matcher(name);
        if (!matcher.matches()) {
            return null;
        }
        long length = file2.length();
        String keyForId = cachedContentIndex.getKeyForId(Integer.parseInt(matcher.group(1)));
        if (keyForId == null) {
            return null;
        }
        return new SimpleCacheSpan(keyForId, Long.parseLong(matcher.group(2)), length, Long.parseLong(matcher.group(3)), file2);
    }

    public static SimpleCacheSpan createClosedHole(String str, long j3, long j10) {
        return new SimpleCacheSpan(str, j3, j10, C.TIME_UNSET, null);
    }

    public static SimpleCacheSpan createLookup(String str, long j3) {
        return new SimpleCacheSpan(str, j3, -1L, C.TIME_UNSET, null);
    }

    public static SimpleCacheSpan createOpenHole(String str, long j3) {
        return new SimpleCacheSpan(str, j3, -1L, C.TIME_UNSET, null);
    }

    public static File getCacheFile(File file, int i10, long j3, long j10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j3);
        sb2.append(".");
        return new File(file, j.j(sb2, j10, SUFFIX));
    }

    private static File upgradeFile(File file, CachedContentIndex cachedContentIndex) {
        String group;
        String name = file.getName();
        Matcher matcher = CACHE_FILE_PATTERN_V2.matcher(name);
        if (matcher.matches()) {
            group = Util.unescapeFileName(matcher.group(1));
            if (group == null) {
                return null;
            }
        } else {
            matcher = CACHE_FILE_PATTERN_V1.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            group = matcher.group(1);
        }
        File cacheFile = getCacheFile(file.getParentFile(), cachedContentIndex.assignIdForKey(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (!file.renameTo(cacheFile)) {
            return null;
        }
        return cacheFile;
    }

    public final SimpleCacheSpan copyWithUpdatedLastAccessTime(int i10) {
        Assertions.checkState(this.isCached);
        long currentTimeMillis = System.currentTimeMillis();
        return new SimpleCacheSpan(this.key, this.position, this.length, currentTimeMillis, getCacheFile(this.file.getParentFile(), i10, this.position, currentTimeMillis));
    }
}
