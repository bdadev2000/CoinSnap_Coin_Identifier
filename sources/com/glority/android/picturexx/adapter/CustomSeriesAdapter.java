package com.glority.android.picturexx.adapter;

import android.content.res.Resources;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.definition.SelectableItem;
import com.glority.android.picturexx.extensions.UserCustomSeriesItemExtKt;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomSeriesAdapter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/adapter/CustomSeriesAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/picturexx/definition/SelectableItem;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "showMoreOption", "", "<init>", "(Z)V", "convert", "", "helper", "selectableItem", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CustomSeriesAdapter extends BaseQuickAdapter<SelectableItem, BaseViewHolder> {
    public static final int $stable = 0;
    private final boolean showMoreOption;

    public CustomSeriesAdapter(boolean z) {
        super(R.layout.item_custom_series, null, 2, null);
        this.showMoreOption = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, SelectableItem selectableItem) {
        int i;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(selectableItem, "selectableItem");
        CardView cardView = (CardView) helper.getView(R.id.card_view);
        UserCustomSeriesItem userCustomSeriesItem = selectableItem.getUserCustomSeriesItem();
        helper.setText(R.id.tv_me_series_name, userCustomSeriesItem.getTitle());
        ImageView imageView = (ImageView) helper.getView(R.id.iv1);
        ImageView imageView2 = (ImageView) helper.getView(R.id.iv2);
        ImageView imageView3 = (ImageView) helper.getView(R.id.iv3);
        imageView.setImageDrawable(null);
        imageView2.setImageDrawable(null);
        imageView3.setImageDrawable(null);
        int i3 = 0;
        for (Object obj : CollectionsKt.reversed(userCustomSeriesItem.getLatestCollectionUrlList())) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if (i3 == 0) {
                Glide.with(imageView3).load(str2).into(imageView);
            } else if (i3 == 1) {
                Glide.with(imageView3).load(str2).into(imageView2);
            } else if (i3 == 2) {
                Glide.with(imageView3).load(str2).into(imageView3);
            }
            i3 = i4;
        }
        helper.setText(R.id.update_tv, cardView.getResources().getString(R.string.Customseries_update, new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(userCustomSeriesItem.getUpdatedAt())));
        if (userCustomSeriesItem.getTotalPrice() != null) {
            String displayPrice = UserCustomSeriesItemExtKt.getDisplayPrice(userCustomSeriesItem);
            int collectionCount = userCustomSeriesItem.getCollectionCount();
            Resources resources = cardView.getResources();
            if (userCustomSeriesItem.getCollectionCount() > 1) {
                i2 = R.string.collection_customsets_caption_coins;
            } else {
                i2 = R.string.collection_customsets_caption_coin;
            }
            str = displayPrice + " | " + collectionCount + " " + resources.getString(i2, String.valueOf(userCustomSeriesItem.getCollectionCount()));
        } else {
            int collectionCount2 = userCustomSeriesItem.getCollectionCount();
            Resources resources2 = cardView.getResources();
            if (userCustomSeriesItem.getCollectionCount() > 1) {
                i = R.string.collection_customsets_caption_coins;
            } else {
                i = R.string.collection_customsets_caption_coin;
            }
            str = collectionCount2 + " " + resources2.getString(i, String.valueOf(userCustomSeriesItem.getCollectionCount()));
        }
        helper.setText(R.id.count_tv, str);
        helper.addOnClickListener(R.id.iv_me_series_more);
        helper.setVisible(R.id.iv_me_series_more, this.showMoreOption);
        if (selectableItem.getSelected()) {
            cardView.setBackgroundResource(R.drawable.outline_color_accent_r8);
        } else {
            cardView.setBackgroundResource(R.drawable.bg_color_white_r8);
        }
    }
}
