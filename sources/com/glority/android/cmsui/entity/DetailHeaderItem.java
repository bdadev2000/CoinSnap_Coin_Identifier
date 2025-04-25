package com.glority.android.cmsui.entity;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.cmsui.common.CmsUILogEvents;
import com.glority.android.cmsui.routers.GetDefaultImageDrawableRequest;
import com.glority.android.core.app.AppContext;
import com.glority.android.xx.constants.Args;
import com.glority.utils.app.ResUtils;
import com.glority.utils.stability.LogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailHeaderItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\b\u0010!\u001a\u00020\"H\u0016J\t\u0010#\u001a\u00020\"HÖ\u0001J \u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0016J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013¨\u0006-"}, d2 = {"Lcom/glority/android/cmsui/entity/DetailHeaderItem;", "Lcom/glority/android/cms/base/BaseItem;", "picUrl", "", "uploadDesc", "isConfusion", "", "rawImg", "Landroid/net/Uri;", Args.pageName, "(Ljava/lang/String;Ljava/lang/String;ZLandroid/net/Uri;Ljava/lang/String;)V", "imageClick", "Lcom/glority/android/cms/listener/ClickListener;", "getImageClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setImageClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "()Z", "getPageName", "()Ljava/lang/String;", "getPicUrl", "getRawImg", "()Landroid/net/Uri;", "getUploadDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getLayoutId", "", "hashCode", "render", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "toString", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public final /* data */ class DetailHeaderItem extends BaseItem {
    private ClickListener<String> imageClick;
    private final boolean isConfusion;
    private final String pageName;
    private final String picUrl;
    private final Uri rawImg;
    private final String uploadDesc;

    public static /* synthetic */ DetailHeaderItem copy$default(DetailHeaderItem detailHeaderItem, String str, String str2, boolean z, Uri uri, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = detailHeaderItem.picUrl;
        }
        if ((i & 2) != 0) {
            str2 = detailHeaderItem.uploadDesc;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = detailHeaderItem.isConfusion;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            uri = detailHeaderItem.rawImg;
        }
        Uri uri2 = uri;
        if ((i & 16) != 0) {
            str3 = detailHeaderItem.pageName;
        }
        return detailHeaderItem.copy(str, str4, z2, uri2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPicUrl() {
        return this.picUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUploadDesc() {
        return this.uploadDesc;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConfusion() {
        return this.isConfusion;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getRawImg() {
        return this.rawImg;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPageName() {
        return this.pageName;
    }

    public final DetailHeaderItem copy(String picUrl, String uploadDesc, boolean isConfusion, Uri rawImg, String pageName) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        return new DetailHeaderItem(picUrl, uploadDesc, isConfusion, rawImg, pageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailHeaderItem)) {
            return false;
        }
        DetailHeaderItem detailHeaderItem = (DetailHeaderItem) other;
        return Intrinsics.areEqual(this.picUrl, detailHeaderItem.picUrl) && Intrinsics.areEqual(this.uploadDesc, detailHeaderItem.uploadDesc) && this.isConfusion == detailHeaderItem.isConfusion && Intrinsics.areEqual(this.rawImg, detailHeaderItem.rawImg) && Intrinsics.areEqual(this.pageName, detailHeaderItem.pageName);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.picUrl;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uploadDesc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isConfusion;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        Uri uri = this.rawImg;
        int hashCode3 = (i2 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str3 = this.pageName;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "DetailHeaderItem(picUrl=" + this.picUrl + ", uploadDesc=" + this.uploadDesc + ", isConfusion=" + this.isConfusion + ", rawImg=" + this.rawImg + ", pageName=" + this.pageName + ")";
    }

    public final String getPicUrl() {
        return this.picUrl;
    }

    public final String getUploadDesc() {
        return this.uploadDesc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailHeaderItem(String str, String str2, boolean z, Uri uri, String pageName) {
        super(pageName);
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.picUrl = str;
        this.uploadDesc = str2;
        this.isConfusion = z;
        this.rawImg = uri;
        this.pageName = pageName;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DetailHeaderItem(java.lang.String r7, java.lang.String r8, boolean r9, android.net.Uri r10, java.lang.String r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L5
            r9 = 0
        L5:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = 0
            r9 = r10
            android.net.Uri r9 = (android.net.Uri) r9
        Le:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L15
            java.lang.String r11 = "detail"
        L15:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.DetailHeaderItem.<init>(java.lang.String, java.lang.String, boolean, android.net.Uri, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final Uri getRawImg() {
        return this.rawImg;
    }

    public final boolean isConfusion() {
        return this.isConfusion;
    }

    public final ClickListener<String> getImageClick() {
        return this.imageClick;
    }

    public final void setImageClick(ClickListener<String> clickListener) {
        this.imageClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public int getLayoutId() {
        return R.layout.item_detail_header;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        ImageView imageView = (ImageView) helper.getView(R.id.detail_header_iv);
        if (this.isConfusion) {
            helper.setGone(R.id.iv_detail_raw, true);
            ImageView imageView2 = (ImageView) helper.getView(R.id.iv_detail_raw);
            RequestBuilder transform = Glide.with(imageView2).load(this.rawImg).transform(new CenterCrop(), new RoundedCorners((int) ResUtils.getDimension(R.dimen.x8)));
            try {
                i2 = new GetDefaultImageDrawableRequest().toResult().intValue();
            } catch (Exception e) {
                if (AppContext.INSTANCE.isDebugMode()) {
                    LogUtils.e(Log.getStackTraceString(e));
                }
                i2 = R.drawable.common_background_banner;
            }
            transform.placeholder(i2).into(imageView2);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.DetailHeaderItem$render$3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClickListener<String> imageClick;
                    BaseItem.logEvent$default(DetailHeaderItem.this, CmsUILogEvents.BASE_DETAIL_RAW_IMAGE_LB, null, 2, null);
                    String picUrl = DetailHeaderItem.this.getPicUrl();
                    if (picUrl == null || (imageClick = DetailHeaderItem.this.getImageClick()) == null) {
                        return;
                    }
                    Intrinsics.checkNotNullExpressionValue(view, "view");
                    imageClick.onClick(view, picUrl);
                }
            });
        }
        RequestBuilder centerCrop = Glide.with(imageView).load(this.picUrl).centerCrop();
        try {
            i = new GetDefaultImageDrawableRequest().toResult().intValue();
        } catch (Exception e2) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e2));
            }
            i = R.drawable.common_background_banner;
        }
        centerCrop.placeholder(i).into(imageView);
        BaseViewHolder text = helper.setText(R.id.tv_date, this.uploadDesc);
        int i3 = R.id.tv_date;
        String str = this.uploadDesc;
        BaseViewHolder gone = text.setGone(i3, (str == null || str.length() <= 0 || this.isConfusion) ? false : true);
        int i4 = R.id.v_bottom_shadow;
        String str2 = this.uploadDesc;
        gone.setGone(i4, (str2 == null || str2.length() <= 0 || this.isConfusion) ? false : true);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.cmsui.entity.DetailHeaderItem$render$6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClickListener<String> imageClick;
                BaseItem.logEvent$default(DetailHeaderItem.this, "raw_image", null, 2, null);
                String picUrl = DetailHeaderItem.this.getPicUrl();
                if (picUrl == null || (imageClick = DetailHeaderItem.this.getImageClick()) == null) {
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(view, "view");
                imageClick.onClick(view, picUrl);
            }
        });
    }
}
