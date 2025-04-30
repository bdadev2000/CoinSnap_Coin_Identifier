package com.mbridge.msdk.playercommon.exoplayer2.text.ttml;

/* loaded from: classes3.dex */
final class TtmlRegion {
    public final String id;
    public final float line;
    public final int lineAnchor;
    public final int lineType;
    public final float position;
    public final float textSize;
    public final int textSizeType;
    public final float width;

    public TtmlRegion(String str) {
        this(str, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public TtmlRegion(String str, float f9, float f10, int i9, int i10, float f11, int i11, float f12) {
        this.id = str;
        this.position = f9;
        this.line = f10;
        this.lineType = i9;
        this.lineAnchor = i10;
        this.width = f11;
        this.textSizeType = i11;
        this.textSize = f12;
    }
}
