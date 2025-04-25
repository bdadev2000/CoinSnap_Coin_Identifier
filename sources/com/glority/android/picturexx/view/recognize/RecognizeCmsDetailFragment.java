package com.glority.android.picturexx.view.recognize;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.cmsui2.entity.GradeItem;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.cmsui2.util.GradingLevelScaleConvertor;
import com.glority.android.cmsui2.view.child.WebViewItemView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.core.route.adjust.SendTrackEventRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.database.entities.RecognizeHistoryItem;
import com.glority.android.database.entities.UserSeriesListItem;
import com.glority.android.picturexx.GlobalLiveBus;
import com.glority.android.picturexx.ImageViewDataBindingKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.CmsDetailBottomBar1Binding;
import com.glority.android.picturexx.business.databinding.FragmentCustomDetailBinding;
import com.glority.android.picturexx.entity.ValueCheckUiEntity;
import com.glority.android.picturexx.js.method.BaseJsMethod;
import com.glority.android.picturexx.js.method.RecognizeDetailJsMethod;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.android.picturexx.view.chatbot.ChatbotActivity;
import com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.GradingRecognizeProcess;
import com.glority.android.picturexx.vm.IdentificationResultViewModel;
import com.glority.android.picturexx.widget.ChatbotView;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.Constants;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.utils.AbTestUtil;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.TaxonomyName;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.google.android.material.button.MaterialButton;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: RecognizeCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J(\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H\u0016J\u001a\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u000fH\u0016J\u0016\u0010)\u001a\u00020\u001c2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0+H\u0002JJ\u0010,\u001a\u00020\u001c2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u00010\u000f2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u000f2\b\u00103\u001a\u0004\u0018\u00010\u000f2\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u000105H\u0016J\u0010\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020\u000fH\u0002J\b\u00108\u001a\u00020\u001cH\u0016J\u0012\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u000fH\u0016J\u000f\u0010<\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\u001cH\u0016J\b\u0010?\u001a\u00020\u001cH\u0016J\b\u0010@\u001a\u00020\u001cH\u0002J\b\u0010A\u001a\u00020\u0016H\u0016J\b\u0010B\u001a\u00020\u000fH\u0014J\n\u0010C\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010D\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00132\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\"\u0010I\u001a\u00020\u001c2\u0006\u0010J\u001a\u00020\u00162\u0006\u0010-\u001a\u00020.2\b\u0010K\u001a\u0004\u0018\u00010LH\u0016J\"\u0010M\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010O\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010Q0PH\u0016J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010T\u001a\u00020\u001cJ\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00020V05H\u0016J\b\u0010W\u001a\u00020\u001cH\u0002J\b\u0010X\u001a\u00020\u001cH\u0016J\u001e\u0010Y\u001a\u00020\u001c2\u0006\u0010Z\u001a\u00020[2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001c0+H\u0002J\u0018\u0010]\u001a\u0004\u0018\u00010.2\u0006\u00107\u001a\u00020\u000fH\u0082@¢\u0006\u0002\u0010^R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/RecognizeCmsDetailFragment;", "Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomDetailBinding;", "<init>", "()V", "chatbotSessionId", "", "Ljava/lang/Long;", "vm", "Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "vm$delegate", "Lkotlin/Lazy;", "recognizeYear", "", "bottomView", "Lcom/glority/android/picturexx/business/databinding/CmsDetailBottomBar1Binding;", "lastCollectionId", "", "Ljava/lang/Integer;", "collectionCreated", "", "isCollected", "h5Initialized", "userSeriesListItem", "Lcom/glority/android/database/entities/UserSeriesListItem;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onScrollListener", "v", "Landroid/view/View;", "scrollY", "oldScrollY", "scrollState", "openCamera", "baseJsMethod", "Lcom/glority/android/picturexx/js/method/BaseJsMethod;", "scene", "identify", "callback", "Lkotlin/Function0;", "updateCmsUi", Args.cmsName, "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "displayName", "holderDrawable", "Landroid/graphics/drawable/Drawable;", Args.subjectSideUrl, Args.denominationSideUrl, "userImages", "", "reportOneUidMoreYear", Args.uid, "initData", "addCollection", "Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;", "from", "getItemId", "()Ljava/lang/Long;", "retake", "onDestroyView", "showAppReview", "showPriceSelectYear", "getLogPageName", "getDefaultYear", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "initBottomBar", "hasAddToCollection", "collectionItem", "Lcom/glority/android/database/entities/CollectionItem;", "showEditToast", "addCollectionFrom", "setCustomExtraJsInjectVariable", "", "", "updateGrade", "grade", "updateCollectedState", "availableJsMethod", "Lcom/glority/base/widget/webview/AbsJsMethod;", "notifyMyOfficialsetChanged", "onChangeResultClick", "openChangeNameConfirmDialog", "indexModel", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "onConfirm", "getCmsNameByUid", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class RecognizeCmsDetailFragment extends BaseCmsDetailFragment<FragmentCustomDetailBinding> {
    public static final int $stable = 8;
    private CmsDetailBottomBar1Binding bottomView;
    private Long chatbotSessionId;
    private boolean collectionCreated;
    private boolean h5Initialized;
    private boolean isCollected;
    private Integer lastCollectionId = -1;
    private String recognizeYear;
    private UserSeriesListItem userSeriesListItem;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyMyOfficialsetChanged$lambda$7(String str) {
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public boolean showPriceSelectYear() {
        return true;
    }

    public RecognizeCmsDetailFragment() {
        final RecognizeCmsDetailFragment recognizeCmsDetailFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(recognizeCmsDetailFragment, Reflection.getOrCreateKotlinClass(IdentificationResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = recognizeCmsDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ FragmentCustomDetailBinding access$getBinding(RecognizeCmsDetailFragment recognizeCmsDetailFragment) {
        return (FragmentCustomDetailBinding) recognizeCmsDetailFragment.getBinding();
    }

    public final IdentificationResultViewModel getVm() {
        return (IdentificationResultViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        String str;
        String logPageName;
        Pair<String, ? extends Object>[] pairArr = new Pair[3];
        Long l = (Long) CollectionsKt.firstOrNull((List) getVm().getItemIds());
        pairArr[0] = new Pair<>(LogEventArguments.ARG_STRING_1, String.valueOf(l != null ? l.longValue() : 0L));
        CmsName value = getVm().getCurrentCmsName().getValue();
        if (value == null || (str = value.getUid()) == null) {
            str = "";
        }
        pairArr[1] = new Pair<>(LogEventArguments.ARG_STRING_2, str);
        Bundle arguments = getArguments();
        if (arguments == null || (logPageName = arguments.getString("from")) == null) {
            logPageName = getLogPageName();
        }
        pairArr[2] = TuplesKt.to("from", logPageName);
        updateCommonEventArgs(pairArr);
        super.doCreateView(savedInstanceState);
        updatePageData(getVm().getYear(), getVm().getSpeciesUid(), getVm().getVarietyUid());
        this.recognizeYear = getVm().getYear();
        ChatbotView chatbotView = ((FragmentCustomDetailBinding) getBinding()).chatbotView;
        Intrinsics.checkNotNullExpressionValue(chatbotView, "chatbotView");
        ViewExtensionsKt.setSingleClickListener$default(chatbotView, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$doCreateView$1
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
                Long l2;
                TaxonomyName name;
                Intrinsics.checkNotNullParameter(it, "it");
                RecognizeCmsDetailFragment.this.logEvent(LogEvents.chatbot_entry_click, BundleKt.bundleOf(TuplesKt.to("from", ChatbotActivity.SESSIONTYPE_IDENTIFY_RESULT)));
                ChatbotActivity.Companion companion = ChatbotActivity.Companion;
                RecognizeCmsDetailFragment recognizeCmsDetailFragment = RecognizeCmsDetailFragment.this;
                RecognizeCmsDetailFragment recognizeCmsDetailFragment2 = recognizeCmsDetailFragment;
                l2 = recognizeCmsDetailFragment.chatbotSessionId;
                List<Long> itemIds = RecognizeCmsDetailFragment.this.getVm().getItemIds();
                CmsName value2 = RecognizeCmsDetailFragment.this.getVm().getCurrentCmsName().getValue();
                String str2 = null;
                String uid = value2 != null ? value2.getUid() : null;
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = TuplesKt.to(Args.year, RecognizeCmsDetailFragment.this.getRecognizeYear());
                CmsName value3 = RecognizeCmsDetailFragment.this.getVm().getCurrentCmsName().getValue();
                if (value3 != null && (name = value3.getName()) != null) {
                    str2 = name.getPreferredName();
                }
                pairArr2[1] = TuplesKt.to("commonName", str2);
                companion.open(recognizeCmsDetailFragment2, l2, ChatbotActivity.SESSIONTYPE_IDENTIFY_RESULT, "item", itemIds, uid, MapsKt.mapOf(pairArr2));
            }
        }, 1, (Object) null);
        ((FragmentCustomDetailBinding) getBinding()).ivClose.setImageResource(R.drawable.icon_back_black);
        if (CoinAbTestUtils.INSTANCE.enableV4H5()) {
            ImageView ivClose = ((FragmentCustomDetailBinding) getBinding()).ivClose;
            Intrinsics.checkNotNullExpressionValue(ivClose, "ivClose");
            ImageViewDataBindingKt.setImageTint(ivClose, -1);
        } else {
            ImageView ivClose2 = ((FragmentCustomDetailBinding) getBinding()).ivClose;
            Intrinsics.checkNotNullExpressionValue(ivClose2, "ivClose");
            ImageViewDataBindingKt.setImageTint(ivClose2, ViewCompat.MEASURED_STATE_MASK);
        }
        ((FragmentCustomDetailBinding) getBinding()).ivShare.setImageResource(R.drawable.icon_share_black);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void onScrollListener(View v, int scrollY, int oldScrollY, int scrollState) {
        Intrinsics.checkNotNullParameter(v, "v");
        super.onScrollListener(v, scrollY, oldScrollY, scrollState);
        if (scrollState == 0) {
            ((FragmentCustomDetailBinding) getBinding()).chatbotView.show();
            return;
        }
        if (scrollState == 1 || scrollState == 2) {
            ((FragmentCustomDetailBinding) getBinding()).chatbotView.hide();
            View root = ((FragmentCustomDetailBinding) getBinding()).addCollectionNoticeLl.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(8);
        }
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void openCamera(BaseJsMethod baseJsMethod, String scene) {
        Intrinsics.checkNotNullParameter(baseJsMethod, "baseJsMethod");
        if (!Intrinsics.areEqual(scene, "grade")) {
            super.openCamera(baseJsMethod, scene);
            return;
        }
        List<File> userOriginalImages = getVm().getUserOriginalImages();
        if (userOriginalImages.isEmpty()) {
            super.openCamera(baseJsMethod, scene);
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof RuntimePermissionActivity) {
            CoreActivity.INSTANCE.openGrading((RuntimePermissionActivity) activity, new GradingRecognizeProcess(userOriginalImages), baseJsMethod.getPageName(), (r17 & 8) != 0 ? 2 : 0, (r17 & 16) != 0, (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
        } else {
            super.openCamera(baseJsMethod, scene);
        }
    }

    private final void identify(Function0<Unit> callback) {
        String preferredName;
        CmsName value = getVm().getCurrentCmsName().getValue();
        if (value != null) {
            CmsRepository cmsRepository = CmsRepository.INSTANCE;
            List<Long> itemIds = getVm().getItemIds();
            String uid = value.getUid();
            List<String> commonNames = value.getName().getCommonNames();
            if (commonNames == null || (preferredName = (String) CollectionsKt.firstOrNull((List) commonNames)) == null) {
                preferredName = value.getName().getPreferredName();
            }
            cmsRepository.changeItemCmsNameMessage(itemIds, uid, preferredName);
            callback.invoke();
            return;
        }
        callback.invoke();
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void updateCmsUi(CmsName cmsName, String displayName, Drawable holderDrawable, String subjectSideUrl, String denominationSideUrl, List<String> userImages) {
        GlobalLiveBus.INSTANCE.setCurrentRecognizeImageUrl(getVm().getMergeImage());
        super.updateCmsUi(cmsName, displayName, holderDrawable, subjectSideUrl, denominationSideUrl, getVm().getDisplayImage());
        if (cmsName != null) {
            reportOneUidMoreYear(cmsName.getUid());
        }
    }

    private final void reportOneUidMoreYear(String uid) {
        if (((Boolean) PersistData.INSTANCE.get("reportOneUidMoreYear", false)).booleanValue()) {
            return;
        }
        DBManager.INSTANCE.getRecognizeHistoryItemDao().getAllByUid(uid).observe(this, new RecognizeCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends RecognizeHistoryItem>, Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$reportOneUidMoreYear$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends RecognizeHistoryItem> list) {
                invoke2((List<RecognizeHistoryItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<RecognizeHistoryItem> list) {
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    List<RecognizeHistoryItem> list2 = list;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RecognizeHistoryItem) it.next()).getYear());
                    }
                    if (CollectionsKt.toSet(arrayList).size() < 2 || System.currentTimeMillis() - ((RecognizeHistoryItem) CollectionsKt.last((List) list)).getDate().getTime() >= 2592000000L) {
                        return;
                    }
                    new SendTrackEventRequest("AJ_serieslevel", null, null, null, 14, null).post();
                    PersistData.INSTANCE.get("reportOneUidMoreYear", true);
                }
            }
        }));
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initData() {
        getVm().getCurrentCmsName().observe(this, new Observer<CmsName>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$initData$1
            private Job cmsNameChangeJob;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                CompletableJob Job$default;
                Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
                this.cmsNameChangeJob = Job$default;
            }

            @Override // androidx.lifecycle.Observer
            public void onChanged(CmsName value) {
                Job launch$default;
                Intrinsics.checkNotNullParameter(value, "value");
                Job.DefaultImpls.cancel$default(this.cmsNameChangeJob, (CancellationException) null, 1, (Object) null);
                launch$default = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(RecognizeCmsDetailFragment.this), null, null, new RecognizeCmsDetailFragment$initData$1$onChanged$1(RecognizeCmsDetailFragment.this, value, null), 3, null);
                this.cmsNameChangeJob = launch$default;
            }
        });
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public CollectionDetailEditDialogFragment addCollection(String from) {
        String str;
        Long itemId = getItemId();
        if (itemId != null) {
            getVm().getAddCollectionFromMap().put(Long.valueOf(itemId.longValue()), from);
        }
        BaseCmsDetailFragment.logEventAddPrefix$default(this, LogEvents.addcollection_click, null, 2, null);
        String tagValue = CmsDataUtils.INSTANCE.getTagValue(getCmsName(), "PreferredSeries");
        GradingLevelScaleConvertor.ScaleType defaultScaleType = GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode());
        GradeItem gradeConvertShortName = GradingLevelScaleConvertor.INSTANCE.gradeConvertShortName(getVm().getGrade(), defaultScaleType);
        GradeItem gradeConvertLongName = gradeConvertShortName == null ? GradingLevelScaleConvertor.INSTANCE.gradeConvertLongName(getVm().getGrade(), defaultScaleType) : gradeConvertShortName;
        CollectionDetailEditDialogFragment.Companion companion = CollectionDetailEditDialogFragment.INSTANCE;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Long itemId2 = getItemId();
        CmsName cmsName = getCmsName();
        if (cmsName == null || (str = cmsName.getUid()) == null) {
            str = "";
        }
        return companion.createOpen(supportFragmentManager, itemId2, str, getYear(), getUserImage(), 0, getLogPageName(), getCmsName(), tagValue, getVm().getDenominationSideUrl(), getVm().getSubjectSideUrl(), getSpeciesUid(), getVarietyUid(), gradeConvertLongName);
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Long getItemId() {
        return (Long) CollectionsKt.firstOrNull((List) getVm().getItemIds());
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void retake() {
        identify(new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$retake$1
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
                super/*com.glority.android.picturexx.view.BaseCmsDetailFragment*/.retake();
            }
        });
    }

    @Override // com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        showAppReview();
    }

    private final void showAppReview() {
        try {
            int intValue = ((Number) PersistData.INSTANCE.get(Constants.recognizeCount, 0)).intValue();
            Pair<Boolean, Double> showInAppReview = AbTestUtil.INSTANCE.showInAppReview();
            List<CmsName> value = getVm().getIdentificationResultLiveData().getValue();
            int indexOf = value != null ? CollectionsKt.indexOf((List<? extends CmsName>) value, getVm().getCurrentCmsName().getValue()) : -1;
            if (indexOf > -1) {
                double doubleValue = getVm().getIdentificationProbabilities().get(indexOf).doubleValue();
                if (intValue >= 2 && showInAppReview.getFirst().booleanValue() && doubleValue >= showInAppReview.getSecond().doubleValue()) {
                    GlobalLiveBus.INSTANCE.getShowInAppReviewTab().setValue(Double.valueOf(doubleValue));
                }
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        return LogEvents.result;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    /* renamed from: getDefaultYear, reason: from getter */
    public String getRecognizeYear() {
        return this.recognizeYear;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 33 && resultCode == -1) {
            Long valueOf = data != null ? Long.valueOf(data.getLongExtra(Args.sessionId, -1L)) : null;
            if (valueOf != null && valueOf.longValue() == -1) {
                this.chatbotSessionId = null;
            } else {
                this.chatbotSessionId = valueOf;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initBottomBar(boolean r9, final com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r10, final com.glority.android.database.entities.CollectionItem r11) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment.initBottomBar(boolean, com.glority.component.generatedAPI.kotlinAPI.cms.CmsName, com.glority.android.database.entities.CollectionItem):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomBar$lambda$3(RecognizeCmsDetailFragment this$0, CmsDetailBottomBar1Binding bottomBar1, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bottomBar1, "$bottomBar1");
        if (this$0.getWishItem() != null) {
            ImageView wishIv = bottomBar1.wishIv;
            Intrinsics.checkNotNullExpressionValue(wishIv, "wishIv");
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this$0.removeWish(wishIv, context, R.drawable.icon_unwish_circle);
            return;
        }
        ImageView wishIv2 = bottomBar1.wishIv;
        Intrinsics.checkNotNullExpressionValue(wishIv2, "wishIv");
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this$0.addWish(wishIv2, context2, R.drawable.icon_wished_cicle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomBar$lambda$4(RecognizeCmsDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.retake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBottomBar$lambda$5(RecognizeCmsDetailFragment this$0, CmsDetailBottomBar1Binding bottomBar1) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bottomBar1, "$bottomBar1");
        if (this$0.isDetached()) {
            return;
        }
        MaterialButton addBt = bottomBar1.addBt;
        Intrinsics.checkNotNullExpressionValue(addBt, "addBt");
        addBt.setVisibility(0);
    }

    private final void showEditToast(CollectionItem collectionItem, String addCollectionFrom, CmsName cmsName) {
        if (this.collectionCreated) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new RecognizeCmsDetailFragment$showEditToast$1(collectionItem, addCollectionFrom, this, cmsName, null), 2, null);
        }
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Map<String, Object> setCustomExtraJsInjectVariable() {
        Map<String, Object> mutableMapOf;
        if (CoinAbTestUtils.INSTANCE.enableValueChecker()) {
            mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(Args.varietyUid, getVm().getVarietyUid()), TuplesKt.to(Args.speciesUid, getVm().getSpeciesUid()), TuplesKt.to("grade", getVm().getGrade()), TuplesKt.to("gradeScale", MapsKt.mapOf(TuplesKt.to("currentScale", GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()).getType()), TuplesKt.to("scaleMap", GradingLevelScaleConvertor.INSTANCE.getScaleTypes()))));
        } else {
            ValueCheckUiEntity valueCheckUiEntity = getVm().getValueCheckUiEntity();
            Pair[] pairArr = new Pair[5];
            pairArr[0] = TuplesKt.to(Args.varietyUid, valueCheckUiEntity != null ? valueCheckUiEntity.getSelectedVarietyUid() : null);
            pairArr[1] = TuplesKt.to(Args.speciesUid, valueCheckUiEntity != null ? valueCheckUiEntity.getSelectedSpeciesUid() : null);
            pairArr[2] = TuplesKt.to("grade", getVm().getGrade());
            pairArr[3] = TuplesKt.to("gradeScale", MapsKt.mapOf(TuplesKt.to("currentScale", GradingLevelScaleConvertor.INSTANCE.getDefaultScaleType(AppViewModel.INSTANCE.getInstance().getCountryCode()).getType()), TuplesKt.to("scaleMap", GradingLevelScaleConvertor.INSTANCE.getScaleTypes())));
            pairArr[4] = TuplesKt.to("showPriceInputs", true);
            mutableMapOf = MapsKt.mutableMapOf(pairArr);
        }
        if (CoinAbTestUtils.INSTANCE.enableV4H5()) {
            mutableMapOf.putAll(getH5MyOfficialSet(getCmsName(), this.userSeriesListItem, this.isCollected));
        }
        mutableMapOf.put("canChangeResult", Boolean.valueOf(CoinAbTestUtils.INSTANCE.enableV4H5()));
        mutableMapOf.put("showGradingEntry", true);
        return mutableMapOf;
    }

    public final void updateGrade(String grade) {
        JsbWebView webView;
        JsbWebView webView2;
        getVm().setGrade(grade);
        WebViewItemView webViewItem = getWebViewItem();
        if (webViewItem != null && (webView2 = webViewItem.getWebView()) != null) {
            webView2.setInjectStartupParams(getInjectJsVariableData());
        }
        WebViewItemView webViewItem2 = getWebViewItem();
        if (webViewItem2 == null || (webView = webViewItem2.getWebView()) == null) {
            return;
        }
        webView.rejectStartupParams();
    }

    public final void updateCollectedState() {
        JsbWebView webView;
        JsbWebView webView2;
        WebViewItemView webViewItem = getWebViewItem();
        if (webViewItem != null && (webView2 = webViewItem.getWebView()) != null) {
            webView2.setInjectStartupParams(getInjectJsVariableData());
        }
        WebViewItemView webViewItem2 = getWebViewItem();
        if (webViewItem2 != null && (webView = webViewItem2.getWebView()) != null) {
            webView.rejectStartupParams();
        }
        notifyMyOfficialsetChanged();
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public List<AbsJsMethod> availableJsMethod() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        return CollectionsKt.listOf(new RecognizeDetailJsMethod(this, (RuntimePermissionActivity) requireActivity, getLogPageName()));
    }

    private final void notifyMyOfficialsetChanged() {
        JsbWebView webView;
        WebViewItemView webViewItem = getWebViewItem();
        if (webViewItem == null || (webView = webViewItem.getWebView()) == null) {
            return;
        }
        webView.evaluateJavascript("(function() { window.dispatchEvent(new Event('officialsetDataChange')); })()", new ValueCallback() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$$ExternalSyntheticLambda0
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                RecognizeCmsDetailFragment.notifyMyOfficialsetChanged$lambda$7((String) obj);
            }
        });
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void onChangeResultClick() {
        CmsName value;
        String uid;
        ArrayList emptyList;
        super.onChangeResultClick();
        if (!isAdded() || (value = getVm().getCurrentCmsName().getValue()) == null || (uid = value.getUid()) == null) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        CoinCorrectResultDialogFragment.OnSearchResultClick onSearchResultClick = new CoinCorrectResultDialogFragment.OnSearchResultClick() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$onChangeResultClick$callback$1
            @Override // com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.OnSearchResultClick
            public void onClick(final DialogFragment dialogFragment, final IndexModel indexModel) {
                Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
                Intrinsics.checkNotNullParameter(indexModel, "indexModel");
                RecognizeCmsDetailFragment recognizeCmsDetailFragment = RecognizeCmsDetailFragment.this;
                final RecognizeCmsDetailFragment recognizeCmsDetailFragment2 = RecognizeCmsDetailFragment.this;
                recognizeCmsDetailFragment.openChangeNameConfirmDialog(indexModel, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$onChangeResultClick$callback$1$onClick$1
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

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: RecognizeCmsDetailFragment.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                    @DebugMetadata(c = "com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$onChangeResultClick$callback$1$onClick$1$1", f = "RecognizeCmsDetailFragment.kt", i = {}, l = {563}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$onChangeResultClick$callback$1$onClick$1$1, reason: invalid class name */
                    /* loaded from: classes5.dex */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ DialogFragment $dialogFragment;
                        final /* synthetic */ IndexModel $indexModel;
                        int label;
                        final /* synthetic */ RecognizeCmsDetailFragment this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(RecognizeCmsDetailFragment recognizeCmsDetailFragment, IndexModel indexModel, DialogFragment dialogFragment, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.this$0 = recognizeCmsDetailFragment;
                            this.$indexModel = indexModel;
                            this.$dialogFragment = dialogFragment;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.this$0, this.$indexModel, this.$dialogFragment, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                obj = this.this$0.getCmsNameByUid(this.$indexModel.getUid(), this);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            CmsName cmsName = (CmsName) obj;
                            if (cmsName == null) {
                                this.this$0.hideProgress();
                                ToastUtils.showError(R.string.error_text_internal_error, new Object[0]);
                                return Unit.INSTANCE;
                            }
                            this.this$0.hideProgress();
                            ToastUtils.showSuccess(R.string.search_suggest_text_thanks_identification, new Object[0]);
                            this.$dialogFragment.dismissAllowingStateLoss();
                            this.this$0.getVm().getCurrentCmsName().setValue(cmsName);
                            this.this$0.getVm().getIdentificationResultLiveData().setValue(CollectionsKt.listOf(cmsName));
                            return Unit.INSTANCE;
                        }
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseFragment.showProgress$default(RecognizeCmsDetailFragment.this, null, false, 3, null);
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(RecognizeCmsDetailFragment.this), null, null, new AnonymousClass1(RecognizeCmsDetailFragment.this, indexModel, dialogFragment, null), 3, null);
                    }
                });
            }

            @Override // com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.OnSearchResultClick
            public void onClose(DialogFragment dialogFragment) {
                Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
                dialogFragment.dismissAllowingStateLoss();
            }

            @Override // com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.OnSearchResultClick
            public void onSuggest(DialogFragment dialogFragment, String coinName, String coinYear) {
                Intrinsics.checkNotNullParameter(dialogFragment, "dialogFragment");
                Intrinsics.checkNotNullParameter(coinName, "coinName");
                Intrinsics.checkNotNullParameter(coinYear, "coinYear");
                ToastUtils.showSuccess(R.string.search_suggest_text_thanks_identification, new Object[0]);
                dialogFragment.dismissAllowingStateLoss();
            }
        };
        List<CmsName> value2 = getVm().getIdentificationResultLiveData().getValue();
        if (value2 == null) {
            emptyList = CollectionsKt.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : value2) {
                if (!Intrinsics.areEqual(((CmsName) obj).getUid(), uid)) {
                    arrayList.add(obj);
                }
            }
            emptyList = arrayList;
        }
        CoinCorrectResultDialogFragment.INSTANCE.show(emptyList, supportFragmentManager, onSearchResultClick);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openChangeNameConfirmDialog(IndexModel indexModel, Function0<Unit> onConfirm) {
        Context context;
        String latinName;
        if (isAdded() && (context = getContext()) != null) {
            ConfirmDeleteDialog confirmDeleteDialog = ConfirmDeleteDialog.INSTANCE;
            List<String> commonNames = indexModel.getCommonNames();
            if (commonNames == null || (latinName = (String) CollectionsKt.firstOrNull((List) commonNames)) == null) {
                latinName = indexModel.getLatinName();
            }
            confirmDeleteDialog.openChangeResultConfirmDialog(context, latinName, onConfirm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getCmsNameByUid(java.lang.String r6, kotlin.coroutines.Continuation<? super com.glority.component.generatedAPI.kotlinAPI.cms.CmsName> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$1 r0 = (com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$1 r0 = new com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.ResultKt.throwOnFailure(r7)
            goto L60
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = kotlin.text.StringsKt.trim(r6)
            java.lang.String r6 = r6.toString()
            r7 = r6
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 != 0) goto L4a
            return r4
        L4a:
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$res$1 r2 = new com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment$getCmsNameByUid$res$1
            r2.<init>(r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            com.glority.network.model.Resource r7 = (com.glority.network.model.Resource) r7
            com.glority.network.model.Status r6 = r7.getStatus()
            com.glority.network.model.Status r0 = com.glority.network.model.Status.SUCCESS
            if (r6 != r0) goto L76
            java.lang.Object r6 = r7.getData()
            com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage r6 = (com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage) r6
            if (r6 == 0) goto L76
            com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r4 = r6.getCmsName()
        L76:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.recognize.RecognizeCmsDetailFragment.getCmsNameByUid(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
