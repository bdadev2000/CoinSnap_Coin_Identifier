package com.google.ar.core;

import android.media.ImageReader;

/* loaded from: classes2.dex */
public final /* synthetic */ class l implements ImageReader.OnImageAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ l f14306a = new Object();

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final /* synthetic */ void onImageAvailable(ImageReader imageReader) {
        SharedCamera.lambda$setDummyOnImageAvailableListener$0(imageReader);
    }
}
