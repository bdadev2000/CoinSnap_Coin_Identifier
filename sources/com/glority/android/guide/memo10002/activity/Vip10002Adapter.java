package com.glority.android.guide.memo10002.activity;

import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Vip10002Adapter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/glority/android/guide/memo10002/activity/Vip10002Adapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lkotlin/Pair;", "", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "onBindViewHolder", "holder", "position", "getItemViewType", "getItemCount", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
public final class Vip10002Adapter extends BaseQuickAdapter<Pair<? extends Integer, ? extends Integer>, BaseViewHolder> {
    public static final int $stable = 0;

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, Pair<? extends Integer, ? extends Integer> pair) {
        convert2(baseViewHolder, (Pair<Integer, Integer>) pair);
    }

    public Vip10002Adapter() {
        super(R.layout.item_purchase_10002_card, null, 2, null);
    }

    /* renamed from: convert, reason: avoid collision after fix types in other method */
    protected void convert2(BaseViewHolder helper, Pair<Integer, Integer> item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        helper.setImageResource(R.id.icon, item.getFirst().intValue());
        helper.setText(R.id.name_tv, item.getSecond().intValue());
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder((Vip10002Adapter) holder, position % getData().size());
    }

    @Override // com.glority.android.adapterhelper.BaseQuickAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        super.getItemViewType(position);
        return 0;
    }
}
