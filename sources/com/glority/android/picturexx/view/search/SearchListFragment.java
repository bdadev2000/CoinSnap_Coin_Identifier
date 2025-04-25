package com.glority.android.picturexx.view.search;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCustomSearchBinding;
import com.glority.android.picturexx.repository.SearchRepository;
import com.glority.android.picturexx.vm.HomeViewModel;
import com.glority.android.picturexx.widget.SearchComponentView;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.fragment.BaseFragment;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.CmsSearchMessage;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: SearchListFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u001e\u001a\u00020\u001aH\u0016J \u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u0017H\u0016J\b\u0010$\u001a\u00020\u001aH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006%"}, d2 = {"Lcom/glority/android/picturexx/view/search/SearchListFragment;", "Lcom/glority/base/fragment/BaseFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCustomSearchBinding;", "Lcom/glority/android/picturexx/widget/SearchComponentView$SearchCallback;", "<init>", "()V", "coinCatalogView", "Landroidx/recyclerview/widget/RecyclerView;", "vm", "Lcom/glority/android/picturexx/vm/HomeViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/HomeViewModel;", "vm$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "initView", "initListener", "searchEmptyView", "Landroid/view/View;", "noSearchDisplayView", "searchType", "", "doSearchBlocking", "", "Lcom/glority/android/picturexx/widget/SearchComponentView$SearchEntity;", "keyword", "onItemClick", "view", "position", "searchEntity", "clickBack", "getLogPageName", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SearchListFragment extends BaseFragment<FragmentCustomSearchBinding> implements SearchComponentView.SearchCallback {
    public static final int $stable = 8;
    private RecyclerView coinCatalogView;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    private final void initListener() {
    }

    public SearchListFragment() {
        final SearchListFragment searchListFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(searchListFragment, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.search.SearchListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.search.SearchListFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = searchListFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.search.SearchListFragment$special$$inlined$activityViewModels$default$3
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
    public static final /* synthetic */ FragmentCustomSearchBinding access$getBinding(SearchListFragment searchListFragment) {
        return (FragmentCustomSearchBinding) searchListFragment.getBinding();
    }

    private final HomeViewModel getVm() {
        return (HomeViewModel) this.vm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment
    protected int getLayoutId() {
        return R.layout.fragment_custom_search;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected void doCreateView(Bundle savedInstanceState) {
        initView();
        initListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        SearchListFragment searchListFragment = this;
        ((FragmentCustomSearchBinding) getBinding()).sv.init(this, LifecycleOwnerKt.getLifecycleScope(searchListFragment));
        requireActivity().getOnBackPressedDispatcher().addCallback(searchListFragment, new OnBackPressedCallback() { // from class: com.glority.android.picturexx.view.search.SearchListFragment$initView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                setEnabled(false);
                SearchComponentView searchComponentView = SearchListFragment.access$getBinding(SearchListFragment.this).sv;
                final SearchListFragment searchListFragment2 = SearchListFragment.this;
                searchComponentView.searchBarExpandAnimation(false, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.search.SearchListFragment$initView$1$handleOnBackPressed$1
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
                        FragmentActivity activity = SearchListFragment.this.getActivity();
                        if (activity != null) {
                            activity.onBackPressed();
                        }
                    }
                });
            }
        });
    }

    @Override // com.glority.android.picturexx.widget.SearchComponentView.SearchCallback
    public View searchEmptyView() {
        View inflate = getLayoutInflater().inflate(R.layout.item_custom_home_empty, (ViewGroup) null);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.glority.android.picturexx.widget.SearchComponentView.SearchCallback
    public View noSearchDisplayView() {
        return this.coinCatalogView;
    }

    @Override // com.glority.android.picturexx.widget.SearchComponentView.SearchCallback
    public String searchType() {
        return "SearchFragment";
    }

    @Override // com.glority.android.picturexx.widget.SearchComponentView.SearchCallback
    public List<SearchComponentView.SearchEntity> doSearchBlocking(String keyword) {
        List<IndexModel> indexModels;
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        logEvent(LogEvents.search_content_input, BundleKt.bundleOf(TuplesKt.to("content", keyword)));
        Resource<CmsSearchMessage> cmsSearchBlocking = SearchRepository.INSTANCE.cmsSearchBlocking(keyword, AppViewModel.INSTANCE.getInstance().getLanguageCode(), AppViewModel.INSTANCE.getInstance().getCountryCode());
        if (cmsSearchBlocking.getStatus() == Status.SUCCESS) {
            CmsSearchMessage data = cmsSearchBlocking.getData();
            List<IndexModel> indexModels2 = data != null ? data.getIndexModels() : null;
            if (indexModels2 == null || indexModels2.isEmpty()) {
                logEvent(LogEvents.searchresult_notfound_click, BundleKt.bundleOf(TuplesKt.to("key", keyword)));
            } else {
                logEvent(LogEvents.searchresult_found_click, BundleKt.bundleOf(TuplesKt.to("key", keyword)));
                CmsSearchMessage data2 = cmsSearchBlocking.getData();
                if (data2 == null || (indexModels = data2.getIndexModels()) == null) {
                    return new ArrayList();
                }
                List<IndexModel> list = indexModels;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (IndexModel indexModel : list) {
                    String[] strArr = new String[2];
                    Map<String, Object> fields = indexModel.getFields();
                    Object obj = fields != null ? fields.get("Year") : null;
                    strArr[0] = obj instanceof String ? (String) obj : null;
                    Map<String, Object> fields2 = indexModel.getFields();
                    Object obj2 = fields2 != null ? fields2.get("Composition") : null;
                    strArr[1] = obj2 instanceof String ? (String) obj2 : null;
                    List listOf = CollectionsKt.listOf((Object[]) strArr);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : listOf) {
                        String str = (String) obj3;
                        if (!(str == null || str.length() == 0)) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList.add(new SearchComponentView.SearchEntity(indexModel.getMainImageUrl(), CollectionsKt.joinToString$default(indexModel.getCommonNames(), ",", null, null, 0, null, null, 62, null), CollectionsKt.joinToString$default(arrayList2, ", ", null, null, 0, null, null, 62, null), indexModel.getUid()));
                }
                return arrayList;
            }
        }
        return new ArrayList();
    }

    @Override // com.glority.android.picturexx.widget.SearchComponentView.SearchCallback
    public void onItemClick(View view, int position, SearchComponentView.SearchEntity searchEntity) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(searchEntity, "searchEntity");
        ViewExtensionsKt.navigate$default(this, R.id.action_searchListFragment_to_searchDetailFragment, BundleKt.bundleOf(TuplesKt.to(Args.uid, searchEntity.getId()), TuplesKt.to("from", getPageName())), null, null, 12, null);
    }

    @Override // com.glority.android.picturexx.widget.SearchComponentView.SearchCallback
    public void clickBack(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        try {
            Boolean.valueOf(FragmentKt.findNavController(this).popBackStack());
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName */
    protected String getPageName() {
        return "search";
    }
}
