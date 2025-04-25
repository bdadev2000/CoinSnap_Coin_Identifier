package com.glority.android.chatbot2;

import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.generatedAPI.kotlinAPI.chatbot.AddMessageParam;
import com.glority.generatedAPI.kotlinAPI.chatbot.AddMessagesMessage;
import com.glority.generatedAPI.kotlinAPI.chatbot.CreateSessionMessage;
import com.glority.generatedAPI.kotlinAPI.chatbot.SendMessageMessage;
import com.glority.generatedAPI.kotlinAPI.chatbot.UpdateMessageTagsMessage;
import com.glority.network.ApiServer;
import com.glority.network.model.Resource;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotRepository.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\u0006\u0010\u0018\u001a\u00020\u0017J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/glority/android/chatbot2/ChatbotRepository;", "", "()V", "appServer", "Lcom/glority/network/ApiServer;", "getAppServer", "()Lcom/glority/network/ApiServer;", "appServer$delegate", "Lkotlin/Lazy;", "addMessage", "Lcom/glority/network/model/Resource;", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessagesMessage;", RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "addMessageParams", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "createSessionSync", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/CreateSessionMessage;", Args.sessionType, "sendMessageSync", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "sendMessageMessage", "updateMessageTags", "", "messageId", "", "messageTags", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy instance$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ChatbotRepository>() { // from class: com.glority.android.chatbot2.ChatbotRepository$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChatbotRepository invoke() {
            return new ChatbotRepository();
        }
    });

    /* renamed from: appServer$delegate, reason: from kotlin metadata */
    private final Lazy appServer = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<ApiServer>() { // from class: com.glority.android.chatbot2.ChatbotRepository$appServer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ApiServer invoke() {
            ApiServer.Builder builder = new ApiServer.Builder();
            builder.host(AppContext.INSTANCE.getConfig("HOST"));
            builder.setInternalHttpTimeout(60L, 60L, 60L);
            return builder.build();
        }
    });

    private final ApiServer getAppServer() {
        return (ApiServer) this.appServer.getValue();
    }

    /* compiled from: ChatbotRepository.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/glority/android/chatbot2/ChatbotRepository$Companion;", "", "()V", "instance", "Lcom/glority/android/chatbot2/ChatbotRepository;", "getInstance", "()Lcom/glority/android/chatbot2/ChatbotRepository;", "instance$delegate", "Lkotlin/Lazy;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        public final ChatbotRepository getInstance() {
            Lazy lazy = ChatbotRepository.instance$delegate;
            Companion companion = ChatbotRepository.INSTANCE;
            return (ChatbotRepository) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Resource<CreateSessionMessage> createSessionSync(String sessionType) {
        return getAppServer().sendMessageBlocking(new CreateSessionMessage(sessionType));
    }

    public final Resource<SendMessageMessage> sendMessageSync(SendMessageMessage sendMessageMessage) {
        Intrinsics.checkNotNullParameter(sendMessageMessage, "sendMessageMessage");
        return getAppServer().sendMessageBlocking(sendMessageMessage);
    }

    public final void updateMessageTags(long messageId, List<String> messageTags) {
        getAppServer().sendMessage(new UpdateMessageTagsMessage(messageId, messageTags));
    }

    public final Resource<AddMessagesMessage> addMessage(LanguageCode languageCode, String countryCode, List<AddMessageParam> addMessageParams) {
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(addMessageParams, "addMessageParams");
        return getAppServer().sendMessageBlocking(new AddMessagesMessage(languageCode, countryCode, addMessageParams));
    }
}
