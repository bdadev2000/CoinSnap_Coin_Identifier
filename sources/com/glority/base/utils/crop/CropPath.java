package com.glority.base.utils.crop;

import android.graphics.Path;
import android.graphics.Rect;
import kotlin.Metadata;

/* compiled from: CropPath.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/glority/base/utils/crop/CropPath;", "", "limit", "Landroid/graphics/Rect;", "path", "Landroid/graphics/Path;", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface CropPath {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SHAPE_CIRCLE = 1;
    public static final int SHAPE_RECT = 0;

    Rect limit();

    Path path();

    /* compiled from: CropPath.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/glority/base/utils/crop/CropPath$Companion;", "", "<init>", "()V", "SHAPE_RECT", "", "SHAPE_CIRCLE", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SHAPE_CIRCLE = 1;
        public static final int SHAPE_RECT = 0;

        private Companion() {
        }
    }
}
