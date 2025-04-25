package com.glority.chatbot2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.chatbot2.R;

/* loaded from: classes6.dex */
public abstract class ChatbotWidgetFiveStarRatingBarBinding extends ViewDataBinding {
    public final ImageView ivStar1;
    public final ImageView ivStar2;
    public final ImageView ivStar3;
    public final ImageView ivStar4;
    public final ImageView ivStar5;

    /* JADX INFO: Access modifiers changed from: protected */
    public ChatbotWidgetFiveStarRatingBarBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        super(obj, view, i);
        this.ivStar1 = imageView;
        this.ivStar2 = imageView2;
        this.ivStar3 = imageView3;
        this.ivStar4 = imageView4;
        this.ivStar5 = imageView5;
    }

    public static ChatbotWidgetFiveStarRatingBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotWidgetFiveStarRatingBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ChatbotWidgetFiveStarRatingBarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.chatbot_widget_five_star_rating_bar, viewGroup, z, obj);
    }

    public static ChatbotWidgetFiveStarRatingBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotWidgetFiveStarRatingBarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ChatbotWidgetFiveStarRatingBarBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.chatbot_widget_five_star_rating_bar, null, false, obj);
    }

    public static ChatbotWidgetFiveStarRatingBarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ChatbotWidgetFiveStarRatingBarBinding bind(View view, Object obj) {
        return (ChatbotWidgetFiveStarRatingBarBinding) bind(obj, view, R.layout.chatbot_widget_five_star_rating_bar);
    }
}
