package com.glority.android.netimageadapter;

import androidx.webkit.ProxyConfig;
import com.bumptech.glide.load.engine.cache.SafeKeyGenerator;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.signature.EmptySignature;
import com.glority.android.netimageadapter.glidecode.DataCacheKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ImageCompressUrl.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\u000eJ\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/glority/android/netimageadapter/ImageCompressUrl;", "", "url", "", "useOriginal", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "height", "", "getUrl", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "width", "getBestUrl", "getBestUrl$mod_release", "getResizeUrl", "save", "", "Companion", "mod_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class ImageCompressUrl {
    private static final List<ImageCompressUrl> URLS = new ArrayList();
    private int height;
    private final String url;
    private final Boolean useOriginal;
    private int width;

    public ImageCompressUrl(String url, Boolean bool) {
        Intrinsics.checkParameterIsNotNull(url, "url");
        this.url = url;
        this.useOriginal = bool;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ImageCompressUrl(java.lang.String r1, java.lang.Boolean r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            java.lang.Boolean r3 = (java.lang.Boolean) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.netimageadapter.ImageCompressUrl.<init>(java.lang.String, java.lang.Boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getBestUrl$mod_release(int width, int height) {
        String str;
        Object obj;
        try {
            String safeKey = new SafeKeyGenerator().getSafeKey(new DataCacheKey(new GlideUrl(this.url), EmptySignature.obtain()));
            List<String> cacheFileNames = NetImageSelfAdapter.INSTANCE.getCacheFileNames();
            Object obj2 = null;
            if (cacheFileNames != null) {
                Iterator<T> it = cacheFileNames.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    Intrinsics.checkExpressionValueIsNotNull(safeKey, "safeKey");
                    if (StringsKt.startsWith$default((String) obj, safeKey, false, 2, (Object) null)) {
                        break;
                    }
                }
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null) {
                return this.url;
            }
            List<ImageCompressUrl> list = URLS;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (Intrinsics.areEqual(((ImageCompressUrl) obj3).url, this.url)) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = arrayList;
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                ImageCompressUrl imageCompressUrl = (ImageCompressUrl) next;
                if (imageCompressUrl.width * imageCompressUrl.height == 0) {
                    obj2 = next;
                    break;
                }
            }
            ImageCompressUrl imageCompressUrl2 = (ImageCompressUrl) obj2;
            if (imageCompressUrl2 != null) {
                return imageCompressUrl2.getResizeUrl();
            }
            if (Intrinsics.areEqual((Object) this.useOriginal, (Object) true)) {
                this.width = 0;
                this.height = 0;
                save();
                return this.url;
            }
            this.width = width;
            this.height = height;
            ImageCompressUrl imageCompressUrl3 = (ImageCompressUrl) CollectionsKt.firstOrNull(CollectionsKt.sortedWith(arrayList2, new Comparator<T>() { // from class: com.glority.android.netimageadapter.ImageCompressUrl$getBestUrl$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int i;
                    int i2;
                    int i3;
                    int i4;
                    ImageCompressUrl imageCompressUrl4 = (ImageCompressUrl) t2;
                    i = imageCompressUrl4.height;
                    i2 = imageCompressUrl4.width;
                    Integer valueOf = Integer.valueOf(i * i2);
                    ImageCompressUrl imageCompressUrl5 = (ImageCompressUrl) t;
                    i3 = imageCompressUrl5.height;
                    i4 = imageCompressUrl5.width;
                    return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i3 * i4));
                }
            }));
            if (imageCompressUrl3 != null) {
                if (Intrinsics.areEqual((Object) this.useOriginal, (Object) false)) {
                    return imageCompressUrl3.getResizeUrl();
                }
                if (width != 0 && height != 0 && (imageCompressUrl3.width / width < 0.7f || imageCompressUrl3.height / height < 0.7f)) {
                    save();
                    return getResizeUrl();
                }
                return imageCompressUrl3.getResizeUrl();
            }
            save();
            return getResizeUrl();
        } catch (Throwable unused) {
            return this.url;
        }
    }

    private final String getResizeUrl() {
        if (this.width > 0 && this.height > 0 && StringsKt.startsWith$default(this.url, ProxyConfig.MATCH_HTTP, false, 2, (Object) null)) {
            int i = this.width;
            int i2 = this.height;
            if (i > i2) {
                i = i2;
            }
            if (NetImageSelfAdapter.INSTANCE.getImageQuality() != null) {
                return this.url + "?x-oss-process=image/resize,s_" + i + "/quality,q_" + NetImageSelfAdapter.INSTANCE.getImageQuality();
            }
            return this.url + "?x-oss-process=image/resize,s_" + i;
        }
        return this.url;
    }

    private final void save() {
        URLS.add(this);
    }
}
