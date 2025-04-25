package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.DialogNavigator;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialogHost.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\n\u001a%\u0010\u000b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00070\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012X\u008a\u0084\u0002"}, d2 = {"DialogHost", "", "dialogNavigator", "Landroidx/navigation/compose/DialogNavigator;", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/runtime/Composer;I)V", "rememberVisibleList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Landroidx/navigation/NavBackStackEntry;", "backStack", "", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "PopulateVisibleList", "", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "navigation-compose_release", "dialogBackStack", "", "transitionInProgress", ""}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class DialogHostKt {
    public static final void DialogHost(final DialogNavigator dialogNavigator, Composer composer, final int i) {
        SnapshotStateList snapshotStateList;
        Object obj;
        Composer startRestartGroup = composer.startRestartGroup(294589392);
        ComposerKt.sourceInformation(startRestartGroup, "C(DialogHost)41@1668L29,42@1751L16,43@1795L36,44@1853L36,46@1960L16,47@2004L52,73@3243L294,73@3188L349:DialogHost.kt#opm8kd");
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(dialogNavigator) ? 4 : 2) | i : i;
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i2, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            boolean z = false;
            final SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
            Continuation continuation = null;
            boolean z2 = true;
            State collectAsState = SnapshotStateKt.collectAsState(dialogNavigator.getBackStack$navigation_compose_release(), null, startRestartGroup, 0, 1);
            SnapshotStateList<NavBackStackEntry> rememberVisibleList = rememberVisibleList(DialogHost$lambda$0(collectAsState), startRestartGroup, 0);
            PopulateVisibleList(rememberVisibleList, DialogHost$lambda$0(collectAsState), startRestartGroup, 0);
            State collectAsState2 = SnapshotStateKt.collectAsState(dialogNavigator.getTransitionInProgress$navigation_compose_release(), null, startRestartGroup, 0, 1);
            String str = "CC(remember):DialogHost.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1361033813, "CC(remember):DialogHost.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) rememberedValue;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1361037007);
            ComposerKt.sourceInformation(startRestartGroup, "*52@2222L43,54@2331L588,51@2183L736");
            for (final NavBackStackEntry navBackStackEntry : rememberVisibleList) {
                NavDestination destination = navBackStackEntry.getDestination();
                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                final DialogNavigator.Destination destination2 = (DialogNavigator.Destination) destination;
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1136022005, str);
                boolean changedInstance = ((i2 & 14) == 4 ? z2 : z) | startRestartGroup.changedInstance(navBackStackEntry);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = (Function0) new Function0<Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$1$1
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
                            DialogNavigator.this.dismiss$navigation_compose_release(navBackStackEntry);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final SnapshotStateList snapshotStateList3 = snapshotStateList2;
                AndroidDialog_androidKt.Dialog((Function0) rememberedValue2, destination2.getDialogProperties(), ComposableLambdaKt.rememberComposableLambda(1129586364, z2, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2
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
                        ComposerKt.sourceInformation(composer2, "C55@2378L247,55@2345L280,65@2842L67,65@2801L108:DialogHost.kt#opm8kd");
                        if ((i3 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1129586364, i3, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
                        }
                        NavBackStackEntry navBackStackEntry2 = NavBackStackEntry.this;
                        ComposerKt.sourceInformationMarkerStart(composer2, -1838164906, "CC(remember):DialogHost.kt#9igjgp");
                        boolean changedInstance2 = composer2.changedInstance(NavBackStackEntry.this) | composer2.changed(dialogNavigator);
                        final SnapshotStateList<NavBackStackEntry> snapshotStateList4 = snapshotStateList3;
                        final NavBackStackEntry navBackStackEntry3 = NavBackStackEntry.this;
                        final DialogNavigator dialogNavigator2 = dialogNavigator;
                        Object rememberedValue3 = composer2.rememberedValue();
                        if (changedInstance2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = (Function1) new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    snapshotStateList4.add(navBackStackEntry3);
                                    final DialogNavigator dialogNavigator3 = dialogNavigator2;
                                    final NavBackStackEntry navBackStackEntry4 = navBackStackEntry3;
                                    final SnapshotStateList<NavBackStackEntry> snapshotStateList5 = snapshotStateList4;
                                    return new DisposableEffectResult() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            DialogNavigator.this.onTransitionComplete$navigation_compose_release(navBackStackEntry4);
                                            snapshotStateList5.remove(navBackStackEntry4);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue3);
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        EffectsKt.DisposableEffect(navBackStackEntry2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue3, composer2, 0);
                        NavBackStackEntry navBackStackEntry4 = NavBackStackEntry.this;
                        SaveableStateHolder saveableStateHolder = rememberSaveableStateHolder;
                        final DialogNavigator.Destination destination3 = destination2;
                        final NavBackStackEntry navBackStackEntry5 = NavBackStackEntry.this;
                        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry4, saveableStateHolder, ComposableLambdaKt.rememberComposableLambda(-497631156, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$1$2.2
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
                                ComposerKt.sourceInformation(composer3, "C66@2872L23:DialogHost.kt#opm8kd");
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-497631156, i4, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                                }
                                DialogNavigator.Destination.this.getContent$navigation_compose_release().invoke(navBackStackEntry5, composer3, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 384);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, startRestartGroup, 54), startRestartGroup, 384, 0);
                continuation = null;
                i2 = i2;
                str = str;
                collectAsState2 = collectAsState2;
                z2 = z2;
                z = z;
                snapshotStateList2 = snapshotStateList2;
            }
            SnapshotStateList snapshotStateList4 = snapshotStateList2;
            State state = collectAsState2;
            boolean z3 = z2;
            Continuation continuation2 = continuation;
            boolean z4 = z;
            startRestartGroup.endReplaceGroup();
            Set<NavBackStackEntry> DialogHost$lambda$1 = DialogHost$lambda$1(state);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1361073703, str);
            boolean changed = startRestartGroup.changed(state) | ((i2 & 14) == 4 ? z3 : z4);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                snapshotStateList = snapshotStateList4;
                obj = (Function2) new DialogHostKt$DialogHost$2$1(state, dialogNavigator, snapshotStateList, continuation2);
                startRestartGroup.updateRememberedValue(obj);
            } else {
                obj = rememberedValue3;
                snapshotStateList = snapshotStateList4;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.LaunchedEffect(DialogHost$lambda$1, snapshotStateList, (Function2) obj, startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$DialogHost$3
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
                    DialogHostKt.DialogHost(DialogNavigator.this, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final void PopulateVisibleList(final List<NavBackStackEntry> list, final Collection<NavBackStackEntry> collection, Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1537894851);
        ComposerKt.sourceInformation(startRestartGroup, "C(PopulateVisibleList)89@3710L7,*91@3793L961,91@3759L995:DialogHost.kt#opm8kd");
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(collection) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537894851, i2, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:88)");
            }
            ProvidableCompositionLocal<Boolean> localInspectionMode = InspectionModeKt.getLocalInspectionMode();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localInspectionMode);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            boolean booleanValue = ((Boolean) consume).booleanValue();
            for (NavBackStackEntry navBackStackEntry : collection) {
                Lifecycle lifecycleRegistry = navBackStackEntry.getLifecycleRegistry();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -788103595, "CC(remember):DialogHost.kt#9igjgp");
                boolean changed = startRestartGroup.changed(booleanValue) | startRestartGroup.changedInstance(list) | startRestartGroup.changedInstance(navBackStackEntry);
                DialogHostKt$PopulateVisibleList$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new DialogHostKt$PopulateVisibleList$1$1$1(navBackStackEntry, booleanValue, list);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                EffectsKt.DisposableEffect(lifecycleRegistry, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, startRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$2
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
                    DialogHostKt.PopulateVisibleList(list, collection, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation.NavBackStackEntry> rememberVisibleList(java.util.Collection<androidx.navigation.NavBackStackEntry> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            java.lang.String r0 = "C(rememberVisibleList)121@4970L7,122@4989L399:DialogHost.kt#opm8kd"
            r1 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r1, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L14
            r0 = -1
            java.lang.String r2 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r7, r0, r2)
        L14:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.InspectionModeKt.getLocalInspectionMode()
            androidx.compose.runtime.CompositionLocal r7 = (androidx.compose.runtime.CompositionLocal) r7
            r0 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r1 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r0, r1)
            java.lang.Object r7 = r6.consume(r7)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = -393426303(0xffffffffe88cca81, float:-5.318935E24)
            java.lang.String r1 = "CC(remember):DialogHost.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r6, r0, r1)
            boolean r0 = r6.changed(r5)
            java.lang.Object r1 = r6.rememberedValue()
            if (r0 != 0) goto L49
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r0 = r0.getEmpty()
            if (r1 != r0) goto L88
        L49:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r5 = r5.iterator()
        L5a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r5.next()
            r3 = r2
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            if (r7 == 0) goto L6a
            goto L7a
        L6a:
            androidx.lifecycle.Lifecycle r3 = r3.getLifecycleRegistry()
            androidx.lifecycle.Lifecycle$State r3 = r3.getState()
            androidx.lifecycle.Lifecycle$State r4 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r3 = r3.isAtLeast(r4)
            if (r3 == 0) goto L5a
        L7a:
            r0.add(r2)
            goto L5a
        L7e:
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            r6.updateRememberedValue(r1)
        L88:
            androidx.compose.runtime.snapshots.SnapshotStateList r1 = (androidx.compose.runtime.snapshots.SnapshotStateList) r1
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L96
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L96:
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.DialogHostKt.rememberVisibleList(java.util.Collection, androidx.compose.runtime.Composer, int):androidx.compose.runtime.snapshots.SnapshotStateList");
    }

    private static final List<NavBackStackEntry> DialogHost$lambda$0(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<NavBackStackEntry> DialogHost$lambda$1(State<? extends Set<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
