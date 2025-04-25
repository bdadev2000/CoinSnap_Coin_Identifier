package com.glority.android.picturexx.views;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.LayoutCollectionSetsTabViewBinding;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectionSetsTabView.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u0007J\u0006\u0010\u0013\u001a\u00020\u0007J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionSetsTabView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/glority/android/picturexx/business/databinding/LayoutCollectionSetsTabViewBinding;", "tabIndex", "setOnTabClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/android/picturexx/views/CollectionSetsTabView$OnTabClickListener;", "setTabIndex", "index", "getCurrentTabIndex", "selectTab", "textView", "Landroidx/appcompat/widget/AppCompatTextView;", "unSelectTab", "OnTabClickListener", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectionSetsTabView extends LinearLayout {
    public static final int $stable = 8;
    private final LayoutCollectionSetsTabViewBinding binding;
    private int tabIndex;

    /* compiled from: CollectionSetsTabView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/android/picturexx/views/CollectionSetsTabView$OnTabClickListener;", "", "onTabClick", "", "index", "", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface OnTabClickListener {
        void onTabClick(int index);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionSetsTabView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollectionSetsTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CollectionSetsTabView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSetsTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutCollectionSetsTabViewBinding inflate = LayoutCollectionSetsTabViewBinding.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    public final void setOnTabClickListener(final OnTabClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.binding.setsMySetsTab.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.views.CollectionSetsTabView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionSetsTabView.setOnTabClickListener$lambda$0(CollectionSetsTabView.this, listener, view);
            }
        });
        this.binding.setsOfficialSetTab.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.views.CollectionSetsTabView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectionSetsTabView.setOnTabClickListener$lambda$1(CollectionSetsTabView.this, listener, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnTabClickListener$lambda$0(CollectionSetsTabView this$0, OnTabClickListener listener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        this$0.setTabIndex(0);
        listener.onTabClick(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnTabClickListener$lambda$1(CollectionSetsTabView this$0, OnTabClickListener listener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        this$0.setTabIndex(1);
        listener.onTabClick(1);
    }

    public final void setTabIndex(int index) {
        this.tabIndex = index;
        if (index == 0) {
            AppCompatTextView setsMySetsTab = this.binding.setsMySetsTab;
            Intrinsics.checkNotNullExpressionValue(setsMySetsTab, "setsMySetsTab");
            selectTab(setsMySetsTab);
            AppCompatTextView setsOfficialSetTab = this.binding.setsOfficialSetTab;
            Intrinsics.checkNotNullExpressionValue(setsOfficialSetTab, "setsOfficialSetTab");
            unSelectTab(setsOfficialSetTab);
            return;
        }
        if (index != 1) {
            return;
        }
        AppCompatTextView setsOfficialSetTab2 = this.binding.setsOfficialSetTab;
        Intrinsics.checkNotNullExpressionValue(setsOfficialSetTab2, "setsOfficialSetTab");
        selectTab(setsOfficialSetTab2);
        AppCompatTextView setsMySetsTab2 = this.binding.setsMySetsTab;
        Intrinsics.checkNotNullExpressionValue(setsMySetsTab2, "setsMySetsTab");
        unSelectTab(setsMySetsTab2);
    }

    /* renamed from: getCurrentTabIndex, reason: from getter */
    public final int getTabIndex() {
        return this.tabIndex;
    }

    private final void selectTab(AppCompatTextView textView) {
        textView.setTextColor(getResources().getColor(R.color.DarkGray, null));
        textView.setTypeface(Typeface.defaultFromStyle(1));
    }

    private final void unSelectTab(AppCompatTextView textView) {
        textView.setTextColor(getResources().getColor(R.color.Grey666666, null));
        textView.setTypeface(Typeface.defaultFromStyle(0));
    }
}
