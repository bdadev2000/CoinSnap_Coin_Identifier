package com.glority.android.picturexx.composable;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: MeCollection.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* renamed from: com.glority.android.picturexx.composable.ComposableSingletons$MeCollectionKt$lambda-7$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$MeCollectionKt$lambda7$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MeCollectionKt$lambda7$1 INSTANCE = new ComposableSingletons$MeCollectionKt$lambda7$1();

    ComposableSingletons$MeCollectionKt$lambda7$1() {
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
                ComposerKt.traceEventStart(1343420564, i, -1, "com.glority.android.picturexx.composable.ComposableSingletons$MeCollectionKt.lambda-7.<anonymous> (MeCollection.kt:273)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotIntStateKt.mutableIntStateOf(0);
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final MutableIntState mutableIntState = (MutableIntState) rememberedValue;
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            int invoke$lambda$1 = invoke$lambda$1(mutableIntState);
            composer.startReplaceableGroup(1467810814);
            boolean changed = composer.changed(mutableIntState);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (Function1) new Function1<Integer, Unit>() { // from class: com.glority.android.picturexx.composable.ComposableSingletons$MeCollectionKt$lambda-7$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                        invoke(num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i2) {
                        MutableIntState.this.setIntValue(i2);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            MeCollectionKt.CollectionSwitchButton(fillMaxWidth$default, invoke$lambda$1, (Function1) rememberedValue2, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    private static final int invoke$lambda$1(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }
}
