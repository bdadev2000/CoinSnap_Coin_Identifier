package com.glority.android.picturexx.view.chatbot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.glority.android.chatbot2.ChatbotLauncher;
import com.glority.android.chatbot2.adapterviews.WelcomeView;
import com.glority.android.chatbot2.chatbot.NormalChatBot;
import com.glority.android.chatbot2.config.ChatBotChatConfig;
import com.glority.android.chatbot2.config.ChatbotSurveyConfig;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.android.chatbot2.entity.ChatbotWelcomeEntity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityChatbotBinding;
import com.glority.android.picturexx.view.chatbot.ChatbotActivity;
import com.glority.android.ui.base.v2.BaseActivity;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.AttributeUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageType;
import com.glority.generatedAPI.kotlinAPI.chatbot.AddMessageParam;
import com.glority.generatedAPI.kotlinAPI.chatbot.MessageContent;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotActivity.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0006H\u0014J\b\u0010\u0018\u001a\u00020\u0002H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0010j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/glority/android/picturexx/view/chatbot/ChatbotActivity;", "Lcom/glority/android/ui/base/v2/BaseActivity;", "Lcom/glority/android/picturexx/business/databinding/ActivityChatbotBinding;", "<init>", "()V", Args.sessionType, "", "cachedSeesion", "", Args.uid, "itemIds", "", Args.itemType, "extraFieldsBundle", "Lkotlin/collections/HashMap;", "", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "beforeCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "getLogPageName", "getViewBinding", "initView", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ChatbotActivity extends BaseActivity<ActivityChatbotBinding> {
    public static final long CHATBOT_SURVEY_INTERVAL = 86400000;
    public static final int CREATE_SESSION_REQUEST_CODE = 33;
    public static final String SESSIONTYPE_GRADE_RESULT = "gradeResult";
    public static final String SESSIONTYPE_HOME = "home";
    public static final String SESSIONTYPE_IDENTIFY_RESULT = "identifyResult";
    private long cachedSeesion;
    private HashMap<String, Object> extraFieldsBundle = new HashMap<>();
    private long[] itemIds;
    private String itemType;
    private String sessionType;
    private String uid;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChatbotActivity.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jc\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/view/chatbot/ChatbotActivity$Companion;", "", "<init>", "()V", "CREATE_SESSION_REQUEST_CODE", "", "CHATBOT_SURVEY_INTERVAL", "", "SESSIONTYPE_HOME", "", "SESSIONTYPE_IDENTIFY_RESULT", "SESSIONTYPE_GRADE_RESULT", "open", "", "fragment", "Landroidx/fragment/app/Fragment;", Args.sessionId, Args.sessionType, Args.itemType, "itemIds", "", Args.uid, Args.extraFields, "", "(Landroidx/fragment/app/Fragment;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Fragment fragment, Long sessionId, String sessionType, String itemType, List<Long> itemIds, String uid, Map<String, String> extraFields) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            final Bundle bundleOf = BundleKt.bundleOf(new Pair[0]);
            if (extraFields != null) {
                final Function2<String, String, Unit> function2 = new Function2<String, String, Unit>() { // from class: com.glority.android.picturexx.view.chatbot.ChatbotActivity$Companion$open$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                        invoke2(str, str2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String t, String str) {
                        Intrinsics.checkNotNullParameter(t, "t");
                        bundleOf.putString(t, str);
                    }
                };
                extraFields.forEach(new BiConsumer() { // from class: com.glority.android.picturexx.view.chatbot.ChatbotActivity$Companion$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        ChatbotActivity.Companion.open$lambda$0(Function2.this, obj, obj2);
                    }
                });
            }
            Context context = fragment.getContext();
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) ChatbotActivity.class);
                intent.putExtra(Args.sessionId, sessionId);
                intent.putExtra(Args.sessionType, sessionType);
                intent.putExtra(Args.itemIds, (Serializable) (itemIds != null ? (Long[]) itemIds.toArray(new Long[0]) : null));
                intent.putExtra(Args.uid, uid);
                intent.putExtra(Args.extraFields, bundleOf);
                intent.putExtra(Args.itemType, itemType);
                fragment.startActivityForResult(intent, 33);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void open$lambda$0(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public void beforeCreate(Bundle savedInstanceState) {
        super.beforeCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra(Args.sessionType);
        this.sessionType = stringExtra;
        updateCommonEventArgs(TuplesKt.to("from", stringExtra));
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        this.cachedSeesion = getIntent().getLongExtra(Args.sessionId, 0L);
        this.uid = getIntent().getStringExtra(Args.uid);
        this.itemType = getIntent().getStringExtra(Args.itemType);
        this.itemIds = getIntent().getLongArrayExtra(Args.itemIds);
        Bundle bundleExtra = getIntent().getBundleExtra(Args.extraFields);
        if (bundleExtra != null) {
            Set<String> keySet = bundleExtra.keySet();
            Intrinsics.checkNotNullExpressionValue(keySet, "keySet(...)");
            for (String str : keySet) {
                this.extraFieldsBundle.put(str, bundleExtra.getString(str));
            }
        }
        initView();
    }

    @Override // com.glority.android.ui.base.v2.BaseActivity
    protected String getLogPageName() {
        return "chatbotactivity";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseActivity
    public ActivityChatbotBinding getViewBinding() {
        ActivityChatbotBinding inflate = ActivityChatbotBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    private final void initView() {
        LinkedHashSet<BaseChatbotEntity> value;
        ChatbotActivity chatbotActivity = this;
        ChatbotUiConfig chatbotUiConfig = new ChatbotUiConfig(AttributeUtils.INSTANCE.getId(R.attr.chatbotSendIconRes, chatbotActivity));
        chatbotUiConfig.setEditHint(getString(R.string.chatbot_input_placeholder));
        chatbotUiConfig.getViews().add(new WelcomeView());
        chatbotUiConfig.setUserTextMsgBackgrouColor(Integer.valueOf(getResources().getColor(AttributeUtils.INSTANCE.getId(R.attr.colorPrimary, chatbotActivity), getTheme())));
        ChatbotSurveyConfig chatbotSurveyConfig = new ChatbotSurveyConfig(true, 86400000L, AttributeUtils.INSTANCE.getId(R.attr.colorPrimary, chatbotActivity));
        String str = this.sessionType;
        if (str == null) {
            str = "";
        }
        ChatBotChatConfig chatBotChatConfig = new ChatBotChatConfig(str, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode());
        chatBotChatConfig.setEnableMemoryCache(true);
        chatBotChatConfig.setSessionId(this.cachedSeesion);
        chatBotChatConfig.setSessionType(this.sessionType);
        chatBotChatConfig.setUid(this.uid);
        long[] jArr = this.itemIds;
        chatBotChatConfig.setItemIds(jArr != null ? ArraysKt.toMutableList(jArr) : null);
        chatBotChatConfig.setItemType(this.itemType);
        chatBotChatConfig.setExtraFields(this.extraFieldsBundle);
        NormalChatBot normalChatBot = new NormalChatBot();
        normalChatBot.getOnSessionCreatedLiveData().observe(this, new ChatbotActivity$sam$androidx_lifecycle_Observer$0(new Function1<Long, Unit>() { // from class: com.glority.android.picturexx.view.chatbot.ChatbotActivity$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke2(l);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Long l) {
                ChatbotActivity chatbotActivity2 = ChatbotActivity.this;
                Intent intent = new Intent();
                Intrinsics.checkNotNull(l);
                intent.putExtra(Args.sessionId, l.longValue());
                Unit unit = Unit.INSTANCE;
                chatbotActivity2.setResult(-1, intent);
            }
        }));
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_fl, ChatbotLauncher.INSTANCE.getChatbotFragment(normalChatBot, chatBotChatConfig, chatbotUiConfig, chatbotSurveyConfig)).commitAllowingStateLoss();
        if (normalChatBot.getMessageLiveData().getValue() == null || ((value = normalChatBot.getMessageLiveData().getValue()) != null && value.size() == 0)) {
            String string = getString(R.string.chatbot_messagebox_welcomemessage);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            ChatbotWelcomeEntity chatbotWelcomeEntity = new ChatbotWelcomeEntity(string, AttributeUtils.INSTANCE.getId(R.attr.chatbotIconRes, chatbotActivity));
            chatbotWelcomeEntity.setShowAvatar(false);
            normalChatBot.sendCustomMsg(chatbotWelcomeEntity);
            AddMessageParam[] addMessageParamArr = new AddMessageParam[1];
            AddMessageParam addMessageParam = new AddMessageParam(0, 1, null);
            addMessageParam.setSessionId(this.cachedSeesion);
            addMessageParam.setFrom(MessageFrom.CHAT_BOT);
            MessageContent messageContent = new MessageContent(0, 1, null);
            messageContent.setText(getResources().getString(R.string.chatbot_messagebox_welcomemessage));
            messageContent.setMessageType(MessageType.TEXT);
            addMessageParam.setMessageContent(messageContent);
            long[] jArr2 = this.itemIds;
            addMessageParam.setItemIds(jArr2 != null ? ArraysKt.toMutableList(jArr2) : null);
            addMessageParam.setUid(this.uid);
            addMessageParam.setExtraFields(this.extraFieldsBundle);
            addMessageParam.setItemType(this.itemType);
            Unit unit = Unit.INSTANCE;
            addMessageParamArr[0] = addMessageParam;
            normalChatBot.sendAppServerMessage(CollectionsKt.mutableListOf(addMessageParamArr), false);
        }
    }
}
