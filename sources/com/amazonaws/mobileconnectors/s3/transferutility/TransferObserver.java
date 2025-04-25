package com.amazonaws.mobileconnectors.s3.transferutility;

import android.database.Cursor;
import java.io.File;

/* loaded from: classes7.dex */
public class TransferObserver {
    private String bucket;
    private long bytesTotal;
    private long bytesTransferred;
    private final TransferDBUtil dbUtil;
    private String filePath;
    private final int id;
    private String key;
    private TransferStatusListener statusListener;
    private TransferListener transferListener;
    private TransferState transferState;

    TransferObserver(int i, TransferDBUtil transferDBUtil, String str, String str2, File file) {
        this.id = i;
        this.dbUtil = transferDBUtil;
        this.bucket = str;
        this.key = str2;
        this.filePath = file.getAbsolutePath();
        this.bytesTotal = file.length();
        this.transferState = TransferState.WAITING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferObserver(int i, TransferDBUtil transferDBUtil, String str, String str2, File file, TransferListener transferListener) {
        this(i, transferDBUtil, str, str2, file);
        setTransferListener(transferListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransferObserver(int i, TransferDBUtil transferDBUtil) {
        this.id = i;
        this.dbUtil = transferDBUtil;
    }

    public void refresh() {
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryTransferById(this.id);
            if (cursor.moveToFirst()) {
                updateFromDB(cursor);
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateFromDB(Cursor cursor) {
        this.bucket = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME));
        this.key = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        this.bytesTotal = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
        this.bytesTransferred = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
        this.transferState = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow("state")));
        this.filePath = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_FILE));
    }

    public void setTransferListener(TransferListener transferListener) {
        synchronized (this) {
            cleanTransferListener();
            if (this.statusListener == null) {
                TransferStatusListener transferStatusListener = new TransferStatusListener();
                this.statusListener = transferStatusListener;
                TransferStatusUpdater.registerListener(this.id, transferStatusListener);
            }
            if (transferListener != null) {
                this.transferListener = transferListener;
                transferListener.onStateChanged(this.id, this.transferState);
                TransferStatusUpdater.registerListener(this.id, this.transferListener);
            }
        }
    }

    public int getId() {
        return this.id;
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getKey() {
        return this.key;
    }

    public long getBytesTotal() {
        return this.bytesTotal;
    }

    public String getAbsoluteFilePath() {
        return this.filePath;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public TransferState getState() {
        return this.transferState;
    }

    public void cleanTransferListener() {
        synchronized (this) {
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                TransferStatusUpdater.unregisterListener(this.id, transferListener);
                this.transferListener = null;
            }
            TransferStatusListener transferStatusListener = this.statusListener;
            if (transferStatusListener != null) {
                TransferStatusUpdater.unregisterListener(this.id, transferStatusListener);
                this.statusListener = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes7.dex */
    public class TransferStatusListener implements TransferListener {
        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onError(int i, Exception exc) {
        }

        protected TransferStatusListener() {
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onStateChanged(int i, TransferState transferState) {
            TransferObserver.this.transferState = transferState;
        }

        @Override // com.amazonaws.mobileconnectors.s3.transferutility.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            TransferObserver.this.bytesTransferred = j;
            TransferObserver.this.bytesTotal = j2;
        }
    }

    public String toString() {
        return "TransferObserver{id=" + this.id + ", bucket='" + this.bucket + "', key='" + this.key + "', bytesTotal=" + this.bytesTotal + ", bytesTransferred=" + this.bytesTransferred + ", transferState=" + this.transferState + ", filePath='" + this.filePath + "'}";
    }
}
