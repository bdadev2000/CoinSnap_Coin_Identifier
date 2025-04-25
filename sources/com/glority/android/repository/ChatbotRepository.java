package com.glority.android.repository;

import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.ChatbotSendStreamMessage;
import com.picturecoin.generatedAPI.kotlinAPI.chatbot.CreateSessionMessage;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ChatbotRepository.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JJ\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00160\u0015H\u0007J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f2\u0006\u0010\u0019\u001a\u00020\rH\u0007R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/glority/android/repository/ChatbotRepository;", "Lcom/glority/android/repository/BaseRepository;", "<init>", "()V", "chatbotApiServer", "Lcom/glority/network/ApiServer;", "getChatbotApiServer", "()Lcom/glority/network/ApiServer;", "chatbotApiServer$delegate", "Lkotlin/Lazy;", "getGradingDetailGPT4oStreamMessage", "Lkotlinx/coroutines/flow/Flow;", "Lcom/glority/network/model/Resource;", "", Args.sessionId, "", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "messageContents", Args.extraFields, "", "", "getSessionId", "Lcom/picturecoin/generatedAPI/kotlinAPI/chatbot/CreateSessionMessage;", Args.sessionType, "repository_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ChatbotRepository extends BaseRepository {
    public static final ChatbotRepository INSTANCE = new ChatbotRepository();

    /* renamed from: chatbotApiServer$delegate, reason: from kotlin metadata */
    private static final Lazy chatbotApiServer = LazyKt.lazy(new Function0<ApiServer>() { // from class: com.glority.android.repository.ChatbotRepository$chatbotApiServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            return new ApiServer.Builder().host(AppContext.INSTANCE.getConfig("HOST")).setInternalHttpClientWithLongTimeout(60L, 300L, 300L).build();
        }
    });

    private ChatbotRepository() {
    }

    private final ApiServer getChatbotApiServer() {
        return (ApiServer) chatbotApiServer.getValue();
    }

    public static /* synthetic */ Flow getGradingDetailGPT4oStreamMessage$default(ChatbotRepository chatbotRepository, long j, LanguageCode languageCode, String str, String str2, Map map, int i, Object obj) {
        if ((i & 16) != 0) {
            map = MapsKt.emptyMap();
        }
        return chatbotRepository.getGradingDetailGPT4oStreamMessage(j, languageCode, str, str2, map);
    }

    public final Flow<Resource<String>> getGradingDetailGPT4oStreamMessage(long sessionId, LanguageCode languageCode, String countryCode, String messageContents, Map<String, ? extends Object> extraFields) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(messageContents, "messageContents");
        Intrinsics.checkNotNullParameter(extraFields, "extraFields");
        return getChatbotApiServer().sendMessageStreaming(new ChatbotSendStreamMessage(sessionId, languageCode, countryCode, messageContents, new Gson().toJson(extraFields)));
    }

    public final Resource<CreateSessionMessage> getSessionId(String sessionType) {
        Intrinsics.checkNotNullParameter(sessionType, "sessionType");
        return getChatbotApiServer().sendMessageBlocking(new CreateSessionMessage(sessionType));
    }
}
