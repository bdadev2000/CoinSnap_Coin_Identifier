package com.glority.android.picturexx.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.glority.android.cmsui2.model.JsBaseParam;
import com.glority.android.cmsui2.model.JsData;
import com.glority.android.cmsui2.model.JsImgParam;
import com.glority.android.cmsui2.model.JsImgsParam;
import com.glority.android.cmsui2.model.JsPageParam;
import com.glority.android.core.route.webview.WebViewOpenRequest;
import com.glority.android.picturexx.view.search.SearchCmsDetailFragment;
import com.glority.android.xx.constants.LogEvents;
import com.glority.widget.imagepager.GlImageCopyRight;
import com.glority.widget.imagepager.GlImageItem;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CmsWebJsClickUtil2.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/glority/android/picturexx/utils/CmsWebJsClickUtil2;", "", "<init>", "()V", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CmsWebJsClickUtil2 {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: CmsWebJsClickUtil2.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ.\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/utils/CmsWebJsClickUtil2$Companion;", "", "<init>", "()V", "imageClick", "", "fragment", "Landroidx/fragment/app/Fragment;", "t", "Lcom/glority/android/cmsui2/model/JsData;", "imagesClick", "linkClick", "activity", "Landroid/app/Activity;", "logName", "", "logBundle", "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void imageClick(Fragment fragment, JsData t) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(t, "t");
            JsBaseParam parameter = t.getParameter();
            JsImgParam jsImgParam = parameter instanceof JsImgParam ? (JsImgParam) parameter : null;
            if (jsImgParam != null) {
                ArrayList arrayListOf = CollectionsKt.arrayListOf(new GlImageItem(jsImgParam.getUrl(), new GlImageCopyRight(jsImgParam.getAuthor(), null, jsImgParam.getCertLink(), jsImgParam.getDetailUrl(), jsImgParam.getAuthorLink(), jsImgParam.getLicense()), null, null, false, 28, null));
                Context context = fragment.getContext();
                if (context != null) {
                    GlNormalImagePagerActivity.Companion.open$default(GlNormalImagePagerActivity.INSTANCE, context, arrayListOf, 0, null, 8, null);
                }
            }
        }

        public final void imagesClick(Fragment fragment, JsData t) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(t, "t");
            JsBaseParam parameter = t.getParameter();
            JsImgsParam jsImgsParam = parameter instanceof JsImgsParam ? (JsImgsParam) parameter : null;
            if (jsImgsParam != null) {
                int index = jsImgsParam.getIndex();
                List<JsImgParam> images = jsImgsParam.getImages();
                if (images != null) {
                    List<JsImgParam> list = images;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (JsImgParam jsImgParam : list) {
                        arrayList.add(new GlImageItem(jsImgParam.getUrl(), new GlImageCopyRight(jsImgParam.getAuthor(), null, jsImgParam.getCertLink(), jsImgParam.getDetailUrl(), jsImgParam.getAuthorLink(), jsImgParam.getLicense()), null, null, false, 28, null));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(arrayList);
                    if (index < 0 || index >= arrayList2.size()) {
                        return;
                    }
                    GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                    Context requireContext = fragment.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    GlNormalImagePagerActivity.Companion.open$default(companion, requireContext, arrayList2, 0, null, 8, null);
                }
            }
        }

        public static /* synthetic */ void linkClick$default(Companion companion, Activity activity, JsData jsData, String str, Bundle bundle, int i, Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            if ((i & 8) != 0) {
                bundle = null;
            }
            companion.linkClick(activity, jsData, str, bundle);
        }

        public final void linkClick(Activity activity, JsData t, String logName, Bundle logBundle) {
            String url;
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(t, "t");
            JsBaseParam parameter = t.getParameter();
            JsPageParam jsPageParam = parameter instanceof JsPageParam ? (JsPageParam) parameter : null;
            if (jsPageParam != null) {
                if (jsPageParam.isUid()) {
                    String uid = jsPageParam.getUid();
                    if (uid == null || uid.length() == 0) {
                        return;
                    }
                    SearchCmsDetailFragment.Companion companion = SearchCmsDetailFragment.INSTANCE;
                    String uid2 = jsPageParam.getUid();
                    Intrinsics.checkNotNull(uid2);
                    companion.openByUid(activity, uid2, (r18 & 4) != 0 ? null : LogEvents.cmslink, (r18 & 8) != 0 ? null : LogEvents.cmslink, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
                    return;
                }
                if (jsPageParam.isSubPage()) {
                    String url2 = jsPageParam.getUrl();
                    if (url2 == null || url2.length() == 0) {
                        return;
                    }
                    String url3 = jsPageParam.getUrl();
                    Intrinsics.checkNotNull(url3);
                    String title = jsPageParam.getTitle();
                    new WebViewOpenRequest(url3, title == null ? "" : title, null, false, false, logName, logBundle, 28, null).post();
                    return;
                }
                if (!jsPageParam.isCommonLink() || (url = jsPageParam.getUrl()) == null || url.length() == 0) {
                    return;
                }
                String url4 = jsPageParam.getUrl();
                Intrinsics.checkNotNull(url4);
                String title2 = jsPageParam.getTitle();
                new WebViewOpenRequest(url4, title2 == null ? "" : title2, (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
            }
        }
    }
}
