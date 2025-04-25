package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.base.utils.StatusBarUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* compiled from: rememberLottieComposition.kt */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\f\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a2\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0002\u001a\"\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002\u001a*\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0002\u001a\u008e\u0001\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012H\b\u0002\u0010 \u001aB\b\u0001\u0012\u0013\u0012\u00110\"¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b(%\u0012\u0013\u0012\u00110&¢\u0006\f\b#\u0012\b\b$\u0012\u0004\b\b('\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160(\u0012\u0006\u0012\u0004\u0018\u00010)0!H\u0007ø\u0001\u0000¢\u0006\u0002\u0010*\u001a\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a!\u0010/\u001a\u0002H0\"\u0004\b\u0000\u00100*\b\u0012\u0004\u0012\u0002H00\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u00101\u001a\f\u00102\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\u0010\u00103\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"DefaultCacheKey", "", "loadFontsFromAssets", "", "context", "Landroid/content/Context;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "fontAssetsFolder", "fontFileExtension", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImagesFromAssets", "imageAssetsFolder", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottieComposition", "spec", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "cacheKey", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottieTask", "Lcom/airbnb/lottie/LottieTask;", "isWarmingCache", "", "maybeDecodeBase64Image", "asset", "Lcom/airbnb/lottie/LottieImageAsset;", "maybeLoadImageFromAsset", "maybeLoadTypefaceFromAssets", "font", "Lcom/airbnb/lottie/model/Font;", "rememberLottieComposition", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "onRetry", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "failCount", "", "previousException", "Lkotlin/coroutines/Continuation;", "", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "typefaceForStyle", "Landroid/graphics/Typeface;", "typeface", TtmlNode.TAG_STYLE, "await", ExifInterface.GPS_DIRECTION_TRUE, "(Lcom/airbnb/lottie/LottieTask;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ensureLeadingPeriod", "ensureTrailingSlash", "lottie-compose_release"}, k = 2, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class RememberLottieCompositionKt {
    private static final String DefaultCacheKey = "__LottieInternalDefaultCacheKey__";

    public static final LottieCompositionResult rememberLottieComposition(LottieCompositionSpec spec, String str, String str2, String str3, String str4, Function3<? super Integer, ? super Throwable, ? super Continuation<? super Boolean>, ? extends Object> function3, Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        composer.startReplaceableGroup(-1248473602);
        ComposerKt.sourceInformation(composer, "C(rememberLottieComposition)P(5,3,1,2)");
        String str5 = (i2 & 2) != 0 ? null : str;
        String str6 = (i2 & 4) != 0 ? "fonts/" : str2;
        String str7 = (i2 & 8) != 0 ? ".ttf" : str3;
        String str8 = (i2 & 16) != 0 ? DefaultCacheKey : str4;
        RememberLottieCompositionKt$rememberLottieComposition$1 rememberLottieCompositionKt$rememberLottieComposition$1 = (i2 & 32) != 0 ? new RememberLottieCompositionKt$rememberLottieComposition$1(null) : function3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1248473602, i, -1, "com.airbnb.lottie.compose.rememberLottieComposition (rememberLottieComposition.kt:74)");
        }
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer);
        Context context = (Context) consume;
        int i3 = i & 14;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(spec);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new LottieCompositionResultImpl(), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        int i4 = (i >> 9) & StatusBarUtils.DEFAULT_STATUS_BAR_ALPHA;
        composer.startReplaceableGroup(511388516);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
        boolean changed2 = composer.changed(spec) | composer.changed(str8);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            composer.updateRememberedValue(lottieTask(context, spec, str8, true));
        }
        composer.endReplaceableGroup();
        EffectsKt.LaunchedEffect(spec, str8, new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, spec, str5, str6, str7, str8, mutableState, null), composer, i3 | 512 | i4);
        LottieCompositionResultImpl rememberLottieComposition$lambda$1 = rememberLottieComposition$lambda$1(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberLottieComposition$lambda$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResultImpl rememberLottieComposition$lambda$1(MutableState<LottieCompositionResultImpl> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object lottieComposition(android.content.Context r6, com.airbnb.lottie.compose.LottieCompositionSpec r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, kotlin.coroutines.Continuation<? super com.airbnb.lottie.LottieComposition> r12) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt.lottieComposition(android.content.Context, com.airbnb.lottie.compose.LottieCompositionSpec, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieTask<LottieComposition> lottieTask(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z) {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m7642unboximpl());
            }
            return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m7642unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m7649unboximpl());
            }
            return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m7649unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.m7628unboximpl());
            if (StringsKt.endsWith$default(file.m7628unboximpl(), "zip", false, 2, (Object) null)) {
                ZipInputStream zipInputStream = new ZipInputStream(fileInputStream);
                if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                    str = file.m7628unboximpl();
                }
                return LottieCompositionFactory.fromZipStream(zipInputStream, str);
            }
            FileInputStream fileInputStream2 = fileInputStream;
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = file.m7628unboximpl();
            }
            return LottieCompositionFactory.fromJsonInputStream(fileInputStream2, str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m7614unboximpl());
            }
            return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m7614unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m7635unboximpl().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m7635unboximpl(), str);
        }
        if (!(lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider)) {
            throw new NoWhenBranchMatchedException();
        }
        LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
        InputStream openInputStream = context.getContentResolver().openInputStream(contentProvider.m7621unboximpl());
        if (Intrinsics.areEqual(str, DefaultCacheKey)) {
            str = contentProvider.m7621unboximpl().toString();
        }
        return LottieCompositionFactory.fromJsonInputStream(openInputStream, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadImagesFromAssets(Context context, LottieComposition lottieComposition, String str, Continuation<? super Unit> continuation) {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new RememberLottieCompositionKt$loadImagesFromAssets$2(lottieComposition, context, str, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadImageFromAsset(Context context, LottieImageAsset lottieImageAsset, String str) {
        if (lottieImageAsset.getBitmap() != null || str == null) {
            return;
        }
        try {
            InputStream open = context.getAssets().open(str + lottieImageAsset.getFileName());
            Intrinsics.checkNotNullExpressionValue(open, "try {\n        context.as…, e)\n        return\n    }");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(BitmapFactory.decodeStream(open, null, options), lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
            } catch (IllegalArgumentException e) {
                Logger.warning("Unable to decode image.", e);
            }
        } catch (IOException e2) {
            Logger.warning("Unable to open asset.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeDecodeBase64Image(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() != null) {
            return;
        }
        String filename = lottieImageAsset.getFileName();
        Intrinsics.checkNotNullExpressionValue(filename, "filename");
        if (!StringsKt.startsWith$default(filename, "data:", false, 2, (Object) null) || StringsKt.indexOf$default((CharSequence) filename, "base64,", 0, false, 6, (Object) null) <= 0) {
            return;
        }
        try {
            String substring = filename.substring(StringsKt.indexOf$default((CharSequence) filename, ',', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            byte[] decode = Base64.decode(substring, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inScaled = true;
            options.inDensity = 160;
            lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e) {
            Logger.warning("data URL did not have correct base64 format.", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadFontsFromAssets(Context context, LottieComposition lottieComposition, String str, String str2, Continuation<? super Unit> continuation) {
        Object withContext;
        return (!lottieComposition.getFonts().isEmpty() && (withContext = BuildersKt.withContext(Dispatchers.getIO(), new RememberLottieCompositionKt$loadFontsFromAssets$2(lottieComposition, context, str, str2, null), continuation)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? withContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadTypefaceFromAssets(Context context, Font font, String str, String str2) {
        String str3 = str + font.getFamily() + str2;
        try {
            Typeface typefaceWithDefaultStyle = Typeface.createFromAsset(context.getAssets(), str3);
            try {
                Intrinsics.checkNotNullExpressionValue(typefaceWithDefaultStyle, "typefaceWithDefaultStyle");
                String style = font.getStyle();
                Intrinsics.checkNotNullExpressionValue(style, "font.style");
                font.setTypeface(typefaceForStyle(typefaceWithDefaultStyle, style));
            } catch (Exception e) {
                Logger.error("Failed to create " + font.getFamily() + " typeface with style=" + font.getStyle() + '!', e);
            }
        } catch (Exception e2) {
            Logger.error("Failed to find typeface in assets with path " + str3 + '.', e2);
        }
    }

    private static final Typeface typefaceForStyle(Typeface typeface, String str) {
        String str2 = str;
        int i = 0;
        boolean contains$default = StringsKt.contains$default((CharSequence) str2, (CharSequence) "Italic", false, 2, (Object) null);
        boolean contains$default2 = StringsKt.contains$default((CharSequence) str2, (CharSequence) "Bold", false, 2, (Object) null);
        if (contains$default && contains$default2) {
            i = 3;
        } else if (contains$default) {
            i = 2;
        } else if (contains$default2) {
            i = 1;
        }
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureTrailingSlash(String str) {
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            return null;
        }
        return StringsKt.endsWith$default((CharSequence) str2, '/', false, 2, (Object) null) ? str : str + '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureLeadingPeriod(String str) {
        return (StringsKt.isBlank(str) || StringsKt.startsWith$default(str, InstructionFileId.DOT, false, 2, (Object) null)) ? str : InstructionFileId.DOT + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object await(LottieTask<T> lottieTask, Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        lottieTask.addListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(T t) {
                if (cancellableContinuationImpl2.isCompleted()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(t));
            }
        }).addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$2
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Throwable e) {
                if (cancellableContinuationImpl2.isCompleted()) {
                    return;
                }
                CancellableContinuation<T> cancellableContinuation = cancellableContinuationImpl2;
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(e, "e");
                cancellableContinuation.resumeWith(Result.m8274constructorimpl(ResultKt.createFailure(e)));
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
