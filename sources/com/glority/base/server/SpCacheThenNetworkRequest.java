package com.glority.base.server;

import android.util.Log;
import androidx.lifecycle.LiveData;
import com.glority.abtesting.network.AbtestLogEvent;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.definition.APIDefinition;
import com.glority.android.repository.BaseRepository;
import com.glority.base.server.CacheThenNetworkRequest;
import com.glority.network.model.Resource;
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

/* compiled from: SpCacheThenNetworkRequest.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u0017*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004:\u0001\u0017B\u000f\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0002\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/glority/base/server/SpCacheThenNetworkRequest;", "X", "Lcom/glority/android/core/definition/APIDefinition;", "Lcom/glority/base/server/CacheThenNetworkRequest;", "Lcom/glority/android/repository/BaseRepository;", "request", "<init>", "(Lcom/glority/android/core/definition/APIDefinition;)V", "getRequest", "()Lcom/glority/android/core/definition/APIDefinition;", "Lcom/glority/android/core/definition/APIDefinition;", "networkRequest", "Lcom/glority/network/model/Resource;", "cacheRequest", "updateCache", "resource", "(Lcom/glority/android/core/definition/APIDefinition;)Lcom/glority/android/core/definition/APIDefinition;", "getCacheFile", "Ljava/io/File;", "(Lcom/glority/android/core/definition/APIDefinition;)Ljava/io/File;", "getApiDir", "cacheClean", "", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class SpCacheThenNetworkRequest<X extends APIDefinition> extends BaseRepository implements CacheThenNetworkRequest<X, X> {
    public static final int $stable = 0;
    private static final Object lock = new Object();
    private static final Object lock2 = new Object();
    private static final int maxSize = 31457280;
    private final X request;

    @Override // com.glority.base.server.CacheThenNetworkRequest
    public LiveData<CacheThenNetworkRequest.ResultData<X>> doRequest() {
        return CacheThenNetworkRequest.DefaultImpls.doRequest(this);
    }

    public final X getRequest() {
        return this.request;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.base.server.CacheThenNetworkRequest
    public /* bridge */ /* synthetic */ Object updateCache(APIDefinition aPIDefinition) {
        return updateCache((SpCacheThenNetworkRequest<X>) aPIDefinition);
    }

    public SpCacheThenNetworkRequest(X request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
    }

    @Override // com.glority.base.server.CacheThenNetworkRequest
    public Resource<X> networkRequest() {
        return BaseRepository.INSTANCE.getAppServer().sendMessageBlocking(this.request);
    }

    @Override // com.glority.base.server.CacheThenNetworkRequest
    public X cacheRequest() {
        File cacheFile;
        try {
            cacheFile = getCacheFile(this.request);
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
        if (cacheFile.exists()) {
            return (X) new Gson().fromJson(FilesKt.readText$default(cacheFile, null, 1, null), (Class) this.request.getClass());
        }
        Unit unit = Unit.INSTANCE;
        return null;
    }

    @Override // com.glority.base.server.CacheThenNetworkRequest
    public X updateCache(X resource) {
        Intrinsics.checkNotNullParameter(resource, "resource");
        try {
            File cacheFile = getCacheFile(this.request);
            String json = new Gson().toJson(this.request);
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            FilesKt.writeText$default(cacheFile, json, null, 2, null);
            cacheClean();
            return resource;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            return null;
        }
    }

    private final File getCacheFile(X request) {
        return new File(getApiDir(), "api_" + Md5Utils.md5(request.api() + new Gson().toJson(request.getParams())));
    }

    private final File getApiDir() {
        File file;
        synchronized (lock) {
            file = new File(AppContext.INSTANCE.peekContext().getCacheDir(), AbtestLogEvent.ARG_API_NAME);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return file;
    }

    private final void cacheClean() {
        File[] listFiles;
        synchronized (lock2) {
            if (getApiDir().length() > 31457280 && (listFiles = getApiDir().listFiles()) != null) {
                if (listFiles.length > 1) {
                    ArraysKt.sortWith(listFiles, new Comparator() { // from class: com.glority.base.server.SpCacheThenNetworkRequest$cacheClean$lambda$5$lambda$4$$inlined$sortBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            return ComparisonsKt.compareValues(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
                        }
                    });
                }
                listFiles[0].delete();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
