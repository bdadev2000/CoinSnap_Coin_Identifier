package com.glority.android.cmsui.entity.namecard;

import android.content.Context;
import android.view.View;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.cms.base.BaseItem;
import com.glority.android.cms.base.ExtraData;
import com.glority.android.cms.listener.ClickListener;
import com.glority.android.cmsui.R;
import com.glority.android.xx.constants.Args;
import com.glority.component.generatedAPI.kotlinAPI.cms.CmsName;
import com.glority.utils.app.ResUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseNameCardItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000bJ \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H&J\b\u0010(\u001a\u00020)H&J \u0010*\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R$\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000f¨\u0006+"}, d2 = {"Lcom/glority/android/cmsui/entity/namecard/BaseNameCardItem;", "Lcom/glority/android/cms/base/BaseItem;", "cmsObject", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "isInfoCard", "", "customName", "", "customNotes", "editEnable", Args.pageName, "(Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCmsObject", "()Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsName;", "getCustomName", "()Ljava/lang/String;", "setCustomName", "(Ljava/lang/String;)V", "getCustomNotes", "setCustomNotes", "editClick", "Lcom/glority/android/cms/listener/ClickListener;", "", "getEditClick", "()Lcom/glority/android/cms/listener/ClickListener;", "setEditClick", "(Lcom/glority/android/cms/listener/ClickListener;)V", "getEditEnable", "()Z", "setEditEnable", "(Z)V", "getPageName", "doRender", "", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "getRootViewId", "", "render", "cmsUI_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public abstract class BaseNameCardItem extends BaseItem {
    private final CmsName cmsObject;
    private String customName;
    private String customNotes;
    private ClickListener<Object> editClick;
    private boolean editEnable;
    private final boolean isInfoCard;
    private final String pageName;

    public abstract void doRender(Context context, BaseViewHolder helper, ExtraData data);

    public abstract int getRootViewId();

    public final CmsName getCmsObject() {
        return this.cmsObject;
    }

    /* renamed from: isInfoCard, reason: from getter */
    public final boolean getIsInfoCard() {
        return this.isInfoCard;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ BaseNameCardItem(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName r10, boolean r11, java.lang.String r12, java.lang.String r13, boolean r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 4
            r1 = 0
            if (r0 == 0) goto La
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r5 = r1
            goto Lb
        La:
            r5 = r12
        Lb:
            r0 = r16 & 8
            if (r0 == 0) goto L14
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r6 = r1
            goto L15
        L14:
            r6 = r13
        L15:
            r0 = r16 & 16
            if (r0 == 0) goto L1c
            r0 = 1
            r7 = r0
            goto L1d
        L1c:
            r7 = r14
        L1d:
            r0 = r16 & 32
            if (r0 == 0) goto L26
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            r8 = r1
            goto L27
        L26:
            r8 = r15
        L27:
            r2 = r9
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.cmsui.entity.namecard.BaseNameCardItem.<init>(com.glority.component.generatedAPI.kotlinAPI.cms.CmsName, boolean, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCustomName() {
        return this.customName;
    }

    public final void setCustomName(String str) {
        this.customName = str;
    }

    public final String getCustomNotes() {
        return this.customNotes;
    }

    public final void setCustomNotes(String str) {
        this.customNotes = str;
    }

    public final boolean getEditEnable() {
        return this.editEnable;
    }

    public final void setEditEnable(boolean z) {
        this.editEnable = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseNameCardItem(CmsName cmsObject, boolean z, String str, String str2, boolean z2, String str3) {
        super(str3);
        Intrinsics.checkNotNullParameter(cmsObject, "cmsObject");
        this.cmsObject = cmsObject;
        this.isInfoCard = z;
        this.customName = str;
        this.customNotes = str2;
        this.editEnable = z2;
        this.pageName = str3;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final ClickListener<Object> getEditClick() {
        return this.editClick;
    }

    public final void setEditClick(ClickListener<Object> clickListener) {
        this.editClick = clickListener;
    }

    @Override // com.glority.android.cms.base.BaseItem
    public void render(Context context, BaseViewHolder helper, ExtraData data) {
        View view;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(data, "data");
        if (!this.isInfoCard && (view = helper.getView(getRootViewId())) != null) {
            view.setPaddingRelative(0, (int) ResUtils.getDimension(R.dimen.x32), 0, 0);
        }
        doRender(context, helper, data);
    }
}
