package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface DataSource {

    /* loaded from: classes3.dex */
    public interface Factory {
        DataSource createDataSource();
    }

    void close() throws IOException;

    Uri getUri();

    long open(DataSpec dataSpec) throws IOException;

    int read(byte[] bArr, int i9, int i10) throws IOException;
}
