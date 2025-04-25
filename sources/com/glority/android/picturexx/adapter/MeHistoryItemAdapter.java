package com.glority.android.picturexx.adapter;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.database.entities.HistoryItem;
import com.glority.android.picturexx.business.R;
import com.google.android.exoplayer2.SimpleExoPlayer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeHistoryItemAdapter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/adapter/MeHistoryItemAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/database/entities/HistoryItem;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MeHistoryItemAdapter extends BaseQuickAdapter<HistoryItem, BaseViewHolder> {
    public static final int $stable = 0;

    public MeHistoryItemAdapter() {
        super(R.layout.item_me_history, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(final BaseViewHolder helper, HistoryItem item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getNewAdd()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f, 1.0f, 0.0f);
            ofFloat.setDuration(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.adapter.MeHistoryItemAdapter$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MeHistoryItemAdapter.convert$lambda$1$lambda$0(BaseViewHolder.this, valueAnimator);
                }
            });
            ofFloat.start();
            item.setNewAdd(false);
        }
        helper.setText(R.id.tv_me_collection_name, item.getName());
        helper.setText(R.id.grade_tv, new SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(item.getDate()));
        helper.addOnClickListener(R.id.iv_me_collection_more);
        ImageView imageView = (ImageView) helper.getView(R.id.iv_me_collection_picture);
        Glide.with(imageView).load(item.getImageUrl()).placeholder(R.drawable.main_img_place_holder).centerCrop().into(imageView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void convert$lambda$1$lambda$0(BaseViewHolder helper, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(helper, "$helper");
        Intrinsics.checkNotNullParameter(it, "it");
        View view = helper.itemView;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setBackgroundColor(Color.argb(((Float) animatedValue).floatValue() * 0.3f, 0.98039216f, 0.6862745f, 0.09803922f));
    }
}
