package com.glority.android.chatbot2.chatbot;

import androidx.lifecycle.MutableLiveData;
import com.glority.android.chatbot2.ChatbotRepository;
import com.glority.android.chatbot2.config.ChatBotChatConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.android.chatbot2.entity.ChatbotLoadingEntity;
import com.glority.android.chatbot2.entity.ChatbotServerTextEntity;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.generatedAPI.kotlinAPI.chatbot.AddMessageParam;
import com.glority.generatedAPI.kotlinAPI.chatbot.AddMessagesMessage;
import com.glority.generatedAPI.kotlinAPI.chatbot.CreateSessionMessage;
import com.glority.generatedAPI.kotlinAPI.chatbot.Message;
import com.glority.generatedAPI.kotlinAPI.chatbot.SendMessageMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: NormalChatBot.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 82\u00020\u0001:\u00018B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0015J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J \u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J\u0016\u0010\u001c\u001a\u00020\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0005J\u001c\u0010\"\u001a\u00020\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001e2\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0005H\u0016J\u001a\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020&H\u0016J4\u0010)\u001a\u00020\u00192\u0006\u0010-\u001a\u00020.2\u0018\b\u0002\u0010/\u001a\u0012\u0012\u0004\u0012\u00020.\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001002\b\b\u0002\u0010,\u001a\u00020&H\u0016J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020+022\u0006\u0010*\u001a\u00020+H\u0003J \u00103\u001a\u00020\u00192\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002J\u0010\u00104\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u00122\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u001eR\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R'\u0010\r\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00060\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0018\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/glority/android/chatbot2/chatbot/NormalChatBot;", "", "()V", "chatBotMessageList", "Ljava/util/LinkedHashSet;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "Lkotlin/collections/LinkedHashSet;", "chatThread", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "chatThread2", "chatbotChatConfig", "Lcom/glority/android/chatbot2/config/ChatBotChatConfig;", "messageLiveData", "Landroidx/lifecycle/MutableLiveData;", "getMessageLiveData", "()Landroidx/lifecycle/MutableLiveData;", "onSessionCreatedLiveData", "", "getOnSessionCreatedLiveData", "sessionIdTask", "Ljava/util/concurrent/FutureTask;", "sessionThread", "createSession", "postValue", "", "entity", "data", "receivedMsg", "replyMessageList", "", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/Message;", "removeEntity", "baseChatbotEntity", "sendAppServerMessage", "addMessageParams", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/AddMessageParam;", "needResponse", "", "sendCustomMsg", "chatBotBaseEntity", "sendGptMsg", "sendMessageMessage", "Lcom/glority/generatedAPI/kotlinAPI/chatbot/SendMessageMessage;", "visible", "text", "", Args.extraFields, "", "sendMsgToServer", "Lcom/glority/network/model/Resource;", "sendValue", "setChatbotChatConfig", "updateTags", "messageId", "messageTags", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public class NormalChatBot {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Long, LinkedHashSet<BaseChatbotEntity>> cache = new LinkedHashMap();
    private ChatBotChatConfig chatbotChatConfig;
    private FutureTask<Long> sessionIdTask;
    private final ExecutorService chatThread = Executors.newSingleThreadExecutor();
    private final ExecutorService chatThread2 = Executors.newSingleThreadExecutor();
    private final ExecutorService sessionThread = Executors.newSingleThreadExecutor();
    private LinkedHashSet<BaseChatbotEntity> chatBotMessageList = new LinkedHashSet<>();
    private final MutableLiveData<LinkedHashSet<BaseChatbotEntity>> messageLiveData = new MutableLiveData<>();
    private final MutableLiveData<Long> onSessionCreatedLiveData = new MutableLiveData<>();

    public static final /* synthetic */ ChatBotChatConfig access$getChatbotChatConfig$p(NormalChatBot normalChatBot) {
        ChatBotChatConfig chatBotChatConfig = normalChatBot.chatbotChatConfig;
        if (chatBotChatConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatbotChatConfig");
        }
        return chatBotChatConfig;
    }

    public final MutableLiveData<LinkedHashSet<BaseChatbotEntity>> getMessageLiveData() {
        return this.messageLiveData;
    }

    public final MutableLiveData<Long> getOnSessionCreatedLiveData() {
        return this.onSessionCreatedLiveData;
    }

    /* compiled from: NormalChatBot.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R-\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/glority/android/chatbot2/chatbot/NormalChatBot$Companion;", "", "()V", "cache", "", "", "Ljava/util/LinkedHashSet;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "Lkotlin/collections/LinkedHashSet;", "getCache", "()Ljava/util/Map;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Map<Long, LinkedHashSet<BaseChatbotEntity>> getCache() {
            return NormalChatBot.cache;
        }
    }

    public void setChatbotChatConfig(ChatBotChatConfig chatbotChatConfig) {
        Intrinsics.checkNotNullParameter(chatbotChatConfig, "chatbotChatConfig");
        this.chatbotChatConfig = chatbotChatConfig;
        if (chatbotChatConfig.getSessionId() != 0) {
            Map<Long, LinkedHashSet<BaseChatbotEntity>> map = cache;
            if (map.containsKey(Long.valueOf(chatbotChatConfig.getSessionId()))) {
                LinkedHashSet<BaseChatbotEntity> linkedHashSet = map.get(Long.valueOf(chatbotChatConfig.getSessionId()));
                Intrinsics.checkNotNull(linkedHashSet);
                LinkedHashSet<BaseChatbotEntity> linkedHashSet2 = linkedHashSet;
                this.chatBotMessageList = linkedHashSet2;
                BaseChatbotEntity baseChatbotEntity = (BaseChatbotEntity) CollectionsKt.lastOrNull(linkedHashSet2);
                if (baseChatbotEntity instanceof ChatbotLoadingEntity) {
                    this.chatBotMessageList.remove(baseChatbotEntity);
                }
                sendValue(this.chatBotMessageList);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendGptMsg$default(NormalChatBot normalChatBot, String str, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGptMsg");
        }
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        normalChatBot.sendGptMsg(str, map, z);
    }

    public void sendGptMsg(String text, Map<String, ? extends Object> extraFields, boolean visible) {
        Intrinsics.checkNotNullParameter(text, "text");
        ChatBotChatConfig chatBotChatConfig = this.chatbotChatConfig;
        if (chatBotChatConfig == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatbotChatConfig");
        }
        LanguageCode languageCode = chatBotChatConfig.getLanguageCode();
        ChatBotChatConfig chatBotChatConfig2 = this.chatbotChatConfig;
        if (chatBotChatConfig2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatbotChatConfig");
        }
        String countryCode = chatBotChatConfig2.getCountryCode();
        ChatBotChatConfig chatBotChatConfig3 = this.chatbotChatConfig;
        if (chatBotChatConfig3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatbotChatConfig");
        }
        List<Long> itemIds = chatBotChatConfig3.getItemIds();
        ChatBotChatConfig chatBotChatConfig4 = this.chatbotChatConfig;
        if (chatBotChatConfig4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatbotChatConfig");
        }
        String itemType = chatBotChatConfig4.getItemType();
        ChatBotChatConfig chatBotChatConfig5 = this.chatbotChatConfig;
        if (chatBotChatConfig5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("chatbotChatConfig");
        }
        sendGptMsg(new SendMessageMessage(0L, languageCode, countryCode, text, itemIds, itemType, chatBotChatConfig5.getUid(), extraFields), visible);
    }

    public static /* synthetic */ void sendGptMsg$default(NormalChatBot normalChatBot, SendMessageMessage sendMessageMessage, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendGptMsg");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        normalChatBot.sendGptMsg(sendMessageMessage, z);
    }

    public void sendGptMsg(final SendMessageMessage sendMessageMessage, final boolean visible) {
        Intrinsics.checkNotNullParameter(sendMessageMessage, "sendMessageMessage");
        this.chatThread.execute(new Runnable() { // from class: com.glority.android.chatbot2.chatbot.NormalChatBot$sendGptMsg$1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x004b, code lost:
            
                if (r3.get() == null) goto L10;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 474
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.glority.android.chatbot2.chatbot.NormalChatBot$sendGptMsg$1.run():void");
            }

            /* compiled from: NormalChatBot.kt */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
            @DebugMetadata(c = "com.glority.android.chatbot2.chatbot.NormalChatBot$sendGptMsg$1$2", f = "NormalChatBot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.chatbot2.chatbot.NormalChatBot$sendGptMsg$1$2, reason: invalid class name */
            /* loaded from: classes14.dex */
            static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Resource $result;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Resource resource, Continuation continuation) {
                    super(2, continuation);
                    this.$result = resource;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
                    Intrinsics.checkNotNullParameter(completion, "completion");
                    return new AnonymousClass2(this.$result, completion);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ArrayList arrayList;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NormalChatBot normalChatBot = NormalChatBot.this;
                    SendMessageMessage sendMessageMessage = (SendMessageMessage) this.$result.getData();
                    if (sendMessageMessage == null || (arrayList = sendMessageMessage.getReplyMessageList()) == null) {
                        arrayList = new ArrayList();
                    }
                    normalChatBot.receivedMsg(arrayList);
                    return Unit.INSTANCE;
                }
            }
        });
    }

    public void receivedMsg(List<Message> replyMessageList) {
        Intrinsics.checkNotNullParameter(replyMessageList, "replyMessageList");
        for (Message message : replyMessageList) {
            postValue(new ChatbotServerTextEntity(message.getMessageContent().getText(), message.getMessageId()));
        }
    }

    public void sendCustomMsg(BaseChatbotEntity chatBotBaseEntity) {
        Intrinsics.checkNotNullParameter(chatBotBaseEntity, "chatBotBaseEntity");
        postValue(chatBotBaseEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Resource<SendMessageMessage> sendMsgToServer(SendMessageMessage sendMessageMessage) {
        return ChatbotRepository.INSTANCE.getInstance().sendMessageSync(sendMessageMessage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postValue(BaseChatbotEntity entity) {
        this.chatBotMessageList.add(entity);
        postValue(this.chatBotMessageList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void postValue(LinkedHashSet<BaseChatbotEntity> data) {
        LinkedHashSet<BaseChatbotEntity> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(data);
        this.messageLiveData.postValue(linkedHashSet);
    }

    private final void sendValue(LinkedHashSet<BaseChatbotEntity> data) {
        LinkedHashSet<BaseChatbotEntity> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(data);
        this.messageLiveData.setValue(linkedHashSet);
    }

    public final FutureTask<Long> createSession() {
        FutureTask<Long> futureTask = new FutureTask<>(new Callable<Long>() { // from class: com.glority.android.chatbot2.chatbot.NormalChatBot$createSession$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public final Long call() {
                if (NormalChatBot.access$getChatbotChatConfig$p(NormalChatBot.this).getSessionId() == 0) {
                    Resource<CreateSessionMessage> createSessionSync = ChatbotRepository.INSTANCE.getInstance().createSessionSync(NormalChatBot.access$getChatbotChatConfig$p(NormalChatBot.this).getSessionType());
                    if (createSessionSync.getStatus() != Status.SUCCESS) {
                        return null;
                    }
                    MutableLiveData<Long> onSessionCreatedLiveData = NormalChatBot.this.getOnSessionCreatedLiveData();
                    CreateSessionMessage data = createSessionSync.getData();
                    onSessionCreatedLiveData.postValue(data != null ? Long.valueOf(data.getSessionId()) : null);
                    CreateSessionMessage data2 = createSessionSync.getData();
                    if (data2 != null) {
                        return Long.valueOf(data2.getSessionId());
                    }
                    return null;
                }
                NormalChatBot.this.getOnSessionCreatedLiveData().postValue(Long.valueOf(NormalChatBot.access$getChatbotChatConfig$p(NormalChatBot.this).getSessionId()));
                return Long.valueOf(NormalChatBot.access$getChatbotChatConfig$p(NormalChatBot.this).getSessionId());
            }
        });
        this.sessionIdTask = futureTask;
        this.sessionThread.execute(futureTask);
        FutureTask<Long> futureTask2 = this.sessionIdTask;
        Intrinsics.checkNotNull(futureTask2);
        return futureTask2;
    }

    public final void updateTags(long messageId, List<String> messageTags) {
        ChatbotRepository.INSTANCE.getInstance().updateMessageTags(messageId, messageTags);
    }

    public final void sendAppServerMessage(final List<AddMessageParam> addMessageParams, final boolean needResponse) {
        Intrinsics.checkNotNullParameter(addMessageParams, "addMessageParams");
        (needResponse ? this.chatThread : this.chatThread2).execute(new Runnable() { // from class: com.glority.android.chatbot2.chatbot.NormalChatBot$sendAppServerMessage$1
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
            
                if (r2.get() == null) goto L13;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 519
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.glority.android.chatbot2.chatbot.NormalChatBot$sendAppServerMessage$1.run():void");
            }

            /* compiled from: NormalChatBot.kt */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
            @DebugMetadata(c = "com.glority.android.chatbot2.chatbot.NormalChatBot$sendAppServerMessage$1$1", f = "NormalChatBot.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.chatbot2.chatbot.NormalChatBot$sendAppServerMessage$1$1, reason: invalid class name */
            /* loaded from: classes14.dex */
            static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Resource $result;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Resource resource, Continuation continuation) {
                    super(2, continuation);
                    this.$result = resource;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> completion) {
                    Intrinsics.checkNotNullParameter(completion, "completion");
                    return new AnonymousClass1(this.$result, completion);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ArrayList arrayList;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    NormalChatBot normalChatBot = NormalChatBot.this;
                    AddMessagesMessage addMessagesMessage = (AddMessagesMessage) this.$result.getData();
                    if (addMessagesMessage == null || (arrayList = addMessagesMessage.getAddedMessageList()) == null) {
                        arrayList = new ArrayList();
                    }
                    normalChatBot.receivedMsg(arrayList);
                    return Unit.INSTANCE;
                }
            }
        });
    }

    public final void removeEntity(BaseChatbotEntity baseChatbotEntity) {
        Intrinsics.checkNotNullParameter(baseChatbotEntity, "baseChatbotEntity");
        this.chatBotMessageList.remove(baseChatbotEntity);
    }
}
