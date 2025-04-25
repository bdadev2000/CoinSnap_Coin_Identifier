package com.glority.android.picturexx.composable;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.glority.android.cmsui2.util.CmsDataUtils;
import com.glority.android.cmsui2.util.CmsDataUtilsKt;
import com.glority.android.compose.ui.ImageKt;
import com.glority.android.core.app.AppContext;
import com.glority.android.database.entities.CollectionItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryListExtKt;
import com.glority.android.picturexx.extensions.CollectionCountrySummaryWrapper;
import com.glority.android.picturexx.extensions.CollectionItemExtKt;
import com.glority.android.picturexx.extensions.IntegerExtKt;
import com.glority.android.picturexx.utils.PriceUtils;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import com.google.android.exoplayer2.audio.WavUtil;
import com.picturecoin.generatedAPI.kotlinAPI.collection.CollectionCountrySummary;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import com.picturecoin.generatedAPI.kotlinAPI.model.PriceValue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CollectionDistributionList.kt */
@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\u001aU\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u000eH\u0007¢\u0006\u0002\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000eH\u0003¢\u0006\u0002\u0010\u0017\u001a?\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00050\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u001bH\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u001e\u001a\u001d\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010 \u001a\u001d\u0010!\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010#\"\u0014\u0010\u0000\u001a\u00020\u00018CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006$²\u0006\n\u0010%\u001a\u00020&X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u000fX\u008a\u008e\u0002"}, d2 = {"MIN_HEIGHT", "Landroidx/compose/ui/unit/Dp;", "getMIN_HEIGHT", "(Landroidx/compose/runtime/Composer;I)F", "CollectionDistributionList", "", "modifier", "Landroidx/compose/ui/Modifier;", "summaries", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/collection/CollectionCountrySummary;", "initCountryCode", "", "onCountrySelected", "Lkotlin/Function1;", "Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;", "onCollectionClick", "Lcom/glority/android/database/entities/CollectionItem;", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CollectionDistributionPage1", "wrapperList", "", "onSummaryWrapperClick", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CollectionDistributionPage2", "summaryWrapper", "onBackClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "CollectionDistributionPreview", "(Landroidx/compose/runtime/Composer;I)V", "CountryEntry", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/picturexx/extensions/CollectionCountrySummaryWrapper;Landroidx/compose/runtime/Composer;I)V", "CollectionListItem", "collection", "(Landroidx/compose/ui/Modifier;Lcom/glority/android/database/entities/CollectionItem;Landroidx/compose/runtime/Composer;I)V", "businessMod_release", "panelHeightPx", "", "selectedSummaryWrapper"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class CollectionDistributionListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float getMIN_HEIGHT(Composer composer, int i) {
        composer.startReplaceableGroup(-1413569140);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1413569140, i, -1, "com.glority.android.picturexx.composable.<get-MIN_HEIGHT> (CollectionDistributionList.kt:95)");
        }
        float dimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen.x600, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dimensionResource;
    }

    public static final void CollectionDistributionList(final Modifier modifier, final List<CollectionCountrySummary> summaries, final String str, final Function1<? super CollectionCountrySummaryWrapper, Unit> onCountrySelected, final Function1<? super CollectionItem, Unit> onCollectionClick, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(summaries, "summaries");
        Intrinsics.checkNotNullParameter(onCountrySelected, "onCountrySelected");
        Intrinsics.checkNotNullParameter(onCollectionClick, "onCollectionClick");
        Composer startRestartGroup = composer.startRestartGroup(-1398709453);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1398709453, i, -1, "com.glority.android.picturexx.composable.CollectionDistributionList (CollectionDistributionList.kt:105)");
        }
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), null, false, ComposableLambdaKt.composableLambda(startRestartGroup, -47231223, true, new CollectionDistributionListKt$CollectionDistributionList$1(str, CollectionCountrySummaryListExtKt.sortByMaxCount(CollectionCountrySummaryListExtKt.groupByCountry(summaries)), onCollectionClick, onCountrySelected)), startRestartGroup, 3072, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionList$2
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
                    CollectionDistributionListKt.CollectionDistributionList(Modifier.this, summaries, str, onCountrySelected, onCollectionClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectionDistributionPage1(final Modifier modifier, final List<CollectionCountrySummaryWrapper> list, final Function1<? super CollectionCountrySummaryWrapper, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(258626711);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(258626711, i, -1, "com.glority.android.picturexx.composable.CollectionDistributionPage1 (CollectionDistributionList.kt:254)");
        }
        Modifier verticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m987paddingVpY3zN4$default(SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x32, startRestartGroup, 0), 0.0f, 2, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
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
        Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(BackgroundKt.m539backgroundbw27NRU(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.x24, startRestartGroup, 0), 0.0f, 0.0f, 13, null), 0.0f, 1, null), null, false, 3, null), ColorResources_androidKt.colorResource(R.color.color_F2F2F2, startRestartGroup, 0), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.x24, startRestartGroup, 0))), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, startRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.x32, startRestartGroup, 0));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m986paddingVpY3zN4);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        List<CollectionCountrySummaryWrapper> list2 = list;
        Iterator<T> it = list2.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((CollectionCountrySummaryWrapper) it.next()).getCount();
        }
        int size = list.size();
        if (size > 1 && i3 > 1) {
            i2 = R.string.collection_summary_geomap_coinnumber;
        } else if (size == 1 && i3 > 1) {
            i2 = R.string.collection_summary_geomap_coinnumbers;
        } else {
            i2 = R.string.collection_summary_geomap_coinnumberss;
        }
        String asFormatted = IntegerExtKt.asFormatted(i3);
        String asFormatted2 = IntegerExtKt.asFormatted(size);
        String stringResource = StringResources_androidKt.stringResource(i2, new Object[]{asFormatted, asFormatted2}, startRestartGroup, 64);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(stringResource);
        builder.addStyle(new SpanStyle(ColorKt.Color(4281545523L), TextUnitKt.getSp(14), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65532, (DefaultConstructorMarker) null), 0, builder.getLength());
        String str = stringResource;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str, asFormatted, 0, false, 6, (Object) null);
        if (indexOf$default != -1) {
            builder.addStyle(new SpanStyle(0L, TextUnitKt.getSp(18), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65529, (DefaultConstructorMarker) null), indexOf$default, asFormatted.length() + indexOf$default);
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, asFormatted2, 0, false, 6, (Object) null);
        if (indexOf$default2 == indexOf$default) {
            indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, asFormatted2, indexOf$default2 + 1, false, 4, (Object) null);
        }
        if (indexOf$default2 != -1) {
            builder.addStyle(new SpanStyle(0L, TextUnitKt.getSp(18), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65529, (DefaultConstructorMarker) null), indexOf$default2, asFormatted2.length() + indexOf$default2);
        }
        TextKt.m3015TextIbK3jfQ(builder.toAnnotatedString(), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), 0L, 0L, null, null, null, 0L, null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, null, startRestartGroup, 48, 0, 261628);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x52, startRestartGroup, 0)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(-710680862);
        int i4 = 0;
        for (Object obj : list2) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CollectionCountrySummaryWrapper collectionCountrySummaryWrapper = (CollectionCountrySummaryWrapper) obj;
            CountryEntry(ClickableKt.m573clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPage1$1$2$1
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
                    function1.invoke(collectionCountrySummaryWrapper);
                }
            }, 7, null), collectionCountrySummaryWrapper, startRestartGroup, 64);
            if (i4 != list.size() - 1) {
                SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x48, startRestartGroup, 0)), startRestartGroup, 0);
            }
            i4 = i5;
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x52, startRestartGroup, 0)), startRestartGroup, 0);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPage1$2
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

                public final void invoke(Composer composer2, int i6) {
                    CollectionDistributionListKt.CollectionDistributionPage1(Modifier.this, list, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectionDistributionPage2(final Modifier modifier, final CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, final Function1<? super CollectionItem, Unit> function1, final Function0<Unit> function0, Composer composer, final int i) {
        String str;
        int i2;
        CountryInfo issuerCountry;
        String currencyCode;
        CountryInfo issuerCountry2;
        String name;
        CountryInfo issuerCountry3;
        String countryCode3;
        CountryInfo issuerCountry4;
        PriceValue marketValue;
        String symbol;
        Composer startRestartGroup = composer.startRestartGroup(748569763);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(748569763, i, -1, "com.glority.android.picturexx.composable.CollectionDistributionPage2 (CollectionDistributionList.kt:352)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt.mutableStateListOf();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
        EffectsKt.LaunchedEffect(collectionCountrySummaryWrapper, new CollectionDistributionListKt$CollectionDistributionPage2$1(snapshotStateList, collectionCountrySummaryWrapper, null), startRestartGroup, 72);
        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
        Updater.m4015setimpl(m4008constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Modifier m987paddingVpY3zN4$default = PaddingKt.m987paddingVpY3zN4$default(SizeKt.fillMaxSize$default(ScrollKt.verticalScroll$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen.x10, startRestartGroup, 0), 0.0f, 0.0f, 13, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x32, startRestartGroup, 0), 0.0f, 2, null);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m987paddingVpY3zN4$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl2 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        int size = snapshotStateList.size();
        SnapshotStateList snapshotStateList2 = snapshotStateList;
        Iterator<T> it = snapshotStateList2.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            PriceValue marketValue2 = ((CollectionItem) it.next()).getMarketValue();
            d += marketValue2 != null ? marketValue2.getValue() : 0.0d;
        }
        CollectionItem collectionItem = (CollectionItem) CollectionsKt.firstOrNull((List) snapshotStateList);
        String str2 = "";
        String str3 = (collectionItem == null || (marketValue = collectionItem.getMarketValue()) == null || (symbol = marketValue.getSymbol()) == null) ? "" : symbol;
        CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper.getSummaries());
        if (collectionCountrySummary == null || (issuerCountry4 = collectionCountrySummary.getIssuerCountry()) == null || (str = CmsDataUtilsKt.getFlag(issuerCountry4)) == null) {
            str = "";
        }
        CollectionCountrySummary collectionCountrySummary2 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper.getSummaries());
        String str4 = (collectionCountrySummary2 == null || (issuerCountry3 = collectionCountrySummary2.getIssuerCountry()) == null || (countryCode3 = issuerCountry3.getCountryCode3()) == null) ? "" : countryCode3;
        CollectionCountrySummary collectionCountrySummary3 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper.getSummaries());
        String str5 = (collectionCountrySummary3 == null || (issuerCountry2 = collectionCountrySummary3.getIssuerCountry()) == null || (name = issuerCountry2.getName()) == null) ? "" : name;
        CollectionCountrySummary collectionCountrySummary4 = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) collectionCountrySummaryWrapper.getSummaries());
        if (collectionCountrySummary4 != null && (issuerCountry = collectionCountrySummary4.getIssuerCountry()) != null && (currencyCode = issuerCountry.getCurrencyCode()) != null) {
            str2 = currencyCode;
        }
        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, startRestartGroup, 0)), startRestartGroup, 0);
        Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.x24, startRestartGroup, 0))), 0.0f, 1, null), null, false, 3, null);
        String str6 = str3;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor3);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl3 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        Modifier m986paddingVpY3zN4 = PaddingKt.m986paddingVpY3zN4(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4293125091L), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x32, startRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.x24, startRestartGroup, 0));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, m986paddingVpY3zN4);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor4);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl4 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl4.getInserting() || !Intrinsics.areEqual(m4008constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            m4008constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
            m4008constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
        }
        Updater.m4015setimpl(m4008constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        String str7 = str2;
        double d2 = d;
        ImageKt.GlImage(str, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen.x36, startRestartGroup, 0)), 0.0f, null, 0.0f, null, null, null, null, null, startRestartGroup, 0, 1020);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String str8 = str4;
        String str9 = str8 + "( " + str5 + " )";
        builder.append(str9);
        builder.addStyle(new SpanStyle(ColorKt.Color(4284900966L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), 0, str9.length());
        builder.addStyle(new SpanStyle(ColorKt.Color(4284900966L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (DefaultConstructorMarker) null), 0, str8.length());
        TextKt.m3015TextIbK3jfQ(builder.toAnnotatedString(), RowScope.weight$default(rowScopeInstance, SizeKt.wrapContentHeight$default(PaddingKt.m989paddingqDBjuR0$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen.x16, startRestartGroup, 0), 0.0f, 0.0f, 0.0f, 14, null), null, false, 3, null), 1.0f, false, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, startRestartGroup, 0, 0, 262140);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Modifier m986paddingVpY3zN42 = PaddingKt.m986paddingVpY3zN4(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4294177779L), null, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x32, startRestartGroup, 0), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, startRestartGroup, 0));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, m986paddingVpY3zN42);
        Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor5);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl5 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl5, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl5.getInserting() || !Intrinsics.areEqual(m4008constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            m4008constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
            m4008constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
        }
        Updater.m4015setimpl(m4008constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        Modifier weight$default = RowScope.weight$default(rowScopeInstance2, SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
        Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor6);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl6 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl6, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl6.getInserting() || !Intrinsics.areEqual(m4008constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
            m4008constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
            m4008constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
        }
        Updater.m4015setimpl(m4008constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
        TextKt.m3014Text4IGK_g(String.valueOf(size), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200112, 0, 130512);
        if (size > 1) {
            i2 = R.string.collection_summary_caption_coins;
        } else {
            i2 = R.string.collection_summary_caption_coin;
        }
        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(i2, startRestartGroup, 0), SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(14), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 6, 129520);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        BoxKt.Box(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m1016height3ABfNKs(SizeKt.m1035width3ABfNKs(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(R.dimen.x20, startRestartGroup, 0), 0.0f, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x2, startRestartGroup, 0)), PrimitiveResources_androidKt.dimensionResource(R.dimen.x80, startRestartGroup, 0)), 0.0f, 1, null), ColorKt.Color(4293059298L), null, 2, null), startRestartGroup, 0);
        Modifier weight$default2 = RowScope.weight$default(rowScopeInstance2, SizeKt.wrapContentHeight$default(Modifier.INSTANCE, null, false, 3, null), 1.0f, false, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
        Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor7);
        } else {
            startRestartGroup.useNode();
        }
        Composer m4008constructorimpl7 = Updater.m4008constructorimpl(startRestartGroup);
        Updater.m4015setimpl(m4008constructorimpl7, columnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m4015setimpl(m4008constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m4008constructorimpl7.getInserting() || !Intrinsics.areEqual(m4008constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
            m4008constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
            m4008constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
        }
        Updater.m4015setimpl(m4008constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
        TextKt.m3014Text4IGK_g(str6 + PriceUtils.INSTANCE.formatPrice(d2), SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(20), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200112, 0, 130512);
        TextKt.m3014Text4IGK_g(StringResources_androidKt.stringResource(R.string.collection_value, startRestartGroup, 0) + "(" + str7 + ")", SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), ColorKt.Color(4284900966L), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(14), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 3504, 6, 129520);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, startRestartGroup, 0)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(398198338);
        int i3 = 0;
        for (Object obj : snapshotStateList2) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final CollectionItem collectionItem2 = (CollectionItem) obj;
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.m1268RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.x24, startRestartGroup, 0)), null, CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(Dp.m6997constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.composableLambda(startRestartGroup, -953822153, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPage2$2$1$2$1
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

                public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i5 & 81) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-953822153, i5, -1, "com.glority.android.picturexx.composable.CollectionDistributionPage2.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollectionDistributionList.kt:539)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        final Function1<CollectionItem, Unit> function12 = function1;
                        final CollectionItem collectionItem3 = CollectionItem.this;
                        CollectionDistributionListKt.CollectionListItem(ClickableKt.m573clickableXHw0xAI$default(companion, false, null, null, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPage2$2$1$2$1.1
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
                                function12.invoke(collectionItem3);
                            }
                        }, 7, null), CollectionItem.this, composer2, 64);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 196614, 20);
            if (i3 != snapshotStateList.size() - 1) {
                SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x48, startRestartGroup, 0)), startRestartGroup, 0);
            }
            i3 = i4;
        }
        startRestartGroup.endReplaceableGroup();
        SpacerKt.Spacer(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PrimitiveResources_androidKt.dimensionResource(R.dimen.x40, startRestartGroup, 0)), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPage2$3
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

                public final void invoke(Composer composer2, int i5) {
                    CollectionDistributionListKt.CollectionDistributionPage2(Modifier.this, collectionCountrySummaryWrapper, function1, function0, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectionDistributionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1957014353);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1957014353, i, -1, "com.glority.android.picturexx.composable.CollectionDistributionPreview (CollectionDistributionList.kt:574)");
            }
            CollectionDistributionKt.CollectionDistribution(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new ArrayList(), "", new Function1<CollectionCountrySummaryWrapper, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPreview$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CollectionCountrySummaryWrapper collectionCountrySummaryWrapper) {
                    invoke2(collectionCountrySummaryWrapper);
                    return Unit.INSTANCE;
                }
            }, new Function1<CollectionItem, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPreview$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(CollectionItem collectionItem) {
                    Intrinsics.checkNotNullParameter(collectionItem, "<unused var>");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(CollectionItem collectionItem) {
                    invoke2(collectionItem);
                    return Unit.INSTANCE;
                }
            }, startRestartGroup, 28102);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionDistributionPreview$3
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
                    CollectionDistributionListKt.CollectionDistributionPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CountryEntry(final Modifier modifier, final CollectionCountrySummaryWrapper collectionCountrySummaryWrapper, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(233471059);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(233471059, i, -1, "com.glority.android.picturexx.composable.CountryEntry (CollectionDistributionList.kt:586)");
        }
        AndroidView_androidKt.AndroidView(new Function1<Context, View>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CountryEntry$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final View invoke(Context it) {
                String lowerCase;
                CountryInfo issuerCountry;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = null;
                View inflate = LayoutInflater.from(it).inflate(R.layout.view_summary_geo_distribution_entry_layout, (ViewGroup) null);
                inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                String countryFlagIconUrl = CmsDataUtils.INSTANCE.getCountryFlagIconUrl(CollectionCountrySummaryWrapper.this.getCountryCode());
                AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.iv_geo_distribution_country_flag);
                Glide.with(appCompatImageView).load(countryFlagIconUrl).into(appCompatImageView);
                AppCompatTextView appCompatTextView = (AppCompatTextView) inflate.findViewById(R.id.tv_geo_distribution_country_name);
                CollectionCountrySummary collectionCountrySummary = (CollectionCountrySummary) CollectionsKt.firstOrNull((List) CollectionCountrySummaryWrapper.this.getSummaries());
                if (collectionCountrySummary != null && (issuerCountry = collectionCountrySummary.getIssuerCountry()) != null) {
                    str = issuerCountry.getCountryCode3();
                }
                appCompatTextView.setText(str);
                int count = CollectionCountrySummaryWrapper.this.getCount();
                if (count <= 1) {
                    String string = ResUtils.getString(R.string.collection_summary_caption_coin);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    lowerCase = string.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                } else {
                    String string2 = ResUtils.getString(R.string.collection_summary_caption_coins);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    lowerCase = string2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                ((AppCompatTextView) inflate.findViewById(R.id.tv_geo_distribution_coin_count)).setText(IntegerExtKt.asFormatted(count) + " " + lowerCase);
                return inflate;
            }
        }, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null), null, startRestartGroup, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CountryEntry$2
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
                    CollectionDistributionListKt.CountryEntry(Modifier.this, collectionCountrySummaryWrapper, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectionListItem(final Modifier modifier, final CollectionItem collectionItem, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(152629062);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(152629062, i, -1, "com.glority.android.picturexx.composable.CollectionListItem (CollectionDistributionList.kt:623)");
        }
        AndroidView_androidKt.AndroidView(new Function1<Context, View>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionListItem$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final View invoke(Context it) {
                Intrinsics.checkNotNullParameter(it, "it");
                View inflate = LayoutInflater.from(it).inflate(R.layout.item_me_collection_card, (ViewGroup) null);
                Intrinsics.checkNotNull(inflate);
                ViewHolder viewHolder = new ViewHolder(inflate);
                CollectionItem collectionItem2 = CollectionItem.this;
                viewHolder.getCollectionNameTextView().setText(collectionItem2.getDisplayName());
                viewHolder.getPriceTextView().setText(CollectionItemExtKt.getDisplayPrice(collectionItem2));
                AppCompatTextView priceTextView = viewHolder.getPriceTextView();
                String displayPrice = CollectionItemExtKt.getDisplayPrice(collectionItem2);
                priceTextView.setVisibility(displayPrice != null && displayPrice.length() > 0 ? 0 : 8);
                String displayGrade = CollectionItemExtKt.getDisplayGrade(collectionItem2);
                viewHolder.getGradeTextView().setText(displayGrade);
                viewHolder.getGradeInfoContainer().setVisibility((displayGrade == null || displayGrade.length() == 0) ^ true ? 0 : 8);
                AppCompatTextView gradeTextView = viewHolder.getGradeTextView();
                String grade = collectionItem2.getGrade();
                gradeTextView.setVisibility((grade == null || grade.length() == 0) ^ true ? 0 : 8);
                final AppCompatImageView ivCoinHeader = viewHolder.getIvCoinHeader();
                final AppCompatImageView ivCoinToe = viewHolder.getIvCoinToe();
                Glide.with(ivCoinHeader).asBitmap().load(collectionItem2.getSubjectSideUrl()).dontTransform().placeholder(R.drawable.img_coin_placeholder_coin_header).addListener(new RequestListener<Bitmap>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionListItem$1.1
                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onLoadFailed(GlideException e, Object model, Target<Bitmap> target, boolean isFirstResource) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        return false;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onResourceReady(Bitmap resource, Object model, Target<Bitmap> target, DataSource dataSource, boolean isFirstResource) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                        AppCompatImageView appCompatImageView = AppCompatImageView.this;
                        try {
                            if (resource.getWidth() / resource.getHeight() > 1.2f) {
                                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            }
                            Unit unit = Unit.INSTANCE;
                            return false;
                        } catch (Exception e) {
                            if (!AppContext.INSTANCE.isDebugMode()) {
                                return false;
                            }
                            LogUtils.e(Log.getStackTraceString(e));
                            return false;
                        }
                    }
                }).into(ivCoinHeader);
                Glide.with(ivCoinToe).asBitmap().load(collectionItem2.getDenominationSideUrl()).dontTransform().placeholder(R.drawable.img_coin_placeholder_coin_toe).addListener(new RequestListener<Bitmap>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionListItem$1.2
                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onLoadFailed(GlideException e, Object model, Target<Bitmap> target, boolean isFirstResource) {
                        Intrinsics.checkNotNullParameter(target, "target");
                        return false;
                    }

                    @Override // com.bumptech.glide.request.RequestListener
                    public boolean onResourceReady(Bitmap resource, Object model, Target<Bitmap> target, DataSource dataSource, boolean isFirstResource) {
                        Intrinsics.checkNotNullParameter(resource, "resource");
                        Intrinsics.checkNotNullParameter(model, "model");
                        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
                        AppCompatImageView appCompatImageView = AppCompatImageView.this;
                        try {
                            if (resource.getWidth() / resource.getHeight() > 1.2f) {
                                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            } else {
                                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            }
                            Unit unit = Unit.INSTANCE;
                            return false;
                        } catch (Exception e) {
                            if (!AppContext.INSTANCE.isDebugMode()) {
                                return false;
                            }
                            LogUtils.e(Log.getStackTraceString(e));
                            return false;
                        }
                    }
                }).into(ivCoinToe);
                return inflate;
            }
        }, SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null), null, startRestartGroup, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.CollectionDistributionListKt$CollectionListItem$2
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
                    CollectionDistributionListKt.CollectionListItem(Modifier.this, collectionItem, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
