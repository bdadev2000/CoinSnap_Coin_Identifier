package com.glority.android.netimageadapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.webkit.ProxyConfig;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Extensions.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u001b\u0010\n\u001a\u00020\u000b*\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"loadWithThumbnail", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/RequestManager;", "context", "Landroid/content/Context;", "url", "", "fragment", "Landroidx/fragment/app/Fragment;", "toImageCompressUrl", "", "original", "", "(Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/Object;", "mod_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class ExtensionsKt {
    public static final RequestBuilder<Drawable> loadWithThumbnail(RequestManager loadWithThumbnail, Context context, String str) {
        Intrinsics.checkParameterIsNotNull(loadWithThumbnail, "$this$loadWithThumbnail");
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (str == null) {
            RequestBuilder<Drawable> load = Glide.with(context).load("");
            Intrinsics.checkExpressionValueIsNotNull(load, "Glide.with(context).load(\"\")");
            return load;
        }
        if (StringsKt.startsWith$default(str, ProxyConfig.MATCH_HTTP, false, 2, (Object) null)) {
            RequestBuilder<Drawable> thumbnail = loadWithThumbnail.load(toImageCompressUrl(str, true)).thumbnail(Glide.with(context).load(toImageCompressUrl(str, false)));
            Intrinsics.checkExpressionValueIsNotNull(thumbnail, "this.load(url.toImageCom…ImageCompressUrl(false)))");
            return thumbnail;
        }
        RequestBuilder<Drawable> load2 = loadWithThumbnail.load(str);
        Intrinsics.checkExpressionValueIsNotNull(load2, "this.load(url)");
        return load2;
    }

    public static final RequestBuilder<Drawable> loadWithThumbnail(RequestManager loadWithThumbnail, Fragment fragment, String str) {
        Intrinsics.checkParameterIsNotNull(loadWithThumbnail, "$this$loadWithThumbnail");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        if (str == null) {
            RequestBuilder<Drawable> load = Glide.with(fragment).load("");
            Intrinsics.checkExpressionValueIsNotNull(load, "Glide.with(fragment).load(\"\")");
            return load;
        }
        if (StringsKt.startsWith$default(str, ProxyConfig.MATCH_HTTP, false, 2, (Object) null)) {
            RequestBuilder<Drawable> thumbnail = loadWithThumbnail.load(toImageCompressUrl(str, true)).thumbnail(Glide.with(fragment).load(toImageCompressUrl(str, false)));
            Intrinsics.checkExpressionValueIsNotNull(thumbnail, "this.load(url.toImageCom…ImageCompressUrl(false)))");
            return thumbnail;
        }
        RequestBuilder<Drawable> load2 = loadWithThumbnail.load(str);
        Intrinsics.checkExpressionValueIsNotNull(load2, "this.load(url)");
        return load2;
    }

    public static /* synthetic */ Object toImageCompressUrl$default(String str, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return toImageCompressUrl(str, bool);
    }

    public static final Object toImageCompressUrl(String toImageCompressUrl, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(toImageCompressUrl, "$this$toImageCompressUrl");
        return !StringsKt.startsWith(toImageCompressUrl, ProxyConfig.MATCH_HTTP, true) ? toImageCompressUrl : new ImageCompressUrl(toImageCompressUrl, bool);
    }
}
