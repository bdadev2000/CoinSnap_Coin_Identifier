package com.bytedance.sdk.openadsdk.lMd.zp;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class COT implements com.bytedance.sdk.openadsdk.multipro.zp {
    private final com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd zp;

    public COT(com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd) {
        this.zp = lmd;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public String zp() {
        com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.KS();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public String zp(Uri uri) {
        com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.zp(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Cursor zp(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.zp(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public Uri zp(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.zp(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.zp(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.zp
    public int zp(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.HWF.zp.lMd.lMd.lMd lmd = this.zp;
        if (lmd != null) {
            return lmd.zp(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
