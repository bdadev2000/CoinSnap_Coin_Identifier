package com.glority.android.chatbot2.views;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewGroupKt;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.adapterhelper.entity.BaseMultiEntity;
import com.glority.android.chatbot2.adapterviews.IChatbotAdapterView;
import com.glority.android.chatbot2.config.ChatbotUiConfig;
import com.glority.android.chatbot2.entity.BaseChatbotEntity;
import com.glority.chatbot2.R;
import com.glority.component.generatedAPI.kotlinAPI.enums.MessageFrom;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u001a\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/chatbot2/views/ChatbotAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/android/adapterhelper/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "", "uiConfig", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "(Ljava/util/List;Lcom/glority/android/chatbot2/config/ChatbotUiConfig;)V", "convert", "", "helper", "item", "createBaseViewHolder", "parent", "Landroid/view/ViewGroup;", "layoutResId", "", "onCreateDefViewHolder", "viewType", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
    private final ChatbotUiConfig uiConfig;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatbotAdapter(List<? extends BaseMultiEntity> data, ChatbotUiConfig uiConfig) {
        super(data);
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        this.uiConfig = uiConfig;
        for (IChatbotAdapterView iChatbotAdapterView : uiConfig.getViews()) {
            addItemType(iChatbotAdapterView.getId(), iChatbotAdapterView.getLayout());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, BaseMultiEntity item) {
        Object obj;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        Iterator<T> it = this.uiConfig.getViews().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((IChatbotAdapterView) obj).getId() == item.getItemType()) {
                    break;
                }
            }
        }
        IChatbotAdapterView iChatbotAdapterView = (IChatbotAdapterView) obj;
        if (iChatbotAdapterView != null) {
            iChatbotAdapterView.convert(helper, item.getItem(), this.uiConfig);
        }
        Object item2 = item.getItem();
        if (item2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.glority.android.chatbot2.entity.BaseChatbotEntity");
        }
        BaseChatbotEntity baseChatbotEntity = (BaseChatbotEntity) item2;
        View view = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "helper.itemView");
        view.setVisibility(baseChatbotEntity.getVisible() ? 0 : 8);
        View view2 = helper.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "helper.itemView");
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = baseChatbotEntity.getVisible() ? -2 : 0;
            view2.setLayoutParams(layoutParams);
            if (baseChatbotEntity.getMessageFrom() == MessageFrom.CHAT_BOT) {
                if (Intrinsics.areEqual((Object) baseChatbotEntity.getShowAvatar(), (Object) true) && baseChatbotEntity.getAvatarIcon() != null) {
                    helper.setVisible(R.id.avatar_iv, true);
                    int i = R.id.avatar_iv;
                    Integer avatarIcon = baseChatbotEntity.getAvatarIcon();
                    Intrinsics.checkNotNull(avatarIcon);
                    helper.setImageResource(i, avatarIcon.intValue());
                    return;
                }
                if (baseChatbotEntity.getIgnoreAvatarSize()) {
                    helper.setGone(R.id.avatar_iv, false);
                    View view3 = helper.itemView;
                    if (view3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    View view4 = ViewGroupKt.get((LinearLayout) view3, 1);
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                        View view5 = helper.itemView;
                        Intrinsics.checkNotNullExpressionValue(view5, "helper.itemView");
                        marginLayoutParams.setMarginStart(view5.getResources().getDimensionPixelSize(R.dimen.x32));
                        view4.setLayoutParams(marginLayoutParams);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                if (Intrinsics.areEqual((Object) baseChatbotEntity.getShowAvatar(), (Object) false) && baseChatbotEntity.getAvatarIcon() != null) {
                    helper.setVisible(R.id.avatar_iv, false);
                    View view6 = helper.itemView;
                    if (view6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    View view7 = ViewGroupKt.get((LinearLayout) view6, 1);
                    ViewGroup.LayoutParams layoutParams3 = view7.getLayoutParams();
                    if (layoutParams3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        View view8 = helper.itemView;
                        Intrinsics.checkNotNullExpressionValue(view8, "helper.itemView");
                        marginLayoutParams2.setMarginStart(view8.getResources().getDimensionPixelSize(R.dimen.x24));
                        view7.setLayoutParams(marginLayoutParams2);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                helper.setGone(R.id.avatar_iv, false);
                View view9 = helper.itemView;
                if (view9 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                }
                View view10 = ViewGroupKt.get((LinearLayout) view9, 1);
                ViewGroup.LayoutParams layoutParams4 = view10.getLayoutParams();
                if (layoutParams4 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                    View view11 = helper.itemView;
                    Intrinsics.checkNotNullExpressionValue(view11, "helper.itemView");
                    marginLayoutParams3.setMarginStart(view11.getResources().getDimensionPixelSize(R.dimen.x32));
                    view10.setLayoutParams(marginLayoutParams3);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            helper.setGone(R.id.avatar_iv, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseMultiItemQuickAdapter, com.glority.android.adapterhelper.BaseQuickAdapter
    public BaseViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        return super.onCreateDefViewHolder(parent, viewType);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.glority.android.adapterhelper.BaseViewHolder] */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public BaseViewHolder createBaseViewHolder(ViewGroup parent, int layoutResId) {
        if (parent == null) {
            return super.createBaseViewHolder(parent, layoutResId);
        }
        LayoutInflater layoutInflater = this.mLayoutInflater;
        Intrinsics.checkNotNull(layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.chatbot_container_layout, parent, false);
        LayoutInflater layoutInflater2 = this.mLayoutInflater;
        Intrinsics.checkNotNull(layoutInflater2);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        layoutInflater2.inflate(layoutResId, (ViewGroup) inflate, true);
        return createBaseViewHolder(inflate);
    }
}
