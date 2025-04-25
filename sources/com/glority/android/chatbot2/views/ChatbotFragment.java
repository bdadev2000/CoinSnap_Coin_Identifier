package com.glority.android.chatbot2.views;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.entity.BaseMultiEntity;
import com.glority.android.chatbot2.LogEvents;
import com.glority.android.chatbot2.adapterviews.IChatbotAdapterView;
import com.glority.android.chatbot2.adapterviews.LoadingView;
import com.glority.android.chatbot2.chatbot.NormalChatBot;
import com.glority.android.chatbot2.config.ChatBotChatConfig;
import com.glority.android.chatbot2.config.ChatbotSurveyConfig;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.android.chatbot2.entity.ChatbotServerTextEntity;
import com.glority.android.chatbot2.entity.ChatbotUserTextEntity;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.chatbot2.R;
import com.glority.chatbot2.databinding.ChatbotFragmentChatbotBinding;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import com.glority.generatedAPI.kotlinAPI.chatbot.SendMessageMessage;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ViewUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ChatbotFragment.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u0006\u0010\u001a\u001a\u00020\u0013J(\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020$H\u0014J\u001a\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0018\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\b\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\u0013H\u0002J\u0012\u00100\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u00101\u001a\u00020\u0015H\u0016J\b\u00102\u001a\u00020\u0015H\u0002J\u0010\u00103\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u000204H\u0002J\b\u00105\u001a\u00020\u0015H\u0002J\u0010\u00106\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020$H\u0002J(\u00109\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010;\u001a\u00020\u0015J\b\u0010<\u001a\u00020\u0015H\u0002J\u0018\u0010=\u001a\u00020\u00152\u0006\u0010>\u001a\u00020$2\u0006\u0010?\u001a\u00020\u001dH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/glority/android/chatbot2/views/ChatbotFragment;", "Lcom/glority/android/ui/base/v2/BaseFragment;", "Lcom/glority/chatbot2/databinding/ChatbotFragmentChatbotBinding;", "()V", "adapter", "Lcom/glority/android/chatbot2/views/ChatbotAdapter;", "getAdapter", "()Lcom/glority/android/chatbot2/views/ChatbotAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "chatbot", "Lcom/glority/android/chatbot2/chatbot/NormalChatBot;", "chatbotChatConfig", "Lcom/glority/android/chatbot2/config/ChatBotChatConfig;", "chatbotSurveyConfig", "Lcom/glority/android/chatbot2/config/ChatbotSurveyConfig;", "chatbotUiConfig", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "userSend", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "enableSend", "enableSendBt", "enableSurveyDialog", "evaluateClick", "robotEntity", "Lcom/glority/android/chatbot2/entity/ChatbotServerTextEntity;", "view", "Landroid/view/View;", "position", "", ChatbotFragment.MESSAGE_TAG_LIKE, "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "hideEvaluateView", "entity", "initData", "initListener", "initView", "isAllConfigInit", "onCreate", "onDetach", "pressBack", "reSend", "Lcom/glority/android/chatbot2/entity/ChatbotUserTextEntity;", "saveSurveyDialogOpenTime", "scrollToPosition", "sendMessageToServer", LogEventArguments.ARG_MESSAGE, "setChatbot", "chatBotChatConfig", "showDefaultSurvey", "surveyDialogNeverAgain", "updateLikeOrDislikeTags", "value", "chatbotRobotEntity", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotFragment extends BaseFragment<ChatbotFragmentChatbotBinding> {
    public static final String CHATBOT_SURVEY_DONT_SHOW_AGAIN = "CHATBOT_SURVEY_DONT_SHOW_AGAIN";
    public static final String CHATBOT_SURVEY_OPEN_TIME = "CHATBOT_SURVEY_OPEN_TIME";
    public static final String MESSAGE_TAG_DISLIKE = "dislike";
    public static final String MESSAGE_TAG_LIKE = "like";

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter = LazyKt.lazy(new Function0<ChatbotAdapter>() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$adapter$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ChatbotAdapter invoke() {
            ChatbotUiConfig chatbotUiConfig;
            ArrayList arrayList = new ArrayList();
            chatbotUiConfig = ChatbotFragment.this.chatbotUiConfig;
            if (chatbotUiConfig == null) {
                chatbotUiConfig = new ChatbotUiConfig(0);
            }
            return new ChatbotAdapter(arrayList, chatbotUiConfig);
        }
    });
    private NormalChatBot chatbot;
    private ChatBotChatConfig chatbotChatConfig;
    private ChatbotSurveyConfig chatbotSurveyConfig;
    private ChatbotUiConfig chatbotUiConfig;
    private boolean userSend;

    /* JADX INFO: Access modifiers changed from: private */
    public final ChatbotAdapter getAdapter() {
        return (ChatbotAdapter) this.adapter.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String str;
        Pair<String, ? extends Object>[] pairArr = new Pair[1];
        ChatBotChatConfig chatBotChatConfig = this.chatbotChatConfig;
        if (chatBotChatConfig == null || (str = chatBotChatConfig.getFrom()) == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.to("from", str);
        updateCommonEventArgs(pairArr);
        super.onCreate(savedInstanceState);
    }

    private final boolean isAllConfigInit() {
        return (this.chatbot == null || this.chatbotChatConfig == null || this.chatbotUiConfig == null) ? false : true;
    }

    public final void setChatbot(NormalChatBot chatbot, ChatBotChatConfig chatBotChatConfig, ChatbotUiConfig chatbotUiConfig, ChatbotSurveyConfig chatbotSurveyConfig) {
        Intrinsics.checkNotNullParameter(chatbot, "chatbot");
        Intrinsics.checkNotNullParameter(chatBotChatConfig, "chatBotChatConfig");
        Intrinsics.checkNotNullParameter(chatbotUiConfig, "chatbotUiConfig");
        this.chatbot = chatbot;
        this.chatbotChatConfig = chatBotChatConfig;
        this.chatbotUiConfig = chatbotUiConfig;
        this.chatbotSurveyConfig = chatbotSurveyConfig;
    }

    private final void initListener() {
        final ChatbotUiConfig chatbotUiConfig;
        NormalChatBot normalChatBot = this.chatbot;
        if (normalChatBot == null || (chatbotUiConfig = this.chatbotUiConfig) == null) {
            return;
        }
        ChatbotFragment chatbotFragment = this;
        normalChatBot.getMessageLiveData().observe(chatbotFragment, new Observer<LinkedHashSet<BaseChatbotEntity>>() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initListener$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(LinkedHashSet<BaseChatbotEntity> it) {
                ChatbotAdapter adapter;
                int i;
                T t;
                BaseMultiEntity baseMultiEntity;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                LinkedHashSet<BaseChatbotEntity> linkedHashSet = it;
                ChatbotServerTextEntity chatbotServerTextEntity = null;
                for (T t2 : linkedHashSet) {
                    if ((((BaseChatbotEntity) t2) instanceof ChatbotServerTextEntity) && (!Intrinsics.areEqual((Object) r6.getShowLikeDislike(), (Object) false))) {
                        chatbotServerTextEntity = t2;
                    }
                }
                if (!(chatbotServerTextEntity instanceof ChatbotServerTextEntity)) {
                    chatbotServerTextEntity = null;
                }
                ChatbotServerTextEntity chatbotServerTextEntity2 = chatbotServerTextEntity;
                if (chatbotServerTextEntity2 != null) {
                    chatbotServerTextEntity2.setShowLikeDislike(true);
                }
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedHashSet, 10));
                MessageFrom messageFrom = null;
                int i2 = 0;
                for (T t3 : linkedHashSet) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    BaseChatbotEntity baseChatbotEntity = (BaseChatbotEntity) t3;
                    if ((baseChatbotEntity instanceof ChatbotServerTextEntity) && (!Intrinsics.areEqual(chatbotServerTextEntity2, baseChatbotEntity))) {
                        ((ChatbotServerTextEntity) baseChatbotEntity).setShowLikeDislike(false);
                    }
                    Iterator<T> it2 = chatbotUiConfig.getViews().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            t = it2.next();
                            if (Intrinsics.areEqual(((IChatbotAdapterView) t).entityClass(), baseChatbotEntity.getClass())) {
                                break;
                            }
                        } else {
                            t = null;
                            break;
                        }
                    }
                    IChatbotAdapterView iChatbotAdapterView = (IChatbotAdapterView) t;
                    Integer valueOf = iChatbotAdapterView != null ? Integer.valueOf(iChatbotAdapterView.getId()) : null;
                    if (valueOf != null) {
                        if (baseChatbotEntity.getMessageFrom() == MessageFrom.CHAT_BOT && messageFrom != MessageFrom.CHAT_BOT && chatbotUiConfig.getChatbotAvatar() != null && (!Intrinsics.areEqual((Object) baseChatbotEntity.getShowAvatar(), (Object) false))) {
                            baseChatbotEntity.setShowAvatar(true);
                            baseChatbotEntity.setAvatarIcon(chatbotUiConfig.getChatbotAvatar());
                        }
                        if (chatbotUiConfig.getChatbotAvatar() == null) {
                            baseChatbotEntity.setShowAvatar(false);
                        }
                        if (!Intrinsics.areEqual((Object) baseChatbotEntity.getShowAvatar(), (Object) false)) {
                            messageFrom = baseChatbotEntity.getMessageFrom();
                        }
                        baseMultiEntity = new BaseMultiEntity(valueOf.intValue(), baseChatbotEntity);
                    } else {
                        baseMultiEntity = null;
                    }
                    arrayList.add(baseMultiEntity);
                    i2 = i3;
                }
                List<? extends T> filterNotNull = CollectionsKt.filterNotNull(arrayList);
                adapter = ChatbotFragment.this.getAdapter();
                adapter.setNewData(filterNotNull);
                ChatbotFragment chatbotFragment2 = ChatbotFragment.this;
                ListIterator<? extends T> listIterator = filterNotNull.listIterator(filterNotNull.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i = -1;
                        break;
                    }
                    Object item = ((BaseMultiEntity) listIterator.previous()).getItem();
                    if (item == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.chatbot2.entity.BaseChatbotEntity");
                    }
                    if (((BaseChatbotEntity) item).getAutoScrollToThisItem()) {
                        i = listIterator.nextIndex();
                        break;
                    }
                }
                chatbotFragment2.scrollToPosition(i);
            }
        });
        chatbotUiConfig.getBottomQuickOptionViewLiveData().observe(chatbotFragment, new Observer<View>() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initListener$2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(View view) {
                ChatbotFragmentChatbotBinding binding;
                ChatbotFragmentChatbotBinding binding2;
                binding = ChatbotFragment.this.getBinding();
                binding.quickOptionContainer.removeAllViews();
                if (view != null) {
                    binding2 = ChatbotFragment.this.getBinding();
                    binding2.quickOptionContainer.addView(view);
                }
            }
        });
        if (Build.VERSION.SDK_INT >= 30) {
            final int i = 0;
            getBinding().et.setWindowInsetsAnimationCallback(new WindowInsetsAnimation.Callback(i) { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initListener$3
                @Override // android.view.WindowInsetsAnimation.Callback
                public WindowInsets onProgress(WindowInsets insets, List<WindowInsetsAnimation> runningAnimations) {
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
                    return insets;
                }

                @Override // android.view.WindowInsetsAnimation.Callback
                public void onPrepare(WindowInsetsAnimation animation) {
                    ChatbotAdapter adapter;
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    super.onPrepare(animation);
                    ChatbotFragment chatbotFragment2 = ChatbotFragment.this;
                    adapter = chatbotFragment2.getAdapter();
                    chatbotFragment2.scrollToPosition(adapter.getData().size());
                }
            });
        }
        getBinding().rv.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initListener$4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent event) {
                ChatbotFragmentChatbotBinding binding;
                ChatbotFragmentChatbotBinding binding2;
                Intrinsics.checkNotNullExpressionValue(event, "event");
                if (event.getAction() == 0) {
                    return false;
                }
                binding = ChatbotFragment.this.getBinding();
                binding.et.clearFocus();
                binding2 = ChatbotFragment.this.getBinding();
                ViewUtils.hideSoftInput(binding2.et);
                return false;
            }
        });
        getBinding().et.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initListener$5
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    BaseFragment.logEvent$default(ChatbotFragment.this, "chatbot_textanything_click", null, 2, null);
                }
            }
        });
    }

    private final void initData() {
        NormalChatBot normalChatBot = this.chatbot;
        if (normalChatBot != null) {
            normalChatBot.createSession();
        }
    }

    private final void initView() {
        ChatbotUiConfig chatbotUiConfig = this.chatbotUiConfig;
        if (chatbotUiConfig != null) {
            Toolbar toolbar = getBinding().toolbar;
            Intrinsics.checkNotNullExpressionValue(toolbar, "binding.toolbar");
            toolbar.setVisibility(chatbotUiConfig.getVisibleToolBar() ? 0 : 8);
            Toolbar toolbar2 = getBinding().toolbar;
            Intrinsics.checkNotNullExpressionValue(toolbar2, "binding.toolbar");
            toolbar2.setTitle(chatbotUiConfig.getTitle());
            getBinding().sendBt.setImageResource(chatbotUiConfig.getSendButtonIcon());
            EditText editText = getBinding().et;
            Intrinsics.checkNotNullExpressionValue(editText, "binding.et");
            editText.setHint(chatbotUiConfig.getEditHint());
            getBinding().toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initView$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseFragment.logEvent$default(ChatbotFragment.this, LogEvents.chatbot_back_click, null, 2, null);
                    ChatbotFragment.this.pressBack();
                }
            });
            ChatbotAdapter adapter = getAdapter();
            View inflate = getLayoutInflater().inflate(R.layout.chatbot_item_foot, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "layoutInflater.inflate(R….chatbot_item_foot, null)");
            adapter.setFooterView(inflate);
            RecyclerView recyclerView = getBinding().rv;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rv");
            recyclerView.setAdapter(getAdapter());
            RecyclerView recyclerView2 = getBinding().rv;
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rv");
            recyclerView2.setItemAnimator(null);
            enableSendBt();
            EditText editText2 = getBinding().et;
            Intrinsics.checkNotNullExpressionValue(editText2, "binding.et");
            editText2.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initView$$inlined$addTextChangedListener$1
                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s) {
                    ChatbotFragment.this.enableSendBt();
                }
            });
            EditText editText3 = getBinding().et;
            Intrinsics.checkNotNullExpressionValue(editText3, "binding.et");
            editText3.setImeOptions(4);
            getBinding().et.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initView$3
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean enableSend;
                    ChatbotFragmentChatbotBinding binding;
                    ChatbotFragmentChatbotBinding binding2;
                    if (i != 4) {
                        return false;
                    }
                    enableSend = ChatbotFragment.this.enableSend();
                    if (!enableSend) {
                        return true;
                    }
                    ChatbotFragment chatbotFragment = ChatbotFragment.this;
                    binding = chatbotFragment.getBinding();
                    EditText editText4 = binding.et;
                    Intrinsics.checkNotNullExpressionValue(editText4, "binding.et");
                    chatbotFragment.sendMessageToServer(editText4.getText().toString());
                    binding2 = ChatbotFragment.this.getBinding();
                    binding2.et.setText("");
                    return true;
                }
            });
            ImageView imageView = getBinding().sendBt;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.sendBt");
            ViewExtensionsKt.setSingleClickListener$default(imageView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    ChatbotFragmentChatbotBinding binding;
                    ChatbotFragmentChatbotBinding binding2;
                    Intrinsics.checkNotNullParameter(it, "it");
                    ChatbotFragment chatbotFragment = ChatbotFragment.this;
                    binding = chatbotFragment.getBinding();
                    EditText editText4 = binding.et;
                    Intrinsics.checkNotNullExpressionValue(editText4, "binding.et");
                    chatbotFragment.sendMessageToServer(editText4.getText().toString());
                    binding2 = ChatbotFragment.this.getBinding();
                    binding2.et.setText("");
                }
            }, 1, (Object) null);
            Drawable backgroundDrawable = chatbotUiConfig.getBackgroundDrawable();
            if (backgroundDrawable != null) {
                View root = getBinding().getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "binding.root");
                root.setBackground(backgroundDrawable);
            }
            getAdapter().setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$initView$6
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                    invoke(baseQuickAdapter, view, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(BaseQuickAdapter<?, ?> adapter2, View view, int i) {
                    ChatbotAdapter adapter3;
                    ChatbotAdapter adapter4;
                    ChatbotAdapter adapter5;
                    Intrinsics.checkNotNullParameter(adapter2, "adapter");
                    Intrinsics.checkNotNullParameter(view, "view");
                    int id = view.getId();
                    if (id == R.id.note_iv) {
                        adapter5 = ChatbotFragment.this.getAdapter();
                        BaseMultiEntity baseMultiEntity = (BaseMultiEntity) adapter5.getItem(i);
                        Object item = baseMultiEntity != null ? baseMultiEntity.getItem() : null;
                        ChatbotUserTextEntity chatbotUserTextEntity = (ChatbotUserTextEntity) (item instanceof ChatbotUserTextEntity ? item : null);
                        if (chatbotUserTextEntity != null) {
                            ChatbotFragment.this.logEvent("chatbot_messageerror_click", BundleKt.bundleOf(TuplesKt.to("content", chatbotUserTextEntity.getText())));
                            ChatbotFragment.this.reSend(chatbotUserTextEntity);
                            return;
                        }
                        return;
                    }
                    if (id == R.id.like_container) {
                        adapter4 = ChatbotFragment.this.getAdapter();
                        BaseMultiEntity baseMultiEntity2 = (BaseMultiEntity) adapter4.getItem(i);
                        Object item2 = baseMultiEntity2 != null ? baseMultiEntity2.getItem() : null;
                        ChatbotServerTextEntity chatbotServerTextEntity = (ChatbotServerTextEntity) (item2 instanceof ChatbotServerTextEntity ? item2 : null);
                        if (chatbotServerTextEntity == null || !(!Intrinsics.areEqual((Object) chatbotServerTextEntity.getLikeState(), (Object) true))) {
                            return;
                        }
                        ChatbotFragment.this.logEvent("chatbot_replysurvey_click", BundleKt.bundleOf(TuplesKt.to("type", ChatbotFragment.MESSAGE_TAG_LIKE), TuplesKt.to("content", chatbotServerTextEntity.getText())));
                        ChatbotFragment chatbotFragment = ChatbotFragment.this;
                        Object parent = view.getParent();
                        if (parent == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        chatbotFragment.evaluateClick(chatbotServerTextEntity, (View) parent, i, true);
                        return;
                    }
                    if (id == R.id.dislike_container) {
                        adapter3 = ChatbotFragment.this.getAdapter();
                        BaseMultiEntity baseMultiEntity3 = (BaseMultiEntity) adapter3.getItem(i);
                        Object item3 = baseMultiEntity3 != null ? baseMultiEntity3.getItem() : null;
                        ChatbotServerTextEntity chatbotServerTextEntity2 = (ChatbotServerTextEntity) (item3 instanceof ChatbotServerTextEntity ? item3 : null);
                        if (chatbotServerTextEntity2 == null || !(!Intrinsics.areEqual((Object) chatbotServerTextEntity2.getLikeState(), (Object) false))) {
                            return;
                        }
                        ChatbotFragment.this.logEvent("chatbot_replysurvey_click", BundleKt.bundleOf(TuplesKt.to("type", ChatbotFragment.MESSAGE_TAG_DISLIKE), TuplesKt.to("content", chatbotServerTextEntity2.getText())));
                        ChatbotFragment chatbotFragment2 = ChatbotFragment.this;
                        Object parent2 = view.getParent();
                        if (parent2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                        chatbotFragment2.evaluateClick(chatbotServerTextEntity2, (View) parent2, i, false);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evaluateClick(ChatbotServerTextEntity robotEntity, View view, int position, boolean like) {
        if (like) {
            robotEntity.like();
        } else {
            robotEntity.dislike();
        }
        getAdapter().notifyItemChanged(position);
        updateLikeOrDislikeTags(MESSAGE_TAG_DISLIKE, robotEntity);
        hideEvaluateView(robotEntity, view);
    }

    private final void hideEvaluateView(final ChatbotServerTextEntity entity, final View view) {
        getBinding().rv.postDelayed(new Runnable() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$hideEvaluateView$1
            @Override // java.lang.Runnable
            public final void run() {
                ChatbotServerTextEntity.this.setShowLikeDislike(false);
                view.setVisibility(8);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reSend(ChatbotUserTextEntity robotEntity) {
        NormalChatBot normalChatBot = this.chatbot;
        if (normalChatBot != null) {
            normalChatBot.removeEntity(robotEntity);
        }
        sendMessageToServer(robotEntity.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enableSendBt() {
        ImageView imageView = getBinding().sendBt;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.sendBt");
        imageView.setEnabled(enableSend());
        ImageView imageView2 = getBinding().sendBt;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.sendBt");
        ImageView imageView3 = getBinding().sendBt;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.sendBt");
        imageView2.setAlpha(imageView3.isEnabled() ? 1.0f : 0.4f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean enableSend() {
        BaseMultiEntity baseMultiEntity;
        EditText editText = getBinding().et;
        Intrinsics.checkNotNullExpressionValue(editText, "binding.et");
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "binding.et.text");
        return StringsKt.trim(text).length() > 0 && ((baseMultiEntity = (BaseMultiEntity) CollectionsKt.lastOrNull((List) getAdapter().getData())) == null || baseMultiEntity.getItemType() != new LoadingView().getId());
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (isAllConfigInit()) {
            FragmentActivity activity = getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                final boolean z = true;
                onBackPressedDispatcher.addCallback(getViewLifecycleOwner(), new OnBackPressedCallback(z) { // from class: com.glority.android.chatbot2.views.ChatbotFragment$doCreateView$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        if (ChatbotFragment.this.enableSurveyDialog()) {
                            ChatbotFragment.this.showDefaultSurvey();
                            return;
                        }
                        super.remove();
                        FragmentActivity activity2 = ChatbotFragment.this.getActivity();
                        if (activity2 != null) {
                            activity2.onBackPressed();
                        }
                    }
                });
            }
            initView();
            initData();
            initListener();
            return;
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.onBackPressed();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return "chatbot";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public ChatbotFragmentChatbotBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ChatbotFragmentChatbotBinding inflate = ChatbotFragmentChatbotBinding.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(inflate, "ChatbotFragmentChatbotBinding.inflate(inflater)");
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendMessageToServer(String message) {
        ChatBotChatConfig chatBotChatConfig;
        logEvent("chatbot_textsendout_click", BundleKt.bundleOf(TuplesKt.to("content", message)));
        NormalChatBot normalChatBot = this.chatbot;
        if (normalChatBot == null || (chatBotChatConfig = this.chatbotChatConfig) == null) {
            return;
        }
        this.userSend = true;
        NormalChatBot.sendGptMsg$default(normalChatBot, new SendMessageMessage(chatBotChatConfig.getSessionId(), chatBotChatConfig.getLanguageCode(), chatBotChatConfig.getCountryCode(), message, chatBotChatConfig.getItemIds(), chatBotChatConfig.getItemType(), chatBotChatConfig.getUid(), chatBotChatConfig.getExtraFields()), false, 2, null);
    }

    private final void updateLikeOrDislikeTags(String value, ChatbotServerTextEntity chatbotRobotEntity) {
        List<String> messageTags = chatbotRobotEntity.getMessageTags();
        if (messageTags == null) {
            chatbotRobotEntity.setMessageTags(CollectionsKt.mutableListOf(value));
            messageTags = chatbotRobotEntity.getMessageTags();
        } else {
            messageTags.remove(MESSAGE_TAG_LIKE);
            messageTags.remove(MESSAGE_TAG_DISLIKE);
            messageTags.add(value);
        }
        NormalChatBot normalChatBot = this.chatbot;
        if (normalChatBot != null) {
            normalChatBot.updateTags(chatbotRobotEntity.getServerMessageId(), messageTags);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollToPosition(final int position) {
        getBinding().rv.post(new Runnable() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$scrollToPosition$1
            @Override // java.lang.Runnable
            public final void run() {
                ChatbotFragmentChatbotBinding binding;
                try {
                    binding = ChatbotFragment.this.getBinding();
                    binding.rv.smoothScrollToPosition(position);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                }
            }
        });
    }

    public final boolean enableSurveyDialog() {
        ChatbotSurveyConfig chatbotSurveyConfig = this.chatbotSurveyConfig;
        if (chatbotSurveyConfig == null || !chatbotSurveyConfig.getEnableDefaultSurvey()) {
            return false;
        }
        Long l = (Long) PersistData.INSTANCE.get(CHATBOT_SURVEY_OPEN_TIME);
        if (((Boolean) PersistData.INSTANCE.get(CHATBOT_SURVEY_DONT_SHOW_AGAIN, false)).booleanValue()) {
            return false;
        }
        if (l == null) {
            return this.userSend;
        }
        return System.currentTimeMillis() - l.longValue() > chatbotSurveyConfig.getInterval() && this.userSend;
    }

    private final void saveSurveyDialogOpenTime() {
        PersistData.INSTANCE.set(CHATBOT_SURVEY_OPEN_TIME, Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void surveyDialogNeverAgain() {
        PersistData.INSTANCE.set(CHATBOT_SURVEY_DONT_SHOW_AGAIN, true);
    }

    public final void showDefaultSurvey() {
        BaseFragment.logEvent$default(this, "chatbot_leavesurvey_show", null, 2, null);
        saveSurveyDialogOpenTime();
        ChatbotSurveyConfig chatbotSurveyConfig = this.chatbotSurveyConfig;
        ChatbotSurveyDialog.INSTANCE.show(chatbotSurveyConfig != null ? chatbotSurveyConfig.getButtonColor() : R.color.ChatBotSurveyThemeColor, 0, new OnClickCallback() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$showDefaultSurvey$1
            @Override // com.glority.android.chatbot2.views.OnClickCallback
            public void onDismissClick(DialogFragment dialog, int rating) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                BaseFragment.logEvent$default(ChatbotFragment.this, "chatbot_leavesurveyclose_click", null, 2, null);
                ChatbotFragment.this.pressBack();
            }

            @Override // com.glority.android.chatbot2.views.OnClickCallback
            public void onSubmitClick(DialogFragment dialog, int rating, String feedback) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                ChatbotFragment.this.logEvent("chatbot_leavesurveysubmit_click", BundleKt.bundleOf(TuplesKt.to("content", feedback), TuplesKt.to("count", Integer.valueOf(rating))));
                ChatbotFragment.this.pressBack();
            }

            @Override // com.glority.android.chatbot2.views.OnClickCallback
            public void dontShowAgain(DialogFragment dialog, int rating) {
                Intrinsics.checkNotNullParameter(dialog, "dialog");
                BaseFragment.logEvent$default(ChatbotFragment.this, "chatbot_leavesurveynoagain_click", null, 2, null);
                ChatbotFragment.this.surveyDialogNeverAgain();
                ChatbotFragment.this.pressBack();
            }
        }, getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pressBack() {
        FragmentActivity activity;
        ChatbotUiConfig.OnBackPressListener onBackPressListener;
        ChatbotUiConfig chatbotUiConfig = this.chatbotUiConfig;
        if ((chatbotUiConfig == null || (onBackPressListener = chatbotUiConfig.getOnBackPressListener()) == null || !onBackPressListener.onBackPress(new Function0<Unit>() { // from class: com.glority.android.chatbot2.views.ChatbotFragment$pressBack$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                FragmentActivity activity2 = ChatbotFragment.this.getActivity();
                if (activity2 != null) {
                    activity2.onBackPressed();
                }
            }
        })) && (activity = getActivity()) != null) {
            activity.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        Map<Long, LinkedHashSet<BaseChatbotEntity>> cache = NormalChatBot.INSTANCE.getCache();
        ChatBotChatConfig chatBotChatConfig = this.chatbotChatConfig;
        LinkedHashSet<BaseChatbotEntity> linkedHashSet = cache.get(chatBotChatConfig != null ? Long.valueOf(chatBotChatConfig.getSessionId()) : null);
        if (linkedHashSet != null) {
            Iterator<T> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((BaseChatbotEntity) it.next()).setAutoScrollToThisItem(true);
            }
        }
    }
}
