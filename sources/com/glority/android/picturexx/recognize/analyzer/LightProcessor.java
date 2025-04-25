package com.glority.android.picturexx.recognize.analyzer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LightProcessor.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/LightProcessor;", "", "<init>", "()V", "hold", "", "getHold", "()Z", "setHold", "(Z)V", "tooBrightLimit", "", "process", "Lkotlin/Pair;", "Lcom/glority/android/picturexx/recognize/analyzer/LightProcessor$LightStatus;", "", "bitmap", "Landroid/graphics/Bitmap;", "drawCircleBitmap", "LightStatus", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class LightProcessor {
    private boolean hold;
    private final int tooBrightLimit = 180;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LightProcessor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/recognize/analyzer/LightProcessor$LightStatus;", "", "<init>", "(Ljava/lang/String;I)V", "TOO_BRIGHT", "TOO_DARK", "OK", "ERROR", "HOLD", "recognize_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes5.dex */
    public static final class LightStatus {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ LightStatus[] $VALUES;
        public static final LightStatus TOO_BRIGHT = new LightStatus("TOO_BRIGHT", 0);
        public static final LightStatus TOO_DARK = new LightStatus("TOO_DARK", 1);
        public static final LightStatus OK = new LightStatus("OK", 2);
        public static final LightStatus ERROR = new LightStatus("ERROR", 3);
        public static final LightStatus HOLD = new LightStatus("HOLD", 4);

        private static final /* synthetic */ LightStatus[] $values() {
            return new LightStatus[]{TOO_BRIGHT, TOO_DARK, OK, ERROR, HOLD};
        }

        public static EnumEntries<LightStatus> getEntries() {
            return $ENTRIES;
        }

        private LightStatus(String str, int i) {
        }

        static {
            LightStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static LightStatus valueOf(String str) {
            return (LightStatus) Enum.valueOf(LightStatus.class, str);
        }

        public static LightStatus[] values() {
            return (LightStatus[]) $VALUES.clone();
        }
    }

    public final boolean getHold() {
        return this.hold;
    }

    public final void setHold(boolean z) {
        this.hold = z;
    }

    public final Pair<LightStatus, Float> process(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        float f = 0.0f;
        if (this.hold) {
            return new Pair<>(LightStatus.HOLD, Float.valueOf(0.0f));
        }
        Bitmap drawCircleBitmap = drawCircleBitmap(bitmap);
        int height = drawCircleBitmap.getHeight() * drawCircleBitmap.getWidth();
        int[] iArr = new int[height];
        drawCircleBitmap.getPixels(iArr, 0, drawCircleBitmap.getWidth(), 0, 0, drawCircleBitmap.getWidth(), drawCircleBitmap.getHeight());
        drawCircleBitmap.recycle();
        float[] fArr = new float[3];
        for (int i = 0; i < height; i++) {
            Color.colorToHSV(iArr[i], fArr);
            f += fArr[2];
        }
        float width = (f / (drawCircleBitmap.getWidth() * drawCircleBitmap.getHeight())) * 255.0f;
        if (width >= this.tooBrightLimit) {
            return new Pair<>(LightStatus.TOO_BRIGHT, Float.valueOf(width));
        }
        return new Pair<>(LightStatus.OK, Float.valueOf(width));
    }

    private final Bitmap drawCircleBitmap(Bitmap bitmap) {
        int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
        float f = max / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(-7829368);
        canvas.drawCircle(f, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, (bitmap.getWidth() - max) / 2.0f, (bitmap.getHeight() - max) / 2.0f, paint);
        return createBitmap;
    }
}
