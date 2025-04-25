package com.glority.android.netimageadapter;

import android.app.Application;
import com.bumptech.glide.Glide;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetImageSelfAdapter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0006\u0010\u0018\u001a\u00020\u0014J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u001aR#\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/glority/android/netimageadapter/NetImageSelfAdapter;", "", "()V", "cacheFileList", "", "", "getCacheFileList", "()Ljava/util/List;", "cacheFileList$delegate", "Lkotlin/Lazy;", "context", "Landroid/app/Application;", "imageQuality", "", "getImageQuality", "()Ljava/lang/Integer;", "setImageQuality", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "mIsOpen", "", "close", "", "getCacheFileNames", "isOpen", "open", "(Landroid/app/Application;Ljava/lang/Integer;)V", "mod_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class NetImageSelfAdapter {
    public static final NetImageSelfAdapter INSTANCE = new NetImageSelfAdapter();

    /* renamed from: cacheFileList$delegate, reason: from kotlin metadata */
    private static final Lazy cacheFileList = LazyKt.lazy(new Function0<List<? extends String>>() { // from class: com.glority.android.netimageadapter.NetImageSelfAdapter$cacheFileList$2
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends String> invoke() {
            Application application;
            String[] list;
            NetImageSelfAdapter netImageSelfAdapter = NetImageSelfAdapter.INSTANCE;
            application = NetImageSelfAdapter.context;
            if (application == null) {
                Intrinsics.throwNpe();
            }
            File photoCacheDir = Glide.getPhotoCacheDir(application);
            if (photoCacheDir == null || (list = photoCacheDir.list()) == null) {
                return null;
            }
            return ArraysKt.toList(list);
        }
    });
    private static Application context;
    private static Integer imageQuality;
    private static boolean mIsOpen;

    private final List<String> getCacheFileList() {
        return (List) cacheFileList.getValue();
    }

    private NetImageSelfAdapter() {
    }

    public final Integer getImageQuality() {
        return imageQuality;
    }

    public final void setImageQuality(Integer num) {
        imageQuality = num;
    }

    public static /* synthetic */ void open$default(NetImageSelfAdapter netImageSelfAdapter, Application application, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        netImageSelfAdapter.open(application, num);
    }

    public final void open(Application context2, Integer imageQuality2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        context = context2;
        mIsOpen = true;
        imageQuality = imageQuality2;
    }

    public final boolean isOpen() {
        return mIsOpen;
    }

    public final void close() {
        mIsOpen = false;
    }

    public final List<String> getCacheFileNames() {
        return getCacheFileList();
    }
}
