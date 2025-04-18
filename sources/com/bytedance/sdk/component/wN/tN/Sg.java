package com.bytedance.sdk.component.wN.tN;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.wN.EH;
import com.bytedance.sdk.component.wN.GA;
import com.bytedance.sdk.component.wN.nc;
import com.bytedance.sdk.component.wN.qO;
import com.bytedance.sdk.component.wN.tN.tN;
import com.bytedance.sdk.openadsdk.ats.ATS;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;

@ATS(single = true, value = {"img_service"})
/* loaded from: classes.dex */
public class Sg implements EH {
    private volatile vc YFl;

    private Sg() {
    }

    private void Sg(Context context, GA ga2) {
        if (this.YFl != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (ga2 == null) {
            ga2 = wN.YFl(context);
        }
        this.YFl = new vc(context, ga2);
    }

    public static EH YFl(Context context, GA ga2) {
        Sg sg2 = new Sg();
        sg2.Sg(context, ga2);
        return sg2;
    }

    @Override // com.bytedance.sdk.component.wN.EH
    public nc YFl(String str) {
        return new tN.Sg(this.YFl).tN(str);
    }

    @Override // com.bytedance.sdk.component.wN.EH
    public InputStream YFl(String str, String str2) {
        if (this.YFl != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = com.bytedance.sdk.component.wN.tN.tN.tN.YFl(str);
            }
            Collection<qO> Sg = this.YFl.Sg();
            if (Sg != null) {
                Iterator<qO> it = Sg.iterator();
                while (it.hasNext()) {
                    byte[] YFl = it.next().YFl(str2);
                    if (YFl != null) {
                        return new ByteArrayInputStream(YFl);
                    }
                }
            }
            Collection<com.bytedance.sdk.component.wN.tN> tN = this.YFl.tN();
            if (tN != null) {
                Iterator<com.bytedance.sdk.component.wN.tN> it2 = tN.iterator();
                while (it2.hasNext()) {
                    InputStream YFl2 = it2.next().YFl(str2);
                    if (YFl2 != null) {
                        return YFl2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.wN.EH
    public boolean YFl(String str, String str2, String str3) {
        if (this.YFl == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = com.bytedance.sdk.component.wN.tN.tN.tN.YFl(str);
        }
        com.bytedance.sdk.component.wN.tN YFl = this.YFl.YFl(str3);
        if (YFl != null) {
            return YFl.Sg(str2);
        }
        return false;
    }
}
