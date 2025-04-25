package com.glority.android.netimageadapter;

import com.bumptech.glide.Registry;
import com.glority.android.netimageadapter.CustomUrlLoader;
import com.glority.android.netimageadapter.StringGlideUrlLoader;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NetImageAdapterGlideRegister.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/netimageadapter/NetImageAdapterGlideRegister;", "", "()V", "regist", "", "registry", "Lcom/bumptech/glide/Registry;", "mod_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class NetImageAdapterGlideRegister {
    public static final NetImageAdapterGlideRegister INSTANCE = new NetImageAdapterGlideRegister();

    private NetImageAdapterGlideRegister() {
    }

    public final void regist(Registry registry) {
        Intrinsics.checkParameterIsNotNull(registry, "registry");
        registry.replace(String.class, InputStream.class, new StringGlideUrlLoader.Factory());
        registry.append(ImageCompressUrl.class, InputStream.class, new CustomUrlLoader.Factory());
    }
}
