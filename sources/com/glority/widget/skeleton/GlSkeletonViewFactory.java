package com.glority.widget.skeleton;

import android.view.View;
import com.glority.android.xx.constants.LogEvents;
import com.glority.widget.R;
import com.glority.widget.skeleton.ViewSkeletonScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlSkeletonViewFactory.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/glority/widget/skeleton/GlSkeletonViewFactory;", "", "()V", LogEvents.exportemptyalert_close_click_type_get, "Lcom/glority/widget/skeleton/ViewSkeletonScreen;", "view", "Landroid/view/View;", "type", "Lcom/glority/widget/skeleton/GlSkeletonViewFactory$Type;", "Type", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlSkeletonViewFactory {
    public static final GlSkeletonViewFactory INSTANCE = new GlSkeletonViewFactory();

    /* compiled from: GlSkeletonViewFactory.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/widget/skeleton/GlSkeletonViewFactory$Type;", "", "(Ljava/lang/String;I)V", "HOME", "IMAGE_TEXT_SMALL", "IMAGE_TEXT_BIG", "ARTICLE", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public enum Type {
        HOME,
        IMAGE_TEXT_SMALL,
        IMAGE_TEXT_BIG,
        ARTICLE
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Type.HOME.ordinal()] = 1;
            iArr[Type.IMAGE_TEXT_SMALL.ordinal()] = 2;
            iArr[Type.IMAGE_TEXT_BIG.ordinal()] = 3;
            iArr[Type.ARTICLE.ordinal()] = 4;
        }
    }

    private GlSkeletonViewFactory() {
    }

    public final ViewSkeletonScreen get(View view, Type type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(type, "type");
        ViewSkeletonScreen.Builder bind = Skeleton.bind(view);
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            bind.load(R.layout.gl_skeleton_home).color(R.color.gl_dark_transparent);
        } else if (i == 2) {
            bind.load(R.layout.gl_skeleton_text_image_small).color(R.color.gl_dark_transparent);
        } else if (i == 3) {
            bind.load(R.layout.gl_skeleton_text_image_big).color(R.color.gl_dark_transparent);
        } else if (i == 4) {
            bind.load(R.layout.gl_skeleton_article).color(R.color.gl_dark_transparent);
        }
        ViewSkeletonScreen show = bind.show();
        Intrinsics.checkNotNullExpressionValue(show, "skeletonScreen.show()");
        return show;
    }
}
