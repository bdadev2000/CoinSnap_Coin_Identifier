package com.glority.widget.imagepager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.glority.android.ui.base.BaseActivity;
import com.glority.widget.R;
import com.glority.widget.imagepager.GlImagePager;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlNormalImagePagerActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/glority/widget/imagepager/GlNormalImagePagerActivity;", "Lcom/glority/android/ui/base/BaseActivity;", "()V", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getLogPageName", "", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlNormalImagePagerActivity extends BaseActivity {
    private static final String IMAGE_STYLE = "IMAGE_STYLE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String IMAGELIST = "IMAGELIST";
    private static final String IMAGEITEM = "IMAGEITEM";
    private static final String INDEX = "INDEX";

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        GlImagePager.IndexLocation default_index_location;
        GlImagePager glImagePager = (GlImagePager) findViewById(R.id.image_pager);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(IMAGELIST);
        String stringExtra = getIntent().getStringExtra(IMAGEITEM);
        int intExtra = getIntent().getIntExtra(INDEX, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra(IMAGE_STYLE);
        List<GlImageItem> list = null;
        if (!(serializableExtra instanceof GlImageStyle)) {
            serializableExtra = null;
        }
        GlImageStyle glImageStyle = (GlImageStyle) serializableExtra;
        if (stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(stringArrayExtra.length);
            for (String str : stringArrayExtra) {
                arrayList.add(new GlImageItem(str, null, null, null, false, 30, null));
            }
            list = CollectionsKt.toMutableList((Collection) arrayList);
        }
        if (stringExtra != null) {
            list = (List) new Gson().fromJson(stringExtra, new TypeToken<List<? extends GlImageItem>>() { // from class: com.glority.widget.imagepager.GlNormalImagePagerActivity$doCreateView$2
            }.getType());
        }
        GlImagePager.GlImagePagerBuilder descLineThreshold = glImagePager.builder().setData(list).setDescLineThreshold(glImageStyle != null ? glImageStyle.getDescLineThreshold() : 4);
        if (glImageStyle == null || (default_index_location = glImageStyle.getIndexLocation()) == null) {
            default_index_location = GlImageStyle.INSTANCE.getDEFAULT_INDEX_LOCATION();
        }
        descLineThreshold.indexLocation(default_index_location).setCurrentIndex(intExtra).setOnSingleTapListener(new GlImagePager.OnSingleTapListener() { // from class: com.glority.widget.imagepager.GlNormalImagePagerActivity$doCreateView$3
            @Override // com.glority.widget.imagepager.GlImagePager.OnSingleTapListener
            public void tap(GlImageItem glImageItem) {
                Intrinsics.checkNotNullParameter(glImageItem, "glImageItem");
                GlNormalImagePagerActivity.this.finish();
            }
        }).build();
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_gl_image_pager;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "gl_normal_image_pager_activity";
    }

    /* compiled from: GlNormalImagePagerActivity.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J0\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/glority/widget/imagepager/GlNormalImagePagerActivity$Companion;", "", "()V", "IMAGEITEM", "", "IMAGELIST", GlNormalImagePagerActivity.IMAGE_STYLE, "INDEX", "open", "", "context", "Landroid/content/Context;", "imageList", "", "curIndex", "", "(Landroid/content/Context;[Ljava/lang/String;I)V", "", "Lcom/glority/widget/imagepager/GlImageItem;", "glImageStyle", "Lcom/glority/widget/imagepager/GlImageStyle;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final class Companion {
        public final void open(Context context, List<GlImageItem> list, int i) {
            open$default(this, context, list, i, null, 8, null);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void open(Context context, String[] imageList, int curIndex) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageList, "imageList");
            Intent intent = new Intent(context, (Class<?>) GlNormalImagePagerActivity.class);
            intent.putExtra(GlNormalImagePagerActivity.IMAGELIST, imageList);
            intent.putExtra(GlNormalImagePagerActivity.INDEX, curIndex);
            context.startActivity(intent);
        }

        public static /* synthetic */ void open$default(Companion companion, Context context, List list, int i, GlImageStyle glImageStyle, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                glImageStyle = new GlImageStyle(false, null, 0, 7, null);
            }
            companion.open(context, list, i, glImageStyle);
        }

        public final void open(Context context, List<GlImageItem> imageList, int curIndex, GlImageStyle glImageStyle) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageList, "imageList");
            Intrinsics.checkNotNullParameter(glImageStyle, "glImageStyle");
            Intent intent = new Intent(context, (Class<?>) GlNormalImagePagerActivity.class);
            intent.putExtra(GlNormalImagePagerActivity.IMAGEITEM, new Gson().toJson(imageList));
            intent.putExtra(GlNormalImagePagerActivity.INDEX, curIndex);
            intent.putExtra(GlNormalImagePagerActivity.IMAGE_STYLE, glImageStyle);
            context.startActivity(intent);
        }
    }
}
