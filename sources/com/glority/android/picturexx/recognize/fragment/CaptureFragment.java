package com.glority.android.picturexx.recognize.fragment;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.ZoomState;
import androidx.camera.view.LifecycleCameraController;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.adjust.SendTrackEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.deviceinsights.camera.CameraInspector;
import com.glority.android.picturexx.recognize.R;
import com.glority.android.picturexx.recognize.analyzer.AreaStatus;
import com.glority.android.picturexx.recognize.analyzer.BlurProcessor;
import com.glority.android.picturexx.recognize.analyzer.LightProcessor;
import com.glority.android.picturexx.recognize.analyzer.RecognizeProcess;
import com.glority.android.picturexx.recognize.databinding.FragmentCaptureBinding;
import com.glority.android.picturexx.recognize.databinding.ItemMultiCaptureSmallImageBinding;
import com.glority.android.picturexx.recognize.extensions.FragmentCaptureBindingExtensionsKt;
import com.glority.android.picturexx.recognize.listeners.OnZoomStateChangedListener;
import com.glority.android.picturexx.recognize.logevents.RecognizeLogEvents;
import com.glority.android.picturexx.recognize.utils.RecognizeAbUtils;
import com.glority.android.picturexx.recognize.vm.CoreViewModel;
import com.glority.android.picturexx.recognize.widget.CameraVerticalZoomSeekBar;
import com.glority.android.picturexx.recognize.widget.CameraZoomSelectView;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.Args;
import com.glority.base.entity.RecognizeImageFile;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.storage.PersistKey;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.utils.ImagePicker;
import com.glority.base.utils.StatusBarUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.vip.VipInfo;
import com.glority.utils.app.ResUtils;
import com.glority.utils.permission.Permission;
import com.glority.utils.permission.PermissionUtils;
import com.glority.utils.permission.callback.PermissionResultCallback;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.imagepager.GlImageItem;
import com.glority.widget.imagepager.GlNormalImagePagerActivity;
import com.google.android.material.imageview.ShapeableImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

/* compiled from: CaptureFragment.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0016\u0018\u0000 f2\u00020\u0001:\u0001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0012\u00100\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0014J\u0016\u00101\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020-\u0018\u000102H\u0014J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020-H\u0002J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0002J.\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u0002052\f\u0010@\u001a\b\u0012\u0004\u0012\u00020-0AH\u0002J\u0016\u0010B\u001a\u00020-2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002J$\u0010E\u001a\u00020-2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0D2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020>0DH\u0002J\u0012\u0010H\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u0010I\u001a\u00020-H\u0016J\b\u0010J\u001a\u00020-H\u0002J\u0010\u0010K\u001a\u00020-2\u0006\u0010L\u001a\u00020\u0017H\u0002J\b\u0010M\u001a\u00020-H\u0002J\u0010\u0010N\u001a\u00020-2\u0006\u0010O\u001a\u00020PH\u0002J\"\u0010Q\u001a\u00020-2\u0006\u0010R\u001a\u00020\u00172\b\b\u0001\u0010S\u001a\u0002052\u0006\u0010T\u001a\u00020UH\u0002J\b\u0010V\u001a\u00020-H\u0016J\b\u0010W\u001a\u00020-H\u0016J\b\u0010X\u001a\u00020-H\u0002J\b\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020-H\u0002J\b\u0010\\\u001a\u00020ZH\u0014J\b\u0010]\u001a\u00020-H\u0016J\b\u0010^\u001a\u00020-H\u0002J\u0010\u0010_\u001a\u00020-2\u0006\u0010`\u001a\u00020\u0017H\u0002J\b\u0010a\u001a\u00020-H\u0016J\b\u0010b\u001a\u00020-H\u0002J\b\u0010c\u001a\u00020-H\u0002J\u0010\u0010d\u001a\u00020-2\u0006\u0010e\u001a\u000209H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u000b\u001a\u0004\b\u001e\u0010\u0019R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R#\u0010!\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b)\u0010*¨\u0006g"}, d2 = {"Lcom/glority/android/picturexx/recognize/fragment/CaptureFragment;", "Lcom/glority/android/picturexx/recognize/fragment/CaptureCameraMediatorFragment;", "<init>", "()V", "imagePicker", "Lcom/glority/base/utils/ImagePicker;", "vm", "Lcom/glority/android/picturexx/recognize/vm/CoreViewModel;", "getVm", "()Lcom/glority/android/picturexx/recognize/vm/CoreViewModel;", "vm$delegate", "Lkotlin/Lazy;", "captureButtonAnimator", "Landroid/animation/AnimatorSet;", "lightProcessor", "Lcom/glority/android/picturexx/recognize/analyzer/LightProcessor;", "blurProcessor", "Lcom/glority/android/picturexx/recognize/analyzer/BlurProcessor;", "focusJob", "Lkotlinx/coroutines/Job;", "lastReadyToCaptureTime", "", "enableAnalyse", "", "getEnableAnalyse", "()Z", "openTime", "ultraCamSupported", "isMacroCameraSupported", "enableCameraBigCircleStyle", "getEnableCameraBigCircleStyle", "enableCameraBigCircleStyle$delegate", "isSeekBarTouched", "zoomFactorChannel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/glority/android/picturexx/recognize/fragment/AnalysisResult;", "getZoomFactorChannel", "()Lkotlinx/coroutines/channels/Channel;", "zoomFactorChannel$delegate", "analyseCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getAnalyseCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "analyseCoroutineScope$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "getImageAnalyzer", "Lkotlin/Function1;", "Landroidx/camera/core/ImageProxy;", "snapTipsLayout", "", "initCaptureView", "doCreateViewProcedure", "minZoomRatio", "", "startCaptureAnimation", "imageUrl", "Ljava/io/File;", "targetView", "Lcom/glority/android/picturexx/recognize/databinding/ItemMultiCaptureSmallImageBinding;", "index", "onAnimatorFinish", "Lkotlin/Function0;", "init3PictureView1", "itemViews", "", "init3PictureView2", "files", "Lcom/glority/base/entity/RecognizeImageFile;", "onActivityCreated", "initView", "initSnapTipsView", "visibleSnapTips", "visible", "toResultFragment", "analyse", "bitmap", "Landroid/graphics/Bitmap;", "updateCircleStatus", "isOk", "textId", "areaStatus", "Lcom/glority/android/picturexx/recognize/analyzer/AreaStatus;", "onResume", "onDestroyView", "requestCameraPermission", "snapTipsRecordKey", "", "addSubscription", "getLogPageName", "onPause", "onPictureTaken", "holdDet", TypedValues.Custom.S_BOOLEAN, "onDestroy", "firstDayPhotoGreater3", "createAutoZoomInJob", "autoZoomIn", "autoZoomInFactor", "Companion", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public class CaptureFragment extends CaptureCameraMediatorFragment {
    private static final CompletableJob EMPTY_FOCUS_JOB;
    private static final String KEY_CAPTURE_COUNT = "KEY_CAPTURE_COUNT";
    private static final String KEY_LAST_CAPTURE_TIME = "KEY_LAST_CAPTURE_TIME";
    private AnimatorSet captureButtonAnimator;
    private ImagePicker imagePicker;
    private boolean isSeekBarTouched;
    private long lastReadyToCaptureTime;
    private boolean ultraCamSupported;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private static final String TAG = Reflection.getOrCreateKotlinClass(CaptureFragment.class).getSimpleName();
    private final LightProcessor lightProcessor = new LightProcessor();
    private final BlurProcessor blurProcessor = new BlurProcessor();
    private Job focusJob = EMPTY_FOCUS_JOB;
    private final long openTime = System.currentTimeMillis();

    /* renamed from: enableCameraBigCircleStyle$delegate, reason: from kotlin metadata */
    private final Lazy enableCameraBigCircleStyle = LazyKt.lazy(new Function0<Boolean>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$enableCameraBigCircleStyle$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean z;
            boolean isMacroCameraSupported;
            z = CaptureFragment.this.ultraCamSupported;
            if (z) {
                isMacroCameraSupported = CaptureFragment.this.isMacroCameraSupported();
                if (isMacroCameraSupported) {
                    return Boolean.valueOf(RecognizeAbUtils.enableCameraBigCircleStyle());
                }
            }
            return false;
        }
    });

    /* renamed from: zoomFactorChannel$delegate, reason: from kotlin metadata */
    private final Lazy zoomFactorChannel = LazyKt.lazy(new Function0<Channel<AnalysisResult>>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$zoomFactorChannel$2
        @Override // kotlin.jvm.functions.Function0
        public final Channel<AnalysisResult> invoke() {
            if (RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn()) {
                return ChannelKt.Channel$default(0, null, new Function1<AnalysisResult, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$zoomFactorChannel$2.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AnalysisResult it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnalysisResult analysisResult) {
                        invoke2(analysisResult);
                        return Unit.INSTANCE;
                    }
                }, 3, null);
            }
            return null;
        }
    });

    /* renamed from: analyseCoroutineScope$delegate, reason: from kotlin metadata */
    private final Lazy analyseCoroutineScope = LazyKt.lazy(new Function0<CoroutineScope>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$analyseCoroutineScope$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            CoreViewModel vm;
            vm = CaptureFragment.this.getVm();
            return CoroutineScopeKt.CoroutineScope(vm.getAnalyseThread());
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSnapTipsView$lambda$13(View view) {
    }

    public CaptureFragment() {
        final CaptureFragment captureFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(captureFragment, Reflection.getOrCreateKotlinClass(CoreViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = Fragment.this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = captureFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentCaptureBinding access$getBinding(CaptureFragment captureFragment) {
        return (FragmentCaptureBinding) captureFragment.getBinding();
    }

    static {
        CompletableJob Job$default;
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        EMPTY_FOCUS_JOB = Job$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CoreViewModel getVm() {
        return (CoreViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEnableAnalyse() {
        return Build.VERSION.SDK_INT >= 29;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isMacroCameraSupported() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        return CameraInspector.INSTANCE.checkIfCameraSupportsMacroMode(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getEnableCameraBigCircleStyle() {
        return ((Boolean) this.enableCameraBigCircleStyle.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Channel<AnalysisResult> getZoomFactorChannel() {
        return (Channel) this.zoomFactorChannel.getValue();
    }

    private final CoroutineScope getAnalyseCoroutineScope() {
        return (CoroutineScope) this.analyseCoroutineScope.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        pairArr[0] = TuplesKt.to("from", getVm().getCaptureFrom());
        RecognizeProcess recognizeProcess = getVm().getRecognizeProcess();
        pairArr[1] = TuplesKt.to("type", recognizeProcess != null ? recognizeProcess.typeName() : null);
        updateCommonEventArgs(pairArr);
        this.imagePicker = new ImagePicker(this, 2);
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            getVm().setCaptureCount(arguments.getInt("count"));
            getVm().setCaptureFrom(arguments.getString("from", ""));
            getVm().setShowSnapTips(arguments.getBoolean(Args.showSnapTips));
            getVm().setStartAnimationViewId(arguments.getInt(Args.startAnimationViewId));
            try {
                getVm().setRecognizeProcess((RecognizeProcess) Class.forName(arguments.getString(Args.processClass, "")).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        CaptureFragment captureFragment = this;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(captureFragment), Dispatchers.getIO(), null, new CaptureFragment$doCreateView$2(this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(captureFragment), null, null, new CaptureFragment$doCreateView$3(this, null), 3, null);
    }

    @Override // com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment
    protected Function1<ImageProxy, Unit> getImageAnalyzer() {
        if (getEnableAnalyse()) {
            return new Function1<ImageProxy, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$getImageAnalyzer$analyse$1
                /* JADX INFO: Access modifiers changed from: package-private */
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
                    long j;
                    Bitmap bitmapIgnoreRotation;
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (CaptureFragment.this.getLifecycleRegistry().getState().isAtLeast(Lifecycle.State.RESUMED)) {
                        long currentTimeMillis = System.currentTimeMillis();
                        j = CaptureFragment.this.openTime;
                        if (currentTimeMillis - j > 1000) {
                            bitmapIgnoreRotation = CaptureFragmentKt.toBitmapIgnoreRotation(it);
                            CaptureFragment.this.analyse(bitmapIgnoreRotation);
                        }
                    }
                }
            };
        }
        return null;
    }

    public int snapTipsLayout() {
        return R.layout.activity_snap_tips1;
    }

    private final void initCaptureView() {
        final ArrayList arrayList = new ArrayList();
        int captureCount = getVm().getCaptureCount();
        if (2 <= captureCount && captureCount < 4) {
            init3PictureView1(arrayList);
        }
        getVm().getRecognizeImageFiles().observe(this, new CaptureFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<List<RecognizeImageFile>, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initCaptureView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<RecognizeImageFile> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<RecognizeImageFile> list) {
                CoreViewModel vm;
                Intrinsics.checkNotNull(list);
                if (!(!list.isEmpty())) {
                    vm = this.getVm();
                    int captureCount2 = vm.getCaptureCount();
                    if (2 > captureCount2 || captureCount2 >= 4) {
                        return;
                    }
                    this.init3PictureView2(list, arrayList);
                    return;
                }
                int size = (list.size() > arrayList.size() ? arrayList.size() : list.size()) - 1;
                ItemMultiCaptureSmallImageBinding itemMultiCaptureSmallImageBinding = (ItemMultiCaptureSmallImageBinding) CollectionsKt.getOrNull(arrayList, size);
                if (itemMultiCaptureSmallImageBinding != null) {
                    CaptureFragment captureFragment = this;
                    File displayImageFile = ((RecognizeImageFile) CollectionsKt.last((List) list)).getDisplayImageFile();
                    final CaptureFragment captureFragment2 = this;
                    final List<ItemMultiCaptureSmallImageBinding> list2 = arrayList;
                    captureFragment.startCaptureAnimation(displayImageFile, itemMultiCaptureSmallImageBinding, size, new Function0<Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initCaptureView$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            CoreViewModel vm2;
                            CoreViewModel vm3;
                            CoreViewModel vm4;
                            vm2 = CaptureFragment.this.getVm();
                            int captureCount3 = vm2.getCaptureCount();
                            if (2 <= captureCount3 && captureCount3 < 4) {
                                int size2 = list.size();
                                vm4 = CaptureFragment.this.getVm();
                                if (size2 == vm4.getCaptureCount()) {
                                    CaptureFragment.this.toResultFragment();
                                }
                            }
                            vm3 = CaptureFragment.this.getVm();
                            int captureCount4 = vm3.getCaptureCount();
                            if (2 > captureCount4 || captureCount4 >= 4) {
                                return;
                            }
                            CaptureFragment captureFragment3 = CaptureFragment.this;
                            List<RecognizeImageFile> it = list;
                            Intrinsics.checkNotNullExpressionValue(it, "$it");
                            captureFragment3.init3PictureView2(it, list2);
                        }
                    });
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void doCreateViewProcedure(float minZoomRatio) {
        CameraVerticalZoomSeekBar zoomSeekBar = ((FragmentCaptureBinding) getBinding()).zoomSeekBar;
        Intrinsics.checkNotNullExpressionValue(zoomSeekBar, "zoomSeekBar");
        zoomSeekBar.setVisibility(getEnableCameraBigCircleStyle() ^ true ? 0 : 8);
        CameraZoomSelectView zoomSelector = ((FragmentCaptureBinding) getBinding()).zoomSelector;
        Intrinsics.checkNotNullExpressionValue(zoomSelector, "zoomSelector");
        zoomSelector.setVisibility(getEnableCameraBigCircleStyle() ? 0 : 8);
        if (isMacroCameraSupported()) {
            if (getEnableCameraBigCircleStyle()) {
                LifecycleCameraController lifecycleCameraController = getLifecycleCameraController();
                if (lifecycleCameraController != null) {
                    lifecycleCameraController.setZoomRatio(Math.max(minZoomRatio, 0.6f));
                }
                ((FragmentCaptureBinding) getBinding()).zoomSelector.updateZoomValue(Math.max(minZoomRatio, 0.6f));
            } else {
                LifecycleCameraController lifecycleCameraController2 = getLifecycleCameraController();
                if (lifecycleCameraController2 != null) {
                    lifecycleCameraController2.setZoomRatio(1.2f);
                }
            }
        }
        initView();
        initCaptureView();
        addSubscription();
        RecognizeProcess recognizeProcess = getVm().getRecognizeProcess();
        List<File> inputImages = recognizeProcess != null ? recognizeProcess.getInputImages() : null;
        List<File> list = inputImages;
        if (list != null && !list.isEmpty()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new CaptureFragment$doCreateViewProcedure$1(inputImages, this, null), 2, null);
        } else if (RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn()) {
            createAutoZoomInJob();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startCaptureAnimation(File imageUrl, ItemMultiCaptureSmallImageBinding targetView, int index, Function0<Unit> onAnimatorFinish) {
        float f;
        ShapeableImageView ivMultiCaptureImage = targetView.ivMultiCaptureImage;
        Intrinsics.checkNotNullExpressionValue(ivMultiCaptureImage, "ivMultiCaptureImage");
        GlTextView tvTitle = targetView.tvTitle;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        ivMultiCaptureImage.getLocationInWindow(new int[2]);
        float f2 = 0.0f;
        try {
            f = ivMultiCaptureImage.getWidth() / ((FragmentCaptureBinding) getBinding()).animateIv.getWidth();
        } catch (Throwable unused) {
            f = 0.0f;
        }
        try {
            f2 = ivMultiCaptureImage.getHeight() / ((FragmentCaptureBinding) getBinding()).animateIv.getHeight();
        } catch (Throwable unused2) {
        }
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f2, r0[0] + (ivMultiCaptureImage.getWidth() / 2.0f) + (index == 0 ? -7 : 8), (r0[1] + ivMultiCaptureImage.getHeight()) - 5);
        scaleAnimation.setStartOffset(100L);
        scaleAnimation.setDuration(500L);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setInterpolator(new FastOutSlowInInterpolator());
        animationSet.setFillAfter(false);
        animationSet.setFillBefore(false);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(new CaptureFragment$startCaptureAnimation$anima$1$1(this, imageUrl, tvTitle, ivMultiCaptureImage, onAnimatorFinish));
        ((FragmentCaptureBinding) getBinding()).animateContainer.startAnimation(animationSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void init3PictureView1(List<ItemMultiCaptureSmallImageBinding> itemViews) {
        LinearLayout llMultiCaptureImagesContainer = ((FragmentCaptureBinding) getBinding()).llMultiCaptureImagesContainer;
        Intrinsics.checkNotNullExpressionValue(llMultiCaptureImagesContainer, "llMultiCaptureImagesContainer");
        llMultiCaptureImagesContainer.setVisibility(0);
        int captureCount = getVm().getCaptureCount();
        final int i = 0;
        while (i < captureCount) {
            ItemMultiCaptureSmallImageBinding inflate = ItemMultiCaptureSmallImageBinding.inflate(getLayoutInflater(), ((FragmentCaptureBinding) getBinding()).llMultiCaptureImagesContainer, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            itemViews.add(inflate);
            ImageView ivMultiCaptureDelete = inflate.ivMultiCaptureDelete;
            Intrinsics.checkNotNullExpressionValue(ivMultiCaptureDelete, "ivMultiCaptureDelete");
            ViewExtensionsKt.setSingleClickListener$default(ivMultiCaptureDelete, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$init3PictureView1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    CoreViewModel vm;
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_delete_click, null, 2, null);
                    vm = CaptureFragment.this.getVm();
                    vm.deleteImageFile(i);
                }
            }, 1, (Object) null);
            ShapeableImageView ivMultiCaptureImage = inflate.ivMultiCaptureImage;
            Intrinsics.checkNotNullExpressionValue(ivMultiCaptureImage, "ivMultiCaptureImage");
            ViewExtensionsKt.setSingleClickListener$default(ivMultiCaptureImage, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$init3PictureView1$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke2(view);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    CoreViewModel vm;
                    ArrayList arrayList;
                    Intrinsics.checkNotNullParameter(it, "it");
                    BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_showthumbnail_click, null, 2, null);
                    vm = CaptureFragment.this.getVm();
                    List<RecognizeImageFile> value = vm.getRecognizeImageFiles().getValue();
                    if (value == null) {
                        arrayList = new ArrayList();
                    } else {
                        List<RecognizeImageFile> list = value;
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new GlImageItem(((RecognizeImageFile) it2.next()).getOriginalImage().getAbsolutePath(), null, null, null, false, 30, null));
                        }
                        arrayList = arrayList2;
                    }
                    ArrayList arrayList3 = arrayList;
                    if (arrayList3.size() > i) {
                        GlNormalImagePagerActivity.Companion companion = GlNormalImagePagerActivity.INSTANCE;
                        Context context = it.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        GlNormalImagePagerActivity.Companion.open$default(companion, context, arrayList3, i, null, 8, null);
                    }
                }
            }, 1, (Object) null);
            inflate.tvTitle.setText(ResUtils.getString(i == 0 ? R.string.camera_obverse : R.string.camera_reverse));
            ((FragmentCaptureBinding) getBinding()).llMultiCaptureImagesContainer.addView(inflate.getRoot());
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init3PictureView2(List<RecognizeImageFile> files, List<ItemMultiCaptureSmallImageBinding> itemViews) {
        int i = 0;
        for (Object obj : itemViews) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ItemMultiCaptureSmallImageBinding itemMultiCaptureSmallImageBinding = (ItemMultiCaptureSmallImageBinding) obj;
            ShapeableImageView ivMultiCaptureImage = itemMultiCaptureSmallImageBinding.ivMultiCaptureImage;
            Intrinsics.checkNotNullExpressionValue(ivMultiCaptureImage, "ivMultiCaptureImage");
            ImageView ivMultiCaptureDelete = itemMultiCaptureSmallImageBinding.ivMultiCaptureDelete;
            Intrinsics.checkNotNullExpressionValue(ivMultiCaptureDelete, "ivMultiCaptureDelete");
            GlTextView tvTitle = itemMultiCaptureSmallImageBinding.tvTitle;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            if (files.size() - 1 < i) {
                ivMultiCaptureImage.setImageDrawable(null);
                ivMultiCaptureDelete.setVisibility(8);
                tvTitle.setVisibility(0);
            } else {
                tvTitle.setVisibility(8);
                ivMultiCaptureDelete.setVisibility(i == files.size() - 1 ? 0 : 8);
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (!((Boolean) PersistData.INSTANCE.get(PersistKey.KEY_HAS_REQUESTED_CAMERA_PERMISSION, false)).booleanValue()) {
            requestCameraPermission();
            return;
        }
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        if (PermissionUtils.hasPermissions((RuntimePermissionActivity) activity, Permission.CAMERA)) {
            ((FragmentCaptureBinding) getBinding()).llAccessContainer.setVisibility(8);
        } else {
            BaseFragment.logEvent$default(this, RecognizeLogEvents.camera_access_click, null, 2, null);
            ((FragmentCaptureBinding) getBinding()).llAccessContainer.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initView() {
        initSnapTipsView();
        ((FragmentCaptureBinding) getBinding()).tvUnlock.setVisibility(!AppViewModel.INSTANCE.isVip() ? 0 : 8);
        ((FragmentCaptureBinding) getBinding()).vHeader.getLayoutParams().height = StatusBarUtil.INSTANCE.getStatusBarHeight();
        ((FragmentCaptureBinding) getBinding()).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureFragment.initView$lambda$4(CaptureFragment.this, view);
            }
        });
        ((FragmentCaptureBinding) getBinding()).btnAllowAccess.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureFragment.initView$lambda$5(CaptureFragment.this, view);
            }
        });
        ImageView ivFlash = ((FragmentCaptureBinding) getBinding()).ivFlash;
        Intrinsics.checkNotNullExpressionValue(ivFlash, "ivFlash");
        ViewExtensionsKt.setSingleClickListener(ivFlash, 500L, new CaptureFragment$initView$3(this));
        FrameLayout ivShot = ((FragmentCaptureBinding) getBinding()).ivShot;
        Intrinsics.checkNotNullExpressionValue(ivShot, "ivShot");
        ViewExtensionsKt.setSingleClickListener(ivShot, 1000L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                CoreViewModel vm;
                CoreViewModel vm2;
                AnimatorSet animatorSet;
                Intrinsics.checkNotNullParameter(it, "it");
                if (PermissionUtils.hasPermissions(CaptureFragment.this.getActivity(), Permission.CAMERA)) {
                    vm = CaptureFragment.this.getVm();
                    List<RecognizeImageFile> value = vm.getRecognizeImageFiles().getValue();
                    if (value == null || value.size() != 0) {
                        vm2 = CaptureFragment.this.getVm();
                        List<RecognizeImageFile> value2 = vm2.getRecognizeImageFiles().getValue();
                        if (value2 != null && value2.size() == 1) {
                            BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_shootingreverse_click, null, 2, null);
                        }
                    } else {
                        BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_shooting_click, null, 2, null);
                    }
                    if (CaptureFragment.this.getActivity() == null) {
                        return;
                    }
                    CaptureFragment.this.setCapturing(true);
                    CaptureFragment captureFragment = CaptureFragment.this;
                    final CaptureFragment captureFragment2 = CaptureFragment.this;
                    Function1<Bitmap, Unit> function1 = new Function1<Bitmap, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4.1
                        {
                            super(1);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CaptureFragment.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                        @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4$1$1", f = "CaptureFragment.kt", i = {0}, l = {461}, m = "invokeSuspend", n = {"time"}, s = {"J$0"})
                        /* renamed from: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4$1$1, reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes5.dex */
                        public static final class C00991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Bitmap $image;
                            long J$0;
                            private /* synthetic */ Object L$0;
                            int label;
                            final /* synthetic */ CaptureFragment this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C00991(CaptureFragment captureFragment, Bitmap bitmap, Continuation<? super C00991> continuation) {
                                super(2, continuation);
                                this.this$0 = captureFragment;
                                this.$image = bitmap;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                C00991 c00991 = new C00991(this.this$0, this.$image, continuation);
                                c00991.L$0 = obj;
                                return c00991;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C00991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Deferred async$default;
                                long j;
                                CoreViewModel vm;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i = this.label;
                                if (i == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                                    FragmentActivity activity = this.this$0.getActivity();
                                    if (activity != null && !activity.isFinishing()) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        async$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CaptureFragment$initView$4$1$1$writeFileDeferred$1(this.$image, null), 3, null);
                                        this.J$0 = currentTimeMillis;
                                        this.label = 1;
                                        obj = async$default.await(this);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        j = currentTimeMillis;
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                j = this.J$0;
                                ResultKt.throwOnFailure(obj);
                                File file = (File) obj;
                                LogUtils.e("onPictureTaken: " + (System.currentTimeMillis() - j) + ", bitmap width: " + this.$image.getWidth() + ", bitmap height: " + this.$image.getHeight());
                                if (file != null) {
                                    vm = this.this$0.getVm();
                                    vm.addOriginalImageFile(file);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Bitmap bitmap) {
                            invoke2(bitmap);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Bitmap image) {
                            Intrinsics.checkNotNullParameter(image, "image");
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CaptureFragment.this), Dispatchers.getIO(), null, new C00991(CaptureFragment.this, image, null), 2, null);
                            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CaptureFragment.this), null, null, new AnonymousClass2(CaptureFragment.this, null), 3, null);
                            CaptureFragment.this.setCapturing(false);
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CaptureFragment.kt */
                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                        @DebugMetadata(c = "com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4$1$2", f = "CaptureFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        /* renamed from: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4$1$2, reason: invalid class name */
                        /* loaded from: classes5.dex */
                        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            int label;
                            final /* synthetic */ CaptureFragment this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass2(CaptureFragment captureFragment, Continuation<? super AnonymousClass2> continuation) {
                                super(2, continuation);
                                this.this$0 = captureFragment;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new AnonymousClass2(this.this$0, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                if (this.label == 0) {
                                    ResultKt.throwOnFailure(obj);
                                    this.this$0.onPictureTaken();
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                    };
                    final CaptureFragment captureFragment3 = CaptureFragment.this;
                    captureFragment.takePicture(function1, new Function1<ImageCaptureException, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$4.2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ImageCaptureException imageCaptureException) {
                            invoke2(imageCaptureException);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ImageCaptureException it2) {
                            Intrinsics.checkNotNullParameter(it2, "it");
                            CaptureFragment.this.setCapturing(false);
                        }
                    });
                    animatorSet = CaptureFragment.this.captureButtonAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    CaptureFragment captureFragment4 = CaptureFragment.this;
                    captureFragment4.captureButtonAnimator = FragmentCaptureBindingExtensionsKt.doCaptureButtonAnimator(CaptureFragment.access$getBinding(captureFragment4));
                    return;
                }
                BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_accessshooting_click, null, 2, null);
                CaptureFragment.this.requestCameraPermission();
            }
        });
        LinearLayout llAlbum = ((FragmentCaptureBinding) getBinding()).llAlbum;
        Intrinsics.checkNotNullExpressionValue(llAlbum, "llAlbum");
        ViewExtensionsKt.setSingleClickListener(llAlbum, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                ImagePicker imagePicker;
                Intrinsics.checkNotNullParameter(it, "it");
                ImagePicker imagePicker2 = null;
                if (!PermissionUtils.hasPermissions(CaptureFragment.this.getActivity(), Permission.CAMERA)) {
                    BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_accessalbum_click, null, 2, null);
                } else {
                    BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_album_click, null, 2, null);
                }
                imagePicker = CaptureFragment.this.imagePicker;
                if (imagePicker == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                } else {
                    imagePicker2 = imagePicker;
                }
                final CaptureFragment captureFragment = CaptureFragment.this;
                imagePicker2.pick(new ImagePicker.OnImageSelectedListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$5.1
                    @Override // com.glority.base.utils.ImagePicker.OnImageSelectedListener
                    public void onImageSelected(List<? extends Uri> uris) {
                        Intrinsics.checkNotNullParameter(uris, "uris");
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(CaptureFragment.this), Dispatchers.getIO(), null, new CaptureFragment$initView$5$1$onImageSelected$1(uris, CaptureFragment.this, null), 2, null);
                    }
                });
            }
        });
        LinearLayout tvUnlock = ((FragmentCaptureBinding) getBinding()).tvUnlock;
        Intrinsics.checkNotNullExpressionValue(tvUnlock, "tvUnlock");
        ViewExtensionsKt.setSingleClickListener(tvUnlock, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$6
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!PermissionUtils.hasPermissions(CaptureFragment.this.getActivity(), Permission.CAMERA)) {
                    BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_accessunlock_click, null, 2, null);
                } else {
                    BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_limit_click, null, 2, null);
                }
                new OpenBillingActivityRequest(OpenBillingActivityRequest.From_Capture_Limited_IDS, String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), null, 4, null).post();
            }
        });
        LinearLayout tipsLl = ((FragmentCaptureBinding) getBinding()).tipsLl;
        Intrinsics.checkNotNullExpressionValue(tipsLl, "tipsLl");
        tipsLl.setVisibility(getVm().getShowSnapTips() ? 0 : 8);
        LinearLayout tipsLl2 = ((FragmentCaptureBinding) getBinding()).tipsLl;
        Intrinsics.checkNotNullExpressionValue(tipsLl2, "tipsLl");
        ViewExtensionsKt.setSingleClickListener(tipsLl2, 600L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View v) {
                Intrinsics.checkNotNullParameter(v, "v");
                BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_instruction_click, null, 2, null);
                CaptureFragment.this.visibleSnapTips(true);
            }
        });
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$8
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FrameLayout snapLl = CaptureFragment.access$getBinding(CaptureFragment.this).snapLl;
                Intrinsics.checkNotNullExpressionValue(snapLl, "snapLl");
                if (snapLl.getVisibility() == 0) {
                    CaptureFragment.this.visibleSnapTips(false);
                    return;
                }
                setEnabled(false);
                FragmentActivity activity = CaptureFragment.this.getActivity();
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        ((FragmentCaptureBinding) getBinding()).zoomSeekBar.getSeekBar().setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$initView$9
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                CaptureFragment.this.isSeekBarTouched = true;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                CaptureFragment.this.isSeekBarTouched = false;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    CaptureFragment captureFragment = CaptureFragment.this;
                    captureFragment.setZoom(CaptureFragment.access$getBinding(captureFragment).zoomSeekBar.getSeekBar().restoreProgressFloat(progress));
                }
            }
        });
        TextView modelInfoTv = ((FragmentCaptureBinding) getBinding()).modelInfoTv;
        Intrinsics.checkNotNullExpressionValue(modelInfoTv, "modelInfoTv");
        modelInfoTv.setVisibility(AppViewModel.INSTANCE.isDebugMode() ? 0 : 8);
        ((FragmentCaptureBinding) getBinding()).cfv.post(new Runnable() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CaptureFragment.initView$lambda$9(CaptureFragment.this);
            }
        });
        ((FragmentCaptureBinding) getBinding()).zoomSelector.setOnZoomValueClickListener(new CameraZoomSelectView.OnZoomValueClickListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda5
            @Override // com.glority.android.picturexx.recognize.widget.CameraZoomSelectView.OnZoomValueClickListener
            public final void onClick(float f) {
                CaptureFragment.initView$lambda$10(CaptureFragment.this, f);
            }
        });
        setOnZoomStateChangeListener(new OnZoomStateChangedListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda6
            @Override // com.glority.android.picturexx.recognize.listeners.OnZoomStateChangedListener
            public final void handleZoomStateChange(ZoomState zoomState) {
                CaptureFragment.initView$lambda$11(CaptureFragment.this, zoomState);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(CaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!PermissionUtils.hasPermissions(this$0.getActivity(), Permission.CAMERA)) {
            BaseFragment.logEvent$default(this$0, RecognizeLogEvents.camera_accessclose_click, null, 2, null);
        } else {
            Pair[] pairArr = new Pair[1];
            List<RecognizeImageFile> value = this$0.getVm().getRecognizeImageFiles().getValue();
            pairArr[0] = TuplesKt.to(LogEventArguments.ARG_INTEGER_1, Integer.valueOf(value != null ? value.size() : 0));
            this$0.logEvent(RecognizeLogEvents.camera_close_click, LogEventArgumentsKt.logEventBundleOf(pairArr));
        }
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$5(CaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragment.logEvent$default(this$0, RecognizeLogEvents.camera_accessallow_click, null, 2, null);
        this$0.requestCameraPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$9(CaptureFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LinearLayout detTipsLl = ((FragmentCaptureBinding) this$0.getBinding()).detTipsLl;
        Intrinsics.checkNotNullExpressionValue(detTipsLl, "detTipsLl");
        LinearLayout linearLayout = detTipsLl;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ConstraintLayout.LayoutParams layoutParams3 = layoutParams2;
        if (!this$0.getEnableCameraBigCircleStyle()) {
            try {
                layoutParams3.topMargin = ((FragmentCaptureBinding) this$0.getBinding()).cfv.getCircleBottom() + this$0.getResources().getDimensionPixelOffset(R.dimen.x40);
                Unit unit = Unit.INSTANCE;
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        } else {
            try {
                layoutParams3.topMargin = ((FragmentCaptureBinding) this$0.getBinding()).cfv.getCircleTop() - this$0.getResources().getDimensionPixelOffset(R.dimen.x120);
                Unit unit2 = Unit.INSTANCE;
            } catch (Exception e2) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e2));
                }
            }
        }
        ((FragmentCaptureBinding) this$0.getBinding()).detTipsLl.requestLayout();
        linearLayout.setLayoutParams(layoutParams2);
        LinearLayout detTipsLl2 = ((FragmentCaptureBinding) this$0.getBinding()).detTipsLl;
        Intrinsics.checkNotNullExpressionValue(detTipsLl2, "detTipsLl");
        detTipsLl2.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$10(CaptureFragment this$0, float f) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setZoom(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$11(CaptureFragment this$0, ZoomState it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (this$0.isSeekBarTouched) {
            return;
        }
        float minZoomRatio = it.getMinZoomRatio();
        float maxZoomRatio = it.getMaxZoomRatio();
        float zoomRatio = it.getZoomRatio();
        ((FragmentCaptureBinding) this$0.getBinding()).zoomSeekBar.getSeekBar().setMaxFloat(maxZoomRatio);
        ((FragmentCaptureBinding) this$0.getBinding()).zoomSeekBar.getSeekBar().setMinFloat(minZoomRatio);
        ((FragmentCaptureBinding) this$0.getBinding()).zoomSeekBar.getSeekBar().setProgressFloat(zoomRatio);
        List mutableListOf = CollectionsKt.mutableListOf(Float.valueOf(1.0f));
        mutableListOf.add(0, Float.valueOf(minZoomRatio));
        mutableListOf.add(Float.valueOf(3.0f));
        ((FragmentCaptureBinding) this$0.getBinding()).zoomSelector.setZoomValues(CollectionsKt.distinct(mutableListOf));
        ((FragmentCaptureBinding) this$0.getBinding()).zoomSelector.updateZoomValue(zoomRatio);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initSnapTipsView() {
        View inflate = getLayoutInflater().inflate(snapTipsLayout(), (ViewGroup) null);
        ((FragmentCaptureBinding) getBinding()).snapLl.addView(inflate, -1, -1);
        inflate.findViewById(R.id.tv_continue).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureFragment.initSnapTipsView$lambda$12(CaptureFragment.this, view);
            }
        });
        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CaptureFragment.initSnapTipsView$lambda$13(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSnapTipsView$lambda$12(CaptureFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        BaseFragment.logEvent$default(this$0, RecognizeLogEvents.snaptips_continue_click, null, 2, null);
        this$0.visibleSnapTips(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void visibleSnapTips(final boolean visible) {
        try {
            if (visible) {
                BaseFragment.logEvent$default(this, RecognizeLogEvents.snaptips_open, null, 2, null);
                PersistData.INSTANCE.set(snapTipsRecordKey(), true);
            } else {
                BaseFragment.logEvent$default(this, RecognizeLogEvents.snaptips_close, null, 2, null);
            }
            double d = 2.0f;
            float sqrt = (float) Math.sqrt(((float) Math.pow(getResources().getDisplayMetrics().widthPixels, d)) + ((float) Math.pow(getResources().getDisplayMetrics().heightPixels, d)));
            int[] iArr = new int[2];
            ((FragmentCaptureBinding) getBinding()).snapTipsIcon.getLocationInWindow(iArr);
            int width = iArr[0] + (((FragmentCaptureBinding) getBinding()).snapTipsIcon.getWidth() / 2);
            int height = iArr[1] + (((FragmentCaptureBinding) getBinding()).snapTipsIcon.getHeight() / 2);
            FrameLayout frameLayout = ((FragmentCaptureBinding) getBinding()).snapLl;
            float f = visible ? 0.0f : sqrt;
            if (!visible) {
                sqrt = 0.0f;
            }
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, width, height, f, sqrt);
            createCircularReveal.setInterpolator(new AccelerateDecelerateInterpolator());
            createCircularReveal.setDuration(500L);
            createCircularReveal.addListener(new Animator.AnimatorListener() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$visibleSnapTips$1$1$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    FrameLayout snapLl = CaptureFragment.access$getBinding(CaptureFragment.this).snapLl;
                    Intrinsics.checkNotNullExpressionValue(snapLl, "snapLl");
                    snapLl.setVisibility(0);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    FrameLayout snapLl = CaptureFragment.access$getBinding(CaptureFragment.this).snapLl;
                    Intrinsics.checkNotNullExpressionValue(snapLl, "snapLl");
                    snapLl.setVisibility(visible ? 0 : 8);
                }
            });
            createCircularReveal.start();
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toResultFragment() {
        PersistData.INSTANCE.set(KEY_CAPTURE_COUNT, Integer.valueOf(((Number) PersistData.INSTANCE.get(KEY_CAPTURE_COUNT, 0)).intValue() + 1));
        PersistData.INSTANCE.set(KEY_LAST_CAPTURE_TIME, Long.valueOf(System.currentTimeMillis()));
        firstDayPhotoGreater3();
        RecognizeProcess recognizeProcess = getVm().getRecognizeProcess();
        if (Intrinsics.areEqual(recognizeProcess != null ? recognizeProcess.typeName() : null, "grade")) {
            com.glority.base.ext.ViewExtensionsKt.navigateWithHandOnBundle$default(this, R.id.action_gradingCaptureFragment_to_result_fragment, null, null, null, 14, null);
        } else {
            com.glority.base.ext.ViewExtensionsKt.navigateWithHandOnBundle$default(this, R.id.action_capture_to_result, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void analyse(Bitmap bitmap) {
        Job launch$default;
        if (this.focusJob == EMPTY_FOCUS_JOB) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(getAnalyseCoroutineScope(), null, null, new CaptureFragment$analyse$1(this, bitmap, null), 3, null);
            this.focusJob = launch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateCircleStatus(boolean isOk, int textId, AreaStatus areaStatus) {
        if (getLifecycleRegistry().getState().isAtLeast(Lifecycle.State.RESUMED)) {
            if (!isOk && textId == R.string.camera_tips_focus) {
                ((FragmentCaptureBinding) getBinding()).cfv.setCircleColor(-1);
            } else if (!isOk) {
                ((FragmentCaptureBinding) getBinding()).cfv.setCircleColor(Color.parseColor("#FFAF2525"));
            } else {
                ((FragmentCaptureBinding) getBinding()).cfv.setCircleColor(Color.parseColor("#FF25AF75"));
            }
            if (areaStatus == AreaStatus.NOT_FOUND) {
                AppCompatTextView tvCaptureHint = ((FragmentCaptureBinding) getBinding()).tvCaptureHint;
                Intrinsics.checkNotNullExpressionValue(tvCaptureHint, "tvCaptureHint");
                CaptureFragmentKt.access$updateCaptureHint(tvCaptureHint, "");
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerRectVisible(false);
            } else {
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerRectVisible(true);
            }
            if (areaStatus == AreaStatus.TOO_SMALL || areaStatus == AreaStatus.HOLD) {
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerColor(-1);
            }
            if (!isOk && textId == R.string.camera_tips_focus) {
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerColor(-1);
            } else if (!isOk) {
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerColor(Color.parseColor("#FFAF2525"));
            } else {
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerColor(Color.parseColor("#FF25AF75"));
            }
            if (areaStatus == AreaStatus.TOO_SMALL || areaStatus == AreaStatus.HOLD) {
                ((FragmentCaptureBinding) getBinding()).cfcv.setCornerColor(-1);
            }
            ((FragmentCaptureBinding) getBinding()).tvImgTitle.setText(textId);
            AppCompatTextView tvCaptureHint2 = ((FragmentCaptureBinding) getBinding()).tvCaptureHint;
            Intrinsics.checkNotNullExpressionValue(tvCaptureHint2, "tvCaptureHint");
            CaptureFragmentKt.access$updateCaptureHint(tvCaptureHint2, textId);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LogUtils.d(TAG, "onResume..");
        holdDet(false);
        ((FragmentCaptureBinding) getBinding()).ivShot.setVisibility(0);
        if (PermissionUtils.hasPermissions(getActivity(), Permission.CAMERA)) {
            ((FragmentCaptureBinding) getBinding()).llAccessContainer.setVisibility(8);
        }
    }

    @Override // com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment, com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        LogUtils.d(TAG, "onDestroyView()");
        super.onDestroyView();
        AnimatorSet animatorSet = this.captureButtonAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestCameraPermission() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        if (PermissionUtils.hasPermissions((RuntimePermissionActivity) activity, Permission.CAMERA)) {
            return;
        }
        FragmentActivity activity2 = getActivity();
        Intrinsics.checkNotNull(activity2, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        PermissionUtils.checkPermission((RuntimePermissionActivity) activity2, Permission.CAMERA, new PermissionResultCallback() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$requestCameraPermission$1
            @Override // com.glority.utils.permission.callback.PermissionResultCallback
            public boolean onPermissionNotGranted(String... permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                ToastUtils.showShort(R.string.text_permission_denied_try_after);
                BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_access_click, null, 2, null);
                CaptureFragment.access$getBinding(CaptureFragment.this).llAccessContainer.setVisibility(0);
                PersistData.INSTANCE.set(PersistKey.KEY_HAS_REQUESTED_CAMERA_PERMISSION, true);
                return true;
            }

            @Override // com.glority.utils.permission.callback.PermissionResultCallback
            public void onGetAllPermissions() {
                boolean enableCameraBigCircleStyle;
                CaptureFragment.access$getBinding(CaptureFragment.this).llAccessContainer.setVisibility(8);
                PersistData.INSTANCE.set(PersistKey.KEY_HAS_REQUESTED_CAMERA_PERMISSION, true);
                enableCameraBigCircleStyle = CaptureFragment.this.getEnableCameraBigCircleStyle();
                if (enableCameraBigCircleStyle) {
                    LifecycleCameraController lifecycleCameraController = CaptureFragment.this.getLifecycleCameraController();
                    if (lifecycleCameraController != null) {
                        lifecycleCameraController.setZoomRatio(0.6f);
                        return;
                    }
                    return;
                }
                LifecycleCameraController lifecycleCameraController2 = CaptureFragment.this.getLifecycleCameraController();
                if (lifecycleCameraController2 != null) {
                    lifecycleCameraController2.setZoomRatio(1.2f);
                }
            }

            @Override // com.glority.utils.permission.callback.PermissionResultCallback
            public boolean showPermissionsRationale(String... permissions) {
                Intrinsics.checkNotNullParameter(permissions, "permissions");
                BaseFragment.logEvent$default(CaptureFragment.this, RecognizeLogEvents.camera_access_click, null, 2, null);
                CaptureFragment.access$getBinding(CaptureFragment.this).llAccessContainer.setVisibility(0);
                RuntimePermissionActivity runtimePermissionActivity = (RuntimePermissionActivity) CaptureFragment.this.getActivity();
                if (runtimePermissionActivity != null) {
                    String string = ResUtils.getString(R.string.text_set_permission_in_settings, ResUtils.getString(R.string.text_camera_permission));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    runtimePermissionActivity.showSetPermissionDialog(string);
                }
                PersistData.INSTANCE.set(PersistKey.KEY_HAS_REQUESTED_CAMERA_PERMISSION, true);
                return true;
            }
        });
    }

    public String snapTipsRecordKey() {
        return PersistKey.KEY_OPEN_CAPTURE_SNAP_TIPS;
    }

    private final void addSubscription() {
        AppViewModel.INSTANCE.getInstance().getVipInfo().observe(this, new CaptureFragmentKt$sam$androidx_lifecycle_Observer$0(new Function1<VipInfo, Unit>() { // from class: com.glority.android.picturexx.recognize.fragment.CaptureFragment$addSubscription$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VipInfo vipInfo) {
                invoke2(vipInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VipInfo vipInfo) {
                if (AppViewModel.INSTANCE.isVip()) {
                    CaptureFragment.access$getBinding(CaptureFragment.this).tvUnlock.setVisibility(8);
                } else {
                    CaptureFragment.access$getBinding(CaptureFragment.this).tvUnlock.setVisibility(0);
                }
            }
        }));
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected String getLogPageName() {
        return RecognizeLogEvents.camera;
    }

    @Override // com.glority.android.picturexx.recognize.fragment.CaptureCameraMediatorFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        holdDet(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onPictureTaken() {
        List<RecognizeImageFile> value = getVm().getRecognizeImageFiles().getValue();
        if (value == null || value.size() == 0) {
            ((FragmentCaptureBinding) getBinding()).tvImgTitle.setText(R.string.camera_tips_turnover);
            AppCompatTextView tvCaptureHint = ((FragmentCaptureBinding) getBinding()).tvCaptureHint;
            Intrinsics.checkNotNullExpressionValue(tvCaptureHint, "tvCaptureHint");
            CaptureFragmentKt.access$updateCaptureHint(tvCaptureHint, R.string.camera_tips_turnover);
            holdDet(true);
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new CaptureFragment$onPictureTaken$1(this, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void holdDet(boolean r2) {
        this.lightProcessor.setHold(r2);
        ((FragmentCaptureBinding) getBinding()).cfv.getAreaProcessor().setHold(r2);
        ((FragmentCaptureBinding) getBinding()).cfcv.getAreaProcessor().setHold(r2);
        this.blurProcessor.setHold(r2);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        try {
            holdDet(true);
        } catch (Exception unused) {
        }
        CoroutineScopeKt.cancel$default(getAnalyseCoroutineScope(), null, 1, null);
    }

    private final void firstDayPhotoGreater3() {
        int intValue = ((Number) PersistData.INSTANCE.get(KEY_CAPTURE_COUNT, 0)).intValue();
        long longValue = ((Number) PersistData.INSTANCE.get(KEY_LAST_CAPTURE_TIME, 0L)).longValue();
        if (intValue != 3 || Math.abs(AppViewModel.INSTANCE.getInstance().userCreateTime() - longValue) >= 86400000) {
            return;
        }
        new SendTrackEventRequest("AJ_photo3", null, null, null, 14, null).post();
    }

    private final void createAutoZoomInJob() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CaptureFragment$createAutoZoomInJob$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoZoomIn(float autoZoomInFactor) {
        if (RecognizeAbUtils.INSTANCE.enableCaptureAutoZoomIn()) {
            setZoomMultiplier(autoZoomInFactor);
        }
    }
}
