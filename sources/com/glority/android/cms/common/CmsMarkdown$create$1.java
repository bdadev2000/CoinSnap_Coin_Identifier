package com.glority.android.cms.common;

import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.glority.android.cms.R;
import com.glority.android.cms.base.MarkdownTextView;
import com.glority.android.cms.listener.CmsLinkClickListener;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import io.noties.markwon.AbstractMarkwonPlugin;
import io.noties.markwon.LinkResolver;
import io.noties.markwon.MarkwonConfiguration;
import io.noties.markwon.core.MarkwonTheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsMarkdown.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/glority/android/cms/common/CmsMarkdown$create$1", "Lio/noties/markwon/AbstractMarkwonPlugin;", "beforeSetText", "", "textView", "Landroid/widget/TextView;", "markdown", "Landroid/text/Spanned;", "configureConfiguration", "builder", "Lio/noties/markwon/MarkwonConfiguration$Builder;", "configureTheme", "Lio/noties/markwon/core/MarkwonTheme$Builder;", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsMarkdown$create$1 extends AbstractMarkwonPlugin {
    final /* synthetic */ CmsLinkClickListener $markdownClickListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CmsMarkdown$create$1(CmsLinkClickListener cmsLinkClickListener) {
        this.$markdownClickListener = cmsLinkClickListener;
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void beforeSetText(TextView textView, Spanned markdown) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        textView.setMovementMethod(MarkdownTextView.LocalLinkMovementMethod.INSTANCE.getInstance());
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureTheme(MarkwonTheme.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.linkColor(ResUtils.getColor(R.color.ClickBlue)).headingTypeface(Typeface.DEFAULT).headingTextSizeMultipliers(new float[]{1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f});
    }

    @Override // io.noties.markwon.AbstractMarkwonPlugin, io.noties.markwon.MarkwonPlugin
    public void configureConfiguration(MarkwonConfiguration.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.linkResolver(new LinkResolver() { // from class: com.glority.android.cms.common.CmsMarkdown$create$1$configureConfiguration$1
            @Override // io.noties.markwon.LinkResolver
            public final void resolve(View view, String link) {
                Intrinsics.checkNotNullParameter(view, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(link, "link");
                LogUtils.d("CmsMarkdown", "link: " + link);
                new LogEventRequest("link", null).post();
                CmsLinkClickListener cmsLinkClickListener = CmsMarkdown$create$1.this.$markdownClickListener;
                if (cmsLinkClickListener != null) {
                    cmsLinkClickListener.click(link);
                }
            }
        });
    }
}
