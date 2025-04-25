package com.glority.android.repository;

import com.glority.android.core.app.AppContext;
import com.glority.network.ApiServer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BaseRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/glority/android/repository/BaseRepository;", "", "<init>", "()V", "Companion", "repository_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public class BaseRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<ApiServer> appServer$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.android.repository.BaseRepository$Companion$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().setInternalHttpTimeout(30L, 30L, 30L).setInternalHttpClientWithLongTimeout(60L, 60L, 60L).host(AppContext.INSTANCE.getConfig("HOST")).build();
        }
    });

    /* compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/glority/android/repository/BaseRepository$Companion;", "", "<init>", "()V", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "Lkotlin/Lazy;", "repository_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ApiServer getAppServer() {
            return (ApiServer) BaseRepository.appServer$delegate.getValue();
        }
    }
}
