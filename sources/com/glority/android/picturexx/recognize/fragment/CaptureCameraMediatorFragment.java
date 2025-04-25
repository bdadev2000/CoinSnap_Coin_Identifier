package com.glority.android.picturexx.recognize.fragment;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.Size;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.CameraController;
import androidx.camera.view.LifecycleCameraController;
import androidx.camera.view.PreviewView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.lifecycle.LifecycleOwnerKt;
import com.glority.android.picturexx.recognize.FocusFrameLayout;
import com.glority.android.picturexx.recognize.FocusMarkerLayout;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.databinding.FragmentCaptureBinding;
import com.glority.android.picturexx.recognize.listeners.OnZoomStateChangedListener;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.FileHelper;
import com.glority.base.viewmodel.AppViewModel;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: CaptureCameraMediatorFragment.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017H\u0014J\b\u0010&\u001a\u00020'H\u0004J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J0\u0010-\u001a\u00020\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00190\u00172\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00190\u0017H\u0004J\b\u00102\u001a\u00020\u0019H\u0004J\b\u00103\u001a\u00020\u0019H\u0004J\b\u00104\u001a\u00020\u0019H\u0004J\u0010\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u0015H\u0004J\u0010\u00107\u001a\u00020\u00192\u0006\u00108\u001a\u00020\u001bH\u0004J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u001bH\u0004J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\u0019H\u0002J\b\u0010>\u001a\u00020\u0019H\u0002J\b\u0010?\u001a\u00020\u0019H\u0016J\b\u0010@\u001a\u00020\u0019H\u0016J\b\u0010A\u001a\u00020\u0019H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n8E@EX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R&\u0010#\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n8E@EX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006B"}, d2 = {"Lcom/glority/android/picturexx/recognize/fragment/CaptureCameraMediatorFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/recognize/databinding/FragmentCaptureBinding;", "<init>", "()V", "viewFinder", "Lcom/glority/android/picturexx/recognize/FocusFrameLayout;", "getViewFinder", "()Lcom/glority/android/picturexx/recognize/FocusFrameLayout;", "hasInitialized", "", "lifecycleCameraController", "Landroidx/camera/view/LifecycleCameraController;", "getLifecycleCameraController", "()Landroidx/camera/view/LifecycleCameraController;", "lifecycleCameraController$delegate", "Lkotlin/Lazy;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "cameraCaptureExecutor", "onZoomStateChangedListener", "Lcom/glority/android/picturexx/recognize/listeners/OnZoomStateChangedListener;", "getImageAnalyzer", "Lkotlin/Function1;", "Landroidx/camera/core/ImageProxy;", "", "maxZoomValue", "", "minZoomValue", "currentZoomValue", "value", "isLightOn", "()Z", "setLightOn", "(Z)V", "capturing", "getCapturing", "setCapturing", "getLayoutId", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "takePicture", "onImageCaptured", "Landroid/graphics/Bitmap;", "onError", "Landroidx/camera/core/ImageCaptureException;", "switchTorchState", "disableTorch", "enableTorch", "setOnZoomStateChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setZoom", "zoom", "setZoomMultiplier", "zoomMultiplier", "getImageOutputFile", "Ljava/io/File;", "createCameraView", "initializeCamera", "onResume", "onPause", "onDestroyView", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public abstract class CaptureCameraMediatorFragment extends BaseFragment<FragmentCaptureBinding> {
    private final ExecutorService cameraCaptureExecutor;
    private final ExecutorService cameraExecutor;
    private boolean capturing;
    private float currentZoomValue;
    private boolean hasInitialized;
    private boolean isLightOn;

    /* renamed from: lifecycleCameraController$delegate, reason: from kotlin metadata */
    private final Lazy lifecycleCameraController = LazyKt.lazy(new Function0<LifecycleCameraController>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$lifecycleCameraController$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final LifecycleCameraController invoke() {
            Context context = CaptureCameraMediatorFragment.this.getContext();
            if (context == null) {
                return null;
            }
            LifecycleCameraController lifecycleCameraController = new LifecycleCameraController(context);
            lifecycleCameraController.setCameraSelector(CameraSelector.DEFAULT_BACK_CAMERA);
            Size size = new Size(AppViewModel.PICTURE_WIDTH, 2160);
            Size size2 = new Size(540, AppViewModel.PICTURE_WIDTH);
            lifecycleCameraController.setImageCaptureTargetSize(new CameraController.OutputSize(size));
            lifecycleCameraController.setImageAnalysisTargetSize(new CameraController.OutputSize(size2));
            lifecycleCameraController.setImageCaptureMode(1);
            lifecycleCameraController.setImageAnalysisBackpressureStrategy(0);
            return lifecycleCameraController;
        }
    });
    private float maxZoomValue;
    private float minZoomValue;
    private OnZoomStateChangedListener onZoomStateChangedListener;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCameraView$lambda$2(View view) {
    }

    protected Function1<ImageProxy, Unit> getImageAnalyzer() {
        return null;
    }

    public CaptureCameraMediatorFragment() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.cameraExecutor = newSingleThreadExecutor;
        ExecutorService newSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor2, "newSingleThreadExecutor(...)");
        this.cameraCaptureExecutor = newSingleThreadExecutor2;
        this.maxZoomValue = 1.0f;
        this.minZoomValue = 1.0f;
        this.currentZoomValue = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final FocusFrameLayout getViewFinder() {
        FocusFrameLayout cv = ((FragmentCaptureBinding) getBinding()).cv;
        Intrinsics.checkNotNullExpressionValue(cv, "cv");
        return cv;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final LifecycleCameraController getLifecycleCameraController() {
        return (LifecycleCameraController) this.lifecycleCameraController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: isLightOn, reason: from getter */
    public final boolean getIsLightOn() {
        return this.isLightOn;
    }

    protected final void setLightOn(boolean z) {
        this.isLightOn = z;
    }

    protected final boolean getCapturing() {
        return this.capturing;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setCapturing(boolean z) {
        this.capturing = z;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected final int getLayoutId() {
        return R.layout.fragment_capture;
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CaptureCameraMediatorFragment$onViewCreated$1(this, null), 3, null);
        createCameraView();
        if (this.hasInitialized) {
            return;
        }
        initializeCamera();
        this.hasInitialized = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void takePicture(final Function1<? super Bitmap, Unit> onImageCaptured, final Function1<? super ImageCaptureException, Unit> onError) {
        LifecycleCameraController lifecycleCameraController;
        Intrinsics.checkNotNullParameter(onImageCaptured, "onImageCaptured");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (isAdded() && (lifecycleCameraController = getLifecycleCameraController()) != null) {
            lifecycleCameraController.takePicture(this.cameraCaptureExecutor, new ImageCapture.OnImageCapturedCallback() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$takePicture$1
                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onCaptureSuccess(ImageProxy image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    try {
                        try {
                            ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                            Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
                            int remaining = buffer.remaining();
                            byte[] bArr = new byte[remaining];
                            buffer.get(bArr);
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining);
                            Matrix matrix = new Matrix();
                            int rotationDegrees = image.getImageInfo().getRotationDegrees();
                            if (rotationDegrees == 90) {
                                matrix.postRotate(90.0f);
                            } else if (rotationDegrees == 180) {
                                matrix.postRotate(180.0f);
                            } else if (rotationDegrees == 270) {
                                matrix.postRotate(270.0f);
                            }
                            int width = decodeByteArray.getWidth();
                            int height = decodeByteArray.getHeight();
                            float f = 1080.0f / (width > height ? height : width);
                            if (f < 1.0f) {
                                matrix.postScale(f, f);
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                            onImageCaptured.invoke(createBitmap);
                            if (!Intrinsics.areEqual(decodeByteArray, createBitmap)) {
                                decodeByteArray.recycle();
                            }
                        } catch (Exception e) {
                            onError.invoke(new ImageCaptureException(2, "Failed to process image", e));
                        }
                    } finally {
                        image.close();
                    }
                }

                @Override // androidx.camera.core.ImageCapture.OnImageCapturedCallback
                public void onError(ImageCaptureException exception) {
                    Intrinsics.checkNotNullParameter(exception, "exception");
                    onError.invoke(exception);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void switchTorchState() {
        this.isLightOn = !this.isLightOn;
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController != null) {
            lifecycleCameraController.enableTorch(this.isLightOn);
        }
    }

    protected final void disableTorch() {
        this.isLightOn = false;
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController != null) {
            lifecycleCameraController.enableTorch(false);
        }
    }

    protected final void enableTorch() {
        this.isLightOn = true;
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController != null) {
            lifecycleCameraController.enableTorch(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setOnZoomStateChangeListener(OnZoomStateChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onZoomStateChangedListener = listener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setZoom(float zoom) {
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController != null) {
            lifecycleCameraController.setZoomRatio(zoom);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setZoomMultiplier(float zoomMultiplier) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.currentZoomValue, Math.min(this.currentZoomValue * zoomMultiplier, this.maxZoomValue));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$$ExternalSyntheticLambda0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CaptureCameraMediatorFragment.setZoomMultiplier$lambda$0(CaptureCameraMediatorFragment.this, valueAnimator);
            }
        });
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setZoomMultiplier$lambda$0(CaptureCameraMediatorFragment this$0, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this$0.setZoom(((Float) animatedValue).floatValue());
    }

    private final File getImageOutputFile() {
        File pictureCacheFile = FileHelper.INSTANCE.getPictureCacheFile("jpg");
        File parentFile = pictureCacheFile.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        return pictureCacheFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void createCameraView() {
        Context context;
        LifecycleCameraController lifecycleCameraController;
        if (!isAdded() || (context = getContext()) == null || (lifecycleCameraController = getLifecycleCameraController()) == null) {
            return;
        }
        FocusFrameLayout cv = ((FragmentCaptureBinding) getBinding()).cv;
        Intrinsics.checkNotNullExpressionValue(cv, "cv");
        PreviewView previewView = new PreviewView(context);
        previewView.setScaleType(PreviewView.ScaleType.FILL_CENTER);
        previewView.setImplementationMode(PreviewView.ImplementationMode.COMPATIBLE);
        previewView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureCameraMediatorFragment.createCameraView$lambda$2(view);
            }
        });
        previewView.setController(lifecycleCameraController);
        cv.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        cv.addView(previewView, new FrameLayout.LayoutParams(-1, -1));
        FocusMarkerLayout focusMarkerLayout = new FocusMarkerLayout(context, null, 2, null);
        focusMarkerLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        cv.setFocusView(focusMarkerLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initializeCamera() {
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController == null) {
            return;
        }
        try {
            final Function1<ImageProxy, Unit> imageAnalyzer = getImageAnalyzer();
            if (imageAnalyzer != null) {
                lifecycleCameraController.setImageAnalysisAnalyzer(this.cameraExecutor, new ImageAnalyzerWrapper(new Function1<ImageProxy, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$initializeCamera$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageProxy imageProxy) {
                        invoke2(imageProxy);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageProxy it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        imageAnalyzer.invoke(it);
                    }
                }));
            }
            FocusFrameLayout cv = ((FragmentCaptureBinding) getBinding()).cv;
            Intrinsics.checkNotNullExpressionValue(cv, "cv");
            for (View view : ViewGroupKt.getChildren(cv)) {
                if (view instanceof PreviewView) {
                    ((PreviewView) view).setController(lifecycleCameraController);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        LifecycleCameraController lifecycleCameraController;
        super.onResume();
        if (!isAdded() || isDetached() || (lifecycleCameraController = getLifecycleCameraController()) == null) {
            return;
        }
        try {
            lifecycleCameraController.clearImageAnalysisAnalyzer();
            final Function1<ImageProxy, Unit> imageAnalyzer = getImageAnalyzer();
            if (imageAnalyzer != null) {
                lifecycleCameraController.setImageAnalysisAnalyzer(this.cameraExecutor, new ImageAnalyzerWrapper(new Function1<ImageProxy, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment$onResume$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageProxy imageProxy) {
                        invoke2(imageProxy);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ImageProxy image) {
                        Intrinsics.checkNotNullParameter(image, "image");
                        try {
                            imageAnalyzer.invoke(image);
                        } finally {
                            image.close();
                        }
                    }
                }));
            }
            lifecycleCameraController.bindToLifecycle(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController != null) {
            lifecycleCameraController.unbind();
        }
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.hasInitialized = false;
        LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
        if (lifecycleCameraController != null) {
            lifecycleCameraController.clearImageAnalysisAnalyzer();
            lifecycleCameraController.unbind();
        }
    }
}
