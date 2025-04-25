package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.glority.android.adapterhelper.BaseQuickAdapter;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.ext.ViewExtensionsKt;
import com.glority.android.database.DBManager;
import com.glority.android.database.entities.UserCustomSeriesItem;
import com.glority.android.picturexx.adapter.CustomSeriesAdapter;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.DialogChooseCustomSeriesBinding;
import com.glority.android.picturexx.definition.SelectableItem;
import com.glority.android.picturexx.view.dialog.CreateCustomSeriesDialog;
import com.glority.android.picturexx.vm.CustomSeriesViewModel;
import com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment;
import com.glority.android.xx.constants.LogEvents;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.GlTextView;
import com.glority.widget.tooltips.GlToolTips;
import com.glority.widget.tooltips.GlToolTipsItem;
import com.glority.widget.tooltips.GlToolTipsOnItemClickListener;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;
import com.picturecoin.generatedAPI.kotlinAPI.series.UserCustomSeries;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: ChooseCustomSeriesDialog.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u001aH\u0014J\u001a\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0012\u0010*\u001a\u00020+2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001e\u0010,\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015H\u0002J\b\u0010/\u001a\u00020\u0011H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ChooseCustomSeriesDialog;", "Lcom/glority/android/ui/base/v2/BaseBottomSheetDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/DialogChooseCustomSeriesBinding;", "<init>", "()V", "lastSeriesId", "", "Ljava/lang/Integer;", "vm", "Lcom/glority/android/picturexx/vm/CustomSeriesViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/CustomSeriesViewModel;", "vm$delegate", "Lkotlin/Lazy;", "chooseCallback", "Lkotlin/Function1;", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "", "customSeriesAdapter", "Lcom/glority/android/picturexx/adapter/CustomSeriesAdapter;", "sortTypeList", "", "Lcom/glority/widget/tooltips/GlToolTipsItem;", "originalCustomSeriesList", "currentSelectedId", "from", "", "sortType", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "doCreateView", "initData", "initEmptyDataView", "createNewSet", "initFullDataView", "getLogPageName", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "updateAdapter", "Lcom/glority/android/picturexx/vm/CustomSeriesViewModel$SortType;", "data", "onStart", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ChooseCustomSeriesDialog extends BaseBottomSheetDialogFragment<DialogChooseCustomSeriesBinding> {
    private Function1<? super UserCustomSeriesItem, Unit> chooseCallback;
    private String from;
    private int sortType;
    private List<GlToolTipsItem> sortTypeList;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final CustomSeriesAdapter customSeriesAdapter = new CustomSeriesAdapter(false);
    private List<UserCustomSeriesItem> originalCustomSeriesList = CollectionsKt.emptyList();
    private Integer lastSeriesId;
    private Integer currentSelectedId = this.lastSeriesId;

    /* compiled from: ChooseCustomSeriesDialog.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JL\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2#\u0010\f\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/ChooseCustomSeriesDialog$Companion;", "", "<init>", "()V", "open", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "currentSeriesId", "", "from", "", "chooseCallback", "Lkotlin/Function1;", "Lcom/glority/android/database/entities/UserCustomSeriesItem;", "Lkotlin/ParameterName;", "name", "item", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(FragmentManager fragmentManager, Integer currentSeriesId, String from, Function1<? super UserCustomSeriesItem, Unit> chooseCallback) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            Intrinsics.checkNotNullParameter(chooseCallback, "chooseCallback");
            try {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                ChooseCustomSeriesDialog chooseCustomSeriesDialog = new ChooseCustomSeriesDialog();
                chooseCustomSeriesDialog.chooseCallback = chooseCallback;
                chooseCustomSeriesDialog.from = from;
                chooseCustomSeriesDialog.lastSeriesId = currentSeriesId;
                chooseCustomSeriesDialog.currentSelectedId = currentSeriesId;
                Integer.valueOf(beginTransaction.add(chooseCustomSeriesDialog, "ChooseSeriesDialog").commitAllowingStateLoss());
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
            }
        }
    }

    public ChooseCustomSeriesDialog() {
        final ChooseCustomSeriesDialog chooseCustomSeriesDialog = this;
        final Function0 function0 = null;
        this.vm = FragmentViewModelLazyKt.createViewModelLazy(chooseCustomSeriesDialog, Reflection.getOrCreateKotlinClass(CustomSeriesViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = chooseCustomSeriesDialog.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$special$$inlined$activityViewModels$default$3
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
    public final CustomSeriesViewModel getVm() {
        return (CustomSeriesViewModel) this.vm.getValue();
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        updateCommonEventArgs(TuplesKt.to("from", this.from));
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        CustomSeriesViewModel vm = getVm();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        this.sortTypeList = vm.getFilterGlToolTipsItem(requireContext);
        initFullDataView();
        initData();
    }

    private final void initData() {
        DBManager.INSTANCE.getUserCustomSeriesItemDao().getAll().observe(this, new ChooseCustomSeriesDialog$sam$androidx_lifecycle_Observer$0(new Function1<List<? extends UserCustomSeriesItem>, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends UserCustomSeriesItem> list) {
                invoke2((List<UserCustomSeriesItem>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<UserCustomSeriesItem> list) {
                DialogChooseCustomSeriesBinding binding;
                DialogChooseCustomSeriesBinding binding2;
                DialogChooseCustomSeriesBinding binding3;
                DialogChooseCustomSeriesBinding binding4;
                CustomSeriesViewModel vm;
                int i;
                List list2;
                ChooseCustomSeriesDialog.this.originalCustomSeriesList = list;
                Intrinsics.checkNotNull(list);
                if (!list.isEmpty()) {
                    binding3 = ChooseCustomSeriesDialog.this.getBinding();
                    LinearLayout fullDataLayout = binding3.fullDataLayout;
                    Intrinsics.checkNotNullExpressionValue(fullDataLayout, "fullDataLayout");
                    fullDataLayout.setVisibility(0);
                    binding4 = ChooseCustomSeriesDialog.this.getBinding();
                    View root = binding4.emptyLayout.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    root.setVisibility(8);
                    ChooseCustomSeriesDialog.this.initFullDataView();
                    ChooseCustomSeriesDialog chooseCustomSeriesDialog = ChooseCustomSeriesDialog.this;
                    vm = chooseCustomSeriesDialog.getVm();
                    List<CustomSeriesViewModel.SortType> sortList = vm.getSortList();
                    i = ChooseCustomSeriesDialog.this.sortType;
                    CustomSeriesViewModel.SortType sortType = sortList.get(i);
                    list2 = ChooseCustomSeriesDialog.this.originalCustomSeriesList;
                    chooseCustomSeriesDialog.updateAdapter(sortType, list2);
                    return;
                }
                binding = ChooseCustomSeriesDialog.this.getBinding();
                LinearLayout fullDataLayout2 = binding.fullDataLayout;
                Intrinsics.checkNotNullExpressionValue(fullDataLayout2, "fullDataLayout");
                fullDataLayout2.setVisibility(8);
                binding2 = ChooseCustomSeriesDialog.this.getBinding();
                View root2 = binding2.emptyLayout.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                root2.setVisibility(0);
                ChooseCustomSeriesDialog.this.initEmptyDataView();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initEmptyDataView() {
        ImageView cancelIv = getBinding().emptyLayout.cancelIv;
        Intrinsics.checkNotNullExpressionValue(cancelIv, "cancelIv");
        ViewExtensionsKt.setSingleClickListener$default(cancelIv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initEmptyDataView$1
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
                ChooseCustomSeriesDialog.this.dismiss();
            }
        }, 1, (Object) null);
        getBinding().emptyLayout.createBt.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChooseCustomSeriesDialog.initEmptyDataView$lambda$0(ChooseCustomSeriesDialog.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEmptyDataView$lambda$0(ChooseCustomSeriesDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.logEvent(LogEvents.customseries_createnew_click, BundleKt.bundleOf(TuplesKt.to("from", this$0.getLogPageName() + "empty")));
        this$0.createNewSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createNewSet() {
        CreateCustomSeriesDialog.Companion companion = CreateCustomSeriesDialog.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.open(childFragmentManager, getLogPageName(), new Function1<UserCustomSeries, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$createNewSet$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(UserCustomSeries userCustomSeries) {
                invoke2(userCustomSeries);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(UserCustomSeries it) {
                CustomSeriesViewModel vm;
                int i;
                List list;
                Intrinsics.checkNotNullParameter(it, "it");
                ChooseCustomSeriesDialog.this.currentSelectedId = Integer.valueOf(it.getCustomSeriesId());
                ChooseCustomSeriesDialog chooseCustomSeriesDialog = ChooseCustomSeriesDialog.this;
                vm = chooseCustomSeriesDialog.getVm();
                List<CustomSeriesViewModel.SortType> sortList = vm.getSortList();
                i = ChooseCustomSeriesDialog.this.sortType;
                CustomSeriesViewModel.SortType sortType = sortList.get(i);
                list = ChooseCustomSeriesDialog.this.originalCustomSeriesList;
                chooseCustomSeriesDialog.updateAdapter(sortType, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initFullDataView() {
        MaterialButton createBt = getBinding().createBt;
        Intrinsics.checkNotNullExpressionValue(createBt, "createBt");
        ViewExtensionsKt.setSingleClickListener$default(createBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initFullDataView$1
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
                ChooseCustomSeriesDialog chooseCustomSeriesDialog = ChooseCustomSeriesDialog.this;
                chooseCustomSeriesDialog.logEvent(LogEvents.customseries_createnew_click, BundleKt.bundleOf(TuplesKt.to("from", chooseCustomSeriesDialog.getLogPageName())));
                ChooseCustomSeriesDialog.this.createNewSet();
            }
        }, 1, (Object) null);
        ImageView cancelIv = getBinding().cancelIv;
        Intrinsics.checkNotNullExpressionValue(cancelIv, "cancelIv");
        ViewExtensionsKt.setSingleClickListener$default(cancelIv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initFullDataView$2
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
                ChooseCustomSeriesDialog.this.dismiss();
            }
        }, 1, (Object) null);
        getBinding().rv.setAdapter(this.customSeriesAdapter);
        this.customSeriesAdapter.setOnItemClickListener(new Function3<BaseQuickAdapter<?, ?>, View, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initFullDataView$3
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
                CustomSeriesAdapter customSeriesAdapter;
                CustomSeriesAdapter customSeriesAdapter2;
                Integer num;
                Object obj;
                Integer num2;
                UserCustomSeriesItem userCustomSeriesItem;
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                Intrinsics.checkNotNullParameter(view, "view");
                customSeriesAdapter = ChooseCustomSeriesDialog.this.customSeriesAdapter;
                int i2 = 0;
                for (Object obj2 : customSeriesAdapter.getData()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    SelectableItem selectableItem = (SelectableItem) obj2;
                    boolean selected = selectableItem.getSelected();
                    if (selected && i2 == i) {
                        selectableItem.setSelected(false);
                    } else {
                        selectableItem.setSelected(i2 == i);
                    }
                    if (selected != selectableItem.getSelected()) {
                        adapter.notifyItemChanged(i2);
                    }
                    i2 = i3;
                }
                ChooseCustomSeriesDialog chooseCustomSeriesDialog = ChooseCustomSeriesDialog.this;
                customSeriesAdapter2 = chooseCustomSeriesDialog.customSeriesAdapter;
                Iterator<T> it = customSeriesAdapter2.getData().iterator();
                while (true) {
                    num = null;
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((SelectableItem) obj).getSelected()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                SelectableItem selectableItem2 = (SelectableItem) obj;
                if (selectableItem2 != null && (userCustomSeriesItem = selectableItem2.getUserCustomSeriesItem()) != null) {
                    num = Integer.valueOf(userCustomSeriesItem.getCustomSeriesId());
                }
                chooseCustomSeriesDialog.currentSelectedId = num;
                ChooseCustomSeriesDialog chooseCustomSeriesDialog2 = ChooseCustomSeriesDialog.this;
                num2 = chooseCustomSeriesDialog2.currentSelectedId;
                chooseCustomSeriesDialog2.logEvent(LogEvents.customseriespopup_item_click, BundleKt.bundleOf(TuplesKt.to("id", String.valueOf(num2))));
            }
        });
        GlTextView filterTv = getBinding().filterTv;
        Intrinsics.checkNotNullExpressionValue(filterTv, "filterTv");
        ViewExtensionsKt.setSingleClickListener$default(filterTv, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initFullDataView$4
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
                List<GlToolTipsItem> list;
                Intrinsics.checkNotNullParameter(it, "it");
                Context context = it.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                GlToolTips.Builder addDivider = new GlToolTips.Builder(context).setSelectable(true).setShowArrow(false).addDivider(true);
                list = ChooseCustomSeriesDialog.this.sortTypeList;
                if (list == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sortTypeList");
                    list = null;
                }
                final ChooseCustomSeriesDialog chooseCustomSeriesDialog = ChooseCustomSeriesDialog.this;
                addDivider.setItems(list, new GlToolTipsOnItemClickListener() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initFullDataView$4.1
                    @Override // com.glority.widget.tooltips.GlToolTipsOnItemClickListener
                    public void onClick(int position) {
                        DialogChooseCustomSeriesBinding binding;
                        List list2;
                        List list3;
                        CustomSeriesViewModel vm;
                        int i;
                        List list4;
                        binding = ChooseCustomSeriesDialog.this.getBinding();
                        GlTextView glTextView = binding.filterTv;
                        list2 = ChooseCustomSeriesDialog.this.sortTypeList;
                        List list5 = null;
                        if (list2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sortTypeList");
                            list2 = null;
                        }
                        glTextView.setText(((GlToolTipsItem) list2.get(position)).getText());
                        list3 = ChooseCustomSeriesDialog.this.sortTypeList;
                        if (list3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sortTypeList");
                        } else {
                            list5 = list3;
                        }
                        Iterator it2 = list5.iterator();
                        int i2 = 0;
                        while (true) {
                            boolean z = true;
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GlToolTipsItem glToolTipsItem = (GlToolTipsItem) next;
                            if (i2 != position) {
                                z = false;
                            }
                            glToolTipsItem.setSelected(z);
                            i2 = i3;
                        }
                        String str = LogEvents.customseries_sortbyupdate;
                        if (position != 0) {
                            if (position == 1) {
                                str = LogEvents.customseries_sortbycreate;
                            } else if (position == 2) {
                                str = "count";
                            }
                        }
                        ChooseCustomSeriesDialog.this.sortType = position;
                        ChooseCustomSeriesDialog chooseCustomSeriesDialog2 = ChooseCustomSeriesDialog.this;
                        vm = chooseCustomSeriesDialog2.getVm();
                        List<CustomSeriesViewModel.SortType> sortList = vm.getSortList();
                        i = ChooseCustomSeriesDialog.this.sortType;
                        CustomSeriesViewModel.SortType sortType = sortList.get(i);
                        list4 = ChooseCustomSeriesDialog.this.originalCustomSeriesList;
                        chooseCustomSeriesDialog2.updateAdapter(sortType, list4);
                        ChooseCustomSeriesDialog.this.logEvent(LogEvents.customseriespopup_filter_click, BundleKt.bundleOf(TuplesKt.to("type", str)));
                    }
                }).showLight(it, GlToolTips.Alignment.BOTTOM);
            }
        }, 1, (Object) null);
        GlTextView doneBt = getBinding().doneBt;
        Intrinsics.checkNotNullExpressionValue(doneBt, "doneBt");
        ViewExtensionsKt.setSingleClickListener$default(doneBt, 0L, new Function1<View, Unit>() { // from class: com.glority.android.picturexx.view.dialog.ChooseCustomSeriesDialog$initFullDataView$5
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
                Integer num;
                Integer num2;
                Function1 function1;
                Integer num3;
                List list;
                Object obj;
                Integer num4;
                Intrinsics.checkNotNullParameter(it, "it");
                ChooseCustomSeriesDialog chooseCustomSeriesDialog = ChooseCustomSeriesDialog.this;
                num = chooseCustomSeriesDialog.lastSeriesId;
                Pair pair = TuplesKt.to(LogEventArguments.ARG_STRING_1, String.valueOf(num));
                num2 = ChooseCustomSeriesDialog.this.currentSelectedId;
                chooseCustomSeriesDialog.logEvent(LogEvents.collectionedit_seriesdone_click, BundleKt.bundleOf(pair, TuplesKt.to(LogEventArguments.ARG_STRING_2, String.valueOf(num2))));
                function1 = ChooseCustomSeriesDialog.this.chooseCallback;
                if (function1 != null) {
                    list = ChooseCustomSeriesDialog.this.originalCustomSeriesList;
                    ChooseCustomSeriesDialog chooseCustomSeriesDialog2 = ChooseCustomSeriesDialog.this;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        int customSeriesId = ((UserCustomSeriesItem) obj).getCustomSeriesId();
                        num4 = chooseCustomSeriesDialog2.currentSelectedId;
                        if (num4 != null && customSeriesId == num4.intValue()) {
                            break;
                        }
                    }
                    function1.invoke(obj);
                }
                ChooseCustomSeriesDialog chooseCustomSeriesDialog3 = ChooseCustomSeriesDialog.this;
                num3 = chooseCustomSeriesDialog3.currentSelectedId;
                chooseCustomSeriesDialog3.logEvent(LogEvents.customseriespopup_done_click, BundleKt.bundleOf(TuplesKt.to("id", String.valueOf(num3))));
                ChooseCustomSeriesDialog.this.dismiss();
            }
        }, 1, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    public String getLogPageName() {
        return LogEvents.createseries;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseBottomSheetDialogFragment
    public DialogChooseCustomSeriesBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogChooseCustomSeriesBinding inflate = DialogChooseCustomSeriesBinding.inflate(inflater.cloneInContext(getActivity()), container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        if (getContext() == null) {
            Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
            Intrinsics.checkNotNullExpressionValue(onCreateDialog, "onCreateDialog(...)");
            return onCreateDialog;
        }
        return new BottomSheetDialog(requireContext(), R.style.TransparentBottomSheetStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateAdapter(CustomSeriesViewModel.SortType sortType, List<UserCustomSeriesItem> data) {
        List<UserCustomSeriesItem> mutableList = CollectionsKt.toMutableList((Collection) getVm().sort(sortType, CollectionsKt.toMutableList((Collection) data)));
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mutableList, 10));
        for (UserCustomSeriesItem userCustomSeriesItem : mutableList) {
            int customSeriesId = userCustomSeriesItem.getCustomSeriesId();
            Integer num = this.currentSelectedId;
            arrayList.add(new SelectableItem(userCustomSeriesItem, num != null && customSeriesId == num.intValue()));
        }
        this.customSeriesAdapter.setNewDiffData(getVm().getCustomSeriesDiff(arrayList));
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            ((BottomSheetDialog) dialog).setDismissWithAnimation(true);
        }
    }
}
