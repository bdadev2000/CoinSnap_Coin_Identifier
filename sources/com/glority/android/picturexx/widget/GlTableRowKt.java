package com.glority.android.picturexx.widget;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.glority.android.picturexx.theme.CoinColor;
import com.glority.base.utils.StatusBarUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlTableRow.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aZ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\fH\u0007¢\u0006\u0002\u0010\u0010\u001a1\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001e¨\u0006\u001f²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\n\u0010 \u001a\u00020\u0016X\u008a\u0084\u0002"}, d2 = {"GlTabRow", "", "selectedTabIndex", "", FirebaseAnalytics.Param.ITEMS, "", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "(ILjava/util/List;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "MyTabIndicator", "indicatorWidth", "Landroidx/compose/ui/unit/Dp;", "indicatorOffset", "indicatorColor", "Landroidx/compose/ui/graphics/Color;", "MyTabIndicator-dopO0OQ", "(FFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "MyTabItem", "isSelected", "", "Lkotlin/Function0;", "text", "(ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "businessMod_release", "tabTextColor"}, k = 2, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class GlTableRowKt {
    public static final void GlTabRow(final int i, final List<String> items, Shape shape, Modifier modifier, final Function1<? super Integer, Unit> onClick, Composer composer, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1216053417);
        RoundedCornerShape circleShape = (i3 & 4) != 0 ? RoundedCornerShapeKt.getCircleShape() : shape;
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1216053417, i2, -1, "com.glority.android.picturexx.widget.GlTabRow (GlTableRow.kt:48)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -492369756, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m6995boximpl(Dp.m6997constructorimpl(0)), null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final MutableState mutableState = (MutableState) rememberedValue;
        ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localDensity);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Density density = (Density) consume;
        State<Dp> m432animateDpAsStateAjpBEmI = AnimateAsStateKt.m432animateDpAsStateAjpBEmI(Dp.m6997constructorimpl(GlTabRow$lambda$1(mutableState) * i), AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), "", null, startRestartGroup, 432, 8);
        final Modifier modifier3 = modifier2;
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(IntrinsicKt.height(PaddingKt.m985padding3ABfNKs(BackgroundKt.m540backgroundbw27NRU$default(ClipKt.clip(modifier2, circleShape), CoinColor.INSTANCE.m7867colorF2F2F2WaAFU9c(startRestartGroup, 6), null, 2, null), Dp.m6997constructorimpl(4)), IntrinsicSize.Min), new Function1<LayoutCoordinates, Unit>() { // from class: com.glority.android.picturexx.widget.GlTableRowKt$GlTabRow$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates it) {
                Intrinsics.checkNotNullParameter(it, "it");
                GlTableRowKt.GlTabRow$lambda$2(mutableState, Density.this.mo673toDpu2uoSUM(LayoutCoordinatesKt.boundsInParent(it).getWidth() / items.size()));
            }
        });
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, onGloballyPositioned);
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
        m7925MyTabIndicatordopO0OQ(GlTabRow$lambda$1(mutableState), GlTabRow$lambda$3(m432animateDpAsStateAjpBEmI), Color.INSTANCE.m4541getBlack0d7_KjU(), circleShape, startRestartGroup, ((i2 << 3) & 7168) | 384, 0);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Modifier clip = ClipKt.clip(Modifier.INSTANCE, RoundedCornerShapeKt.getCircleShape());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, clip);
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
        startRestartGroup.startReplaceableGroup(422434329);
        List<String> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        final int i4 = 0;
        for (Object obj : list) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) obj;
            boolean z = i4 == i;
            startRestartGroup.startReplaceableGroup(1195374267);
            boolean changedInstance = startRestartGroup.changedInstance(onClick) | startRestartGroup.changed(i4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.widget.GlTableRowKt$GlTabRow$2$1$1$1$1
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
                        onClick.invoke(Integer.valueOf(i4));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceableGroup();
            MyTabItem(z, (Function0) rememberedValue2, str, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), startRestartGroup, 0);
            arrayList.add(Unit.INSTANCE);
            i4 = i5;
        }
        startRestartGroup.endReplaceableGroup();
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
            final Shape shape2 = circleShape;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.widget.GlTableRowKt$GlTabRow$3
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
                    GlTableRowKt.GlTabRow(i, items, shape2, modifier3, onClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GlTabRow$lambda$2(MutableState<Dp> mutableState, float f) {
        mutableState.setValue(Dp.m6995boximpl(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* renamed from: MyTabIndicator-dopO0OQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m7925MyTabIndicatordopO0OQ(final float r16, final float r17, final long r18, androidx.compose.ui.graphics.Shape r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.picturexx.widget.GlTableRowKt.m7925MyTabIndicatordopO0OQ(float, float, long, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MyTabItem(final boolean z, final Function0<Unit> function0, final String str, final Modifier modifier, Composer composer, final int i) {
        int i2;
        long m4541getBlack0d7_KjU;
        Composer startRestartGroup = composer.startRestartGroup(502382073);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(502382073, i3, -1, "com.glority.android.picturexx.widget.MyTabItem (GlTableRow.kt:125)");
            }
            if (z) {
                m4541getBlack0d7_KjU = Color.INSTANCE.m4552getWhite0d7_KjU();
            } else {
                m4541getBlack0d7_KjU = Color.INSTANCE.m4541getBlack0d7_KjU();
            }
            State<Color> m418animateColorAsStateeuL9pac = SingleValueAnimationKt.m418animateColorAsStateeuL9pac(m4541getBlack0d7_KjU, AnimationSpecKt.tween$default(0, 0, EasingKt.getLinearEasing(), 3, null), null, null, startRestartGroup, 48, 12);
            Modifier clip = ClipKt.clip(modifier, RoundedCornerShapeKt.getCircleShape());
            startRestartGroup.startReplaceableGroup(1195375421);
            boolean changedInstance = startRestartGroup.changedInstance(function0);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = (Function0) new Function0<Unit>() { // from class: com.glority.android.picturexx.widget.GlTableRowKt$MyTabItem$1$1
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
            TextKt.m3014Text4IGK_g(str, PaddingKt.m986paddingVpY3zN4(ClickableKt.m573clickableXHw0xAI$default(clip, false, null, null, (Function0) rememberedValue, 7, null), Dp.m6997constructorimpl(12), Dp.m6997constructorimpl(8)), MyTabItem$lambda$8(m418animateColorAsStateeuL9pac), TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getW500(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6857boximpl(TextAlign.INSTANCE.m6864getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, startRestartGroup, ((i3 >> 6) & 14) | 199680, 0, 130512);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.glority.android.picturexx.widget.GlTableRowKt$MyTabItem$2
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

                public final void invoke(Composer composer2, int i4) {
                    GlTableRowKt.MyTabItem(z, function0, str, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final float GlTabRow$lambda$1(MutableState<Dp> mutableState) {
        return mutableState.getValue().m7011unboximpl();
    }

    private static final float GlTabRow$lambda$3(State<Dp> state) {
        return state.getValue().m7011unboximpl();
    }

    private static final long MyTabItem$lambda$8(State<Color> state) {
        return state.getValue().m4525unboximpl();
    }
}
