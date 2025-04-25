package com.glority.widget.uitls;

import android.text.Layout;
import android.widget.TextView;
import androidx.core.view.OneShotPreDrawListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TextSizeUtils.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fH\u0002J$\u0010\r\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fJ\u0019\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lcom/glority/widget/uitls/TextSizeUtils;", "", "()V", "autoSize", "", "textView", "Landroid/widget/TextView;", "lineCount", "", "minSize", "", "done", "Lkotlin/Function1;", "autoSizeAndUnify", "list", "", "autoSizeSync", "(Landroid/widget/TextView;IFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPreparedTextView", "(Landroid/widget/TextView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "smartTextListSize", "textViews", "smartTextSize", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class TextSizeUtils {
    public static final TextSizeUtils INSTANCE = new TextSizeUtils();

    private TextSizeUtils() {
    }

    public final void autoSizeAndUnify(List<? extends TextView> list, int lineCount, float minSize) {
        Intrinsics.checkNotNullParameter(list, "list");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new TextSizeUtils$autoSizeAndUnify$1(list, new ArrayList(), lineCount, minSize, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void autoSize(final TextView textView, final int lineCount, final float minSize, final Function1<? super Float, Unit> done) {
        textView.post(new Runnable() { // from class: com.glority.widget.uitls.TextSizeUtils$autoSize$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    Layout layout = textView.getLayout();
                    Intrinsics.checkNotNullExpressionValue(layout, "textView.layout");
                    if (layout.getLineCount() > lineCount) {
                        float textSize = textView.getTextSize() - 10;
                        float f = minSize;
                        if (textSize < f) {
                            done.invoke(Float.valueOf(f));
                        } else {
                            textView.setTextSize(0, textSize);
                            TextSizeUtils.INSTANCE.autoSize(textView, lineCount, minSize, done);
                        }
                    } else {
                        done.invoke(Float.valueOf(textView.getTextSize()));
                    }
                } catch (Throwable unused) {
                    done.invoke(Float.valueOf(textView.getTextSize()));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object autoSizeSync(TextView textView, int i, float f, Continuation<? super Float> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        INSTANCE.autoSize(textView, i, f, new Function1<Float, Unit>() { // from class: com.glority.widget.uitls.TextSizeUtils$autoSizeSync$2$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f2) {
                invoke(f2.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f2) {
                Continuation continuation2 = Continuation.this;
                Float valueOf = Float.valueOf(f2);
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m8274constructorimpl(valueOf));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[Catch: all -> 0x0105, TryCatch #0 {all -> 0x0105, blocks: (B:12:0x002f, B:18:0x0044, B:19:0x0059, B:21:0x0068, B:22:0x008f, B:24:0x0095, B:26:0x00ac, B:28:0x00c4, B:31:0x00da, B:33:0x00e3, B:36:0x00fc, B:39:0x004b), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #0 {all -> 0x0105, blocks: (B:12:0x002f, B:18:0x0044, B:19:0x0059, B:21:0x0068, B:22:0x008f, B:24:0x0095, B:26:0x00ac, B:28:0x00c4, B:31:0x00da, B:33:0x00e3, B:36:0x00fc, B:39:0x004b), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object smartTextSize(android.widget.TextView r13, kotlin.coroutines.Continuation<? super java.lang.Float> r14) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.uitls.TextSizeUtils.smartTextSize(android.widget.TextView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void smartTextListSize(List<? extends TextView> textViews) {
        Intrinsics.checkNotNullParameter(textViews, "textViews");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new TextSizeUtils$smartTextListSize$1(textViews, null), 3, null);
    }

    public final Object getPreparedTextView(final TextView textView, Continuation<? super TextView> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        final TextView textView2 = textView;
        Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(textView2, new Runnable() { // from class: com.glority.widget.uitls.TextSizeUtils$getPreparedTextView$$inlined$suspendCoroutine$lambda$1
            @Override // java.lang.Runnable
            public final void run() {
                Continuation continuation2 = safeContinuation2;
                TextView textView3 = textView;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m8274constructorimpl(textView3));
            }
        }), "OneShotPreDrawListener.add(this) { action(this) }");
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
