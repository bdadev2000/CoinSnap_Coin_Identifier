package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;
import vd.e;

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    public DataSpec(Uri uri) {
        this(uri, 0);
    }

    public final boolean isFlagSet(int i10) {
        return (this.flags & i10) == i10;
    }

    public final DataSpec subrange(long j3) {
        long j10 = this.length;
        return subrange(j3, j10 != -1 ? j10 - j3 : -1L);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        sb2.append(this.uri);
        sb2.append(", ");
        sb2.append(Arrays.toString(this.postBody));
        sb2.append(", ");
        sb2.append(this.absoluteStreamPosition);
        sb2.append(", ");
        sb2.append(this.position);
        sb2.append(", ");
        sb2.append(this.length);
        sb2.append(", ");
        sb2.append(this.key);
        sb2.append(", ");
        return e.g(sb2, this.flags, "]");
    }

    public final DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.postBody, this.absoluteStreamPosition, this.position, this.length, this.key, this.flags);
    }

    public DataSpec(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    public final DataSpec subrange(long j3, long j10) {
        return (j3 == 0 && this.length == j10) ? this : new DataSpec(this.uri, this.postBody, this.absoluteStreamPosition + j3, this.position + j3, j10, this.key, this.flags);
    }

    public DataSpec(Uri uri, long j3, long j10, String str) {
        this(uri, j3, j3, j10, str, 0);
    }

    public DataSpec(Uri uri, long j3, long j10, String str, int i10) {
        this(uri, j3, j3, j10, str, i10);
    }

    public DataSpec(Uri uri, long j3, long j10, long j11, String str, int i10) {
        this(uri, null, j3, j10, j11, str, i10);
    }

    public DataSpec(Uri uri, byte[] bArr, long j3, long j10, long j11, String str, int i10) {
        boolean z10 = true;
        Assertions.checkArgument(j3 >= 0);
        Assertions.checkArgument(j10 >= 0);
        if (j11 <= 0 && j11 != -1) {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.uri = uri;
        this.postBody = bArr;
        this.absoluteStreamPosition = j3;
        this.position = j10;
        this.length = j11;
        this.key = str;
        this.flags = i10;
    }
}
