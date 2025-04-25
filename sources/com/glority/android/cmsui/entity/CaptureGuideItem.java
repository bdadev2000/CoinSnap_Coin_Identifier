package com.glority.android.cmsui.entity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.common.PersistKey;
import com.glority.android.cmsui.util.TipViewRender;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureGuideItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R$\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/glority/android/cmsui/entity/CaptureGuideItem;", "Lcom/glority/android/cms/base/BaseItem;", "()V", "capture", "Lcom/glority/android/cms/listener/ClickListener;", "", "getCapture", "()Lcom/glority/android/cms/listener/ClickListener;", "setCapture", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getLayoutId", "", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CaptureGuideItem extends BaseItem {
    private ClickListener<Object> capture;

    public CaptureGuideItem() {
        super("");
    }

    public final ClickListener<Object> getCapture() {
        return this.capture;
    }

    public final void setCapture(ClickListener<Object> clickListener) {
        this.capture = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_tips_taking;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        Object obj = PersistData.INSTANCE.get(PersistKey.CMS_TIPS_CHECK, false);
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final LinearLayout linearLayout = (LinearLayout) helper.getView(R.id.ll_tips);
        TipViewRender.INSTANCE.render(linearLayout, R.dimen.x48, (int) ResUtils.getDimension(R.dimen.x44));
        View retakeView = LayoutInflater.from(context).inflate(R.layout.item_retake, (ViewGroup) linearLayout, false);
        linearLayout.addView(retakeView);
        final ViewGroup viewGroup = (ViewGroup) helper.getView(R.id.show_more_container);
        viewGroup.setVisibility(booleanValue ? 8 : 0);
        linearLayout.getLayoutParams().height = booleanValue ? -2 : (int) ResUtils.getDimension(R.dimen.x500);
        ViewExtensionsKt.setSingleClickListener$default(viewGroup, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.CaptureGuideItem$render$1
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
                new LogEventRequest(CmsUILogEvents.CONFUSION_MORE, null, 2, null).post();
                linearLayout.getLayoutParams().height = -2;
                PersistData.INSTANCE.set(PersistKey.CMS_TIPS_CHECK, true);
                viewGroup.setVisibility(8);
            }
        }, 1, (Object) null);
        Intrinsics.checkNotNullExpressionValue(retakeView, "retakeView");
        ViewExtensionsKt.setSingleClickListener$default(retakeView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.cmsui.entity.CaptureGuideItem$render$2
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
                Intrinsics.checkNotNullParameter(it, "it");
                ClickListener<Object> capture = CaptureGuideItem.this.getCapture();
                if (capture != null) {
                    capture.onClick(it, null);
                }
            }
        }, 1, (Object) null);
    }
}
