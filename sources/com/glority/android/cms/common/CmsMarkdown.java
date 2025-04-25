package com.glority.android.cms.common;

import android.widget.TextView;
import com.glority.android.cms.listener.CmsLinkClickListener;
import com.glority.utils.UtilsApp;
import io.noties.markwon.Markwon;
import io.noties.markwon.image.glide.GlideImagesPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsMarkdown.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J$\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/android/cms/common/CmsMarkdown;", "", "()V", "create", "Lio/noties/markwon/Markwon;", "markdownClickListener", "Lcom/glority/android/cms/listener/CmsLinkClickListener;", "setText", "", "markdown", "textView", "Landroid/widget/TextView;", "text", "", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class CmsMarkdown {
    public static final CmsMarkdown INSTANCE = new CmsMarkdown();

    private CmsMarkdown() {
    }

    public final Markwon create(CmsLinkClickListener markdownClickListener) {
        Markwon build = Markwon.builder(UtilsApp.getApp()).usePlugin(GlideImagesPlugin.create(UtilsApp.getApp())).usePlugin(new CmsMarkdown$create$1(markdownClickListener)).build();
        Intrinsics.checkNotNullExpressionValue(build, "Markwon.builder(UtilsApp… }\n            }).build()");
        return build;
    }

    public final void setText(Markwon markdown, TextView textView, String text) {
        String str;
        if (textView == null || (str = text) == null || str.length() == 0) {
            return;
        }
        if (markdown != null) {
            markdown.setMarkdown(textView, text);
        } else {
            textView.setText(str);
        }
    }
}
