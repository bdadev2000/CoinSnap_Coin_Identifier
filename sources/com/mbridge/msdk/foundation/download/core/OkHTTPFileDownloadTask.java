package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResponse;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.core.DownloaderReporter;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.download.resource.MBResourceManager;
import com.mbridge.msdk.foundation.download.resource.stream.DownloadFileOutputStream;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.tools.af;
import com.mbridge.msdk.thrid.okhttp.Response;
import com.mbridge.msdk.thrid.okhttp.ResponseBody;
import com.mbridge.msdk.tracker.network.q;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
class OkHTTPFileDownloadTask implements IDownloadTask {
    private static final String CLOSE = "close";
    private static final String CONNECTION = "Connection";
    private static final String FORMAT_RANGE = "bytes=%d-";
    private static final String RESPONSE_BODY_IS_NULL = "response body is null";
    private static final String RESPONSE_CODE = "responseCode ";
    private static final String RESPONSE_CONTENT_LENGTH_IS_NULL = "response content length is null";
    private static final String RESPONSE_INPUTSTREAM_IS_NULL = "response inputStream is null";
    private static final String RESPONSE_IS_NULL = "response is null";
    private final IDatabaseHelper _databaseHelper;
    private volatile DownloadMessage _downloadMessage;
    private DownloadModel _downloadModel;
    private final DownloadRequest _downloadRequest;
    private DownloadResponse _downloadResponse;
    private DownloaderReporter.Builder _downloaderReporter;
    private String _etag = "";
    private InputStream _inputStream;
    private DownloadFileOutputStream _outputStream;
    private ResponseBody _responseBody;
    private q monitor;

    private OkHTTPFileDownloadTask(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        this._downloadRequest = downloadRequest;
        this._downloadModel = downloadModel;
        this._databaseHelper = iDatabaseHelper;
        this._downloadMessage = downloadMessage;
        this._downloaderReporter = builder;
    }

    public static IDownloadTask create(DownloadRequest downloadRequest, DownloadModel downloadModel, IDatabaseHelper iDatabaseHelper, DownloadMessage downloadMessage, DownloaderReporter.Builder builder) {
        if (Objects.isNull(builder)) {
            builder = new DownloaderReporter.Builder(DownloadCommon.DOWNLOAD_REPORT_KEY);
        }
        return new OkHTTPFileDownloadTask(downloadRequest, downloadModel, iDatabaseHelper, downloadMessage, builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.foundation.download.DownloadResponse handleInputStream(java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) throws java.io.IOException, java.lang.IllegalAccessException {
        /*
            Method dump skipped, instructions count: 658
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.handleInputStream(java.lang.String, java.lang.String, java.lang.String, java.lang.String):com.mbridge.msdk.foundation.download.DownloadResponse");
    }

    private void handlerException(String str, String str2, String str3, Exception exc) {
        try {
            if (Objects.isNotNull(this._databaseHelper) && Objects.isNotNull(this._downloadRequest)) {
                if (!af.a().a("r_f_s_d_e", true)) {
                    this._databaseHelper.remove(str3, str2);
                    MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
                }
                this._downloadRequest.setDownloadedBytes(0L);
                this._downloadRequest.setTotalBytes(0L);
            }
        } catch (Exception e4) {
            GlobalComponent.getInstance().getLogger().log(IDownloadTask.TAG, e4.getMessage());
        }
        this._downloadResponse.setError(exc);
    }

    private DownloadResponse handlerRequestSuccessful(String str, String str2, String str3, Response response, int i9) throws IOException, IllegalAccessException {
        DownloadResponse downloadResponse = new DownloadResponse();
        boolean z8 = true;
        boolean z9 = !isSupportResume(i9, this._downloadModel);
        if (response == null || this._downloadRequest == null || i9 != 206 || response.body() == null || this._downloadRequest.getTotalBytes() <= 0 || response.body().contentLength() == this._downloadRequest.getTotalBytes() - this._downloadRequest.getDownloadedBytes()) {
            z8 = false;
        }
        if (z9 && z8) {
            this._downloadRequest.setDownloadedBytes(0L);
            this._downloadRequest.setTotalBytes(0L);
            if (Objects.isNotNull(this._databaseHelper)) {
                this._databaseHelper.remove(str3, str2);
            }
            this._downloadModel = null;
            MBResourceManager.getInstance().deleteFile(new File(this._downloadRequest.getCacheDirectoryPath() + this._downloadMessage.getSaveFileName()));
        }
        ResponseBody body = response.body();
        this._responseBody = body;
        if (Objects.isNull(body)) {
            downloadResponse.setError(new IOException(RESPONSE_BODY_IS_NULL));
            this._downloadRequest.setTotalBytes(0L);
            this._downloadRequest.setDownloadedBytes(0L);
            return downloadResponse;
        }
        long contentLength = this._responseBody.contentLength();
        q qVar = this.monitor;
        if (qVar != null) {
            qVar.h(contentLength);
        }
        if (contentLength <= 0) {
            downloadResponse.setError(new IOException(RESPONSE_CONTENT_LENGTH_IS_NULL));
            return downloadResponse;
        }
        if (this._downloadRequest.getTotalBytes() == 0) {
            this._downloadRequest.setTotalBytes(contentLength);
        }
        InputStream byteStream = this._responseBody.byteStream();
        this._inputStream = byteStream;
        if (Objects.isNull(byteStream)) {
            downloadResponse.setError(new IOException(RESPONSE_INPUTSTREAM_IS_NULL));
            return downloadResponse;
        }
        return handleInputStream(str, str2, str3, this._etag);
    }

    private boolean isSupportResume(int i9, DownloadModel downloadModel) {
        if (i9 == 206 && !TextUtils.isEmpty(this._etag) && (downloadModel == null || TextUtils.equals(this._etag, downloadModel.getEtag()))) {
            return true;
        }
        return false;
    }

    private void reportDownloadMessage() {
        Exception exception;
        boolean isSuccessful = this._downloadResponse.isSuccessful();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_SUCCESS, Boolean.toString(isSuccessful));
        boolean isCancelled = this._downloadResponse.isCancelled();
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_CANCEL, Boolean.toString(isCancelled));
        this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_RATE, String.valueOf(Utils.getDownloadRate(this._downloadRequest.getTotalBytes(), this._downloadRequest.getDownloadedBytes())));
        if (!isSuccessful && !isCancelled) {
            this._downloaderReporter.add(DownloadCommon.DOWNLOAD_REPORT_REASON, this._downloadResponse.getErrorMessage());
        }
        q qVar = this.monitor;
        if (qVar != null) {
            if (isSuccessful) {
                qVar.b(1);
            } else {
                String errorMessage = this._downloadResponse.getErrorMessage();
                DownloadError error = this._downloadResponse.getError();
                if (error == null) {
                    exception = null;
                } else {
                    exception = error.getException();
                }
                q qVar2 = this.monitor;
                if (isCancelled) {
                    exception = new IOException("download request canceled");
                }
                qVar2.a(exception);
                if (TextUtils.equals(errorMessage, "timeout")) {
                    this.monitor.b(3);
                } else {
                    this.monitor.b(2);
                }
            }
        }
        this._downloaderReporter.build().report();
    }

    private void sendProgress(DownloadRequest downloadRequest, DownloadMessage downloadMessage, long j7, long j9, int i9) {
        if (downloadRequest.getStatus() != DownloadStatus.CANCELLED) {
            downloadRequest.handlerProcessEvent(downloadMessage, new DownloadProgress(j7, j9, i9));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0245, code lost:
    
        if (r8.isCanceled() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0247, code lost:
    
        r8.cancel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024a, code lost:
    
        reportDownloadMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x029e, code lost:
    
        return r21._downloadResponse;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0299, code lost:
    
        if (r8.isCanceled() != false) goto L52;
     */
    @Override // com.mbridge.msdk.foundation.download.core.IDownloadTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.mbridge.msdk.foundation.download.DownloadResponse run() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.download.core.OkHTTPFileDownloadTask.run():com.mbridge.msdk.foundation.download.DownloadResponse");
    }
}
