package com.glority.android.detection.interpreter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.detection.helper.BoundingBox;
import com.glority.android.detection.helper.NonMaxSuppressionKt;
import com.glority.android.detection.interpreter.BaseInterpreter;
import com.glority.android.detection.item.DetectInfo;
import com.glority.android.detection.item.DetectOptions;
import com.glority.android.detection.item.DetectOutput;
import com.glority.android.detection.p001enum.Strategy;
import com.glority.android.detection.xxtea.XXTEA;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseInterpreter.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 12\u00020\u0001:\u000212B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002JL\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0003\u0010\u001f\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0003\u0010 \u001a\u00020\u00162\b\b\u0003\u0010!\u001a\u00020\u00162\b\b\u0003\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020$J+\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00160&2\u000e\b\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160&2\u0006\u0010'\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H&J\u001d\u0010-\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010&2\u0006\u0010\u001d\u001a\u00020\u001eH&¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020*H&R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00063"}, d2 = {"Lcom/glority/android/detection/interpreter/BaseInterpreter;", "", "inputStream", "Ljava/io/InputStream;", "decryptKey", "", "options", "Lcom/glority/android/detection/item/DetectOptions;", "context", "Landroid/content/Context;", "initStatusCallback", "Lcom/glority/android/detection/interpreter/BaseInterpreter$InitStatusCallback;", "(Ljava/io/InputStream;Ljava/lang/String;Lcom/glority/android/detection/item/DetectOptions;Landroid/content/Context;Lcom/glority/android/detection/interpreter/BaseInterpreter$InitStatusCallback;)V", "getContext", "()Landroid/content/Context;", "getDecryptKey", "()Ljava/lang/String;", "getInputStream", "()Ljava/io/InputStream;", "getOptions", "()Lcom/glority/android/detection/item/DetectOptions;", "calcStrategyScore", "", TtmlNode.TAG_REGION, "Landroid/graphics/RectF;", "strategy", "Lcom/glority/android/detection/enum/Strategy;", "detect", "Lcom/glority/android/detection/item/DetectOutput;", "bitmap", "Landroid/graphics/Bitmap;", "scoreThreshold", "extend", "minScore", "iouThreshold", "maxCount", "", "extendRegion", "", "value", "([Ljava/lang/Float;F)[Ljava/lang/Float;", "initInterpreter", "", "byteBuffer", "Ljava/nio/ByteBuffer;", "predict", "Lcom/glority/android/detection/helper/BoundingBox;", "(Landroid/graphics/Bitmap;)[Lcom/glority/android/detection/helper/BoundingBox;", "release", "Companion", "InitStatusCallback", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes13.dex */
public abstract class BaseInterpreter {
    private static final String TAG = "DetectionInterpreter";
    private final Context context;
    private final String decryptKey;
    private final InputStream inputStream;
    private final DetectOptions options;

    /* compiled from: BaseInterpreter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/glority/android/detection/interpreter/BaseInterpreter$InitStatusCallback;", "", "onInitFailed", "", "e", "", "onInitSuccess", "lib-image-detection_release"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public interface InitStatusCallback {
        void onInitFailed(Throwable e);

        void onInitSuccess();
    }

    /* compiled from: BaseInterpreter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Strategy.values().length];
            try {
                iArr[Strategy.center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Strategy.area.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Strategy.smart.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public abstract void initInterpreter(ByteBuffer byteBuffer);

    public abstract BoundingBox[] predict(Bitmap bitmap);

    public abstract void release();

    public BaseInterpreter(InputStream inputStream, String str, DetectOptions options, Context context, InitStatusCallback initStatusCallback) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(context, "context");
        this.inputStream = inputStream;
        this.decryptKey = str;
        this.options = options;
        this.context = context;
        try {
            byte[] readBytes = ByteStreamsKt.readBytes(inputStream);
            String str2 = str;
            if (str2 != null && str2.length() != 0) {
                byte[] decrypt = XXTEA.decrypt(readBytes, str);
                if (decrypt == null) {
                    throw new IOException("can not decrypt byte data");
                }
                readBytes = ArraysKt.copyOfRange(decrypt, 11, decrypt.length);
            }
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(readBytes.length);
            byteBuffer.order(ByteOrder.nativeOrder());
            byteBuffer.put(readBytes);
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            initInterpreter(byteBuffer);
            if (initStatusCallback != null) {
                initStatusCallback.onInitSuccess();
            }
            Log.d(TAG, "Interpreter initialized successfully!");
        } catch (Throwable th) {
            Log.e(TAG, "Read model file failed. \n " + th.getMessage());
            if (initStatusCallback != null) {
                initStatusCallback.onInitFailed(th);
            }
        }
    }

    public /* synthetic */ BaseInterpreter(InputStream inputStream, String str, DetectOptions detectOptions, Context context, InitStatusCallback initStatusCallback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inputStream, str, detectOptions, context, (i & 16) != 0 ? null : initStatusCallback);
    }

    public final InputStream getInputStream() {
        return this.inputStream;
    }

    public final String getDecryptKey() {
        return this.decryptKey;
    }

    public final DetectOptions getOptions() {
        return this.options;
    }

    public final Context getContext() {
        return this.context;
    }

    public static /* synthetic */ DetectOutput detect$default(BaseInterpreter baseInterpreter, Bitmap bitmap, float f, Strategy strategy, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj == null) {
            return baseInterpreter.detect(bitmap, (i2 & 2) != 0 ? 0.5f : f, (i2 & 4) != 0 ? Strategy.smart : strategy, (i2 & 8) != 0 ? 1.0f : f2, (i2 & 16) != 0 ? 0.1f : f3, (i2 & 32) == 0 ? f4 : 0.5f, (i2 & 64) != 0 ? 100 : i);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: detect");
    }

    public final DetectOutput detect(Bitmap bitmap, float scoreThreshold, final Strategy strategy, float extend, float minScore, float iouThreshold, int maxCount) {
        int i;
        float f = scoreThreshold;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        if (f < minScore) {
            Log.e(TAG, "ScoreThreshold must large than " + minScore + InstructionFileId.DOT);
            return null;
        }
        BoundingBox[] predict = predict(bitmap);
        if (predict == null) {
            return null;
        }
        ArrayList<DetectInfo> arrayList = new ArrayList();
        Integer[] nonMaxSuppression = NonMaxSuppressionKt.nonMaxSuppression(predict, iouThreshold, maxCount);
        if (nonMaxSuppression.length <= 0) {
            return null;
        }
        int i2 = 0;
        for (int length = nonMaxSuppression.length; i2 < length; length = length) {
            BoundingBox boundingBox = predict[nonMaxSuppression[i2].intValue()];
            RectF rect = boundingBox.getRect();
            float score = boundingBox.getScore();
            if (score < f) {
                break;
            }
            arrayList.add(new DetectInfo(new Float[]{Float.valueOf(rect.top), Float.valueOf(rect.left), Float.valueOf(rect.bottom), Float.valueOf(rect.right)}, score, calcStrategyScore(rect, strategy)));
            i2++;
            f = scoreThreshold;
        }
        if (arrayList.size() > 0 || predict[nonMaxSuppression[0].intValue()].getScore() <= minScore) {
            i = 1;
        } else {
            BoundingBox boundingBox2 = predict[nonMaxSuppression[0].intValue()];
            RectF rect2 = boundingBox2.getRect();
            i = 1;
            arrayList.add(new DetectInfo(new Float[]{Float.valueOf(rect2.top), Float.valueOf(rect2.left), Float.valueOf(rect2.bottom), Float.valueOf(rect2.right)}, boundingBox2.getScore(), calcStrategyScore(rect2, strategy)));
        }
        if (arrayList.size() > i) {
            CollectionsKt.sortWith(arrayList, new Comparator() { // from class: com.glority.android.detection.interpreter.BaseInterpreter$detect$lambda$2$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    float strategyScore;
                    float strategyScore2;
                    float strategyScore3;
                    float strategyScore4;
                    DetectInfo detectInfo = (DetectInfo) t;
                    int i3 = BaseInterpreter.WhenMappings.$EnumSwitchMapping$0[Strategy.this.ordinal()];
                    if (i3 != 1) {
                        if (i3 == 2) {
                            strategyScore4 = detectInfo.getStrategyScore();
                        } else {
                            if (i3 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strategyScore4 = detectInfo.getStrategyScore();
                        }
                        strategyScore = -strategyScore4;
                    } else {
                        strategyScore = detectInfo.getStrategyScore();
                    }
                    Float valueOf = Float.valueOf(strategyScore);
                    DetectInfo detectInfo2 = (DetectInfo) t2;
                    int i4 = BaseInterpreter.WhenMappings.$EnumSwitchMapping$0[Strategy.this.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            strategyScore3 = detectInfo2.getStrategyScore();
                        } else {
                            if (i4 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            strategyScore3 = detectInfo2.getStrategyScore();
                        }
                        strategyScore2 = -strategyScore3;
                    } else {
                        strategyScore2 = detectInfo2.getStrategyScore();
                    }
                    return ComparisonsKt.compareValues(valueOf, Float.valueOf(strategyScore2));
                }
            });
        }
        for (DetectInfo detectInfo : arrayList) {
            detectInfo.setRegion(extendRegion(detectInfo.getRegion(), extend));
        }
        return new DetectOutput((DetectInfo[]) arrayList.toArray(new DetectInfo[0]), strategy, extend, scoreThreshold);
    }

    private final float calcStrategyScore(RectF region, Strategy strategy) {
        int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
        if (i == 1) {
            float centerY = region.centerY() - 0.5f;
            float centerX = region.centerX() - 0.5f;
            return (float) Math.sqrt((centerY * centerY) + (centerX * centerX));
        }
        if (i == 2) {
            return region.width() * region.height();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        float width = region.width() * region.height();
        float centerY2 = region.centerY() - 0.5f;
        float centerX2 = region.centerX() - 0.5f;
        return (width / ((float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2)))) + 1.0E-8f;
    }

    private final Float[] extendRegion(Float[] region, float value) {
        float f = 2;
        float floatValue = ((region[2].floatValue() - region[0].floatValue()) * value) / f;
        float floatValue2 = ((region[3].floatValue() - region[1].floatValue()) * value) / f;
        return new Float[]{Float.valueOf(Math.max(0.0f, region[0].floatValue() - floatValue)), Float.valueOf(Math.max(0.0f, region[1].floatValue() - floatValue2)), Float.valueOf(Math.min(1.0f, region[2].floatValue() + floatValue)), Float.valueOf(Math.min(1.0f, region[3].floatValue() + floatValue2))};
    }
}
