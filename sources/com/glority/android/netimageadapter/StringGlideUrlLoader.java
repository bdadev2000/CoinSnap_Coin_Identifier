package com.glority.android.netimageadapter;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.StringLoader;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringGlideUrlLoader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0002\u0010\u0006J0\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"Lcom/glority/android/netimageadapter/StringGlideUrlLoader;", "Lcom/bumptech/glide/load/model/StringLoader;", "Ljava/io/InputStream;", "concreteLoader", "Lcom/bumptech/glide/load/model/ModelLoader;", "Landroid/net/Uri;", "(Lcom/bumptech/glide/load/model/ModelLoader;)V", "buildLoadData", "Lcom/bumptech/glide/load/model/ModelLoader$LoadData;", "model", "", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "Factory", "mod_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class StringGlideUrlLoader extends StringLoader<InputStream> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringGlideUrlLoader(ModelLoader<Uri, InputStream> concreteLoader) {
        super(concreteLoader);
        Intrinsics.checkParameterIsNotNull(concreteLoader, "concreteLoader");
    }

    @Override // com.bumptech.glide.load.model.StringLoader, com.bumptech.glide.load.model.ModelLoader
    public ModelLoader.LoadData<InputStream> buildLoadData(String model, int width, int height, Options options) {
        Intrinsics.checkParameterIsNotNull(model, "model");
        Intrinsics.checkParameterIsNotNull(options, "options");
        Object imageCompressUrl$default = ExtensionsKt.toImageCompressUrl$default(model, null, 1, null);
        if (imageCompressUrl$default instanceof ImageCompressUrl) {
            if (NetImageSelfAdapter.INSTANCE.isOpen()) {
                model = ((ImageCompressUrl) imageCompressUrl$default).getBestUrl$mod_release(width, height);
            }
        } else if (!(imageCompressUrl$default instanceof String)) {
            model = "";
        } else {
            model = (String) imageCompressUrl$default;
        }
        return super.buildLoadData(model, width, height, options);
    }

    /* compiled from: StringGlideUrlLoader.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/glority/android/netimageadapter/StringGlideUrlLoader$Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "", "Ljava/io/InputStream;", "()V", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "mod_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes2.dex */
    public static final class Factory implements ModelLoaderFactory<String, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<String, InputStream> build(MultiModelLoaderFactory multiFactory) {
            Intrinsics.checkParameterIsNotNull(multiFactory, "multiFactory");
            ModelLoader build = multiFactory.build(Uri.class, InputStream.class);
            Intrinsics.checkExpressionValueIsNotNull(build, "multiFactory.build(\n    …ss.java\n                )");
            return new StringGlideUrlLoader(build);
        }
    }
}
