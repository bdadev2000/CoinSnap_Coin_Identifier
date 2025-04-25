package com.glority.android.cmsui.entity;

import android.content.Context;
import android.widget.TextView;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.model.CmsLayout;
import com.glority.android.cmsui.model.CmsTag;
import com.glority.android.cmsui.model.CmsTagString;
import com.glority.android.cmsui.util.CmsTagValueUtil;
import com.glority.android.cmsui.util.FontUtil;
import com.glority.android.xx.constants.Args;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TitleItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/glority/android/cmsui/entity/TitleItem;", "Lcom/glority/android/cmsui/entity/BaseFontScaleItem;", Args.title, "", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;)V", "getPageName", "()Ljava/lang/String;", "getTitle", "getLayoutId", "", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "Companion", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final class TitleItem extends BaseFontScaleItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String pageName;
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleItem(String str, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.title = str;
        this.pageName = pageName;
    }

    public /* synthetic */ TitleItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getTitle() {
        return this.title;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.cms_item_title;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        int i = R.id.tv_title;
        String str = this.title;
        if (str == null) {
            str = "";
        }
        helper.setText(i, str);
        final TextView textView = (TextView) helper.getView(R.id.tv_title);
        observeFontScale(context, new Function1<Float, Unit>() { // from class: com.glority.android.cmsui.entity.TitleItem$render$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                invoke(f.floatValue());
                return Unit.INSTANCE;
            }

            public final void invoke(float f) {
                TitleItem.this.setTextScaleSize(textView, FontUtil.INSTANCE.getFont44());
            }
        });
    }

    /* compiled from: TitleItem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/glority/android/cmsui/entity/TitleItem$Companion;", "", "()V", "create", "Lcom/glority/android/cmsui/entity/TitleItem;", "cmsLayout", "Lcom/glority/android/cmsui/model/CmsLayout;", "cmsTags", "", "Lcom/glority/android/cmsui/model/CmsTag;", Args.pageName, "", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TitleItem create$default(Companion companion, CmsLayout cmsLayout, List list, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                str = "";
            }
            return companion.create(cmsLayout, list, str);
        }

        public final TitleItem create(CmsLayout cmsLayout, List<CmsTag> cmsTags, String pageName) {
            String str;
            Object obj;
            List<Map<String, Object>> tagValues;
            Map<String, ? extends Object> map;
            Intrinsics.checkNotNullParameter(cmsLayout, "cmsLayout");
            Intrinsics.checkNotNullParameter(cmsTags, "cmsTags");
            Intrinsics.checkNotNullParameter(pageName, "pageName");
            List<String> tagNames = cmsLayout.getTagNames();
            if (tagNames != null && (str = (String) CollectionsKt.firstOrNull((List) tagNames)) != null) {
                Iterator<T> it = cmsTags.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual(((CmsTag) obj).getTagName(), str)) {
                        break;
                    }
                }
                CmsTag cmsTag = (CmsTag) obj;
                if (cmsTag != null && (tagValues = cmsTag.getTagValues()) != null && (map = (Map) CollectionsKt.firstOrNull((List) tagValues)) != null && CmsTagValueUtil.INSTANCE.isCmsTagString(map)) {
                    CmsTagString convert2CmsTagString = CmsTagValueUtil.INSTANCE.convert2CmsTagString(map);
                    return new TitleItem(convert2CmsTagString != null ? convert2CmsTagString.getValue() : null, pageName);
                }
            }
            return null;
        }
    }
}
