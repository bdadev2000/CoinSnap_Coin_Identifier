package com.glority.android.chatbot2.config;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.glority.android.chatbot2.adapterviews.IChatbotAdapterView;
import com.glority.android.chatbot2.adapterviews.LoadingView;
import com.glority.android.chatbot2.adapterviews.ServerTextView;
import com.glority.android.chatbot2.adapterviews.UserTextView;
import com.glority.android.xx.constants.Args;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotUiConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001IB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001e\u0010-\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u0014R\u001c\u00100\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010!R\"\u00103\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u0014R\"\u00106\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u0014R \u00109\u001a\b\u0012\u0004\u0012\u00020;0:X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020AX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006J"}, d2 = {"Lcom/glority/android/chatbot2/config/ChatbotUiConfig;", "", "sendButtonIcon", "", "(I)V", "backgroundDrawable", "Landroid/graphics/drawable/Drawable;", "getBackgroundDrawable", "()Landroid/graphics/drawable/Drawable;", "setBackgroundDrawable", "(Landroid/graphics/drawable/Drawable;)V", "bottomQuickOptionViewLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/view/View;", "getBottomQuickOptionViewLiveData", "()Landroidx/lifecycle/MutableLiveData;", "chatbotAvatar", "getChatbotAvatar", "()Ljava/lang/Integer;", "setChatbotAvatar", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "chatbotTextColor", "getChatbotTextColor", "setChatbotTextColor", "chatbotTextMsgBackgrouColor", "getChatbotTextMsgBackgrouColor", "setChatbotTextMsgBackgrouColor", "editHint", "", "getEditHint", "()Ljava/lang/String;", "setEditHint", "(Ljava/lang/String;)V", "onBackPressListener", "Lcom/glority/android/chatbot2/config/ChatbotUiConfig$OnBackPressListener;", "getOnBackPressListener", "()Lcom/glority/android/chatbot2/config/ChatbotUiConfig$OnBackPressListener;", "setOnBackPressListener", "(Lcom/glority/android/chatbot2/config/ChatbotUiConfig$OnBackPressListener;)V", "selectedColor", "getSelectedColor", "setSelectedColor", "getSendButtonIcon", "()I", "textMaxWidth", "getTextMaxWidth", "setTextMaxWidth", Args.title, "getTitle", "setTitle", "userTextColor", "getUserTextColor", "setUserTextColor", "userTextMsgBackgrouColor", "getUserTextMsgBackgrouColor", "setUserTextMsgBackgrouColor", "views", "", "Lcom/glority/android/chatbot2/adapterviews/IChatbotAdapterView;", "getViews", "()Ljava/util/List;", "setViews", "(Ljava/util/List;)V", "visibleToolBar", "", "getVisibleToolBar", "()Z", "setVisibleToolBar", "(Z)V", "setBottomQuickOptionView", "", "view", "OnBackPressListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotUiConfig {
    private Drawable backgroundDrawable;
    private Integer chatbotAvatar;
    private Integer chatbotTextColor;
    private Integer chatbotTextMsgBackgrouColor;
    private String editHint;
    private OnBackPressListener onBackPressListener;
    private Integer selectedColor;
    private final int sendButtonIcon;
    private Integer textMaxWidth;
    private String title;
    private Integer userTextColor;
    private Integer userTextMsgBackgrouColor;
    private boolean visibleToolBar = true;
    private List<IChatbotAdapterView> views = CollectionsKt.mutableListOf(new UserTextView(), new ServerTextView(), new LoadingView());
    private final MutableLiveData<View> bottomQuickOptionViewLiveData = new MutableLiveData<>();

    /* compiled from: ChatbotUiConfig.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/chatbot2/config/ChatbotUiConfig$OnBackPressListener;", "", "onBackPress", "", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function0;", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public interface OnBackPressListener {
        boolean onBackPress(Function0<Unit> method);
    }

    public ChatbotUiConfig(int i) {
        this.sendButtonIcon = i;
    }

    public final int getSendButtonIcon() {
        return this.sendButtonIcon;
    }

    public final OnBackPressListener getOnBackPressListener() {
        return this.onBackPressListener;
    }

    public final void setOnBackPressListener(OnBackPressListener onBackPressListener) {
        this.onBackPressListener = onBackPressListener;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final Integer getChatbotAvatar() {
        return this.chatbotAvatar;
    }

    public final void setChatbotAvatar(Integer num) {
        this.chatbotAvatar = num;
    }

    public final Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        this.backgroundDrawable = drawable;
    }

    public final Integer getChatbotTextMsgBackgrouColor() {
        return this.chatbotTextMsgBackgrouColor;
    }

    public final void setChatbotTextMsgBackgrouColor(Integer num) {
        this.chatbotTextMsgBackgrouColor = num;
    }

    public final Integer getUserTextMsgBackgrouColor() {
        return this.userTextMsgBackgrouColor;
    }

    public final void setUserTextMsgBackgrouColor(Integer num) {
        this.userTextMsgBackgrouColor = num;
    }

    public final Integer getChatbotTextColor() {
        return this.chatbotTextColor;
    }

    public final void setChatbotTextColor(Integer num) {
        this.chatbotTextColor = num;
    }

    public final Integer getUserTextColor() {
        return this.userTextColor;
    }

    public final void setUserTextColor(Integer num) {
        this.userTextColor = num;
    }

    public final Integer getSelectedColor() {
        return this.selectedColor;
    }

    public final void setSelectedColor(Integer num) {
        this.selectedColor = num;
    }

    public final String getEditHint() {
        return this.editHint;
    }

    public final void setEditHint(String str) {
        this.editHint = str;
    }

    public final boolean getVisibleToolBar() {
        return this.visibleToolBar;
    }

    public final void setVisibleToolBar(boolean z) {
        this.visibleToolBar = z;
    }

    public final Integer getTextMaxWidth() {
        return this.textMaxWidth;
    }

    public final void setTextMaxWidth(Integer num) {
        this.textMaxWidth = num;
    }

    public final List<IChatbotAdapterView> getViews() {
        return this.views;
    }

    public final void setViews(List<IChatbotAdapterView> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.views = list;
    }

    public final MutableLiveData<View> getBottomQuickOptionViewLiveData() {
        return this.bottomQuickOptionViewLiveData;
    }

    public final void setBottomQuickOptionView(View view) {
        this.bottomQuickOptionViewLiveData.postValue(view);
    }
}
