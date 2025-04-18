package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public final class ContentDataSource implements DataSource {
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    private FileInputStream inputStream;
    private final TransferListener<? super ContentDataSource> listener;
    private boolean opened;
    private final ContentResolver resolver;
    private Uri uri;

    /* loaded from: classes4.dex */
    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        this(context, null);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final void close() throws ContentDataSourceException {
        this.uri = null;
        try {
            try {
                FileInputStream fileInputStream = this.inputStream;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e2) {
                        throw new ContentDataSourceException(e2);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super ContentDataSource> transferListener = this.listener;
                        if (transferListener != null) {
                            transferListener.onTransferEnd(this);
                        }
                    }
                }
            } catch (IOException e10) {
                throw new ContentDataSourceException(e10);
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
                        TransferListener<? super ContentDataSource> transferListener2 = this.listener;
                        if (transferListener2 != null) {
                            transferListener2.onTransferEnd(this);
                        }
                    }
                    throw th2;
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        TransferListener<? super ContentDataSource> transferListener3 = this.listener;
                        if (transferListener3 != null) {
                            transferListener3.onTransferEnd(this);
                        }
                    }
                }
            } catch (IOException e11) {
                throw new ContentDataSourceException(e11);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        return this.uri;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final long open(DataSpec dataSpec) throws ContentDataSourceException {
        try {
            Uri uri = dataSpec.uri;
            this.uri = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.resolver.openAssetFileDescriptor(uri, CampaignEx.JSON_KEY_AD_R);
            this.assetFileDescriptor = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.inputStream = new FileInputStream(this.assetFileDescriptor.getFileDescriptor());
                long startOffset = this.assetFileDescriptor.getStartOffset();
                long skip = this.inputStream.skip(dataSpec.position + startOffset) - startOffset;
                if (skip == dataSpec.position) {
                    long j3 = dataSpec.length;
                    long j10 = -1;
                    if (j3 != -1) {
                        this.bytesRemaining = j3;
                    } else {
                        long length = this.assetFileDescriptor.getLength();
                        if (length == -1) {
                            FileChannel channel = this.inputStream.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j10 = size - channel.position();
                            }
                            this.bytesRemaining = j10;
                        } else {
                            this.bytesRemaining = length - skip;
                        }
                    }
                    this.opened = true;
                    TransferListener<? super ContentDataSource> transferListener = this.listener;
                    if (transferListener != null) {
                        transferListener.onTransferStart(this, dataSpec);
                    }
                    return this.bytesRemaining;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.uri);
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public final int read(byte[] bArr, int i10, int i11) throws ContentDataSourceException {
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
                throw new ContentDataSourceException(e2);
            }
        }
        int read = this.inputStream.read(bArr, i10, i11);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new ContentDataSourceException(new EOFException());
        }
        long j10 = this.bytesRemaining;
        if (j10 != -1) {
            this.bytesRemaining = j10 - read;
        }
        TransferListener<? super ContentDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, read);
        }
        return read;
    }

    public ContentDataSource(Context context, TransferListener<? super ContentDataSource> transferListener) {
        this.resolver = context.getContentResolver();
        this.listener = transferListener;
    }
}
