package com.glority.android.uimaker.parameter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.ViewCompat;
import com.glority.android.uimaker.parameter.attribute.ColorParameter;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceConverter.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001)B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u001bJ\u0016\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0003J\u0016\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0003J\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0003J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020\u0018J\u0016\u0010&\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006*"}, d2 = {"Lcom/glority/android/uimaker/parameter/ResourceConverter;", "", "standardWith", "", "standardHeight", "context", "Landroid/content/Context;", "(IILandroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "fontRate", "", "getFontRate", "()F", "specialDimens", "", "getStandardHeight", "()I", "getStandardWith", "colorConvert", "colorParameter", "Lcom/glority/android/uimaker/parameter/attribute/ColorParameter;", "getDrawableRes", "id", "", "getFontSize", "textViewParameter", "Lcom/glority/android/uimaker/parameter/baseview/TextViewParameter;", TtmlNode.ATTR_TTS_FONT_SIZE, "getHeightDimension", "getNormalDimension", "getResourceIdByName", "name", "type", "Lcom/glority/android/uimaker/parameter/ResourceConverter$ResourceType;", "getText", "textResId", "text", "getWidthDimension", "px2dp", "pxValue", "ResourceType", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class ResourceConverter {
    private final Context context;
    private final float fontRate;
    private final List<Integer> specialDimens;
    private final int standardHeight;
    private final int standardWith;

    /* compiled from: ResourceConverter.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/glority/android/uimaker/parameter/ResourceConverter$ResourceType;", "", "(Ljava/lang/String;I)V", "drawable", TypedValues.Custom.S_DIMENSION, TypedValues.Custom.S_STRING, "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public enum ResourceType {
        drawable,
        dimension,
        string
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResourceType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ResourceType.drawable.ordinal()] = 1;
            iArr[ResourceType.dimension.ordinal()] = 2;
            iArr[ResourceType.string.ordinal()] = 3;
        }
    }

    public ResourceConverter(int i, int i2, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.standardWith = i;
        this.standardHeight = i2;
        this.context = context;
        this.fontRate = 1.045f;
        this.specialDimens = CollectionsKt.listOf((Object[]) new Integer[]{0, -1, -2});
    }

    public final Context getContext() {
        return this.context;
    }

    public final int getStandardHeight() {
        return this.standardHeight;
    }

    public final int getStandardWith() {
        return this.standardWith;
    }

    public final float getFontRate() {
        return this.fontRate;
    }

    public final int colorConvert(ColorParameter colorParameter) {
        if (colorParameter == null) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        float f = 255;
        return Color.argb((int) (colorParameter.getA() * f), (int) (colorParameter.getR() * f), (int) (colorParameter.getG() * f), (int) (colorParameter.getB() * f));
    }

    public final int getDrawableRes(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return getResourceIdByName(id, ResourceType.drawable);
    }

    public final int getHeightDimension(Context context, int id) {
        int px2dp;
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.specialDimens.contains(Integer.valueOf(id))) {
            return 0;
        }
        int i = id < 0 ? -1 : 1;
        try {
            px2dp = (int) context.getResources().getDimension(getResourceIdByName("x" + Math.abs(id * 2), ResourceType.dimension));
        } catch (Throwable unused) {
            px2dp = px2dp(Math.abs(id));
        }
        return px2dp * i;
    }

    public final int getWidthDimension(Context context, int id) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.specialDimens.contains(Integer.valueOf(id))) {
            return id;
        }
        Intrinsics.checkNotNullExpressionValue(context.getResources(), "context.resources");
        return (int) (id * (r3.getDisplayMetrics().widthPixels / this.standardWith));
    }

    public final int getNormalDimension(Context context, int id) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.specialDimens.contains(Integer.valueOf(id))) {
            return id;
        }
        int i = id < 0 ? -1 : 1;
        try {
            return ((int) context.getResources().getDimension(getResourceIdByName("x" + Math.abs(id * 2), ResourceType.dimension))) * i;
        } catch (Throwable unused) {
            return px2dp(Math.abs(id)) * i;
        }
    }

    public final float getFontSize(Context context, TextViewParameter textViewParameter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textViewParameter, "textViewParameter");
        return context.getResources().getDimension(getResourceIdByName("x" + (textViewParameter.getFontSize() * 2), ResourceType.dimension));
    }

    public final float getFontSize(Context context, int fontSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDimension(getResourceIdByName("x" + (fontSize * 2), ResourceType.dimension));
    }

    private final int getResourceIdByName(String name, ResourceType type) {
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            return this.context.getResources().getIdentifier(name, "drawable", this.context.getPackageName());
        }
        if (i == 2) {
            return this.context.getResources().getIdentifier(name, "dimen", this.context.getPackageName());
        }
        if (i == 3) {
            return this.context.getResources().getIdentifier(name, TypedValues.Custom.S_STRING, this.context.getPackageName());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getText(String textResId, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (textResId == null) {
            return text;
        }
        try {
            String string = this.context.getResources().getString(getResourceIdByName(textResId, ResourceType.string));
            Intrinsics.checkNotNullExpressionValue(string, "context.resources.getStr…      )\n                )");
            return string;
        } catch (Throwable unused) {
            return text;
        }
    }

    public final int px2dp(float pxValue) {
        Resources resources = this.context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return (int) ((pxValue / resources.getDisplayMetrics().density) + 0.5f);
    }
}
