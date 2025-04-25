package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.compose.LocalActivityResultRegistryOwner;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewRootForTest;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.PreviewAnimationClock;
import androidx.compose.ui.tooling.data.Group;
import androidx.compose.ui.tooling.data.NodeGroup;
import androidx.compose.ui.tooling.data.SlotTreeKt;
import androidx.compose.ui.tooling.data.SourceLocation;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.compose.ui.unit.IntRect;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.glority.android.xx.constants.LogEvents;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.text.StringsKt;

/* compiled from: ComposeViewAdapter.android.kt */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0004\u000b\u000e\u0011\u0014\b\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010Q\u001a\u00020(2\u0011\u0010%\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)H\u0003¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u00020(2\u0006\u0010T\u001a\u00020UH\u0014J\r\u0010V\u001a\u00020(H\u0000¢\u0006\u0002\bWJ\b\u0010X\u001a\u00020(H\u0002J\b\u0010Y\u001a\u00020(H\u0002J\u0006\u0010:\u001a\u00020.J\u0010\u0010Z\u001a\u00020(2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u009d\u0001\u0010Z\u001a\u00020(2\u0006\u0010[\u001a\u00020\u00172\u0006\u0010\\\u001a\u00020\u00172\u0016\b\u0002\u0010]\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030_\u0018\u00010^2\b\b\u0002\u0010`\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020.2\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u0010a\u001a\u00020b2\b\b\u0002\u00109\u001a\u00020.2\b\b\u0002\u0010;\u001a\u00020.2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010c\u001a\b\u0012\u0004\u0012\u00020(0'2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020(0'H\u0001¢\u0006\u0002\bdJ\b\u0010e\u001a\u00020(H\u0002J\b\u0010f\u001a\u00020(H\u0014J0\u0010g\u001a\u00020(2\u0006\u0010h\u001a\u00020.2\u0006\u0010i\u001a\u00020\b2\u0006\u0010j\u001a\u00020\b2\u0006\u0010k\u001a\u00020\b2\u0006\u0010l\u001a\u00020\bH\u0014J\b\u0010m\u001a\u00020(H\u0002J\u000e\u0010n\u001a\u0004\u0018\u00010o*\u00020pH\u0002J\u0016\u0010q\u001a\u0004\u0018\u00010\u0017*\u00020K2\u0006\u0010r\u001a\u00020sH\u0002J\f\u0010t\u001a\u00020.*\u00020KH\u0002J\f\u0010u\u001a\u00020.*\u00020KH\u0002J\u001e\u0010v\u001a\u0004\u0018\u00010\u0017*\u00020p2\u0006\u0010w\u001a\u00020\b2\u0006\u0010x\u001a\u00020\bH\u0002J\f\u0010y\u001a\u00020.*\u00020KH\u0002J\f\u0010z\u001a\u00020G*\u00020KH\u0002R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u0010\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082D¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00198\u0000@\u0000X\u0081.¢\u0006\u0014\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R%\u0010%\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)0&X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\u001bR\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R \u00102\u001a\b\u0012\u0004\u0012\u00020\u001703X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u00108\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010<\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\r\u0012\u0004\u0012\u00020(0'¢\u0006\u0002\b)X\u0082\u000e¢\u0006\u0004\n\u0002\u0010>R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u00020.X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u0010F\u001a\b\u0012\u0004\u0012\u00020G03X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u00105\"\u0004\bI\u00107R\u0018\u0010J\u001a\u00020\u0017*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010N\u001a\u00020\b*\u00020K8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006{"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "FakeActivityResultRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1;", "FakeOnBackPressedDispatcherOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1;", "FakeSavedStateRegistryOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1;", "FakeViewModelStoreOwner", "androidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1", "Landroidx/compose/ui/tooling/ComposeViewAdapter$FakeViewModelStoreOwner$1;", "TAG", "", "clock", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "getClock$ui_tooling_release$annotations", "()V", "getClock$ui_tooling_release", "()Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "setClock$ui_tooling_release", "(Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;)V", "composableName", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "composition", "Landroidx/compose/runtime/Composition;", "content", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "getContent$annotations", "debugBoundsPaint", "Landroid/graphics/Paint;", "debugPaintBounds", "", "debugViewInfos", "delayedException", "Landroidx/compose/ui/tooling/ThreadSafeException;", "designInfoList", "", "getDesignInfoList$ui_tooling_release", "()Ljava/util/List;", "setDesignInfoList$ui_tooling_release", "(Ljava/util/List;)V", "designInfoProvidersArgument", "forceCompositionInvalidation", "hasAnimations", "lookForDesignInfoProviders", "onDraw", "previewComposition", "Lkotlin/jvm/functions/Function2;", "slotTableRecord", "Landroidx/compose/ui/tooling/CompositionDataRecord;", "stitchTrees", "getStitchTrees$ui_tooling_release", "()Z", "setStitchTrees$ui_tooling_release", "(Z)V", "viewInfos", "Landroidx/compose/ui/tooling/ViewInfo;", "getViewInfos$ui_tooling_release", "setViewInfos$ui_tooling_release", "fileName", "Landroidx/compose/ui/tooling/data/Group;", "getFileName", "(Landroidx/compose/ui/tooling/data/Group;)Ljava/lang/String;", "lineNumber", "getLineNumber", "(Landroidx/compose/ui/tooling/data/Group;)I", "WrapPreview", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "dispose", "dispose$ui_tooling_release", "findAndTrackAnimations", "findDesignInfoProviders", "init", "className", "methodName", "parameterProvider", "Ljava/lang/Class;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "parameterProviderIndex", "animationClockStartTime", "", "onCommit", "init$ui_tooling_release", "invalidateComposition", "onAttachedToWindow", "onLayout", "changed", TtmlNode.LEFT, "top", TtmlNode.RIGHT, LogEvents.bottom, "processViewInfos", "getDesignInfoMethodOrNull", "Ljava/lang/reflect/Method;", "", "getDesignInfoOrNull", "box", "Landroidx/compose/ui/unit/IntRect;", "hasDesignInfo", "hasNullSourcePosition", "invokeGetDesignInfo", "x", "y", "isNullGroup", "toViewInfo", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class ComposeViewAdapter extends FrameLayout {
    public static final int $stable = 8;
    private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1 FakeActivityResultRegistryOwner;
    private final ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1 FakeOnBackPressedDispatcherOwner;
    private final ComposeViewAdapter$FakeSavedStateRegistryOwner$1 FakeSavedStateRegistryOwner;
    private final ComposeViewAdapter$FakeViewModelStoreOwner$1 FakeViewModelStoreOwner;
    private final String TAG;
    public PreviewAnimationClock clock;
    private String composableName;
    private final ComposeView composeView;
    private Composition composition;
    private final MutableState<Function2<Composer, Integer, Unit>> content;
    private final Paint debugBoundsPaint;
    private boolean debugPaintBounds;
    private boolean debugViewInfos;
    private final ThreadSafeException delayedException;
    private List<String> designInfoList;
    private String designInfoProvidersArgument;
    private boolean forceCompositionInvalidation;
    private boolean hasAnimations;
    private boolean lookForDesignInfoProviders;
    private Function0<Unit> onDraw;
    private Function2<? super Composer, ? super Integer, Unit> previewComposition;
    private final CompositionDataRecord slotTableRecord;
    private boolean stitchTrees;
    private List<ViewInfo> viewInfos;

    public static /* synthetic */ void getClock$ui_tooling_release$annotations() {
    }

    private static /* synthetic */ void getContent$annotations() {
    }

    public final List<ViewInfo> getViewInfos$ui_tooling_release() {
        return this.viewInfos;
    }

    public final void setViewInfos$ui_tooling_release(List<ViewInfo> list) {
        this.viewInfos = list;
    }

    public final List<String> getDesignInfoList$ui_tooling_release() {
        return this.designInfoList;
    }

    public final void setDesignInfoList$ui_tooling_release(List<String> list) {
        this.designInfoList = list;
    }

    /* renamed from: getStitchTrees$ui_tooling_release, reason: from getter */
    public final boolean getStitchTrees() {
        return this.stitchTrees;
    }

    public final void setStitchTrees$ui_tooling_release(boolean z) {
        this.stitchTrees = z;
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v15, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Function2 function2;
        MutableState<Function2<Composer, Integer, Unit>> mutableStateOf$default;
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.INSTANCE.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m6917getLambda2$ui_tooling_release();
        function2 = ComposeViewAdapter_androidKt.emptyContent;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function2, null, 2, null);
        this.content = mutableStateOf$default;
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m4569toArgb8_81llA(Color.INSTANCE.m4549getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            /* renamed from: getLifecycle */
            public LifecycleRegistry getLifecycleRegistry() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int requestCode, ActivityResultContract<I, O> contract, I input, ActivityOptionsCompat options) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v14, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1] */
    /* JADX WARN: Type inference failed for: r7v15, types: [androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1] */
    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Function2 function2;
        MutableState<Function2<Composer, Integer, Unit>> mutableStateOf$default;
        this.TAG = "ComposeViewAdapter";
        this.composeView = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = CollectionsKt.emptyList();
        this.designInfoList = CollectionsKt.emptyList();
        this.slotTableRecord = CompositionDataRecord.INSTANCE.create();
        this.composableName = "";
        this.delayedException = new ThreadSafeException();
        this.previewComposition = ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m6917getLambda2$ui_tooling_release();
        function2 = ComposeViewAdapter_androidKt.emptyContent;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(function2, null, 2, null);
        this.content = mutableStateOf$default;
        this.designInfoProvidersArgument = "";
        this.onDraw = ComposeViewAdapter$onDraw$1.INSTANCE;
        this.stitchTrees = true;
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ColorKt.m4569toArgb8_81llA(Color.INSTANCE.m4549getRed0d7_KjU()));
        this.debugBoundsPaint = paint;
        this.FakeSavedStateRegistryOwner = new ComposeViewAdapter$FakeSavedStateRegistryOwner$1();
        this.FakeViewModelStoreOwner = new ComposeViewAdapter$FakeViewModelStoreOwner$1();
        this.FakeOnBackPressedDispatcherOwner = new OnBackPressedDispatcherOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeOnBackPressedDispatcherOwner$1
            private final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(null, 1, null);

            @Override // androidx.activity.OnBackPressedDispatcherOwner
            public OnBackPressedDispatcher getOnBackPressedDispatcher() {
                return this.onBackPressedDispatcher;
            }

            @Override // androidx.lifecycle.LifecycleOwner
            /* renamed from: getLifecycle */
            public LifecycleRegistry getLifecycleRegistry() {
                ComposeViewAdapter$FakeSavedStateRegistryOwner$1 composeViewAdapter$FakeSavedStateRegistryOwner$1;
                composeViewAdapter$FakeSavedStateRegistryOwner$1 = ComposeViewAdapter.this.FakeSavedStateRegistryOwner;
                return composeViewAdapter$FakeSavedStateRegistryOwner$1.getLifecycleRegistry();
            }
        };
        this.FakeActivityResultRegistryOwner = new ActivityResultRegistryOwner() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1
            private final ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 activityResultRegistry = new ActivityResultRegistry() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1
                @Override // androidx.activity.result.ActivityResultRegistry
                public <I, O> void onLaunch(int requestCode, ActivityResultContract<I, O> contract, I input, ActivityOptionsCompat options) {
                    throw new IllegalStateException("Calling launch() is not supported in Preview");
                }
            };

            @Override // androidx.activity.result.ActivityResultRegistryOwner
            public ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 getActivityResultRegistry() {
                return this.activityResultRegistry;
            }
        };
        init(attributeSet);
    }

    private final String getFileName(Group group) {
        String sourceFile;
        SourceLocation location = group.getLocation();
        return (location == null || (sourceFile = location.getSourceFile()) == null) ? "" : sourceFile;
    }

    private final int getLineNumber(Group group) {
        SourceLocation location = group.getLocation();
        if (location != null) {
            return location.getLineNumber();
        }
        return -1;
    }

    private final boolean hasNullSourcePosition(Group group) {
        return getFileName(group).length() == 0 && getLineNumber(group) == -1;
    }

    private final boolean isNullGroup(Group group) {
        if (hasNullSourcePosition(group) && group.getChildren().isEmpty()) {
            NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
            Object node = nodeGroup != null ? nodeGroup.getNode() : null;
            if ((node instanceof LayoutInfo ? (LayoutInfo) node : null) == null) {
                return true;
            }
        }
        return false;
    }

    private final ViewInfo toViewInfo(Group group) {
        String str;
        NodeGroup nodeGroup = group instanceof NodeGroup ? (NodeGroup) group : null;
        Object node = nodeGroup != null ? nodeGroup.getNode() : null;
        LayoutInfo layoutInfo = node instanceof LayoutInfo ? (LayoutInfo) node : null;
        if (group.getChildren().size() == 1 && hasNullSourcePosition(group) && layoutInfo == null) {
            return toViewInfo((Group) CollectionsKt.single(group.getChildren()));
        }
        Collection<Group> children = group.getChildren();
        ArrayList arrayList = new ArrayList();
        for (Object obj : children) {
            if (!isNullGroup((Group) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(toViewInfo((Group) it.next()));
        }
        ArrayList arrayList4 = arrayList3;
        SourceLocation location = group.getLocation();
        if (location == null || (str = location.getSourceFile()) == null) {
            str = "";
        }
        String str2 = str;
        SourceLocation location2 = group.getLocation();
        return new ViewInfo(str2, location2 != null ? location2.getLineNumber() : -1, group.getBox(), group.getLocation(), arrayList4, layoutInfo);
    }

    private final void processViewInfos() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(toViewInfo(SlotTreeKt.asTree((CompositionData) it.next())));
        }
        List<ViewInfo> list = CollectionsKt.toList(arrayList);
        if (this.stitchTrees) {
            list = ShadowViewInfo_androidKt.stitchTrees(list);
        }
        this.viewInfos = list;
        if (this.debugViewInfos) {
            Log.d(this.TAG, ViewInfoUtil_androidKt.toDebugString$default(list, 0, null, 3, null));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.delayedException.throwIfPresent();
        processViewInfos();
        if (this.composableName.length() > 0) {
            findAndTrackAnimations();
            if (this.lookForDesignInfoProviders) {
                findDesignInfoProviders();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        ViewTreeLifecycleOwner.set(this.composeView.getRootView(), this.FakeSavedStateRegistryOwner);
        super.onAttachedToWindow();
    }

    private final void findAndTrackAnimations() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        boolean z = this.clock != null;
        AnimationSearch animationSearch = new AnimationSearch(new MutablePropertyReference0Impl(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findAndTrackAnimations$1
            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ComposeViewAdapter) this.receiver).getClock$ui_tooling_release();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
            public void set(Object obj) {
                ((ComposeViewAdapter) this.receiver).setClock$ui_tooling_release((PreviewAnimationClock) obj);
            }
        }, new ComposeViewAdapter$findAndTrackAnimations$2(this));
        ArrayList arrayList3 = arrayList2;
        boolean searchAny = animationSearch.searchAny(arrayList3);
        this.hasAnimations = searchAny;
        if (z && searchAny) {
            animationSearch.attachAllAnimations(arrayList3);
        }
    }

    private final void findDesignInfoProviders() {
        Set<CompositionData> store = this.slotTableRecord.getStore();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(store, 10));
        Iterator<T> it = store.iterator();
        while (it.hasNext()) {
            arrayList.add(SlotTreeKt.asTree((CompositionData) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<Group> findAll = PreviewUtils_androidKt.findAll((Group) it2.next(), new Function1<Group, Boolean>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
                
                    if (r0 == false) goto L6;
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean invoke(androidx.compose.ui.tooling.data.Group r5) {
                    /*
                        r4 = this;
                        java.lang.String r0 = r5.getName()
                        java.lang.String r1 = "remember"
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
                        if (r0 != 0) goto L15
                        androidx.compose.ui.tooling.ComposeViewAdapter r0 = androidx.compose.ui.tooling.ComposeViewAdapter.this
                        boolean r0 = androidx.compose.ui.tooling.ComposeViewAdapter.access$hasDesignInfo(r0, r5)
                        if (r0 != 0) goto L4b
                    L15:
                        java.util.Collection r5 = r5.getChildren()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        androidx.compose.ui.tooling.ComposeViewAdapter r0 = androidx.compose.ui.tooling.ComposeViewAdapter.this
                        boolean r2 = r5 instanceof java.util.Collection
                        if (r2 == 0) goto L2b
                        r2 = r5
                        java.util.Collection r2 = (java.util.Collection) r2
                        boolean r2 = r2.isEmpty()
                        if (r2 == 0) goto L2b
                        goto L4d
                    L2b:
                        java.util.Iterator r5 = r5.iterator()
                    L2f:
                        boolean r2 = r5.hasNext()
                        if (r2 == 0) goto L4d
                        java.lang.Object r2 = r5.next()
                        androidx.compose.ui.tooling.data.Group r2 = (androidx.compose.ui.tooling.data.Group) r2
                        java.lang.String r3 = r2.getName()
                        boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r1)
                        if (r3 == 0) goto L2f
                        boolean r2 = androidx.compose.ui.tooling.ComposeViewAdapter.access$hasDesignInfo(r0, r2)
                        if (r2 == 0) goto L2f
                    L4b:
                        r5 = 1
                        goto L4e
                    L4d:
                        r5 = 0
                    L4e:
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.tooling.ComposeViewAdapter$findDesignInfoProviders$1$1.invoke(androidx.compose.ui.tooling.data.Group):java.lang.Boolean");
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (Group group : findAll) {
                String designInfoOrNull = getDesignInfoOrNull(group, group.getBox());
                if (designInfoOrNull == null) {
                    Iterator<T> it3 = group.getChildren().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            designInfoOrNull = null;
                            break;
                        }
                        String designInfoOrNull2 = getDesignInfoOrNull((Group) it3.next(), group.getBox());
                        if (designInfoOrNull2 != null) {
                            designInfoOrNull = designInfoOrNull2;
                            break;
                        }
                    }
                }
                if (designInfoOrNull != null) {
                    arrayList3.add(designInfoOrNull);
                }
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasDesignInfo(Group group) {
        Collection<Object> data = group.getData();
        if ((data instanceof Collection) && data.isEmpty()) {
            return false;
        }
        Iterator<T> it = data.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? getDesignInfoMethodOrNull(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final String getDesignInfoOrNull(Group group, IntRect intRect) {
        String str;
        Iterator<T> it = group.getData().iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                str = invokeGetDesignInfo(next, intRect.getLeft(), intRect.getRight());
            }
        } while (str == null);
        return str;
    }

    private final Method getDesignInfoMethodOrNull(Object obj) {
        try {
            return obj.getClass().getDeclaredMethod("getDesignInfo", Integer.TYPE, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String invokeGetDesignInfo(Object obj, int i, int i2) {
        Method designInfoMethodOrNull = getDesignInfoMethodOrNull(obj);
        if (designInfoMethodOrNull == null) {
            return null;
        }
        try {
            Object invoke = designInfoMethodOrNull.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.designInfoProvidersArgument);
            Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.String");
            String str = (String) invoke;
            if (str.length() == 0) {
                str = null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void invalidateComposition() {
        this.content.setValue(ComposableSingletons$ComposeViewAdapter_androidKt.INSTANCE.m6918getLambda3$ui_tooling_release());
        this.content.setValue(this.previewComposition);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.forceCompositionInvalidation) {
            invalidateComposition();
        }
        this.onDraw.invoke();
        if (this.debugPaintBounds) {
            List<ViewInfo> list = this.viewInfos;
            ArrayList<ViewInfo> arrayList = new ArrayList();
            for (ViewInfo viewInfo : list) {
                CollectionsKt.addAll(arrayList, CollectionsKt.plus((Collection) CollectionsKt.listOf(viewInfo), (Iterable) viewInfo.allChildren()));
            }
            for (ViewInfo viewInfo2 : arrayList) {
                if (viewInfo2.hasBounds()) {
                    canvas.drawRect(new Rect(viewInfo2.getBounds().getLeft(), viewInfo2.getBounds().getTop(), viewInfo2.getBounds().getRight(), viewInfo2.getBounds().getBottom()), this.debugBoundsPaint);
                }
            }
        }
    }

    public final PreviewAnimationClock getClock$ui_tooling_release() {
        PreviewAnimationClock previewAnimationClock = this.clock;
        if (previewAnimationClock != null) {
            return previewAnimationClock;
        }
        Intrinsics.throwUninitializedPropertyAccessException("clock");
        return null;
    }

    public final void setClock$ui_tooling_release(PreviewAnimationClock previewAnimationClock) {
        this.clock = previewAnimationClock;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void WrapPreview(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(522143116);
        ComposerKt.sourceInformation(startRestartGroup, "C(WrapPreview)442@16450L61,437@16083L428:ComposeViewAdapter.android.kt#hevd2p");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(522143116, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:432)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{CompositionLocalsKt.getLocalFontLoader().provides(new LayoutlibFontResourceLoader(getContext())), CompositionLocalsKt.getLocalFontFamilyResolver().provides(FontFamilyResolver_androidKt.createFontFamilyResolver(getContext())), LocalOnBackPressedDispatcherOwner.INSTANCE.provides(this.FakeOnBackPressedDispatcherOwner), LocalActivityResultRegistryOwner.INSTANCE.provides(this.FakeActivityResultRegistryOwner)}, ComposableLambdaKt.rememberComposableLambda(-1475548980, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    CompositionDataRecord compositionDataRecord;
                    ComposerKt.sourceInformation(composer2, "C443@16464L37:ComposeViewAdapter.android.kt#hevd2p");
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1475548980, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:443)");
                    }
                    compositionDataRecord = ComposeViewAdapter.this.slotTableRecord;
                    InspectableKt.Inspectable(compositionDataRecord, function2, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$WrapPreview$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    ComposeViewAdapter.this.WrapPreview(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static /* synthetic */ void init$ui_tooling_release$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i, boolean z, boolean z2, long j, boolean z3, boolean z4, String str3, Function0 function0, Function0 function02, int i2, Object obj) {
        composeViewAdapter.init$ui_tooling_release(str, str2, (i2 & 4) != 0 ? null : cls, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? -1L : j, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? false : z4, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0, (i2 & 2048) != 0 ? new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function02);
    }

    public final void init$ui_tooling_release(final String className, final String methodName, final Class<? extends PreviewParameterProvider<?>> parameterProvider, final int parameterProviderIndex, boolean debugPaintBounds, boolean debugViewInfos, final long animationClockStartTime, boolean forceCompositionInvalidation, boolean lookForDesignInfoProviders, String designInfoProvidersArgument, final Function0<Unit> onCommit, Function0<Unit> onDraw) {
        this.debugPaintBounds = debugPaintBounds;
        this.debugViewInfos = debugViewInfos;
        this.composableName = methodName;
        this.forceCompositionInvalidation = forceCompositionInvalidation;
        this.lookForDesignInfoProviders = lookForDesignInfoProviders;
        this.designInfoProvidersArgument = designInfoProvidersArgument == null ? "" : designInfoProvidersArgument;
        this.onDraw = onDraw;
        ComposableLambda composableLambdaInstance = ComposableLambdaKt.composableLambdaInstance(-2046245106, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ComposerKt.sourceInformation(composer, "C494@19095L20,496@19141L2520,496@19129L2532:ComposeViewAdapter.android.kt#hevd2p");
                if ((i & 3) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2046245106, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:494)");
                    }
                    EffectsKt.SideEffect(onCommit, composer, 0);
                    ComposeViewAdapter composeViewAdapter = this;
                    final String str = className;
                    final String str2 = methodName;
                    final Class<? extends PreviewParameterProvider<?>> cls = parameterProvider;
                    final int i2 = parameterProviderIndex;
                    final ComposeViewAdapter composeViewAdapter2 = this;
                    final long j = animationClockStartTime;
                    composeViewAdapter.WrapPreview(ComposableLambdaKt.rememberComposableLambda(320194433, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(final Composer composer2, int i3) {
                            ComposerKt.sourceInformation(composer2, "C501@19464L977:ComposeViewAdapter.android.kt#hevd2p");
                            if ((i3 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(320194433, i3, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:497)");
                                }
                                ComposerKt.sourceInformationMarkerStart(composer2, 661486904, "CC(remember):ComposeViewAdapter.android.kt#9igjgp");
                                boolean changed = composer2.changed(str) | composer2.changed(str2) | composer2.changedInstance(composer2) | composer2.changedInstance(cls) | composer2.changed(i2) | composer2.changedInstance(composeViewAdapter2);
                                final String str3 = str;
                                final String str4 = str2;
                                final Class<? extends PreviewParameterProvider<?>> cls2 = cls;
                                final int i4 = i2;
                                final ComposeViewAdapter composeViewAdapter3 = composeViewAdapter2;
                                Object rememberedValue = composer2.rememberedValue();
                                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$composable$1$1
                                        /* JADX INFO: Access modifiers changed from: package-private */
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
                                            ThreadSafeException threadSafeException;
                                            Throwable cause;
                                            try {
                                                ComposableInvoker composableInvoker = ComposableInvoker.INSTANCE;
                                                String str5 = str3;
                                                String str6 = str4;
                                                Composer composer3 = composer2;
                                                Object[] previewProviderParameters = PreviewUtils_androidKt.getPreviewProviderParameters(cls2, i4);
                                                composableInvoker.invokeComposable(str5, str6, composer3, Arrays.copyOf(previewProviderParameters, previewProviderParameters.length));
                                            } catch (Throwable th) {
                                                Throwable th2 = th;
                                                while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                                                    th2 = cause;
                                                }
                                                threadSafeException = composeViewAdapter3.delayedException;
                                                threadSafeException.set(th2);
                                                throw th;
                                            }
                                        }
                                    };
                                    composer2.updateRememberedValue(rememberedValue);
                                }
                                Function0 function0 = (Function0) rememberedValue;
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                if (j >= 0) {
                                    composer2.startReplaceGroup(-967718059);
                                    ComposerKt.sourceInformation(composer2, "526@20874L726");
                                    ComposeViewAdapter composeViewAdapter4 = composeViewAdapter2;
                                    ComposerKt.sourceInformationMarkerStart(composer2, 661531773, "CC(remember):ComposeViewAdapter.android.kt#9igjgp");
                                    boolean changedInstance = composer2.changedInstance(composeViewAdapter2);
                                    final ComposeViewAdapter composeViewAdapter5 = composeViewAdapter2;
                                    Object rememberedValue2 = composer2.rememberedValue();
                                    if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.compose.ui.tooling.ComposeViewAdapter$init$3$1$1$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
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
                                                View childAt = ComposeViewAdapter.this.getChildAt(0);
                                                Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                                                KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
                                                ViewRootForTest viewRootForTest = childAt2 instanceof ViewRootForTest ? (ViewRootForTest) childAt2 : null;
                                                if (viewRootForTest != null) {
                                                    viewRootForTest.invalidateDescendants();
                                                }
                                                Snapshot.INSTANCE.sendApplyNotifications();
                                            }
                                        };
                                        composer2.updateRememberedValue(rememberedValue2);
                                    }
                                    ComposerKt.sourceInformationMarkerEnd(composer2);
                                    composeViewAdapter4.setClock$ui_tooling_release(new PreviewAnimationClock((Function0) rememberedValue2));
                                    composer2.endReplaceGroup();
                                } else {
                                    composer2.startReplaceGroup(-966635973);
                                    composer2.endReplaceGroup();
                                }
                                function0.invoke();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }, composer, 54), composer, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        });
        this.previewComposition = composableLambdaInstance;
        this.composeView.setContent(composableLambdaInstance);
        invalidate();
    }

    public final void dispose$ui_tooling_release() {
        this.composeView.disposeComposition();
        if (this.clock != null) {
            getClock$ui_tooling_release().dispose();
        }
        this.FakeSavedStateRegistryOwner.getLifecycleRegistry().setCurrentState(Lifecycle.State.DESTROYED);
        this.FakeViewModelStoreOwner.getViewModelStore().clear();
    }

    /* renamed from: hasAnimations, reason: from getter */
    public final boolean getHasAnimations() {
        return this.hasAnimations;
    }

    private final void init(AttributeSet attrs) {
        long j;
        ComposeViewAdapter composeViewAdapter = this;
        ViewTreeLifecycleOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
        ViewTreeSavedStateRegistryOwner.set(composeViewAdapter, this.FakeSavedStateRegistryOwner);
        ViewTreeViewModelStoreOwner.set(composeViewAdapter, this.FakeViewModelStoreOwner);
        addView(this.composeView);
        String attributeValue = attrs.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String substringBeforeLast$default = StringsKt.substringBeforeLast$default(attributeValue, '.', (String) null, 2, (Object) null);
        String substringAfterLast$default = StringsKt.substringAfterLast$default(attributeValue, '.', (String) null, 2, (Object) null);
        int attributeIntValue = attrs.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = attrs.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends PreviewParameterProvider<?>> asPreviewProviderClass = attributeValue2 != null ? PreviewUtils_androidKt.asPreviewProviderClass(attributeValue2) : null;
        try {
            j = Long.parseLong(attrs.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j = -1;
        }
        init$ui_tooling_release$default(this, substringBeforeLast$default, substringAfterLast$default, asPreviewProviderClass, attributeIntValue, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.debugPaintBounds), attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.debugViewInfos), j, attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "forceCompositionInvalidation", false), attrs.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.lookForDesignInfoProviders), attrs.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 3072, null);
    }
}
