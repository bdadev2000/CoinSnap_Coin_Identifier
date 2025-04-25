package com.glority.android.picturexx.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ItemCustomSeriesCardBinding;
import com.glority.android.picturexx.definition.SelectableItem;
import com.glority.android.picturexx.extensions.UserCustomSeriesItemExtKt;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomSeriesCardAdapter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0014J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/adapter/CustomSeriesCardAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/picturexx/definition/SelectableItem;", "Lcom/glority/android/picturexx/adapter/SeriesCardViewHolder;", "showMoreOption", "", "<init>", "(Z)V", "onCreateDefViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "convert", "", "helper", "item", "setFolderImages", "seriesItem", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CustomSeriesCardAdapter extends BaseQuickAdapter<SelectableItem, SeriesCardViewHolder> {
    public static final int $stable = 0;
    private final boolean showMoreOption;

    public CustomSeriesCardAdapter(boolean z) {
        super(R.layout.item_custom_series_card, null, 2, null);
        this.showMoreOption = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public SeriesCardViewHolder onCreateDefViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        Intrinsics.checkNotNull(layoutInflater);
        ItemCustomSeriesCardBinding inflate = ItemCustomSeriesCardBinding.inflate(layoutInflater, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new SeriesCardViewHolder(inflate);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(SeriesCardViewHolder helper, SelectableItem item) {
        int i;
        String str;
        int i2;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        CardView cardView = helper.getCardView();
        UserCustomSeriesItem userCustomSeriesItem = item.getUserCustomSeriesItem();
        helper.setText(R.id.tv_me_series_name, userCustomSeriesItem.getTitle());
        setFolderImages(helper, userCustomSeriesItem);
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
        helper.addOnClickListener(R.id.iv_me_series_more, R.id.iv_series_collection_folder_1);
        helper.setVisible(R.id.iv_me_series_more, this.showMoreOption);
    }

    private final void setFolderImages(SeriesCardViewHolder helper, UserCustomSeriesItem seriesItem) {
        List take = CollectionsKt.take(CollectionsKt.reversed(seriesItem.getLatestCollectionUrlList()), 3);
        String str = (String) CollectionsKt.firstOrNull(take);
        String str2 = (String) CollectionsKt.getOrNull(take, 1);
        String str3 = (String) CollectionsKt.getOrNull(take, 2);
        AppCompatImageView iv1 = helper.getIv1();
        AppCompatImageView iv2 = helper.getIv2();
        AppCompatImageView iv3 = helper.getIv3();
        iv1.setImageResource(R.drawable.icon_custom_series_item_head);
        iv2.setImageResource(R.drawable.icon_custom_series_item_head);
        iv3.setImageResource(R.drawable.icon_custom_series_item_toe);
        if (str != null) {
            Glide.with(iv1).load(str).into(iv1);
        }
        if (str2 != null) {
            Glide.with(iv2).load(str2).into(iv2);
        }
        if (str3 != null) {
            Glide.with(iv3).load(str3).into(iv3);
        }
    }
}
