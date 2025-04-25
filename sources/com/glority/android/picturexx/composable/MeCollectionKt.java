package com.glority.android.picturexx.composable;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
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
import com.glority.android.picturexx.business.R;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeCollection.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a3\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0012H\u0007¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\u0015\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002"}, d2 = {"CollectionFunctionZone", "", "modifier", "Landroidx/compose/ui/Modifier;", "onSearchClick", "Lkotlin/Function0;", "onWishClick", "onHistoryClick", "onSettingClick", "redDotEnabled", "", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "CollectionFunctionZonePreview111111", "(Landroidx/compose/runtime/Composer;I)V", "CollectionSwitchButton", "selectedIndex", "", "onSwitched", "Lkotlin/Function1;", "(Landroidx/compose/ui/Modifier;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CollectionSwitchButtonPreview", "MeCollectionBackground", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "MeCollectionBackgroundPreview", "businessMod_release", "animatedSummaryTextColor", "Landroidx/compose/ui/graphics/Color;", "animatedAllTextColor", "animatedSetsTextColor", "animatedAlignmentHorizontalBias", ""}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes2.dex */
public final class MeCollectionKt {
    public static final void CollectionFunctionZone(final Modifier modifier, final Function0<Unit> onSearchClick, final Function0<Unit> onWishClick, final Function0<Unit> onHistoryClick, final Function0<Unit> onSettingClick, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onSearchClick, "onSearchClick");
        Intrinsics.checkNotNullParameter(onWishClick, "onWishClick");
        Intrinsics.checkNotNullParameter(onHistoryClick, "onHistoryClick");
        Intrinsics.checkNotNullParameter(onSettingClick, "onSettingClick");
        Composer startRestartGroup = composer.startRestartGroup(-2043876816);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(onSearchClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onWishClick) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(onHistoryClick) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onSettingClick) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        int i3 = i2;
        if ((374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2043876816, i3, -1, "com.glority.android.picturexx.composable.CollectionFunctionZone (MeCollection.kt:54)");
            }
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m3014Text4IGK_g(UnitExtensionsKt.getRs(R.string.me_tab_collection, startRestartGroup, 0), (Modifier) null, Color.INSTANCE.m4541getBlack0d7_KjU(), TextUnitKt.getSp(24), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(28), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 200064, 6, 130002);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(Modifier.INSTANCE, null, false, 3, null);
            Arrangement.HorizontalOrVertical m865spacedBy0680j_4 = Arrangement.INSTANCE.m865spacedBy0680j_4(Dp.m6997constructorimpl(8));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m865spacedBy0680j_4, centerVertically2, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentSize$default);
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
            Updater.m4015setimpl(m4008constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m4015setimpl(m4008constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            float f = 34;
            IconButtonKt.IconButton(onSearchClick, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f)), false, null, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7778getLambda1$businessMod_release(), startRestartGroup, ((i3 >> 3) & 14) | 196656, 28);
            IconButtonKt.IconButton(onWishClick, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f)), false, null, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7779getLambda2$businessMod_release(), startRestartGroup, ((i3 >> 6) & 14) | 196656, 28);
            IconButtonKt.IconButton(onHistoryClick, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f)), false, null, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7780getLambda3$businessMod_release(), startRestartGroup, ((i3 >> 9) & 14) | 196656, 28);
            Modifier m1030size3ABfNKs = SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m1030size3ABfNKs);
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
            Updater.m4015setimpl(m4008constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4015setimpl(m4008constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m4008constructorimpl3.getInserting() || !Intrinsics.areEqual(m4008constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m4008constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m4008constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m4015setimpl(m4008constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            IconButtonKt.IconButton(onSettingClick, SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(f)), false, null, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7781getLambda4$businessMod_release(), startRestartGroup, ((i3 >> 12) & 14) | 196656, 28);
            composer2.startReplaceableGroup(1042525016);
            if (z) {
                SurfaceKt.m2864SurfaceT9BRK9s(boxScopeInstance.align(SizeKt.m1030size3ABfNKs(Modifier.INSTANCE, Dp.m6997constructorimpl(6)), Alignment.INSTANCE.getTopEnd()), RoundedCornerShapeKt.RoundedCornerShape(50), Color.INSTANCE.m4549getRed0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7782getLambda5$businessMod_release(), composer2, 12583296, 120);
            }
            composer2.endReplaceableGroup();
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionFunctionZone$2
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

                public final void invoke(Composer composer3, int i4) {
                    MeCollectionKt.CollectionFunctionZone(Modifier.this, onSearchClick, onWishClick, onHistoryClick, onSettingClick, z, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectionFunctionZonePreview111111(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1925410309);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1925410309, i, -1, "com.glority.android.picturexx.composable.CollectionFunctionZonePreview111111 (MeCollection.kt:140)");
            }
            CollectionFunctionZone(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionFunctionZonePreview111111$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionFunctionZonePreview111111$2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionFunctionZonePreview111111$3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionFunctionZonePreview111111$4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, true, startRestartGroup, 224694);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionFunctionZonePreview111111$5
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
                    MeCollectionKt.CollectionFunctionZonePreview111111(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void CollectionSwitchButton(final Modifier modifier, final int i, final Function1<? super Integer, Unit> onSwitched, Composer composer, final int i2) {
        int i3;
        float horizontalBias;
        Composer composer2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onSwitched, "onSwitched");
        Composer startRestartGroup = composer.startRestartGroup(-121766930);
        if ((i2 & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i3 |= startRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onSwitched) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-121766930, i3, -1, "com.glority.android.picturexx.composable.CollectionSwitchButton (MeCollection.kt:157)");
            }
            State<Color> m418animateColorAsStateeuL9pac = SingleValueAnimationKt.m418animateColorAsStateeuL9pac(i == 0 ? Color.INSTANCE.m4552getWhite0d7_KjU() : ColorKt.Color(4284900966L), null, "", null, startRestartGroup, 384, 10);
            State<Color> m418animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m418animateColorAsStateeuL9pac(i == 1 ? Color.INSTANCE.m4552getWhite0d7_KjU() : ColorKt.Color(4284900966L), null, "", null, startRestartGroup, 384, 10);
            State<Color> m418animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m418animateColorAsStateeuL9pac(i == 2 ? Color.INSTANCE.m4552getWhite0d7_KjU() : ColorKt.Color(4284900966L), null, "", null, startRestartGroup, 384, 10);
            if (i == 0) {
                Alignment centerStart = Alignment.INSTANCE.getCenterStart();
                Intrinsics.checkNotNull(centerStart, "null cannot be cast to non-null type androidx.compose.ui.BiasAlignment");
                horizontalBias = ((BiasAlignment) centerStart).getHorizontalBias();
            } else if (i == 1) {
                Alignment center = Alignment.INSTANCE.getCenter();
                Intrinsics.checkNotNull(center, "null cannot be cast to non-null type androidx.compose.ui.BiasAlignment");
                horizontalBias = ((BiasAlignment) center).getHorizontalBias();
            } else {
                Alignment centerEnd = Alignment.INSTANCE.getCenterEnd();
                Intrinsics.checkNotNull(centerEnd, "null cannot be cast to non-null type androidx.compose.ui.BiasAlignment");
                horizontalBias = ((BiasAlignment) centerEnd).getHorizontalBias();
            }
            BiasAlignment biasAlignment = new BiasAlignment(CollectionSwitchButton$lambda$6(AnimateAsStateKt.animateFloatAsState(horizontalBias, null, 0.0f, "", null, startRestartGroup, 3072, 22)), 0.0f);
            Modifier m985padding3ABfNKs = PaddingKt.m985padding3ABfNKs(IntrinsicKt.height(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.RoundedCornerShape(50)), Color.INSTANCE.m4552getWhite0d7_KjU(), null, 2, null), IntrinsicSize.Max), Dp.m6997constructorimpl(2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m985padding3ABfNKs);
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
            SurfaceKt.m2864SurfaceT9BRK9s(ClipKt.clip(SizeKt.fillMaxHeight$default(SizeKt.fillMaxWidth(BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, biasAlignment), 0.33333334f), 0.0f, 1, null), RoundedCornerShapeKt.RoundedCornerShape(50)), RoundedCornerShapeKt.RoundedCornerShape(50), ColorKt.Color(4281676081L), 0L, 0.0f, 0.0f, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7783getLambda6$businessMod_release(), startRestartGroup, 12583296, 120);
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), null, false, 3, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            startRestartGroup.startReplaceableGroup(1467808720);
            boolean changedInstance = startRestartGroup.changedInstance(onSwitched);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionSwitchButton$1$1$2$1
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
                        onSwitched.invoke(0);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            float f = 8;
            TextKt.m3014Text4IGK_g("Summary", PaddingKt.m987paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance, ClickableKt.m571clickableO2vRcR0$default(companion, mutableInteractionSource, null, false, null, null, (Function0) rememberedValue2, 28, null), 1.0f, false, 2, null), 0.0f, Dp.m6997constructorimpl(f), 1, null), CollectionSwitchButton$lambda$3(m418animateColorAsStateeuL9pac), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199686, 6, 129488);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue3;
            startRestartGroup.startReplaceableGroup(1467809378);
            boolean changedInstance2 = startRestartGroup.changedInstance(onSwitched);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionSwitchButton$1$1$4$1
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
                        onSwitched.invoke(1);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            TextKt.m3014Text4IGK_g("All", PaddingKt.m987paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance, ClickableKt.m571clickableO2vRcR0$default(companion2, mutableInteractionSource2, null, false, null, null, (Function0) rememberedValue4, 28, null), 1.0f, false, 2, null), 0.0f, Dp.m6997constructorimpl(f), 1, null), CollectionSwitchButton$lambda$4(m418animateColorAsStateeuL9pac2), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, 199686, 6, 129488);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            MutableInteractionSource mutableInteractionSource3 = (MutableInteractionSource) rememberedValue5;
            startRestartGroup.startReplaceableGroup(1467810028);
            boolean changedInstance3 = startRestartGroup.changedInstance(onSwitched);
            Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionSwitchButton$1$1$6$1
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
                        onSwitched.invoke(2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            startRestartGroup.endReplaceableGroup();
            composer2 = startRestartGroup;
            TextKt.m3014Text4IGK_g("Sets", PaddingKt.m987paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance, ClickableKt.m571clickableO2vRcR0$default(companion3, mutableInteractionSource3, null, false, null, null, (Function0) rememberedValue6, 28, null), 1.0f, false, 2, null), 0.0f, Dp.m6997constructorimpl(f), 1, null), CollectionSwitchButton$lambda$5(m418animateColorAsStateeuL9pac3), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), TextUnitKt.getSp(22), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199686, 6, 129488);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionSwitchButton$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    MeCollectionKt.CollectionSwitchButton(Modifier.this, i, onSwitched, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CollectionSwitchButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1044200071);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1044200071, i, -1, "com.glority.android.picturexx.composable.CollectionSwitchButtonPreview (MeCollection.kt:269)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(null, null, Color.INSTANCE.m4543getCyan0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7784getLambda7$businessMod_release(), startRestartGroup, 12583296, 123);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$CollectionSwitchButtonPreview$1
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
                    MeCollectionKt.CollectionSwitchButtonPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void MeCollectionBackground(final Modifier modifier, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(872969982);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(872969982, i2, -1, "com.glority.android.picturexx.composable.MeCollectionBackground (MeCollection.kt:292)");
            }
            BoxKt.Box(BackgroundKt.background$default(modifier, Brush.Companion.m4472verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m4505boximpl(ColorKt.Color(4294960560L)), Color.m4505boximpl(Color.INSTANCE.m4550getTransparent0d7_KjU())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null), startRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$MeCollectionBackground$1
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

                public final void invoke(Composer composer2, int i3) {
                    MeCollectionKt.MeCollectionBackground(Modifier.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MeCollectionBackgroundPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1131115879);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1131115879, i, -1, "com.glority.android.picturexx.composable.MeCollectionBackgroundPreview (MeCollection.kt:305)");
            }
            SurfaceKt.m2864SurfaceT9BRK9s(SizeKt.m1016height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6997constructorimpl(100)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$MeCollectionKt.INSTANCE.m7785getLambda8$businessMod_release(), startRestartGroup, 12582918, 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.composable.MeCollectionKt$MeCollectionBackgroundPreview$1
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
                    MeCollectionKt.MeCollectionBackgroundPreview(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final long CollectionSwitchButton$lambda$3(State<Color> state) {
        return state.getValue().m4525unboximpl();
    }

    private static final long CollectionSwitchButton$lambda$4(State<Color> state) {
        return state.getValue().m4525unboximpl();
    }

    private static final long CollectionSwitchButton$lambda$5(State<Color> state) {
        return state.getValue().m4525unboximpl();
    }

    private static final float CollectionSwitchButton$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }
}
