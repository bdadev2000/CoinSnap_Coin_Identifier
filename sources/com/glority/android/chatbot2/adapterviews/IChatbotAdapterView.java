package com.glority.android.chatbot2.adapterviews;

import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import kotlin.Metadata;

/* compiled from: IChatbotAdapterView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/glority/android/chatbot2/adapterviews/IChatbotAdapterView;", "", "convert", "", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "item", "uiConfig", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "entityClass", "Ljava/lang/Class;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "getId", "", "getLayout", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public interface IChatbotAdapterView {
    void convert(BaseViewHolder helper, Object item, ChatbotUiConfig uiConfig);

    Class<? extends BaseChatbotEntity> entityClass();

    int getId();

    int getLayout();
}
