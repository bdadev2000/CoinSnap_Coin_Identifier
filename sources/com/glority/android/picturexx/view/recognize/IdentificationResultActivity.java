package com.glority.android.picturexx.view.recognize;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.webview.WebViewOpenRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.business.databinding.ActivityCustomIdentificationResultBinding;
import com.glority.android.picturexx.constants.BusinessConstants;
import com.glority.android.picturexx.repository.CmsRepository;
import com.glority.android.picturexx.utils.BillingPageOpenUtils;
import com.glority.android.picturexx.utils.RatingUtils;
import com.glority.android.picturexx.view.dialog.CoinSatisfactionSurveyDialog;
import com.glority.android.picturexx.view.dialog.WebSurveyDialog;
import com.glority.android.picturexx.view.recognize.IdentificationResultActivity;
import com.glority.android.picturexx.vm.IdentificationResultViewModel;
import com.glority.android.picturexx.vm.NoteSnapViewModel;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.Constants;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.abtest.CoinAbTestUtils;
import com.glority.base.activity.XBaseActivity;
import com.glority.base.utils.HandOnBundleUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.utils.stability.LogUtils;
import com.glority.widget.alert.GlAlert;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* compiled from: IdentificationResultActivity.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0014J\u0014\u0010\u001e\u001a\u00020\u00112\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110 J\b\u0010!\u001a\u00020\u0011H\u0016J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u0002H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006%"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/IdentificationResultActivity;", "Lcom/glority/base/activity/XBaseActivity;", "Lcom/glority/android/picturexx/business/databinding/ActivityCustomIdentificationResultBinding;", "<init>", "()V", "vm", "Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "getVm", "()Lcom/glority/android/picturexx/vm/IdentificationResultViewModel;", "vm$delegate", "Lkotlin/Lazy;", "noteSnapViewModel", "Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "getNoteSnapViewModel", "()Lcom/glority/android/picturexx/vm/NoteSnapViewModel;", "noteSnapViewModel$delegate", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "showDebugInfo", "getLayoutId", "", "getLogPageName", "", "showSurveyIfNeed", "", "onBack", "onBackPressed", "onDestroy", "identify", "callback", "Lkotlin/Function0;", "initData", "initView", "binding", "Companion", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class IdentificationResultActivity extends XBaseActivity<ActivityCustomIdentificationResultBinding> {
    private static List<CmsName> cmsNames;
    private static String denominationSideUrl;
    private static String grade;
    private static List<Long> itemIds;
    private static String mergeImage;
    private static List<Double> probabilities;
    private static String subjectSideUrl;
    private static Map<String, ? extends Object> uidYearDefaultVarietyUidMap;
    private static List<String> userImages;
    private static List<? extends File> userOriginalImages;
    private static Map<String, String> yearsBundle;

    /* renamed from: noteSnapViewModel$delegate, reason: from kotlin metadata */
    private final Lazy noteSnapViewModel;

    /* renamed from: vm$delegate, reason: from kotlin metadata */
    private final Lazy vm;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.glority.base.activity.XBaseActivity
    public void initData() {
    }

    @Override // com.glority.base.activity.XBaseActivity
    public void initView(ActivityCustomIdentificationResultBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    public IdentificationResultActivity() {
        final IdentificationResultActivity identificationResultActivity = this;
        final Function0 function0 = null;
        this.vm = new ViewModelLazy(Reflection.getOrCreateKotlinClass(IdentificationResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? identificationResultActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        this.noteSnapViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(NoteSnapViewModel.class), new Function0<ViewModelStore>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return ComponentActivity.this.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return ComponentActivity.this.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$special$$inlined$viewModels$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = Function0.this;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? identificationResultActivity.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
    }

    public final IdentificationResultViewModel getVm() {
        return (IdentificationResultViewModel) this.vm.getValue();
    }

    private final NoteSnapViewModel getNoteSnapViewModel() {
        return (NoteSnapViewModel) this.noteSnapViewModel.getValue();
    }

    @Override // com.glority.base.activity.XBaseActivity, com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        ArrayList arrayList;
        String str;
        int i;
        List<CmsName> list = cmsNames;
        getVm().setUidYearMap(yearsBundle);
        getVm().setGrade(grade);
        if (list != null) {
            getVm().getIdentificationResultLiveData().setValue(list);
            MutableLiveData<CmsName> currentCmsName = getVm().getCurrentCmsName();
            List<CmsName> value = getVm().getIdentificationResultLiveData().getValue();
            currentCmsName.setValue(value != null ? (CmsName) CollectionsKt.firstOrNull((List) value) : null);
            IdentificationResultViewModel vm = getVm();
            Map<String, String> uidYearMap = getVm().getUidYearMap();
            if (uidYearMap != null) {
                CmsName value2 = getVm().getCurrentCmsName().getValue();
                str = uidYearMap.get(value2 != null ? value2.getUid() : null);
            } else {
                str = null;
            }
            vm.setYear(str);
            if (CoinAbTestUtils.INSTANCE.enableValueChecker()) {
                i = R.navigation.nav_graph_identification_value_check;
            } else {
                i = R.navigation.nav_graph_identification_result;
            }
            NavHostFragment create$default = NavHostFragment.Companion.create$default(NavHostFragment.INSTANCE, i, null, 2, null);
            create$default.setArguments(HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, create$default.getArguments()));
            NavHostFragment navHostFragment = create$default;
            getSupportFragmentManager().beginTransaction().replace(R.id.fcv, navHostFragment).setPrimaryNavigationFragment(navHostFragment).commit();
        }
        IdentificationResultViewModel vm2 = getVm();
        ArrayList arrayList2 = userImages;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        vm2.setUserImages(arrayList2);
        getVm().getUserOriginalImages().clear();
        List<File> userOriginalImages2 = getVm().getUserOriginalImages();
        ArrayList arrayList3 = userOriginalImages;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
        }
        userOriginalImages2.addAll(arrayList3);
        IdentificationResultViewModel vm3 = getVm();
        ArrayList arrayList4 = itemIds;
        if (arrayList4 == null) {
            arrayList4 = new ArrayList();
        }
        vm3.setItemIds(arrayList4);
        getVm().setMergeImage(mergeImage);
        IdentificationResultViewModel vm4 = getVm();
        List<Double> list2 = probabilities;
        if (list2 == null || (arrayList = CollectionsKt.toMutableList((Collection) list2)) == null) {
            arrayList = new ArrayList();
        }
        vm4.setIdentificationProbabilities(arrayList);
        getVm().setSubjectSideUrl(subjectSideUrl);
        getVm().setDenominationSideUrl(denominationSideUrl);
        getVm().setUidYearDefaultVarietyUidMap(uidYearDefaultVarietyUidMap);
        showDebugInfo();
    }

    private final void showDebugInfo() {
        if (Intrinsics.areEqual(AppContext.INSTANCE.getConfig("ENV"), "stage")) {
            new GlAlert.Builder(this, GlAlert.DialogStyle.SYSTEM, 0, 4, null).setTitle("当前置信度").setMessage(String.valueOf(CollectionsKt.firstOrNull((List) getVm().getIdentificationProbabilities()))).setCancelable(true).show();
        }
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_custom_identification_result;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "IdentificationResultActivity";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean showSurveyIfNeed() {
        if (RatingUtils.INSTANCE.canShow("identify", CollectionsKt.maxOrNull((Iterable) getVm().getIdentificationProbabilities()))) {
            RatingUtils.INSTANCE.show(this, "identify", new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$showSurveyIfNeed$1
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
                    IdentificationResultActivity.this.onBack();
                }
            });
            return true;
        }
        if (WebSurveyDialog.INSTANCE.canShow()) {
            new WebSurveyDialog(this, new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$showSurveyIfNeed$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(1);
                }

                public final void invoke(boolean z) {
                    if (z) {
                        new WebViewOpenRequest(AppViewModel.INSTANCE.isVip() ? CoinAbTestUtils.INSTANCE.surveyVipUrl() : CoinAbTestUtils.INSTANCE.surveyNOVipUrl(), "", (Bundle) null, false, false, 28, (DefaultConstructorMarker) null).post();
                    }
                    IdentificationResultActivity.this.onBack();
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }
            }).show();
            return true;
        }
        if (CoinSatisfactionSurveyDialog.INSTANCE.canShow(((Number) PersistData.INSTANCE.get(Constants.recognizeCount, 0)).intValue(), AppViewModel.INSTANCE.isVip(), false)) {
            CoinSatisfactionSurveyDialog coinSatisfactionSurveyDialog = CoinSatisfactionSurveyDialog.INSTANCE;
            IdentificationResultActivity identificationResultActivity = this;
            Long l = (Long) CollectionsKt.firstOrNull((List) getVm().getItemIds());
            coinSatisfactionSurveyDialog.open(identificationResultActivity, LogEvents.result, l != null ? l.longValue() : 0L, ((Number) PersistData.INSTANCE.get(Constants.recognizeCount, 0)).intValue(), new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$showSurveyIfNeed$3
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
                    IdentificationResultActivity.this.onBack();
                }
            });
            return true;
        }
        onBack();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBack() {
        try {
            int intValue = ((Number) PersistData.INSTANCE.get("key_pre_recognize_count", 0)).intValue();
            boolean booleanValue = ((Boolean) PersistData.INSTANCE.get(BusinessConstants.KEY_NOTESNAP_AFTER_RECOGINZED_SHOWED, false)).booleanValue();
            if (intValue >= 3 && !booleanValue && !NoteSnapViewModel.INSTANCE.hasClickByUser() && NoteSnapViewModel.INSTANCE.enableNoteSnapOffer()) {
                PersistData.INSTANCE.set(BusinessConstants.KEY_NOTESNAP_AFTER_RECOGINZED_SHOWED, true);
                getNoteSnapViewModel().openConvertPage(this, LogEvents.result, new Function1<NoteSnapViewModel.DismissType, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$onBack$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(NoteSnapViewModel.DismissType dismissType) {
                        invoke2(dismissType);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(NoteSnapViewModel.DismissType it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        IdentificationResultActivity.this.finish();
                    }
                });
            } else {
                BillingPageOpenUtils.INSTANCE.showedFromRecognizeOrCollection("recognize");
                finish();
            }
            Unit unit = Unit.INSTANCE;
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        try {
            if (!getOnBackPressedDispatcher().getHasEnabledCallbacks()) {
                identify(new Function0<Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$onBackPressed$1
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
                        IdentificationResultActivity.this.showSurveyIfNeed();
                    }
                });
            } else {
                super.onBackPressed();
            }
        } catch (Throwable unused) {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.core.route.RouteableActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        PersistData persistData = PersistData.INSTANCE;
        Number maxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Number>) getVm().getIdentificationProbabilities());
        if (maxOrNull == null) {
            maxOrNull = 0;
        }
        persistData.set(RatingUtils.KEY_PRE_RECOGNIZE_PROBABILITY, maxOrNull);
        super.onDestroy();
    }

    public final void identify(Function0<Unit> callback) {
        String preferredName;
        Intrinsics.checkNotNullParameter(callback, "callback");
        CmsName value = getVm().getCurrentCmsName().getValue();
        List<CmsName> value2 = getVm().getIdentificationResultLiveData().getValue();
        if (Intrinsics.areEqual(value, value2 != null ? (CmsName) CollectionsKt.firstOrNull((List) value2) : null)) {
            callback.invoke();
            return;
        }
        CmsName value3 = getVm().getCurrentCmsName().getValue();
        if (value3 != null) {
            CmsRepository cmsRepository = CmsRepository.INSTANCE;
            List<Long> itemIds2 = getVm().getItemIds();
            String uid = value3.getUid();
            List<String> commonNames = value3.getName().getCommonNames();
            if (commonNames == null || (preferredName = (String) CollectionsKt.firstOrNull((List) commonNames)) == null) {
                preferredName = value3.getName().getPreferredName();
            }
            cmsRepository.changeItemCmsNameMessage(itemIds2, uid, preferredName);
            callback.invoke();
            return;
        }
        callback.invoke();
    }

    /* compiled from: IdentificationResultActivity.kt */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J®\u0001\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00052\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00052\b\u00108\u001a\u0004\u0018\u00010\f2\b\u0010 \u001a\u0004\u0018\u00010\f2\b\u0010#\u001a\u0004\u0018\u00010\f2\u0016\u00109\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u0001002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\f2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u000100R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR(\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010,\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR(\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0001\u0018\u000100X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010)\"\u0004\b2\u0010+¨\u0006:"}, d2 = {"Lcom/glority/android/picturexx/view/recognize/IdentificationResultActivity$Companion;", "", "<init>", "()V", "cmsNames", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCmsNames", "()Ljava/util/List;", "setCmsNames", "(Ljava/util/List;)V", "userImages", "", "getUserImages", "setUserImages", "userOriginalImages", "Ljava/io/File;", "getUserOriginalImages", "setUserOriginalImages", "itemIds", "", "getItemIds", "setItemIds", "probabilities", "", "getProbabilities", "setProbabilities", "mergeImage", "getMergeImage", "()Ljava/lang/String;", "setMergeImage", "(Ljava/lang/String;)V", Args.subjectSideUrl, "getSubjectSideUrl", "setSubjectSideUrl", Args.denominationSideUrl, "getDenominationSideUrl", "setDenominationSideUrl", "yearsBundle", "", "getYearsBundle", "()Ljava/util/Map;", "setYearsBundle", "(Ljava/util/Map;)V", "grade", "getGrade", "setGrade", "uidYearDefaultVarietyUidMap", "", "getUidYearDefaultVarietyUidMap", "setUidYearDefaultVarietyUidMap", "open", "", "context", "Landroid/content/Context;", "originalImages", "image", "years", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<CmsName> getCmsNames() {
            return IdentificationResultActivity.cmsNames;
        }

        public final void setCmsNames(List<CmsName> list) {
            IdentificationResultActivity.cmsNames = list;
        }

        public final List<String> getUserImages() {
            return IdentificationResultActivity.userImages;
        }

        public final void setUserImages(List<String> list) {
            IdentificationResultActivity.userImages = list;
        }

        public final List<File> getUserOriginalImages() {
            return IdentificationResultActivity.userOriginalImages;
        }

        public final void setUserOriginalImages(List<? extends File> list) {
            IdentificationResultActivity.userOriginalImages = list;
        }

        public final List<Long> getItemIds() {
            return IdentificationResultActivity.itemIds;
        }

        public final void setItemIds(List<Long> list) {
            IdentificationResultActivity.itemIds = list;
        }

        public final List<Double> getProbabilities() {
            return IdentificationResultActivity.probabilities;
        }

        public final void setProbabilities(List<Double> list) {
            IdentificationResultActivity.probabilities = list;
        }

        public final String getMergeImage() {
            return IdentificationResultActivity.mergeImage;
        }

        public final void setMergeImage(String str) {
            IdentificationResultActivity.mergeImage = str;
        }

        public final String getSubjectSideUrl() {
            return IdentificationResultActivity.subjectSideUrl;
        }

        public final void setSubjectSideUrl(String str) {
            IdentificationResultActivity.subjectSideUrl = str;
        }

        public final String getDenominationSideUrl() {
            return IdentificationResultActivity.denominationSideUrl;
        }

        public final void setDenominationSideUrl(String str) {
            IdentificationResultActivity.denominationSideUrl = str;
        }

        public final Map<String, String> getYearsBundle() {
            return IdentificationResultActivity.yearsBundle;
        }

        public final void setYearsBundle(Map<String, String> map) {
            IdentificationResultActivity.yearsBundle = map;
        }

        public final String getGrade() {
            return IdentificationResultActivity.grade;
        }

        public final void setGrade(String str) {
            IdentificationResultActivity.grade = str;
        }

        public final Map<String, Object> getUidYearDefaultVarietyUidMap() {
            return IdentificationResultActivity.uidYearDefaultVarietyUidMap;
        }

        public final void setUidYearDefaultVarietyUidMap(Map<String, ? extends Object> map) {
            IdentificationResultActivity.uidYearDefaultVarietyUidMap = map;
        }

        public final void open(Context context, List<CmsName> cmsNames, List<String> userImages, List<? extends File> originalImages, List<Long> itemIds, List<Double> probabilities, String image, String subjectSideUrl, String denominationSideUrl, Map<String, ? extends Object> years, String grade, Map<String, ? extends Object> uidYearDefaultVarietyUidMap) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(cmsNames, "cmsNames");
            Intrinsics.checkNotNullParameter(userImages, "userImages");
            Intrinsics.checkNotNullParameter(originalImages, "originalImages");
            Intrinsics.checkNotNullParameter(itemIds, "itemIds");
            setCmsNames(cmsNames);
            setUserImages(userImages);
            setUserOriginalImages(originalImages);
            setItemIds(itemIds);
            setProbabilities(probabilities);
            setMergeImage(image);
            setSubjectSideUrl(subjectSideUrl);
            setDenominationSideUrl(denominationSideUrl);
            setYearsBundle(new LinkedHashMap());
            if (years != null) {
                final IdentificationResultActivity$Companion$open$1 identificationResultActivity$Companion$open$1 = new Function2<String, Object, Unit>() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$Companion$open$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(String str, Object obj) {
                        invoke2(str, obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(String t, Object obj) {
                        Map<String, String> yearsBundle;
                        Intrinsics.checkNotNullParameter(t, "t");
                        if (!(obj instanceof String) || (yearsBundle = IdentificationResultActivity.INSTANCE.getYearsBundle()) == null) {
                            return;
                        }
                        yearsBundle.put(t, obj);
                    }
                };
                years.forEach(new BiConsumer() { // from class: com.glority.android.picturexx.view.recognize.IdentificationResultActivity$Companion$$ExternalSyntheticLambda0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        IdentificationResultActivity.Companion.open$lambda$0(Function2.this, obj, obj2);
                    }
                });
            }
            setGrade(grade);
            setUidYearDefaultVarietyUidMap(uidYearDefaultVarietyUidMap);
            context.startActivity(new Intent(context, (Class<?>) IdentificationResultActivity.class));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void open$lambda$0(Function2 tmp0, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke(obj, obj2);
        }
    }
}
