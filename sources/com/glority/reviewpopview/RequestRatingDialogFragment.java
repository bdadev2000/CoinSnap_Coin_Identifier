package com.glority.reviewpopview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.reviewpopview.base.RatingDialogListener;
import com.glority.reviewpopview.base.ReviewPopBaseDialogFragment;
import com.glority.reviewpopview.base.ReviewPopILogEvent;
import com.glority.reviewpopview.base.ReviewPopLogEvents;
import com.glority.reviewpopview.databinding.ReviewPopviewDialogRequestRatingBinding;
import com.glority.utils.app.IntentUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RequestRatingDialogFragment.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J\u0010\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/reviewpopview/RequestRatingDialogFragment;", "Lcom/glority/reviewpopview/base/ReviewPopBaseDialogFragment;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/reviewpopview/base/RatingDialogListener;", "(Lcom/glority/reviewpopview/base/RatingDialogListener;)V", "binding", "Lcom/glority/reviewpopview/databinding/ReviewPopviewDialogRequestRatingBinding;", "close", "", "isComplete", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "startMarket", "activity", "Landroid/app/Activity;", "mod_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes9.dex */
public final class RequestRatingDialogFragment extends ReviewPopBaseDialogFragment {
    private ReviewPopviewDialogRequestRatingBinding binding;
    private final RatingDialogListener listener;

    public RequestRatingDialogFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RequestRatingDialogFragment(RatingDialogListener ratingDialogListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : ratingDialogListener);
    }

    public RequestRatingDialogFragment(RatingDialogListener ratingDialogListener) {
        this.listener = ratingDialogListener;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ReviewPopviewDialogRequestRatingBinding inflate = ReviewPopviewDialogRequestRatingBinding.inflate(getLayoutInflater(), container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater, container, false)");
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        ConstraintLayout root = inflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "binding.root");
        return root;
    }

    @Override // com.glority.reviewpopview.base.ReviewPopBaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        RatingDialogListener ratingDialogListener = this.listener;
        if (ratingDialogListener != null) {
            ratingDialogListener.onAppDialogShow();
        }
        setCancelable(false);
        super.onViewCreated(view, savedInstanceState);
        Context context = view.getContext();
        ReviewPopviewDialogRequestRatingBinding reviewPopviewDialogRequestRatingBinding = null;
        logEvent(ReviewPopLogEvents.RequestRatingDialog, null);
        try {
            ReviewPopviewDialogRequestRatingBinding reviewPopviewDialogRequestRatingBinding2 = this.binding;
            if (reviewPopviewDialogRequestRatingBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                reviewPopviewDialogRequestRatingBinding2 = null;
            }
            reviewPopviewDialogRequestRatingBinding2.desc.setText(getString(R.string.text_review_content, context.getApplicationInfo().loadLabel(context.getPackageManager())));
        } catch (Throwable unused) {
            ReviewPopviewDialogRequestRatingBinding reviewPopviewDialogRequestRatingBinding3 = this.binding;
            if (reviewPopviewDialogRequestRatingBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                reviewPopviewDialogRequestRatingBinding3 = null;
            }
            reviewPopviewDialogRequestRatingBinding3.desc.setText(getString(R.string.text_review_content));
        }
        ReviewPopviewDialogRequestRatingBinding reviewPopviewDialogRequestRatingBinding4 = this.binding;
        if (reviewPopviewDialogRequestRatingBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            reviewPopviewDialogRequestRatingBinding4 = null;
        }
        Button button = reviewPopviewDialogRequestRatingBinding4.tvGoToRate;
        Intrinsics.checkNotNullExpressionValue(button, "binding.tvGoToRate");
        ViewExtensionsKt.setSingleClickListener(button, 600L, new Function1<View, Unit>() { // from class: com.glority.reviewpopview.RequestRatingDialogFragment$onViewCreated$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ReviewPopILogEvent.DefaultImpls.logEvent$default(RequestRatingDialogFragment.this, ReviewPopLogEvents.RequestRatingDialog_Rate, null, 2, null);
                RequestRatingDialogFragment requestRatingDialogFragment = RequestRatingDialogFragment.this;
                requestRatingDialogFragment.startMarket(requestRatingDialogFragment.getActivity());
                RequestRatingDialogFragment.this.close(true);
            }
        });
        ReviewPopviewDialogRequestRatingBinding reviewPopviewDialogRequestRatingBinding5 = this.binding;
        if (reviewPopviewDialogRequestRatingBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            reviewPopviewDialogRequestRatingBinding5 = null;
        }
        TextView textView = reviewPopviewDialogRequestRatingBinding5.tvNotNow;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvNotNow");
        ViewExtensionsKt.setSingleClickListener(textView, 600L, new Function1<View, Unit>() { // from class: com.glority.reviewpopview.RequestRatingDialogFragment$onViewCreated$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ReviewPopILogEvent.DefaultImpls.logEvent$default(RequestRatingDialogFragment.this, ReviewPopLogEvents.RequestRatingDialog_NotNow, null, 2, null);
                RequestRatingDialogFragment.this.close(false);
            }
        });
        ReviewPopviewDialogRequestRatingBinding reviewPopviewDialogRequestRatingBinding6 = this.binding;
        if (reviewPopviewDialogRequestRatingBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            reviewPopviewDialogRequestRatingBinding = reviewPopviewDialogRequestRatingBinding6;
        }
        reviewPopviewDialogRequestRatingBinding.ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.reviewpopview.RequestRatingDialogFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RequestRatingDialogFragment.onViewCreated$lambda$0(RequestRatingDialogFragment.this, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(RequestRatingDialogFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ReviewPopILogEvent.DefaultImpls.logEvent$default(this$0, ReviewPopLogEvents.RequestRatingDialog_Click_Close, null, 2, null);
        this$0.close(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ReviewPopILogEvent.DefaultImpls.logEvent$default(this, ReviewPopLogEvents.RequestRatingDialog_Close, null, 2, null);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void close(boolean isComplete) {
        RatingDialogListener ratingDialogListener = this.listener;
        if (ratingDialogListener != null) {
            ratingDialogListener.onDismiss(isComplete);
        }
        dismiss();
    }

    public final void startMarket(Activity activity) {
        Intent launchMarketIntent;
        if (activity == null || (launchMarketIntent = IntentUtils.getLaunchMarketIntent(AppContext.INSTANCE.getConfig("APPLICATION_ID"))) == null) {
            return;
        }
        activity.startActivity(launchMarketIntent);
    }
}
