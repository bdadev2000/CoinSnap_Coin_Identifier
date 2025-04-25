package com.glority.android.picturexx.view.search;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.core.app.ActivityOptionsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.FragmentCollectionSearchBinding;
import com.glority.android.picturexx.utils.RatingUtils;
import com.glority.android.picturexx.view.BaseCmsDetailFragment;
import com.glority.android.picturexx.vm.DetailViewModel;
import com.glority.android.ui.base.ContainerActivity;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.GetCmsNameMessage;
import com.glority.network.model.Resource;
import com.glority.network.model.Status;
import com.glority.utils.stability.LogUtils;
import com.glority.utils.ui.ToastUtils;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: SearchCmsDetailFragment.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0014R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/glority/android/picturexx/view/search/SearchCmsDetailFragment;", "Lcom/glority/android/picturexx/view/BaseCmsDetailFragment;", "Lcom/glority/android/picturexx/business/databinding/FragmentCollectionSearchBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/DetailViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/DetailViewModel;", "vm$delegate", "Lkotlin/Lazy;", Args.pageName, "", "pageFrom", "yearInput", "varietyUidInput", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initData", "getItemId", "", "()Ljava/lang/Long;", "setCustomExtraJsInjectVariable", "", "", "getLogPageName", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SearchCmsDetailFragment extends BaseCmsDetailFragment<FragmentCollectionSearchBinding> {
    private String varietyUidInput;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;
    private String yearInput;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private String pageName = "search";
    private String pageFrom = "search";

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public Long getItemId() {
        return null;
    }

    public SearchCmsDetailFragment() {
        final SearchCmsDetailFragment searchCmsDetailFragment = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(searchCmsDetailFragment, Reflection.getOrCreateKotlinClass(DetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.search.SearchCmsDetailFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.search.SearchCmsDetailFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = searchCmsDetailFragment.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.search.SearchCmsDetailFragment$special$$inlined$activityViewModels$default$3
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

    public final DetailViewModel getVm() {
        return (DetailViewModel) this.vm.getValue();
    }

    @Override // com.glority.base.fragment.BaseFragment, com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        String pageName;
        String pageName2;
        Bundle arguments = getArguments();
        if (arguments == null || (pageName = arguments.getString("from")) == null) {
            pageName = getPageName();
        }
        this.pageFrom = pageName;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (pageName2 = arguments2.getString(Args.pageName)) == null) {
            pageName2 = getPageName();
        }
        this.pageName = pageName2;
        Bundle arguments3 = getArguments();
        this.yearInput = arguments3 != null ? arguments3.getString(Args.ARG_YEAR) : null;
        Bundle arguments4 = getArguments();
        this.varietyUidInput = arguments4 != null ? arguments4.getString(Args.ARG_VARIETY_UID) : null;
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment
    public void initData() {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(Args.uid)) == null) {
            return;
        }
        updateCommonEventArgs(new Pair("from", this.pageFrom), new Pair(LogEventArguments.ARG_STRING_2, string));
        SearchCmsDetailFragment searchCmsDetailFragment = this;
        getVm().getCmsName(string).observe(searchCmsDetailFragment, new SearchCmsDetailFragment$sam$androidx_lifecycle_Observer$0(new Function1<Resource<? extends GetCmsNameMessage>, Unit>() { // from class: com.glority.android.picturexx.view.search.SearchCmsDetailFragment$initData$1
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
                if (resource.getStatus() == Status.SUCCESS) {
                    SearchCmsDetailFragment searchCmsDetailFragment2 = SearchCmsDetailFragment.this;
                    GetCmsNameMessage data = resource.getData();
                    BaseCmsDetailFragment.updateCmsUi$default(searchCmsDetailFragment2, data != null ? data.getCmsName() : null, null, null, null, null, null, 62, null);
                } else if (resource.getStatus() == Status.ERROR) {
                    ToastUtils.showError(R.string.text_error, new Object[0]);
                    FragmentActivity activity = SearchCmsDetailFragment.this.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                    }
                }
            }
        }));
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        Intrinsics.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, searchCmsDetailFragment, false, new Function1<OnBackPressedCallback, Unit>() { // from class: com.glority.android.picturexx.view.search.SearchCmsDetailFragment$initData$2
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
                final FragmentActivity activity = SearchCmsDetailFragment.this.getActivity();
                if (activity != null) {
                    if (RatingUtils.canShow$default(RatingUtils.INSTANCE, RatingUtils.FROM_COIN_GUIDE, null, 2, null)) {
                        RatingUtils.INSTANCE.show(activity, RatingUtils.FROM_COIN_GUIDE, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.search.SearchCmsDetailFragment$initData$2$1$1
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
    public Map<String, Object> setCustomExtraJsInjectVariable() {
        Pair[] pairArr = new Pair[1];
        Bundle arguments = getArguments();
        pairArr[0] = TuplesKt.to(Args.varietyUid, arguments != null ? arguments.getString(Args.varietyUid) : null);
        Map<String, Object> mutableMapOf = MapsKt.mutableMapOf(pairArr);
        String str = this.yearInput;
        if (str != null) {
            mutableMapOf.put(Args.year, str);
        }
        String str2 = this.varietyUidInput;
        if (str2 != null) {
            mutableMapOf.put("varietyId", str2);
        }
        return mutableMapOf;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.picturexx.view.BaseCmsDetailFragment, com.glority.android.ui.base.v2.BaseFragment
    /* renamed from: getLogPageName, reason: from getter */
    public String getPageName() {
        return this.pageName;
    }

    /* compiled from: SearchCmsDetailFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JR\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/glority/android/picturexx/view/search/SearchCmsDetailFragment$Companion;", "", "<init>", "()V", "openByUid", "", "activity", "Landroid/app/Activity;", Args.uid, "", Args.pageName, "pageFrom", Args.year, Args.varietyUid, "optionsCompat", "Landroidx/core/app/ActivityOptionsCompat;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void openByUid(Activity activity, String uid, String pageName, String pageFrom, String year, String varietyUid, ActivityOptionsCompat optionsCompat) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(uid, "uid");
            ContainerActivity.INSTANCE.open(SearchCmsDetailFragment.class).put(Args.uid, uid).put("from", pageFrom).put(Args.pageName, pageName).put(Args.ARG_YEAR, year).put(Args.ARG_VARIETY_UID, varietyUid).launch(activity, (Integer) 1000, optionsCompat);
        }
    }
}
