package com.glority.android.uimaker.parameter.attribute;

import kotlin.Metadata;

/* compiled from: TextGravityParameter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/glority/android/uimaker/parameter/attribute/TextGravityParameter;", "", "()V", "BOTTOM", "", "getBOTTOM", "()Ljava/lang/String;", "CENTER", "getCENTER", "LEFT", "getLEFT", "RIGHT", "getRIGHT", "TOP", "getTOP", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class TextGravityParameter {
    public static final TextGravityParameter INSTANCE = new TextGravityParameter();
    private static final String BOTTOM = "BOTTOM";
    private static final String CENTER = "CENTER";
    private static final String RIGHT = "RIGHT";
    private static final String LEFT = "LEFT";
    private static final String TOP = "TOP";

    private TextGravityParameter() {
    }

    public final String getBOTTOM() {
        return BOTTOM;
    }

    public final String getCENTER() {
        return CENTER;
    }

    public final String getRIGHT() {
        return RIGHT;
    }

    public final String getLEFT() {
        return LEFT;
    }

    public final String getTOP() {
        return TOP;
    }
}
