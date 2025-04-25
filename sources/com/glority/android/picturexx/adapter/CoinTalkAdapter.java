package com.glority.android.picturexx.adapter;

import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.database.entities.ArticleNewEntity;
import com.glority.android.picturexx.business.R;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinTalkAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/adapter/CoinTalkAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/database/entities/ArticleNewEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CoinTalkAdapter extends BaseQuickAdapter<ArticleNewEntity, BaseViewHolder> {
    public static final int $stable = 0;

    public CoinTalkAdapter() {
        super(R.layout.item_coin_talk, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, ArticleNewEntity item) {
        CoinTag coinTag;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setText(R.id.title_tv, item.getTitle());
        int i = R.id.type_tv;
        List<CoinTag> tags = item.getTags();
        helper.setText(i, (tags == null || (coinTag = (CoinTag) CollectionsKt.firstOrNull((List) tags)) == null) ? null : coinTag.getName());
        ImageView imageView = (ImageView) helper.getView(R.id.iv);
        Glide.with(imageView).load(item.getMainImageUrl()).placeholder(R.drawable.icon_image_holder).centerCrop().into(imageView);
    }
}
