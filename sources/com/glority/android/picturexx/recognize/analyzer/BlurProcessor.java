package com.glority.android.picturexx.recognize.analyzer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.glority.android.picturexx.recognize.utils.RecognizeAbUtils;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BlurProcessor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/BlurProcessor;", "", "<init>", "()V", "TAG", "", "hold", "", "getHold", "()Z", "setHold", "(Z)V", "resizeWith", "", "process", "Lkotlin/Pair;", "Lcom/glority/android/picturexx/recognize/analyzer/BlurProcessor$BlurStatus;", "", "bitmap", "Landroid/graphics/Bitmap;", "BlurStatus", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class BlurProcessor {
    private boolean hold;
    private final String TAG = "BlurProcess";
    private final int resizeWith = 224;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BlurProcessor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/BlurProcessor$BlurStatus;", "", "<init>", "(Ljava/lang/String;I)V", "TOO_BLURRY", "CLEAR", "ERROR", "HOLD", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class BlurStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BlurStatus[] $VALUES;
        public static final BlurStatus TOO_BLURRY = new BlurStatus("TOO_BLURRY", 0);
        public static final BlurStatus CLEAR = new BlurStatus("CLEAR", 1);
        public static final BlurStatus ERROR = new BlurStatus("ERROR", 2);
        public static final BlurStatus HOLD = new BlurStatus("HOLD", 3);

        private static final /* synthetic */ BlurStatus[] $values() {
            return new BlurStatus[]{TOO_BLURRY, CLEAR, ERROR, HOLD};
        }

        public static EnumEntries<BlurStatus> getEntries() {
            return $ENTRIES;
        }

        private BlurStatus(String str, int i) {
        }

        static {
            BlurStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static BlurStatus valueOf(String str) {
            return (BlurStatus) Enum.valueOf(BlurStatus.class, str);
        }

        public static BlurStatus[] values() {
            return (BlurStatus[]) $VALUES.clone();
        }
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final void setHold(boolean z) {
        this.hold = z;
    }

    public final Pair<BlurStatus, Float> process(Bitmap bitmap) {
        boolean z = this.hold;
        Float valueOf = Float.valueOf(0.0f);
        if (z) {
            return new Pair<>(BlurStatus.HOLD, valueOf);
        }
        if (BlurSingleton.INSTANCE.getInstance().getInterpreter() == null || bitmap == null) {
            return new Pair<>(BlurStatus.ERROR, valueOf);
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = width;
            int i = this.resizeWith;
            float f2 = height;
            float max = Math.max(f / i, f2 / i);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (f / max), (int) (f2 / max), true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(this, width, height, filter)");
            int i2 = this.resizeWith;
            Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            createBitmap.eraseColor(-1);
            new Canvas(createBitmap).drawBitmap(createScaledBitmap, 0.0f, 0.0f, (Paint) null);
            Float blur = BlurSingleton.INSTANCE.getInstance().blur(createBitmap);
            float floatValue = blur != null ? blur.floatValue() : 1.0f;
            createScaledBitmap.recycle();
            createBitmap.recycle();
            if (floatValue >= RecognizeAbUtils.INSTANCE.getBlurryClearThreshold()) {
                return new Pair<>(BlurStatus.CLEAR, Float.valueOf(floatValue));
            }
            return new Pair<>(BlurStatus.TOO_BLURRY, Float.valueOf(floatValue));
        } catch (Throwable unused) {
            return new Pair<>(BlurStatus.ERROR, valueOf);
        }
    }
}
