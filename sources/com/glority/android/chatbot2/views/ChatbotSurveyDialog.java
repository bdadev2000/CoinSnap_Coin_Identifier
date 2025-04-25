package com.glority.android.chatbot2.views;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.glority.android.chatbot2.widget.ChatbotScrollableEditText;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.chatbot2.R;
import com.glority.chatbot2.databinding.ChatbotDialogChatbotSurveyBinding;
import com.glority.utils.app.ResUtils;
import com.glority.widget.GlTextView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatbotSurveyDialog.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/glority/android/chatbot2/views/ChatbotSurveyDialog;", "Landroidx/fragment/app/DialogFragment;", "()V", "buttonColor", "", "(I)V", "binding", "Lcom/glority/chatbot2/databinding/ChatbotDialogChatbotSurveyBinding;", "callback", "Lcom/glority/android/chatbot2/views/OnClickCallback;", "initStar", "initListener", "", "initView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onViewCreated", "view", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class ChatbotSurveyDialog extends DialogFragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private ChatbotDialogChatbotSurveyBinding binding;
    private final int buttonColor;
    private OnClickCallback callback;
    private int initStar;

    @JvmStatic
    public static final void show(int i, int i2, OnClickCallback onClickCallback, FragmentManager fragmentManager) {
        INSTANCE.show(i, i2, onClickCallback, fragmentManager);
    }

    public ChatbotSurveyDialog(int i) {
        this.buttonColor = i;
    }

    public static final /* synthetic */ ChatbotDialogChatbotSurveyBinding access$getBinding$p(ChatbotSurveyDialog chatbotSurveyDialog) {
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding = chatbotSurveyDialog.binding;
        if (chatbotDialogChatbotSurveyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        return chatbotDialogChatbotSurveyBinding;
    }

    /* compiled from: ChatbotSurveyDialog.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0003\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\f"}, d2 = {"Lcom/glority/android/chatbot2/views/ChatbotSurveyDialog$Companion;", "", "()V", "show", "", "buttonColor", "", "initStar", "callback", "Lcom/glority/android/chatbot2/views/OnClickCallback;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void show$default(Companion companion, int i, int i2, OnClickCallback onClickCallback, FragmentManager fragmentManager, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = R.color.ChatBotSurveyThemeColor;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            companion.show(i, i2, onClickCallback, fragmentManager);
        }

        @JvmStatic
        public final void show(int buttonColor, int initStar, OnClickCallback callback, FragmentManager fragmentManager) {
            if (fragmentManager != null) {
                ChatbotSurveyDialog chatbotSurveyDialog = new ChatbotSurveyDialog(buttonColor);
                chatbotSurveyDialog.initStar = initStar;
                chatbotSurveyDialog.callback = callback;
                chatbotSurveyDialog.show(fragmentManager, "ChatbotSurveyDialog");
            }
        }
    }

    public ChatbotSurveyDialog() {
        this(R.color.ChatBotSurveyThemeColor);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        Window window;
        Window window2;
        super.onActivityCreated(savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ViewDataBinding inflate = DataBindingUtil.inflate(inflater, R.layout.chatbot_dialog_chatbot_survey, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…survey, container, false)");
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding = (ChatbotDialogChatbotSurveyBinding) inflate;
        this.binding = chatbotDialogChatbotSurveyBinding;
        if (chatbotDialogChatbotSurveyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        View root = chatbotDialogChatbotSurveyBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        initView();
        initListener();
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding = this.binding;
        if (chatbotDialogChatbotSurveyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        chatbotDialogChatbotSurveyBinding.etContent.requestFocus();
    }

    private final void initView() {
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding = this.binding;
        if (chatbotDialogChatbotSurveyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        chatbotDialogChatbotSurveyBinding.ratingBar.setRating(this.initStar);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        int[] iArr = new int[2];
        for (int i = 0; i < 2; i++) {
            iArr[i] = getResources().getColor(this.buttonColor);
        }
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
        gradientDrawable.setCornerRadius(ResUtils.getDimension(R.dimen.x100));
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding2 = this.binding;
        if (chatbotDialogChatbotSurveyBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = chatbotDialogChatbotSurveyBinding2.tvSubmit;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSubmit");
        textView.setBackground(gradientDrawable);
    }

    private final void initListener() {
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding = this.binding;
        if (chatbotDialogChatbotSurveyBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        ImageView imageView = chatbotDialogChatbotSurveyBinding.tvSurveyClose;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.tvSurveyClose");
        ViewExtensionsKt.setSingleClickListener$default(imageView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.chatbot2.views.ChatbotSurveyDialog$initListener$1
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
                OnClickCallback onClickCallback;
                Intrinsics.checkNotNullParameter(it, "it");
                onClickCallback = ChatbotSurveyDialog.this.callback;
                if (onClickCallback != null) {
                    ChatbotSurveyDialog chatbotSurveyDialog = ChatbotSurveyDialog.this;
                    onClickCallback.onDismissClick(chatbotSurveyDialog, ChatbotSurveyDialog.access$getBinding$p(chatbotSurveyDialog).ratingBar.getRating());
                }
                ChatbotSurveyDialog.this.dismiss();
            }
        }, 1, (Object) null);
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding2 = this.binding;
        if (chatbotDialogChatbotSurveyBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        GlTextView glTextView = chatbotDialogChatbotSurveyBinding2.tvDontShowAgain;
        Intrinsics.checkNotNullExpressionValue(glTextView, "binding.tvDontShowAgain");
        ViewExtensionsKt.setSingleClickListener$default(glTextView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.chatbot2.views.ChatbotSurveyDialog$initListener$2
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
                OnClickCallback onClickCallback;
                Intrinsics.checkNotNullParameter(it, "it");
                onClickCallback = ChatbotSurveyDialog.this.callback;
                if (onClickCallback != null) {
                    ChatbotSurveyDialog chatbotSurveyDialog = ChatbotSurveyDialog.this;
                    onClickCallback.dontShowAgain(chatbotSurveyDialog, ChatbotSurveyDialog.access$getBinding$p(chatbotSurveyDialog).ratingBar.getRating());
                }
                ChatbotSurveyDialog.this.dismiss();
            }
        }, 1, (Object) null);
        ChatbotDialogChatbotSurveyBinding chatbotDialogChatbotSurveyBinding3 = this.binding;
        if (chatbotDialogChatbotSurveyBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        }
        TextView textView = chatbotDialogChatbotSurveyBinding3.tvSubmit;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvSubmit");
        ViewExtensionsKt.setSingleClickListener$default(textView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.chatbot2.views.ChatbotSurveyDialog$initListener$3
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
                OnClickCallback onClickCallback;
                Intrinsics.checkNotNullParameter(it, "it");
                int rating = ChatbotSurveyDialog.access$getBinding$p(ChatbotSurveyDialog.this).ratingBar.getRating();
                ChatbotScrollableEditText chatbotScrollableEditText = ChatbotSurveyDialog.access$getBinding$p(ChatbotSurveyDialog.this).etContent;
                Intrinsics.checkNotNullExpressionValue(chatbotScrollableEditText, "binding.etContent");
                Editable text = chatbotScrollableEditText.getText();
                String obj = text != null ? text.toString() : null;
                onClickCallback = ChatbotSurveyDialog.this.callback;
                if (onClickCallback != null) {
                    onClickCallback.onSubmitClick(ChatbotSurveyDialog.this, rating, obj);
                }
                ChatbotSurveyDialog.this.dismiss();
            }
        }, 1, (Object) null);
    }
}
