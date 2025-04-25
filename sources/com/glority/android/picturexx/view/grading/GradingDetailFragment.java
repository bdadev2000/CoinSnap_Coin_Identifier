package com.glority.android.picturexx.view.grading;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.cmsui2.CmsFactory;
import com.glority.android.cmsui2.entity.CmsItemEntity;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.cmsui2.view.BaseCmsItemView;
import com.glority.android.cmsui2.view.CmsView;
import com.glority.android.cmsui2.view.child.WebViewItemView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.surveyEvent.SurveyAddToMmsRequest;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar3Binding;
import com.glority.android.picturexx.business.databinding.FragmentGradingDetailBinding;
import com.glority.android.picturexx.cms.GradingReportCmsItem;
import com.glority.android.picturexx.extensions.CoordinatorLayoutExtensionKt;
import com.glority.android.picturexx.js.method.BaseJsMethod;
import com.glority.android.picturexx.js.method.GradeJsMethod;
import com.glority.android.picturexx.utils.JumpUtils;
import com.glority.android.picturexx.view.chatbot.ChatbotActivity;
import com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialog;
import com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialogListener;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.view.search.SearchCmsDetailFragment;
import com.glority.android.picturexx.vm.GradingDetailViewModel;
import com.glority.android.picturexx.vm.GradingDetailViewModelKt;
import com.glority.android.picturexx.widget.ChatbotView;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.share.ShareUtil;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.base.widget.webview.MediatorJsMethod;
import com.glority.base.widget.webview.entity.MethodInvoke;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.enums.LanguageCode;
import com.glority.component.generatedAPI.kotlinAPI.enums.PhotoFrom;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.scrollview.GlNestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.firebase.messaging.Constants;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GradingDetailFragment.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001^B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u00020 H\u0002J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\fH\u0002J(\u00104\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u00105\u001a\u00020\fH\u0002J\b\u00106\u001a\u00020 H\u0002J\b\u00107\u001a\u00020 H\u0002J\b\u00108\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010<\u001a\u00020 H\u0002J\b\u0010=\u001a\u00020 H\u0002J\b\u0010>\u001a\u00020 H\u0002J\b\u0010?\u001a\u00020\fH\u0014J\b\u0010@\u001a\u00020AH\u0014J\b\u0010B\u001a\u00020 H\u0002J\b\u0010C\u001a\u00020 H\u0002J\u001a\u0010D\u001a\u00020 2\u0006\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\u0016\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010K0JH\u0002J\u0006\u0010L\u001a\u00020 J\"\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020A2\u0006\u0010O\u001a\u00020A2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010R\u001a\u00020 H\u0016J\u0012\u0010S\u001a\u00020 2\b\u0010T\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010U\u001a\u00020 2\u0006\u0010V\u001a\u00020\fH\u0002J*\u0010W\u001a\u00020 2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020 0ZH\u0002J\u0016\u0010[\u001a\u00020 2\u0006\u0010\\\u001a\u00020\fH\u0082@¢\u0006\u0002\u0010]R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/glority/android/picturexx/view/grading/GradingDetailFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentGradingDetailBinding;", "Lcom/glority/base/widget/webview/JsbWebView$MethodListener;", "<init>", "()V", "chatbotSessionId", "", "Ljava/lang/Long;", "webViewItem", "Lcom/glority/android/cmsui2/view/child/WebViewItemView;", Args.year, "", "getYear", "()Ljava/lang/String;", "setYear", "(Ljava/lang/String;)V", Args.subjectSideUrl, Args.denominationSideUrl, Args.varietyUid, "getVarietyUid", "setVarietyUid", "grade", "getGrade", "setGrade", "gptGrade", "userImageList", "", "jsAllowRules", "", "addCollectionMethod", "Lkotlin/Function0;", "", "handler", "Landroid/os/Handler;", "vm", "Lcom/glority/android/picturexx/vm/GradingDetailViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/GradingDetailViewModel;", "vm$delegate", "Lkotlin/Lazy;", "scrollRunnable", "Ljava/lang/Runnable;", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "initData", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "requestGPTStreamingData", "initH5", "url", "initView", "image", "initBottomBar", "initGradingMask", "onResume", "shareApp", "it", "Landroid/view/View;", "retake", "addCollection", "clickAddCollection", "getLogPageName", "getLayoutId", "", "initToolBar", "back", "jsInvoke", "methodInvoke", "Lcom/glority/base/widget/webview/entity/MethodInvoke;", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", "getInjectJsVariableData", "", "", "reInjectJs", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onGPTStreamEnd", "streamingContent", "copyContentToClipboard", "content", "openGradingReportFeedbackDialog", "onCloseClick", "onFeedbackSubmit", "Lkotlin/Function1;", "uploadToMMS", "imageUrl", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GradingDetailFragment extends BaseFragment<FragmentGradingDetailBinding> implements JsbWebView.MethodListener {
    private static CmsName cmsName;
    private Long chatbotSessionId;
    private String denominationSideUrl;
    public String grade;
    private final Runnable scrollRunnable;
    private String subjectSideUrl;
    private String varietyUid;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private WebViewItemView webViewItem;
    public String year;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private String gptGrade = "";
    private List<String> userImageList = new ArrayList();
    private Set<String> jsAllowRules = SetsKt.mutableSetOf("https://*.coinidentifierai.com");
    private Function0<Unit> addCollectionMethod = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$addCollectionMethod$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    };
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initGradingMask$lambda$9(View view, MotionEvent motionEvent) {
        return true;
    }

    public GradingDetailFragment() {
        final GradingDetailFragment gradingDetailFragment = this;
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) Function0.this.invoke();
            }
        });
        final Function0 function02 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(gradingDetailFragment, Reflection.getOrCreateKotlinClass(GradingDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStoreOwner m7538viewModels$lambda1;
                m7538viewModels$lambda1 = FragmentViewModelLazyKt.m7538viewModels$lambda1(Lazy.this);
                return m7538viewModels$lambda1.getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                ViewModelStoreOwner m7538viewModels$lambda1;
                CreationExtras creationExtras;
                Function0 function03 = Function0.this;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                m7538viewModels$lambda1 = FragmentViewModelLazyKt.m7538viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m7538viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m7538viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelStoreOwner m7538viewModels$lambda1;
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                m7538viewModels$lambda1 = FragmentViewModelLazyKt.m7538viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m7538viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m7538viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.scrollRunnable = new Runnable() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                GradingDetailFragment.scrollRunnable$lambda$0(GradingDetailFragment.this);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentGradingDetailBinding access$getBinding(GradingDetailFragment gradingDetailFragment) {
        return (FragmentGradingDetailBinding) gradingDetailFragment.getBinding();
    }

    /* compiled from: GradingDetailFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JH\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/android/picturexx/view/grading/GradingDetailFragment$Companion;", "", "<init>", "()V", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "open", "", "context", "Landroid/content/Context;", Args.year, "", "grade", "image", Args.subjectSideUrl, Args.denominationSideUrl, HandOnBundleUtils.KEY, "Landroid/os/Bundle;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Context context, CmsName cmsName, String year, String grade, String image, String subjectSideUrl, String denominationSideUrl, Bundle handOnBundle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cmsName, "cmsName");
            Intrinsics.checkNotNullParameter(year, "year");
            Intrinsics.checkNotNullParameter(grade, "grade");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(subjectSideUrl, "subjectSideUrl");
            Intrinsics.checkNotNullParameter(denominationSideUrl, "denominationSideUrl");
            GradingDetailFragment.cmsName = cmsName;
            ContainerActivity.INSTANCE.open(GradingDetailFragment.class).put("grade", grade).put(Args.year, year).put(Args.imageUrls, image).put(Args.subjectSideUrl, subjectSideUrl).put(Args.denominationSideUrl, denominationSideUrl).put(HandOnBundleUtils.KEY, handOnBundle).launch(context);
        }
    }

    public final String getYear() {
        String str = this.year;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.year);
        return null;
    }

    public final void setYear(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.year = str;
    }

    public final String getVarietyUid() {
        return this.varietyUid;
    }

    public final void setVarietyUid(String str) {
        this.varietyUid = str;
    }

    public final String getGrade() {
        String str = this.grade;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("grade");
        return null;
    }

    public final void setGrade(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.grade = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GradingDetailViewModel getVm() {
        return (GradingDetailViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void scrollRunnable$lambda$0(GradingDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ((FragmentGradingDetailBinding) this$0.getBinding()).chatbotView.show();
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        String str;
        String str2;
        String string;
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null || (str = arguments.getString("grade")) == null) {
            str = "";
        }
        setGrade(str);
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str2 = arguments2.getString(Args.year)) == null) {
            str2 = "";
        }
        setYear(str2);
        Bundle arguments3 = getArguments();
        this.subjectSideUrl = arguments3 != null ? arguments3.getString(Args.subjectSideUrl) : null;
        Bundle arguments4 = getArguments();
        this.denominationSideUrl = arguments4 != null ? arguments4.getString(Args.denominationSideUrl) : null;
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string = arguments5.getString(Args.imageUrls)) != null) {
            str3 = string;
        }
        this.userImageList.add(str3);
        CmsName cmsName2 = cmsName;
        if (cmsName2 != null) {
            Intrinsics.checkNotNull(cmsName2);
            initView(cmsName2, getGrade(), getYear(), str3);
            CmsName cmsName3 = cmsName;
            Intrinsics.checkNotNull(cmsName3);
            initData(cmsName3);
            return;
        }
        ViewExtensionsKt.finish(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initData(CmsName cmsName2) {
        if (CoinAbTestUtils.INSTANCE.enableCoinGradingReport()) {
            ((FragmentGradingDetailBinding) getBinding()).cmsView.addItem(new CmsItemEntity(51, "", new GradingReportCmsItem(getVm().getHasJudged(), new Function1<GradingReportCmsItem, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$gradingReportItem$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GradingReportCmsItem gradingReportCmsItem) {
                    invoke2(gradingReportCmsItem);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GradingReportCmsItem it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (GradingDetailFragment.this.isAdded()) {
                        GradingDetailFragment gradingDetailFragment = GradingDetailFragment.this;
                        gradingDetailFragment.logEvent(LogEvents.Grading_Report_Result_Like_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, gradingDetailFragment.getGrade()), TuplesKt.to(LogEventArguments.ARG_STRING_2, it.getGptGradeResult())));
                        ToastUtils.showSuccess(R.string.thank_you_for_you_feedback, new Object[0]);
                        it.finishJudged();
                    }
                }
            }, new Function1<GradingReportCmsItem, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$gradingReportItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(GradingReportCmsItem gradingReportCmsItem) {
                    invoke2(gradingReportCmsItem);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(final GradingReportCmsItem item) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    if (GradingDetailFragment.this.isAdded()) {
                        GradingDetailFragment gradingDetailFragment = GradingDetailFragment.this;
                        Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$gradingReportItem$2.1
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
                                GradingReportCmsItem.this.restoreFeedback();
                            }
                        };
                        final GradingDetailFragment gradingDetailFragment2 = GradingDetailFragment.this;
                        gradingDetailFragment.openGradingReportFeedbackDialog(function0, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$gradingReportItem$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                invoke2(str);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String feedbackContent) {
                                Intrinsics.checkNotNullParameter(feedbackContent, "feedbackContent");
                                GradingDetailFragment gradingDetailFragment3 = GradingDetailFragment.this;
                                gradingDetailFragment3.logEvent(LogEvents.Grading_Report_Result_Dislike_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, gradingDetailFragment3.getGrade()), TuplesKt.to(LogEventArguments.ARG_STRING_2, item.getGptGradeResult()), TuplesKt.to(LogEventArguments.ARG_STRING_3, feedbackContent)));
                                item.finishJudged();
                            }
                        });
                    }
                }
            }, new Function2<GradingReportCmsItem, String, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initData$gradingReportItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(GradingReportCmsItem gradingReportCmsItem, String str) {
                    invoke2(gradingReportCmsItem, str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GradingReportCmsItem item, String content) {
                    Intrinsics.checkNotNullParameter(item, "item");
                    Intrinsics.checkNotNullParameter(content, "content");
                    if (GradingDetailFragment.this.isAdded()) {
                        GradingDetailFragment.this.logEvent(LogEvents.Grading_Report_Result_Copy_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("content", content), TuplesKt.to(LogEventArguments.ARG_STRING_1, GradingDetailFragment.this.getGrade()), TuplesKt.to(LogEventArguments.ARG_STRING_2, item.getGptGradeResult())));
                        GradingDetailFragment.this.copyContentToClipboard(content);
                        ToastUtils.showSuccess(R.string.text_copied, new Object[0]);
                    }
                }
            })), 0);
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new GradingDetailFragment$initData$1(cmsName2, this, null), 2, null);
    }

    private final void requestGPTStreamingData() {
        if (isAdded()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new GradingDetailFragment$requestGPTStreamingData$1(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initH5(String url) {
        Context context = getContext();
        if (context != null) {
            CmsItemEntity createWebView = CmsFactory.INSTANCE.createWebView(context, url, this.jsAllowRules, this, getInjectJsVariableData(), new Function0<Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initH5$1$webviewItem$1
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
                    GradingDetailFragment.access$getBinding(GradingDetailFragment.this).cmsView.removeItem(38);
                }
            });
            BaseCmsItemView item = createWebView.getItem();
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.glority.android.cmsui2.view.child.WebViewItemView");
            this.webViewItem = (WebViewItemView) item;
            CmsView.addItem$default(((FragmentGradingDetailBinding) getBinding()).cmsView, createWebView, null, 2, null);
            if (CoinAbTestUtils.INSTANCE.enableCoinGradingReport()) {
                WebViewItemView webViewItemView = this.webViewItem;
                if (webViewItemView != null) {
                    webViewItemView.setWebViewInvisible();
                    return;
                }
                return;
            }
            WebViewItemView webViewItemView2 = this.webViewItem;
            if (webViewItemView2 != null) {
                webViewItemView2.setWebViewVisible();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView(final CmsName cmsName2, final String grade, final String year, String image) {
        String str = cmsName2.getName().getPreferredName() + " " + year;
        initToolBar();
        AppCompatImageView headerIv = ((FragmentGradingDetailBinding) getBinding()).headerIv;
        Intrinsics.checkNotNullExpressionValue(headerIv, "headerIv");
        com.glority.base.ext.ViewExtensionsKt.load(headerIv, image);
        ((FragmentGradingDetailBinding) getBinding()).tvName.setText(str);
        if (!CoinAbTestUtils.INSTANCE.enableCoinGradingReport()) {
            CmsView.addItem$default(((FragmentGradingDetailBinding) getBinding()).cmsView, CmsFactory.INSTANCE.createLoadingView(), null, 2, null);
        }
        ChatbotView chatbotView = ((FragmentGradingDetailBinding) getBinding()).chatbotView;
        Intrinsics.checkNotNullExpressionValue(chatbotView, "chatbotView");
        ViewExtensionsKt.setSingleClickListener$default(chatbotView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initView$1
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
                Long l;
                Intrinsics.checkNotNullParameter(it, "it");
                GradingDetailFragment.this.logEvent(LogEvents.chatbot_entry_click, BundleKt.bundleOf(TuplesKt.to("from", ChatbotActivity.SESSIONTYPE_GRADE_RESULT)));
                ChatbotActivity.Companion companion = ChatbotActivity.Companion;
                GradingDetailFragment gradingDetailFragment = GradingDetailFragment.this;
                l = gradingDetailFragment.chatbotSessionId;
                companion.open(gradingDetailFragment, l, ChatbotActivity.SESSIONTYPE_GRADE_RESULT, "coin_grade", null, cmsName2.getUid(), MapsKt.mapOf(TuplesKt.to(Args.year, year), TuplesKt.to("commonName", cmsName2.getName().getPreferredName()), TuplesKt.to("grade", grade)));
            }
        }, 1, (Object) null);
        CmsView cmsView = ((FragmentGradingDetailBinding) getBinding()).cmsView;
        Intrinsics.checkNotNullExpressionValue(cmsView, "cmsView");
        CmsView cmsView2 = cmsView;
        ViewGroup.LayoutParams layoutParams = cmsView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
        if (!CoinAbTestUtils.INSTANCE.enableCoinGradingReport()) {
            marginLayoutParams2.topMargin = getResources().getDimensionPixelOffset(R.dimen.x60) * (-1);
        }
        cmsView2.setLayoutParams(marginLayoutParams);
        ConstraintLayout clNameContainer = ((FragmentGradingDetailBinding) getBinding()).clNameContainer;
        Intrinsics.checkNotNullExpressionValue(clNameContainer, "clNameContainer");
        ConstraintLayout constraintLayout = clNameContainer;
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams3.topMargin = getResources().getDimensionPixelOffset(R.dimen.x36) * (-1);
        constraintLayout.setLayoutParams(marginLayoutParams3);
        AppCompatImageView ivNameArrow = ((FragmentGradingDetailBinding) getBinding()).ivNameArrow;
        Intrinsics.checkNotNullExpressionValue(ivNameArrow, "ivNameArrow");
        ivNameArrow.setVisibility(CoinAbTestUtils.INSTANCE.enableCoinGradingReport() ? 0 : 8);
        AppCompatImageView ivNameArrow2 = ((FragmentGradingDetailBinding) getBinding()).ivNameArrow;
        Intrinsics.checkNotNullExpressionValue(ivNameArrow2, "ivNameArrow");
        ViewExtensionsKt.setSingleClickListener$default(ivNameArrow2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initView$4
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
                Intrinsics.checkNotNullParameter(it, "it");
                FragmentActivity activity = GradingDetailFragment.this.getActivity();
                if (activity == null) {
                    return;
                }
                SearchCmsDetailFragment.INSTANCE.openByUid(activity, cmsName2.getUid(), (r18 & 4) != 0 ? null : GradingDetailFragment.this.getPageName(), (r18 & 8) != 0 ? null : GradingDetailFragment.this.getPageName(), (r18 & 16) != 0 ? null : year, (r18 & 32) != 0 ? null : GradingDetailFragment.this.getVarietyUid(), (r18 & 64) != 0 ? null : null);
            }
        }, 1, (Object) null);
        initGradingMask();
        initBottomBar();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBottomBar() {
        CmsDetailBottomBar3Binding bottomBar = ((FragmentGradingDetailBinding) getBinding()).bottomBar;
        Intrinsics.checkNotNullExpressionValue(bottomBar, "bottomBar");
        bottomBar.addBt.setText("+ " + ((Object) bottomBar.addBt.getText()));
        MaterialButton addBt = bottomBar.addBt;
        Intrinsics.checkNotNullExpressionValue(addBt, "addBt");
        ViewExtensionsKt.setSingleClickListener$default(addBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initBottomBar$1
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
                GradingDetailFragment.this.clickAddCollection();
            }
        }, 1, (Object) null);
        bottomBar.shareIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingDetailFragment.initBottomBar$lambda$4(GradingDetailFragment.this, view);
            }
        });
        bottomBar.newIv.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GradingDetailFragment.initBottomBar$lambda$5(GradingDetailFragment.this, view);
            }
        });
        bottomBar.llBottom.getLayoutTransition().enableTransitionType(4);
        ((FragmentGradingDetailBinding) getBinding()).bottomBar.addBt.postDelayed(new Runnable() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GradingDetailFragment.initBottomBar$lambda$6(GradingDetailFragment.this);
            }
        }, 350L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomBar$lambda$4(GradingDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.shareApp(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomBar$lambda$5(GradingDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.retake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initBottomBar$lambda$6(GradingDetailFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDetached()) {
            return;
        }
        MaterialButton addBt = ((FragmentGradingDetailBinding) this$0.getBinding()).bottomBar.addBt;
        Intrinsics.checkNotNullExpressionValue(addBt, "addBt");
        addBt.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initGradingMask() {
        final LinearLayout llGradingMask = ((FragmentGradingDetailBinding) getBinding()).llGradingMask;
        Intrinsics.checkNotNullExpressionValue(llGradingMask, "llGradingMask");
        boolean isVip = AppViewModel.INSTANCE.isVip();
        llGradingMask.setVisibility(isVip ^ true ? 0 : 8);
        ((FragmentGradingDetailBinding) getBinding()).appbar.post(new Runnable() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                GradingDetailFragment.initGradingMask$lambda$8(GradingDetailFragment.this, llGradingMask);
            }
        });
        AppCompatTextView tvCmsGradingReport = ((FragmentGradingDetailBinding) getBinding()).tvCmsGradingReport;
        Intrinsics.checkNotNullExpressionValue(tvCmsGradingReport, "tvCmsGradingReport");
        ViewExtensionsKt.setSingleClickListener$default(tvCmsGradingReport, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initGradingMask$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke2(view);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                Intrinsics.checkNotNullParameter(it, "it");
                new OpenBillingActivityRequest("Grading_Detail", String.valueOf(AbTestUtil.INSTANCE.getConversionPageId()), null, 4, null).post();
            }
        }, 1, (Object) null);
        CoordinatorLayout coordinatorLayout = ((FragmentGradingDetailBinding) getBinding()).coordinatorLayout;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "coordinatorLayout");
        AppBarLayout appbar = ((FragmentGradingDetailBinding) getBinding()).appbar;
        Intrinsics.checkNotNullExpressionValue(appbar, "appbar");
        CoordinatorLayoutExtensionKt.setScrollable(coordinatorLayout, appbar, isVip);
        ((FragmentGradingDetailBinding) getBinding()).llGradingMask.setOnTouchListener(new View.OnTouchListener() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda4
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean initGradingMask$lambda$9;
                initGradingMask$lambda$9 = GradingDetailFragment.initGradingMask$lambda$9(view, motionEvent);
                return initGradingMask$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initGradingMask$lambda$8(GradingDetailFragment this$0, LinearLayout maskView) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(maskView, "$maskView");
        int bottom = ((FragmentGradingDetailBinding) this$0.getBinding()).appbar.getBottom();
        LinearLayout linearLayout = maskView;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = bottom;
            linearLayout.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        boolean z = CoinAbTestUtils.INSTANCE.enableCoinGradingReport() && !AppViewModel.INSTANCE.isVip();
        LinearLayout llGradingMask = ((FragmentGradingDetailBinding) getBinding()).llGradingMask;
        Intrinsics.checkNotNullExpressionValue(llGradingMask, "llGradingMask");
        llGradingMask.setVisibility(z ? 0 : 8);
        CoordinatorLayout coordinatorLayout = ((FragmentGradingDetailBinding) getBinding()).coordinatorLayout;
        Intrinsics.checkNotNullExpressionValue(coordinatorLayout, "coordinatorLayout");
        AppBarLayout appbar = ((FragmentGradingDetailBinding) getBinding()).appbar;
        Intrinsics.checkNotNullExpressionValue(appbar, "appbar");
        CoordinatorLayoutExtensionKt.setScrollable(coordinatorLayout, appbar, !z);
        if (CoinAbTestUtils.INSTANCE.enableCoinGradingReport() && !z && !getVm().getHasRequestedGpt()) {
            getVm().setHasRequestedGpt(true);
            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.Grading_Report_GPT_4o_Exposure, null, 2, null);
            requestGPTStreamingData();
        }
        super.onResume();
    }

    private final void shareApp(View it) {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.grade_share_click, null, 2, null);
        ShareUtil.INSTANCE.shareAPP(it.getContext());
    }

    private final void retake() {
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.grade_retake_click, null, 2, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            JumpUtils.INSTANCE.toGradeCapture(activity, LogEvents.grade_retake, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        ViewExtensionsKt.finish(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addCollection() {
        GradeItem gradeItem;
        Integer intOrNull;
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this, LogEvents.grade_addcollection_click, null, 2, null);
        String tagValue = CmsDataUtils.INSTANCE.getTagValue(cmsName, "PreferredSeries");
        GradingLevelScaleConvertor.ScaleType defaultScaleType = GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode());
        CmsName cmsName2 = cmsName;
        if (cmsName2 != null) {
            CollectionDetailEditDialogFragment.Companion companion = CollectionDetailEditDialogFragment.INSTANCE;
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            String uid = cmsName2.getUid();
            String year = getYear();
            List<String> list = this.userImageList;
            String pageName = getPageName();
            GradeItem gradeConvertLongName = GradingLevelScaleConvertor.INSTANCE.gradeConvertLongName(getGrade(), defaultScaleType);
            if (gradeConvertLongName != null) {
                if (AppViewModel.INSTANCE.getInstance().getLanguageCode() == LanguageCode.English && this.gptGrade.length() > 0) {
                    try {
                        MatchResult find$default = Regex.find$default(new Regex("\\d+"), this.gptGrade, 0, 2, null);
                        if (find$default != null && (intOrNull = StringsKt.toIntOrNull(find$default.getValue())) != null) {
                            gradeConvertLongName.setLevel(Integer.valueOf(intOrNull.intValue()));
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
                gradeItem = gradeConvertLongName;
            } else {
                gradeItem = null;
            }
            companion.createOpen(supportFragmentManager, null, uid, year, list, 2, pageName, cmsName2, tagValue, (r33 & 512) != 0 ? null : this.denominationSideUrl, (r33 & 1024) != 0 ? null : this.subjectSideUrl, (r33 & 2048) != 0 ? null : null, (r33 & 4096) != 0 ? null : this.varietyUid, (r33 & 8192) != 0 ? null : gradeItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clickAddCollection() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new GradingDetailFragment$clickAddCollection$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.grade_result;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_grading_detail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initToolBar() {
        final LinearLayout appBarLayout = ((FragmentGradingDetailBinding) getBinding()).appBarLayout;
        Intrinsics.checkNotNullExpressionValue(appBarLayout, "appBarLayout");
        final int dimension = ((int) ResUtils.getDimension(R.dimen.x132)) * 2;
        ((AppBarLayout) requireView().findViewById(R.id.appbar)).addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda6
            @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout2, int i) {
                GradingDetailFragment.initToolBar$lambda$15(dimension, appBarLayout, this, appBarLayout2, i);
            }
        });
        ((FragmentGradingDetailBinding) getBinding()).cmsView.setOnVerticalScrollChangeListener(new GlNestedScrollView.OnScrollChangeListener() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$$ExternalSyntheticLambda7
            @Override // com.glority.widget.scrollview.GlNestedScrollView.OnScrollChangeListener
            public final void onScrollChange(View view, int i, int i2, int i3) {
                GradingDetailFragment.initToolBar$lambda$16(GradingDetailFragment.this, view, i, i2, i3);
            }
        });
        ImageView ivClose = ((FragmentGradingDetailBinding) getBinding()).ivClose;
        Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
        ViewExtensionsKt.setSingleClickListener$default(ivClose, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initToolBar$3
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
                GradingDetailFragment.this.back();
            }
        }, 1, (Object) null);
        ImageView ivClose2 = ((FragmentGradingDetailBinding) getBinding()).ivClose2;
        Intrinsics.checkNotNullExpressionValue(ivClose2, "ivClose2");
        ViewExtensionsKt.setSingleClickListener$default(ivClose2, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$initToolBar$4
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
                GradingDetailFragment.this.back();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initToolBar$lambda$15(int i, LinearLayout appBarLayout, GradingDetailFragment this$0, AppBarLayout appBarLayout2, int i2) {
        Intrinsics.checkNotNullParameter(appBarLayout, "$appBarLayout");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        appBarLayout.setAlpha((-i2) / i);
        ((FragmentGradingDetailBinding) this$0.getBinding()).chatbotView.hide();
        this$0.handler.postDelayed(this$0.scrollRunnable, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initToolBar$lambda$16(GradingDetailFragment this$0, View view, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.handler.removeCallbacks(this$0.scrollRunnable);
        if (i3 == 0) {
            this$0.handler.postDelayed(this$0.scrollRunnable, 500L);
        } else if (i3 == 1 || i3 == 2) {
            ((FragmentGradingDetailBinding) this$0.getBinding()).chatbotView.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void back() {
        ViewExtensionsKt.finish(this);
    }

    @Override // com.glority.base.widget.webview.JsbWebView.MethodListener
    public void jsInvoke(MethodInvoke methodInvoke, JsbWebView.MethodCallback methodCallback) {
        Intrinsics.checkNotNullParameter(methodInvoke, "methodInvoke");
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        BaseJsMethod baseJsMethod = new BaseJsMethod((RuntimePermissionActivity) requireActivity, getPageName());
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNull(requireActivity2, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        GradeJsMethod gradeJsMethod = new GradeJsMethod(this, (RuntimePermissionActivity) requireActivity2, getPageName());
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNull(requireActivity3, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        MediatorJsMethod mediatorJsMethod = new MediatorJsMethod((RuntimePermissionActivity) requireActivity3, getPageName());
        mediatorJsMethod.mergeJsMethod(baseJsMethod);
        mediatorJsMethod.mergeJsMethod(gradeJsMethod);
        mediatorJsMethod.invoke(methodInvoke, methodCallback);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.Map<java.lang.String, java.lang.Object> getInjectJsVariableData() {
        /*
            r4 = this;
            r0 = 10
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            com.glority.android.cmsui2.util.GradingLevelScaleConvertor r1 = com.glority.android.cmsui2.util.GradingLevelScaleConvertor.INSTANCE
            java.lang.String r2 = r4.getGrade()
            com.glority.android.cmsui2.util.GradingLevelScaleConvertor$ScaleType r3 = com.glority.android.cmsui2.util.GradingLevelScaleConvertor.ScaleType.sheldon
            com.glority.android.cmsui2.entity.GradeItem r1 = r1.gradeConvertLongName(r2, r3)
            if (r1 == 0) goto L26
            java.lang.String r1 = r1.getShortNameId()
            if (r1 == 0) goto L26
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r1 == 0) goto L26
            goto L2a
        L26:
            java.lang.String r1 = r4.getGrade()
        L2a:
            java.lang.String r2 = "grade"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            r3 = 0
            r0[r3] = r1
            java.lang.String r1 = "year"
            java.lang.String r3 = r4.getYear()
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r3 = 1
            r0[r3] = r1
            com.glority.base.abtest.CoinAbTestUtils r1 = com.glority.base.abtest.CoinAbTestUtils.INSTANCE
            java.lang.String r1 = r1.getH5PriceABVariable()
            java.lang.String r3 = "priceVersion"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r3, r1)
            r3 = 2
            r0[r3] = r1
            java.lang.String r1 = "pageName"
            java.lang.String r3 = r4.getPageName()
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r3 = 3
            r0[r3] = r1
            java.lang.String r1 = "varietyUid"
            java.lang.String r3 = r4.varietyUid
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            r3 = 4
            r0[r3] = r1
            java.lang.String r1 = "from"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            r2 = 5
            r0[r2] = r1
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r1 = com.glority.android.picturexx.view.grading.GradingDetailFragment.cmsName
            if (r1 == 0) goto L79
            java.lang.String r1 = r1.getUid()
            goto L7a
        L79:
            r1 = 0
        L7a:
            java.lang.String r2 = "uid"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            r2 = 6
            r0[r2] = r1
            com.glority.android.cmsui2.util.GradingLevelScaleConvertor r1 = com.glority.android.cmsui2.util.GradingLevelScaleConvertor.INSTANCE
            com.glority.base.viewmodel.AppViewModel$Companion r2 = com.glority.base.viewmodel.AppViewModel.INSTANCE
            com.glority.base.viewmodel.AppViewModel r2 = r2.getInstance()
            java.lang.String r2 = r2.getCountryCode()
            com.glority.android.cmsui2.util.GradingLevelScaleConvertor$ScaleType r1 = r1.getDefaultScaleType(r2)
            java.lang.String r1 = r1.getType()
            java.lang.String r2 = "currentScale"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            com.glority.android.cmsui2.util.GradingLevelScaleConvertor r2 = com.glority.android.cmsui2.util.GradingLevelScaleConvertor.INSTANCE
            java.util.Map r2 = r2.getScaleTypes()
            java.lang.String r3 = "scaleMap"
            kotlin.Pair r2 = kotlin.TuplesKt.to(r3, r2)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1, r2}
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            java.lang.String r2 = "gradeScale"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            r2 = 7
            r0[r2] = r1
            com.glority.android.picturexx.utils.CoinConfigUtils r1 = com.glority.android.picturexx.utils.CoinConfigUtils.INSTANCE
            java.lang.String r1 = r1.getCountryCode()
            java.lang.String r2 = "countryCode"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            r2 = 8
            r0[r2] = r1
            java.lang.String r1 = "gradingVersion"
            java.lang.String r2 = "v2"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r2)
            r2 = 9
            r0[r2] = r1
            java.util.HashMap r0 = kotlin.collections.MapsKt.hashMapOf(r0)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.grading.GradingDetailFragment.getInjectJsVariableData():java.util.Map");
    }

    public final void reInjectJs() {
        JsbWebView webView;
        JsbWebView webView2;
        WebViewItemView webViewItemView = this.webViewItem;
        if (webViewItemView != null && (webView2 = webViewItemView.getWebView()) != null) {
            webView2.setInjectStartupParams(getInjectJsVariableData());
        }
        WebViewItemView webViewItemView2 = this.webViewItem;
        if (webViewItemView2 == null || (webView = webViewItemView2.getWebView()) == null) {
            return;
        }
        webView.rejectStartupParams();
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 33 && resultCode == -1) {
            Long valueOf = data != null ? Long.valueOf(data.getLongExtra(Args.sessionId, -1L)) : null;
            if (valueOf != null && valueOf.longValue() == -1) {
                this.chatbotSessionId = null;
                return;
            } else {
                this.chatbotSessionId = valueOf;
                return;
            }
        }
        if (requestCode == 20 && AppViewModel.INSTANCE.isVip()) {
            this.addCollectionMethod.invoke();
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onGPTStreamEnd(String streamingContent) {
        String grade;
        JsbWebView webView;
        String str = streamingContent;
        if (str == null || str.length() == 0) {
            grade = getGrade();
        } else {
            grade = GradingDetailViewModelKt.getGradingGPTResult(GradingReportCmsItem.INSTANCE, streamingContent);
            if (grade == null) {
                grade = "";
            }
            this.gptGrade = grade;
        }
        CmsItemEntity itemByType = ((FragmentGradingDetailBinding) getBinding()).cmsView.getItemByType(21);
        BaseCmsItemView item = itemByType != null ? itemByType.getItem() : null;
        WebViewItemView webViewItemView = item instanceof WebViewItemView ? (WebViewItemView) item : null;
        String str2 = grade;
        if (str2 != null && str2.length() != 0) {
            String str3 = "window.updatePriceWithGrade(\"" + getYear() + "\",\"" + this.varietyUid + "\",\"" + grade + "\")";
            if (webViewItemView != null && (webView = webViewItemView.getWebView()) != null) {
                webView.evaluateJavascript(str3, null);
            }
        }
        if (webViewItemView != null) {
            webViewItemView.setWebViewVisible();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copyContentToClipboard(String content) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(Constants.ScionAnalytics.PARAM_LABEL, content));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openGradingReportFeedbackDialog(final Function0<Unit> onCloseClick, final Function1<? super String, Unit> onFeedbackSubmit) {
        if (isAdded()) {
            CommonSuggestionsFeedbackDialog.INSTANCE.show(getSupportFragmentManager(), new CommonSuggestionsFeedbackDialogListener() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$openGradingReportFeedbackDialog$listener$1
                @Override // com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialogListener
                public void onFeedbackClose(DialogFragment dialog) {
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    onCloseClick.invoke();
                    dialog.dismissAllowingStateLoss();
                }

                @Override // com.glority.android.picturexx.view.dialog.CommonSuggestionsFeedbackDialogListener
                public void onFeedbackSubmit(DialogFragment dialog, String feedback) {
                    Intrinsics.checkNotNullParameter(dialog, "dialog");
                    Intrinsics.checkNotNullParameter(feedback, "feedback");
                    onFeedbackSubmit.invoke(feedback);
                    dialog.dismissAllowingStateLoss();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object uploadToMMS(String str, Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        new SurveyAddToMmsRequest("coin_grade_4o", str, new String[0], AppViewModel.INSTANCE.getInstance().getCountryCode(), PhotoFrom.ALBUM, null, 32, null).subscribe(new Consumer() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$uploadToMMS$2$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Long l) {
                if (cancellableContinuationImpl2.isCancelled() || !cancellableContinuationImpl2.isActive()) {
                    return;
                }
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(Unit.INSTANCE));
            }
        }, new Consumer() { // from class: com.glority.android.picturexx.view.grading.GradingDetailFragment$uploadToMMS$2$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                if (cancellableContinuationImpl2.isCancelled() || !cancellableContinuationImpl2.isActive()) {
                    return;
                }
                CancellableContinuation<Unit> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(Unit.INSTANCE));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
