package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LifecycleOwner;
import com.glority.base.utils.StatusBarUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: LifecycleEffect.kt */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0007¢\u0006\u0002\u0010\u000b\u001a0\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a:\u0010\f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0015\u001aD\u0010\f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0017\u001aN\u0010\f\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0019\u001aH\u0010\f\u001a\u00020\u00042\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u001b\"\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001c\u001a6\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u000f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010\u001f\u001a0\u0010 \u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0012\u001a:\u0010 \u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0015\u001aD\u0010 \u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0017\u001aN\u0010 \u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u0019\u001aH\u0010 \u001a\u00020\u00042\u0016\u0010\u001a\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00140\u001b\"\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u000e¢\u0006\u0002\b\u0011H\u0007¢\u0006\u0002\u0010\u001c\u001a6\u0010#\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020!2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u000e¢\u0006\u0002\b\u0011H\u0003¢\u0006\u0002\u0010$\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u008a\u0084\u0002"}, d2 = {"LifecycleResumeEffectNoParamError", "", "LifecycleStartEffectNoParamError", "LifecycleEventEffect", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "onEvent", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffect", "effects", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key1", "", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", UserMetadata.KEYDATA_FILENAME, "", "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LifecycleResumeEffectImpl", "scope", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "LifecycleStartEffect", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "LifecycleStartEffectImpl", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "lifecycle-runtime-compose_release", "currentOnEvent"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LifecycleEffectKt {
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if ((r12 & 2) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleEventEffect(final androidx.lifecycle.Lifecycle.Event r7, androidx.lifecycle.LifecycleOwner r8, final kotlin.jvm.functions.Function0<kotlin.Unit> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle$Event, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if ((r12 & 2) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object r7, androidx.lifecycle.LifecycleOwner r8, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if ((r14 & 4) != 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object r8, final java.lang.Object r9, androidx.lifecycle.LifecycleOwner r10, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if ((r18 & 8) != 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object r11, final java.lang.Object r12, final java.lang.Object r13, androidx.lifecycle.LifecycleOwner r14, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r15, androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if ((r12 & 2) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final java.lang.Object[] r7, androidx.lifecycle.LifecycleOwner r8, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if ((r7 & 1) != 0) goto L22;
     */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectNoParamError)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleStartEffect(final androidx.lifecycle.LifecycleOwner r3, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r4, androidx.compose.runtime.Composer r5, final int r6, final int r7) {
        /*
            r0 = -50807951(0xfffffffffcf8bb71, float:-1.0331931E37)
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r0)
            java.lang.String r1 = "C(LifecycleStartEffect)P(1)348@16079L7:LifecycleEffect.kt#2vxrgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            r1 = r6 & 1
            if (r1 != 0) goto L2b
            boolean r2 = r5.getSkipping()
            if (r2 != 0) goto L17
            goto L2b
        L17:
            r5.skipToGroupEnd()
            androidx.compose.runtime.ScopeUpdateScope r5 = r5.endRestartGroup()
            if (r5 == 0) goto L2a
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$5 r0 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$5
            r0.<init>()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5.updateScope(r0)
        L2a:
            return
        L2b:
            r5.startDefaults()
            if (r1 == 0) goto L3f
            boolean r3 = r5.getDefaultsInvalid()
            if (r3 == 0) goto L37
            goto L3f
        L37:
            r5.skipToGroupEnd()
            r3 = r7 & 1
            if (r3 == 0) goto L5c
            goto L5a
        L3f:
            r3 = r7 & 1
            if (r3 == 0) goto L5c
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r7 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r4, r7)
            java.lang.Object r3 = r5.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
        L5a:
            r6 = r6 & (-15)
        L5c:
            r5.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L6b
            r3 = -1
            java.lang.String r4 = "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r3, r4)
        L6b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(228371534);
        ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleStartEffectImpl)P(1,2)358@16483L661,358@16443L701:LifecycleEffect.kt#2vxrgp");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i2, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1076218333, "CC(remember):LifecycleEffect.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleStartStopEffectScope) | ((i2 & 896) == 256) | startRestartGroup.changedInstance(lifecycleOwner);
            LifecycleEffectKt$LifecycleStartEffectImpl$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new LifecycleEffectKt$LifecycleStartEffectImpl$1$1(lifecycleOwner, lifecycleStartStopEffectScope, function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (Function1) rememberedValue, startRestartGroup, (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$2
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

                public final void invoke(Composer composer2, int i3) {
                    LifecycleEffectKt.LifecycleStartEffectImpl(LifecycleOwner.this, lifecycleStartStopEffectScope, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if ((r12 & 2) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r7, androidx.lifecycle.LifecycleOwner r8, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        if ((r14 & 4) != 0) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r8, final java.lang.Object r9, androidx.lifecycle.LifecycleOwner r10, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r11, androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if ((r18 & 8) != 0) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object r11, final java.lang.Object r12, final java.lang.Object r13, androidx.lifecycle.LifecycleOwner r14, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r15, androidx.compose.runtime.Composer r16, final int r17, final int r18) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
    
        if ((r12 & 2) != 0) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final java.lang.Object[] r7, androidx.lifecycle.LifecycleOwner r8, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r9, androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if ((r7 & 1) != 0) goto L22;
     */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffectNoParamError)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleResumeEffect(final androidx.lifecycle.LifecycleOwner r3, final kotlin.jvm.functions.Function1<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r4, androidx.compose.runtime.Composer r5, final int r6, final int r7) {
        /*
            r0 = -747476210(0xffffffffd3726b0e, float:-1.04117817E12)
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r0)
            java.lang.String r1 = "C(LifecycleResumeEffect)P(1)680@31558L7:LifecycleEffect.kt#2vxrgp"
            androidx.compose.runtime.ComposerKt.sourceInformation(r5, r1)
            r1 = r6 & 1
            if (r1 != 0) goto L2b
            boolean r2 = r5.getSkipping()
            if (r2 != 0) goto L17
            goto L2b
        L17:
            r5.skipToGroupEnd()
            androidx.compose.runtime.ScopeUpdateScope r5 = r5.endRestartGroup()
            if (r5 == 0) goto L2a
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$5 r0 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$5
            r0.<init>()
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5.updateScope(r0)
        L2a:
            return
        L2b:
            r5.startDefaults()
            if (r1 == 0) goto L3f
            boolean r3 = r5.getDefaultsInvalid()
            if (r3 == 0) goto L37
            goto L3f
        L37:
            r5.skipToGroupEnd()
            r3 = r7 & 1
            if (r3 == 0) goto L5c
            goto L5a
        L3f:
            r3 = r7 & 1
            if (r3 == 0) goto L5c
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner()
            androidx.compose.runtime.CompositionLocal r3 = (androidx.compose.runtime.CompositionLocal) r3
            r4 = 2023513938(0x789c5f52, float:2.5372864E34)
            java.lang.String r7 = "CC:CompositionLocal.kt#9igjgp"
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(r5, r4, r7)
            java.lang.Object r3 = r5.consume(r3)
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(r5)
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
        L5a:
            r6 = r6 & (-15)
        L5c:
            r5.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L6b
            r3 = -1
            java.lang.String r4 = "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:682)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r3, r4)
        L6b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, Composer composer, final int i) {
        int i2;
        Composer startRestartGroup = composer.startRestartGroup(912823238);
        ComposerKt.sourceInformation(startRestartGroup, "C(LifecycleResumeEffectImpl)P(1,2)690@31972L670,690@31932L710:LifecycleEffect.kt#2vxrgp");
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i2, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:689)");
            }
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 657407937, "CC(remember):LifecycleEffect.kt#9igjgp");
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleResumePauseEffectScope) | ((i2 & 896) == 256) | startRestartGroup.changedInstance(lifecycleOwner);
            LifecycleEffectKt$LifecycleResumeEffectImpl$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(lifecycleOwner, lifecycleResumePauseEffectScope, function1);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (Function1) rememberedValue, startRestartGroup, (i2 & 14) | (i2 & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$2
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

                public final void invoke(Composer composer2, int i3) {
                    LifecycleEffectKt.LifecycleResumeEffectImpl(LifecycleOwner.this, lifecycleResumePauseEffectScope, function1, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0<Unit> LifecycleEventEffect$lambda$0(State<? extends Function0<Unit>> state) {
        return state.getValue();
    }
}
