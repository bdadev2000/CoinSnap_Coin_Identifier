package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.profileinstaller.ProfileVerifier;
import com.glority.base.utils.StatusBarUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Card.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a_\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018\u001aw\u0010\u0019\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001a\u001aS\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a]\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0013¢\u0006\u0002\b\u0015¢\u0006\u0002\b\u0016H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u001d"}, d2 = {"Card", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "colors", "Landroidx/compose/material3/CardColors;", "elevation", "Landroidx/compose/material3/CardElevation;", androidx.compose.material.OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ElevatedCard", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/CardColors;Landroidx/compose/material3/CardElevation;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "OutlinedCard", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class CardKt {
    public static final void Card(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Modifier.Companion companion;
        Shape shape3;
        CardColors cardColors3;
        CardElevation cardElevation3;
        BorderStroke borderStroke3;
        int i4;
        CardElevation cardElevation4;
        final CardElevation cardElevation5;
        final BorderStroke borderStroke4;
        int i5;
        int i6;
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(1179621553);
        ComposerKt.sourceInformation(startRestartGroup, "C(Card)P(4,5,1,3)82@3741L5,83@3786L12,84@3844L15,93@4163L57,95@4259L41,88@3951L349:Card.kt#uh7d8r");
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                shape2 = shape;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i6 = 256;
                    i3 |= i6;
                }
            } else {
                cardColors2 = cardColors;
            }
            i6 = 128;
            i3 |= i6;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            cardElevation2 = cardElevation;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
            borderStroke2 = borderStroke;
        } else {
            borderStroke2 = borderStroke;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(borderStroke2) ? 16384 : 8192;
            }
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i8 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getShape(startRestartGroup, 6);
                    i3 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 4) != 0) {
                    cardColors3 = CardDefaults.INSTANCE.cardColors(startRestartGroup, 6);
                    i3 &= -897;
                } else {
                    cardColors3 = cardColors2;
                }
                if ((i2 & 8) != 0) {
                    cardElevation3 = CardDefaults.INSTANCE.m2151cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                    i3 &= -7169;
                } else {
                    cardElevation3 = cardElevation2;
                }
                borderStroke3 = i9 != 0 ? null : borderStroke;
                CardElevation cardElevation6 = cardElevation3;
                i4 = i3;
                cardElevation4 = cardElevation6;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                companion = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                borderStroke3 = borderStroke2;
                i4 = i3;
                cardElevation4 = cardElevation2;
            }
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1179621553, i4, -1, "androidx.compose.material3.Card (Card.kt:87)");
            }
            CardElevation cardElevation7 = cardElevation4;
            SurfaceKt.m2864SurfaceT9BRK9s(companion, shape3, cardColors3.m2143containerColorvNxB06k$material3_release(true), cardColors3.m2144contentColorvNxB06k$material3_release(true), 0.0f, cardElevation4.shadowElevation$material3_release(true, null, startRestartGroup, ((i4 >> 3) & 896) | 54).getValue().m7011unboximpl(), borderStroke3, ComposableLambdaKt.rememberComposableLambda(664103990, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
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

                public final void invoke(Composer composer2, int i10) {
                    ComposerKt.sourceInformation(composer2, "C96@4269L25:Card.kt#uh7d8r");
                    if ((i10 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(664103990, i10, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:96)");
                    }
                    Function3<ColumnScope, Composer, Integer, Unit> function32 = function3;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)85@4251L61,86@4317L133:Column.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                    Updater.m4015setimpl(m4008constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4015setimpl(m4008constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m4008constructorimpl.getInserting() || !Intrinsics.areEqual(m4008constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m4008constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m4008constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m4015setimpl(m4008constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384862393, "C87@4365L9:Column.kt#2w3rfo");
                    function32.invoke(ColumnScopeInstance.INSTANCE, composer2, 6);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, (i4 & 14) | 12582912 | (i4 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (3670016 & (i4 << 6)), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cardColors2 = cardColors3;
            cardElevation5 = cardElevation7;
            borderStroke4 = borderStroke3;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            shape3 = shape2;
            cardElevation5 = cardElevation2;
            borderStroke4 = borderStroke2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = companion;
            final Shape shape4 = shape3;
            final CardColors cardColors4 = cardColors2;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$2
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

                public final void invoke(Composer composer2, int i10) {
                    CardKt.Card(Modifier.this, shape4, cardColors4, cardElevation5, borderStroke4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Card(final kotlin.jvm.functions.Function0<kotlin.Unit> r30, androidx.compose.ui.Modifier r31, boolean r32, androidx.compose.ui.graphics.Shape r33, androidx.compose.material3.CardColors r34, androidx.compose.material3.CardElevation r35, androidx.compose.foundation.BorderStroke r36, androidx.compose.foundation.interaction.MutableInteractionSource r37, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.Card(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedCard(androidx.compose.ui.Modifier r19, androidx.compose.ui.graphics.Shape r20, androidx.compose.material3.CardColors r21, androidx.compose.material3.CardElevation r22, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.ElevatedCard(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ElevatedCard(final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.ui.Modifier r25, boolean r26, androidx.compose.ui.graphics.Shape r27, androidx.compose.material3.CardColors r28, androidx.compose.material3.CardElevation r29, androidx.compose.foundation.interaction.MutableInteractionSource r30, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.ElevatedCard(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void OutlinedCard(Modifier modifier, Shape shape, CardColors cardColors, CardElevation cardElevation, BorderStroke borderStroke, final Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Shape shape2;
        CardColors cardColors2;
        CardElevation cardElevation2;
        BorderStroke borderStroke2;
        Modifier.Companion companion;
        Shape shape3;
        CardColors cardColors3;
        BorderStroke borderStroke3;
        final CardElevation cardElevation3;
        int i4;
        int i5;
        int i6;
        Composer startRestartGroup = composer.startRestartGroup(740336179);
        ComposerKt.sourceInformation(startRestartGroup, "C(OutlinedCard)P(4,5,1,3)297@13151L13,298@13204L20,299@13270L23,300@13335L20,303@13413L170:Card.kt#uh7d8r");
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                if (startRestartGroup.changed(shape2)) {
                    i6 = 32;
                    i3 |= i6;
                }
            } else {
                shape2 = shape;
            }
            i6 = 16;
            i3 |= i6;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                cardColors2 = cardColors;
                if (startRestartGroup.changed(cardColors2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                cardColors2 = cardColors;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            cardColors2 = cardColors;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cardElevation2 = cardElevation;
                if (startRestartGroup.changed(cardElevation2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                cardElevation2 = cardElevation;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i & 24576) == 0) {
            borderStroke2 = borderStroke;
            i3 |= ((i2 & 16) == 0 && startRestartGroup.changed(borderStroke2)) ? 16384 : 8192;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= startRestartGroup.changedInstance(function3) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                companion = i7 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    shape3 = CardDefaults.INSTANCE.getOutlinedShape(startRestartGroup, 6);
                    i3 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 4) != 0) {
                    cardColors3 = CardDefaults.INSTANCE.outlinedCardColors(startRestartGroup, 6);
                    i3 &= -897;
                } else {
                    cardColors3 = cardColors2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cardElevation2 = CardDefaults.INSTANCE.m2155outlinedCardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, 1572864, 63);
                }
                if ((i2 & 16) != 0) {
                    borderStroke3 = CardDefaults.INSTANCE.outlinedCardBorder(false, startRestartGroup, 48, 1);
                    i3 &= -57345;
                } else {
                    borderStroke3 = borderStroke;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                companion = modifier2;
                shape3 = shape2;
                cardColors3 = cardColors2;
                borderStroke3 = borderStroke2;
            }
            CardElevation cardElevation4 = cardElevation2;
            int i8 = i3;
            cardElevation3 = cardElevation4;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(740336179, i8, -1, "androidx.compose.material3.OutlinedCard (Card.kt:303)");
            }
            Card(companion, shape3, cardColors3, cardElevation3, borderStroke3, function3, startRestartGroup, (i8 & 14) | (i8 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | (i8 & 896) | (i8 & 7168) | (57344 & i8) | (i8 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            borderStroke2 = borderStroke3;
        } else {
            startRestartGroup.skipToGroupEnd();
            companion = modifier2;
            shape3 = shape2;
            cardColors3 = cardColors2;
            cardElevation3 = cardElevation2;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = companion;
            final Shape shape4 = shape3;
            final CardColors cardColors4 = cardColors3;
            final BorderStroke borderStroke4 = borderStroke2;
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$OutlinedCard$1
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

                public final void invoke(Composer composer2, int i9) {
                    CardKt.OutlinedCard(Modifier.this, shape4, cardColors4, cardElevation3, borderStroke4, function3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OutlinedCard(final kotlin.jvm.functions.Function0<kotlin.Unit> r24, androidx.compose.ui.Modifier r25, boolean r26, androidx.compose.ui.graphics.Shape r27, androidx.compose.material3.CardColors r28, androidx.compose.material3.CardElevation r29, androidx.compose.foundation.BorderStroke r30, androidx.compose.foundation.interaction.MutableInteractionSource r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.OutlinedCard(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
