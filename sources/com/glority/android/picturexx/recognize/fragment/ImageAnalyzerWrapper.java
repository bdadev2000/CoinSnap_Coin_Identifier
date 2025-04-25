package com.glority.android.picturexx.recognize.fragment;

import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CaptureCameraMediatorFragment.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/glority/android/picturexx/recognize/fragment/ImageAnalyzerWrapper;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "onImageAnalyze", "Lkotlin/Function1;", "Landroidx/camera/core/ImageProxy;", "", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "analyze", "image", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ImageAnalyzerWrapper implements ImageAnalysis.Analyzer {
    private final Function1<ImageProxy, Unit> onImageAnalyze;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageAnalyzerWrapper(Function1<? super ImageProxy, Unit> onImageAnalyze) {
        Intrinsics.checkNotNullParameter(onImageAnalyze, "onImageAnalyze");
        this.onImageAnalyze = onImageAnalyze;
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        try {
            this.onImageAnalyze.invoke(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
