package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ByteArrayDataSource implements DataSource {
    private int bytesRemaining;
    private final byte[] data;
    private int readPosition;
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        boolean z8;
        Assertions.checkNotNull(bArr);
        if (bArr.length > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Assertions.checkArgument(z8);
        this.data = bArr;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws IOException {
        this.uri = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws IOException {
        this.uri = dataSpec.uri;
        long j7 = dataSpec.position;
        int i9 = (int) j7;
        this.readPosition = i9;
        long j9 = dataSpec.length;
        if (j9 == -1) {
            j9 = this.data.length - j7;
        }
        int i10 = (int) j9;
        this.bytesRemaining = i10;
        if (i10 > 0 && i9 + i10 <= this.data.length) {
            return i10;
        }
        throw new IOException("Unsatisfiable range: [" + this.readPosition + ", " + dataSpec.length + "], length: " + this.data.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i9, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        int i11 = this.bytesRemaining;
        if (i11 == 0) {
            return -1;
        }
        int min = Math.min(i10, i11);
        System.arraycopy(this.data, this.readPosition, bArr, i9, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        return min;
    }
}
