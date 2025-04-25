package com.glority.android.picturexx.adapter;

import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseMultiItemQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.R;
import com.glority.base.entity.BaseMultiEntity;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddImageAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/adapter/AddImageAdapter;", "Lcom/glority/android/adapterhelper/BaseMultiItemQuickAdapter;", "Lcom/glority/base/entity/BaseMultiEntity;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class AddImageAdapter extends BaseMultiItemQuickAdapter<BaseMultiEntity, BaseViewHolder> {
    public static final int $stable = 0;

    public AddImageAdapter() {
        super(CollectionsKt.emptyList());
        addItemType(0, R.layout.item_add_image);
        addItemType(1, R.layout.item_add_image_bt);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, BaseMultiEntity item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = helper.itemView;
        if (item instanceof ImageEntity) {
            Glide.with(view).load(((ImageEntity) item).getUrl().toString()).placeholder(R.drawable.icon_image_holder).into((ImageView) helper.getView(R.id.iv));
            helper.addOnClickListener(R.id.iv_close1, R.id.iv);
        } else if (item instanceof AddEntity) {
            helper.addOnClickListener(R.id.add_bt);
        }
    }
}
