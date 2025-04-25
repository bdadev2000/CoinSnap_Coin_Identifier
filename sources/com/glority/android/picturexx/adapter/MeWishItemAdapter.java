package com.glority.android.picturexx.adapter;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.database.entities.WishItem;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeWishItemAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeWishItemAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/database/entities/WishItem;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MeWishItemAdapter extends BaseQuickAdapter<WishItem, BaseViewHolder> {
    public static final int $stable = 0;

    public MeWishItemAdapter() {
        super(R.layout.item_me_wish, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, WishItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R.id.tv_me_collection_name, item.getName());
        int i = R.id.time_tv;
        String price = item.getPrice();
        helper.setVisible(i, !(price == null || price.length() == 0));
        int i2 = R.id.time_tv;
        String price2 = item.getPrice();
        if (price2 == null) {
            price2 = "";
        }
        helper.setText(i2, price2);
        helper.addOnClickListener(R.id.iv_me_collection_more);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_me_collection_picture);
        Glide.with(imageView).load(item.getOriginalImageUrl()).placeholder(R.drawable.icon_image_holder).centerCrop().into(imageView);
    }
}
