package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
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
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.material.internal.ViewUtils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: DateRangeInput.kt */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0085\u0001\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062:\u0010\b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\u0010\u0018\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002¨\u0006\u0019"}, d2 = {"TextFieldSpacing", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangeInputContent", "", "selectedStartDateMillis", "", "selectedEndDateMillis", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startDateMillis", "endDateMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes8.dex */
public final class DateRangeInputKt {
    private static final float TextFieldSpacing = Dp.m6997constructorimpl(8);

    public static final void DateRangeInputContent(final Long l, final Long l2, final Function2<? super Long, ? super Long, Unit> function2, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        int i3;
        Object obj;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-607499086);
        ComposerKt.sourceInformation(startRestartGroup, "C(DateRangeInputContent)P(6,5,3!1,7,2,4)45@1775L15,47@1825L75,48@1928L45,49@2008L44,50@2086L45,51@2160L50,53@2248L530,70@2991L2331:DateRangeInput.kt#uh7d8r");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(l2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(calendarModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(intRange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? startRestartGroup.changed(datePickerFormatter) : startRestartGroup.changedInstance(datePickerFormatter) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(selectableDates) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= startRestartGroup.changed(datePickerColors) ? 8388608 : 4194304;
        }
        if ((i2 & 4793491) != 4793490 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-607499086, i2, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:43)");
            }
            Locale defaultLocale = CalendarLocale_androidKt.defaultLocale(startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 998328518, "CC(remember):DateRangeInput.kt#9igjgp");
            boolean changed = startRestartGroup.changed(defaultLocale);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = calendarModel.getDateInputFormat(defaultLocale);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            DateInputFormat dateInputFormat = (DateInputFormat) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Strings.Companion companion = Strings.INSTANCE;
            String m3296getString2EP1pXo = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_date_input_invalid_for_pattern), startRestartGroup, 0);
            Strings.Companion companion2 = Strings.INSTANCE;
            String m3296getString2EP1pXo2 = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_date_input_invalid_year_range), startRestartGroup, 0);
            Strings.Companion companion3 = Strings.INSTANCE;
            String m3296getString2EP1pXo3 = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_date_input_invalid_not_allowed), startRestartGroup, 0);
            Strings.Companion companion4 = Strings.INSTANCE;
            String m3296getString2EP1pXo4 = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_date_range_input_invalid_range_input), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 998342509, "CC(remember):DateRangeInput.kt#9igjgp");
            boolean changed2 = startRestartGroup.changed(dateInputFormat) | ((i2 & 458752) == 131072 || ((262144 & i2) != 0 && startRestartGroup.changed(datePickerFormatter)));
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new DateInputValidator(intRange, selectableDates, dateInputFormat, datePickerFormatter, m3296getString2EP1pXo, m3296getString2EP1pXo2, m3296getString2EP1pXo3, m3296getString2EP1pXo4, null, null, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DateInputValidator dateInputValidator = (DateInputValidator) rememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            dateInputValidator.setCurrentStartDateMillis$material3_release(l);
            dateInputValidator.setCurrentEndDateMillis$material3_release(l2);
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, DateInputKt.getInputTextFieldPadding());
            Arrangement.HorizontalOrVertical m865spacedBy0680j_4 = Arrangement.INSTANCE.m865spacedBy0680j_4(TextFieldSpacing);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)98@4939L58,99@5002L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m865spacedBy0680j_4, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)78@3182L23,81@3333L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407918630, "C100@5047L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1199006788, "C75@3252L56,88@3849L203,79@3446L218,86@3692L62,76@3317L972,98@4317L54,110@4882L199,102@4509L190,108@4727L62,99@4380L936:DateRangeInput.kt#uh7d8r");
            final String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Strings.Companion companion5 = Strings.INSTANCE;
            final String m3296getString2EP1pXo5 = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_date_range_picker_start_headline), startRestartGroup, 0);
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.5f, false, 2, null);
            int m2497getStartDateInputJ2x2o4M = InputIdentifier.INSTANCE.m2497getStartDateInputJ2x2o4M();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1485363141, "CC(remember):DateRangeInput.kt#9igjgp");
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            int i5 = i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA;
            boolean z2 = z | (i5 == 32);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l3) {
                        invoke2(l3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Long l3) {
                        function2.invoke(l3, l2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            int i6 = i2 & 7168;
            int i7 = (i2 >> 21) & 14;
            int i8 = i2;
            DateInputKt.m2314DateInputTextFieldtQNruF0(weight$default, l, (Function1) rememberedValue3, calendarModel, ComposableLambdaKt.rememberComposableLambda(801434508, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2
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

                public final void invoke(Composer composer3, int i9) {
                    ComposerKt.sourceInformation(composer3, "C83@3580L52,80@3464L186:DateRangeInput.kt#uh7d8r");
                    if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(801434508, i9, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:80)");
                        }
                        String str = m3296getString2EP1pXo5;
                        Modifier.Companion companion6 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1505886067, "CC(remember):DateRangeInput.kt#9igjgp");
                        boolean changed3 = composer3.changed(m3296getString2EP1pXo5) | composer3.changed(upperCase);
                        final String str2 = m3296getString2EP1pXo5;
                        final String str3 = upperCase;
                        Object rememberedValue4 = composer3.rememberedValue();
                        if (changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue4);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        TextKt.m3014Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion6, false, (Function1) rememberedValue4, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(665407211, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3
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

                public final void invoke(Composer composer3, int i9) {
                    ComposerKt.sourceInformation(composer3, "C86@3694L58:DateRangeInput.kt#uh7d8r");
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(665407211, i9, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:86)");
                    }
                    TextKt.m3014Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), m2497getStartDateInputJ2x2o4M, dateInputValidator, dateInputFormat, defaultLocale, datePickerColors, startRestartGroup, ((i2 << 3) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA) | 1794048 | i6, i7);
            Strings.Companion companion6 = Strings.INSTANCE;
            final String m3296getString2EP1pXo6 = Strings_androidKt.m3296getString2EP1pXo(Strings.m3226constructorimpl(R.string.m3c_date_range_picker_end_headline), startRestartGroup, 0);
            Modifier weight$default2 = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 0.5f, false, 2, null);
            int m2495getEndDateInputJ2x2o4M = InputIdentifier.INSTANCE.m2495getEndDateInputJ2x2o4M();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1485396193, "CC(remember):DateRangeInput.kt#9igjgp");
            boolean z3 = (i4 == 256) | ((i8 & 14) == 4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                i3 = i5;
                obj = (Function1) new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$4$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Long l3) {
                        invoke2(l3);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Long l3) {
                        function2.invoke(l, l3);
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
            } else {
                obj = rememberedValue4;
                i3 = i5;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            composer2 = startRestartGroup;
            DateInputKt.m2314DateInputTextFieldtQNruF0(weight$default2, l2, (Function1) obj, calendarModel, ComposableLambdaKt.rememberComposableLambda(911487285, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5
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

                public final void invoke(Composer composer3, int i9) {
                    ComposerKt.sourceInformation(composer3, "C105@4617L50,103@4527L158:DateRangeInput.kt#uh7d8r");
                    if ((i9 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(911487285, i9, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:103)");
                        }
                        String str = m3296getString2EP1pXo6;
                        Modifier.Companion companion7 = Modifier.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composer3, -1505852885, "CC(remember):DateRangeInput.kt#9igjgp");
                        boolean changed3 = composer3.changed(m3296getString2EP1pXo6) | composer3.changed(upperCase);
                        final String str2 = m3296getString2EP1pXo6;
                        final String str3 = upperCase;
                        Object rememberedValue5 = composer3.rememberedValue();
                        if (changed3 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str2 + ", " + str3);
                                }
                            };
                            composer3.updateRememberedValue(rememberedValue5);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        TextKt.m3014Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion7, false, (Function1) rememberedValue5, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-961726252, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6
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

                public final void invoke(Composer composer3, int i9) {
                    ComposerKt.sourceInformation(composer3, "C108@4729L58:DateRangeInput.kt#uh7d8r");
                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-961726252, i9, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:108)");
                    }
                    TextKt.m3014Text4IGK_g(upperCase, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6.1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }
                    }), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131068);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), m2495getEndDateInputJ2x2o4M, dateInputValidator, dateInputFormat, defaultLocale, datePickerColors, startRestartGroup, i3 | 1794048 | i6, i7);
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
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$3
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

                public final void invoke(Composer composer3, int i9) {
                    DateRangeInputKt.DateRangeInputContent(l, l2, function2, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
