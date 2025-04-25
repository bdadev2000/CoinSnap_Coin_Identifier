package com.glority.android.netimageadapter;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.stream.BaseGlideUrlLoader;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomUrlLoader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B1\u0012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b¢\u0006\u0002\u0010\tJ*\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\u0016"}, d2 = {"Lcom/glority/android/netimageadapter/CustomUrlLoader;", "Lcom/bumptech/glide/load/model/stream/BaseGlideUrlLoader;", "Lcom/glority/android/netimageadapter/ImageCompressUrl;", "concreteLoader", "Lcom/bumptech/glide/load/model/ModelLoader;", "Lcom/bumptech/glide/load/model/GlideUrl;", "Ljava/io/InputStream;", "modelCache", "Lcom/bumptech/glide/load/model/ModelCache;", "(Lcom/bumptech/glide/load/model/ModelLoader;Lcom/bumptech/glide/load/model/ModelCache;)V", "getUrl", "", "model", "width", "", "height", "options", "Lcom/bumptech/glide/load/Options;", "handles", "", "Companion", "Factory", "mod_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes2.dex */
public final class CustomUrlLoader extends BaseGlideUrlLoader<ImageCompressUrl> {
    private static final ModelCache<ImageCompressUrl, GlideUrl> urlCache = new ModelCache<>(150);

    @Override // com.bumptech.glide.load.model.ModelLoader
    public boolean handles(ImageCompressUrl model) {
        Intrinsics.checkParameterIsNotNull(model, "model");
        return true;
    }

    public CustomUrlLoader(ModelLoader<GlideUrl, InputStream> modelLoader, ModelCache<ImageCompressUrl, GlideUrl> modelCache) {
        super(modelLoader, modelCache);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.model.stream.BaseGlideUrlLoader
    public String getUrl(ImageCompressUrl model, int width, int height, Options options) {
        Intrinsics.checkParameterIsNotNull(model, "model");
        return NetImageSelfAdapter.INSTANCE.isOpen() ? model.getBestUrl$mod_release(width, height) : model.getUrl();
    }

    /* compiled from: CustomUrlLoader.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/glority/android/netimageadapter/CustomUrlLoader$Factory;", "Lcom/bumptech/glide/load/model/ModelLoaderFactory;", "Lcom/glority/android/netimageadapter/ImageCompressUrl;", "Ljava/io/InputStream;", "()V", "build", "Lcom/bumptech/glide/load/model/ModelLoader;", "multiFactory", "Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;", "teardown", "", "mod_release"}, k = 1, mv = {1, 1, 16})
    /* loaded from: classes2.dex */
    public static final class Factory implements ModelLoaderFactory<ImageCompressUrl, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public void teardown() {
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader<ImageCompressUrl, InputStream> build(MultiModelLoaderFactory multiFactory) {
            Intrinsics.checkParameterIsNotNull(multiFactory, "multiFactory");
            return new CustomUrlLoader(multiFactory.build(GlideUrl.class, InputStream.class), CustomUrlLoader.urlCache);
        }
    }
}
