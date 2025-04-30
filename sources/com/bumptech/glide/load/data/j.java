package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j extends b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AssetManager assetManager, String str, int i9) {
        super(0, str, assetManager);
        this.f12860g = i9;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f12860g) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final void g(Object obj) {
        switch (this.f12860g) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.b
    public final Object i(AssetManager assetManager, String str) {
        switch (this.f12860g) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
