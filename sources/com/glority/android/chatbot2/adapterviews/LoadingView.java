package com.glority.android.chatbot2.adapterviews;

import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.android.chatbot2.entity.ChatbotLoadingEntity;
import com.glority.android.chatbot2.widget.ChatbotLoadingView;
import com.glority.chatbot2.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadingView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/glority/android/chatbot2/adapterviews/LoadingView;", "Lcom/glority/android/chatbot2/adapterviews/IChatbotAdapterView;", "()V", "convert", "", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "item", "", "uiConfig", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "entityClass", "Ljava/lang/Class;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "getId", "", "getLayout", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class LoadingView implements IChatbotAdapterView {
    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public int getId() {
        return -3;
    }

    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public int getLayout() {
        return R.layout.chatbot_item_loading;
    }

    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public void convert(BaseViewHolder helper, Object item, ChatbotUiConfig uiConfig) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        ((ChatbotLoadingView) helper.getView(R.id.loading_v)).showLoading();
    }

    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public Class<? extends BaseChatbotEntity> entityClass() {
        return ChatbotLoadingEntity.class;
    }
}
