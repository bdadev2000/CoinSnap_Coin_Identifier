package com.mbridge.msdk.foundation.download.core;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.utils.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class DownloadRequestBuilder<T> implements RequestBuilder<T> {
    long connectTimeout;
    String directoryPathExternal;
    String directoryPathInternal;
    DownloadMessage<T> downloadMessage;
    DownloadPriority downloadPriority = DownloadPriority.MEDIUM;
    OnDownloadStateListener downloadStateListener;
    Map<String, String> extraMap;
    HashMap<String, List<String>> headerMap;
    OnProgressStateListener progressStateListener;
    long readTimeout;
    int retry;
    long timeout;
    String userAgent;
    long writeTimeout;

    public DownloadRequestBuilder(DownloadMessage<T> downloadMessage) {
        this.downloadMessage = downloadMessage;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequest<T> build() {
        return DownloadRequest.create(this);
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> with(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (Objects.isNull(this.extraMap)) {
                this.extraMap = new HashMap();
            }
            this.extraMap.put(str, str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathExternal(String str) {
        this.directoryPathExternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDirectoryPathInternal(String str) {
        this.directoryPathInternal = str;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadPriority(DownloadPriority downloadPriority) {
        this.downloadPriority = downloadPriority;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withDownloadStateListener(OnDownloadStateListener onDownloadStateListener) {
        this.downloadStateListener = onDownloadStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withProgressStateListener(OnProgressStateListener onProgressStateListener) {
        this.progressStateListener = onProgressStateListener;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withTimeout(long j7) {
        this.timeout = j7;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public RequestBuilder<T> withWriteTimeout(long j7) {
        this.writeTimeout = j7;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withConnectTimeout(long j7) {
        this.connectTimeout = j7;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHeader(String str, String str2) {
        if (this.headerMap == null) {
            this.headerMap = new HashMap<>(4);
        }
        List<String> list = this.headerMap.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.headerMap.put(str, list);
        }
        if (!list.contains(str2)) {
            list.add(str2);
        }
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withHttpRetryCounter(int i9) {
        this.retry = i9;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withReadTimeout(long j7) {
        this.readTimeout = j7;
        return this;
    }

    @Override // com.mbridge.msdk.foundation.download.core.RequestBuilder
    public DownloadRequestBuilder<T> withUserAgent(String str) {
        this.userAgent = str;
        return this;
    }
}
