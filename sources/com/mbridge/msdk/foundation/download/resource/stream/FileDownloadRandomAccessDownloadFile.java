package com.mbridge.msdk.foundation.download.resource.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes3.dex */
public class FileDownloadRandomAccessDownloadFile implements DownloadFileOutputStream {
    private final BufferedOutputStream bufferedOutputStream;
    private final FileDescriptor fileDescriptor;
    private final RandomAccessFile randomAccess;

    public FileDownloadRandomAccessDownloadFile(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        this.randomAccess = randomAccessFile;
        this.fileDescriptor = randomAccessFile.getFD();
        this.bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
    }

    public static DownloadFileOutputStream create(File file) throws IOException {
        return new FileDownloadRandomAccessDownloadFile(file);
    }

    @Override // com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream
    public void close() throws IOException {
        this.bufferedOutputStream.close();
        this.randomAccess.close();
    }

    @Override // com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream
    public void flushAndSync() throws IOException {
        this.bufferedOutputStream.flush();
        this.fileDescriptor.sync();
    }

    @Override // com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream
    public void seek(long j7) throws IOException {
        this.randomAccess.seek(j7);
    }

    @Override // com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream
    public void setLength(long j7) throws IOException {
        this.randomAccess.setLength(j7);
    }

    @Override // com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream
    public void write(byte[] bArr, int i9, int i10) throws IOException {
        this.bufferedOutputStream.write(bArr, i9, i10);
    }
}
