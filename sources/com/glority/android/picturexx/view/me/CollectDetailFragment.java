package com.glority.android.picturexx.view.me;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.share.SharePlatform;
import com.glority.android.core.route.share.ShareRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCollectDetailBinding;
import com.glority.android.picturexx.extensions.CollectionItemExtKt;
import com.glority.android.picturexx.js.method.CollectionJsMethod;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.splash.SplashGlobalLiveData;
import com.glority.android.picturexx.utils.RatingUtils;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.entity.OnActivityResultEntity;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.base.widget.webview.AbsJsMethod;
import com.glority.base.widget.webview.JsbWebView;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.GlProgressDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CollectDetailFragment.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001cH\u0002J\b\u0010\u001d\u001a\u00020\bH\u0016J\b\u0010\u001e\u001a\u00020\u0015H\u0016J\r\u0010\u001f\u001a\u00020 H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0006H\u0014J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020$H\u0016J\b\u0010&\u001a\u00020\bH\u0014J\u0016\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010)0(H\u0016J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0016J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020$H\u0016J\u0010\u00100\u001a\u00020\u00152\u0006\u00101\u001a\u000202H\u0002J\u0018\u00103\u001a\u00020\u00152\u0006\u00104\u001a\u00020\b2\b\u00105\u001a\u0004\u0018\u000106J\u0006\u00107\u001a\u00020\u0015J\u0006\u00108\u001a\u00020\u0015J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020:H\u0002J\u0010\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020:H\u0002J\b\u0010>\u001a\u00020\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006?"}, d2 = {"Lcom/glority/android/picturexx/view/me/CollectDetailFragment;", "Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCollectDetailBinding;", "<init>", "()V", "showedDownloadConversionPage", "", "REQUEST_BILLING", "", "vm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "vm$delegate", "Lkotlin/Lazy;", "meViewModel", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getMeViewModel", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "meViewModel$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showDeleteDialog", "context", "Landroid/content/Context;", FirebaseAnalytics.Param.METHOD, "Lkotlin/Function0;", "cmsViewMarginTop", "initData", "getItemId", "", "()Ljava/lang/Long;", "getLogPageName", "visibleToolBar", "", "showJoinReddit", "getLayoutId", "setCustomExtraJsInjectVariable", "", "", "availableJsMethod", "", "Lcom/glority/base/widget/webview/AbsJsMethod;", "initToolBar", "visible", "visibleShare", "clickMore", "view", "Landroid/view/View;", "editCollection", "collectionId", "methodCallback", "Lcom/glority/base/widget/webview/JsbWebView$MethodCallback;", FirebaseAnalytics.Event.SHARE, "download", "drawDownloadBitmap", "Landroid/graphics/Bitmap;", "coinBitmap", "calculateAverageColor", "bitmap", "initObserver", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CollectDetailFragment extends BaseCmsDetailFragment<FragmentCollectDetailBinding> {
    public static final int $stable = 8;

    /* renamed from: meViewModel$delegate, reason: from kotlin metadata */
    private final Lazy meViewModel;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private final String showedDownloadConversionPage = "showedDownloadConversionPage";
    private final int REQUEST_BILLING = 2001;

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public boolean showJoinReddit() {
        return false;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public boolean visibleToolBar() {
        return true;
    }

    public CollectDetailFragment() {
        final CollectDetailFragment collectDetailFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(collectDetailFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = collectDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.meViewModel = FragmentViewModelLazyKt.createViewModelLazy(collectDetailFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = collectDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectionViewModel getVm() {
        return (CollectionViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeViewModel getMeViewModel() {
        return (MeViewModel) this.meViewModel.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments != null) {
            getVm().setPageFrom(arguments.getString("from", ""));
            getVm().setItemId(arguments.getLong(Args.itemId));
            getVm().setUid1(arguments.getString(Args.uid, null));
        }
        updateCommonEventArgs(new Pair("from", getVm().getPageFrom()), new Pair(LogEventArguments.ARG_STRING_1, Long.valueOf(getVm().getItemId())), new Pair(LogEventArguments.ARG_STRING_2, getVm().getUid1()));
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        CollectDetailFragment collectDetailFragment = this;
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, collectDetailFragment, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$onCreate$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
                invoke2(onBackPressedCallback);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnBackPressedCallback addCallback) {
                Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
                addCallback.setEnabled(false);
                final FragmentActivity activity = CollectDetailFragment.this.getActivity();
                if (activity != null) {
                    if (RatingUtils.canShow$default(RatingUtils.INSTANCE, "collection", null, 2, null)) {
                        RatingUtils.INSTANCE.show(activity, "collection", new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$onCreate$2$1$1
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
                                try {
                                    FragmentActivity.this.onBackPressed();
                                    Unit unit = Unit.INSTANCE;
                                } catch (Exception e) {
                                    if (AppContext.INSTANCE.isDebugMode()) {
                                        LogUtils.e(Log.getStackTraceString(e));
                                    }
                                }
                            }
                        });
                        return;
                    }
                    try {
                        activity.onBackPressed();
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }
        }, 2, null);
        DBManager.INSTANCE.getCollectionItemDao().getItem(getVm().getCollectionId()).observe(collectDetailFragment, new CollectDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$onCreate$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CollectionItem collectionItem) {
                invoke2(collectionItem);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CollectionItem collectionItem) {
                CollectionViewModel vm;
                if (collectionItem != null) {
                    vm = CollectDetailFragment.this.getVm();
                    vm.setCurrentItem(collectionItem);
                }
            }
        }));
    }

    private final void showDeleteDialog(Context context, Function0<Unit> method) {
        if (Intrinsics.areEqual(getVm().getPageFrom(), LogEvents.multicoin)) {
            ConfirmDeleteDialog.INSTANCE.openFromSeries(context, method);
        } else {
            ConfirmDeleteDialog.INSTANCE.openFromCollection(context, method);
        }
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public int cmsViewMarginTop() {
        int dimensionPixelSize;
        if (!CoinAbTestUtils.INSTANCE.enableV4H5()) {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.x110);
        } else {
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.x150);
        }
        return dimensionPixelSize * (-1);
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initData() {
        RatingUtils.INSTANCE.recordPageCount("collection");
        CmsRepository.INSTANCE.getCmsName(getVm().getUid1(), AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()).observe(this, new CollectDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetCmsNameMessage> resource) {
                invoke2((Resource<GetCmsNameMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<GetCmsNameMessage> resource) {
                CollectionViewModel vm;
                CollectionViewModel vm2;
                if (resource.getStatus() == Status.SUCCESS) {
                    GetCmsNameMessage data = resource.getData();
                    CmsName cmsName = data != null ? data.getCmsName() : null;
                    CollectDetailFragment.this.getCmsView().removeAllViews();
                    if (cmsName != null) {
                        CollectDetailFragment collectDetailFragment = CollectDetailFragment.this;
                        CollectDetailFragment collectDetailFragment2 = collectDetailFragment;
                        vm = collectDetailFragment.getVm();
                        CollectionItem currentItem = vm.getCurrentItem();
                        String subjectSideUrl = currentItem != null ? currentItem.getSubjectSideUrl() : null;
                        vm2 = CollectDetailFragment.this.getVm();
                        CollectionItem currentItem2 = vm2.getCurrentItem();
                        BaseCmsDetailFragment.updateCmsUi$default(collectDetailFragment2, cmsName, null, null, subjectSideUrl, currentItem2 != null ? currentItem2.getDenominationSideUrl() : null, null, 38, null);
                        return;
                    }
                    return;
                }
                if (resource.getStatus() == Status.ERROR) {
                    try {
                        Boolean.valueOf(FragmentKt.findNavController(CollectDetailFragment.this).popBackStack());
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }
        }));
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Long getItemId() {
        Long itemId;
        CollectionItem currentItem = getVm().getCurrentItem();
        return Long.valueOf((currentItem == null || (itemId = currentItem.getItemId()) == null) ? getVm().getItemId() : itemId.longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        return LogEvents.collectiondetail;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_collect_detail;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Map<String, Object> setCustomExtraJsInjectVariable() {
        String defaultYear;
        Pair[] pairArr = new Pair[4];
        CollectionItem currentItem = getVm().getCurrentItem();
        pairArr[0] = TuplesKt.to(Args.varietyUid, currentItem != null ? currentItem.getVarietyUid() : null);
        CollectionItem currentItem2 = getVm().getCurrentItem();
        pairArr[1] = TuplesKt.to(Args.speciesUid, currentItem2 != null ? currentItem2.getSpeciesUid() : null);
        CollectionItem currentItem3 = getVm().getCurrentItem();
        pairArr[2] = TuplesKt.to("collection", currentItem3 != null ? CollectionItemExtKt.toJsJson(currentItem3) : null);
        CollectionItem currentItem4 = getVm().getCurrentItem();
        if (currentItem4 == null || (defaultYear = currentItem4.getYear()) == null) {
            defaultYear = getRecognizeYear();
        }
        pairArr[3] = TuplesKt.to(Args.year, defaultYear);
        return MapsKt.mutableMapOf(pairArr);
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public List<AbsJsMethod> availableJsMethod() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
        return CollectionsKt.mutableListOf(new CollectionJsMethod(this, (RuntimePermissionActivity) requireActivity, getLogPageName()));
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initToolBar(boolean visible, boolean visibleShare) {
        super.initToolBar(visible, visibleShare);
        ImageView imageView = (ImageView) requireView().findViewById(R.id.iv_share);
        ImageView imageView2 = (ImageView) getAppBarLayout().findViewById(R.id.iv_share2);
        Intrinsics.checkNotNull(imageView2);
        imageView2.setVisibility(0);
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectDetailFragment.initToolBar$lambda$2(CollectDetailFragment.this, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CollectDetailFragment.initToolBar$lambda$3(CollectDetailFragment.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolBar$lambda$2(CollectDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.clickMore(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initToolBar$lambda$3(CollectDetailFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNull(view);
        this$0.clickMore(view);
    }

    private final void clickMore(final View view) {
        BaseFragment.logEvent$default(this, LogEvents.collection_more_click, null, 2, null);
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenuInflater().inflate(R.menu.item_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$$ExternalSyntheticLambda0
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean clickMore$lambda$5;
                clickMore$lambda$5 = CollectDetailFragment.clickMore$lambda$5(CollectDetailFragment.this, view, menuItem);
                return clickMore$lambda$5;
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clickMore$lambda$5(final CollectDetailFragment this$0, View view, MenuItem menuItem) {
        Integer collectionId;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(view, "$view");
        if (menuItem.getItemId() == R.id.option_delete) {
            BaseFragment.logEvent$default(this$0, LogEvents.collectionlist_delete_click, null, 2, null);
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this$0.showDeleteDialog(context, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$clickMore$1$1
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
                    MeViewModel meViewModel;
                    CollectionViewModel vm;
                    BaseFragment.showProgress$default(CollectDetailFragment.this, null, false, 3, null);
                    meViewModel = CollectDetailFragment.this.getMeViewModel();
                    vm = CollectDetailFragment.this.getVm();
                    LiveData<Status> deleteCollectionItem = meViewModel.deleteCollectionItem(vm.getCollectionId());
                    CollectDetailFragment collectDetailFragment = CollectDetailFragment.this;
                    final CollectDetailFragment collectDetailFragment2 = CollectDetailFragment.this;
                    deleteCollectionItem.observe(collectDetailFragment, new CollectDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$clickMore$1$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Status status) {
                            invoke2(status);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Status status) {
                            CollectDetailFragment.this.hideProgress();
                            if (status == Status.SUCCESS) {
                                FragmentActivity activity = CollectDetailFragment.this.getActivity();
                                if (activity != null) {
                                    activity.onBackPressed();
                                    return;
                                }
                                return;
                            }
                            ToastUtils.showError(R.string.text_failed, new Object[0]);
                        }
                    }));
                }
            });
            return true;
        }
        if (menuItem.getItemId() != R.id.option_edit) {
            return true;
        }
        CollectionItem currentItem = this$0.getVm().getCurrentItem();
        Collection collection = currentItem != null ? currentItem.toCollection() : null;
        BaseFragment.logEvent$default(this$0, LogEvents.collection_listitemedit_click, null, 2, null);
        if (collection == null || (collectionId = collection.getCollectionId()) == null) {
            return true;
        }
        this$0.editCollection(collectionId.intValue(), null);
        return true;
    }

    public final void editCollection(int collectionId, JsbWebView.MethodCallback methodCallback) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new CollectDetailFragment$editCollection$1(collectionId, this, methodCallback, null), 3, null);
    }

    public final void share() {
        new ShareRequest(SharePlatform.MORE, null, null, 6, null).post();
    }

    public final void download() {
        Dialog dialog;
        if (AppViewModel.INSTANCE.isVip() || ((Boolean) PersistData.INSTANCE.get(this.showedDownloadConversionPage, false)).booleanValue()) {
            if (getContext() != null) {
                GlProgressDialog glProgressDialog = GlProgressDialog.INSTANCE;
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                dialog = GlProgressDialog.show$default(glProgressDialog, requireContext, true, (String) null, 0L, 12, (Object) null);
            } else {
                dialog = null;
            }
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new CollectDetailFragment$download$1(this, dialog, null), 2, null);
            return;
        }
        PersistData.INSTANCE.set(this.showedDownloadConversionPage, true);
        if (AppViewModel.INSTANCE.getInstance().isVipInHistory()) {
            new OpenBillingActivityRequest(getLogPageName(), "100032", Integer.valueOf(this.REQUEST_BILLING)).post();
        } else {
            new OpenBillingActivityRequest(getLogPageName(), "100031", Integer.valueOf(this.REQUEST_BILLING)).post();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap drawDownloadBitmap(Bitmap coinBitmap) {
        int width = (int) (coinBitmap.getWidth() * 1.415d);
        int height = (int) (coinBitmap.getHeight() * 1.8d);
        float f = width;
        float f2 = height;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(calculateAverageColor(coinBitmap));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(coinBitmap, 0.147f * f, 0.143f * f2, paint);
        if (!AppViewModel.INSTANCE.isVip()) {
            canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.icon_export_logo), (Rect) null, new RectF(0.28f * f, 0.77f * f2, f * 0.72f, f2 * 0.8568f), paint);
        }
        return createBitmap;
    }

    private final int calculateAverageColor(Bitmap bitmap) {
        int width = bitmap.getWidth() * bitmap.getHeight();
        int[] iArr = new int[width];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < width; i4++) {
            int i5 = iArr[i4];
            i += Color.red(i5);
            i2 += Color.green(i5);
            i3 += Color.blue(i5);
        }
        return Color.rgb(i / width, i2 / width, i3 / width);
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initObserver() {
        super.initObserver();
        SplashGlobalLiveData.INSTANCE.getOnMainActivityResult().observe(this, new CollectDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<OnActivityResultEntity, Unit>() { // from class: com.glority.android.picturexx.view.me.CollectDetailFragment$initObserver$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(OnActivityResultEntity onActivityResultEntity) {
                invoke2(onActivityResultEntity);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(OnActivityResultEntity it) {
                int i;
                Intrinsics.checkNotNullParameter(it, "it");
                int requestCode = it.getRequestCode();
                i = CollectDetailFragment.this.REQUEST_BILLING;
                if (requestCode == i) {
                    CollectDetailFragment.this.download();
                }
            }
        }));
    }
}
