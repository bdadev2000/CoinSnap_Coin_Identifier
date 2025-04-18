package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ByteArrayDataSource implements DataSource {
    private int bytesRemaining;
    private final byte[] data;
    private int readPosition;
    private Uri uri;

    public ByteArrayDataSource(byte[] bArr) {
        boolean z10;
        Assertions.checkNotNull(bArr);
        if (bArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
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
        long j3 = dataSpec.position;
        int i10 = (int) j3;
        this.readPosition = i10;
        long j10 = dataSpec.length;
        if (j10 == -1) {
            j10 = this.data.length - j3;
        }
        int i11 = (int) j10;
        this.bytesRemaining = i11;
        if (i11 > 0 && i10 + i11 <= this.data.length) {
            return i11;
        }
        throw new IOException("Unsatisfiable range: [" + this.readPosition + ", " + dataSpec.length + "], length: " + this.data.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.bytesRemaining;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.data, this.readPosition, bArr, i10, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        return min;
    }
}
