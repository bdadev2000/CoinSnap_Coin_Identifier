package com.glority.android.picturexx.view.me;

import android.os.Bundle;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.business.databinding.FragmentCustomDetailBinding;
import com.glority.android.picturexx.utils.ItemDetailUtils;
import com.glority.android.picturexx.utils.PropertiesItemUtils;
import com.glority.android.picturexx.utils.RatingUtils;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.DetailViewModel;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.ui.base.v2.BaseFragment;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.component.generatedAPI.kotlinAPI.item.GetItemDetailMessage;
import com.glority.component.generatedAPI.kotlinAPI.item.ItemDetail;
import com.glority.component.generatedAPI.kotlinAPI.item.ItemImage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.json.JSONObject;

/* compiled from: MeCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0016J\u000f\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u001aH\u0016J\u0014\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010%\u001a\u00020&H\u0016J\n\u0010'\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010(\u001a\u00020\u0011H\u0014R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCmsDetailFragment;", "Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomDetailBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "detailViewModel", "Lcom/glority/android/picturexx/vm/DetailViewModel;", "getDetailViewModel", "()Lcom/glority/android/picturexx/vm/DetailViewModel;", "detailViewModel$delegate", "pageFrom", "", "itemId", "", Args.uid, "tempDisplayName", "tempDisplayImageUrl", "itemDetail", "Lcom/glority/component/generatedAPI/kotlinAPI/item/ItemDetail;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "initObserver", "getItemId", "()Ljava/lang/Long;", "initView", "addCollection", "Lcom/glority/android/picturexx/view/recognize/CollectionDetailEditDialogFragment;", "from", "showJoinReddit", "", "getDefaultYear", "getLogPageName", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCmsDetailFragment extends BaseCmsDetailFragment<FragmentCustomDetailBinding> {
    public static final int $stable = 8;

    /* renamed from: detailViewModel$delegate, reason: from kotlin metadata */
    private final Lazy detailViewModel;
    private ItemDetail itemDetail;
    private long itemId;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private String pageFrom = "";
    private String uid = "";
    private String tempDisplayName = "";
    private String tempDisplayImageUrl = "";

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public boolean showJoinReddit() {
        return false;
    }

    public MeCmsDetailFragment() {
        final MeCmsDetailFragment meCmsDetailFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(meCmsDetailFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = meCmsDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$special$$inlined$activityViewModels$default$3
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
        this.detailViewModel = FragmentViewModelLazyKt.createViewModelLazy(meCmsDetailFragment, Reflection.getOrCreateKotlinClass(DetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = meCmsDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$special$$inlined$activityViewModels$default$6
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
    public final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    private final DetailViewModel getDetailViewModel() {
        return (DetailViewModel) this.detailViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    public void doCreateView(Bundle savedInstanceState) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("from");
            if (string == null) {
                string = "";
            }
            this.pageFrom = string;
            this.itemId = arguments.getLong(Args.itemId);
            String string2 = arguments.getString(Args.uid);
            if (string2 == null) {
                string2 = "";
            }
            this.uid = string2;
            String string3 = arguments.getString("name");
            if (string3 == null) {
                string3 = "";
            }
            this.tempDisplayName = string3;
            String string4 = arguments.getString(Args.imageUrls);
            this.tempDisplayImageUrl = string4 != null ? string4 : "";
            updateCommonEventArgs(new Pair(LogEventArguments.ARG_STRING_2, this.pageFrom), new Pair(LogEventArguments.ARG_STRING_1, String.valueOf(this.itemId)), new Pair(LogEventArguments.ARG_STRING_2, this.uid));
        }
        super.doCreateView(savedInstanceState);
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, this, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$doCreateView$2
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
                final FragmentActivity activity = MeCmsDetailFragment.this.getActivity();
                if (activity != null) {
                    if (RatingUtils.canShow$default(RatingUtils.INSTANCE, RatingUtils.FROM_HISTORY, null, 2, null)) {
                        RatingUtils.INSTANCE.show(activity, RatingUtils.FROM_HISTORY, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$doCreateView$2$1$1
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
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initData() {
        String string;
        RatingUtils.INSTANCE.recordPageCount(RatingUtils.FROM_HISTORY);
        showLoadingUi(CollectionsKt.mutableListOf(this.tempDisplayImageUrl), getVm().getClickItemDrawable());
        if (this.itemId == 0) {
            Bundle arguments = getArguments();
            if (arguments == null || (string = arguments.getString(Args.uid)) == null) {
                return;
            }
            getDetailViewModel().getCmsName(string).observe(this, new MeCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$initData$1
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
                    MeViewModel vm;
                    if (resource.getStatus() == Status.SUCCESS) {
                        BaseFragment.logEvent$default(MeCmsDetailFragment.this, LogEvents.detail_loadsuccess_click, null, 2, null);
                        MeCmsDetailFragment meCmsDetailFragment = MeCmsDetailFragment.this;
                        GetCmsNameMessage data = resource.getData();
                        CmsName cmsName = data != null ? data.getCmsName() : null;
                        vm = MeCmsDetailFragment.this.getVm();
                        BaseCmsDetailFragment.updateCmsUi$default(meCmsDetailFragment, cmsName, null, vm.getClickItemDrawable(), null, null, null, 58, null);
                        return;
                    }
                    if (resource.getStatus() == Status.ERROR) {
                        try {
                            Boolean.valueOf(FragmentKt.findNavController(MeCmsDetailFragment.this).popBackStack());
                        } catch (Exception e) {
                            if (AppContext.INSTANCE.isDebugMode()) {
                                LogUtils.e(Log.getStackTraceString(e));
                            }
                        }
                    }
                }
            }));
            return;
        }
        getVm().getItemDetailMessage(this.itemId).observe(this, new MeCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetItemDetailMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCmsDetailFragment$initData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Resource<? extends GetItemDetailMessage> resource) {
                invoke2((Resource<GetItemDetailMessage>) resource);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Resource<GetItemDetailMessage> resource) {
                String str;
                String str2;
                MeViewModel vm;
                ItemDetail item;
                String name;
                ItemDetail item2;
                List<CmsName> cmsNames;
                ItemDetail item3;
                ItemImage itemImage;
                ItemDetail item4;
                if (resource.getStatus() == Status.SUCCESS) {
                    MeCmsDetailFragment meCmsDetailFragment = MeCmsDetailFragment.this;
                    GetItemDetailMessage data = resource.getData();
                    CmsName cmsName = null;
                    meCmsDetailFragment.itemDetail = data != null ? data.getItem() : null;
                    BaseFragment.logEvent$default(MeCmsDetailFragment.this, LogEvents.detail_loadsuccess_click, null, 2, null);
                    PropertiesItemUtils propertiesItemUtils = PropertiesItemUtils.INSTANCE;
                    GetItemDetailMessage data2 = resource.getData();
                    if (data2 == null || (item4 = data2.getItem()) == null || (str = item4.getProperties()) == null) {
                        str = "";
                    }
                    GetItemDetailMessage data3 = resource.getData();
                    if (data3 == null || (item3 = data3.getItem()) == null || (itemImage = item3.getItemImage()) == null || (str2 = itemImage.getOriginalUrl()) == null) {
                        str2 = "";
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) propertiesItemUtils.getDisplayImages(str, str2));
                    MeCmsDetailFragment meCmsDetailFragment2 = MeCmsDetailFragment.this;
                    GetItemDetailMessage data4 = resource.getData();
                    if (data4 != null && (item2 = data4.getItem()) != null && (cmsNames = item2.getCmsNames()) != null) {
                        cmsName = (CmsName) CollectionsKt.firstOrNull((List) cmsNames);
                    }
                    CmsName cmsName2 = cmsName;
                    GetItemDetailMessage data5 = resource.getData();
                    String str3 = (data5 == null || (item = data5.getItem()) == null || (name = item.getName()) == null) ? "" : name;
                    vm = MeCmsDetailFragment.this.getVm();
                    BaseCmsDetailFragment.updateCmsUi$default(meCmsDetailFragment2, cmsName2, str3, vm.getClickItemDrawable(), (String) CollectionsKt.firstOrNull(mutableList), (String) CollectionsKt.getOrNull(mutableList, 1), null, 32, null);
                    return;
                }
                if (resource.getStatus() == Status.ERROR) {
                    try {
                        Boolean.valueOf(FragmentKt.findNavController(MeCmsDetailFragment.this).popBackStack());
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
    public void initObserver() {
        super.initObserver();
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Long getItemId() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Long.valueOf(arguments.getLong(Args.itemId));
        }
        return null;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initView() {
        String str;
        super.initView();
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("from")) == null) {
            str = "";
        }
        Pair<String, ? extends Object>[] pairArr = new Pair[2];
        pairArr[0] = new Pair<>("from", str);
        Long itemId = getItemId();
        pairArr[1] = new Pair<>("code", String.valueOf(itemId != null ? itemId.longValue() : 0L));
        updateCommonEventArgs(pairArr);
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public CollectionDetailEditDialogFragment addCollection(String from) {
        CollectionDetailEditDialogFragment createOpen;
        String properties;
        BaseCmsDetailFragment.logEventAddPrefix$default(this, LogEvents.addcollection_click, null, 2, null);
        String tagValue = CmsDataUtils.INSTANCE.getTagValue(getCmsName(), "PreferredSeries");
        ItemDetail itemDetail = this.itemDetail;
        if (itemDetail != null && (properties = itemDetail.getProperties()) != null) {
            new JSONObject(properties);
        }
        CmsName cmsName = getCmsName();
        if (cmsName == null) {
            return null;
        }
        Long itemId = getItemId();
        createOpen = CollectionDetailEditDialogFragment.INSTANCE.createOpen(getSupportFragmentManager(), (itemId == null || itemId.longValue() != 0) ? getItemId() : null, cmsName.getUid(), getRecognizeYear(), getUserImage(), 1, getPageName(), cmsName, tagValue, (r33 & 512) != 0 ? null : ItemDetailUtils.INSTANCE.getDenominationSideUrl(this.itemDetail), (r33 & 1024) != 0 ? null : ItemDetailUtils.INSTANCE.getSubjectSideUrl(this.itemDetail), (r33 & 2048) != 0 ? null : getSpeciesUid(), (r33 & 4096) != 0 ? null : getVarietyUid(), (r33 & 8192) != 0 ? null : null);
        return createOpen;
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    /* renamed from: getDefaultYear */
    public String getRecognizeYear() {
        return ItemDetailUtils.INSTANCE.getYear(this.itemDetail);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    public String getPageName() {
        return LogEvents.itemdetail;
    }
}
