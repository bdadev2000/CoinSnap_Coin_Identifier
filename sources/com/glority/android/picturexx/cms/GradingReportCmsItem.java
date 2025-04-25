package com.glority.android.picturexx.cms;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.glority.android.cmsui2.entity.ExtraData;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.vm.GradingDetailViewModelKt;
import com.glority.utils.stability.LogUtils;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GradingReportCmsItem.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!H\u0016J\u000e\u0010\"\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\u0006J\u0006\u0010$\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006J\b\u0010&\u001a\u00020'H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, d2 = {"Lcom/glority/android/picturexx/cms/GradingReportCmsItem;", "Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "hasJudged", "", "onHelpfulClick", "Lkotlin/Function1;", "", "onNotHelpfulClick", "onCopyClick", "Lkotlin/Function2;", "", "<init>", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "markwon", "Lio/noties/markwon/Markwon;", "contentTv", "Landroidx/appcompat/widget/AppCompatTextView;", "helpfulBtn", "Landroidx/appcompat/widget/AppCompatImageView;", "notHelpfulBtn", "copyBtn", "lottieAnim", "Landroid/view/View;", "rawContent", "content", "gptGradeResult", "getGptGradeResult", "()Ljava/lang/String;", "render", "context", "Landroid/content/Context;", "rootView", "data", "Lcom/glority/android/cmsui2/entity/ExtraData;", "setContent", "finish", "finishJudged", "restoreFeedback", "getLayoutId", "", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class GradingReportCmsItem extends BaseCmsItemView {
    private String content;
    private AppCompatTextView contentTv;
    private AppCompatImageView copyBtn;
    private final boolean hasJudged;
    private AppCompatImageView helpfulBtn;
    private View lottieAnim;
    private Markwon markwon;
    private AppCompatImageView notHelpfulBtn;
    private final Function2<GradingReportCmsItem, String, Unit> onCopyClick;
    private final Function1<GradingReportCmsItem, Unit> onHelpfulClick;
    private final Function1<GradingReportCmsItem, Unit> onNotHelpfulClick;
    private String rawContent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GradingReportCmsItem(boolean z, Function1<? super GradingReportCmsItem, Unit> onHelpfulClick, Function1<? super GradingReportCmsItem, Unit> onNotHelpfulClick, Function2<? super GradingReportCmsItem, ? super String, Unit> onCopyClick) {
        super("grading_report");
        Intrinsics.checkNotNullParameter(onHelpfulClick, "onHelpfulClick");
        Intrinsics.checkNotNullParameter(onNotHelpfulClick, "onNotHelpfulClick");
        Intrinsics.checkNotNullParameter(onCopyClick, "onCopyClick");
        this.hasJudged = z;
        this.onHelpfulClick = onHelpfulClick;
        this.onNotHelpfulClick = onNotHelpfulClick;
        this.onCopyClick = onCopyClick;
        this.rawContent = "";
        this.content = "";
    }

    /* compiled from: GradingReportCmsItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/glority/android/picturexx/cms/GradingReportCmsItem$Companion;", "", "<init>", "()V", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final String getGptGradeResult() {
        return GradingDetailViewModelKt.getGradingGPTResult(INSTANCE, this.rawContent);
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public void render(Context context, View rootView, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(data, "data");
        this.markwon = Markwon.create(context);
        this.contentTv = (AppCompatTextView) rootView.findViewById(R.id.tv_cms_grading_report);
        this.helpfulBtn = (AppCompatImageView) rootView.findViewById(R.id.iv_cms_grading_report_helpful);
        this.notHelpfulBtn = (AppCompatImageView) rootView.findViewById(R.id.iv_cms_grading_report_unhelpful);
        this.copyBtn = (AppCompatImageView) rootView.findViewById(R.id.iv_cms_grading_report_copy);
        this.lottieAnim = rootView.findViewById(R.id.lottie_anim_cms_grading_report);
        AppCompatImageView appCompatImageView = this.helpfulBtn;
        AppCompatImageView appCompatImageView2 = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setClickable(false);
        AppCompatImageView appCompatImageView3 = this.notHelpfulBtn;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setClickable(false);
        AppCompatImageView appCompatImageView4 = this.copyBtn;
        if (appCompatImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyBtn");
            appCompatImageView4 = null;
        }
        appCompatImageView4.setClickable(false);
        AppCompatImageView appCompatImageView5 = this.helpfulBtn;
        if (appCompatImageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView5 = null;
        }
        appCompatImageView5.setVisibility(this.hasJudged ^ true ? 0 : 8);
        AppCompatImageView appCompatImageView6 = this.notHelpfulBtn;
        if (appCompatImageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
        } else {
            appCompatImageView2 = appCompatImageView6;
        }
        appCompatImageView2.setVisibility(this.hasJudged ^ true ? 0 : 8);
    }

    public final void setContent(String content) {
        String handlingUnnecessaryData;
        Intrinsics.checkNotNullParameter(content, "content");
        this.rawContent = content;
        handlingUnnecessaryData = GradingReportCmsItemKt.handlingUnnecessaryData(content);
        this.content = handlingUnnecessaryData;
        Markwon markwon = this.markwon;
        View view = null;
        if (markwon == null) {
            Intrinsics.throwUninitializedPropertyAccessException("markwon");
            markwon = null;
        }
        AppCompatTextView appCompatTextView = this.contentTv;
        if (appCompatTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("contentTv");
            appCompatTextView = null;
        }
        markwon.setMarkdown(appCompatTextView, this.content);
        View view2 = this.lottieAnim;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lottieAnim");
        } else {
            view = view2;
        }
        view.setVisibility(content.length() == 0 ? 0 : 8);
    }

    public final void finish() {
        AppCompatImageView appCompatImageView = this.helpfulBtn;
        AppCompatImageView appCompatImageView2 = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setClickable(true);
        AppCompatImageView appCompatImageView3 = this.notHelpfulBtn;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setClickable(true);
        AppCompatImageView appCompatImageView4 = this.copyBtn;
        if (appCompatImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyBtn");
            appCompatImageView4 = null;
        }
        appCompatImageView4.setClickable(true);
        AppCompatImageView appCompatImageView5 = this.helpfulBtn;
        if (appCompatImageView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView5 = null;
        }
        appCompatImageView5.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.cms.GradingReportCmsItem$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingReportCmsItem.finish$lambda$2(GradingReportCmsItem.this, view);
            }
        });
        AppCompatImageView appCompatImageView6 = this.notHelpfulBtn;
        if (appCompatImageView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
            appCompatImageView6 = null;
        }
        appCompatImageView6.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.cms.GradingReportCmsItem$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingReportCmsItem.finish$lambda$3(GradingReportCmsItem.this, view);
            }
        });
        AppCompatImageView appCompatImageView7 = this.copyBtn;
        if (appCompatImageView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("copyBtn");
        } else {
            appCompatImageView2 = appCompatImageView7;
        }
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.cms.GradingReportCmsItem$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingReportCmsItem.finish$lambda$4(GradingReportCmsItem.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finish$lambda$2(final GradingReportCmsItem this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppCompatImageView appCompatImageView = this$0.helpfulBtn;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(R.drawable.icon_chatbot_like_selected);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.glority.android.picturexx.cms.GradingReportCmsItem$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GradingReportCmsItem.finish$lambda$2$lambda$1(GradingReportCmsItem.this);
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finish$lambda$3(GradingReportCmsItem this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppCompatImageView appCompatImageView = this$0.notHelpfulBtn;
        AppCompatImageView appCompatImageView2 = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(R.drawable.icon_chatbot_dislike_selected);
        AppCompatImageView appCompatImageView3 = this$0.notHelpfulBtn;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
        } else {
            appCompatImageView2 = appCompatImageView3;
        }
        appCompatImageView2.setRotationY(180.0f);
        this$0.onNotHelpfulClick.invoke(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finish$lambda$4(GradingReportCmsItem this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.onCopyClick.invoke(this$0, this$0.content);
    }

    public final void finishJudged() {
        AppCompatImageView appCompatImageView = this.helpfulBtn;
        AppCompatImageView appCompatImageView2 = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setVisibility(8);
        AppCompatImageView appCompatImageView3 = this.notHelpfulBtn;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
        } else {
            appCompatImageView2 = appCompatImageView3;
        }
        appCompatImageView2.setVisibility(8);
    }

    public final void restoreFeedback() {
        AppCompatImageView appCompatImageView = this.helpfulBtn;
        AppCompatImageView appCompatImageView2 = null;
        if (appCompatImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("helpfulBtn");
            appCompatImageView = null;
        }
        appCompatImageView.setImageResource(R.drawable.icon_cms_grading_report_helpful);
        AppCompatImageView appCompatImageView3 = this.notHelpfulBtn;
        if (appCompatImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
            appCompatImageView3 = null;
        }
        appCompatImageView3.setImageResource(R.drawable.icon_cms_grading_report_unhelpful);
        AppCompatImageView appCompatImageView4 = this.notHelpfulBtn;
        if (appCompatImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("notHelpfulBtn");
        } else {
            appCompatImageView2 = appCompatImageView4;
        }
        appCompatImageView2.setRotationY(0.0f);
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public int getLayoutId() {
        return R.layout.layout_cms_grading_report;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finish$lambda$2$lambda$1(GradingReportCmsItem this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            this$0.onHelpfulClick.invoke(this$0);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
