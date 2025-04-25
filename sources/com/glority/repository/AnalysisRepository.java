package com.glority.repository;

import com.glority.android.core.app.AppContext;
import com.glority.component.generatedAPI.kotlinAPI.enums.DeviceType;
import com.glority.datareceiver.generatedAPI.kotlinAPI.datareceiver.TrackingListMessage;
import com.glority.datareceiver.generatedAPI.kotlinAPI.datareceiver.TrackingMessage;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.enums.TrackingChannel;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.GetEventConfigMessage;
import com.glority.trackingconfig.generatedAPI.kotlinAPI.trackingconfig.GetLongIdMessage;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalysisRepository.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0012H\u0007J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0018\u001a\u00020\u0004H\u0007J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00122\u0006\u0010\u0018\u001a\u00020\u0004H\u0007R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/glority/repository/AnalysisRepository;", "", "()V", "PRODUCT_ID", "", "getPRODUCT_ID", "()Ljava/lang/String;", "PRODUCT_ID$delegate", "Lkotlin/Lazy;", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "getEventConfigServer", "getGetEventConfigServer", "getEventConfigServer$delegate", "getEventConfig", "Lcom/glority/network/model/Resource;", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetEventConfigMessage;", "getLongIdMessage", "Lcom/glority/trackingconfig/generatedAPI/kotlinAPI/trackingconfig/GetLongIdMessage;", "sendTrackingListMessage", "Lcom/glority/datareceiver/generatedAPI/kotlinAPI/datareceiver/TrackingListMessage;", "data", "sendTrackingMessage", "Lcom/glority/datareceiver/generatedAPI/kotlinAPI/datareceiver/TrackingMessage;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class AnalysisRepository {
    public static final AnalysisRepository INSTANCE = new AnalysisRepository();

    /* renamed from: PRODUCT_ID$delegate, reason: from kotlin metadata */
    private static final Lazy PRODUCT_ID = LazyKt.lazy(new Function0<String>() { // from class: com.glority.repository.AnalysisRepository$PRODUCT_ID$2
        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return AppContext.INSTANCE.getConfig("ANALYSIS_PRODUCT_ID");
        }
    });

    /* renamed from: appServer$delegate, reason: from kotlin metadata */
    private static final Lazy appServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.repository.AnalysisRepository$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("ANALYSIS_HOST")).build();
        }
    });

    /* renamed from: getEventConfigServer$delegate, reason: from kotlin metadata */
    private static final Lazy getEventConfigServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.repository.AnalysisRepository$getEventConfigServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("EVENT_CONFIG_HOST")).build();
        }
    });

    private final ApiServer getAppServer() {
        return (ApiServer) appServer.getValue();
    }

    private final ApiServer getGetEventConfigServer() {
        return (ApiServer) getEventConfigServer.getValue();
    }

    public final String getPRODUCT_ID() {
        return (String) PRODUCT_ID.getValue();
    }

    private AnalysisRepository() {
    }

    public final Resource<TrackingMessage> sendTrackingMessage(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return getAppServer().sendMessageBlocking(new TrackingMessage(data));
    }

    public final Resource<TrackingListMessage> sendTrackingListMessage(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return getAppServer().sendMessageBlocking(new TrackingListMessage(data));
    }

    public final Resource<GetEventConfigMessage> getEventConfig() {
        return getGetEventConfigServer().sendMessageBlocking(new GetEventConfigMessage(DeviceType.ANDROID, getPRODUCT_ID(), TrackingChannel.ANALYTICS, AppContext.INSTANCE.getVersionName()));
    }

    public final Resource<GetLongIdMessage> getLongIdMessage() {
        return getGetEventConfigServer().sendMessageBlocking(new GetLongIdMessage(0, 1, null));
    }
}
