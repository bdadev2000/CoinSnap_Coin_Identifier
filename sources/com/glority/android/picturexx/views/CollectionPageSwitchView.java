package com.glority.android.picturexx.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ViewMeCollectionPageSwitchBinding;
import com.glority.android.picturexx.views.CollectionPageSwitchView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionPageSwitchView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u0007J\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0002R\u0012\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionPageSwitchView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "selectedIndex", "onPageSwitchListener", "Lcom/glority/android/picturexx/views/CollectionPageSwitchView$OnPageSwitchListener;", "binding", "Lcom/glority/android/picturexx/business/databinding/ViewMeCollectionPageSwitchBinding;", "setOnPageSwitchListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getSelectedIndex", "setSelectedIndex", "index", "startIndexChangeAnimation", "onAnimStart", "Lkotlin/Function0;", "OnPageSwitchListener", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionPageSwitchView extends ConstraintLayout {
    public static final int $stable = 8;
    private final ViewMeCollectionPageSwitchBinding binding;
    private OnPageSwitchListener onPageSwitchListener;
    private int selectedIndex;

    /* compiled from: CollectionPageSwitchView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionPageSwitchView$OnPageSwitchListener;", "", "onPageSwitch", "", "index", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface OnPageSwitchListener {
        void onPageSwitch(int index);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionPageSwitchView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionPageSwitchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CollectionPageSwitchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPageSwitchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewMeCollectionPageSwitchBinding inflate = ViewMeCollectionPageSwitchBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        AppCompatTextView tvSummary = inflate.tvSummary;
        Intrinsics.checkNotNullExpressionValue(tvSummary, "tvSummary");
        ViewExtensionsKt.setSingleClickListener$default(tvSummary, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionPageSwitchView.1
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
                Intrinsics.checkNotNullParameter(it, "it");
                CollectionPageSwitchView.this.setSelectedIndex(0);
            }
        }, 1, (Object) null);
        AppCompatTextView tvAll = inflate.tvAll;
        Intrinsics.checkNotNullExpressionValue(tvAll, "tvAll");
        ViewExtensionsKt.setSingleClickListener$default(tvAll, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionPageSwitchView.2
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
                Intrinsics.checkNotNullParameter(it, "it");
                CollectionPageSwitchView.this.setSelectedIndex(1);
            }
        }, 1, (Object) null);
        AppCompatTextView tvSets = inflate.tvSets;
        Intrinsics.checkNotNullExpressionValue(tvSets, "tvSets");
        ViewExtensionsKt.setSingleClickListener$default(tvSets, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.views.CollectionPageSwitchView.3
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
                Intrinsics.checkNotNullParameter(it, "it");
                CollectionPageSwitchView.this.setSelectedIndex(2);
            }
        }, 1, (Object) null);
        setSelectedIndex(0);
    }

    public final void setOnPageSwitchListener(OnPageSwitchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPageSwitchListener = listener;
    }

    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    public final void setSelectedIndex(final int index) {
        this.selectedIndex = index;
        startIndexChangeAnimation(index, new Function0<Unit>() { // from class: com.glority.android.picturexx.views.CollectionPageSwitchView$setSelectedIndex$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CollectionPageSwitchView.OnPageSwitchListener onPageSwitchListener;
                onPageSwitchListener = CollectionPageSwitchView.this.onPageSwitchListener;
                if (onPageSwitchListener != null) {
                    onPageSwitchListener.onPageSwitch(index);
                }
            }
        });
    }

    private final void startIndexChangeAnimation(int selectedIndex, Function0<Unit> onAnimStart) {
        this.binding.tvSummary.setTextColor(selectedIndex == 0 ? -1 : getContext().getColor(R.color.color_666666));
        this.binding.tvAll.setTextColor(selectedIndex == 1 ? -1 : getContext().getColor(R.color.color_666666));
        this.binding.tvSets.setTextColor(selectedIndex != 2 ? getContext().getColor(R.color.color_666666) : -1);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this.binding.clRoot);
        constraintSet.setHorizontalBias(this.binding.vBackground.getId(), selectedIndex / 2.0f);
        onAnimStart.invoke();
        constraintSet.applyTo(this.binding.clRoot);
    }
}
