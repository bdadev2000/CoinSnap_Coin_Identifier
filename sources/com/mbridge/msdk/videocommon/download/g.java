package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import bh.z;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.ab;
import com.mbridge.msdk.foundation.tools.ao;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
public final class g {
    private static String a = "ResourceManager";

    /* renamed from: b, reason: collision with root package name */
    private String f16421b;

    /* renamed from: com.mbridge.msdk.videocommon.download.g$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 extends com.mbridge.msdk.foundation.same.e.a {
        final /* synthetic */ g a;

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.e.a
        public final void runTask() {
            ab.a(this.a.f16421b);
        }
    }

    /* loaded from: classes4.dex */
    public static class a {
        public static g a = new g(null);
    }

    public /* synthetic */ g(AnonymousClass1 anonymousClass1) {
        this();
    }

    private g() {
        this.f16421b = com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_RES);
    }

    public static g a() {
        return a.a;
    }

    public final String a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.f16421b + "/" + SameMD5.getMD5(ao.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + "/" + str5 + "/" + str5 + ".html";
            if (!ab.d(str6)) {
                return null;
            }
            try {
                com.mbridge.msdk.c.g b3 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                if (b3 != null && !TextUtils.isEmpty(b3.T())) {
                    com.mbridge.msdk.foundation.same.d.a(str, new File(str6));
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return z.FILE_SCHEME + str6 + str3;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e2.printStackTrace();
            return null;
        }
    }
}
