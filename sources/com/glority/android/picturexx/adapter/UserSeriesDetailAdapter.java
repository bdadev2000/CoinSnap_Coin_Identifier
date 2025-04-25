package com.glority.android.picturexx.adapter;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.picturexx.business.R;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserSeriesDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserSeriesDetailAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014J(\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/adapter/UserSeriesDetailAdapter;", "Lcom/glority/android/adapterhelper/BaseQuickAdapter;", "Lcom/glority/android/picturexx/adapter/UserSeriesDetailAdapter$UserSeriesDetailData;", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "<init>", "()V", "convert", "", "helper", "item", "turnOver", "front", "", "frontView", "Landroid/view/View;", "backView", "rootView", "UserSeriesDetailData", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class UserSeriesDetailAdapter extends BaseQuickAdapter<UserSeriesDetailData, BaseViewHolder> {
    public static final int $stable = 0;

    /* compiled from: UserSeriesDetailAdapter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/glority/android/picturexx/adapter/UserSeriesDetailAdapter$UserSeriesDetailData;", "", "userSeriesDetail", "Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "currentSide", "", "nextSide", "<init>", "(Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;ZZ)V", "getUserSeriesDetail", "()Lcom/picturecoin/generatedAPI/kotlinAPI/series/UserSeriesDetail;", "getCurrentSide", "()Z", "setCurrentSide", "(Z)V", "getNextSide", "setNextSide", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class UserSeriesDetailData {
        public static final int $stable = 8;
        private boolean currentSide;
        private boolean nextSide;
        private final UserSeriesDetail userSeriesDetail;

        public UserSeriesDetailData(UserSeriesDetail userSeriesDetail, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(userSeriesDetail, "userSeriesDetail");
            this.userSeriesDetail = userSeriesDetail;
            this.currentSide = z;
            this.nextSide = z2;
        }

        public final boolean getCurrentSide() {
            return this.currentSide;
        }

        public final boolean getNextSide() {
            return this.nextSide;
        }

        public final UserSeriesDetail getUserSeriesDetail() {
            return this.userSeriesDetail;
        }

        public final void setCurrentSide(boolean z) {
            this.currentSide = z;
        }

        public final void setNextSide(boolean z) {
            this.nextSide = z;
        }
    }

    public UserSeriesDetailAdapter() {
        super(R.layout.item_series_child, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.adapterhelper.BaseQuickAdapter
    public void convert(BaseViewHolder helper, UserSeriesDetailData item) {
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(item, "item");
        UserSeriesDetail userSeriesDetail = item.getUserSeriesDetail();
        ImageView imageView = (ImageView) helper.getView(R.id.iv1);
        ImageView imageView2 = (ImageView) helper.getView(R.id.iv2);
        View view = helper.getView(R.id.iv_container);
        helper.setText(R.id.name_tv, userSeriesDetail.getName());
        ImageView imageView3 = imageView;
        Glide.with(imageView3).load(userSeriesDetail.getSubjectSideUrl()).placeholder(R.drawable.icon_image_holder).into(imageView);
        ImageView imageView4 = imageView2;
        Glide.with(imageView4).load(userSeriesDetail.getDenominationUrl()).into(imageView2);
        if (item.getCurrentSide() != item.getNextSide()) {
            turnOver(item.getNextSide(), imageView3, imageView4, view);
        } else if (item.getCurrentSide()) {
            imageView3.setVisibility(0);
            imageView4.setVisibility(4);
        } else {
            imageView3.setVisibility(4);
            imageView4.setVisibility(0);
        }
        item.setCurrentSide(item.getNextSide());
    }

    private final void turnOver(boolean front, final View frontView, final View backView, final View rootView) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(front ? 0.0f : 180.0f, front ? 180.0f : 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.adapter.UserSeriesDetailAdapter$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UserSeriesDetailAdapter.turnOver$lambda$0(frontView, backView, rootView, valueAnimator);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.7f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.adapter.UserSeriesDetailAdapter$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                UserSeriesDetailAdapter.turnOver$lambda$1(rootView, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void turnOver$lambda$0(View frontView, View backView, View rootView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(frontView, "$frontView");
        Intrinsics.checkNotNullParameter(backView, "$backView");
        Intrinsics.checkNotNullParameter(rootView, "$rootView");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        if (floatValue <= 90.0f) {
            if (frontView.getVisibility() == 0) {
                frontView.setVisibility(8);
                backView.setVisibility(0);
            }
            rootView.setRotationY(floatValue);
            return;
        }
        if (frontView.getVisibility() != 0) {
            frontView.setVisibility(0);
            backView.setVisibility(8);
        }
        rootView.setRotationY(floatValue - 180);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void turnOver$lambda$1(View rootView, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(rootView, "$rootView");
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        rootView.setScaleX(floatValue);
        rootView.setScaleY(floatValue);
    }
}
