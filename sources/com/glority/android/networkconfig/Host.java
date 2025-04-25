package com.glority.android.networkconfig;

import android.util.Log;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.net.URL;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: Host.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/glority/android/networkconfig/Host;", "", "()V", "authHosts", "", "", "getAuthHosts", "()Ljava/util/List;", "authHosts$delegate", "Lkotlin/Lazy;", "host", "getHost", "()Ljava/lang/String;", "host$delegate", "key", "base-networkconfig_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class Host {
    public static final Host INSTANCE = new Host();

    /* renamed from: host$delegate, reason: from kotlin metadata */
    private static final Lazy host = LazyKt.lazy(new Function0<String>() { // from class: com.glority.android.networkconfig.Host$host$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String host2;
            host2 = Host.INSTANCE.getHost("HOST");
            return host2;
        }
    });

    /* renamed from: authHosts$delegate, reason: from kotlin metadata */
    private static final Lazy authHosts = LazyKt.lazy(new Function0<List<? extends String>>() { // from class: com.glority.android.networkconfig.Host$authHosts$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            String host2;
            String host3;
            String host4;
            String host5;
            String host6;
            host2 = Host.INSTANCE.getHost("HOST");
            host3 = Host.INSTANCE.getHost("AB_HOST");
            host4 = Host.INSTANCE.getHost("ANALYSIS_HOST");
            host5 = Host.INSTANCE.getHost("EVENT_CONFIG_HOST");
            host6 = Host.INSTANCE.getHost("CMS_SEARCH_HOST");
            return CollectionsKt.listOf((Object[]) new String[]{host2, host3, host4, host5, host6});
        }
    });

    public final List<String> getAuthHosts() {
        return (List) authHosts.getValue();
    }

    public final String getHost() {
        return (String) host.getValue();
    }

    private Host() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getHost(String key) {
        String str;
        try {
            str = new URL(AppContext.INSTANCE.getConfig(key)).getHost();
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
            str = null;
        }
        return str != null ? str : "";
    }
}
