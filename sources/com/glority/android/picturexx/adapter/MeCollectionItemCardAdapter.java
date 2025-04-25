package com.glority.android.picturexx.adapter;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.app.AppContext;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ItemMeCollectionCardBinding;
import com.glority.android.picturexx.extensions.CollectionItemExtKt;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeCollectionItemCardAdapter.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeCollectionItemCardAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/database/entities/CollectionItem;", "Lcom/glority/android/picturexx/adapter/CardViewHolder;", "<init>", "()V", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MeCollectionItemCardAdapter extends BaseQuickAdapter<CollectionItem, CardViewHolder> {
    public static final int $stable = 0;

    public MeCollectionItemCardAdapter() {
        super(R.layout.item_me_collection_card, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public CardViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        Intrinsics.checkNotNull(layoutInflater);
        ItemMeCollectionCardBinding inflate = ItemMeCollectionCardBinding.inflate(layoutInflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new CardViewHolder(inflate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(CardViewHolder helper, CollectionItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.itemView.setTag(item.getItemId());
        helper.getCollectionNameTextView().setText(item.getDisplayName());
        helper.getPriceTextView().setText(CollectionItemExtKt.getDisplayPrice(item));
        AppCompatTextView priceTextView = helper.getPriceTextView();
        String displayPrice = CollectionItemExtKt.getDisplayPrice(item);
        priceTextView.setVisibility(displayPrice != null && displayPrice.length() > 0 ? 0 : 8);
        String displayGrade = CollectionItemExtKt.getDisplayGrade(item);
        helper.getGradeTextView().setText(displayGrade);
        helper.getGradeInfoContainer().setVisibility((displayGrade == null || displayGrade.length() == 0) ^ true ? 0 : 8);
        AppCompatTextView gradeTextView = helper.getGradeTextView();
        String grade = item.getGrade();
        gradeTextView.setVisibility((grade == null || grade.length() == 0) ^ true ? 0 : 8);
        helper.addOnClickListener(R.id.iv_me_collection_more);
        final AppCompatImageView ivCoinHeader = helper.getIvCoinHeader();
        final AppCompatImageView ivCoinToe = helper.getIvCoinToe();
        Glide.with(ivCoinHeader).asBitmap().load(item.getSubjectSideUrl()).dontTransform().placeholder(R.drawable.img_coin_placeholder_coin_header).addListener(new RequestListener<Bitmap>() { // from class: com.glority.android.picturexx.adapter.MeCollectionItemCardAdapter$convert$1
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
                AppCompatImageView appCompatImageView = AppCompatImageView.this;
                try {
                    if (resource.getWidth() / resource.getHeight() > 1.2f) {
                        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
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
        }).into(ivCoinHeader);
        Glide.with(ivCoinToe).asBitmap().load(item.getDenominationSideUrl()).dontTransform().placeholder(R.drawable.img_coin_placeholder_coin_toe).addListener(new RequestListener<Bitmap>() { // from class: com.glority.android.picturexx.adapter.MeCollectionItemCardAdapter$convert$2
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
                AppCompatImageView appCompatImageView = AppCompatImageView.this;
                try {
                    if (resource.getWidth() / resource.getHeight() > 1.2f) {
                        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
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
        }).into(ivCoinToe);
    }
}
