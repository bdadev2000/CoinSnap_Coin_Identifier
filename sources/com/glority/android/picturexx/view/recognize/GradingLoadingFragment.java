package com.glority.android.picturexx.view.recognize;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentGradingLoadingBinding;
import com.glority.android.picturexx.recognize.fragment.BaseRecognizeLoadingFragment;
import com.glority.android.picturexx.view.grading.GradingDetailFragment;
import com.glority.android.xx.constants.Args;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradingLoadingFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0011\u001a\u00020\fH\u0014J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0014J6\u0010\u001a\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\"0!J8\u0010#\u001a\u00020\u00132\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\"0!H\u0002R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/GradingLoadingFragment;", "Lcom/glority/android/picturexx/recognize/fragment/BaseRecognizeLoadingFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentGradingLoadingBinding;", "<init>", "()V", "animator", "Landroid/animation/ValueAnimator;", "getAnimator", "()Landroid/animation/ValueAnimator;", "setAnimator", "(Landroid/animation/ValueAnimator;)V", "progress", "", "getProgress", "()I", "setProgress", "(I)V", "getLayoutId", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "updateProgress", "value", "getLogPageName", "", "readyToNext", "activity", "Landroidx/fragment/app/Fragment;", "cmsNames", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "otherData", "", "", "toNext", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingLoadingFragment extends BaseRecognizeLoadingFragment<FragmentGradingLoadingBinding> {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private int progress;

    public final ValueAnimator getAnimator() {
        return this.animator;
    }

    public final void setAnimator(ValueAnimator valueAnimator) {
        this.animator = valueAnimator;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final void setProgress(int i) {
        this.progress = i;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_grading_loading;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        ((FragmentGradingLoadingBinding) getBinding()).ivAnim.setImageAssetsFolder("lottie_images");
        ((FragmentGradingLoadingBinding) getBinding()).pd.setMax(2000);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 1800);
        ofInt.setDuration(5000L);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.view.recognize.GradingLoadingFragment$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                GradingLoadingFragment.doCreateView$lambda$1$lambda$0(GradingLoadingFragment.this, valueAnimator);
            }
        });
        ofInt.start();
        this.animator = ofInt;
        ((FragmentGradingLoadingBinding) getBinding()).closeIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.recognize.GradingLoadingFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingLoadingFragment.doCreateView$lambda$2(GradingLoadingFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$1$lambda$0(GradingLoadingFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.updateProgress(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void doCreateView$lambda$2(GradingLoadingFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateProgress(ValueAnimator value) {
        Object animatedValue = value.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.progress = ((Integer) animatedValue).intValue();
        ((FragmentGradingLoadingBinding) getBinding()).pd.setProgressCompat(this.progress, true);
        int i = this.progress;
        if (500 <= i && i < 1000) {
            ImageView iv1 = ((FragmentGradingLoadingBinding) getBinding()).iv1;
            Intrinsics.checkNotNullExpressionValue(iv1, "iv1");
            iv1.setVisibility(0);
            ProgressBar pb1 = ((FragmentGradingLoadingBinding) getBinding()).pb1;
            Intrinsics.checkNotNullExpressionValue(pb1, "pb1");
            pb1.setVisibility(8);
            return;
        }
        if (1000 <= i && i < 1500) {
            ImageView iv2 = ((FragmentGradingLoadingBinding) getBinding()).iv2;
            Intrinsics.checkNotNullExpressionValue(iv2, "iv2");
            iv2.setVisibility(0);
            ProgressBar pb2 = ((FragmentGradingLoadingBinding) getBinding()).pb2;
            Intrinsics.checkNotNullExpressionValue(pb2, "pb2");
            pb2.setVisibility(8);
            return;
        }
        if (1500 <= i && i < 2000) {
            ImageView iv3 = ((FragmentGradingLoadingBinding) getBinding()).iv3;
            Intrinsics.checkNotNullExpressionValue(iv3, "iv3");
            iv3.setVisibility(0);
            ProgressBar pb3 = ((FragmentGradingLoadingBinding) getBinding()).pb3;
            Intrinsics.checkNotNullExpressionValue(pb3, "pb3");
            pb3.setVisibility(8);
            return;
        }
        if (i == 2000) {
            ImageView iv4 = ((FragmentGradingLoadingBinding) getBinding()).iv4;
            Intrinsics.checkNotNullExpressionValue(iv4, "iv4");
            iv4.setVisibility(0);
            ProgressBar pb4 = ((FragmentGradingLoadingBinding) getBinding()).pb4;
            Intrinsics.checkNotNullExpressionValue(pb4, "pb4");
            pb4.setVisibility(8);
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "grade_analysing";
    }

    public final void readyToNext(final Fragment activity, final List<CmsName> cmsNames, final Map<String, ? extends Object> otherData) {
        Intrinsics.checkNotNullParameter(otherData, "otherData");
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.progress, 2000);
        ofInt.setDuration(500L);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.view.recognize.GradingLoadingFragment$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                GradingLoadingFragment.readyToNext$lambda$4$lambda$3(GradingLoadingFragment.this, valueAnimator2);
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.glority.android.picturexx.view.recognize.GradingLoadingFragment$readyToNext$1$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                GradingLoadingFragment.this.toNext(activity, cmsNames, otherData);
            }
        });
        ofInt.start();
        this.animator = ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void readyToNext$lambda$4$lambda$3(GradingLoadingFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.updateProgress(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toNext(Fragment activity, List<CmsName> cmsNames, Map<String, ? extends Object> otherData) {
        FragmentActivity activity2;
        Context context;
        if (activity != null && (context = activity.getContext()) != null) {
            CmsName cmsName = cmsNames != null ? (CmsName) CollectionsKt.firstOrNull((List) cmsNames) : null;
            if (cmsName != null) {
                GradingDetailFragment.Companion companion = GradingDetailFragment.INSTANCE;
                Object obj = otherData.get(Args.year);
                String str = obj instanceof String ? (String) obj : null;
                if (str == null) {
                    str = "";
                }
                Object obj2 = otherData.get("grade");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 == null) {
                    str2 = "";
                }
                Object obj3 = otherData.get("image");
                String str3 = obj3 instanceof String ? (String) obj3 : null;
                if (str3 == null) {
                    str3 = "";
                }
                Object obj4 = otherData.get(Args.subjectSideUrl);
                String str4 = obj4 instanceof String ? (String) obj4 : null;
                if (str4 == null) {
                    str4 = "";
                }
                Object obj5 = otherData.get(Args.denominationSideUrl);
                String str5 = obj5 instanceof String ? (String) obj5 : null;
                companion.open(context, cmsName, str, str2, str3, str4, str5 == null ? "" : str5, HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(activity));
            }
        }
        if (activity == null || (activity2 = activity.getActivity()) == null) {
            return;
        }
        activity2.finish();
    }
}
