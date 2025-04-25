package com.glority.android.picturexx.view.me;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.dao.UserCustomSeriesItemDao;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.adapter.MeCollectionItemAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentSimpleCollectionListBinding;
import com.glority.android.picturexx.business.databinding.ItemExportbarBinding;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.view.dialog.CollectionMorePopup;
import com.glority.android.picturexx.view.dialog.ConfirmDeleteDialog;
import com.glority.android.picturexx.view.dialog.ExportWriteInfoDialog;
import com.glority.android.picturexx.view.recognize.CollectionDetailEditDialogFragment;
import com.glority.android.picturexx.vm.MeViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import com.glority.utils.ui.ViewUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.glority.widget.tooltips.GlToolTipsOnItemClickListener;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: SimpleCollectionListFragment.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jf\u0010E\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\rJ\u0012\u0010F\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010HH\u0016J\b\u0010I\u001a\u000202H\u0014J\u000e\u0010J\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000eJ\u0014\u0010K\u001a\u00020\u00142\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120*J\u0016\u0010M\u001a\u00020\u00142\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00120*H\u0002J\u0012\u0010O\u001a\u00020\u00142\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\b\u0010P\u001a\u00020\u0014H\u0002J\b\u0010Q\u001a\u00020\u0014H\u0002J\u0010\u0010R\u001a\u00020\u00142\u0006\u0010S\u001a\u00020\u0012H\u0002J\b\u0010T\u001a\u00020\u0006H\u0014J\b\u0010U\u001a\u00020\u0014H\u0002J\b\u0010V\u001a\u00020\u0014H\u0002J\b\u0010W\u001a\u00020\u0014H\u0002J\b\u0010X\u001a\u00020\u0014H\u0002J \u0010Y\u001a\u00020\u00142\u0006\u0010Z\u001a\u00020\u000e2\u0006\u0010[\u001a\u00020\\2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020\u00142\u0006\u0010`\u001a\u000202H\u0002J7\u0010a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2%\b\u0002\u0010b\u001a\u001f\u0012\u0013\u0012\u001102¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(d\u0012\u0004\u0012\u00020\u0014\u0018\u00010cH\u0002J$\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00120*2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120*2\u0006\u0010f\u001a\u000202H\u0002JS\u0010g\u001a\u00020\u00142\b\u0010+\u001a\u0004\u0018\u00010,2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120*2\b\u0010h\u001a\u0004\u0018\u00010\u00062'\u0010i\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120*¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020\u00140cH\u0002J\u001c\u0010j\u001a\b\u0012\u0004\u0012\u00020A0'2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00120*H\u0002J\b\u0010k\u001a\u00020\u0014H\u0016J\u000e\u0010l\u001a\u00020\u00142\u0006\u0010m\u001a\u00020\bJ\u0006\u0010n\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u00020\u00142\u0006\u0010m\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R@\u0010\f\u001a4\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\"R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120'X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120*0)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R#\u00106\u001a\n 7*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001e\u001a\u0004\b8\u00109R\u001b\u0010;\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001e\u001a\u0004\b=\u0010>R!\u0010@\u001a\b\u0012\u0004\u0012\u00020A0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010\u001e\u001a\u0004\bB\u0010C¨\u0006o"}, d2 = {"Lcom/glority/android/picturexx/view/me/SimpleCollectionListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentSimpleCollectionListBinding;", "<init>", "()V", Args.pageName, "", "isInPageSearch", "", "autoShowInput", "showSort", "visibleExportBar", "onItemClick", "Lkotlin/Function2;", "Landroid/view/View;", "Lkotlin/ParameterName;", "name", "view", "Lcom/glority/android/database/entities/CollectionItem;", "item", "", "adapter", "Lcom/glority/android/picturexx/adapter/MeCollectionItemAdapter;", "getAdapter", "()Lcom/glority/android/picturexx/adapter/MeCollectionItemAdapter;", "rv", "Landroidx/recyclerview/widget/RecyclerView;", "getRv", "()Landroidx/recyclerview/widget/RecyclerView;", "rv$delegate", "Lkotlin/Lazy;", "vm", "Lcom/glority/android/picturexx/vm/MeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/MeViewModel;", "vm$delegate", "singleThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "allCollections", "", "dataLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "editText", "Landroid/widget/EditText;", "emptyView", "flagUrl", "currentIssuer", "countryFilterAll", "currentSortType", "", "sortToolTips", "Lcom/glority/widget/tooltips/GlToolTips;", "filterToolTips", "footView", "kotlin.jvm.PlatformType", "getFootView", "()Landroid/view/View;", "footView$delegate", "exportBar", "Lcom/glority/android/picturexx/business/databinding/ItemExportbarBinding;", "getExportBar", "()Lcom/glority/android/picturexx/business/databinding/ItemExportbarBinding;", "exportBar$delegate", "sortData", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "getSortData", "()Ljava/util/List;", "sortData$delegate", "initConfig", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "setEmptyView", "setData", "data", "updateAdapter", "it", "doCreateView", "initObserver", "initView", "editCollection", "collectionItem", "getLogPageName", "initInPageSearchBar", "hideSoftInput", "showSoftInput", "initOutPageSearchHeader", "initCountryFilterView", "filterLL", "filterTextView", "Landroid/widget/TextView;", "filterView", "Landroid/widget/ImageView;", "deleteItem", "collectionId", "initSortView", "selectedPosition", "Lkotlin/Function1;", "position", "sort", "sortType", "filter", "issuer", "onResult", "getCountryFilterData", "onPause", "visibleFilterBar", "visible", "isFilterBarVisible", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SimpleCollectionListFragment extends BaseFragment<FragmentSimpleCollectionListBinding> {
    public static final int $stable = 8;
    private List<CollectionItem> allCollections;
    private boolean autoShowInput;
    private String countryFilterAll;
    private String currentIssuer;
    private int currentSortType;
    private MutableLiveData<List<CollectionItem>> dataLiveData;
    private EditText editText;
    private MutableLiveData<View> emptyView;

    /* renamed from: exportBar$delegate, reason: from kotlin metadata */
    private final Lazy exportBar;
    private GlToolTips filterToolTips;
    private final String flagUrl;

    /* renamed from: footView$delegate, reason: from kotlin metadata */
    private final Lazy footView;
    private boolean isInPageSearch;
    private Function2<? super View, ? super CollectionItem, Unit> onItemClick;
    private final ExecutorCoroutineDispatcher singleThread;

    /* renamed from: sortData$delegate, reason: from kotlin metadata */
    private final Lazy sortData;
    private GlToolTips sortToolTips;
    private boolean visibleExportBar;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private String pageName = "";
    private boolean showSort = true;
    private final MeCollectionItemAdapter adapter = new MeCollectionItemAdapter();

    /* renamed from: rv$delegate, reason: from kotlin metadata */
    private final Lazy rv = LazyKt.lazy(new Function0<RecyclerView>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$rv$2
        /* JADX INFO: Access modifiers changed from: package-private */
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return SimpleCollectionListFragment.access$getBinding(SimpleCollectionListFragment.this).rv;
        }
    });

    public SimpleCollectionListFragment() {
        final SimpleCollectionListFragment simpleCollectionListFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(simpleCollectionListFragment, Reflection.getOrCreateKotlinClass(MeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = simpleCollectionListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$special$$inlined$activityViewModels$default$3
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
        this.allCollections = new ArrayList();
        this.dataLiveData = new MutableLiveData<>();
        this.emptyView = new MutableLiveData<>();
        this.flagUrl = "https://cms-cache.coinidentifierai.com/static/flags/64-5/%s_64.png";
        this.currentIssuer = "All";
        this.countryFilterAll = "All";
        this.footView = LazyKt.lazy(new Function0<View>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$footView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final View invoke() {
                return SimpleCollectionListFragment.this.getLayoutInflater().inflate(R.layout.item_long_foot_view, (ViewGroup) null);
            }
        });
        this.exportBar = LazyKt.lazy(new Function0<ItemExportbarBinding>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$exportBar$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ItemExportbarBinding invoke() {
                return ItemExportbarBinding.inflate(SimpleCollectionListFragment.this.getLayoutInflater());
            }
        });
        this.sortData = LazyKt.lazy(new Function0<List<? extends GlToolTipsItem>>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$sortData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends GlToolTipsItem> invoke() {
                String string = SimpleCollectionListFragment.this.getString(R.string.collections_sort_dateadded);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                GlToolTipsItem glToolTipsItem = new GlToolTipsItem(string, (Integer) null, true, 2, (DefaultConstructorMarker) null);
                String string2 = SimpleCollectionListFragment.this.getString(R.string.collections_sort_releaseyear);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return CollectionsKt.listOf((Object[]) new GlToolTipsItem[]{glToolTipsItem, new GlToolTipsItem(string2, (Integer) null, false, 2, (DefaultConstructorMarker) null)});
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ FragmentSimpleCollectionListBinding access$getBinding(SimpleCollectionListFragment simpleCollectionListFragment) {
        return (FragmentSimpleCollectionListBinding) simpleCollectionListFragment.getBinding();
    }

    public final MeCollectionItemAdapter getAdapter() {
        return this.adapter;
    }

    public final RecyclerView getRv() {
        Object value = this.rv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    private final MeViewModel getVm() {
        return (MeViewModel) this.vm.getValue();
    }

    private final View getFootView() {
        return (View) this.footView.getValue();
    }

    private final ItemExportbarBinding getExportBar() {
        Object value = this.exportBar.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ItemExportbarBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<GlToolTipsItem> getSortData() {
        return (List) this.sortData.getValue();
    }

    public final void initConfig(String pageName, boolean isInPageSearch, boolean autoShowInput, boolean showSort, boolean visibleExportBar, Function2<? super View, ? super CollectionItem, Unit> onItemClick) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        this.pageName = pageName;
        this.isInPageSearch = isInPageSearch;
        this.autoShowInput = autoShowInput;
        this.showSort = showSort;
        this.onItemClick = onItemClick;
        this.visibleExportBar = visibleExportBar;
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        updateCommonEventArgs(new Pair("from", this.pageName));
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_simple_collection_list;
    }

    public final void setEmptyView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.emptyView.setValue(view);
    }

    public final void setData(List<CollectionItem> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.allCollections = CollectionsKt.toMutableList((Collection) data);
        this.dataLiveData.postValue(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdapter(List<CollectionItem> it) {
        View value;
        try {
            if (it.isEmpty()) {
                this.adapter.removeFooterView(getFootView());
            } else if (this.adapter.getFooterLayoutCount() == 0) {
                MeCollectionItemAdapter meCollectionItemAdapter = this.adapter;
                View footView = getFootView();
                Intrinsics.checkNotNullExpressionValue(footView, "<get-footView>(...)");
                meCollectionItemAdapter.setFooterView(footView);
            }
            if (it.isEmpty() && (!this.allCollections.isEmpty())) {
                MeCollectionItemAdapter meCollectionItemAdapter2 = this.adapter;
                View inflate = getLayoutInflater().inflate(R.layout.item_collection_search_empty, (ViewGroup) null);
                Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
                meCollectionItemAdapter2.setEmptyView(inflate);
            } else if (!Intrinsics.areEqual(this.emptyView.getValue(), this.adapter.getEmptyView()) && (value = this.emptyView.getValue()) != null) {
                this.adapter.setEmptyView(value);
            }
            this.adapter.setNewData(it);
            this.adapter.isUseEmpty(it.isEmpty());
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initObserver();
    }

    private final void initObserver() {
        SimpleCollectionListFragment simpleCollectionListFragment = this;
        this.dataLiveData.observe(simpleCollectionListFragment, new SimpleCollectionListFragment$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initObserver$1
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
                EditText editText;
                List list2;
                String str;
                SimpleCollectionListFragment simpleCollectionListFragment2 = SimpleCollectionListFragment.this;
                editText = simpleCollectionListFragment2.editText;
                list2 = SimpleCollectionListFragment.this.allCollections;
                str = SimpleCollectionListFragment.this.currentIssuer;
                final SimpleCollectionListFragment simpleCollectionListFragment3 = SimpleCollectionListFragment.this;
                simpleCollectionListFragment2.filter(editText, list2, str, new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initObserver$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list3) {
                        invoke2((List<CollectionItem>) list3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<CollectionItem> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        SimpleCollectionListFragment.this.updateAdapter(it);
                    }
                });
            }
        }));
        this.emptyView.observe(simpleCollectionListFragment, new SimpleCollectionListFragment$sam$androidx_lifecycle_Observer$0(new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initObserver$2
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
            public final void invoke2(View view) {
                MeCollectionItemAdapter adapter = SimpleCollectionListFragment.this.getAdapter();
                Intrinsics.checkNotNull(view);
                adapter.setEmptyView(view);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        String string = getString(R.string.myseries_btn_all);
        this.currentIssuer = string;
        this.countryFilterAll = string;
        ((FragmentSimpleCollectionListBinding) getBinding()).rv.setAdapter(this.adapter);
        if (this.isInPageSearch) {
            initInPageSearchBar();
        } else {
            initOutPageSearchHeader();
        }
        MeCollectionItemAdapter meCollectionItemAdapter = this.adapter;
        View root = getExportBar().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        BaseQuickAdapter.addHeaderView$default(meCollectionItemAdapter, root, 0, 0, 6, null);
        visibleExportBar(this.visibleExportBar);
        this.adapter.setOnItemChildClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, final View view, final int i) {
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                SimpleCollectionListFragment.this.hideSoftInput();
                final CollectionItem item = SimpleCollectionListFragment.this.getAdapter().getItem(i);
                if (view.getId() == R.id.iv_me_collection_more) {
                    com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SimpleCollectionListFragment.this, LogEvents.collection_listitemmore_click, null, 2, null);
                    CollectionMorePopup collectionMorePopup = CollectionMorePopup.INSTANCE;
                    final SimpleCollectionListFragment simpleCollectionListFragment = SimpleCollectionListFragment.this;
                    collectionMorePopup.show(view, new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$1.1
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
                                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SimpleCollectionListFragment.this, LogEvents.collection_listitemdetele_click, null, 2, null);
                                ConfirmDeleteDialog confirmDeleteDialog = ConfirmDeleteDialog.INSTANCE;
                                Context context = view.getContext();
                                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                                final SimpleCollectionListFragment simpleCollectionListFragment2 = SimpleCollectionListFragment.this;
                                final int i3 = i;
                                confirmDeleteDialog.openFromCollection(context, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment.initView.1.1.1
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
                                        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SimpleCollectionListFragment.this, LogEvents.collection_listitemdeletedone_click, null, 2, null);
                                        if (SimpleCollectionListFragment.this.getAdapter().getData().size() > i3) {
                                            SimpleCollectionListFragment simpleCollectionListFragment3 = SimpleCollectionListFragment.this;
                                            simpleCollectionListFragment3.deleteItem(simpleCollectionListFragment3.getAdapter().getData().get(i3).getCollectionId());
                                        }
                                    }
                                });
                                return;
                            }
                            if (i2 == R.id.option_edit) {
                                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SimpleCollectionListFragment.this, LogEvents.collection_listitemedit_click, null, 2, null);
                                CollectionItem collectionItem = item;
                                if (collectionItem != null) {
                                    SimpleCollectionListFragment.this.editCollection(collectionItem);
                                }
                            }
                        }
                    });
                }
            }
        });
        this.adapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BaseQuickAdapter<?, ?> baseQuickAdapter, View view, Integer num) {
                invoke(baseQuickAdapter, view, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(BaseQuickAdapter<?, ?> adapter, View view, int i) {
                Function2 function2;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                SimpleCollectionListFragment.this.hideSoftInput();
                CollectionItem item = SimpleCollectionListFragment.this.getAdapter().getItem(i);
                Intrinsics.checkNotNull(item);
                CollectionItem collectionItem = item;
                if (collectionItem.getCustomSeriesId() != null) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(SimpleCollectionListFragment.this), Dispatchers.getIO(), null, new AnonymousClass1(collectionItem, SimpleCollectionListFragment.this, view, null), 2, null);
                    return;
                }
                function2 = SimpleCollectionListFragment.this.onItemClick;
                if (function2 != null) {
                    CollectionItem item2 = SimpleCollectionListFragment.this.getAdapter().getItem(i);
                    Intrinsics.checkNotNull(item2);
                    function2.invoke(view, item2);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SimpleCollectionListFragment.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
            @DebugMetadata(c = "com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$2$1", f = "SimpleCollectionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$2$1, reason: invalid class name */
            /* loaded from: classes5.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CollectionItem $item;
                final /* synthetic */ View $view;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ SimpleCollectionListFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CollectionItem collectionItem, SimpleCollectionListFragment simpleCollectionListFragment, View view, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$item = collectionItem;
                    this.this$0 = simpleCollectionListFragment;
                    this.$view = view;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$item, this.this$0, this.$view, continuation);
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
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new C01261(this.this$0, this.$view, this.$item, null), 2, null);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: SimpleCollectionListFragment.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                @DebugMetadata(c = "com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$2$1$1", f = "SimpleCollectionListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$2$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes5.dex */
                public static final class C01261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ CollectionItem $item;
                    final /* synthetic */ View $view;
                    int label;
                    final /* synthetic */ SimpleCollectionListFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C01261(SimpleCollectionListFragment simpleCollectionListFragment, View view, CollectionItem collectionItem, Continuation<? super C01261> continuation) {
                        super(2, continuation);
                        this.this$0 = simpleCollectionListFragment;
                        this.$view = view;
                        this.$item = collectionItem;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C01261(this.this$0, this.$view, this.$item, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C01261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Function2 function2;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label == 0) {
                            ResultKt.throwOnFailure(obj);
                            function2 = this.this$0.onItemClick;
                            if (function2 != null) {
                                function2.invoke(this.$view, this.$item);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
        });
        LinearLayout llExport = getExportBar().llExport;
        Intrinsics.checkNotNullExpressionValue(llExport, "llExport");
        ViewExtensionsKt.setSingleClickListener$default(llExport, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initView$3
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
                com.glority.android.ui.base.v2.BaseFragment.logEvent$default(SimpleCollectionListFragment.this, LogEvents.collection_exportall_click, null, 2, null);
                ExportWriteInfoDialog exportWriteInfoDialog = ExportWriteInfoDialog.INSTANCE;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                exportWriteInfoDialog.open(context, SimpleCollectionListFragment.this.getAdapter().getData().size(), null, SimpleCollectionListFragment.this, LogEvents.exportall);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void editCollection(final CollectionItem collectionItem) {
        CmsRepository.INSTANCE.getCmsName(collectionItem.getUid(), AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode()).observe(this, new SimpleCollectionListFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$editCollection$1
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
                    SimpleCollectionListFragment.this.hideProgress();
                    CollectionDetailEditDialogFragment.Companion companion = CollectionDetailEditDialogFragment.INSTANCE;
                    FragmentManager supportFragmentManager = SimpleCollectionListFragment.this.getSupportFragmentManager();
                    com.picturecoin.generatedAPI.kotlinAPI.collection.Collection collection = collectionItem.toCollection();
                    String pageName = SimpleCollectionListFragment.this.getPageName();
                    GetCmsNameMessage data = resource.getData();
                    CollectionDetailEditDialogFragment.Companion.editOpen$default(companion, supportFragmentManager, collection, 0, pageName, data != null ? data.getCmsName() : null, null, null, 96, null).setNeedChangePage(false);
                    return;
                }
                if (resource.getStatus() != Status.LOADING) {
                    SimpleCollectionListFragment.this.hideProgress();
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                } else {
                    com.glority.android.ui.base.v2.BaseFragment.showProgress$default(SimpleCollectionListFragment.this, null, false, 3, null);
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName, reason: from getter */
    public String getPageName() {
        return this.pageName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initInPageSearchBar() {
        this.editText = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.et;
        View root = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(0);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        EditText et = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.et;
        Intrinsics.checkNotNullExpressionValue(et, "et");
        et.addTextChangedListener(new TextWatcher() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initInPageSearchBar$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                List list;
                String str;
                SimpleCollectionListFragment simpleCollectionListFragment = SimpleCollectionListFragment.this;
                EditText editText = SimpleCollectionListFragment.access$getBinding(simpleCollectionListFragment).searchBar.et;
                list = SimpleCollectionListFragment.this.allCollections;
                str = SimpleCollectionListFragment.this.currentIssuer;
                final SimpleCollectionListFragment simpleCollectionListFragment2 = SimpleCollectionListFragment.this;
                simpleCollectionListFragment.filter(editText, list, str, new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initInPageSearchBar$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends CollectionItem> list2) {
                        invoke2((List<CollectionItem>) list2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<CollectionItem> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        SimpleCollectionListFragment.this.updateAdapter(it);
                    }
                });
            }
        });
        ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.et.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$$ExternalSyntheticLambda0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                SimpleCollectionListFragment.initInPageSearchBar$lambda$3(Ref.BooleanRef.this, this, view, z);
            }
        });
        ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.searchLl.postDelayed(new Runnable() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SimpleCollectionListFragment.initInPageSearchBar$lambda$5(SimpleCollectionListFragment.this);
            }
        }, 300L);
        GlTextView cancelTv = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.cancelTv;
        Intrinsics.checkNotNullExpressionValue(cancelTv, "cancelTv");
        ViewExtensionsKt.setSingleClickListener$default(cancelTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initInPageSearchBar$4
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
                SimpleCollectionListFragment.this.hideSoftInput();
                FragmentActivity activity = SimpleCollectionListFragment.this.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
            }
        }, 1, (Object) null);
        ImageView sortIv = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.sortIv;
        Intrinsics.checkNotNullExpressionValue(sortIv, "sortIv");
        sortIv.setVisibility(this.showSort ? 0 : 8);
        GlTextView cancelTv2 = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.cancelTv;
        Intrinsics.checkNotNullExpressionValue(cancelTv2, "cancelTv");
        cancelTv2.setVisibility(this.showSort ^ true ? 0 : 8);
        LinearLayout filterLl = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.filterLl;
        Intrinsics.checkNotNullExpressionValue(filterLl, "filterLl");
        GlTextView filterTv = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.filterTv;
        Intrinsics.checkNotNullExpressionValue(filterTv, "filterTv");
        ImageView filterIv = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.filterIv;
        Intrinsics.checkNotNullExpressionValue(filterIv, "filterIv");
        initCountryFilterView(filterLl, filterTv, filterIv);
        ImageView sortIv2 = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.sortIv;
        Intrinsics.checkNotNullExpressionValue(sortIv2, "sortIv");
        initSortView$default(this, sortIv2, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInPageSearchBar$lambda$3(Ref.BooleanRef hasReported, SimpleCollectionListFragment this$0, View view, boolean z) {
        Intrinsics.checkNotNullParameter(hasReported, "$hasReported");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!z || hasReported.element) {
            return;
        }
        com.glority.android.ui.base.v2.BaseFragment.logEvent$default(this$0, LogEvents.collectionsearch_searchbar_click, null, 2, null);
        hasReported.element = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initInPageSearchBar$lambda$5(SimpleCollectionListFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            if (this$0.autoShowInput) {
                this$0.showSoftInput();
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hideSoftInput() {
        ViewUtils.hideSoftInput(((FragmentSimpleCollectionListBinding) getBinding()).searchBar.et);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showSoftInput() {
        ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.et.requestFocus();
        ViewUtils.showSoftInput(((FragmentSimpleCollectionListBinding) getBinding()).searchBar.et);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initOutPageSearchHeader() {
        View root = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        root.setVisibility(8);
        LinearLayout filterLl = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.filterLl;
        Intrinsics.checkNotNullExpressionValue(filterLl, "filterLl");
        GlTextView filterTv = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.filterTv;
        Intrinsics.checkNotNullExpressionValue(filterTv, "filterTv");
        ImageView filterIv = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.filterIv;
        Intrinsics.checkNotNullExpressionValue(filterIv, "filterIv");
        initCountryFilterView(filterLl, filterTv, filterIv);
        GlTextView sortIv = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.sortIv;
        Intrinsics.checkNotNullExpressionValue(sortIv, "sortIv");
        sortIv.setVisibility(this.showSort ? 0 : 8);
        GlTextView sortIv2 = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.sortIv;
        Intrinsics.checkNotNullExpressionValue(sortIv2, "sortIv");
        initSortView(sortIv2, new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initOutPageSearchHeader$1
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
                if (i == 0) {
                    SimpleCollectionListFragment.access$getBinding(SimpleCollectionListFragment.this).outSearchBar.sortIv.setText(SimpleCollectionListFragment.this.getString(R.string.collections_sort_dateadded));
                } else {
                    SimpleCollectionListFragment.access$getBinding(SimpleCollectionListFragment.this).outSearchBar.sortIv.setText(SimpleCollectionListFragment.this.getString(R.string.collections_sort_releaseyear));
                }
            }
        });
    }

    private final void initCountryFilterView(View filterLL, final TextView filterTextView, final ImageView filterView) {
        ViewExtensionsKt.setSingleClickListener$default(filterLL, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initCountryFilterView$1
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
                SimpleCollectionListFragment.this.hideSoftInput();
                SimpleCollectionListFragment simpleCollectionListFragment = SimpleCollectionListFragment.this;
                list = simpleCollectionListFragment.allCollections;
                countryFilterData = simpleCollectionListFragment.getCountryFilterData(list);
                SimpleCollectionListFragment simpleCollectionListFragment2 = SimpleCollectionListFragment.this;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder showArrow = new GlToolTips.Builder(context).addDivider(true).setSelectable(true).setShowArrow(false);
                final SimpleCollectionListFragment simpleCollectionListFragment3 = SimpleCollectionListFragment.this;
                final ImageView imageView = filterView;
                final TextView textView = filterTextView;
                simpleCollectionListFragment2.filterToolTips = showArrow.setItems(countryFilterData, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initCountryFilterView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        String str;
                        EditText editText;
                        List list2;
                        String str2;
                        SimpleCollectionListFragment simpleCollectionListFragment4 = SimpleCollectionListFragment.this;
                        str = simpleCollectionListFragment4.pageName;
                        simpleCollectionListFragment4.logEvent(LogEvents.collectionsearch_country_click, BundleKt.bundleOf(TuplesKt.to("from", str)));
                        GlToolTipsItem glToolTipsItem = countryFilterData.get(position);
                        SimpleCollectionListFragment.this.currentIssuer = glToolTipsItem.getText();
                        RequestManager with = Glide.with(SimpleCollectionListFragment.this);
                        Object imageUrl = glToolTipsItem.getImageUrl();
                        if (imageUrl == null) {
                            imageUrl = glToolTipsItem.getDrawableRes();
                        }
                        with.load(imageUrl).into(imageView);
                        textView.setText(glToolTipsItem.getText());
                        int i = 0;
                        for (Object obj : countryFilterData) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ((GlToolTipsItem) obj).setSelected(i == position);
                            i = i2;
                        }
                        SimpleCollectionListFragment simpleCollectionListFragment5 = SimpleCollectionListFragment.this;
                        editText = simpleCollectionListFragment5.editText;
                        list2 = SimpleCollectionListFragment.this.allCollections;
                        str2 = SimpleCollectionListFragment.this.currentIssuer;
                        final SimpleCollectionListFragment simpleCollectionListFragment6 = SimpleCollectionListFragment.this;
                        simpleCollectionListFragment5.filter(editText, list2, str2, new Function1<List<? extends CollectionItem>, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initCountryFilterView$1$1$onClick$2
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
                                SimpleCollectionListFragment.this.updateAdapter(it2);
                            }
                        });
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteItem(int collectionId) {
        com.glority.android.ui.base.v2.BaseFragment.showProgress$default(this, null, false, 3, null);
        getVm().deleteCollectionItem(collectionId).observe(this, new SimpleCollectionListFragment$sam$androidx_lifecycle_Observer$0(new Function1<Status, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$deleteItem$1
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
                SimpleCollectionListFragment.this.hideProgress();
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void initSortView$default(SimpleCollectionListFragment simpleCollectionListFragment, View view, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        simpleCollectionListFragment.initSortView(view, function1);
    }

    private final void initSortView(View view, final Function1<? super Integer, Unit> selectedPosition) {
        ViewExtensionsKt.setSingleClickListener$default(view, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initSortView$1
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
                SimpleCollectionListFragment simpleCollectionListFragment = SimpleCollectionListFragment.this;
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder selectable = new GlToolTips.Builder(context).addDivider(true).setSelectable(true);
                sortData = SimpleCollectionListFragment.this.getSortData();
                final SimpleCollectionListFragment simpleCollectionListFragment2 = SimpleCollectionListFragment.this;
                final Function1<Integer, Unit> function1 = selectedPosition;
                simpleCollectionListFragment.sortToolTips = selectable.setItems(sortData, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$initSortView$1.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        List sortData2;
                        int i;
                        List sort;
                        sortData2 = SimpleCollectionListFragment.this.getSortData();
                        int i2 = 0;
                        for (Object obj : sortData2) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            ((GlToolTipsItem) obj).setSelected(i2 == position);
                            i2 = i3;
                        }
                        SimpleCollectionListFragment.this.currentSortType = position;
                        if (position == 0) {
                            SimpleCollectionListFragment.this.logEvent(LogEvents.collection_sort_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.customseriesfolder_sortbydateadd)));
                        } else {
                            SimpleCollectionListFragment.this.logEvent(LogEvents.collection_sort_click, BundleKt.bundleOf(TuplesKt.to("type", LogEvents.customseriesfolder_sortbyreleaseyear)));
                        }
                        Function1<Integer, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Integer.valueOf(position));
                        }
                        SimpleCollectionListFragment simpleCollectionListFragment3 = SimpleCollectionListFragment.this;
                        List<CollectionItem> data = simpleCollectionListFragment3.getAdapter().getData();
                        i = SimpleCollectionListFragment.this.currentSortType;
                        sort = simpleCollectionListFragment3.sort(data, i);
                        SimpleCollectionListFragment.this.updateAdapter(sort);
                        SimpleCollectionListFragment.access$getBinding(SimpleCollectionListFragment.this).rv.scrollToPosition(0);
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionItem> sort(List<CollectionItem> data, int sortType) {
        if (sortType != 0) {
            return sortType != 1 ? data : CollectionsKt.sortedWith(data, new Comparator() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$sort$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    String year = ((CollectionItem) t).getYear();
                    if (year == null) {
                        year = "2147483647";
                    }
                    String str = year;
                    String year2 = ((CollectionItem) t2).getYear();
                    return ComparisonsKt.compareValues(str, year2 != null ? year2 : "2147483647");
                }
            });
        }
        return CollectionsKt.sortedWith(data, new Comparator() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$sort$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(((CollectionItem) t2).getCollectionId()), Integer.valueOf(((CollectionItem) t).getCollectionId()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void filter(EditText editText, List<CollectionItem> data, String issuer, Function1<? super List<CollectionItem>, Unit> onResult) {
        Editable text;
        String obj;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.singleThread), null, null, new SimpleCollectionListFragment$filter$1((editText == null || (text = editText.getText()) == null || (obj = text.toString()) == null) ? null : StringsKt.trim((CharSequence) obj).toString(), data, issuer, this, onResult, null), 3, null);
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
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.glority.android.picturexx.view.me.SimpleCollectionListFragment$getCountryFilterData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((GlToolTipsItem) t).getText(), ((GlToolTipsItem) t2).getText());
                }
            });
        }
        arrayList.add(0, new GlToolTipsItem(this.countryFilterAll, Integer.valueOf(R.drawable.icon_price_scale_global), Intrinsics.areEqual(this.countryFilterAll, this.currentIssuer)));
        return arrayList;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        GlToolTips glToolTips = this.sortToolTips;
        if (glToolTips != null) {
            glToolTips.dismiss();
        }
        GlToolTips glToolTips2 = this.filterToolTips;
        if (glToolTips2 != null) {
            glToolTips2.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void visibleFilterBar(boolean visible) {
        try {
            int i = 0;
            if (this.isInPageSearch) {
                View root = ((FragmentSimpleCollectionListBinding) getBinding()).searchBar.getRoot();
                Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                if (!visible) {
                    i = 8;
                }
                root.setVisibility(i);
            } else {
                View root2 = ((FragmentSimpleCollectionListBinding) getBinding()).outSearchBar.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                if (!visible) {
                    i = 8;
                }
                root2.setVisibility(i);
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r1.getVisibility() == 0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isFilterBarVisible() {
        /*
            r4 = this;
            r0 = 0
            boolean r1 = r4.isInPageSearch     // Catch: java.lang.Throwable -> L34
            r2 = 1
            java.lang.String r3 = "getRoot(...)"
            if (r1 == 0) goto L1e
            androidx.viewbinding.ViewBinding r1 = r4.getBinding()     // Catch: java.lang.Throwable -> L34
            com.glority.android.picturexx.business.databinding.FragmentSimpleCollectionListBinding r1 = (com.glority.android.picturexx.business.databinding.FragmentSimpleCollectionListBinding) r1     // Catch: java.lang.Throwable -> L34
            com.glority.android.picturexx.business.databinding.ItemMeCollectionTopBarInpageBinding r1 = r1.searchBar     // Catch: java.lang.Throwable -> L34
            android.view.View r1 = r1.getRoot()     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.Throwable -> L34
            int r1 = r1.getVisibility()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L34
            goto L33
        L1e:
            androidx.viewbinding.ViewBinding r1 = r4.getBinding()     // Catch: java.lang.Throwable -> L34
            com.glority.android.picturexx.business.databinding.FragmentSimpleCollectionListBinding r1 = (com.glority.android.picturexx.business.databinding.FragmentSimpleCollectionListBinding) r1     // Catch: java.lang.Throwable -> L34
            com.glority.android.picturexx.business.databinding.ItemMeCollectionTopBarOutpageBinding r1 = r1.outSearchBar     // Catch: java.lang.Throwable -> L34
            android.view.View r1 = r1.getRoot()     // Catch: java.lang.Throwable -> L34
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.Throwable -> L34
            int r1 = r1.getVisibility()     // Catch: java.lang.Throwable -> L34
            if (r1 != 0) goto L34
        L33:
            r0 = r2
        L34:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.me.SimpleCollectionListFragment.isFilterBarVisible():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void visibleExportBar(boolean visible) {
        try {
            View root = getExportBar().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(visible ? 0 : 8);
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }
}
