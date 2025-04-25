package com.glority.android.picturexx.view.catalog;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.compose.extensions.UnitExtensionsKt;
import com.glority.android.database.entities.SeriesItem;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.theme.CoinColor;
import com.glority.base.utils.StatusBarUtils;
import com.picturecoin.generatedAPI.kotlinAPI.model.CountryInfo;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectedCountryView.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2#\u0010\t\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u000e\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102#\u0010\t\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0015\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0015\u001a%\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\u001e\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u0010\u0018\u00010\u001bX\u008a\u008e\u0002"}, d2 = {"SelectedCountryView", "", "modifier", "Landroidx/compose/ui/Modifier;", "selectedCountry", "", "searchKey", "showAll", "", "onSelected", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "country", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "countryList", "", "Lcom/glority/android/database/entities/SeriesItem;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CharacterHeader", "text", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "ContactListItem", "isSelected", "(Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "businessMod_release", "groupCountryData", "Ljava/util/SortedMap;", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CountryInfo;"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class SelectedCountryViewKt {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelectedCountryView(final androidx.compose.ui.Modifier r28, final java.lang.String r29, final java.lang.String r30, boolean r31, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt.SelectedCountryView(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void SelectedCountryView(final Modifier modifier, final String str, final String searchKey, final List<SeriesItem> countryList, final Function1<? super String, Unit> onSelected, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(searchKey, "searchKey");
        Intrinsics.checkNotNullParameter(countryList, "countryList");
        Intrinsics.checkNotNullParameter(onSelected, "onSelected");
        Composer startRestartGroup = composer.startRestartGroup(473204890);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473204890, i, -1, "com.glority.android.picturexx.view.catalog.SelectedCountryView (SelectedCountryView.kt:147)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState = (MutableState) rememberedValue;
        SurfaceKt.m2864SurfaceT9BRK9s(WindowInsetsPadding_androidKt.imePadding(SizeKt.fillMaxSize$default(BackgroundKt.m540backgroundbw27NRU$default(modifier, CoinColor.INSTANCE.m7875whiteWaAFU9c(startRestartGroup, 6), null, 2, null), 0.0f, 1, null)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(startRestartGroup, 1146784309, true, new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5
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
                if ((i2 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1146784309, i2, -1, "com.glority.android.picturexx.view.catalog.SelectedCountryView.<anonymous> (SelectedCountryView.kt:159)");
                }
                composer2.startReplaceableGroup(866218505);
                boolean changed = composer2.changed(str) | composer2.changedInstance(onSelected) | composer2.changed(mutableState);
                final String str2 = str;
                final Function1<String, Unit> function1 = onSelected;
                final MutableState<SortedMap<String, List<CountryInfo>>> mutableState2 = mutableState;
                Object rememberedValue2 = composer2.rememberedValue();
                if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function1) new Function1<LazyListScope, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                            invoke2(lazyListScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(LazyListScope LazyColumn) {
                            SortedMap SelectedCountryView$lambda$5;
                            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                            final String str3 = str2;
                            final Function1<String, Unit> function12 = function1;
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-459023839, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer3, Integer num) {
                                    invoke(lazyItemScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(LazyItemScope item, Composer composer3, int i3) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-459023839, i3, -1, "com.glority.android.picturexx.view.catalog.SelectedCountryView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectedCountryView.kt:161)");
                                        }
                                        String rs = UnitExtensionsKt.getRs(R.string.myseries_btn_all, composer3, 0);
                                        boolean z = str3 == null;
                                        Modifier.Companion companion = Modifier.INSTANCE;
                                        composer3.startReplaceableGroup(866218693);
                                        boolean changed2 = composer3.changed(str3) | composer3.changedInstance(function12);
                                        final String str4 = str3;
                                        final Function1<String, Unit> function13 = function12;
                                        Object rememberedValue3 = composer3.rememberedValue();
                                        if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            rememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5$1$1$1$1$1
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
                                                    if (str4 == null) {
                                                        function13.invoke(null);
                                                    } else {
                                                        function13.invoke(null);
                                                    }
                                                }
                                            };
                                            composer3.updateRememberedValue(rememberedValue3);
                                        }
                                        composer3.endReplaceableGroup();
                                        SelectedCountryViewKt.ContactListItem(rs, z, ClickableKt.m573clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue3, 7, null), composer3, 0);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            }), 3, null);
                            SelectedCountryView$lambda$5 = SelectedCountryViewKt.SelectedCountryView$lambda$5(mutableState2);
                            if (SelectedCountryView$lambda$5 != null) {
                                final String str4 = str2;
                                final Function1<String, Unit> function13 = function1;
                                for (Map.Entry entry : SelectedCountryView$lambda$5.entrySet()) {
                                    final String str5 = (String) entry.getKey();
                                    final List list = (List) entry.getValue();
                                    LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1689211806, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5$1$1$2$1
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer3, Integer num) {
                                            invoke(lazyItemScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope stickyHeader, Composer composer3, int i3) {
                                            Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                                            if ((i3 & 81) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1689211806, i3, -1, "com.glority.android.picturexx.view.catalog.SelectedCountryView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectedCountryView.kt:174)");
                                            }
                                            String key = str5;
                                            Intrinsics.checkNotNullExpressionValue(key, "$key");
                                            SelectedCountryViewKt.CharacterHeader(key, composer3, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), 3, null);
                                    LazyListScope.items$default(LazyColumn, list.size(), null, null, ComposableLambdaKt.composableLambdaInstance(-2000356196, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5$1$1$2$2
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(LazyItemScope items, int i3, Composer composer3, int i4) {
                                            Intrinsics.checkNotNullParameter(items, "$this$items");
                                            if ((i4 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
                                                i4 |= composer3.changed(i3) ? 32 : 16;
                                            }
                                            if ((i4 & 721) != 144 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-2000356196, i4, -1, "com.glority.android.picturexx.view.catalog.SelectedCountryView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SelectedCountryView.kt:177)");
                                                }
                                                final String countryCode = list.get(i3).getCountryCode();
                                                String name = list.get(i3).getName();
                                                boolean areEqual = Intrinsics.areEqual(str4, countryCode);
                                                Modifier.Companion companion = Modifier.INSTANCE;
                                                composer3.startReplaceableGroup(866219369);
                                                boolean changed2 = composer3.changed(str4) | composer3.changed(countryCode) | composer3.changedInstance(function13);
                                                final String str6 = str4;
                                                final Function1<String, Unit> function14 = function13;
                                                Object rememberedValue3 = composer3.rememberedValue();
                                                if (changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    rememberedValue3 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$5$1$1$2$2$1$1
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
                                                            if (Intrinsics.areEqual(str6, countryCode)) {
                                                                function14.invoke(null);
                                                            } else {
                                                                function14.invoke(countryCode);
                                                            }
                                                        }
                                                    };
                                                    composer3.updateRememberedValue(rememberedValue3);
                                                }
                                                composer3.endReplaceableGroup();
                                                SelectedCountryViewKt.ContactListItem(name, areEqual, ClickableKt.m573clickableXHw0xAI$default(companion, false, null, null, (Function0) rememberedValue3, 7, null), composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }
                                    }), 6, null);
                                }
                            }
                            LazyListScope.items$default(LazyColumn, 1, null, null, ComposableSingletons$SelectedCountryViewKt.INSTANCE.m7881getLambda2$businessMod_release(), 6, null);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                composer2.endReplaceableGroup();
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, (Function1) rememberedValue2, composer2, 0, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), startRestartGroup, 12582912, 126);
        EffectsKt.LaunchedEffect(searchKey, new SelectedCountryViewKt$SelectedCountryView$6(countryList, searchKey, mutableState, null), startRestartGroup, ((i >> 6) & 14) | 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$SelectedCountryView$7
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
                    SelectedCountryViewKt.SelectedCountryView(Modifier.this, str, searchKey, countryList, onSelected, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CharacterHeader(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-270018655);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-270018655, i2, -1, "com.glority.android.picturexx.view.catalog.CharacterHeader (SelectedCountryView.kt:208)");
            }
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g(str, PaddingKt.m986paddingVpY3zN4(BackgroundKt.m540backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), CoinColor.INSTANCE.m7868colorF3F3F3WaAFU9c(startRestartGroup, 6), null, 2, null), Dp.m6997constructorimpl(24), Dp.m6997constructorimpl(8)), CoinColor.INSTANCE.m7874textColor66WaAFU9c(startRestartGroup, 6), TextUnitKt.getSp(16), (FontStyle) null, new FontWeight(700), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 199680, 0, 131024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$CharacterHeader$1
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

                public final void invoke(Composer composer3, int i3) {
                    SelectedCountryViewKt.CharacterHeader(str, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContactListItem(final String str, boolean z, final Modifier modifier, Composer composer, final int i) {
        int i2;
        long m7874textColor66WaAFU9c;
        Composer composer2;
        final boolean z2;
        Composer startRestartGroup = composer.startRestartGroup(-1160498271);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1160498271, i3, -1, "com.glority.android.picturexx.view.catalog.ContactListItem (SelectedCountryView.kt:222)");
            }
            Modifier m540backgroundbw27NRU$default = BackgroundKt.m540backgroundbw27NRU$default(modifier, CoinColor.INSTANCE.m7872surfaceColorWaAFU9c(startRestartGroup, 6), null, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m540backgroundbw27NRU$default);
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
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m986paddingVpY3zN4(Modifier.INSTANCE, Dp.m6997constructorimpl(24), Dp.m6997constructorimpl(8)), 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.INSTANCE;
            if (z) {
                startRestartGroup.startReplaceableGroup(-729883449);
                m7874textColor66WaAFU9c = CoinColor.INSTANCE.m7866blackWaAFU9c(startRestartGroup, 6);
            } else {
                startRestartGroup.startReplaceableGroup(-729883426);
                m7874textColor66WaAFU9c = CoinColor.INSTANCE.m7874textColor66WaAFU9c(startRestartGroup, 6);
            }
            startRestartGroup.endReplaceableGroup();
            long j = m7874textColor66WaAFU9c;
            long sp = TextUnitKt.getSp(16);
            if (z) {
                new FontWeight(500);
            } else {
                new FontWeight(400);
            }
            int i4 = (i3 & 14) | 3120;
            TextKt.m3014Text4IGK_g(str, (Modifier) null, j, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 0, 0, 131024);
            composer2 = startRestartGroup;
            composer2.startReplaceableGroup(-1146873253);
            z2 = z;
            if (z2) {
                ImageKt.Image(UnitExtensionsKt.getPr(R.drawable.icon_currency_check, composer2, 0), (String) null, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(13)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
            }
            composer2.endReplaceableGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            DividerKt.m2392Divider9IZ8Weo(PaddingKt.m987paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6997constructorimpl(16), 0.0f, 2, null), Dp.m6997constructorimpl((float) 0.5d), CoinColor.INSTANCE.m7870dividerColorWaAFU9c(composer2, 6), composer2, 54, 0);
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
            z2 = z;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.view.catalog.SelectedCountryViewKt$ContactListItem$2
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

                public final void invoke(Composer composer3, int i5) {
                    SelectedCountryViewKt.ContactListItem(str, z2, modifier, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SortedMap<String, List<CountryInfo>> SelectedCountryView$lambda$5(MutableState<SortedMap<String, List<CountryInfo>>> mutableState) {
        return mutableState.getValue();
    }
}
