package com.glority.base.activity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.glority.base.R;
import com.glority.base.databinding.ActivityImageViewerBinding;
import com.glority.widget.imagepager.GlImageItem;
import com.glority.widget.imagepager.GlImagePager;
import com.glority.widget.imagepager.GlImageStyle;
import com.google.android.material.transition.platform.MaterialSharedAxis;
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

/* compiled from: ImageViewerActivity.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¨\u0006\u0011"}, d2 = {"Lcom/glority/base/activity/ImageViewerActivity;", "Lcom/glority/base/activity/XBaseActivity;", "Lcom/glority/base/databinding/ActivityImageViewerBinding;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getLogPageName", "", "initData", "initView", "binding", "Companion", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ImageViewerActivity extends XBaseActivity<ActivityImageViewerBinding> {
    public static final int $stable = 0;
    private static final String IMAGE_STYLE = "IMAGE_STYLE";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String IMAGELIST = "IMAGELIST";
    private static final String IMAGEITEM = "IMAGEITEM";
    private static final String INDEX = "INDEX";

    @Override // com.glority.base.activity.XBaseActivity
    public void initView(ActivityImageViewerBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.base.activity.XBaseActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(13);
        getWindow().setEnterTransition(new MaterialSharedAxis(1, true));
        super.onCreate(savedInstanceState);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_image_viewer;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "imageviewer";
    }

    @Override // com.glority.base.activity.XBaseActivity
    public void initData() {
        GlImagePager.IndexLocation default_index_location;
        GlImagePager glImagePager = (GlImagePager) findViewById(R.id.image_pager);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(IMAGELIST);
        String stringExtra = getIntent().getStringExtra(IMAGEITEM);
        int intExtra = getIntent().getIntExtra(INDEX, 0);
        Serializable serializableExtra = getIntent().getSerializableExtra(IMAGE_STYLE);
        List<GlImageItem> list = null;
        GlImageStyle glImageStyle = serializableExtra instanceof GlImageStyle ? (GlImageStyle) serializableExtra : null;
        if (stringArrayExtra != null) {
            ArrayList arrayList = new ArrayList(stringArrayExtra.length);
            for (String str : stringArrayExtra) {
                arrayList.add(new GlImageItem(str, null, null, null, false, 30, null));
            }
            list = CollectionsKt.toMutableList((Collection) arrayList);
        }
        if (stringExtra != null) {
            list = (List) new Gson().fromJson(stringExtra, new TypeToken<List<? extends GlImageItem>>() { // from class: com.glority.base.activity.ImageViewerActivity$initData$2
            }.getType());
        }
        GlImagePager.GlImagePagerBuilder descLineThreshold = glImagePager.builder().setData(list).setDescLineThreshold(glImageStyle != null ? glImageStyle.getDescLineThreshold() : 4);
        if (glImageStyle == null || (default_index_location = glImageStyle.getIndexLocation()) == null) {
            default_index_location = GlImageStyle.INSTANCE.getDEFAULT_INDEX_LOCATION();
        }
        descLineThreshold.indexLocation(default_index_location).setCurrentIndex(intExtra).setOnSingleTapListener(new GlImagePager.OnSingleTapListener() { // from class: com.glority.base.activity.ImageViewerActivity$initData$3
            @Override // com.glority.widget.imagepager.GlImagePager.OnSingleTapListener
            public void tap(GlImageItem glImageItem) {
                Intrinsics.checkNotNullParameter(glImageItem, "glImageItem");
                ImageViewerActivity.this.finish();
            }
        }).build();
    }

    /* compiled from: ImageViewerActivity.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/base/activity/ImageViewerActivity$Companion;", "", "<init>", "()V", "IMAGELIST", "", "IMAGEITEM", ImageViewerActivity.IMAGE_STYLE, "INDEX", "open", "", "context", "Landroid/app/Activity;", "imageList", "", "curIndex", "", "(Landroid/app/Activity;[Ljava/lang/String;I)V", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void open(Activity context, String[] imageList, int curIndex) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(imageList, "imageList");
            context.getWindow().setExitTransition(new MaterialSharedAxis(1, true));
            Intent intent = new Intent(context, (Class<?>) ImageViewerActivity.class);
            intent.putExtra(ImageViewerActivity.IMAGELIST, imageList);
            intent.putExtra(ImageViewerActivity.INDEX, curIndex);
            ActivityOptions.makeSceneTransitionAnimation(context, new Pair[0]).toBundle();
            context.startActivity(intent);
        }
    }
}
