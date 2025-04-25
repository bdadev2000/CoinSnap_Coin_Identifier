package com.glority.android.picturexx.view.recognize;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentRecognizeLoadingBinding;
import com.glority.android.picturexx.recognize.fragment.BaseRecognizeLoadingFragment;
import com.glority.android.picturexx.skins.SkinResourceManager;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecognizeLoadingFragment.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0016R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/RecognizeLoadingFragment;", "Lcom/glority/android/picturexx/recognize/fragment/BaseRecognizeLoadingFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentRecognizeLoadingBinding;", "<init>", "()V", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLogPageName", "", "onDestroy", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RecognizeLoadingFragment extends BaseRecognizeLoadingFragment<FragmentRecognizeLoadingBinding> {
    public static final int $stable = 8;
    private ValueAnimator animator;

    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        this.animator = valueAnimator;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_recognize_loading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Glide.with(this).load(getVm().getDisplayImageUri()).into(((FragmentRecognizeLoadingBinding) getBinding()).iv);
        ((FragmentRecognizeLoadingBinding) getBinding()).iv.post(new Runnable() { // from class: com.glority.android.picturexx.view.recognize.RecognizeLoadingFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                RecognizeLoadingFragment.doCreateView$lambda$4(RecognizeLoadingFragment.this);
            }
        });
        ((FragmentRecognizeLoadingBinding) getBinding()).closeIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.RecognizeLoadingFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecognizeLoadingFragment.doCreateView$lambda$5(RecognizeLoadingFragment.this, view);
            }
        });
        ((FragmentRecognizeLoadingBinding) getBinding()).ivAnim.setImageAssetsFolder("lottie_images");
        ((FragmentRecognizeLoadingBinding) getBinding()).ivAnim.setAnimation(SkinResourceManager.INSTANCE.getSkinResId(R.raw.identifying_animation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void doCreateView$lambda$4(final RecognizeLoadingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ImageView loadingBar = ((FragmentRecognizeLoadingBinding) this$0.getBinding()).loadingBar;
        Intrinsics.checkNotNullExpressionValue(loadingBar, "loadingBar");
        ImageView imageView = loadingBar;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = ((FragmentRecognizeLoadingBinding) this$0.getBinding()).loadingBar.getHeight() / (-2);
            imageView.setLayoutParams(layoutParams2);
            ValueAnimator ofInt = ObjectAnimator.ofInt(0, ((FragmentRecognizeLoadingBinding) this$0.getBinding()).iv.getHeight() + ((FragmentRecognizeLoadingBinding) this$0.getBinding()).loadingBar.getHeight());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.view.recognize.RecognizeLoadingFragment$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    RecognizeLoadingFragment.doCreateView$lambda$4$lambda$3$lambda$2(RecognizeLoadingFragment.this, valueAnimator);
                }
            });
            ofInt.setRepeatMode(1);
            ofInt.setDuration(1500L);
            ofInt.setRepeatCount(-1);
            ofInt.start();
            this$0.animator = ofInt;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void doCreateView$lambda$4$lambda$3$lambda$2(RecognizeLoadingFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        LinearLayout loadingContainer = ((FragmentRecognizeLoadingBinding) this$0.getBinding()).loadingContainer;
        Intrinsics.checkNotNullExpressionValue(loadingContainer, "loadingContainer");
        LinearLayout linearLayout = loadingContainer;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            Object animatedValue = it.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = ((Integer) animatedValue).intValue();
            linearLayout.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$5(RecognizeLoadingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return LogEvents.identify_analysing;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
