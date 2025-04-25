package com.glority.android.chatbot2.adapterviews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.android.chatbot2.entity.ChatbotServerTextEntity;
import com.glority.chatbot2.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ServerTextView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/glority/android/chatbot2/adapterviews/ServerTextView;", "Lcom/glority/android/chatbot2/adapterviews/IChatbotAdapterView;", "()V", "convert", "", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "item", "", "uiConfig", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "entityClass", "Ljava/lang/Class;", "Lcom/glority/android/chatbot2/entity/BaseChatbotEntity;", "getId", "", "getLayout", "setLikeStyle", "isLike", "", "(Lcom/glority/android/adapterhelper/BaseViewHolder;Ljava/lang/Boolean;Lcom/glority/android/chatbot2/config/ChatbotUiConfig;)V", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ServerTextView implements IChatbotAdapterView {
    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public int getId() {
        return -2;
    }

    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public int getLayout() {
        return R.layout.chatbot_item_text_robot;
    }

    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public void convert(BaseViewHolder helper, Object item, ChatbotUiConfig uiConfig) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        if (item != null) {
            ChatbotServerTextEntity chatbotServerTextEntity = (ChatbotServerTextEntity) item;
            helper.setText(R.id.return_tv, chatbotServerTextEntity.getText());
            int i = R.id.like_ll;
            Boolean showLikeDislike = chatbotServerTextEntity.getShowLikeDislike();
            helper.setGone(i, showLikeDislike != null ? showLikeDislike.booleanValue() : false);
            helper.addOnClickListener(R.id.like_container);
            helper.addOnClickListener(R.id.dislike_container);
            setLikeStyle(helper, chatbotServerTextEntity.getLikeState(), uiConfig);
            Integer chatbotTextMsgBackgrouColor = uiConfig.getChatbotTextMsgBackgrouColor();
            if (chatbotTextMsgBackgrouColor != null) {
                helper.getView(R.id.return_tv).getBackground().setTint(chatbotTextMsgBackgrouColor.intValue());
            }
            Integer chatbotTextColor = uiConfig.getChatbotTextColor();
            if (chatbotTextColor != null) {
                ((TextView) helper.getView(R.id.return_tv)).setTextColor(chatbotTextColor.intValue());
            }
            Integer textMaxWidth = uiConfig.getTextMaxWidth();
            if (textMaxWidth != null) {
                ((TextView) helper.getView(R.id.return_tv)).setMaxWidth(textMaxWidth.intValue());
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.android.chatbot2.entity.ChatbotServerTextEntity");
    }

    @Override // com.glority.android.chatbot2.adapterviews.IChatbotAdapterView
    public Class<? extends BaseChatbotEntity> entityClass() {
        return ChatbotServerTextEntity.class;
    }

    private final void setLikeStyle(BaseViewHolder helper, Boolean isLike, ChatbotUiConfig uiConfig) {
        TypedValue typedValue = new TypedValue();
        View view = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "helper.itemView.context");
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        ImageView imageView = (ImageView) helper.getView(R.id.like_iv);
        ImageView imageView2 = (ImageView) helper.getView(R.id.dislike_iv);
        imageView.setImageResource(R.drawable.icon_chatbot_like_normal);
        imageView.getDrawable().setTint(imageView.getResources().getColor(R.color.gl_text_color1));
        imageView2.setImageResource(R.drawable.icon_chatbot_dislike_normal);
        imageView2.getDrawable().setTint(imageView.getResources().getColor(R.color.gl_text_color1));
        if (Intrinsics.areEqual((Object) isLike, (Object) true)) {
            Drawable drawable = imageView.getDrawable();
            Integer selectedColor = uiConfig.getSelectedColor();
            drawable.setTint(selectedColor != null ? selectedColor.intValue() : typedValue.data);
        } else if (Intrinsics.areEqual((Object) isLike, (Object) false)) {
            Drawable drawable2 = imageView2.getDrawable();
            Integer selectedColor2 = uiConfig.getSelectedColor();
            drawable2.setTint(selectedColor2 != null ? selectedColor2.intValue() : typedValue.data);
        }
    }
}
