package com.glority.android.cmsui.entity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.glority.android.cms.common.CmsMarkdown;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.core.ext.ViewExtensionsKt;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ConditionItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
/* loaded from: classes14.dex */
final class ConditionItem$renderConditionSection$render$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ LayoutInflater $inflater;
    final /* synthetic */ boolean $isFold;
    final /* synthetic */ LinearLayout $llContainer;
    final /* synthetic */ Function1 $logEvent;
    final /* synthetic */ Markwon $markwon;
    final /* synthetic */ boolean $showIcon;
    final /* synthetic */ ConditionItem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConditionItem$renderConditionSection$render$1(ConditionItem conditionItem, LinearLayout linearLayout, boolean z, LayoutInflater layoutInflater, Markwon markwon, boolean z2, Function1 function1) {
        super(1);
        this.this$0 = conditionItem;
        this.$llContainer = linearLayout;
        this.$isFold = z;
        this.$inflater = layoutInflater;
        this.$markwon = markwon;
        this.$showIcon = z2;
        this.$logEvent = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final int i) {
        this.$llContainer.removeAllViews();
        int i2 = 0;
        for (Object obj : this.this$0.getChilds()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ConditionSubItem conditionSubItem = (ConditionSubItem) obj;
            if (!this.$isFold || i2 < i) {
                View llSubContainer = this.$inflater.inflate(R.layout.item_cms_condition_sub, (ViewGroup) this.$llContainer, false);
                TextView textView = (TextView) llSubContainer.findViewById(R.id.tv_condition_key);
                TextView textView2 = (TextView) llSubContainer.findViewById(R.id.tv_conditions_value);
                ImageView ivConditionIcon = (ImageView) llSubContainer.findViewById(R.id.iv_conditions_icon);
                CmsMarkdown.INSTANCE.setText(this.$markwon, textView, conditionSubItem.getDisplayTagName());
                CmsMarkdown.INSTANCE.setText(this.$markwon, textView2, conditionSubItem.getValue());
                if (this.$showIcon) {
                    Intrinsics.checkNotNullExpressionValue(Glide.with(ivConditionIcon).load(conditionSubItem.getIconUrl()).into(ivConditionIcon), "Glide.with(ivConditionIc…rl).into(ivConditionIcon)");
                } else {
                    Intrinsics.checkNotNullExpressionValue(ivConditionIcon, "ivConditionIcon");
                    ivConditionIcon.setVisibility(8);
                }
                View findViewById = llSubContainer.findViewById(R.id.iv_conditions_arrow);
                Intrinsics.checkNotNullExpressionValue(findViewById, "llSubContainer.findViewB…R.id.iv_conditions_arrow)");
                ((ImageView) findViewById).setVisibility(this.this$0.getHasCareDetail() ? 0 : 8);
                this.$llContainer.addView(llSubContainer);
                Intrinsics.checkNotNullExpressionValue(llSubContainer, "llSubContainer");
                ViewExtensionsKt.setSingleClickListener$default(llSubContainer, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.ConditionItem$renderConditionSection$render$1$$special$$inlined$forEachIndexed$lambda$1
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
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (this.this$0.getHasCareDetail()) {
                            this.$logEvent.invoke("_item");
                            ClickListener<ConditionSubItem> itemClick = this.this$0.getItemClick();
                            if (itemClick != null) {
                                itemClick.onClick(it, ConditionSubItem.this);
                            }
                        }
                    }
                }, 1, (Object) null);
                llSubContainer.setClickable(this.this$0.getHasCareDetail());
            }
            i2 = i3;
        }
    }
}
