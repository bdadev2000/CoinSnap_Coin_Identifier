package com.glority.android.chatbot2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.chatbot2.widget.FiveStarRatingBar;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.chatbot2.R;
import com.glority.chatbot2.databinding.ChatbotWidgetFiveStarRatingBarBinding;
import com.glority.utils.stability.LogUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FiveStarRatingBar.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0007J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\fJ\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/glority/android/chatbot2/widget/FiveStarRatingBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleInt", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/chatbot2/databinding/ChatbotWidgetFiveStarRatingBarBinding;", "onRatingChangeListener", "Lcom/glority/android/chatbot2/widget/FiveStarRatingBar$OnRatingChangeListener;", "rating", "starList", "", "Landroid/widget/ImageView;", "getStarList", "()Ljava/util/List;", "starList$delegate", "Lkotlin/Lazy;", "clearStars", "", "getRating", "initListener", "setOnRatingChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setRating", "OnRatingChangeListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class FiveStarRatingBar extends LinearLayout {
    private final ChatbotWidgetFiveStarRatingBarBinding binding;
    private OnRatingChangeListener onRatingChangeListener;
    private int rating;

    /* renamed from: starList$delegate, reason: from kotlin metadata */
    private final Lazy starList;

    /* compiled from: FiveStarRatingBar.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/glority/android/chatbot2/widget/FiveStarRatingBar$OnRatingChangeListener;", "", "onChanged", "", "view", "Lcom/glority/android/chatbot2/widget/FiveStarRatingBar;", "rating", "", "fromUser", "", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public interface OnRatingChangeListener {
        void onChanged(FiveStarRatingBar view, int rating, boolean fromUser);
    }

    public FiveStarRatingBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public FiveStarRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ImageView> getStarList() {
        return (List) this.starList.getValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ FiveStarRatingBar(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L8
            r2 = 0
            r5 = r2
            android.util.AttributeSet r5 = (android.util.AttributeSet) r5
        L8:
            r4 = r4 & 4
            if (r4 == 0) goto Ld
            r3 = 0
        Ld:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.chatbot2.widget.FiveStarRatingBar.<init>(android.content.Context, android.util.AttributeSet, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiveStarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.chatbot_widget_five_star_rating_bar, this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "DataBindingUtil.inflate(…r_rating_bar, this, true)");
        this.binding = (ChatbotWidgetFiveStarRatingBarBinding) inflate;
        this.starList = LazyKt.lazy(new Function0<List<? extends ImageView>>() { // from class: com.glority.android.chatbot2.widget.FiveStarRatingBar$starList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends ImageView> invoke() {
                ChatbotWidgetFiveStarRatingBarBinding chatbotWidgetFiveStarRatingBarBinding;
                ChatbotWidgetFiveStarRatingBarBinding chatbotWidgetFiveStarRatingBarBinding2;
                ChatbotWidgetFiveStarRatingBarBinding chatbotWidgetFiveStarRatingBarBinding3;
                ChatbotWidgetFiveStarRatingBarBinding chatbotWidgetFiveStarRatingBarBinding4;
                ChatbotWidgetFiveStarRatingBarBinding chatbotWidgetFiveStarRatingBarBinding5;
                chatbotWidgetFiveStarRatingBarBinding = FiveStarRatingBar.this.binding;
                ImageView imageView = chatbotWidgetFiveStarRatingBarBinding.ivStar1;
                chatbotWidgetFiveStarRatingBarBinding2 = FiveStarRatingBar.this.binding;
                ImageView imageView2 = chatbotWidgetFiveStarRatingBarBinding2.ivStar2;
                chatbotWidgetFiveStarRatingBarBinding3 = FiveStarRatingBar.this.binding;
                ImageView imageView3 = chatbotWidgetFiveStarRatingBarBinding3.ivStar3;
                chatbotWidgetFiveStarRatingBarBinding4 = FiveStarRatingBar.this.binding;
                ImageView imageView4 = chatbotWidgetFiveStarRatingBarBinding4.ivStar4;
                chatbotWidgetFiveStarRatingBarBinding5 = FiveStarRatingBar.this.binding;
                return CollectionsKt.listOf((Object[]) new ImageView[]{imageView, imageView2, imageView3, imageView4, chatbotWidgetFiveStarRatingBarBinding5.ivStar5});
            }
        });
        initListener();
    }

    public final void setOnRatingChangeListener(OnRatingChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onRatingChangeListener = listener;
    }

    public final void setRating(int rating) {
        if (rating <= 0) {
            clearStars();
            this.rating = 0;
            OnRatingChangeListener onRatingChangeListener = this.onRatingChangeListener;
            if (onRatingChangeListener != null) {
                onRatingChangeListener.onChanged(this, 0, false);
                return;
            }
            return;
        }
        if (rating >= 5) {
            clearStars();
            Iterator<T> it = getStarList().iterator();
            while (it.hasNext()) {
                ((ImageView) it.next()).setSelected(true);
            }
            this.rating = 5;
            OnRatingChangeListener onRatingChangeListener2 = this.onRatingChangeListener;
            if (onRatingChangeListener2 != null) {
                onRatingChangeListener2.onChanged(this, 5, false);
                return;
            }
            return;
        }
        clearStars();
        for (int i = 0; i < rating; i++) {
            ImageView imageView = (ImageView) CollectionsKt.getOrNull(getStarList(), i);
            if (imageView != null) {
                imageView.setSelected(true);
            }
        }
        this.rating = rating;
        OnRatingChangeListener onRatingChangeListener3 = this.onRatingChangeListener;
        if (onRatingChangeListener3 != null) {
            onRatingChangeListener3.onChanged(this, rating, false);
        }
    }

    public final int getRating() {
        return this.rating;
    }

    private final void initListener() {
        final int i = 0;
        for (Object obj : getStarList()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ViewExtensionsKt.setSingleClickListener$default((ImageView) obj, 0L, new Function1<View, Unit>() { // from class: com.glority.android.chatbot2.widget.FiveStarRatingBar$initListener$$inlined$forEachIndexed$lambda$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    FiveStarRatingBar.OnRatingChangeListener onRatingChangeListener;
                    List starList;
                    Intrinsics.checkNotNullParameter(it, "it");
                    try {
                        this.clearStars();
                        int i3 = i;
                        if (i3 >= 0) {
                            int i4 = 0;
                            while (true) {
                                starList = this.getStarList();
                                ((ImageView) starList.get(i4)).setSelected(true);
                                if (i4 == i3) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        this.rating = i + 1;
                        onRatingChangeListener = this.onRatingChangeListener;
                        if (onRatingChangeListener != null) {
                            onRatingChangeListener.onChanged(this, i + 1, true);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }, 1, (Object) null);
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearStars() {
        for (ImageView imageView : getStarList()) {
            if (imageView.isSelected()) {
                imageView.setSelected(false);
            }
        }
    }
}
