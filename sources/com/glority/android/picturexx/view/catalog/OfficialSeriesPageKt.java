package com.glority.android.picturexx.view.catalog;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.os.BundleKt;
import androidx.navigation.NavController;
import androidx.profileinstaller.ProfileVerifier;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.amazonaws.services.s3.internal.Constants;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.compose.extensions.UnitExtensionsKt;
import com.glority.android.compose.ui.ImageKt;
import com.glority.android.compose.ui.popup.PopupKt;
import com.glority.android.compose.ui.popup.PopupState;
import com.glority.android.compose.utils.ComposeUtilsKt;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.theme.CoinColor;
import com.glority.android.picturexx.vm.SeriesViewModel;
import com.glority.android.picturexx.widget.CountrySearchBarKt;
import com.glority.android.picturexx.widget.CountrySearchBarState;
import com.glority.android.xx.constants.Args;
import com.glority.android.xx.constants.LogEvents;
import com.glority.base.routers.OpenBillingActivityRequest;
import com.glority.base.utils.NavigationAnimaUtils;
import com.glority.base.utils.StatusBarUtils;
import com.glority.base.viewmodel.AppViewModel;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OfficialSeriesPage.kt */
@Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aP\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0013¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00030\u0012H\u0003¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019\u001aK\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00132\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0003¢\u0006\u0002\u0010#\u001a7\u0010$\u001a\u00020\u00032\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010&\u001a\u00020'2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0012H\u0007¢\u0006\u0002\u0010)\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006*²\u0006\u0010\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\rX\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"requestOpenBillingCode", "", "OfficialSeriesPage", "", "seriesViewModel", "Lcom/glority/android/picturexx/vm/SeriesViewModel;", "navController", "Landroidx/navigation/NavController;", "(Lcom/glority/android/picturexx/vm/SeriesViewModel;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)V", "OfficialSeriesFilterBar", "currentCountry", "", "seriesFilterData", "", "Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesFilterData;", "countrySearchBarState", "Lcom/glority/android/picturexx/widget/CountrySearchBarState;", "onSetsChangeClick", "Lkotlin/Function1;", "Lcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;", "Lkotlin/ParameterName;", "name", "seriesType", "(Ljava/lang/String;Ljava/util/List;Lcom/glority/android/picturexx/widget/CountrySearchBarState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MyCollectionStatusEmpty", "(Landroidx/compose/runtime/Composer;I)V", "OfficialSeriesItem", "modifier", "Landroidx/compose/ui/Modifier;", "imageUrl", Args.title, "totalCount", "selectedCount", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;IILcom/glority/android/picturexx/vm/SeriesViewModel$SeriesType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SetsFilterDialog", "filterTypes", "popupState", "Lcom/glority/android/compose/ui/popup/PopupState;", "onSelectedType", "(Ljava/util/List;Lcom/glority/android/compose/ui/popup/PopupState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "businessMod_release", "displaySeriesList", "Lcom/glority/android/database/entities/SeriesItem;", "currentFilterType", "setsName"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class OfficialSeriesPageKt {
    private static final int requestOpenBillingCode = 302;

    public static final void OfficialSeriesPage(final SeriesViewModel seriesViewModel, final NavController navController, Composer composer, final int i) {
        Object obj;
        SeriesViewModel.SeriesType seriesType;
        Intrinsics.checkNotNullParameter(seriesViewModel, "seriesViewModel");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Composer startRestartGroup = composer.startRestartGroup(-265999370);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-265999370, i, -1, "com.glority.android.picturexx.view.catalog.OfficialSeriesPage (OfficialSeriesPage.kt:85)");
        }
        final State observeAsState = LiveDataAdapterKt.observeAsState(seriesViewModel.getRecommendSeriesListResponse(), CollectionsKt.emptyList(), startRestartGroup, 72);
        final MutableState<List<SeriesItem>> displaySeriesList = seriesViewModel.getDisplaySeriesList();
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Intrinsics.checkNotNull(consume, "null cannot be cast to non-null type android.app.Activity");
        final Activity activity = (Activity) consume;
        final int windowSizeClassMapper = ComposeUtilsKt.windowSizeClassMapper(1, startRestartGroup, 6);
        ProvidableCompositionLocal<FocusManager> localFocusManager = CompositionLocalsKt.getLocalFocusManager();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(localFocusManager);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final FocusManager focusManager = (FocusManager) consume2;
        ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localSoftwareKeyboardController);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new CountrySearchBarState(seriesViewModel.getFilterCountry().getValue(), null, false, true, 4, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final CountrySearchBarState countrySearchBarState = (CountrySearchBarState) rememberedValue;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Iterator<T> it = seriesViewModel.getSeriesFilterList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((SeriesViewModel.SeriesFilterData) obj).isSelected()) {
                        break;
                    }
                }
            }
            SeriesViewModel.SeriesFilterData seriesFilterData = (SeriesViewModel.SeriesFilterData) obj;
            if (seriesFilterData == null || (seriesType = seriesFilterData.getSeriesType()) == null) {
                seriesType = SeriesViewModel.SeriesType.OFFICIAL;
            }
            rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(seriesType, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState = (MutableState) rememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OfficialSeriesPageKt$OfficialSeriesPage$1(seriesViewModel, countrySearchBarState, mutableState, null), startRestartGroup, 70);
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new OfficialSeriesPageKt$OfficialSeriesPage$2(seriesViewModel, mutableState, null), startRestartGroup, 70);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        OfficialSeriesFilterBar(seriesViewModel.getFilterCountry().getValue(), seriesViewModel.getSeriesFilterList(), countrySearchBarState, new Function1<SeriesViewModel.SeriesType, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SeriesViewModel.SeriesType seriesType2) {
                invoke2(seriesType2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SeriesViewModel.SeriesType it2) {
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2 == SeriesViewModel.SeriesType.OFFICIAL) {
                    new LogEventRequest(LogEvents.series_allseries_click, null, 2, null).post();
                } else {
                    new LogEventRequest(LogEvents.series_myseries_click, null, 2, null).post();
                }
                mutableState.setValue(it2);
                SeriesViewModel.this.searchOfficialSeriesByCountry(countrySearchBarState.getSelectedCountry(), it2);
            }
        }, startRestartGroup, 448);
        if (OfficialSeriesPage$lambda$0(displaySeriesList).isEmpty() && OfficialSeriesPage$lambda$4(mutableState) == SeriesViewModel.SeriesType.USER && !countrySearchBarState.isFocused()) {
            startRestartGroup.startReplaceableGroup(18221767);
            MyCollectionStatusEmpty(startRestartGroup, 0);
            startRestartGroup.endReplaceableGroup();
        } else {
            startRestartGroup.startReplaceableGroup(18221822);
            AnimatedContentKt.AnimatedContent(Boolean.valueOf(countrySearchBarState.isFocused()), null, null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -2042217325, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2042217325, i2, -1, "com.glority.android.picturexx.view.catalog.OfficialSeriesPage.<anonymous>.<anonymous> (OfficialSeriesPage.kt:140)");
                    }
                    if (z) {
                        composer2.startReplaceableGroup(-296391538);
                        Modifier weight$default = ColumnScope.weight$default(ColumnScope.this, Modifier.INSTANCE, 1.0f, false, 2, null);
                        String selectedCountry = countrySearchBarState.getSelectedCountry();
                        String searchText = countrySearchBarState.getSearchText();
                        if (searchText == null) {
                            searchText = "";
                        }
                        List<SeriesItem> value = observeAsState.getValue();
                        final CountrySearchBarState countrySearchBarState2 = countrySearchBarState;
                        final SeriesViewModel seriesViewModel2 = seriesViewModel;
                        final FocusManager focusManager2 = focusManager;
                        final SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                        final MutableState<SeriesViewModel.SeriesType> mutableState2 = mutableState;
                        SelectedCountryViewKt.SelectedCountryView(weight$default, selectedCountry, searchText, value, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                                invoke2(str);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(String str) {
                                SeriesViewModel.SeriesType OfficialSeriesPage$lambda$4;
                                new LogEventRequest(LogEvents.series_country_click, BundleKt.bundleOf(TuplesKt.to(LogEventArguments.ARG_STRING_1, str))).post();
                                CountrySearchBarState.this.setSelectedCountry(str);
                                seriesViewModel2.getFilterCountry().setValue(str);
                                SeriesViewModel seriesViewModel3 = seriesViewModel2;
                                if (str == null) {
                                    str = "";
                                }
                                OfficialSeriesPage$lambda$4 = OfficialSeriesPageKt.OfficialSeriesPage$lambda$4(mutableState2);
                                seriesViewModel3.searchOfficialSeriesByCountry(str, OfficialSeriesPage$lambda$4);
                                CountrySearchBarState.this.setFocused(false);
                                FocusManager.clearFocus$default(focusManager2, false, 1, null);
                                SoftwareKeyboardController softwareKeyboardController3 = softwareKeyboardController2;
                                if (softwareKeyboardController3 != null) {
                                    softwareKeyboardController3.hide();
                                }
                            }
                        }, composer2, 4096);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(-296390578);
                        Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), CoinColor.INSTANCE.m7867colorF2F2F2WaAFU9c(composer2, 6), null, 2, null);
                        GridCells.Fixed fixed = new GridCells.Fixed(windowSizeClassMapper);
                        float f = 12;
                        PaddingValues m978PaddingValues0680j_4 = PaddingKt.m978PaddingValues0680j_4(Dp.m6997constructorimpl(f));
                        Arrangement.HorizontalOrVertical m865spacedBy0680j_4 = Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f));
                        Arrangement.HorizontalOrVertical m865spacedBy0680j_42 = Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(f));
                        final int i3 = windowSizeClassMapper;
                        final MutableState<List<SeriesItem>> mutableState3 = displaySeriesList;
                        final MutableState<SeriesViewModel.SeriesType> mutableState4 = mutableState;
                        final NavController navController2 = navController;
                        final Activity activity2 = activity;
                        LazyGridDslKt.LazyVerticalGrid(fixed, m540backgroundbw27NRU$default, null, m978PaddingValues0680j_4, false, m865spacedBy0680j_4, m865spacedBy0680j_42, null, false, new Function1<LazyGridScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
                                invoke2(lazyGridScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LazyGridScope LazyVerticalGrid) {
                                final List OfficialSeriesPage$lambda$0;
                                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                OfficialSeriesPage$lambda$0 = OfficialSeriesPageKt.OfficialSeriesPage$lambda$0(mutableState3);
                                final MutableState<SeriesViewModel.SeriesType> mutableState5 = mutableState4;
                                final NavController navController3 = navController2;
                                final Activity activity3 = activity2;
                                final OfficialSeriesPageKt$OfficialSeriesPage$3$2$2$invoke$$inlined$items$default$1 officialSeriesPageKt$OfficialSeriesPage$3$2$2$invoke$$inlined$items$default$1 = new Function1() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2$2$invoke$$inlined$items$default$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Void invoke(SeriesItem seriesItem) {
                                        return null;
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        return invoke((SeriesItem) obj2);
                                    }
                                };
                                LazyVerticalGrid.items(OfficialSeriesPage$lambda$0.size(), null, null, new Function1<Integer, Object>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2$2$invoke$$inlined$items$default$4
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                        return invoke(num.intValue());
                                    }

                                    public final Object invoke(int i4) {
                                        return Function1.this.invoke(OfficialSeriesPage$lambda$0.get(i4));
                                    }
                                }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2$2$invoke$$inlined$items$default$5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyGridItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(LazyGridItemScope lazyGridItemScope, int i4, Composer composer3, int i5) {
                                        int i6;
                                        SeriesViewModel.SeriesType OfficialSeriesPage$lambda$4;
                                        ComposerKt.sourceInformation(composer3, "C464@19670L22:LazyGridDsl.kt#7791vq");
                                        if ((i5 & 6) == 0) {
                                            i6 = (composer3.changed(lazyGridItemScope) ? 4 : 2) | i5;
                                        } else {
                                            i6 = i5;
                                        }
                                        if ((i5 & 48) == 0) {
                                            i6 |= composer3.changed(i4) ? 32 : 16;
                                        }
                                        if ((i6 & 147) == 146 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(699646206, i6, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
                                        }
                                        final SeriesItem seriesItem = (SeriesItem) OfficialSeriesPage$lambda$0.get(i4);
                                        Modifier m1016height3ABfNKs = SizeKt.m1016height3ABfNKs(LazyGridItemScope.animateItemPlacement$default(lazyGridItemScope, Modifier.INSTANCE, null, 1, null), Dp.m6997constructorimpl(120));
                                        String imageUrl = seriesItem.getImageUrl();
                                        if (imageUrl == null) {
                                            imageUrl = "";
                                        }
                                        String str = imageUrl;
                                        String title = seriesItem.getTitle();
                                        int totalNum = seriesItem.getTotalNum();
                                        Integer currentCount = seriesItem.getCurrentCount();
                                        int intValue = currentCount != null ? currentCount.intValue() : 0;
                                        OfficialSeriesPage$lambda$4 = OfficialSeriesPageKt.OfficialSeriesPage$lambda$4(mutableState5);
                                        final NavController navController4 = navController3;
                                        final Activity activity4 = activity3;
                                        final MutableState mutableState6 = mutableState5;
                                        OfficialSeriesPageKt.OfficialSeriesItem(m1016height3ABfNKs, str, title, totalNum, intValue, OfficialSeriesPage$lambda$4, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$3$2$2$1$1
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

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                SeriesViewModel.SeriesType OfficialSeriesPage$lambda$42;
                                                OfficialSeriesPage$lambda$42 = OfficialSeriesPageKt.OfficialSeriesPage$lambda$4(mutableState6);
                                                if (OfficialSeriesPage$lambda$42 == SeriesViewModel.SeriesType.USER) {
                                                    NavController navController5 = NavController.this;
                                                    Uri parse = Uri.parse("coin://series/detail?indexListUid=" + seriesItem.getIndexListUid() + "&amp;from=catalog&amp;seriesId=" + seriesItem.getSeriesId());
                                                    Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
                                                    navController5.navigate(parse, NavigationAnimaUtils.INSTANCE.getSlideAnima(activity4));
                                                    return;
                                                }
                                                NavController navController6 = NavController.this;
                                                Uri parse2 = Uri.parse("coin://series/introduce?indexListUid=" + seriesItem.getIndexListUid() + "&amp;from=catalog");
                                                Intrinsics.checkNotNullExpressionValue(parse2, "parse(this)");
                                                navController6.navigate(parse2, NavigationAnimaUtils.INSTANCE.getSlideAnima(activity4));
                                            }
                                        }, composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }));
                                LazyGridScope.items$default(LazyVerticalGrid, i3, null, null, null, ComposableSingletons$OfficialSeriesPageKt.INSTANCE.m7879getLambda1$businessMod_release(), 14, null);
                            }
                        }, composer2, 1772544, Constants.NO_SUCH_BUCKET_STATUS_CODE);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), startRestartGroup, 1572864, 62);
            startRestartGroup.endReplaceableGroup();
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesPage$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    OfficialSeriesPageKt.OfficialSeriesPage(SeriesViewModel.this, navController, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OfficialSeriesFilterBar(final String str, final List<SeriesViewModel.SeriesFilterData> list, final CountrySearchBarState countrySearchBarState, final Function1<? super SeriesViewModel.SeriesType, Unit> function1, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1504026644);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1504026644, i, -1, "com.glority.android.picturexx.view.catalog.OfficialSeriesFilterBar (OfficialSeriesPage.kt:210)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotIntStateKt.mutableIntStateOf(R.string.catalog_officialseries_option_mycollectingstatus);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        MutableIntState mutableIntState = (MutableIntState) rememberedValue;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new PopupState(false, 1, null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final PopupState popupState = (PopupState) rememberedValue2;
        float f = 16;
        AnimatedContentKt.AnimatedContent(countrySearchBarState, SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(f), 0.0f, Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(f), 2, null), 0.0f, 1, null), null, null, null, null, ComposableLambdaKt.composableLambda(startRestartGroup, -717065763, true, new Function4<AnimatedContentScope, CountrySearchBarState, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, CountrySearchBarState countrySearchBarState2, Composer composer2, Integer num) {
                invoke(animatedContentScope, countrySearchBarState2, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, CountrySearchBarState it, Composer composer2, int i2) {
                int i3;
                Object countryFlagIconUrl;
                Object obj;
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(it, "it");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-717065763, i2, -1, "com.glority.android.picturexx.view.catalog.OfficialSeriesFilterBar.<anonymous> (OfficialSeriesPage.kt:220)");
                }
                if (it.isFocused()) {
                    composer2.startReplaceableGroup(2062326963);
                    CountrySearchBarKt.CountrySearchBar(null, CountrySearchBarState.this, true, new Function1<Boolean, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                            invoke(bool.booleanValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z) {
                            if (z) {
                                new LogEventRequest(LogEvents.series_search_click, null, 2, null).post();
                            }
                        }
                    }, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$1.2
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            new LogEventRequest(LogEvents.series_flag_click, null, 2, null).post();
                        }
                    }, null, composer2, 28032, 33);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(2062327436);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                    final CountrySearchBarState countrySearchBarState2 = CountrySearchBarState.this;
                    final PopupState popupState2 = popupState;
                    String str2 = str;
                    List<SeriesViewModel.SeriesFilterData> list2 = list;
                    Function1<SeriesViewModel.SeriesType, Unit> function12 = function1;
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier clip = ClipKt.clip(BackgroundKt.m539backgroundbw27NRU(SizeKt.m1035width3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(120)), CoinColor.INSTANCE.m7869colorF5F5F5WaAFU9c(composer2, 6), MaterialTheme.INSTANCE.getShapes(composer2, MaterialTheme.$stable).getExtraSmall()), RoundedCornerShapeKt.getCircleShape());
                    composer2.startReplaceableGroup(-757570167);
                    boolean changed = composer2.changed(countrySearchBarState2);
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$1$3$1$1
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
                                new LogEventRequest(LogEvents.series_countryfilter_click, null, 2, null).post();
                                CountrySearchBarState.this.setFocused(true);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    composer2.endReplaceableGroup();
                    float f2 = 12;
                    Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(ClickableKt.m573clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue3, 7, null), Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(10));
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m986paddingVpY3zN4);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(46782102);
                    if (str2 == null) {
                        i3 = 0;
                        countryFlagIconUrl = UnitExtensionsKt.getPr(R.drawable.icon_price_scale_global, composer2, 0);
                    } else {
                        i3 = 0;
                        countryFlagIconUrl = CmsDataUtils.INSTANCE.getCountryFlagIconUrl(str2);
                    }
                    composer2.endReplaceableGroup();
                    int i4 = i3;
                    ImageKt.GlImage(countryFlagIconUrl, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(14)), 0.0f, null, 0.0f, null, null, null, null, null, composer2, 56, 1020);
                    composer2.startReplaceableGroup(46782403);
                    String sr = str2 == null ? UnitExtensionsKt.getSr(R.string.myseries_btn_all, composer2, i4) : str2;
                    composer2.endReplaceableGroup();
                    TextKt.m3014Text4IGK_g(sr, PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), CoinColor.INSTANCE.m7873textColor33WaAFU9c(composer2, 6), TextUnitKt.getSp(14), (FontStyle) null, new FontWeight(600), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199728, 0, 131024);
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                    IconKt.m2470Iconww6aTOc(UnitExtensionsKt.getPr(R.drawable.icon_search, composer2, 0), (String) null, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f2)), CoinColor.INSTANCE.m7866blackWaAFU9c(composer2, 6), composer2, 440, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composer2.startReplaceableGroup(-757568648);
                    boolean changed2 = composer2.changed(popupState2);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (changed2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$1$3$3$1
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
                                new LogEventRequest(LogEvents.series_filter_click, null, 2, null).post();
                                PopupState.this.setVisible(true);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    Modifier m573clickableXHw0xAI$default = ClickableKt.m573clickableXHw0xAI$default(fillMaxWidth$default, false, null, null, (Function0) rememberedValue4, 7, null);
                    Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                    Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(end, centerVertically3, composer2, 54);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m573clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl3 = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl3, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                    Iterator<T> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (((SeriesViewModel.SeriesFilterData) obj).isSelected()) {
                                break;
                            }
                        }
                    }
                    SeriesViewModel.SeriesFilterData seriesFilterData = (SeriesViewModel.SeriesFilterData) obj;
                    Integer valueOf = seriesFilterData != null ? Integer.valueOf(seriesFilterData.getName()) : null;
                    composer2.startReplaceableGroup(46783652);
                    String rs = valueOf != null ? UnitExtensionsKt.getRs(valueOf.intValue(), composer2, 0) : null;
                    composer2.endReplaceableGroup();
                    TextKt.m3014Text4IGK_g(rs == null ? "" : rs, (Modifier) null, CoinColor.INSTANCE.m7873textColor33WaAFU9c(composer2, 6), TextUnitKt.getSp(14), (FontStyle) null, new FontWeight(600), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6865getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130514);
                    ComposerKt.sourceInformationMarkerStart(composer2, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer m4008constructorimpl4 = Updater.m4008constructorimpl(composer2);
                    Updater.m4015setimpl(m4008constructorimpl4, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer2.startReplaceableGroup(1360706019);
                    if (popupState2.isVisible()) {
                        OfficialSeriesPageKt.SetsFilterDialog(list2, popupState2, function12, composer2, 56);
                    }
                    composer2.endReplaceableGroup();
                    IconKt.m2470Iconww6aTOc(UnitExtensionsKt.getPr(R.drawable.icon_smal_smal_down_arrow, composer2, 0), (String) null, SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(6), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(8)), CoinColor.INSTANCE.m7866blackWaAFU9c(composer2, 6), composer2, 440, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, ((i >> 6) & 14) | 1572912, 60);
        Unit unit = Unit.INSTANCE;
        startRestartGroup.startReplaceableGroup(-757567320);
        boolean changed = startRestartGroup.changed(mutableIntState) | startRestartGroup.changedInstance(function1);
        OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1 rememberedValue3 = startRestartGroup.rememberedValue();
        if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new OfficialSeriesPageKt$OfficialSeriesFilterBar$2$1(function1, mutableIntState, null);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, startRestartGroup, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesFilterBar$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    OfficialSeriesPageKt.OfficialSeriesFilterBar(str, list, countrySearchBarState, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MyCollectionStatusEmpty(Composer composer, final int i) {
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(703222504);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(703222504, i, -1, "com.glority.android.picturexx.view.catalog.MyCollectionStatusEmpty (OfficialSeriesPage.kt:321)");
            }
            float f = 16;
            Modifier m989paddingqDBjuR0$default = PaddingKt.m989paddingqDBjuR0$default(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), CoinColor.INSTANCE.m7867colorF2F2F2WaAFU9c(startRestartGroup, 6), null, 2, null), Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(50), Dp.m6997constructorimpl(f), 0.0f, 8, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m989paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m4008constructorimpl = Updater.m4008constructorimpl(startRestartGroup);
            Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            androidx.compose.foundation.ImageKt.Image(UnitExtensionsKt.getPr(R.drawable.icon_my_official_series_empty, startRestartGroup, 0), (String) null, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(122)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            String sr = UnitExtensionsKt.getSr(R.string.catalog_officialseries_caption_nocollectionyet, startRestartGroup, 0);
            long m7866blackWaAFU9c = CoinColor.INSTANCE.m7866blackWaAFU9c(startRestartGroup, 6);
            long sp = TextUnitKt.getSp(18);
            FontWeight fontWeight = new FontWeight(600);
            float f2 = 55;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(sr, PaddingKt.m989paddingqDBjuR0$default(companion, Dp.m6997constructorimpl(f2), Dp.m6997constructorimpl(8), Dp.m6997constructorimpl(f2), 0.0f, 8, null), m7866blackWaAFU9c, sp, (FontStyle) null, fontWeight, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 130512);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$MyCollectionStatusEmpty$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i2) {
                    OfficialSeriesPageKt.MyCollectionStatusEmpty(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OfficialSeriesItem(final Modifier modifier, final String str, final String str2, final int i, final int i2, final SeriesViewModel.SeriesType seriesType, final Function0<Unit> function0, Composer composer, final int i3) {
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-452122938);
        if ((i3 & 14) == 0) {
            i4 = (startRestartGroup.changed(modifier) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i4 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i3 & 7168) == 0) {
            i4 |= startRestartGroup.changed(i) ? 2048 : 1024;
        }
        if ((57344 & i3) == 0) {
            i4 |= startRestartGroup.changed(i2) ? 16384 : 8192;
        }
        if ((458752 & i3) == 0) {
            i4 |= startRestartGroup.changed(seriesType) ? 131072 : 65536;
        }
        if ((3670016 & i3) == 0) {
            i4 |= startRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((2995931 & i4) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-452122938, i4, -1, "com.glority.android.picturexx.view.catalog.OfficialSeriesItem (OfficialSeriesPage.kt:355)");
            }
            CornerBasedShape extraSmall = MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getExtraSmall();
            startRestartGroup.startReplaceableGroup(-757565817);
            boolean changedInstance = startRestartGroup.changedInstance(function0);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesItem$1$1
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

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function0.invoke();
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            CardKt.Card(ClickableKt.m573clickableXHw0xAI$default(modifier, false, null, null, (Function0) rememberedValue, 7, null), extraSmall, CardDefaults.INSTANCE.m2150cardColorsro_MJ88(CoinColor.INSTANCE.m7875whiteWaAFU9c(startRestartGroup, 6), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1697442360, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesItem$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1697442360, i5, -1, "com.glority.android.picturexx.view.catalog.OfficialSeriesItem.<anonymous> (OfficialSeriesPage.kt:364)");
                        }
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        String str3 = str;
                        String str4 = str2;
                        SeriesViewModel.SeriesType seriesType2 = seriesType;
                        int i6 = i2;
                        int i7 = i;
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, fillMaxSize$default);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4008constructorimpl = Updater.m4008constructorimpl(composer2);
                        Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        float f = 16;
                        Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(SizeKt.fillMaxHeight$default(RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), Dp.m6997constructorimpl(f), Dp.m6997constructorimpl(f));
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, Alignment.INSTANCE.getStart(), composer2, 6);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, m986paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer2);
                        Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m3014Text4IGK_g(str4, (Modifier) null, CoinColor.INSTANCE.m7866blackWaAFU9c(composer2, 6), TextUnitKt.getSp(18), (FontStyle) null, new FontWeight(700), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m6914getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 3120, 120786);
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                        ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        Composer m4008constructorimpl3 = Updater.m4008constructorimpl(composer2);
                        Updater.m4015setimpl(m4008constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m3014Text4IGK_g((seriesType2 == SeriesViewModel.SeriesType.USER ? i6 + RemoteSettings.FORWARD_SLASH_STRING : "") + i7 + " " + UnitExtensionsKt.getSr(R.string.collection_customsets_caption_coins, composer2, 0), (Modifier) null, CoinColor.INSTANCE.m7874textColor66WaAFU9c(composer2, 6), TextUnitKt.getSp(16), (FontStyle) null, new FontWeight(500), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131026);
                        IconKt.m2470Iconww6aTOc(UnitExtensionsKt.getPr(R.drawable.icon_detail_arrows711, composer2, 0), (String) null, SizeKt.m1030size3ABfNKs(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6997constructorimpl(4), 0.0f, 0.0f, 0.0f, 14, null), Dp.m6997constructorimpl(10)), CoinColor.INSTANCE.m7874textColor66WaAFU9c(composer2, 6), composer2, 440, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ImageKt.GlImage(str3, OffsetKt.m946offsetVpY3zN4$default(SizeKt.m1030size3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(90)), Dp.m6997constructorimpl(0), 0.0f, 2, null), 0.0f, null, 0.0f, null, null, null, null, null, composer2, 48, 1020);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$OfficialSeriesItem$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    OfficialSeriesPageKt.OfficialSeriesItem(Modifier.this, str, str2, i, i2, seriesType, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
                }
            });
        }
    }

    public static final void SetsFilterDialog(final List<SeriesViewModel.SeriesFilterData> filterTypes, final PopupState popupState, final Function1<? super SeriesViewModel.SeriesType, Unit> onSelectedType, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(filterTypes, "filterTypes");
        Intrinsics.checkNotNullParameter(popupState, "popupState");
        Intrinsics.checkNotNullParameter(onSelectedType, "onSelectedType");
        Composer startRestartGroup = composer.startRestartGroup(1062686838);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1062686838, i, -1, "com.glority.android.picturexx.view.catalog.SetsFilterDialog (OfficialSeriesPage.kt:414)");
        }
        startRestartGroup.startReplaceableGroup(-757563741);
        boolean changed = startRestartGroup.changed(popupState);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$SetsFilterDialog$1$1
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
                    PopupState.this.setVisible(false);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        PopupKt.GlPopup(null, popupState, (Function0) rememberedValue, null, ComposableLambdaKt.composableLambda(startRestartGroup, -1009255682, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$SetsFilterDialog$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope GlPopup, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(GlPopup, "$this$GlPopup");
                if ((i2 & 81) != 16 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1009255682, i2, -1, "com.glority.android.picturexx.view.catalog.SetsFilterDialog.<anonymous> (OfficialSeriesPage.kt:418)");
                    }
                    final List<SeriesViewModel.SeriesFilterData> list = filterTypes;
                    final PopupState popupState2 = popupState;
                    final Function1<SeriesViewModel.SeriesType, Unit> function1 = onSelectedType;
                    CardKt.Card(null, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, -1313825844, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$SetsFilterDialog$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                            invoke(columnScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Card, Composer composer3, int i3) {
                            Composer composer4 = composer3;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            int i4 = 16;
                            if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1313825844, i3, -1, "com.glority.android.picturexx.view.catalog.SetsFilterDialog.<anonymous>.<anonymous> (OfficialSeriesPage.kt:419)");
                                }
                                int i5 = 6;
                                Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(Modifier.INSTANCE, CoinColor.INSTANCE.m7875whiteWaAFU9c(composer4, 6), null, 2, null);
                                final List<SeriesViewModel.SeriesFilterData> list2 = list;
                                final PopupState popupState3 = popupState2;
                                final Function1<SeriesViewModel.SeriesType, Unit> function12 = function1;
                                ComposerKt.sourceInformationMarkerStart(composer4, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                                int i6 = -1323940314;
                                String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                                ComposerKt.sourceInformationMarkerStart(composer4, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer4, m540backgroundbw27NRU$default);
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                                ComposerKt.sourceInformationMarkerStart(composer4, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer3.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer m4008constructorimpl = Updater.m4008constructorimpl(composer3);
                                Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer4, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(1023072106);
                                for (final SeriesViewModel.SeriesFilterData seriesFilterData : list2) {
                                    Modifier m985padding3ABfNKs = PaddingKt.m985padding3ABfNKs(ClickableKt.m573clickableXHw0xAI$default(SizeKt.m1037widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION), 0.0f, 2, null), false, null, null, new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$SetsFilterDialog$2$1$1$1$1
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
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
                                            if (SeriesViewModel.SeriesFilterData.this.getSeriesType() == SeriesViewModel.SeriesType.USER && !AppViewModel.INSTANCE.isVip()) {
                                                new OpenBillingActivityRequest("officialseries", "100051", 302).post();
                                                return;
                                            }
                                            popupState3.setVisible(false);
                                            List<SeriesViewModel.SeriesFilterData> list3 = list2;
                                            SeriesViewModel.SeriesFilterData seriesFilterData2 = SeriesViewModel.SeriesFilterData.this;
                                            for (SeriesViewModel.SeriesFilterData seriesFilterData3 : list3) {
                                                seriesFilterData3.setSelected(seriesFilterData2.getSeriesType() == seriesFilterData3.getSeriesType());
                                            }
                                            function12.invoke(SeriesViewModel.SeriesFilterData.this.getSeriesType());
                                        }
                                    }, 7, null), Dp.m6997constructorimpl(i4));
                                    Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                    ComposerKt.sourceInformationMarkerStart(composer4, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer4, i5);
                                    ComposerKt.sourceInformationMarkerStart(composer4, i6, str);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, m985padding3ABfNKs);
                                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                    ComposerKt.sourceInformationMarkerStart(composer4, -692256719, str2);
                                    if (!(composer3.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer4.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer3);
                                    Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                    ComposerKt.sourceInformationMarkerStart(composer4, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                    String str3 = str;
                                    String str4 = str2;
                                    PopupState popupState4 = popupState3;
                                    Function1<SeriesViewModel.SeriesType, Unit> function13 = function12;
                                    List<SeriesViewModel.SeriesFilterData> list3 = list2;
                                    int i7 = i4;
                                    TextKt.m3014Text4IGK_g(UnitExtensionsKt.getRs(seriesFilterData.getName(), composer4, 0), (Modifier) null, CoinColor.INSTANCE.m7866blackWaAFU9c(composer4, i5), TextUnitKt.getSp(i4), (FontStyle) null, new FontWeight(400), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131026);
                                    composer4 = composer3;
                                    composer4.startReplaceableGroup(-1509186407);
                                    if (seriesFilterData.isSelected()) {
                                        ImageKt.GlImage(Integer.valueOf(R.drawable.icon_currency_check), SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(14)), 0.0f, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, null, null, null, null, composer3, 3120, 1012);
                                    }
                                    composer3.endReplaceableGroup();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    composer3.endNode();
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    ComposerKt.sourceInformationMarkerEnd(composer3);
                                    float f = (float) 0.5d;
                                    DividerKt.m2393HorizontalDivider9IZ8Weo(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(f)), Dp.m6997constructorimpl(f), CoinColor.INSTANCE.m7870dividerColorWaAFU9c(composer4, 6), composer3, 54, 0);
                                    i5 = 6;
                                    str = str3;
                                    i6 = -1323940314;
                                    str2 = str4;
                                    popupState3 = popupState4;
                                    function12 = function13;
                                    list2 = list3;
                                    i4 = i7;
                                }
                                composer3.endReplaceableGroup();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                ComposerKt.sourceInformationMarkerEnd(composer3);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, (i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 24576, 9);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.OfficialSeriesPageKt$SetsFilterDialog$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    OfficialSeriesPageKt.SetsFilterDialog(filterTypes, popupState, onSelectedType, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SeriesItem> OfficialSeriesPage$lambda$0(MutableState<List<SeriesItem>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SeriesViewModel.SeriesType OfficialSeriesPage$lambda$4(MutableState<SeriesViewModel.SeriesType> mutableState) {
        return mutableState.getValue();
    }
}
