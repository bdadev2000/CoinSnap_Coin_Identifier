package com.glority.android.cmsui.adapter;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cmsui.BaseMultiEntity;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.model.CmsImage;
import com.glority.android.cmsui.model.CmsObject;
import com.glority.android.cmsui.routers.GetDefaultHeaderImageDrawableRequest;
import com.glority.android.core.app.AppContext;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InfoHeaderVpAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J(\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/glority/android/cmsui/adapter/InfoHeaderVpAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/cmsui/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "()V", "currentPosition", "", "getCurrentPosition", "()I", "setCurrentPosition", "(I)V", "convert", "", "helper", "item", "convertPayloads", "payloads", "", "", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class InfoHeaderVpAdapter extends BaseQuickAdapter<BaseMultiEntity, BaseViewHolder> {
    public static final int ITEM_TYPE_INFO = 0;
    public static final int ITEM_TYPE_NO_MATCH = 1;
    public static final int PAYLOAD_SELECTED = 1;
    private int currentPosition;

    public InfoHeaderVpAdapter() {
        super(R.layout.item_info_header_vp, null, 2, null);
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void convertPayloads(BaseViewHolder baseViewHolder, BaseMultiEntity baseMultiEntity, List list) {
        convertPayloads2(baseViewHolder, baseMultiEntity, (List<Object>) list);
    }

    public final int getCurrentPosition() {
        return this.currentPosition;
    }

    public final void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, BaseMultiEntity item) {
        Object item2;
        int i;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        if (item.getItemType() == 0) {
            Object item3 = item.getItem();
            if (item3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.glority.android.cmsui.model.CmsObject");
            }
            CmsImage cmsImage = (CmsImage) CollectionsKt.getOrNull(((CmsObject) item3).getMatchedSimilarImages(), 0);
            if (cmsImage == null || (item2 = cmsImage.getImageUrl()) == null) {
                try {
                    item2 = Integer.valueOf(new GetDefaultHeaderImageDrawableRequest().toResult().intValue());
                } catch (Exception e) {
                    if (AppContext.INSTANCE.isDebugMode()) {
                        LogUtils.e(Log.getStackTraceString(e));
                    }
                    item2 = Integer.valueOf(R.drawable.image_loading_place_holder_circle);
                }
            }
            TextView tv_no_match = (TextView) view.findViewById(R.id.tv_no_match);
            Intrinsics.checkNotNullExpressionValue(tv_no_match, "tv_no_match");
            tv_no_match.setVisibility(8);
        } else {
            item2 = item.getItem();
            TextView tv_no_match2 = (TextView) view.findViewById(R.id.tv_no_match);
            Intrinsics.checkNotNullExpressionValue(tv_no_match2, "tv_no_match");
            tv_no_match2.setVisibility(0);
        }
        RequestBuilder circleCrop = Glide.with((ImageView) view.findViewById(R.id.iv_image)).load(item2).centerCrop().circleCrop();
        try {
            i = new GetDefaultHeaderImageDrawableRequest().toResult().intValue();
        } catch (Exception e2) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e2));
            }
            i = R.drawable.image_loading_place_holder_circle;
        }
        circleCrop.placeholder(i).into((ImageView) view.findViewById(R.id.iv_image));
        ImageView iv_image = (ImageView) view.findViewById(R.id.iv_image);
        Intrinsics.checkNotNullExpressionValue(iv_image, "iv_image");
        iv_image.setSelected(helper.getAdapterPosition() == this.currentPosition);
        helper.addOnClickListener(R.id.iv_image);
    }

    /* renamed from: convertPayloads, reason: avoid collision after fix types in other method */
    protected void convertPayloads2(BaseViewHolder helper, BaseMultiEntity item, List<Object> payloads) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        View view = helper.itemView;
        if (payloads.contains(1)) {
            ImageView iv_image = (ImageView) view.findViewById(R.id.iv_image);
            Intrinsics.checkNotNullExpressionValue(iv_image, "iv_image");
            iv_image.setSelected(helper.getAdapterPosition() == this.currentPosition);
        }
    }
}
