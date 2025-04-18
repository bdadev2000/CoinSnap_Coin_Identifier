package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* loaded from: classes4.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j3) throws IOException, IllegalAccessException;

    void setLength(long j3) throws IOException, IllegalAccessException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
