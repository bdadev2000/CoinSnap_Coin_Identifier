package com.bytedance.sdk.openadsdk.AlY.YFl;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class wN implements com.bytedance.sdk.openadsdk.multipro.YFl {
    private final com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg YFl;

    public wN(com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2) {
        this.YFl = sg2;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public String YFl() {
        com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.tN();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public String YFl(Uri uri) {
        com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.YFl(uri);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Cursor YFl(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.YFl(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public Uri YFl(Uri uri, ContentValues contentValues) {
        com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.YFl(uri, contentValues);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(Uri uri, String str, String[] strArr) {
        com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.YFl(uri, str, strArr);
        }
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.multipro.YFl
    public int YFl(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        com.bytedance.sdk.component.vc.YFl.Sg.Sg.Sg sg2 = this.YFl;
        if (sg2 != null) {
            return sg2.YFl(uri, contentValues, str, strArr);
        }
        return 0;
    }
}
