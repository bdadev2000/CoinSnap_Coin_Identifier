package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface DownloadFileOutputStream {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j7) throws IOException, IllegalAccessException;

    void setLength(long j7) throws IOException, IllegalAccessException;

    void write(byte[] bArr, int i9, int i10) throws IOException;
}
