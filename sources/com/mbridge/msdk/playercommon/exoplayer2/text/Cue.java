package com.mbridge.msdk.playercommon.exoplayer2.text;

import android.graphics.Bitmap;
import android.text.Layout;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class Cue {
    public static final int ANCHOR_TYPE_END = 2;
    public static final int ANCHOR_TYPE_MIDDLE = 1;
    public static final int ANCHOR_TYPE_START = 0;
    public static final float DIMEN_UNSET = Float.MIN_VALUE;
    public static final int LINE_TYPE_FRACTION = 0;
    public static final int LINE_TYPE_NUMBER = 1;
    public static final int TEXT_SIZE_TYPE_ABSOLUTE = 2;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL = 0;
    public static final int TEXT_SIZE_TYPE_FRACTIONAL_IGNORE_PADDING = 1;
    public static final int TYPE_UNSET = Integer.MIN_VALUE;
    public final Bitmap bitmap;
    public final float bitmapHeight;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final int positionAnchor;
    public final float size;
    public final CharSequence text;
    public final Layout.Alignment textAlignment;
    public final float textSize;
    public final int textSizeType;
    public final int windowColor;
    public final boolean windowColorSet;

    /* loaded from: classes3.dex */
    public @interface AnchorType {
    }

    /* loaded from: classes3.dex */
    public @interface LineType {
    }

    /* loaded from: classes3.dex */
    public @interface TextSizeType {
    }

    public Cue(Bitmap bitmap, float f9, int i9, float f10, int i10, float f11, float f12) {
        this(null, null, bitmap, f10, 0, i10, f9, i9, Integer.MIN_VALUE, Float.MIN_VALUE, f11, f12, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11) {
        this(charSequence, alignment, f9, i9, i10, f10, i11, f11, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, int i12, float f12) {
        this(charSequence, alignment, null, f9, i9, i10, f10, i11, i12, f12, f11, Float.MIN_VALUE, false, ViewCompat.MEASURED_STATE_MASK);
    }

    public Cue(CharSequence charSequence, Layout.Alignment alignment, float f9, int i9, int i10, float f10, int i11, float f11, boolean z8, int i12) {
        this(charSequence, alignment, null, f9, i9, i10, f10, i11, Integer.MIN_VALUE, Float.MIN_VALUE, f11, Float.MIN_VALUE, z8, i12);
    }

    private Cue(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f9, int i9, int i10, float f10, int i11, int i12, float f11, float f12, float f13, boolean z8, int i13) {
        this.text = charSequence;
        this.textAlignment = alignment;
        this.bitmap = bitmap;
        this.line = f9;
        this.lineType = i9;
        this.lineAnchor = i10;
        this.position = f10;
        this.positionAnchor = i11;
        this.size = f12;
        this.bitmapHeight = f13;
        this.windowColorSet = z8;
        this.windowColor = i13;
        this.textSizeType = i12;
        this.textSize = f11;
    }
}
