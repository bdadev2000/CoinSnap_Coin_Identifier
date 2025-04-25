package com.glority.widget;

import kotlin.Metadata;

/* compiled from: GlWidgetConfig.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/glority/widget/GlWidgetConfig;", "", "()V", "errorImageHolder", "", "getErrorImageHolder", "()I", "setErrorImageHolder", "(I)V", "imageLoadingHolder", "getImageLoadingHolder", "setImageLoadingHolder", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlWidgetConfig {
    public static final GlWidgetConfig INSTANCE = new GlWidgetConfig();
    private static int errorImageHolder;
    private static int imageLoadingHolder;

    private GlWidgetConfig() {
    }

    public final int getImageLoadingHolder() {
        return imageLoadingHolder;
    }

    public final void setImageLoadingHolder(int i) {
        imageLoadingHolder = i;
    }

    public final int getErrorImageHolder() {
        return errorImageHolder;
    }

    public final void setErrorImageHolder(int i) {
        errorImageHolder = i;
    }
}
