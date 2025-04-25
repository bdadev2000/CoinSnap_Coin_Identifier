package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.adapter.MeCollectionItemCardAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentMeCollectionAllBinding;
import com.glority.android.picturexx.business.databinding.ItemHomeFooterBinding;
import com.glority.android.picturexx.business.databinding.LayoutCollectionAllListHeaderBinding;
import com.glority.android.picturexx.business.databinding.LayoutNoneCollectionEmptyViewBinding;
import com.glority.android.picturexx.definition.CollectionSortType;
import com.glority.android.picturexx.extensions.CollectionItemListExtKt;
import com.glority.android.picturexx.recognize.CoreActivity;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.view.dialog.CollectionMorePopup;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.CollectionViewModel;
import com.glority.android.picturexx.vm.MainRecognizeProcess;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.ui.base.RuntimePermissionActivity;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.glority.widget.tooltips.GlToolTipsOnItemClickListener;
import com.picturecoin.generatedAPI.kotlinAPI.collection.Collection;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: MeCollectionAllFragment.kt */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010>\u001a\u00020 H\u0014J\b\u0010?\u001a\u00020@H\u0014J\u0012\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DH\u0014J\b\u0010E\u001a\u00020BH\u0002J\b\u0010F\u001a\u00020BH\u0002J\b\u0010G\u001a\u00020BH\u0002J\u0010\u0010H\u001a\u00020B2\u0006\u0010I\u001a\u00020\u001eH\u0002J\u0010\u0010J\u001a\u00020B2\u0006\u0010K\u001a\u00020\u001eH\u0002J\u0010\u0010L\u001a\u00020B2\u0006\u0010M\u001a\u00020@H\u0002J \u0010N\u001a\u00020B2\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0002J7\u0010U\u001a\u00020B2\u0006\u0010V\u001a\u00020P2%\b\u0002\u0010W\u001a\u001f\u0012\u0013\u0012\u00110@¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b([\u0012\u0004\u0012\u00020B\u0018\u00010XH\u0002J\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020:0\u001d2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001e09H\u0002JI\u0010^\u001a\u00020B2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001e092\b\u0010_\u001a\u0004\u0018\u00010 2'\u0010`\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001e09¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(]\u0012\u0004\u0012\u00020B0XH\u0002J$\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001e092\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001e092\u0006\u0010b\u001a\u00020(H\u0002J\u0016\u0010c\u001a\u00020B2\f\u0010d\u001a\b\u0012\u0004\u0012\u00020\u001e09H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\n\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001f\u001a\n !*\u0004\u0018\u00010 0 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\"R\u0018\u0010#\u001a\n !*\u0004\u0018\u00010 0 X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\"R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b+\u0010,R\u001b\u0010.\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b0\u00101R\u001b\u00103\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b5\u00106R!\u00108\u001a\b\u0012\u0004\u0012\u00020:098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b;\u0010<¨\u0006e"}, d2 = {"Lcom/glority/android/picturexx/view/me/MeCollectionAllFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentMeCollectionAllBinding;", "<init>", "()V", "seriesVm", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "getSeriesVm", "()Lcom/glority/android/picturexx/vm/SeriesViewModel;", "seriesVm$delegate", "Lkotlin/Lazy;", "collectionVm", "Lcom/glority/android/picturexx/vm/CollectionViewModel;", "getCollectionVm", "()Lcom/glority/android/picturexx/vm/CollectionViewModel;", "collectionVm$delegate", "singleThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "adapter", "Lcom/glority/android/picturexx/adapter/MeCollectionItemCardAdapter;", "getAdapter", "()Lcom/glority/android/picturexx/adapter/MeCollectionItemCardAdapter;", "adapter$delegate", "allCollections", "", "Lcom/glority/android/database/entities/CollectionItem;", "currentIssuer", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "countryFilterAll", "sortToolTips", "Lcom/glority/widget/tooltips/GlToolTips;", "filterToolTips", "currentSortType", "Lcom/glority/android/picturexx/definition/CollectionSortType;", "emptyViewBinding", "Lcom/glority/android/picturexx/business/databinding/LayoutNoneCollectionEmptyViewBinding;", "getEmptyViewBinding", "()Lcom/glority/android/picturexx/business/databinding/LayoutNoneCollectionEmptyViewBinding;", "emptyViewBinding$delegate", "footerViewBinding", "Lcom/glority/android/picturexx/business/databinding/ItemHomeFooterBinding;", "getFooterViewBinding", "()Lcom/glority/android/picturexx/business/databinding/ItemHomeFooterBinding;", "footerViewBinding$delegate", "listHeaderBinding", "Lcom/glority/android/picturexx/business/databinding/LayoutCollectionAllListHeaderBinding;", "getListHeaderBinding", "()Lcom/glority/android/picturexx/business/databinding/LayoutCollectionAllListHeaderBinding;", "listHeaderBinding$delegate", "sortData", "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "getSortData", "()Ljava/util/List;", "sortData$delegate", "getLogPageName", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initObserver", "initView", "addSubscriptions", "onItemClick", "item", "editCollection", "collectionItem", "deleteItem", "collectionId", "initCountryFilterView", "filterLL", "Landroid/view/View;", "filterTextView", "Landroid/widget/TextView;", "filterView", "Landroid/widget/ImageView;", "initSortSelectionView", "view", "selectedPosition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "position", "getCountryFilterData", "data", "filter", "issuer", "onResult", "sort", "collectionSortType", "updateAdapter", "it", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class MeCollectionAllFragment extends BaseFragment<FragmentMeCollectionAllBinding> {
    public static final int $stable = 8;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final Lazy adapter;
    private List<CollectionItem> allCollections;

    /* renamed from: collectionVm$delegate, reason: from kotlin metadata */
    private final Lazy collectionVm;
    private final String countryFilterAll;
    private String currentIssuer;
    private CollectionSortType currentSortType;

    /* renamed from: emptyViewBinding$delegate, reason: from kotlin metadata */
    private final Lazy emptyViewBinding;
    private GlToolTips filterToolTips;

    /* renamed from: footerViewBinding$delegate, reason: from kotlin metadata */
    private final Lazy footerViewBinding;

    /* renamed from: listHeaderBinding$delegate, reason: from kotlin metadata */
    private final Lazy listHeaderBinding;

    /* renamed from: seriesVm$delegate, reason: from kotlin metadata */
    private final Lazy seriesVm;
    private final ExecutorCoroutineDispatcher singleThread;

    /* renamed from: sortData$delegate, reason: from kotlin metadata */
    private final Lazy sortData;
    private GlToolTips sortToolTips;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    public MeCollectionAllFragment() {
        final MeCollectionAllFragment meCollectionAllFragment = this;
        final Function0 function0 = null;
        this.seriesVm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionAllFragment, Reflection.getOrCreateKotlinClass(SeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = meCollectionAllFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$3
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
        this.collectionVm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionAllFragment, Reflection.getOrCreateKotlinClass(CollectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$5
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
                CreationExtras defaultViewModelCreationExtras = meCollectionAllFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$6
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
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.singleThread = ExecutorsKt.from(newSingleThreadExecutor);
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(meCollectionAllFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$8
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
                CreationExtras defaultViewModelCreationExtras = meCollectionAllFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$special$$inlined$activityViewModels$default$9
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
        this.adapter = LazyKt.lazy(new Function0<MeCollectionItemCardAdapter>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$adapter$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final MeCollectionItemCardAdapter invoke() {
                return new MeCollectionItemCardAdapter();
            }
        });
        this.allCollections = new ArrayList();
        this.currentIssuer = ResUtils.getString(R.string.collection_banner_all);
        this.countryFilterAll = ResUtils.getString(R.string.collection_banner_all);
        this.currentSortType = CollectionSortType.COLLECTION_DATE_ADDED;
        this.emptyViewBinding = LazyKt.lazy(new Function0<LayoutNoneCollectionEmptyViewBinding>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$emptyViewBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutNoneCollectionEmptyViewBinding invoke() {
                LayoutNoneCollectionEmptyViewBinding inflate = LayoutNoneCollectionEmptyViewBinding.inflate(MeCollectionAllFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                return inflate;
            }
        });
        this.footerViewBinding = LazyKt.lazy(new Function0<ItemHomeFooterBinding>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$footerViewBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ItemHomeFooterBinding invoke() {
                ItemHomeFooterBinding inflate = ItemHomeFooterBinding.inflate(MeCollectionAllFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                return inflate;
            }
        });
        this.listHeaderBinding = LazyKt.lazy(new Function0<LayoutCollectionAllListHeaderBinding>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$listHeaderBinding$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutCollectionAllListHeaderBinding invoke() {
                LayoutCollectionAllListHeaderBinding inflate = LayoutCollectionAllListHeaderBinding.inflate(MeCollectionAllFragment.this.getLayoutInflater());
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                return inflate;
            }
        });
        this.sortData = LazyKt.lazy(new Function0<List<? extends GlToolTipsItem>>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$sortData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends GlToolTipsItem> invoke() {
                String string = MeCollectionAllFragment.this.getString(R.string.all_filter_releaseyear);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                GlToolTipsItem glToolTipsItem = new GlToolTipsItem(string, (Integer) null, false, 2, (DefaultConstructorMarker) null);
                String string2 = MeCollectionAllFragment.this.getString(R.string.all_filter_price);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                GlToolTipsItem glToolTipsItem2 = new GlToolTipsItem(string2, (Integer) null, false, 2, (DefaultConstructorMarker) null);
                String string3 = MeCollectionAllFragment.this.getString(R.string.all_filter_dateadded);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return CollectionsKt.listOf((Object[]) new GlToolTipsItem[]{glToolTipsItem, glToolTipsItem2, new GlToolTipsItem(string3, (Integer) null, true, 2, (DefaultConstructorMarker) null)});
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentMeCollectionAllBinding access$getBinding(MeCollectionAllFragment meCollectionAllFragment) {
        return (FragmentMeCollectionAllBinding) meCollectionAllFragment.getBinding();
    }

    private final SeriesViewModel getSeriesVm() {
        return (SeriesViewModel) this.seriesVm.getValue();
    }

    private final CollectionViewModel getCollectionVm() {
        return (CollectionViewModel) this.collectionVm.getValue();
    }

    private final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeCollectionItemCardAdapter getAdapter() {
        return (MeCollectionItemCardAdapter) this.adapter.getValue();
    }

    private final LayoutNoneCollectionEmptyViewBinding getEmptyViewBinding() {
        return (LayoutNoneCollectionEmptyViewBinding) this.emptyViewBinding.getValue();
    }

    private final ItemHomeFooterBinding getFooterViewBinding() {
        return (ItemHomeFooterBinding) this.footerViewBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCollectionAllListHeaderBinding getListHeaderBinding() {
        return (LayoutCollectionAllListHeaderBinding) this.listHeaderBinding.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GlToolTipsItem> getSortData() {
        return (List) this.sortData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    public String getLogPageName() {
        return LogEvents.fullcollection;
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_me_collection_all;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initObserver();
        addSubscriptions();
    }

    private final void initObserver() {
        getSeriesVm().getUserSeriesListMessage();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((FragmentMeCollectionAllBinding) getBinding()).rvCollections.setLayoutManager(new LinearLayoutManager(getContext()));
        ((FragmentMeCollectionAllBinding) getBinding()).rvCollections.setAdapter(getAdapter());
        MeCollectionItemCardAdapter adapter = getAdapter();
        View root = getListHeaderBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        adapter.setHeaderView(root);
        MeCollectionItemCardAdapter adapter2 = getAdapter();
        FrameLayout root2 = getFooterViewBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
        adapter2.setFooterView(root2);
        getAdapter().setHeaderFooterEmpty(false, false);
        LinearLayout llCollectionExport = getListHeaderBinding().llCollectionExport;
        Intrinsics.checkNotNullExpressionValue(llCollectionExport, "llCollectionExport");
        ViewExtensionsKt.setSingleClickListener$default(llCollectionExport, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$1
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
                MeCollectionItemCardAdapter adapter3;
                MeCollectionItemCardAdapter adapter4;
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionAllFragment meCollectionAllFragment = MeCollectionAllFragment.this;
                Pair pair = TuplesKt.to("from", LogEvents.me);
                adapter3 = MeCollectionAllFragment.this.getAdapter();
                meCollectionAllFragment.logEvent(LogEvents.Me_All_Export_Click, LogEventArgumentsKt.logEventBundleOf(pair, TuplesKt.to("count", Integer.valueOf(adapter3.getData().size()))));
                ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                adapter4 = MeCollectionAllFragment.this.getAdapter();
                exportWriteInfoDialog.open(context, adapter4.getData().size(), null, MeCollectionAllFragment.this, LogEvents.exportall);
            }
        }, 1, (Object) null);
        MeCollectionItemCardAdapter adapter3 = getAdapter();
        View root3 = getEmptyViewBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
        adapter3.setEmptyView(root3);
        getAdapter().setHeaderAndEmpty(false);
        LinearLayout llEmptyCollectionAddCoins = getEmptyViewBinding().llEmptyCollectionAddCoins;
        Intrinsics.checkNotNullExpressionValue(llEmptyCollectionAddCoins, "llEmptyCollectionAddCoins");
        ViewExtensionsKt.setSingleClickListener$default(llEmptyCollectionAddCoins, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$2
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
                MeCollectionAllFragment.this.logEvent(LogEvents.collection_add_click, BundleKt.bundleOf(TuplesKt.to("from", "emptyfullcollection")));
                CoreActivity.Companion companion = CoreActivity.INSTANCE;
                FragmentActivity requireActivity = MeCollectionAllFragment.this.requireActivity();
                Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type com.glority.android.ui.base.RuntimePermissionActivity");
                companion.start((RuntimePermissionActivity) requireActivity, new MainRecognizeProcess(), (r17 & 4) != 0 ? 1 : 2, (r17 & 8) != 0 ? false : true, MeCollectionAllFragment.this.getLogPageName(), (r17 & 32) != 0 ? null : null, (r17 & 64) != 0 ? null : null);
            }
        }, 1, (Object) null);
        getAdapter().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$3
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                if (positionStart > -1) {
                    MeCollectionAllFragment.access$getBinding(MeCollectionAllFragment.this).rvCollections.scrollToPosition(positionStart);
                }
            }
        });
        getAdapter().setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$4
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter4, final View view, final int i) {
                MeCollectionItemCardAdapter adapter5;
                Intrinsics.checkNotNullParameter(adapter4, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                adapter5 = MeCollectionAllFragment.this.getAdapter();
                final CollectionItem item = adapter5.getItem(i);
                if (view.getId() == R.id.iv_me_collection_more) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionAllFragment.this, LogEvents.Me_All_Item_More_Click, null, 2, null);
                    CollectionMorePopup collectionMorePopup = CollectionMorePopup.INSTANCE;
                    final MeCollectionAllFragment meCollectionAllFragment = MeCollectionAllFragment.this;
                    collectionMorePopup.show(view, new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                            invoke(num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(int i2) {
                            if (i2 == R.id.option_delete) {
                                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionAllFragment.this, LogEvents.Me_All_List_Item_Delete_Click, null, 2, null);
                                ConfirmDeleteDialog confirmDeleteDialog = ConfirmDeleteDialog.INSTANCE;
                                Context context = view.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                final MeCollectionAllFragment meCollectionAllFragment2 = MeCollectionAllFragment.this;
                                final int i3 = i;
                                confirmDeleteDialog.openFromCollection(context, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment.initView.4.1.1
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
                                        MeCollectionItemCardAdapter adapter6;
                                        MeCollectionItemCardAdapter adapter7;
                                        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionAllFragment.this, LogEvents.collection_listitemdeletedone_click, null, 2, null);
                                        adapter6 = MeCollectionAllFragment.this.getAdapter();
                                        if (adapter6.getData().size() > i3) {
                                            MeCollectionAllFragment meCollectionAllFragment3 = MeCollectionAllFragment.this;
                                            adapter7 = meCollectionAllFragment3.getAdapter();
                                            meCollectionAllFragment3.deleteItem(adapter7.getData().get(i3).getCollectionId());
                                        }
                                    }
                                });
                                return;
                            }
                            if (i2 == R.id.option_edit) {
                                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionAllFragment.this, LogEvents.Me_All_List_Item_Edit_Click, null, 2, null);
                                CollectionItem collectionItem = item;
                                if (collectionItem != null) {
                                    MeCollectionAllFragment.this.editCollection(collectionItem);
                                }
                            }
                        }
                    });
                }
            }
        });
        getAdapter().setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$5
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, int i) {
                MeCollectionItemCardAdapter adapter4;
                Intrinsics.checkNotNullParameter(baseQuickAdapter, "<unused var>");
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                adapter4 = MeCollectionAllFragment.this.getAdapter();
                CollectionItem item = adapter4.getItem(i);
                if (item == null) {
                    return;
                }
                MeCollectionAllFragment.this.logEvent(LogEvents.Me_All_List_Item_Click, LogEventArgumentsKt.logEventBundleOf(TuplesKt.to("id", item.getItemId()), TuplesKt.to(LogEventArguments.ARG_STRING_1, item.getUid())));
                if (item.getCustomSeriesId() != null) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(MeCollectionAllFragment.this), Dispatchers.getIO(), null, new AnonymousClass1(item, MeCollectionAllFragment.this, null), 2, null);
                } else {
                    MeCollectionAllFragment.this.onItemClick(item);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: MeCollectionAllFragment.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$5$1", f = "MeCollectionAllFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$5$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CollectionItem $item;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ MeCollectionAllFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CollectionItem collectionItem, MeCollectionAllFragment meCollectionAllFragment, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$item = collectionItem;
                    this.this$0 = meCollectionAllFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    UserCustomSeriesItemDao userCustomSeriesItemDao = DBManager.INSTANCE.getUserCustomSeriesItemDao();
                    Integer customSeriesId = this.$item.getCustomSeriesId();
                    Intrinsics.checkNotNull(customSeriesId);
                    this.$item.setCustomSeriesName(userCustomSeriesItemDao.getCustomSeriesTitleByIdSync(customSeriesId.intValue()));
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new C01221(this.this$0, this.$item, null), 2, null);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: MeCollectionAllFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$5$1$1", f = "MeCollectionAllFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$5$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C01221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CollectionItem $item;
                    int label;
                    final /* synthetic */ MeCollectionAllFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01221(MeCollectionAllFragment meCollectionAllFragment, CollectionItem collectionItem, Continuation<? super C01221> continuation) {
                        super(2, continuation);
                        this.this$0 = meCollectionAllFragment;
                        this.$item = collectionItem;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01221(this.this$0, this.$item, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            this.this$0.onItemClick(this.$item);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
        });
        ((FragmentMeCollectionAllBinding) getBinding()).rvCollections.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$6
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                MeCollectionItemCardAdapter adapter4;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == 1) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(MeCollectionAllFragment.this, LogEvents.Me_All_Scroll, null, 2, null);
                }
                if (newState == 1 || newState == 2) {
                    MeCollectionAllFragment meCollectionAllFragment = MeCollectionAllFragment.this;
                    try {
                        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                        Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                        int findLastVisibleItemPosition = ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
                        adapter4 = meCollectionAllFragment.getAdapter();
                        if (findLastVisibleItemPosition == adapter4.getItemCount() - 1) {
                            com.glority.android.ui.base.v2.BaseFragment.logEvent$default(meCollectionAllFragment, LogEvents.Me_All_Scroll_To_Bottom, null, 2, null);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Exception e) {
                        if (AppContext.INSTANCE.isDebugMode()) {
                            LogUtils.e(Log.getStackTraceString(e));
                        }
                    }
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        LinearLayout llRegionSelection = getListHeaderBinding().llRegionSelection;
        Intrinsics.checkNotNullExpressionValue(llRegionSelection, "llRegionSelection");
        AppCompatTextView tvRegionName = getListHeaderBinding().tvRegionName;
        Intrinsics.checkNotNullExpressionValue(tvRegionName, "tvRegionName");
        AppCompatImageView ivRegionIcon = getListHeaderBinding().ivRegionIcon;
        Intrinsics.checkNotNullExpressionValue(ivRegionIcon, "ivRegionIcon");
        initCountryFilterView(llRegionSelection, tvRegionName, ivRegionIcon);
        AppCompatTextView tvSortTypeName = getListHeaderBinding().tvSortTypeName;
        Intrinsics.checkNotNullExpressionValue(tvSortTypeName, "tvSortTypeName");
        initSortSelectionView(tvSortTypeName, new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initView$7
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                invoke(num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i) {
                List sortData;
                LayoutCollectionAllListHeaderBinding listHeaderBinding;
                sortData = MeCollectionAllFragment.this.getSortData();
                GlToolTipsItem glToolTipsItem = (GlToolTipsItem) CollectionsKt.getOrNull(sortData, i);
                String text = glToolTipsItem != null ? glToolTipsItem.getText() : null;
                listHeaderBinding = MeCollectionAllFragment.this.getListHeaderBinding();
                listHeaderBinding.tvSortTypeName.setText(text);
            }
        });
    }

    private final void addSubscriptions() {
        DBManager.INSTANCE.getCollectionItemDao().getAll().observe(this, new MeCollectionAllFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$addSubscriptions$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list) {
                invoke2((List<CollectionItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<CollectionItem> list) {
                List list2;
                List list3;
                String str;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                list2 = MeCollectionAllFragment.this.allCollections;
                list2.clear();
                list3 = MeCollectionAllFragment.this.allCollections;
                list3.addAll(list);
                MeCollectionAllFragment meCollectionAllFragment = MeCollectionAllFragment.this;
                str = meCollectionAllFragment.currentIssuer;
                final MeCollectionAllFragment meCollectionAllFragment2 = MeCollectionAllFragment.this;
                meCollectionAllFragment.filter(list, str, new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$addSubscriptions$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list4) {
                        invoke2((List<CollectionItem>) list4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<CollectionItem> it) {
                        CollectionSortType collectionSortType;
                        List sort;
                        MeCollectionItemCardAdapter adapter;
                        Intrinsics.checkNotNullParameter(it, "it");
                        MeCollectionAllFragment meCollectionAllFragment3 = MeCollectionAllFragment.this;
                        try {
                            collectionSortType = meCollectionAllFragment3.currentSortType;
                            sort = meCollectionAllFragment3.sort(it, collectionSortType);
                            adapter = meCollectionAllFragment3.getAdapter();
                            adapter.setNewData(sort);
                            Unit unit = Unit.INSTANCE;
                        } catch (Exception e) {
                            if (AppContext.INSTANCE.isDebugMode()) {
                                LogUtils.e(Log.getStackTraceString(e));
                            }
                        }
                    }
                });
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onItemClick(CollectionItem item) {
        logEvent(LogEvents.collection_listitem_click, BundleKt.bundleOf(TuplesKt.to("from", getLogPageName())));
        getCollectionVm().setCurrentItem(item);
        ViewExtensionsKt.navigate$default(this, R.id.action_mainFragment_to_collectDetailFragment, BundleKt.bundleOf(TuplesKt.to("from", getLogPageName())), NavigationAnimaUtils.INSTANCE.getSlideAnima(getActivity()), null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void editCollection(final CollectionItem collectionItem) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        CmsRepository.INSTANCE.getCmsName(collectionItem.getUid(), AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()).observe(this, new MeCollectionAllFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$editCollection$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (resource.getStatus() == Status.SUCCESS) {
                    MeCollectionAllFragment.this.hideProgress();
                    CollectionDetailEditDialogFragment.Companion companion = CollectionDetailEditDialogFragment.INSTANCE;
                    FragmentManager supportFragmentManager = MeCollectionAllFragment.this.getSupportFragmentManager();
                    Collection collection = collectionItem.toCollection();
                    String logPageName = MeCollectionAllFragment.this.getLogPageName();
                    GetCmsNameMessage data = resource.getData();
                    CollectionDetailEditDialogFragment.Companion.editOpen$default(companion, supportFragmentManager, collection, 0, logPageName, data != null ? data.getCmsName() : null, null, null, 96, null).setNeedChangePage(false);
                    return;
                }
                if (resource.getStatus() != Status.LOADING) {
                    MeCollectionAllFragment.this.hideProgress();
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItem(int collectionId) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        getVm().deleteCollectionItem(collectionId).observe(this, new MeCollectionAllFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$deleteItem$1
            /* JADX INFO: Access modifiers changed from: package-private */
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
                MeCollectionAllFragment.this.hideProgress();
            }
        }));
    }

    private final void initCountryFilterView(View filterLL, final TextView filterTextView, final ImageView filterView) {
        ViewExtensionsKt.setSingleClickListener$default(filterLL, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initCountryFilterView$1
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
                List list;
                final List<GlToolTipsItem> countryFilterData;
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionAllFragment meCollectionAllFragment = MeCollectionAllFragment.this;
                list = meCollectionAllFragment.allCollections;
                countryFilterData = meCollectionAllFragment.getCountryFilterData(list);
                MeCollectionAllFragment meCollectionAllFragment2 = MeCollectionAllFragment.this;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder showArrow = new GlToolTips.Builder(context).addDivider(true).setSelectable(true).setShowArrow(false);
                final MeCollectionAllFragment meCollectionAllFragment3 = MeCollectionAllFragment.this;
                final ImageView imageView = filterView;
                final TextView textView = filterTextView;
                meCollectionAllFragment2.filterToolTips = showArrow.setItems(countryFilterData, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initCountryFilterView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        List list2;
                        String str;
                        MeCollectionAllFragment meCollectionAllFragment4 = MeCollectionAllFragment.this;
                        Pair[] pairArr = new Pair[2];
                        pairArr[0] = TuplesKt.to("from", meCollectionAllFragment4.getLogPageName());
                        GlToolTipsItem glToolTipsItem = (GlToolTipsItem) CollectionsKt.getOrNull(countryFilterData, position);
                        pairArr[1] = TuplesKt.to("type", glToolTipsItem != null ? glToolTipsItem.getText() : null);
                        meCollectionAllFragment4.logEvent(LogEvents.Me_All_Order_By_Issuer_Click, LogEventArgumentsKt.logEventBundleOf(pairArr));
                        GlToolTipsItem glToolTipsItem2 = countryFilterData.get(position);
                        MeCollectionAllFragment.this.currentIssuer = glToolTipsItem2.getText();
                        RequestManager with = Glide.with(MeCollectionAllFragment.this);
                        Object imageUrl = glToolTipsItem2.getImageUrl();
                        if (imageUrl == null) {
                            imageUrl = glToolTipsItem2.getDrawableRes();
                        }
                        with.load(imageUrl).into(imageView);
                        textView.setText(glToolTipsItem2.getText());
                        int i = 0;
                        for (Object obj : countryFilterData) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ((GlToolTipsItem) obj).setSelected(i == position);
                            i = i2;
                        }
                        MeCollectionAllFragment meCollectionAllFragment5 = MeCollectionAllFragment.this;
                        list2 = meCollectionAllFragment5.allCollections;
                        str = MeCollectionAllFragment.this.currentIssuer;
                        final MeCollectionAllFragment meCollectionAllFragment6 = MeCollectionAllFragment.this;
                        meCollectionAllFragment5.filter(list2, str, new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initCountryFilterView$1$1$onClick$2
                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list3) {
                                invoke2((List<CollectionItem>) list3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(List<CollectionItem> it2) {
                                Intrinsics.checkNotNullParameter(it2, "it");
                                MeCollectionAllFragment.this.updateAdapter(it2);
                            }
                        });
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initSortSelectionView$default(MeCollectionAllFragment meCollectionAllFragment, View view, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        meCollectionAllFragment.initSortSelectionView(view, function1);
    }

    private final void initSortSelectionView(View view, final Function1<? super Integer, Unit> selectedPosition) {
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initSortSelectionView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view2) {
                invoke2(view2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(View it) {
                List<GlToolTipsItem> sortData;
                Intrinsics.checkNotNullParameter(it, "it");
                MeCollectionAllFragment meCollectionAllFragment = MeCollectionAllFragment.this;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder selectable = new GlToolTips.Builder(context).addDivider(true).setSelectable(true);
                sortData = MeCollectionAllFragment.this.getSortData();
                final MeCollectionAllFragment meCollectionAllFragment2 = MeCollectionAllFragment.this;
                final Function1<Integer, Unit> function1 = selectedPosition;
                meCollectionAllFragment.sortToolTips = selectable.setItems(sortData, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$initSortSelectionView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        List sortData2;
                        MeCollectionItemCardAdapter adapter;
                        CollectionSortType collectionSortType;
                        List sort;
                        sortData2 = MeCollectionAllFragment.this.getSortData();
                        Iterator it2 = sortData2.iterator();
                        int i = 0;
                        while (true) {
                            boolean z = true;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GlToolTipsItem glToolTipsItem = (GlToolTipsItem) next;
                            if (i != position) {
                                z = false;
                            }
                            glToolTipsItem.setSelected(z);
                            i = i2;
                        }
                        MeCollectionAllFragment.this.currentSortType = CollectionSortType.INSTANCE.fromValue(position);
                        if (position == 0) {
                            MeCollectionAllFragment.this.logEvent(LogEvents.Me_All_Order_By_Sort_Click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.customseriesfolder_sortbyreleaseyear)));
                        } else if (position == 1) {
                            MeCollectionAllFragment.this.logEvent(LogEvents.Me_All_Order_By_Sort_Click, BundleKt.bundleOf(TuplesKt.to("type", "Price")));
                        } else {
                            MeCollectionAllFragment.this.logEvent(LogEvents.Me_All_Order_By_Sort_Click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.customseriesfolder_sortbydateadd)));
                        }
                        Function1<Integer, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Integer.valueOf(position));
                        }
                        MeCollectionAllFragment meCollectionAllFragment3 = MeCollectionAllFragment.this;
                        adapter = meCollectionAllFragment3.getAdapter();
                        List<CollectionItem> data = adapter.getData();
                        collectionSortType = MeCollectionAllFragment.this.currentSortType;
                        sort = meCollectionAllFragment3.sort(data, collectionSortType);
                        MeCollectionAllFragment.this.updateAdapter(sort);
                        MeCollectionAllFragment.access$getBinding(MeCollectionAllFragment.this).rvCollections.scrollToPosition(0);
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GlToolTipsItem> getCountryFilterData(List<CollectionItem> data) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (CollectionItem collectionItem : data) {
            if (collectionItem.getIssuer() != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((GlToolTipsItem) obj).getText(), collectionItem.getIssuer())) {
                        break;
                    }
                }
                if (obj == null) {
                    String countryFlagIconUrl = CmsDataUtils.INSTANCE.getCountryFlagIconUrl(collectionItem.getIssuerCountryCode());
                    String issuer = collectionItem.getIssuer();
                    if (issuer == null) {
                        issuer = "";
                    }
                    arrayList.add(new GlToolTipsItem(issuer, countryFlagIconUrl, Intrinsics.areEqual(collectionItem.getIssuer(), this.currentIssuer)));
                }
            }
        }
        if (arrayList.size() > 1) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.glority.android.picturexx.view.me.MeCollectionAllFragment$getCountryFilterData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((GlToolTipsItem) t).getText(), ((GlToolTipsItem) t2).getText());
                }
            });
        }
        String countryFilterAll = this.countryFilterAll;
        Intrinsics.checkNotNullExpressionValue(countryFilterAll, "countryFilterAll");
        arrayList.add(0, new GlToolTipsItem(countryFilterAll, Integer.valueOf(R.drawable.icon_price_scale_global), Intrinsics.areEqual(this.countryFilterAll, this.currentIssuer)));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void filter(List<CollectionItem> data, String issuer, Function1<? super List<CollectionItem>, Unit> onResult) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.singleThread), null, null, new MeCollectionAllFragment$filter$1(data, issuer, this, onResult, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionItem> sort(List<CollectionItem> data, CollectionSortType collectionSortType) {
        return CollectionItemListExtKt.sortBy(data, collectionSortType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdapter(List<CollectionItem> it) {
        try {
            getAdapter().setNewData(it);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
