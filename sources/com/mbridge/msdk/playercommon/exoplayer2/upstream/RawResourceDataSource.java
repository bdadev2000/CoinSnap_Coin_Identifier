package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class RawResourceDataSource implements DataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private InputStream inputStream;
    private final TransferListener<? super RawResourceDataSource> listener;
    private boolean opened;
    private final Resources resources;
    private Uri uri;

    /* loaded from: classes4.dex */
    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public RawResourceDataSource(Context context) {
        this(context, null);
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws RawResourceDataSourceException {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new RawResourceDataSourceException(e2);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onTransferEnd(this);
                        }
                    }
                }
            } catch (IOException e10) {
                throw new RawResourceDataSourceException(e10);
            }
        } catch (Throwable th2) {
            this.inputStream = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super RawResourceDataSource> transferListener2 = this.listener;
                        if (transferListener2 != null) {
                            transferListener2.onTransferEnd(this);
                        }
                    }
                    throw th2;
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super RawResourceDataSource> transferListener3 = this.listener;
                        if (transferListener3 != null) {
                            transferListener3.onTransferEnd(this);
                        }
                    }
                }
            } catch (IOException e11) {
                throw new RawResourceDataSourceException(e11);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        try {
            Uri uri = dataSpec.uri;
            this.uri = uri;
            if (TextUtils.equals(RAW_RESOURCE_SCHEME, uri.getScheme())) {
                try {
                    this.assetFileDescriptor = this.resources.openRawResourceFd(Integer.parseInt(this.uri.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
                    this.inputStream = fileInputStream;
                    fileInputStream.skip(this.assetFileDescriptor.getStartOffset());
                    if (this.inputStream.skip(dataSpec.position) >= dataSpec.position) {
                        long j3 = dataSpec.length;
                        long j10 = -1;
                        if (j3 != -1) {
                            this.bytesRemaining = j3;
                        } else {
                            long length = this.assetFileDescriptor.getLength();
                            if (length != -1) {
                                j10 = length - dataSpec.position;
                            }
                            this.bytesRemaining = j10;
                        }
                        this.opened = true;
                        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onTransferStart(this, dataSpec);
                        }
                        return this.bytesRemaining;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new RawResourceDataSourceException("Resource identifier must be an integer.");
                }
            }
            throw new RawResourceDataSourceException("URI must use scheme rawresource");
        } catch (IOException e2) {
            throw new RawResourceDataSourceException(e2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i10, int i11) throws RawResourceDataSourceException {
        if (i11 == 0) {
            return 0;
        }
        long j3 = this.bytesRemaining;
        if (j3 == 0) {
            return -1;
        }
        if (j3 != -1) {
            try {
                i11 = (int) Math.min(j3, i11);
            } catch (IOException e2) {
                throw new RawResourceDataSourceException(e2);
            }
        }
        int read = this.inputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException(new EOFException());
        }
        long j10 = this.bytesRemaining;
        if (j10 != -1) {
            this.bytesRemaining = j10 - read;
        }
        TransferListener<? super RawResourceDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, read);
        }
        return read;
    }

    public RawResourceDataSource(Context context, TransferListener<? super RawResourceDataSource> transferListener) {
        this.resources = context.getResources();
        this.listener = transferListener;
    }
}
