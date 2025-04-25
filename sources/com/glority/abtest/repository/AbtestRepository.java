package com.glority.abtest.repository;

import com.glority.abtesting.generatedAPI.kotlinAPI.config.GetAbtestingDefinitionsMessage;
import com.glority.android.core.app.AppContext;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AbtestRepository.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0012H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/glority/abtest/repository/AbtestRepository;", "", "()V", "PRODUCT_ID", "", "getPRODUCT_ID", "()Ljava/lang/String;", "PRODUCT_ID$delegate", "Lkotlin/Lazy;", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "getAbtestingDefinitions", "Lcom/glority/network/model/Resource;", "Lcom/glority/abtesting/generatedAPI/kotlinAPI/config/GetAbtestingDefinitionsMessage;", "tags", "", "base-abtest_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final class AbtestRepository {
    public static final AbtestRepository INSTANCE = new AbtestRepository();

    /* renamed from: PRODUCT_ID$delegate, reason: from kotlin metadata */
    private static final Lazy PRODUCT_ID = LazyKt.lazy(new Function0<String>() { // from class: com.glority.abtest.repository.AbtestRepository$PRODUCT_ID$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return AppContext.INSTANCE.getConfig("ANALYSIS_PRODUCT_ID");
        }
    });

    /* renamed from: appServer$delegate, reason: from kotlin metadata */
    private static final Lazy appServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.abtest.repository.AbtestRepository$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("AB_HOST")).build();
        }
    });

    private final ApiServer getAppServer() {
        return (ApiServer) appServer.getValue();
    }

    private final String getPRODUCT_ID() {
        return (String) PRODUCT_ID.getValue();
    }

    private AbtestRepository() {
    }

    public final Resource<GetAbtestingDefinitionsMessage> getAbtestingDefinitions(Map<String, ? extends Object> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        return getAppServer().sendMessageBlocking(new GetAbtestingDefinitionsMessage(tags, getPRODUCT_ID()));
    }
}
