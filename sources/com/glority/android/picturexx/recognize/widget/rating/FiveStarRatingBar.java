package com.glority.android.picturexx.recognize.widget.rating;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.recognize.widget.rating.FiveStarRatingBar;
import com.glority.base.R;
import com.glority.base.databinding.WidgetFiveStarRatingBarBinding;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FiveStarRatingBar.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u0007J\u0006\u0010\u001a\u001a\u00020\u0007J\b\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/rating/FiveStarRatingBar;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleInt", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/base/databinding/WidgetFiveStarRatingBarBinding;", "onRatingChangeListener", "Lcom/glority/android/picturexx/recognize/widget/rating/FiveStarRatingBar$OnRatingChangeListener;", "starList", "", "Landroid/widget/ImageView;", "getStarList", "()Ljava/util/List;", "starList$delegate", "Lkotlin/Lazy;", "rating", "setOnRatingChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setRating", "getRating", "initListener", "clearStars", "OnRatingChangeListener", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class FiveStarRatingBar extends LinearLayout {
    public static final int $stable = 8;
    private final WidgetFiveStarRatingBarBinding binding;
    private OnRatingChangeListener onRatingChangeListener;
    private int rating;

    /* renamed from: starList$delegate, reason: from kotlin metadata */
    private final Lazy starList;

    /* compiled from: FiveStarRatingBar.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/recognize/widget/rating/FiveStarRatingBar$OnRatingChangeListener;", "", "onChanged", "", "view", "Lcom/glority/android/picturexx/recognize/widget/rating/FiveStarRatingBar;", "rating", "", "fromUser", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface OnRatingChangeListener {
        void onChanged(FiveStarRatingBar view, int rating, boolean fromUser);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiveStarRatingBar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FiveStarRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FiveStarRatingBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiveStarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.widget_five_star_rating_bar, this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = (WidgetFiveStarRatingBarBinding) inflate;
        this.starList = LazyKt.lazy(new Function0<List<? extends ImageView>>() { // from class: com.glority.android.picturexx.recognize.widget.rating.FiveStarRatingBar$starList$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends ImageView> invoke() {
                WidgetFiveStarRatingBarBinding widgetFiveStarRatingBarBinding;
                WidgetFiveStarRatingBarBinding widgetFiveStarRatingBarBinding2;
                WidgetFiveStarRatingBarBinding widgetFiveStarRatingBarBinding3;
                WidgetFiveStarRatingBarBinding widgetFiveStarRatingBarBinding4;
                WidgetFiveStarRatingBarBinding widgetFiveStarRatingBarBinding5;
                widgetFiveStarRatingBarBinding = FiveStarRatingBar.this.binding;
                ImageView imageView = widgetFiveStarRatingBarBinding.ivStar1;
                widgetFiveStarRatingBarBinding2 = FiveStarRatingBar.this.binding;
                ImageView imageView2 = widgetFiveStarRatingBarBinding2.ivStar2;
                widgetFiveStarRatingBarBinding3 = FiveStarRatingBar.this.binding;
                ImageView imageView3 = widgetFiveStarRatingBarBinding3.ivStar3;
                widgetFiveStarRatingBarBinding4 = FiveStarRatingBar.this.binding;
                ImageView imageView4 = widgetFiveStarRatingBarBinding4.ivStar4;
                widgetFiveStarRatingBarBinding5 = FiveStarRatingBar.this.binding;
                return CollectionsKt.listOf((Object[]) new ImageView[]{imageView, imageView2, imageView3, imageView4, widgetFiveStarRatingBarBinding5.ivStar5});
            }
        });
        initListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ImageView> getStarList() {
        return (List) this.starList.getValue();
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
            ViewExtensionsKt.setSingleClickListener$default((ImageView) obj, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.widget.rating.FiveStarRatingBar$initListener$1$1
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
                    FiveStarRatingBar fiveStarRatingBar = FiveStarRatingBar.this;
                    int i3 = i;
                    try {
                        fiveStarRatingBar.clearStars();
                        if (i3 >= 0) {
                            int i4 = 0;
                            while (true) {
                                starList = fiveStarRatingBar.getStarList();
                                ((ImageView) starList.get(i4)).setSelected(true);
                                if (i4 == i3) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                        int i5 = i3 + 1;
                        fiveStarRatingBar.rating = i5;
                        onRatingChangeListener = fiveStarRatingBar.onRatingChangeListener;
                        if (onRatingChangeListener != null) {
                            onRatingChangeListener.onChanged(fiveStarRatingBar, i5, true);
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
