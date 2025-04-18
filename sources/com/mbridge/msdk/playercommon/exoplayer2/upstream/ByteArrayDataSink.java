package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ByteArrayDataSink implements DataSink {
    private ByteArrayOutputStream stream;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void close() throws IOException {
        this.stream.close();
    }

    public final byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.stream;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void open(DataSpec dataSpec) throws IOException {
        boolean z10;
        long j3 = dataSpec.length;
        if (j3 == -1) {
            this.stream = new ByteArrayOutputStream();
            return;
        }
        if (j3 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.stream = new ByteArrayOutputStream((int) dataSpec.length);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSink
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        this.stream.write(bArr, i10, i11);
    }
}
