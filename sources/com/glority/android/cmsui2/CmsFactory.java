package com.glority.android.cmsui2;

import android.content.Context;
import com.glority.android.cmsui2.entity.CmsItemEntity;
import com.glority.android.cmsui2.view.child.CmsJoinRedditView;
import com.glority.android.cmsui2.view.child.CmsLoadingView;
import com.glority.android.cmsui2.view.child.SeparatorItemView;
import com.glority.android.cmsui2.view.child.WebViewItemView;
import com.glority.base.widget.webview.JsbWebView;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsFactory.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005JV\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0006\u0010\u0015\u001a\u00020\u0005¨\u0006\u0016"}, d2 = {"Lcom/glority/android/cmsui2/CmsFactory;", "", "<init>", "()V", "createJoinRedditView", "Lcom/glority/android/cmsui2/entity/CmsItemEntity;", "createLoadingView", "createWebView", "context", "Landroid/content/Context;", "url", "", "allowRules", "", "methodListener", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "startupParams", "", "onLoadingFinish", "Lkotlin/Function0;", "", "createItemSeparator", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public final class CmsFactory {
    public static final CmsFactory INSTANCE = new CmsFactory();

    private CmsFactory() {
    }

    public final CmsItemEntity createJoinRedditView() {
        return new CmsItemEntity(46, null, new CmsJoinRedditView());
    }

    public final CmsItemEntity createLoadingView() {
        return new CmsItemEntity(38, null, new CmsLoadingView());
    }

    public static /* synthetic */ CmsItemEntity createWebView$default(CmsFactory cmsFactory, Context context, String str, Set set, JsbWebView.MethodListener methodListener, Map map, Function0 function0, int i, Object obj) {
        if ((i & 32) != 0) {
            function0 = null;
        }
        return cmsFactory.createWebView(context, str, set, methodListener, map, function0);
    }

    public final CmsItemEntity createWebView(Context context, String url, Set<String> allowRules, JsbWebView.MethodListener methodListener, Map<String, ? extends Object> startupParams, Function0<Unit> onLoadingFinish) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(allowRules, "allowRules");
        Intrinsics.checkNotNullParameter(startupParams, "startupParams");
        return new CmsItemEntity(21, "", new WebViewItemView(context, url, allowRules, methodListener, startupParams, null, onLoadingFinish, 32, null));
    }

    public final CmsItemEntity createItemSeparator() {
        return new CmsItemEntity(29, "", new SeparatorItemView());
    }
}
