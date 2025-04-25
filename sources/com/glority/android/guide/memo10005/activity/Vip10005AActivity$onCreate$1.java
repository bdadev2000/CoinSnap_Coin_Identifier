package com.glority.android.guide.memo10005.activity;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: Vip10005AActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes13.dex */
final class Vip10005AActivity$onCreate$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Vip10005AActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vip10005AActivity$onCreate$1(Vip10005AActivity vip10005AActivity) {
        super(2);
        this.this$0 = vip10005AActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348500671, i, -1, "com.glority.android.guide.memo10005.activity.Vip10005AActivity.onCreate.<anonymous> (Vip10005AActivity.kt:134)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, -492369756, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("loading", null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            final MutableState mutableState = (MutableState) rememberedValue;
            String invoke$lambda$1 = invoke$lambda$1(mutableState);
            AnonymousClass1 anonymousClass1 = new Function1<AnimatedContentTransitionScope<String>, ContentTransform>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005AActivity$onCreate$1.1
                @Override // kotlin.jvm.functions.Function1
                public final ContentTransform invoke(AnimatedContentTransitionScope<String> AnimatedContent) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(600, 0, null, 6, null), 0.0f, 2, null));
                }
            };
            final Vip10005AActivity vip10005AActivity = this.this$0;
            AnimatedContentKt.AnimatedContent(invoke$lambda$1, null, anonymousClass1, null, "", null, ComposableLambdaKt.composableLambda(composer, -847208855, true, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005AActivity$onCreate$1.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str, Composer composer2, Integer num) {
                    invoke(animatedContentScope, str, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, String it, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(it, "it");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-847208855, i2, -1, "com.glority.android.guide.memo10005.activity.Vip10005AActivity.onCreate.<anonymous>.<anonymous> (Vip10005AActivity.kt:140)");
                    }
                    if (Intrinsics.areEqual(it, "loading")) {
                        composer2.startReplaceableGroup(1491592855);
                        Vip10005AActivity vip10005AActivity2 = Vip10005AActivity.this;
                        composer2.startReplaceableGroup(-717024976);
                        boolean changed = composer2.changed(mutableState);
                        final MutableState<String> mutableState2 = mutableState;
                        Object rememberedValue2 = composer2.rememberedValue();
                        if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = (Function1) new Function1<Float, Unit>() { // from class: com.glority.android.guide.memo10005.activity.Vip10005AActivity$onCreate$1$2$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                                    invoke(f.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(float f) {
                                    mutableState2.setValue("page");
                                }
                            };
                            composer2.updateRememberedValue(rememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        vip10005AActivity2.LoadingPage((Function1) rememberedValue2, composer2, 64);
                        composer2.endReplaceableGroup();
                    } else {
                        composer2.startReplaceableGroup(1491592980);
                        Vip10005AActivity.this.purchasePage(composer2, 8);
                        composer2.endReplaceableGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composer, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    private static final String invoke$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
