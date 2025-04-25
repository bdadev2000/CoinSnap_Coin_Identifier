package com.glority.base.recognize;

import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ICmsDetail.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/glority/base/recognize/ICmsDetail;", "", "getDetail", "", "itemIds", "", "", "cmsUid", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/glority/base/recognize/CmsDetailListener;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface ICmsDetail {
    void getDetail(List<Long> itemIds, String cmsUid, LifecycleOwner lifecycleOwner, CmsDetailListener listener);
}
