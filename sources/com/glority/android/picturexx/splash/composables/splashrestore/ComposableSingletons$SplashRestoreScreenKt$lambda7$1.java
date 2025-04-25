package com.glority.android.picturexx.splash.composables.splashrestore;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SplashRestoreScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* renamed from: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1, reason: invalid class name */
/* loaded from: classes5.dex */
final class ComposableSingletons$SplashRestoreScreenKt$lambda7$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SplashRestoreScreenKt$lambda7$1 INSTANCE = new ComposableSingletons$SplashRestoreScreenKt$lambda7$1();

    ComposableSingletons$SplashRestoreScreenKt$lambda7$1() {
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
                ComposerKt.traceEventStart(-1277942011, i, -1, "com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt.lambda-7.<anonymous> (SplashRestoreScreen.kt:505)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(RestoreState.LOADING, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            MutableState mutableState = (MutableState) rememberedValue;
            Unit unit = Unit.INSTANCE;
            composer.startReplaceableGroup(-1093416645);
            boolean changed = composer.changed(mutableState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function2) new ComposableSingletons$SplashRestoreScreenKt$lambda7$1$1$1(mutableState, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, composer, 70);
            SplashRestoreScreenKt.SplashRestoreScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), invoke$lambda$1(mutableState), new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function1<String, Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1.3
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1.4
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1.5
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.glority.android.picturexx.splash.composables.splashrestore.ComposableSingletons$SplashRestoreScreenKt$lambda-7$1.6
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer, 1797510, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RestoreState invoke$lambda$1(MutableState<RestoreState> mutableState) {
        return mutableState.getValue();
    }
}
