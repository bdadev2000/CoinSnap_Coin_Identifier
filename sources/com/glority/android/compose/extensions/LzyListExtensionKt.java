package com.glority.android.compose.extensions;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.base.utils.StatusBarUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LzyListExtension.kt */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0010¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"gridItems", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/foundation/lazy/LazyListScope;", "data", "", "columnCount", "", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function4;)V", "lib-compose_release"}, k = 2, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LzyListExtensionKt {
    public static /* synthetic */ void gridItems$default(LazyListScope lazyListScope, List list, int i, Modifier modifier, Arrangement.Horizontal horizontal, Function4 function4, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            horizontal = Arrangement.INSTANCE.getStart();
        }
        gridItems(lazyListScope, list, i, modifier, horizontal, function4);
    }

    public static final <T> void gridItems(LazyListScope lazyListScope, final List<? extends T> data, final int i, final Modifier modifier, final Arrangement.Horizontal horizontalArrangement, final Function4<? super BoxScope, ? super T, ? super Composer, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(lazyListScope, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(horizontalArrangement, "horizontalArrangement");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        final int size = data.size();
        LazyListScope.items$default(lazyListScope, size == 0 ? 0 : ((size - 1) / i) + 1, new Function1<Integer, Object>() { // from class: com.glority.android.compose.extensions.LzyListExtensionKt$gridItems$1
            public final Object invoke(int i2) {
                return Integer.valueOf(Integer.hashCode(i2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }
        }, null, ComposableLambdaKt.composableLambdaInstance(1382479166, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.glority.android.compose.extensions.LzyListExtensionKt$gridItems$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope items, int i2, Composer composer, int i3) {
                int i4;
                char c;
                boolean z;
                Intrinsics.checkNotNullParameter(items, "$this$items");
                if ((i3 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) == 0) {
                    i4 = i3 | (composer.changed(i2) ? 32 : 16);
                } else {
                    i4 = i3;
                }
                if ((i4 & 721) != 144 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1382479166, i4, -1, "com.glority.android.compose.extensions.gridItems.<anonymous> (LzyListExtension.kt:23)");
                    }
                    Modifier modifier2 = Modifier.this;
                    Arrangement.Horizontal horizontal = horizontalArrangement;
                    int i5 = i;
                    int i6 = size;
                    Function4<BoxScope, T, Composer, Integer, Unit> function4 = itemContent;
                    List<T> list = data;
                    composer.startReplaceableGroup(693286680);
                    ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(horizontal, Alignment.INSTANCE.getTop(), composer, 0);
                    int i7 = -1323940314;
                    composer.startReplaceableGroup(-1323940314);
                    ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier2);
                    if (!(composer.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(constructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m4008constructorimpl = Updater.m4008constructorimpl(composer);
                    Updater.m4015setimpl(m4008constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(composer)), composer, 0);
                    char c2 = 43753;
                    composer.startReplaceableGroup(2058660585);
                    ComposerKt.sourceInformationMarkerStart(composer, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    composer.startReplaceableGroup(-256114424);
                    int i8 = 0;
                    while (i8 < i5) {
                        int i9 = (i2 * i5) + i8;
                        if (i9 < i6) {
                            composer.startReplaceableGroup(1578406463);
                            Modifier weight = rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true);
                            composer.startReplaceableGroup(733328855);
                            ComposerKt.sourceInformation(composer, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer, 48);
                            composer.startReplaceableGroup(i7);
                            ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(weight);
                            if (!(composer.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor2);
                            } else {
                                composer.useNode();
                            }
                            Composer m4008constructorimpl2 = Updater.m4008constructorimpl(composer);
                            Updater.m4015setimpl(m4008constructorimpl2, rememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m4015setimpl(m4008constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m4008constructorimpl2.getInserting() || !Intrinsics.areEqual(m4008constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m4008constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m4008constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            modifierMaterializerOf2.invoke(SkippableUpdater.m3999boximpl(SkippableUpdater.m4000constructorimpl(composer)), composer, 0);
                            c = 43753;
                            composer.startReplaceableGroup(2058660585);
                            ComposerKt.sourceInformationMarkerStart(composer, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            function4.invoke(BoxScopeInstance.INSTANCE, list.get(i9), composer, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endReplaceableGroup();
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            z = false;
                        } else {
                            c = c2;
                            composer.startReplaceableGroup(1578406736);
                            z = false;
                            SpacerKt.Spacer(rowScopeInstance.weight(Modifier.INSTANCE, 1.0f, true), composer, 0);
                            composer.endReplaceableGroup();
                        }
                        i8++;
                        c2 = c;
                        i7 = -1323940314;
                    }
                    composer.endReplaceableGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    composer.endReplaceableGroup();
                    composer.endNode();
                    composer.endReplaceableGroup();
                    composer.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }
        }), 4, null);
    }
}
