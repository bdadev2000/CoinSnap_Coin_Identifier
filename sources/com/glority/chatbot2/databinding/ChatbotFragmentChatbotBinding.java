package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.chatbot2.R;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes6.dex */
public abstract class ChatbotFragmentChatbotBinding extends ViewDataBinding {
    public final EditText et;
    public final FrameLayout quickOptionContainer;
    public final RecyclerView rv;
    public final ImageView sendBt;
    public final Toolbar toolbar;
    public final AppBarLayout toolbarLayout1;

    /* JADX INFO: Access modifiers changed from: protected */
    public ChatbotFragmentChatbotBinding(Object obj, View view, int i, EditText editText, FrameLayout frameLayout, RecyclerView recyclerView, ImageView imageView, Toolbar toolbar, AppBarLayout appBarLayout) {
        super(obj, view, i);
        this.et = editText;
        this.quickOptionContainer = frameLayout;
        this.rv = recyclerView;
        this.sendBt = imageView;
        this.toolbar = toolbar;
        this.toolbarLayout1 = appBarLayout;
    }

    public static ChatbotFragmentChatbotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotFragmentChatbotBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ChatbotFragmentChatbotBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.chatbot_fragment_chatbot, viewGroup, z, obj);
    }

    public static ChatbotFragmentChatbotBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotFragmentChatbotBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ChatbotFragmentChatbotBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.chatbot_fragment_chatbot, null, false, obj);
    }

    public static ChatbotFragmentChatbotBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotFragmentChatbotBinding bind(View view, Object obj) {
        return (ChatbotFragmentChatbotBinding) bind(obj, view, R.layout.chatbot_fragment_chatbot);
    }
}
