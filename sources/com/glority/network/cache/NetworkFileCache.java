package com.glority.network.cache;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.core.route.network.GetUserIdRequest;
import com.glority.android.xx.constants.LogEvents;
import com.glority.network.util.Md5Utils;
import com.glority.utils.stability.LogUtils;
import com.google.gson.Gson;
import java.io.File;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetworkFileCache.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\b\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u0002H\tH\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\bH\u0002J\u001f\u0010\u0010\u001a\u00020\u0006\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0011\u001a\u0002H\tH\u0002¢\u0006\u0002\u0010\u0012J'\u0010\u0013\u001a\u00020\u0004\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0014\u001a\u0002H\t2\u0006\u0010\u0015\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/glority/network/cache/NetworkFileCache;", "Lcom/glority/network/cache/NetworkCache;", "()V", "cacheClean", "", "folder", "Ljava/io/File;", LogEvents.exportemptyalert_close_click_type_get, "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/glority/android/core/definition/APIDefinition;", "key", "(Lcom/glority/android/core/definition/APIDefinition;)Ljava/lang/String;", "getApiDir", "getApiFolder", AbtestLogEvent.ARG_API_NAME, "getCacheFile", "request", "(Lcom/glority/android/core/definition/APIDefinition;)Ljava/io/File;", "put", "value", "originalJson", "(Lcom/glority/android/core/definition/APIDefinition;Ljava/lang/String;)V", "Companion", "fwk-network_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class NetworkFileCache implements NetworkCache {
    private static final Object lock = new Object();
    private static final int maxApiCacheSizeInFolder = 10;

    @Override // com.glority.network.cache.NetworkCache
    public <T extends APIDefinition> String get(T key) {
        File cacheFile;
        Intrinsics.checkNotNullParameter(key, "key");
        String api = key.api();
        Intrinsics.checkNotNullExpressionValue(api, "api(...)");
        synchronized (api) {
            try {
                cacheFile = getCacheFile(key);
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            if (cacheFile.exists()) {
                return FilesKt.readText$default(cacheFile, null, 1, null);
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    @Override // com.glority.network.cache.NetworkCache
    public <T extends APIDefinition> void put(T value, String originalJson) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(originalJson, "originalJson");
        String api = value.api();
        Intrinsics.checkNotNullExpressionValue(api, "api(...)");
        synchronized (api) {
            try {
                FilesKt.writeText$default(getCacheFile(value), originalJson, null, 2, null);
                String api2 = value.api();
                Intrinsics.checkNotNullExpressionValue(api2, "api(...)");
                cacheClean(getApiFolder(api2));
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }

    private final <T extends APIDefinition> File getCacheFile(T request) {
        String api = request.api();
        Intrinsics.checkNotNullExpressionValue(api, "api(...)");
        return new File(getApiFolder(api), "api_" + Md5Utils.md5(new Gson().toJson(request.getParams())));
    }

    private final File getApiFolder(String api) {
        File file = new File(getApiDir(), api);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private final File getApiDir() {
        File file;
        synchronized (lock) {
            Long result = new GetUserIdRequest().toResult();
            file = new File(AppContext.INSTANCE.peekContext().getCacheDir(), String.valueOf(result != null ? result.longValue() : 0L) + "/apis");
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return file;
    }

    private final void cacheClean(File folder) {
        File[] listFiles = folder.listFiles();
        if (listFiles != null && listFiles.length > 10) {
            if (listFiles.length > 1) {
                ArraysKt.sortWith(listFiles, new Comparator() { // from class: com.glority.network.cache.NetworkFileCache$cacheClean$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                    }
                });
            }
            listFiles[0].delete();
        }
    }
}
