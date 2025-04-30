package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHING_UNKNOWN_LENGTH = 2;
    public static final int FLAG_ALLOW_GZIP = 1;
    public final long absoluteStreamPosition;
    public final int flags;
    public final String key;
    public final long length;
    public final long position;
    public final byte[] postBody;
    public final Uri uri;

    /* loaded from: classes3.dex */
    public @interface Flags {
    }

    public DataSpec(Uri uri) {
        this(uri, 0);
    }

    public final boolean isFlagSet(int i9) {
        if ((this.flags & i9) == i9) {
            return true;
        }
        return false;
    }

    public final DataSpec subrange(long j7) {
        long j9 = this.length;
        return subrange(j7, j9 != -1 ? j9 - j7 : -1L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(this.uri);
        sb.append(", ");
        sb.append(Arrays.toString(this.postBody));
        sb.append(", ");
        sb.append(this.absoluteStreamPosition);
        sb.append(", ");
        sb.append(this.position);
        sb.append(", ");
        sb.append(this.length);
        sb.append(", ");
        sb.append(this.key);
        sb.append(", ");
        return AbstractC2914a.g(sb, this.flags, "]");
    }

    public final DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.postBody, this.absoluteStreamPosition, this.position, this.length, this.key, this.flags);
    }

    public DataSpec(Uri uri, int i9) {
        this(uri, 0L, -1L, null, i9);
    }

    public final DataSpec subrange(long j7, long j9) {
        return (j7 == 0 && this.length == j9) ? this : new DataSpec(this.uri, this.postBody, this.absoluteStreamPosition + j7, this.position + j7, j9, this.key, this.flags);
    }

    public DataSpec(Uri uri, long j7, long j9, String str) {
        this(uri, j7, j7, j9, str, 0);
    }

    public DataSpec(Uri uri, long j7, long j9, String str, int i9) {
        this(uri, j7, j7, j9, str, i9);
    }

    public DataSpec(Uri uri, long j7, long j9, long j10, String str, int i9) {
        this(uri, null, j7, j9, j10, str, i9);
    }

    public DataSpec(Uri uri, byte[] bArr, long j7, long j9, long j10, String str, int i9) {
        Assertions.checkArgument(j7 >= 0);
        Assertions.checkArgument(j9 >= 0);
        Assertions.checkArgument(j10 > 0 || j10 == -1);
        this.uri = uri;
        this.postBody = bArr;
        this.absoluteStreamPosition = j7;
        this.position = j9;
        this.length = j10;
        this.key = str;
        this.flags = i9;
    }
}
