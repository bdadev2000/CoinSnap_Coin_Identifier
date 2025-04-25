package com.glority.android.picturexx.view.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.glority.android.picturexx.business.databinding.DialogEmptyComposeLayoutBinding;
import com.glority.android.picturexx.composable.CorrectResultComposablesKt;
import com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment;
import com.glority.android.ui.base.v2.BaseDialogFragment;
import com.glority.base.utils.StatusBarUtils;
import com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoinCorrectResultDialogFragment.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B\u001f\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u0017\b\u0016\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u001a\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\u0006\u0010\u001c\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CoinCorrectResultDialogFragment;", "Lcom/glority/android/ui/base/v2/BaseDialogFragment;", "Lcom/glority/android/picturexx/business/databinding/DialogEmptyComposeLayoutBinding;", "otherResults", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "onSearchResultClick", "Lcom/glority/android/picturexx/view/dialog/CoinCorrectResultDialogFragment$OnSearchResultClick;", "<init>", "(Ljava/util/List;Lcom/glority/android/picturexx/view/dialog/CoinCorrectResultDialogFragment$OnSearchResultClick;)V", "()V", "otherResult", "(Ljava/util/List;)V", "getLogPageName", "", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "onStart", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "onCloseClick", "searchIndexModelByText", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "searchText", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "indexModel", "Companion", "OnSearchResultClick", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class CoinCorrectResultDialogFragment extends BaseDialogFragment<DialogEmptyComposeLayoutBinding> {
    private final OnSearchResultClick onSearchResultClick;
    private final List<CmsName> otherResults;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CoinCorrectResultDialogFragment.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CoinCorrectResultDialogFragment$OnSearchResultClick;", "", "onClick", "", "dialogFragment", "Landroidx/fragment/app/DialogFragment;", "indexModel", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "onSuggest", "coinName", "", "coinYear", "onClose", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public interface OnSearchResultClick {
        void onClick(DialogFragment dialogFragment, IndexModel indexModel);

        void onClose(DialogFragment dialogFragment);

        void onSuggest(DialogFragment dialogFragment, String coinName, String coinYear);
    }

    @JvmStatic
    public static final void show(List<CmsName> list, FragmentManager fragmentManager, OnSearchResultClick onSearchResultClick) {
        INSTANCE.show(list, fragmentManager, onSearchResultClick);
    }

    public CoinCorrectResultDialogFragment(List<CmsName> otherResults, OnSearchResultClick onSearchResultClick) {
        Intrinsics.checkNotNullParameter(otherResults, "otherResults");
        this.otherResults = otherResults;
        this.onSearchResultClick = onSearchResultClick;
    }

    /* compiled from: CoinCorrectResultDialogFragment.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007¨\u0006\r"}, d2 = {"Lcom/glority/android/picturexx/view/dialog/CoinCorrectResultDialogFragment$Companion;", "", "<init>", "()V", "show", "", "otherResults", "", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "onSearchResultClick", "Lcom/glority/android/picturexx/view/dialog/CoinCorrectResultDialogFragment$OnSearchResultClick;", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final void show(List<CmsName> otherResults, FragmentManager fragmentManager, OnSearchResultClick onSearchResultClick) {
            Intrinsics.checkNotNullParameter(otherResults, "otherResults");
            if (fragmentManager == null) {
                return;
            }
            new CoinCorrectResultDialogFragment(otherResults, onSearchResultClick).show(fragmentManager, "__coin_correct_result_dialog_fragment__");
        }
    }

    public CoinCorrectResultDialogFragment() {
        this(CollectionsKt.emptyList());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoinCorrectResultDialogFragment(List<CmsName> otherResult) {
        this(otherResult, null);
        Intrinsics.checkNotNullParameter(otherResult, "otherResult");
    }

    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    protected String getLogPageName() {
        return "correct_result";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    public DialogEmptyComposeLayoutBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogEmptyComposeLayoutBinding inflate = DialogEmptyComposeLayoutBinding.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.height = (int) (getResources().getDisplayMetrics().heightPixels * 0.9d);
        attributes.width = getResources().getDisplayMetrics().widthPixels;
        attributes.gravity = 80;
        window.setAttributes(attributes);
    }

    @Override // com.glority.android.ui.base.v2.BaseDialogFragment
    protected void doCreateView(Bundle savedInstanceState) {
        getBinding().composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2031267477, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2031267477, i, -1, "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.<anonymous> (CoinCorrectResultDialogFragment.kt:83)");
                    }
                    final PagerState rememberPagerState = PagerStateKt.rememberPagerState(0, 0.0f, new Function0<Integer>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$pagerState$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Integer invoke() {
                            return 2;
                        }
                    }, composer, 384, 3);
                    ComposerKt.sourceInformationMarkerStart(composer, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(composer, -954367824, "CC(remember):Effects.kt#9igjgp");
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
                        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue = compositionScopedCoroutineScopeCanceller;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    final CoinCorrectResultDialogFragment coinCorrectResultDialogFragment = CoinCorrectResultDialogFragment.this;
                    PagerKt.m1222HorizontalPageroI3XNZo(rememberPagerState, null, null, null, 1, 0.0f, null, null, false, false, null, null, null, ComposableLambdaKt.composableLambda(composer, -156770423, true, new Function4<PagerScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(4);
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer2, Integer num2) {
                            invoke(pagerScope, num.intValue(), composer2, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PagerScope HorizontalPager, int i2, Composer composer2, int i3) {
                            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-156770423, i3, -1, "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.<anonymous>.<anonymous> (CoinCorrectResultDialogFragment.kt:90)");
                            }
                            if (i2 == 0) {
                                composer2.startReplaceableGroup(637214367);
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                C01091 c01091 = new C01091(CoinCorrectResultDialogFragment.this);
                                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CoinCorrectResultDialogFragment.this);
                                final CoinCorrectResultDialogFragment coinCorrectResultDialogFragment2 = CoinCorrectResultDialogFragment.this;
                                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer2, -36998771, true, new Function6<LazyItemScope, Modifier, String, IndexModel, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.3
                                    {
                                        super(6);
                                    }

                                    @Override // kotlin.jvm.functions.Function6
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Modifier modifier, String str, IndexModel indexModel, Composer composer3, Integer num) {
                                        invoke(lazyItemScope, modifier, str, indexModel, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyItemScope CorrectResultScreen, Modifier modifier, String searchText, IndexModel item, Composer composer3, int i4) {
                                        Intrinsics.checkNotNullParameter(CorrectResultScreen, "$this$CorrectResultScreen");
                                        Intrinsics.checkNotNullParameter(modifier, "modifier");
                                        Intrinsics.checkNotNullParameter(searchText, "searchText");
                                        Intrinsics.checkNotNullParameter(item, "item");
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-36998771, i4, -1, "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.<anonymous>.<anonymous>.<anonymous> (CoinCorrectResultDialogFragment.kt:97)");
                                        }
                                        final CoinCorrectResultDialogFragment coinCorrectResultDialogFragment3 = CoinCorrectResultDialogFragment.this;
                                        int i5 = i4 >> 3;
                                        CorrectResultComposablesKt.CorrectResultItem(modifier, searchText, item, new Function1<IndexModel, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.3.1
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(IndexModel indexModel) {
                                                invoke2(indexModel);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(IndexModel it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                CoinCorrectResultDialogFragment.this.onSearchResultClick(it);
                                            }
                                        }, composer3, (i5 & 14) | 512 | (i5 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                });
                                final CoinCorrectResultDialogFragment coinCorrectResultDialogFragment3 = CoinCorrectResultDialogFragment.this;
                                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer2, -1918004580, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.4
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                        invoke(columnScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(ColumnScope CorrectResultScreen, Composer composer3, int i4) {
                                        List list;
                                        List list2;
                                        Intrinsics.checkNotNullParameter(CorrectResultScreen, "$this$CorrectResultScreen");
                                        if ((i4 & 81) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1918004580, i4, -1, "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.<anonymous>.<anonymous>.<anonymous> (CoinCorrectResultDialogFragment.kt:102)");
                                            }
                                            list = CoinCorrectResultDialogFragment.this.otherResults;
                                            if (!list.isEmpty()) {
                                                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                                list2 = CoinCorrectResultDialogFragment.this.otherResults;
                                                final CoinCorrectResultDialogFragment coinCorrectResultDialogFragment4 = CoinCorrectResultDialogFragment.this;
                                                CorrectResultComposablesKt.OtherResultsLayout(fillMaxSize$default2, list2, new Function1<IndexModel, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.4.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ Unit invoke(IndexModel indexModel) {
                                                        invoke2(indexModel);
                                                        return Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(IndexModel it) {
                                                        Intrinsics.checkNotNullParameter(it, "it");
                                                        CoinCorrectResultDialogFragment.this.onSearchResultClick(it);
                                                    }
                                                }, composer3, 70);
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                });
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                final PagerState pagerState = rememberPagerState;
                                CorrectResultComposablesKt.CorrectResultScreen(fillMaxSize$default, c01091, composableLambda, composableLambda2, ComposableLambdaKt.composableLambda(composer2, -1340808867, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                                        invoke(columnScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(ColumnScope CorrectResultScreen, Composer composer3, int i4) {
                                        Intrinsics.checkNotNullParameter(CorrectResultScreen, "$this$CorrectResultScreen");
                                        if ((i4 & 81) != 16 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1340808867, i4, -1, "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.<anonymous>.<anonymous>.<anonymous> (CoinCorrectResultDialogFragment.kt:113)");
                                            }
                                            Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                            final CoroutineScope coroutineScope3 = CoroutineScope.this;
                                            final PagerState pagerState2 = pagerState;
                                            CorrectResultComposablesKt.NoResultsFound(fillMaxSize$default2, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.5.1
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
                                                /* compiled from: CoinCorrectResultDialogFragment.kt */
                                                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                                                @DebugMetadata(c = "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$1$5$1$1", f = "CoinCorrectResultDialogFragment.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$1$5$1$1, reason: invalid class name and collision with other inner class name */
                                                /* loaded from: classes5.dex */
                                                public static final class C01131 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                    final /* synthetic */ PagerState $pagerState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C01131(PagerState pagerState, Continuation<? super C01131> continuation) {
                                                        super(2, continuation);
                                                        this.$pagerState = pagerState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                                        return new C01131(this.$pagerState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                                        return ((C01131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final Object invokeSuspend(Object obj) {
                                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (PagerState.scrollToPage$default(this.$pagerState, 1, 0.0f, this, 2, null) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            ResultKt.throwOnFailure(obj);
                                                        }
                                                        return Unit.INSTANCE;
                                                    }
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C01131(pagerState2, null), 3, null);
                                                }
                                            }, composer3, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }
                                }), anonymousClass2, composer2, 290182);
                                composer2.endReplaceableGroup();
                            } else if (i2 == 1) {
                                composer2.startReplaceableGroup(637216085);
                                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                final CoroutineScope coroutineScope3 = coroutineScope;
                                final PagerState pagerState2 = rememberPagerState;
                                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.6
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
                                    /* compiled from: CoinCorrectResultDialogFragment.kt */
                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 82)
                                    @DebugMetadata(c = "com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$1$6$1", f = "CoinCorrectResultDialogFragment.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_HDMV_DTS}, m = "invokeSuspend", n = {}, s = {})
                                    /* renamed from: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$1$6$1, reason: invalid class name and collision with other inner class name */
                                    /* loaded from: classes5.dex */
                                    public static final class C01141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        final /* synthetic */ PagerState $pagerState;
                                        int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        C01141(PagerState pagerState, Continuation<? super C01141> continuation) {
                                            super(2, continuation);
                                            this.$pagerState = pagerState;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                            return new C01141(this.$pagerState, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                            return ((C01141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        public final Object invokeSuspend(Object obj) {
                                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                this.label = 1;
                                                if (PagerState.scrollToPage$default(this.$pagerState, 0, 0.0f, this, 2, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C01141(pagerState2, null), 3, null);
                                    }
                                };
                                final CoinCorrectResultDialogFragment coinCorrectResultDialogFragment4 = CoinCorrectResultDialogFragment.this;
                                CorrectResultComposablesKt.SuggestNameScreen(fillMaxSize$default2, function0, new Function2<String, String, Unit>() { // from class: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.doCreateView.1.1.7
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
                                        invoke2(str, str2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(String coinName, String year) {
                                        CoinCorrectResultDialogFragment.OnSearchResultClick onSearchResultClick;
                                        Intrinsics.checkNotNullParameter(coinName, "coinName");
                                        Intrinsics.checkNotNullParameter(year, "year");
                                        onSearchResultClick = CoinCorrectResultDialogFragment.this.onSearchResultClick;
                                        if (onSearchResultClick != null) {
                                            onSearchResultClick.onSuggest(CoinCorrectResultDialogFragment.this, coinName, year);
                                        }
                                    }
                                }, composer2, 6);
                                composer2.endReplaceableGroup();
                            } else {
                                composer2.startReplaceableGroup(637216782);
                                composer2.endReplaceableGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CoinCorrectResultDialogFragment.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                        /* renamed from: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$1$1, reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes5.dex */
                        public /* synthetic */ class C01091 extends FunctionReferenceImpl implements Function0<Unit> {
                            C01091(Object obj) {
                                super(0, obj, CoinCorrectResultDialogFragment.class, "onCloseClick", "onCloseClick()V", 0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ((CoinCorrectResultDialogFragment) this.receiver).onCloseClick();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: CoinCorrectResultDialogFragment.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
                        /* renamed from: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$doCreateView$1$1$2, reason: invalid class name */
                        /* loaded from: classes5.dex */
                        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function2<String, Continuation<? super List<? extends IndexModel>>, Object>, SuspendFunction {
                            AnonymousClass2(Object obj) {
                                super(2, obj, CoinCorrectResultDialogFragment.class, "searchIndexModelByText", "searchIndexModelByText(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super List<? extends IndexModel>> continuation) {
                                return invoke2(str, (Continuation<? super List<IndexModel>>) continuation);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(String str, Continuation<? super List<IndexModel>> continuation) {
                                Object searchIndexModelByText;
                                searchIndexModelByText = ((CoinCorrectResultDialogFragment) this.receiver).searchIndexModelByText(str, continuation);
                                return searchIndexModelByText;
                            }
                        }
                    }), composer, 100687872, 3072, 7918);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCloseClick() {
        OnSearchResultClick onSearchResultClick = this.onSearchResultClick;
        if (onSearchResultClick != null) {
            onSearchResultClick.onClose(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object searchIndexModelByText(java.lang.String r6, kotlin.coroutines.Continuation<? super java.util.List<com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$1
            if (r0 == 0) goto L14
            r0 = r7
            com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$1 r0 = (com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$1 r0 = new com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$1
            r0.<init>(r5, r7)
        L19:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.ResultKt.throwOnFailure(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$res$1 r2 = new com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment$searchIndexModelByText$res$1
            r4 = 0
            r2.<init>(r6, r4)
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.glority.network.model.Resource r7 = (com.glority.network.model.Resource) r7
            com.glority.network.model.Status r6 = r7.getStatus()
            com.glority.network.model.Status r0 = com.glority.network.model.Status.SUCCESS
            if (r6 != r0) goto L69
            java.lang.Object r6 = r7.getData()
            com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.CmsSearchMessage r6 = (com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.CmsSearchMessage) r6
            if (r6 == 0) goto L64
            java.util.List r6 = r6.getIndexModels()
            if (r6 != 0) goto L6d
        L64:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            goto L6d
        L69:
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.dialog.CoinCorrectResultDialogFragment.searchIndexModelByText(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSearchResultClick(IndexModel indexModel) {
        OnSearchResultClick onSearchResultClick = this.onSearchResultClick;
        if (onSearchResultClick != null) {
            onSearchResultClick.onClick(this, indexModel);
        }
    }
}
