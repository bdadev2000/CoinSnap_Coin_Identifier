package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.WorkQueue;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.internal.ShareConstants;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class ImageDownloader {
    private static final int CACHE_READ_QUEUE_MAX_CONCURRENT = 2;
    private static final int DOWNLOAD_QUEUE_MAX_CONCURRENT = 8;

    @Nullable
    private static Handler handler;

    @NotNull
    public static final ImageDownloader INSTANCE = new ImageDownloader();

    @NotNull
    private static final WorkQueue downloadQueue = new WorkQueue(8, null, 2, null);

    @NotNull
    private static final WorkQueue cacheReadQueue = new WorkQueue(2, null, 2, null);

    @NotNull
    private static final Map<RequestKey, DownloaderContext> pendingRequests = new HashMap();

    /* loaded from: classes.dex */
    public static final class CacheReadWorkItem implements Runnable {
        private final boolean allowCachedRedirects;

        @NotNull
        private final RequestKey key;

        public CacheReadWorkItem(@NotNull RequestKey requestKey, boolean z2) {
            p0.a.s(requestKey, SDKConstants.PARAM_KEY);
            this.key = requestKey;
            this.allowCachedRedirects = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ImageDownloader.INSTANCE.readFromCache(this.key, this.allowCachedRedirects);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class DownloadImageWorkItem implements Runnable {

        @NotNull
        private final RequestKey key;

        public DownloadImageWorkItem(@NotNull RequestKey requestKey) {
            p0.a.s(requestKey, SDKConstants.PARAM_KEY);
            this.key = requestKey;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                if (CrashShieldHandler.isObjectCrashing(this)) {
                    return;
                }
                try {
                    ImageDownloader.INSTANCE.download(this.key);
                } catch (Throwable th) {
                    CrashShieldHandler.handleThrowable(th, this);
                }
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes.dex */
    public static final class DownloaderContext {
        private boolean isCancelled;

        @NotNull
        private ImageRequest request;

        @Nullable
        private WorkQueue.WorkItem workItem;

        public DownloaderContext(@NotNull ImageRequest imageRequest) {
            p0.a.s(imageRequest, "request");
            this.request = imageRequest;
        }

        @NotNull
        public final ImageRequest getRequest() {
            return this.request;
        }

        @Nullable
        public final WorkQueue.WorkItem getWorkItem() {
            return this.workItem;
        }

        public final boolean isCancelled() {
            return this.isCancelled;
        }

        public final void setCancelled(boolean z2) {
            this.isCancelled = z2;
        }

        public final void setRequest(@NotNull ImageRequest imageRequest) {
            p0.a.s(imageRequest, "<set-?>");
            this.request = imageRequest;
        }

        public final void setWorkItem(@Nullable WorkQueue.WorkItem workItem) {
            this.workItem = workItem;
        }
    }

    @VisibleForTesting
    /* loaded from: classes.dex */
    public static final class RequestKey {

        @NotNull
        public static final Companion Companion = new Companion(null);
        private static final int HASH_MULTIPLIER = 37;
        private static final int HASH_SEED = 29;

        @NotNull
        private Object tag;

        @NotNull
        private Uri uri;

        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
                this();
            }
        }

        public RequestKey(@NotNull Uri uri, @NotNull Object obj) {
            p0.a.s(uri, ShareConstants.MEDIA_URI);
            p0.a.s(obj, "tag");
            this.uri = uri;
            this.tag = obj;
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof RequestKey)) {
                return false;
            }
            RequestKey requestKey = (RequestKey) obj;
            return requestKey.uri == this.uri && requestKey.tag == this.tag;
        }

        @NotNull
        public final Object getTag() {
            return this.tag;
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.tag.hashCode() + ((this.uri.hashCode() + 1073) * HASH_MULTIPLIER);
        }

        public final void setTag(@NotNull Object obj) {
            p0.a.s(obj, "<set-?>");
            this.tag = obj;
        }

        public final void setUri(@NotNull Uri uri) {
            p0.a.s(uri, "<set-?>");
            this.uri = uri;
        }
    }

    private ImageDownloader() {
    }

    public static final boolean cancelRequest(@NotNull ImageRequest imageRequest) {
        boolean z2;
        p0.a.s(imageRequest, "request");
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    z2 = true;
                    if (workItem == null || !workItem.cancel()) {
                        downloaderContext.setCancelled(true);
                    } else {
                        map.remove(requestKey);
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final void clearCache() {
        ImageResponseCache.clearCache();
        UrlRedirectCache.clearCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void download(com.facebook.internal.ImageDownloader.RequestKey r11) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ImageDownloader.download(com.facebook.internal.ImageDownloader$RequestKey):void");
    }

    public static final void downloadAsync(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            return;
        }
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            try {
                DownloaderContext downloaderContext = map.get(requestKey);
                if (downloaderContext != null) {
                    downloaderContext.setRequest(imageRequest);
                    downloaderContext.setCancelled(false);
                    WorkQueue.WorkItem workItem = downloaderContext.getWorkItem();
                    if (workItem != null) {
                        workItem.moveToFront();
                    }
                } else {
                    INSTANCE.enqueueCacheRead(imageRequest, requestKey, imageRequest.isCachedRedirectAllowed());
                }
            } finally {
            }
        }
    }

    private final void enqueueCacheRead(ImageRequest imageRequest, RequestKey requestKey, boolean z2) {
        enqueueRequest(imageRequest, requestKey, cacheReadQueue, new CacheReadWorkItem(requestKey, z2));
    }

    private final void enqueueDownload(ImageRequest imageRequest, RequestKey requestKey) {
        enqueueRequest(imageRequest, requestKey, downloadQueue, new DownloadImageWorkItem(requestKey));
    }

    private final void enqueueRequest(ImageRequest imageRequest, RequestKey requestKey, WorkQueue workQueue, Runnable runnable) {
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = new DownloaderContext(imageRequest);
            map.put(requestKey, downloaderContext);
            downloaderContext.setWorkItem(WorkQueue.addActiveWorkItem$default(workQueue, runnable, false, 2, null));
        }
    }

    private final synchronized Handler getHandler() {
        try {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
        } catch (Throwable th) {
            throw th;
        }
        return handler;
    }

    private final void issueResponse(RequestKey requestKey, final Exception exc, final Bitmap bitmap, final boolean z2) {
        Handler handler2;
        DownloaderContext removePendingRequest = removePendingRequest(requestKey);
        if (removePendingRequest == null || removePendingRequest.isCancelled()) {
            return;
        }
        final ImageRequest request = removePendingRequest.getRequest();
        final ImageRequest.Callback callback = request == null ? null : request.getCallback();
        if (callback == null || (handler2 = getHandler()) == null) {
            return;
        }
        handler2.post(new Runnable() { // from class: com.facebook.internal.d
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownloader.m528issueResponse$lambda4(ImageRequest.this, exc, z2, bitmap, callback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: issueResponse$lambda-4, reason: not valid java name */
    public static final void m528issueResponse$lambda4(ImageRequest imageRequest, Exception exc, boolean z2, Bitmap bitmap, ImageRequest.Callback callback) {
        p0.a.s(imageRequest, "$request");
        callback.onCompleted(new ImageResponse(imageRequest, exc, z2, bitmap));
    }

    public static final void prioritizeRequest(@NotNull ImageRequest imageRequest) {
        WorkQueue.WorkItem workItem;
        p0.a.s(imageRequest, "request");
        RequestKey requestKey = new RequestKey(imageRequest.getImageUri(), imageRequest.getCallerTag());
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            DownloaderContext downloaderContext = map.get(requestKey);
            if (downloaderContext != null && (workItem = downloaderContext.getWorkItem()) != null) {
                workItem.moveToFront();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void readFromCache(com.facebook.internal.ImageDownloader.RequestKey r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r5 == 0) goto L18
            com.facebook.internal.UrlRedirectCache r5 = com.facebook.internal.UrlRedirectCache.INSTANCE
            android.net.Uri r5 = r4.getUri()
            android.net.Uri r5 = com.facebook.internal.UrlRedirectCache.getRedirectedUri(r5)
            if (r5 == 0) goto L18
            java.io.InputStream r5 = com.facebook.internal.ImageResponseCache.getCachedImageStream(r5)
            if (r5 == 0) goto L19
            r1 = 1
            goto L19
        L18:
            r5 = r0
        L19:
            if (r1 != 0) goto L25
            com.facebook.internal.ImageResponseCache r5 = com.facebook.internal.ImageResponseCache.INSTANCE
            android.net.Uri r5 = r4.getUri()
            java.io.InputStream r5 = com.facebook.internal.ImageResponseCache.getCachedImageStream(r5)
        L25:
            if (r5 == 0) goto L32
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r5)
            com.facebook.internal.Utility.closeQuietly(r5)
            r3.issueResponse(r4, r0, r2, r1)
            goto L4a
        L32:
            com.facebook.internal.ImageDownloader$DownloaderContext r5 = r3.removePendingRequest(r4)
            if (r5 != 0) goto L39
            goto L3d
        L39:
            com.facebook.internal.ImageRequest r0 = r5.getRequest()
        L3d:
            if (r5 == 0) goto L4a
            boolean r5 = r5.isCancelled()
            if (r5 != 0) goto L4a
            if (r0 == 0) goto L4a
            r3.enqueueDownload(r0, r4)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.ImageDownloader.readFromCache(com.facebook.internal.ImageDownloader$RequestKey, boolean):void");
    }

    private final DownloaderContext removePendingRequest(RequestKey requestKey) {
        DownloaderContext remove;
        Map<RequestKey, DownloaderContext> map = pendingRequests;
        synchronized (map) {
            remove = map.remove(requestKey);
        }
        return remove;
    }

    @VisibleForTesting
    @NotNull
    public final Map<RequestKey, DownloaderContext> getPendingRequests() {
        return pendingRequests;
    }
}
