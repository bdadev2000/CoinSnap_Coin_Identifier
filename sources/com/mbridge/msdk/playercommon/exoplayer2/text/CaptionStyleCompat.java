package com.mbridge.msdk.playercommon.exoplayer2.text;

import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class CaptionStyleCompat {
    public static final CaptionStyleCompat DEFAULT = new CaptionStyleCompat(-1, ViewCompat.MEASURED_STATE_MASK, 0, 0, -1, null);
    public static final int EDGE_TYPE_DEPRESSED = 4;
    public static final int EDGE_TYPE_DROP_SHADOW = 2;
    public static final int EDGE_TYPE_NONE = 0;
    public static final int EDGE_TYPE_OUTLINE = 1;
    public static final int EDGE_TYPE_RAISED = 3;
    public static final int USE_TRACK_COLOR_SETTINGS = 1;
    public final int backgroundColor;
    public final int edgeColor;
    public final int edgeType;
    public final int foregroundColor;
    public final Typeface typeface;
    public final int windowColor;

    /* loaded from: classes4.dex */
    public @interface EdgeType {
    }

    public CaptionStyleCompat(int i10, int i11, int i12, int i13, int i14, Typeface typeface) {
        this.foregroundColor = i10;
        this.backgroundColor = i11;
        this.windowColor = i12;
        this.edgeType = i13;
        this.edgeColor = i14;
        this.typeface = typeface;
    }

    public static CaptionStyleCompat createFromCaptionStyle(CaptioningManager.CaptionStyle captionStyle) {
        if (Util.SDK_INT >= 21) {
            return createFromCaptionStyleV21(captionStyle);
        }
        return createFromCaptionStyleV19(captionStyle);
    }

    private static CaptionStyleCompat createFromCaptionStyleV19(CaptioningManager.CaptionStyle captionStyle) {
        return new CaptionStyleCompat(captionStyle.foregroundColor, captionStyle.backgroundColor, 0, captionStyle.edgeType, captionStyle.edgeColor, captionStyle.getTypeface());
    }

    private static CaptionStyleCompat createFromCaptionStyleV21(CaptioningManager.CaptionStyle captionStyle) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (captionStyle.hasForegroundColor()) {
            i10 = captionStyle.foregroundColor;
        } else {
            i10 = DEFAULT.foregroundColor;
        }
        int i15 = i10;
        if (captionStyle.hasBackgroundColor()) {
            i11 = captionStyle.backgroundColor;
        } else {
            i11 = DEFAULT.backgroundColor;
        }
        int i16 = i11;
        if (captionStyle.hasWindowColor()) {
            i12 = captionStyle.windowColor;
        } else {
            i12 = DEFAULT.windowColor;
        }
        int i17 = i12;
        if (captionStyle.hasEdgeType()) {
            i13 = captionStyle.edgeType;
        } else {
            i13 = DEFAULT.edgeType;
        }
        int i18 = i13;
        if (captionStyle.hasEdgeColor()) {
            i14 = captionStyle.edgeColor;
        } else {
            i14 = DEFAULT.edgeColor;
        }
        return new CaptionStyleCompat(i15, i16, i17, i18, i14, captionStyle.getTypeface());
    }
}
