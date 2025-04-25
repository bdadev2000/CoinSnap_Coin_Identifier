package com.glority.android.guide.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.data.LogEventArguments;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FontBuilderUtil.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0004J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eR\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u001f"}, d2 = {"Lcom/glority/android/guide/utils/FontBuilderUtil;", "", "()V", "BLACK", "", "getBLACK", "()I", "BOLD", "getBOLD", "HEAVY", "getHEAVY", "MEDIUM", "getMEDIUM", "REGULAR", "getREGULAR", "SEMIBOLD", "getSEMIBOLD", "lIGHT", "getLIGHT", "GetType", "Landroid/graphics/Typeface;", "type", "getFontBuilder", "Landroid/text/SpannableStringBuilder;", TypedValues.Custom.S_STRING, "", LogEventArguments.ARG_SIZE, "", "color", "context", "Landroid/content/Context;", "base-guide_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class FontBuilderUtil {
    public static final FontBuilderUtil INSTANCE = new FontBuilderUtil();

    public final int getBLACK() {
        return 1;
    }

    public final int getBOLD() {
        return 2;
    }

    public final int getHEAVY() {
        return 3;
    }

    public final int getLIGHT() {
        return 4;
    }

    public final int getMEDIUM() {
        return 5;
    }

    public final int getREGULAR() {
        return 6;
    }

    public final int getSEMIBOLD() {
        return 7;
    }

    private FontBuilderUtil() {
    }

    public final SpannableStringBuilder getFontBuilder(String string, int type, float size, int color, Context context) {
        Intrinsics.checkNotNullParameter(string, "string");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        Typeface GetType = GetType(type);
        if (GetType != null) {
            spannableStringBuilder.setSpan(GetType, 0, string.length(), 33);
        }
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(DensityUtil.dip2px(context, size)), 0, string.length(), 33);
        Intrinsics.checkNotNull(context);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(color)), 0, string.length(), 33);
        return spannableStringBuilder;
    }

    public final Typeface GetType(int type) {
        if (type == 1) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/black.otf");
        }
        if (type == 2) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/bold.otf");
        }
        if (type == 3) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/heavy.otf");
        }
        if (type == 4) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/light.otf");
        }
        if (type == 5) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/medium.otf");
        }
        if (type == 6) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/regular.otf");
        }
        if (type == 7) {
            return Typeface.createFromAsset(ResUtils.getAssets(), "font/semibold.otf");
        }
        return null;
    }
}
