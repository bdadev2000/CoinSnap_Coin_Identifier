package com.glority.android.cmsui2.view.child;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.glority.android.cmsui2.R;
import com.glority.android.cmsui2.entity.ExtraData;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.core.app.AppContext;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.utils.stability.LogUtils;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CmsJoinRedditView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/glority/android/cmsui2/view/child/CmsJoinRedditView;", "Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "<init>", "()V", "hasReportVisible", "", "getHasReportVisible", "()Z", "setHasReportVisible", "(Z)V", "enUrl", "", "frUrl", "suitableCountry", "", "suitableLanguage", "", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/LanguageCode;", "render", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "data", "Lcom/glority/android/cmsui2/entity/ExtraData;", "getLayoutId", "", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsJoinRedditView extends BaseCmsItemView {
    private final String enUrl;
    private final String frUrl;
    private boolean hasReportVisible;
    private final List<String> suitableCountry;
    private final Map<LanguageCode, String> suitableLanguage;

    public CmsJoinRedditView() {
        super("");
        this.enUrl = "https://www.facebook.com/groups/856434265711891";
        this.frUrl = "https://www.facebook.com/groups/729106565550644";
        this.suitableCountry = CollectionsKt.listOf((Object[]) new String[]{"FR", "US", "GB", "AU", "CA"});
        this.suitableLanguage = MapsKt.mapOf(TuplesKt.to(LanguageCode.English, "https://www.facebook.com/groups/856434265711891"), TuplesKt.to(LanguageCode.French, "https://www.facebook.com/groups/729106565550644"));
    }

    public final boolean getHasReportVisible() {
        return this.hasReportVisible;
    }

    public final void setHasReportVisible(boolean z) {
        this.hasReportVisible = z;
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public void render(final Context context, final View rootView, ExtraData data) {
        ViewTreeObserver viewTreeObserver;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(data, "data");
        if (this.suitableCountry.contains(AppViewModel.INSTANCE.getInstance().getCountryCode()) && this.suitableLanguage.containsKey(AppViewModel.INSTANCE.getInstance().getLanguageCode())) {
            TextView textView = (TextView) rootView.findViewById(R.id.tv1);
            String string = context.getString(R.string.details_reddit_redtips);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
            StyleSpan styleSpan = new StyleSpan(1);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#1877F2"));
            try {
                CharSequence text = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                int indexOf$default = StringsKt.indexOf$default(text, string, 0, false, 6, (Object) null);
                CharSequence text2 = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                spannableStringBuilder.setSpan(styleSpan, indexOf$default, StringsKt.indexOf$default(text2, string, 0, false, 6, (Object) null) + string.length(), 33);
                CharSequence text3 = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                int indexOf$default2 = StringsKt.indexOf$default(text3, string, 0, false, 6, (Object) null);
                CharSequence text4 = textView.getText();
                Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                spannableStringBuilder.setSpan(foregroundColorSpan, indexOf$default2, StringsKt.indexOf$default(text4, string, 0, false, 6, (Object) null) + string.length(), 33);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
            textView.setText(spannableStringBuilder);
            rootView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui2.view.child.CmsJoinRedditView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CmsJoinRedditView.render$lambda$2(CmsJoinRedditView.this, context, view);
                }
            });
            CmsView cmsView = getCmsView();
            if (cmsView == null || (viewTreeObserver = cmsView.getViewTreeObserver()) == null) {
                return;
            }
            viewTreeObserver.addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.glority.android.cmsui2.view.child.CmsJoinRedditView$render$3
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    ViewTreeObserver viewTreeObserver2;
                    CmsView cmsView2 = CmsJoinRedditView.this.getCmsView();
                    int height = cmsView2 != null ? cmsView2.getHeight() : 0;
                    if (height + (CmsJoinRedditView.this.getCmsView() != null ? r2.getScrollY() : 0) + 20 <= rootView.getY() + rootView.getHeight() || CmsJoinRedditView.this.getHasReportVisible()) {
                        return;
                    }
                    BaseCmsItemView.logEvent$default(CmsJoinRedditView.this, "reddit_joinbtn_show", null, 2, null);
                    CmsJoinRedditView.this.setHasReportVisible(true);
                    CmsView cmsView3 = CmsJoinRedditView.this.getCmsView();
                    if (cmsView3 == null || (viewTreeObserver2 = cmsView3.getViewTreeObserver()) == null) {
                        return;
                    }
                    viewTreeObserver2.removeOnScrollChangedListener(this);
                }
            });
            return;
        }
        rootView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$2(CmsJoinRedditView this$0, Context context, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        BaseCmsItemView.logEvent$default(this$0, "reddit_joinbtn_click", null, 2, null);
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this$0.suitableLanguage.get(AppViewModel.INSTANCE.getInstance().getLanguageCode()))));
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.android.cmsui2.view.BaseCmsItemView
    public int getLayoutId() {
        return R.layout.cms_join_reddit;
    }
}
