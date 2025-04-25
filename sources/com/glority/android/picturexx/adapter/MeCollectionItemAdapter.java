package com.glority.android.picturexx.adapter;

import android.graphics.Bitmap;
import android.util.Log;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.core.app.AppContext;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.extensions.CollectionItemExtKt;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeCollectionItemAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeCollectionItemAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/database/entities/CollectionItem;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MeCollectionItemAdapter extends BaseQuickAdapter<CollectionItem, BaseViewHolder> {
    public static final int $stable = 0;

    public MeCollectionItemAdapter() {
        super(R.layout.item_me_collection, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, CollectionItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.itemView.setTag(item.getItemId());
        helper.setText(R.id.tv_me_collection_name, item.getDisplayName());
        helper.setText(R.id.time_tv, item.getFormatDate());
        int i = R.id.time_tv;
        String formatDate = item.getFormatDate();
        helper.setGone(i, formatDate != null && formatDate.length() > 0);
        helper.setText(R.id.grade_tv, CollectionItemExtKt.getDisplayGrade(item));
        int i2 = R.id.grade_tv;
        String grade = item.getGrade();
        helper.setGone(i2, !(grade == null || grade.length() == 0));
        helper.addOnClickListener(R.id.iv_me_collection_more);
        final ImageView imageView = (ImageView) helper.getView(R.id.iv_me_collection_picture);
        Glide.with(imageView).asBitmap().load((String) CollectionsKt.firstOrNull((List) item.getImageUrl())).dontTransform().placeholder(R.drawable.main_img_place_holder).addListener(new RequestListener<Bitmap>() { // from class: com.glority.android.picturexx.adapter.MeCollectionItemAdapter$convert$1
            @Override // com.bumptech.glide.request.RequestListener
            public boolean onLoadFailed(GlideException e, Object model, Target<Bitmap> target, boolean isFirstResource) {
                Intrinsics.checkNotNullParameter(target, "target");
                return false;
            }

            @Override // com.bumptech.glide.request.RequestListener
            public boolean onResourceReady(Bitmap resource, Object model, Target<Bitmap> target, DataSource dataSource, boolean isFirstResource) {
                Intrinsics.checkNotNullParameter(resource, "resource");
                Intrinsics.checkNotNullParameter(model, "model");
                Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                ImageView imageView2 = imageView;
                try {
                    if (resource.getWidth() / resource.getHeight() > 1.2f) {
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    }
                    Unit unit = Unit.INSTANCE;
                    return false;
                } catch (Exception e) {
                    if (!AppContext.INSTANCE.isDebugMode()) {
                        return false;
                    }
                    LogUtils.e(Log.getStackTraceString(e));
                    return false;
                }
            }
        }).into(imageView);
    }
}
